package defpackage;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: kuA  reason: default package */
/* loaded from: classes.dex */
public final class kuA {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final d f5470R;

    /* renamed from: R  reason: collision with other field name */
    public final pm2 f5473R;
    public int v;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f5471R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public final HashSet f5472R = new HashSet();

    /* renamed from: R  reason: collision with other field name */
    public boolean f5474R = false;

    /* renamed from: v  reason: collision with other field name */
    public boolean f5475v = false;

    public kuA(int i, int i2, d dVar, a3 a3Var) {
        pm2 pm2 = dVar.f1318R;
        this.R = i;
        this.v = i2;
        this.f5473R = pm2;
        a3Var.R(new Zz(this));
        this.f5470R = dVar;
    }

    public final void R() {
        if (!this.f5474R) {
            this.f5474R = true;
            if (this.f5472R.isEmpty()) {
                v();
                return;
            }
            Iterator it = new ArrayList(this.f5472R).iterator();
            while (it.hasNext()) {
                a3 a3Var = (a3) it.next();
                synchronized (a3Var) {
                    try {
                        if (!a3Var.f724R) {
                            a3Var.f724R = true;
                            a3Var.v = true;
                            IC ic = a3Var.R;
                            if (ic != null) {
                                try {
                                    ic.onCancel();
                                } catch (Throwable th) {
                                    synchronized (a3Var) {
                                        try {
                                            a3Var.v = false;
                                            a3Var.notifyAll();
                                            throw th;
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            }
                            synchronized (a3Var) {
                                try {
                                    a3Var.v = false;
                                    a3Var.notifyAll();
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }
    }

    /* renamed from: X */
    public final String toString() {
        StringBuilder t = jQ.t("Operation ", "{");
        t.append(Integer.toHexString(System.identityHashCode(this)));
        t.append("} ");
        t.append("{");
        t.append("mFinalState = ");
        t.append(opT.o(this.R));
        t.append("} ");
        t.append("{");
        t.append("mLifecycleImpact = ");
        t.append(opT.V(this.v));
        t.append("} ");
        t.append("{");
        t.append("mFragment = ");
        t.append(this.f5473R);
        t.append("}");
        return t.toString();
    }

    public final void c(int i, int i2) {
        if (i2 != 0) {
            int i3 = i2 - 1;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (hAW.W(2)) {
                            StringBuilder U = opT.U("SpecialEffectsController: For fragment ");
                            U.append(this.f5473R);
                            U.append(" mFinalState = ");
                            U.append(opT.o(this.R));
                            U.append(" -> REMOVED. mLifecycleImpact  = ");
                            U.append(opT.V(this.v));
                            U.append(" to REMOVING.");
                            Log.v("FragmentManager", U.toString());
                        }
                        this.R = 1;
                        this.v = 3;
                    }
                } else if (this.R == 1) {
                    if (hAW.W(2)) {
                        StringBuilder U2 = opT.U("SpecialEffectsController: For fragment ");
                        U2.append(this.f5473R);
                        U2.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        U2.append(opT.V(this.v));
                        U2.append(" to ADDING.");
                        Log.v("FragmentManager", U2.toString());
                    }
                    this.R = 2;
                    this.v = 2;
                }
            } else if (this.R != 1) {
                if (hAW.W(2)) {
                    StringBuilder U3 = opT.U("SpecialEffectsController: For fragment ");
                    U3.append(this.f5473R);
                    U3.append(" mFinalState = ");
                    U3.append(opT.o(this.R));
                    U3.append(" -> ");
                    U3.append(opT.o(i));
                    U3.append(". ");
                    Log.v("FragmentManager", U3.toString());
                }
                this.R = i;
            }
        } else {
            throw null;
        }
    }

    public final void e() {
        int i = this.v;
        if (i == 2) {
            pm2 pm2 = this.f5470R.f1318R;
            View findFocus = pm2.f7228R.findFocus();
            if (findFocus != null) {
                pm2.X().f6116R = findFocus;
                if (hAW.W(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + pm2);
                }
            }
            View p = this.f5473R.p();
            if (p.getParent() == null) {
                this.f5470R.v();
                p.setAlpha(0.0f);
            }
            if (p.getAlpha() == 0.0f && p.getVisibility() == 0) {
                p.setVisibility(4);
            }
            mfw mfw = pm2.f7243R;
            p.setAlpha(mfw == null ? 1.0f : mfw.R);
        } else if (i == 3) {
            pm2 pm22 = this.f5470R.f1318R;
            View p2 = pm22.p();
            if (hAW.W(2)) {
                StringBuilder U = opT.U("Clearing focus ");
                U.append(p2.findFocus());
                U.append(" on view ");
                U.append(p2);
                U.append(" for Fragment ");
                U.append(pm22);
                Log.v("FragmentManager", U.toString());
            }
            p2.clearFocus();
        }
    }

    public final void v() {
        if (!this.f5475v) {
            if (hAW.W(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f5475v = true;
            Iterator it = this.f5471R.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f5470R.H();
    }
}
