package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: R  reason: collision with other field name */
    public OnBackInvokedDispatcher f1006R;

    /* renamed from: R  reason: collision with other field name */
    public final Runnable f1007R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayDeque f1008R = new ArrayDeque();

    /* renamed from: R  reason: collision with other field name */
    public boolean f1010R = false;

    /* renamed from: R  reason: collision with other field name */
    public mgE f1009R = new mgE(2, this);
    public OnBackInvokedCallback R = p2l.R(new mBn(2, this));

    public c(Runnable runnable) {
        this.f1007R = runnable;
    }

    public final void R(nu_ nu_, hSO hso) {
        m4i O = nu_.O();
        if (O.f5900R != iMP.DESTROYED) {
            ((jnM) hso).f5016R.add(new Object(O, hso) { // from class: androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
                public final aLd R;

                /* renamed from: R  reason: collision with other field name */
                public d26 f1004R;

                /* renamed from: R  reason: collision with other field name */
                public final jnM f1005R;

                {
                    this.R = r2;
                    this.f1005R = r3;
                    r2.R(this);
                }

                @Override // defpackage.hS
                public final void cancel() {
                    this.R.v(this);
                    this.f1005R.f5016R.remove(this);
                    d26 d26 = this.f1004R;
                    if (d26 != null) {
                        d26.cancel();
                        this.f1004R = null;
                    }
                }

                @Override // defpackage.k3P
                public final void e(nu_ nu_2, alX alx) {
                    if (alx == alX.ON_START) {
                        c cVar = c.this;
                        jnM jnm = this.f1005R;
                        cVar.f1008R.add(jnm);
                        d26 d26 = new d26(cVar, jnm);
                        jnm.f5016R.add(d26);
                        cVar.c();
                        jnm.R = cVar.f1009R;
                        this.f1004R = d26;
                    } else if (alx == alX.ON_STOP) {
                        d26 d262 = this.f1004R;
                        if (d262 != null) {
                            d262.cancel();
                        }
                    } else if (alx == alX.ON_DESTROY) {
                        cancel();
                    }
                }
            });
            c();
            ((jnM) hso).R = this.f1009R;
        }
    }

    public final void c() {
        boolean z;
        Iterator descendingIterator = this.f1008R.descendingIterator();
        while (true) {
            if (descendingIterator.hasNext()) {
                if (((jnM) descendingIterator.next()).f5017R) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1006R;
        if (onBackInvokedDispatcher == null) {
            return;
        }
        if (z && !this.f1010R) {
            p2l.v(onBackInvokedDispatcher, 0, this.R);
            this.f1010R = true;
        } else if (!z && this.f1010R) {
            p2l.c(onBackInvokedDispatcher, this.R);
            this.f1010R = false;
        }
    }

    public final void v() {
        Iterator descendingIterator = this.f1008R.descendingIterator();
        while (descendingIterator.hasNext()) {
            jnM jnm = (jnM) descendingIterator.next();
            if (jnm.f5017R) {
                hSO hso = (hSO) jnm;
                switch (hso.R) {
                    case 0:
                        ((kg9) hso.f4266R).x(hso);
                        return;
                    case 1:
                        hAW haw = (hAW) hso.f4266R;
                        haw.J(true);
                        if (((jnM) haw.f4115R).f5017R) {
                            haw.M();
                            return;
                        } else {
                            haw.f4112R.v();
                            return;
                        }
                    default:
                        ((mpr) hso.f4266R).N();
                        return;
                }
            }
        }
        Runnable runnable = this.f1007R;
        if (runnable != null) {
            runnable.run();
        }
    }
}
