package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import dev.kdrag0n.virtcontainer.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: R  reason: collision with other field name */
    public final alu f1316R;

    /* renamed from: R  reason: collision with other field name */
    public final piu f1317R;

    /* renamed from: R  reason: collision with other field name */
    public final pm2 f1318R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1319R = false;
    public int R = -1;

    public d(alu alu, piu piu, pm2 pm2) {
        this.f1316R = alu;
        this.f1317R = piu;
        this.f1318R = pm2;
    }

    public final void C(ClassLoader classLoader) {
        Bundle bundle = this.f1318R.f7226R;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            pm2 pm2 = this.f1318R;
            pm2.f7227R = pm2.f7226R.getSparseParcelableArray("android:view_state");
            pm2 pm22 = this.f1318R;
            pm22.v = pm22.f7226R.getBundle("android:view_registry_state");
            pm2 pm23 = this.f1318R;
            pm23.f7253v = pm23.f7226R.getString("android:target_state");
            pm2 pm24 = this.f1318R;
            if (pm24.f7253v != null) {
                pm24.X = pm24.f7226R.getInt("android:target_req_state", 0);
            }
            pm2 pm25 = this.f1318R;
            pm25.getClass();
            pm25.N = pm25.f7226R.getBoolean("android:user_visible_hint", true);
            pm2 pm26 = this.f1318R;
            if (!pm26.N) {
                pm26.C = true;
            }
        }
    }

    public final void H() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f1319R) {
            try {
                this.f1319R = true;
                boolean z = false;
                while (true) {
                    int e = e();
                    pm2 pm2 = this.f1318R;
                    int i = pm2.e;
                    if (e != i) {
                        if (e > i) {
                            switch (i + 1) {
                                case 0:
                                    c();
                                    continue;
                                case 1:
                                    X();
                                    continue;
                                case 2:
                                    x();
                                    O();
                                    continue;
                                case 3:
                                    R();
                                    continue;
                                case 4:
                                    if (!(pm2.f7228R == null || (viewGroup3 = pm2.f7229R) == null)) {
                                        owe O = owe.O(viewGroup3, pm2.C().S());
                                        int v = opT.v(this.f1318R.f7228R.getVisibility());
                                        O.getClass();
                                        if (hAW.W(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + this.f1318R);
                                        }
                                        O.R(v, 2, this);
                                    }
                                    this.f1318R.e = 4;
                                    continue;
                                case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                                    g();
                                    continue;
                                case 6:
                                    pm2.e = 6;
                                    continue;
                                case 7:
                                    N();
                                    continue;
                                default:
                                    continue;
                            }
                        } else {
                            switch (i - 1) {
                                case -1:
                                    m();
                                    continue;
                                case 0:
                                    if (pm2.f7249c) {
                                        if (((bzM) ((HashMap) this.f1317R.c).get(pm2.f7238R)) == null) {
                                            P();
                                        }
                                    }
                                    L();
                                    continue;
                                case 1:
                                    Z();
                                    this.f1318R.e = 1;
                                    continue;
                                case 2:
                                    pm2.f7246X = false;
                                    pm2.e = 2;
                                    continue;
                                case 3:
                                    if (hAW.W(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f1318R);
                                    }
                                    pm2 pm22 = this.f1318R;
                                    if (pm22.f7249c) {
                                        P();
                                    } else if (pm22.f7228R != null && pm22.f7227R == null) {
                                        j();
                                    }
                                    pm2 pm23 = this.f1318R;
                                    if (!(pm23.f7228R == null || (viewGroup2 = pm23.f7229R) == null)) {
                                        owe O2 = owe.O(viewGroup2, pm23.C().S());
                                        O2.getClass();
                                        if (hAW.W(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + this.f1318R);
                                        }
                                        O2.R(1, 3, this);
                                    }
                                    this.f1318R.e = 3;
                                    continue;
                                case 4:
                                    y();
                                    continue;
                                case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                                    pm2.e = 5;
                                    continue;
                                case 6:
                                    U();
                                    continue;
                                default:
                                    continue;
                            }
                        }
                        z = true;
                    } else {
                        if (!z && i == -1 && pm2.f7255v && !pm2.y() && !this.f1318R.f7249c) {
                            if (hAW.W(3)) {
                                Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f1318R);
                            }
                            ((naw) this.f1317R.e).e(this.f1318R);
                            this.f1317R.i(this);
                            if (hAW.W(3)) {
                                Log.d("FragmentManager", "initState called for fragment: " + this.f1318R);
                            }
                            this.f1318R.P();
                        }
                        pm2 pm24 = this.f1318R;
                        if (pm24.P) {
                            if (!(pm24.f7228R == null || (viewGroup = pm24.f7229R) == null)) {
                                owe O3 = owe.O(viewGroup, pm24.C().S());
                                if (this.f1318R.f7247Z) {
                                    O3.getClass();
                                    if (hAW.W(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + this.f1318R);
                                    }
                                    O3.R(3, 1, this);
                                } else {
                                    O3.getClass();
                                    if (hAW.W(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + this.f1318R);
                                    }
                                    O3.R(2, 1, this);
                                }
                            }
                            pm2 pm25 = this.f1318R;
                            hAW haw = pm25.f7234R;
                            if (haw != null && pm25.f7245R && hAW.s(pm25)) {
                                haw.f4140v = true;
                            }
                            pm2 pm26 = this.f1318R;
                            pm26.P = false;
                            pm26.f7252v.N();
                        }
                        return;
                    }
                }
            } finally {
                this.f1319R = false;
            }
        } else if (hAW.W(2)) {
            StringBuilder U = opT.U("Ignoring re-entrant call to moveToExpectedState() for ");
            U.append(this.f1318R);
            Log.v("FragmentManager", U.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L() {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.d.L():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N() {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.d.N():void");
    }

    public final void O() {
        String str;
        if (!this.f1318R.f7251e) {
            if (hAW.W(3)) {
                StringBuilder U = opT.U("moveto CREATE_VIEW: ");
                U.append(this.f1318R);
                Log.d("FragmentManager", U.toString());
            }
            pm2 pm2 = this.f1318R;
            LayoutInflater u = pm2.u(pm2.f7226R);
            ViewGroup viewGroup = null;
            pm2 pm22 = this.f1318R;
            ViewGroup viewGroup2 = pm22.f7229R;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = pm22.Z;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) pm22.f7234R.f4126R.z(i);
                        if (viewGroup == null) {
                            pm2 pm23 = this.f1318R;
                            if (!pm23.f7225O) {
                                try {
                                    str = pm23.k().getResources().getResourceName(this.f1318R.Z);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                StringBuilder U2 = opT.U("No view found for id 0x");
                                U2.append(Integer.toHexString(this.f1318R.Z));
                                U2.append(" (");
                                U2.append(str);
                                U2.append(") for fragment ");
                                U2.append(this.f1318R);
                                throw new IllegalArgumentException(U2.toString());
                            }
                        } else if (!(viewGroup instanceof FragmentContainerView)) {
                            pm2 pm24 = this.f1318R;
                            kSM ksm = gju.R;
                            gju.v(new khS(pm24, viewGroup, 1));
                            gju.R(pm24).getClass();
                            ovv ovv = ovv.DETECT_WRONG_FRAGMENT_CONTAINER;
                            if (ovv instanceof Void) {
                                Void r3 = (Void) ovv;
                            }
                        }
                    } else {
                        StringBuilder U3 = opT.U("Cannot create fragment ");
                        U3.append(this.f1318R);
                        U3.append(" for a container view with no id");
                        throw new IllegalArgumentException(U3.toString());
                    }
                }
            }
            pm2 pm25 = this.f1318R;
            pm25.f7229R = viewGroup;
            pm25.T(u, viewGroup, pm25.f7226R);
            View view = this.f1318R.f7228R;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                pm2 pm26 = this.f1318R;
                pm26.f7228R.setTag(R.id.fragment_container_view_tag, pm26);
                if (viewGroup != null) {
                    v();
                }
                pm2 pm27 = this.f1318R;
                if (pm27.f7247Z) {
                    pm27.f7228R.setVisibility(8);
                }
                View view2 = this.f1318R.f7228R;
                WeakHashMap weakHashMap = of5.f6887R;
                if (d6y.v(view2)) {
                    fv7.c(this.f1318R.f7228R);
                } else {
                    View view3 = this.f1318R.f7228R;
                    view3.addOnAttachStateChangeListener(new czV(this, view3));
                }
                pm2 pm28 = this.f1318R;
                pm28.W(pm28.f7228R, pm28.f7226R);
                pm28.f7252v.i(2);
                alu alu = this.f1316R;
                pm2 pm29 = this.f1318R;
                View view4 = pm29.f7228R;
                alu.C(pm29, false);
                int visibility = this.f1318R.f7228R.getVisibility();
                this.f1318R.X().R = this.f1318R.f7228R.getAlpha();
                pm2 pm210 = this.f1318R;
                if (pm210.f7229R != null && visibility == 0) {
                    View findFocus = pm210.f7228R.findFocus();
                    if (findFocus != null) {
                        this.f1318R.X().f6116R = findFocus;
                        if (hAW.W(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f1318R);
                        }
                    }
                    this.f1318R.f7228R.setAlpha(0.0f);
                }
            }
            this.f1318R.e = 2;
        }
    }

    public final void P() {
        bzM bzm = new bzM(this.f1318R);
        pm2 pm2 = this.f1318R;
        if (pm2.e <= -1 || bzm.v != null) {
            bzm.v = pm2.f7226R;
        } else {
            Bundle bundle = new Bundle();
            pm2 pm22 = this.f1318R;
            pm22.A(bundle);
            pm22.f7235R.c(bundle);
            bundle.putParcelable("android:support:fragments", pm22.f7252v.D());
            this.f1316R.x(this.f1318R, false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (this.f1318R.f7228R != null) {
                j();
            }
            if (this.f1318R.f7227R != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", this.f1318R.f7227R);
            }
            if (this.f1318R.v != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", this.f1318R.v);
            }
            if (!this.f1318R.N) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", this.f1318R.N);
            }
            bzm.v = bundle;
            if (this.f1318R.f7253v != null) {
                if (bundle == null) {
                    bzm.v = new Bundle();
                }
                bzm.v.putString("android:target_state", this.f1318R.f7253v);
                int i = this.f1318R.X;
                if (i != 0) {
                    bzm.v.putInt("android:target_req_state", i);
                }
            }
        }
        this.f1317R.Y(this.f1318R.f7238R, bzm);
    }

    public final void R() {
        if (hAW.W(3)) {
            StringBuilder U = opT.U("moveto ACTIVITY_CREATED: ");
            U.append(this.f1318R);
            Log.d("FragmentManager", U.toString());
        }
        pm2 pm2 = this.f1318R;
        Bundle bundle = pm2.f7226R;
        pm2.f7252v.B();
        pm2.e = 3;
        pm2.U = false;
        pm2.t();
        if (pm2.U) {
            if (hAW.W(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + pm2);
            }
            View view = pm2.f7228R;
            if (view != null) {
                Bundle bundle2 = pm2.f7226R;
                SparseArray<Parcelable> sparseArray = pm2.f7227R;
                if (sparseArray != null) {
                    view.restoreHierarchyState(sparseArray);
                    pm2.f7227R = null;
                }
                if (pm2.f7228R != null) {
                    kGM kgm = pm2.f7241R;
                    kgm.R.v(pm2.v);
                    pm2.v = null;
                }
                pm2.U = false;
                pm2.s(bundle2);
                if (!pm2.U) {
                    throw new dSW("Fragment " + pm2 + " did not call through to super.onViewStateRestored()");
                } else if (pm2.f7228R != null) {
                    pm2.f7241R.R(alX.ON_CREATE);
                }
            }
            pm2.f7226R = null;
            hAW haw = pm2.f7252v;
            haw.f4133c = false;
            haw.f4135e = false;
            haw.f4124R.f6474e = false;
            haw.i(4);
            alu alu = this.f1316R;
            Bundle bundle3 = this.f1318R.f7226R;
            alu.R(false);
            return;
        }
        throw new dSW("Fragment " + pm2 + " did not call through to super.onActivityCreated()");
    }

    public final void U() {
        if (hAW.W(3)) {
            StringBuilder U = opT.U("movefrom RESUMED: ");
            U.append(this.f1318R);
            Log.d("FragmentManager", U.toString());
        }
        pm2 pm2 = this.f1318R;
        pm2.f7252v.i(5);
        if (pm2.f7228R != null) {
            pm2.f7241R.R(alX.ON_PAUSE);
        }
        pm2.f7242R.X(alX.ON_PAUSE);
        pm2.e = 6;
        pm2.U = true;
        this.f1316R.O(this.f1318R, false);
    }

    public final void X() {
        Parcelable parcelable;
        if (hAW.W(3)) {
            StringBuilder U = opT.U("moveto CREATED: ");
            U.append(this.f1318R);
            Log.d("FragmentManager", U.toString());
        }
        pm2 pm2 = this.f1318R;
        if (!pm2.j) {
            this.f1316R.Z(false);
            pm2 pm22 = this.f1318R;
            Bundle bundle = pm22.f7226R;
            pm22.f7252v.B();
            pm22.e = 1;
            pm22.U = false;
            pm22.f7242R.R(new k3P() { // from class: androidx.fragment.app.Fragment$6
                @Override // defpackage.k3P
                public final void e(nu_ nu_, alX alx) {
                    View view;
                    if (alx == alX.ON_STOP && (view = pm2.this.f7228R) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
            pm22.f7235R.v(bundle);
            pm22.K(bundle);
            pm22.j = true;
            if (pm22.U) {
                pm22.f7242R.X(alX.ON_CREATE);
                alu alu = this.f1316R;
                pm2 pm23 = this.f1318R;
                Bundle bundle2 = pm23.f7226R;
                alu.c(pm23, false);
                return;
            }
            throw new dSW("Fragment " + pm22 + " did not call through to super.onCreate()");
        }
        Bundle bundle3 = pm2.f7226R;
        if (!(bundle3 == null || (parcelable = bundle3.getParcelable("android:support:fragments")) == null)) {
            pm2.f7252v.F(parcelable);
            hAW haw = pm2.f7252v;
            haw.f4133c = false;
            haw.f4135e = false;
            haw.f4124R.f6474e = false;
            haw.i(1);
        }
        this.f1318R.e = 1;
    }

    public final void Z() {
        View view;
        if (hAW.W(3)) {
            StringBuilder U = opT.U("movefrom CREATE_VIEW: ");
            U.append(this.f1318R);
            Log.d("FragmentManager", U.toString());
        }
        pm2 pm2 = this.f1318R;
        ViewGroup viewGroup = pm2.f7229R;
        if (!(viewGroup == null || (view = pm2.f7228R) == null)) {
            viewGroup.removeView(view);
        }
        pm2 pm22 = this.f1318R;
        pm22.f7252v.i(1);
        if (pm22.f7228R != null) {
            kGM kgm = pm22.f7241R;
            kgm.v();
            if (kgm.f5229R.f5900R.R(iMP.CREATED)) {
                pm22.f7241R.R(alX.ON_DESTROY);
            }
        }
        pm22.e = 1;
        pm22.U = false;
        pm22.h();
        if (pm22.U) {
            iYs iys = (iYs) new CV(pm22.e(), iYs.R, 0).O(iYs.class);
            if (iys.f4641R.m() <= 0) {
                pm22.f7224L = false;
                this.f1316R.N(this.f1318R, false);
                pm2 pm23 = this.f1318R;
                pm23.f7229R = null;
                pm23.f7228R = null;
                pm23.f7241R = null;
                pm23.f7230R.X(null);
                this.f1318R.f7246X = false;
                return;
            }
            jQ.Y(iys.f4641R.x(0));
            throw null;
        }
        throw new dSW("Fragment " + pm22 + " did not call through to super.onDestroyView()");
    }

    public final void c() {
        if (hAW.W(3)) {
            StringBuilder U = opT.U("moveto ATTACHED: ");
            U.append(this.f1318R);
            Log.d("FragmentManager", U.toString());
        }
        pm2 pm2 = this.f1318R;
        pm2 pm22 = pm2.f7244R;
        d dVar = null;
        if (pm22 != null) {
            d dVar2 = (d) ((HashMap) this.f1317R.f7203v).get(pm22.f7238R);
            if (dVar2 != null) {
                pm2 pm23 = this.f1318R;
                pm23.f7253v = pm23.f7244R.f7238R;
                pm23.f7244R = null;
                dVar = dVar2;
            } else {
                StringBuilder U2 = opT.U("Fragment ");
                U2.append(this.f1318R);
                U2.append(" declared target fragment ");
                U2.append(this.f1318R.f7244R);
                U2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(U2.toString());
            }
        } else {
            String str = pm2.f7253v;
            if (str != null && (dVar = (d) ((HashMap) this.f1317R.f7203v).get(str)) == null) {
                StringBuilder U3 = opT.U("Fragment ");
                U3.append(this.f1318R);
                U3.append(" declared target fragment ");
                throw new IllegalStateException(jQ.g(U3, this.f1318R.f7253v, " that does not belong to this FragmentManager!"));
            }
        }
        if (dVar != null) {
            dVar.H();
        }
        pm2 pm24 = this.f1318R;
        hAW haw = pm24.f7234R;
        pm24.f7232R = haw.f4113R;
        pm24.f7254v = haw.f4128R;
        this.f1316R.L(false);
        pm2 pm25 = this.f1318R;
        Iterator it = pm25.f7239R.iterator();
        while (it.hasNext()) {
            ((hts) it.next()).R();
        }
        pm25.f7239R.clear();
        pm25.f7252v.v(pm25.f7232R, pm25.v(), pm25);
        pm25.e = 0;
        pm25.U = false;
        pm25.o(pm25.f7232R.f3004R);
        if (pm25.U) {
            Iterator it2 = pm25.f7234R.f4120R.iterator();
            while (it2.hasNext()) {
                ((kQZ) it2.next()).R(pm25);
            }
            hAW haw2 = pm25.f7252v;
            haw2.f4133c = false;
            haw2.f4135e = false;
            haw2.f4124R.f6474e = false;
            haw2.i(0);
            this.f1316R.v(this.f1318R, false);
            return;
        }
        throw new dSW("Fragment " + pm25 + " did not call through to super.onAttach()");
    }

    public final int e() {
        pm2 pm2 = this.f1318R;
        if (pm2.f7234R == null) {
            return pm2.e;
        }
        int i = this.R;
        int ordinal = pm2.f7236R.ordinal();
        int i2 = 0;
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        pm2 pm22 = this.f1318R;
        if (pm22.f7251e) {
            if (pm22.f7246X) {
                i = Math.max(this.R, 2);
                View view = this.f1318R.f7228R;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.R < 4 ? Math.min(i, pm22.e) : Math.min(i, 1);
            }
        }
        if (!this.f1318R.f7245R) {
            i = Math.min(i, 1);
        }
        pm2 pm23 = this.f1318R;
        ViewGroup viewGroup = pm23.f7229R;
        kuA kua = null;
        if (viewGroup != null) {
            owe O = owe.O(viewGroup, pm23.C().S());
            O.getClass();
            kuA e = O.e(this.f1318R);
            if (e != null) {
                i2 = e.v;
            }
            pm2 pm24 = this.f1318R;
            Iterator it = O.v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                kuA kua2 = (kuA) it.next();
                if (kua2.f5473R.equals(pm24) && !kua2.f5474R) {
                    kua = kua2;
                    break;
                }
            }
            if (kua != null && (i2 == 0 || i2 == 1)) {
                i2 = kua.v;
            }
        }
        if (i2 == 2) {
            i = Math.min(i, 6);
        } else if (i2 == 3) {
            i = Math.max(i, 3);
        } else {
            pm2 pm25 = this.f1318R;
            if (pm25.f7255v) {
                i = pm25.y() ? Math.min(i, 1) : Math.min(i, -1);
            }
        }
        pm2 pm26 = this.f1318R;
        if (pm26.C && pm26.e < 5) {
            i = Math.min(i, 4);
        }
        if (hAW.W(2)) {
            StringBuilder C = opT.C("computeExpectedState() of ", i, " for ");
            C.append(this.f1318R);
            Log.v("FragmentManager", C.toString());
        }
        return i;
    }

    public final void g() {
        if (hAW.W(3)) {
            StringBuilder U = opT.U("moveto STARTED: ");
            U.append(this.f1318R);
            Log.d("FragmentManager", U.toString());
        }
        pm2 pm2 = this.f1318R;
        pm2.f7252v.B();
        pm2.f7252v.J(true);
        pm2.e = 5;
        pm2.U = false;
        pm2.S();
        if (pm2.U) {
            m4i m4i = pm2.f7242R;
            alX alx = alX.ON_START;
            m4i.X(alx);
            if (pm2.f7228R != null) {
                pm2.f7241R.R(alx);
            }
            hAW haw = pm2.f7252v;
            haw.f4133c = false;
            haw.f4135e = false;
            haw.f4124R.f6474e = false;
            haw.i(5);
            this.f1316R.H(this.f1318R, false);
            return;
        }
        throw new dSW("Fragment " + pm2 + " did not call through to super.onStart()");
    }

    public final void j() {
        if (this.f1318R.f7228R != null) {
            if (hAW.W(2)) {
                StringBuilder U = opT.U("Saving view state for fragment ");
                U.append(this.f1318R);
                U.append(" with view ");
                U.append(this.f1318R.f7228R);
                Log.v("FragmentManager", U.toString());
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f1318R.f7228R.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f1318R.f7227R = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f1318R.f7241R.R.c(bundle);
            if (!bundle.isEmpty()) {
                this.f1318R.v = bundle;
            }
        }
    }

    public final void m() {
        if (hAW.W(3)) {
            StringBuilder U = opT.U("movefrom ATTACHED: ");
            U.append(this.f1318R);
            Log.d("FragmentManager", U.toString());
        }
        pm2 pm2 = this.f1318R;
        pm2.e = -1;
        boolean z = false;
        pm2.U = false;
        pm2.I();
        if (pm2.U) {
            hAW haw = pm2.f7252v;
            if (!haw.f4130X) {
                haw.H();
                pm2.f7252v = new hAW();
            }
            this.f1316R.X(this.f1318R, false);
            pm2 pm22 = this.f1318R;
            pm22.e = -1;
            pm22.f7232R = null;
            pm22.f7254v = null;
            pm22.f7234R = null;
            boolean z2 = true;
            if (pm22.f7255v && !pm22.y()) {
                z = true;
            }
            if (!z) {
                naw naw = (naw) this.f1317R.e;
                if (naw.v.containsKey(this.f1318R.f7238R) && naw.f6475v) {
                    z2 = naw.f6473c;
                }
                if (!z2) {
                    return;
                }
            }
            if (hAW.W(3)) {
                StringBuilder U2 = opT.U("initState called for fragment: ");
                U2.append(this.f1318R);
                Log.d("FragmentManager", U2.toString());
            }
            this.f1318R.P();
            return;
        }
        throw new dSW("Fragment " + pm2 + " did not call through to super.onDetach()");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r1 >= ((java.util.ArrayList) r0.f7202R).size()) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        r4 = (defpackage.pm2) ((java.util.ArrayList) r0.f7202R).get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r4.f7229R != r2) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        r4 = r4.f7228R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r4 == null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        r3 = r2.indexOfChild(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v() {
        /*
            r7 = this;
            piu r0 = r7.f1317R
            pm2 r1 = r7.f1318R
            r0.getClass()
            android.view.ViewGroup r2 = r1.f7229R
            r3 = -1
            if (r2 != 0) goto L_0x000d
            goto L_0x0057
        L_0x000d:
            java.lang.Object r4 = r0.f7202R
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r1 = r4.indexOf(r1)
            int r4 = r1 + -1
        L_0x0017:
            if (r4 < 0) goto L_0x0035
            java.lang.Object r5 = r0.f7202R
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r5 = r5.get(r4)
            pm2 r5 = (defpackage.pm2) r5
            android.view.ViewGroup r6 = r5.f7229R
            if (r6 != r2) goto L_0x0032
            android.view.View r5 = r5.f7228R
            if (r5 == 0) goto L_0x0032
            int r0 = r2.indexOfChild(r5)
            int r3 = r0 + 1
            goto L_0x0057
        L_0x0032:
            int r4 = r4 + -1
            goto L_0x0017
        L_0x0035:
            int r1 = r1 + 1
            java.lang.Object r4 = r0.f7202R
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            if (r1 >= r4) goto L_0x0057
            java.lang.Object r4 = r0.f7202R
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r4 = r4.get(r1)
            pm2 r4 = (defpackage.pm2) r4
            android.view.ViewGroup r5 = r4.f7229R
            if (r5 != r2) goto L_0x0035
            android.view.View r4 = r4.f7228R
            if (r4 == 0) goto L_0x0035
            int r3 = r2.indexOfChild(r4)
        L_0x0057:
            pm2 r7 = r7.f1318R
            android.view.ViewGroup r0 = r7.f7229R
            android.view.View r7 = r7.f7228R
            r0.addView(r7, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.d.v():void");
    }

    public final void x() {
        pm2 pm2 = this.f1318R;
        if (pm2.f7251e && pm2.f7246X && !pm2.f7224L) {
            if (hAW.W(3)) {
                StringBuilder U = opT.U("moveto CREATE_VIEW: ");
                U.append(this.f1318R);
                Log.d("FragmentManager", U.toString());
            }
            pm2 pm22 = this.f1318R;
            pm22.T(pm22.u(pm22.f7226R), null, this.f1318R.f7226R);
            View view = this.f1318R.f7228R;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                pm2 pm23 = this.f1318R;
                pm23.f7228R.setTag(R.id.fragment_container_view_tag, pm23);
                pm2 pm24 = this.f1318R;
                if (pm24.f7247Z) {
                    pm24.f7228R.setVisibility(8);
                }
                pm2 pm25 = this.f1318R;
                pm25.W(pm25.f7228R, pm25.f7226R);
                pm25.f7252v.i(2);
                alu alu = this.f1316R;
                pm2 pm26 = this.f1318R;
                View view2 = pm26.f7228R;
                alu.C(pm26, false);
                this.f1318R.e = 2;
            }
        }
    }

    public final void y() {
        if (hAW.W(3)) {
            StringBuilder U = opT.U("movefrom STARTED: ");
            U.append(this.f1318R);
            Log.d("FragmentManager", U.toString());
        }
        pm2 pm2 = this.f1318R;
        hAW haw = pm2.f7252v;
        haw.f4135e = true;
        haw.f4124R.f6474e = true;
        haw.i(4);
        if (pm2.f7228R != null) {
            pm2.f7241R.R(alX.ON_STOP);
        }
        pm2.f7242R.X(alX.ON_STOP);
        pm2.e = 4;
        pm2.U = false;
        pm2.d();
        if (pm2.U) {
            this.f1316R.U(this.f1318R, false);
            return;
        }
        throw new dSW("Fragment " + pm2 + " did not call through to super.onStop()");
    }

    public d(alu alu, piu piu, ClassLoader classLoader, aLv alv, bzM bzm) {
        this.f1316R = alu;
        this.f1317R = piu;
        pm2 R = bzm.R(alv, classLoader);
        this.f1318R = R;
        if (hAW.W(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + R);
        }
    }

    public d(alu alu, piu piu, pm2 pm2, bzM bzm) {
        this.f1316R = alu;
        this.f1317R = piu;
        this.f1318R = pm2;
        pm2.f7227R = null;
        pm2.v = null;
        pm2.O = 0;
        pm2.f7246X = false;
        pm2.f7245R = false;
        pm2 pm22 = pm2.f7244R;
        pm2.f7253v = pm22 != null ? pm22.f7238R : null;
        pm2.f7244R = null;
        Bundle bundle = bzm.v;
        if (bundle != null) {
            pm2.f7226R = bundle;
        } else {
            pm2.f7226R = new Bundle();
        }
    }
}
