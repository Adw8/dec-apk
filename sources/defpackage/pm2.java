package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Y;
import androidx.lifecycle.h;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: pm2  reason: default package */
/* loaded from: classes.dex */
public abstract class pm2 implements ComponentCallbacks, View.OnCreateContextMenuListener, nu_, ly1, jIY, adL {
    public static final Object R = new Object();
    public boolean C;
    public int L;

    /* renamed from: L  reason: collision with other field name */
    public boolean f7224L;
    public int O;

    /* renamed from: O  reason: collision with other field name */
    public boolean f7225O;
    public boolean P;

    /* renamed from: R  reason: collision with other field name */
    public Bundle f7226R;

    /* renamed from: R  reason: collision with other field name */
    public SparseArray f7227R;

    /* renamed from: R  reason: collision with other field name */
    public View f7228R;

    /* renamed from: R  reason: collision with other field name */
    public ViewGroup f7229R;

    /* renamed from: R  reason: collision with other field name */
    public h f7231R;

    /* renamed from: R  reason: collision with other field name */
    public eAj f7232R;

    /* renamed from: R  reason: collision with other field name */
    public hAW f7234R;

    /* renamed from: R  reason: collision with other field name */
    public hSL f7235R;

    /* renamed from: R  reason: collision with other field name */
    public kGM f7241R;

    /* renamed from: R  reason: collision with other field name */
    public m4i f7242R;

    /* renamed from: R  reason: collision with other field name */
    public mfw f7243R;

    /* renamed from: R  reason: collision with other field name */
    public pm2 f7244R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7245R;
    public boolean U;
    public int X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f7246X;
    public int Z;

    /* renamed from: Z  reason: collision with other field name */
    public boolean f7247Z;
    public Bundle c;

    /* renamed from: c  reason: collision with other field name */
    public String f7248c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f7249c;

    /* renamed from: e  reason: collision with other field name */
    public String f7250e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f7251e;
    public boolean j;
    public boolean m;
    public Bundle v;

    /* renamed from: v  reason: collision with other field name */
    public pm2 f7254v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f7255v;
    public boolean x;
    public int e = -1;

    /* renamed from: R  reason: collision with other field name */
    public String f7238R = UUID.randomUUID().toString();

    /* renamed from: v  reason: collision with other field name */
    public String f7253v = null;

    /* renamed from: R  reason: collision with other field name */
    public Boolean f7237R = null;

    /* renamed from: v  reason: collision with other field name */
    public hAW f7252v = new hAW();
    public boolean H = true;
    public boolean N = true;

    /* renamed from: R  reason: collision with other field name */
    public iMP f7236R = iMP.RESUMED;

    /* renamed from: R  reason: collision with other field name */
    public Y f7230R = new Y();

    /* renamed from: R  reason: collision with other field name */
    public final AtomicInteger f7240R = new AtomicInteger();

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f7239R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public final fLZ f7233R = new fLZ(this);

    public pm2() {
        N();
    }

    public void A(Bundle bundle) {
    }

    public final void B(Bundle bundle) {
        hAW haw = this.f7234R;
        if (haw != null) {
            if (haw == null ? false : haw.p()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.c = bundle;
    }

    public final hAW C() {
        hAW haw = this.f7234R;
        if (haw != null) {
            return haw;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void G(int i, int i2, int i3, int i4) {
        if (this.f7243R != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            X().f6115R = i;
            X().v = i2;
            X().c = i3;
            X().e = i4;
        }
    }

    public Context H() {
        eAj eaj = this.f7232R;
        if (eaj == null) {
            return null;
        }
        return eaj.f3004R;
    }

    public void I() {
        this.U = true;
    }

    public View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void K(Bundle bundle) {
        Parcelable parcelable;
        this.U = true;
        if (!(bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null)) {
            this.f7252v.F(parcelable);
            hAW haw = this.f7252v;
            haw.f4133c = false;
            haw.f4135e = false;
            haw.f4124R.f6474e = false;
            haw.i(1);
        }
        hAW haw2 = this.f7252v;
        if (!(haw2.R >= 1)) {
            haw2.f4133c = false;
            haw2.f4135e = false;
            haw2.f4124R.f6474e = false;
            haw2.i(1);
        }
    }

    @Override // defpackage.jIY
    public hv5 L() {
        if (this.f7234R != null) {
            if (this.f7231R == null) {
                Application application = null;
                Context applicationContext = k().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && hAW.W(3)) {
                    StringBuilder U = opT.U("Could not find Application instance from Context ");
                    U.append(k().getApplicationContext());
                    U.append(", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                    Log.d("FragmentManager", U.toString());
                }
                this.f7231R = new h(application, this, this.c);
            }
            return this.f7231R;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final void N() {
        this.f7242R = new m4i(this);
        this.f7235R = new hSL(this);
        this.f7231R = null;
        if (!this.f7239R.contains(this.f7233R)) {
            fLZ flz = this.f7233R;
            if (this.e >= 0) {
                flz.R();
            } else {
                this.f7239R.add(flz);
            }
        }
    }

    @Override // defpackage.nu_
    public final m4i O() {
        return this.f7242R;
    }

    public final void P() {
        N();
        this.f7250e = this.f7238R;
        this.f7238R = UUID.randomUUID().toString();
        this.f7245R = false;
        this.f7255v = false;
        this.f7251e = false;
        this.f7246X = false;
        this.f7225O = false;
        this.O = 0;
        this.f7234R = null;
        this.f7252v = new hAW();
        this.f7232R = null;
        this.L = 0;
        this.Z = 0;
        this.f7248c = null;
        this.f7247Z = false;
        this.m = false;
    }

    public void Q() {
        this.U = true;
    }

    public void S() {
        this.U = true;
    }

    public void T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f7252v.B();
        boolean z = true;
        this.f7224L = true;
        this.f7241R = new kGM(this, e());
        View J = J(layoutInflater, viewGroup, bundle);
        this.f7228R = J;
        if (J != null) {
            this.f7241R.v();
            aH9.vr(this.f7228R, this.f7241R);
            this.f7228R.setTag(R.id.view_tree_view_model_store_owner, this.f7241R);
            aH9.cr(this.f7228R, this.f7241R);
            this.f7230R.X(this.f7241R);
            return;
        }
        if (this.f7241R.f5229R == null) {
            z = false;
        }
        if (!z) {
            this.f7241R = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final int U() {
        iMP imp = this.f7236R;
        return (imp == iMP.INITIALIZED || this.f7254v == null) ? imp.ordinal() : Math.min(imp.ordinal(), this.f7254v.U());
    }

    public void V(Activity activity) {
        this.U = true;
    }

    public void W(View view, Bundle bundle) {
    }

    public final mfw X() {
        if (this.f7243R == null) {
            this.f7243R = new mfw();
        }
        return this.f7243R;
    }

    public void Y() {
        this.U = true;
    }

    @Override // defpackage.jIY
    public final o0y Z() {
        Application application;
        Context applicationContext = k().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && hAW.W(3)) {
            StringBuilder U = opT.U("Could not find Application instance from Context ");
            U.append(k().getApplicationContext());
            U.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            Log.d("FragmentManager", U.toString());
        }
        o0y o0y = new o0y(0);
        if (application != null) {
            o0y.v(ppN.U, application);
        }
        o0y.v(mxC.f6248R, this);
        o0y.v(mxC.f6251v, this);
        Bundle bundle = this.c;
        if (bundle != null) {
            o0y.v(mxC.f6249c, bundle);
        }
        return o0y;
    }

    @Override // defpackage.adL
    public final bhK c() {
        return this.f7235R.f4264R;
    }

    public void d() {
        this.U = true;
    }

    @Override // defpackage.ly1
    public final ns8 e() {
        if (this.f7234R == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (U() != 1) {
            naw naw = this.f7234R.f4124R;
            ns8 ns8 = (ns8) naw.e.get(this.f7238R);
            if (ns8 != null) {
                return ns8;
            }
            ns8 ns82 = new ns8();
            naw.e.put(this.f7238R, ns82);
            return ns82;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final boolean g() {
        if (!this.f7247Z) {
            hAW haw = this.f7234R;
            if (haw == null) {
                return false;
            }
            pm2 pm2 = this.f7254v;
            haw.getClass();
            if (!(pm2 == null ? false : pm2.g())) {
                return false;
            }
        }
        return true;
    }

    public void h() {
        this.U = true;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return super.hashCode();
    }

    public final void i(int i, int i2, Intent intent) {
        if (hAW.W(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public final boolean j() {
        return this.f7232R != null && this.f7245R;
    }

    public final Context k() {
        Context H = H();
        if (H != null) {
            return H;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final void l(Intent intent) {
        eAj eaj = this.f7232R;
        if (eaj != null) {
            Context context = eaj.f3004R;
            Object obj = C1.R;
            aCt.v(context, intent, null);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final hAW m() {
        if (this.f7232R != null) {
            return this.f7252v;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void n(boolean z) {
    }

    public void o(Context context) {
        this.U = true;
        eAj eaj = this.f7232R;
        Activity activity = eaj == null ? null : eaj.R;
        if (activity != null) {
            this.U = false;
            V(activity);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.U = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        r().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.U = true;
    }

    public final View p() {
        View view = this.f7228R;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final hm9 r() {
        eAj eaj = this.f7232R;
        hm9 hm9 = eaj == null ? null : (hm9) eaj.R;
        if (hm9 != null) {
            return hm9;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public void s(Bundle bundle) {
        this.U = true;
    }

    public void t() {
        this.U = true;
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f7238R);
        if (this.L != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.L));
        }
        if (this.f7248c != null) {
            sb.append(" tag=");
            sb.append(this.f7248c);
        }
        sb.append(")");
        return sb.toString();
    }

    public LayoutInflater u(Bundle bundle) {
        eAj eaj = this.f7232R;
        if (eaj != null) {
            LayoutInflater cloneInContext = eaj.f3007R.getLayoutInflater().cloneInContext(eaj.f3007R);
            cloneInContext.setFactory2(this.f7252v.f4125R);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public pdD v() {
        return new dYS(this);
    }

    public final boolean y() {
        return this.O > 0;
    }

    public void z(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.U = true;
        eAj eaj = this.f7232R;
        if ((eaj == null ? null : eaj.R) != null) {
            this.U = true;
        }
    }
}
