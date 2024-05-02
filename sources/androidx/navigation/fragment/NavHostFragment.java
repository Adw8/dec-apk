package androidx.navigation.fragment;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.c;
import androidx.fragment.app.FragmentContainerView;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class NavHostFragment extends pm2 {
    public static final /* synthetic */ int x = 0;
    public mpr R;
    public boolean g;
    public int m;
    public View v;

    /* renamed from: v  reason: collision with other field name */
    public Boolean f1351v;

    @Override // defpackage.pm2
    public final void A(Bundle bundle) {
        Bundle bundle2;
        mpr mpr = this.R;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry : mHQ.h(mpr.f6183R.R).entrySet()) {
            String str = (String) entry.getKey();
            Bundle Z = ((jFk) entry.getValue()).Z();
            if (Z != null) {
                arrayList.add(str);
                bundle3.putBundle(str, Z);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle2 = new Bundle();
            bundle3.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle2.putBundle("android-support-nav:controller:navigatorState", bundle3);
        } else {
            bundle2 = null;
        }
        if (!mpr.f6186R.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            il ilVar = mpr.f6186R;
            Parcelable[] parcelableArr = new Parcelable[ilVar.X];
            Iterator<E> it = ilVar.iterator();
            int i = 0;
            while (it.hasNext()) {
                i++;
                parcelableArr[i] = new ouN((j5B) it.next());
            }
            bundle2.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!mpr.c.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            int[] iArr = new int[mpr.c.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i2 = 0;
            for (Map.Entry entry2 : mpr.c.entrySet()) {
                i2++;
                iArr[i2] = ((Number) entry2.getKey()).intValue();
                arrayList2.add((String) entry2.getValue());
            }
            bundle2.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle2.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!mpr.e.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : mpr.e.entrySet()) {
                String str2 = (String) entry3.getKey();
                il ilVar2 = (il) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[ilVar2.X];
                Iterator it2 = ilVar2.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    i3++;
                    if (i3 >= 0) {
                        parcelableArr2[i3] = (ouN) next;
                    } else {
                        pdD.k();
                        throw null;
                    }
                }
                bundle2.putParcelableArray(opT.H("android-support-nav:controller:backStackStates:", str2), parcelableArr2);
            }
            bundle2.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (mpr.f6194R) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android-support-nav:controller:deepLinkHandled", mpr.f6194R);
        }
        if (bundle2 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundle2);
        }
        if (this.g) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i4 = this.m;
        if (i4 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i4);
        }
    }

    @Override // defpackage.pm2
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        int i = ((pm2) this).L;
        if (i == 0 || i == -1) {
            i = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i);
        return fragmentContainerView;
    }

    @Override // defpackage.pm2
    public final void K(Bundle bundle) {
        Bundle bundle2;
        m4i O;
        Context k = k();
        mpr mpr = new mpr(k);
        this.R = mpr;
        if (!n3x.v(this, mpr.f6192R)) {
            nu_ nu_ = mpr.f6192R;
            if (!(nu_ == null || (O = nu_.O()) == null)) {
                O.v(mpr.f6193R);
            }
            mpr.f6192R = this;
            ((pm2) this).f7242R.R(mpr.f6193R);
        }
        while (true) {
            if (!(k instanceof ContextWrapper)) {
                break;
            } else if (k instanceof dZd) {
                mpr mpr2 = this.R;
                c x2 = ((dZd) k).x();
                if (!n3x.v(x2, mpr2.f6178R)) {
                    nu_ nu_2 = mpr2.f6192R;
                    if (nu_2 != null) {
                        Iterator it = ((jnM) mpr2.f6184R).f5016R.iterator();
                        while (it.hasNext()) {
                            ((hS) it.next()).cancel();
                        }
                        mpr2.f6178R = x2;
                        x2.R(nu_2, mpr2.f6184R);
                        m4i O2 = nu_2.O();
                        O2.v(mpr2.f6193R);
                        O2.R(mpr2.f6193R);
                    } else {
                        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
                    }
                }
            } else {
                k = ((ContextWrapper) k).getBaseContext();
            }
        }
        mpr mpr3 = this.R;
        Boolean bool = this.f1351v;
        int i = 0;
        mpr3.f6197v = bool != null && bool.booleanValue();
        mpr3.K();
        Bundle bundle3 = null;
        this.f1351v = null;
        mpr mpr4 = this.R;
        ns8 e = e();
        bJ3 bj3 = mpr4.f6179R;
        gUZ guz = bJ3.R;
        if (!n3x.v(bj3, (bJ3) new CV(e, guz).O(bJ3.class))) {
            if (mpr4.f6186R.isEmpty()) {
                mpr4.f6179R = (bJ3) new CV(e, guz).O(bJ3.class);
            } else {
                throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
            }
        }
        mpr mpr5 = this.R;
        mpr5.f6183R.R(new kmE(k(), m()));
        hFh hfh = mpr5.f6183R;
        Context k2 = k();
        hAW m = m();
        int i2 = ((pm2) this).L;
        if (i2 == 0 || i2 == -1) {
            i2 = R.id.nav_host_fragment_container;
        }
        hfh.R(new kx3(k2, m, i2));
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.g = true;
                KP kp = new KP(C());
                kp.L(this);
                kp.e(false);
            }
            this.m = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            mpr mpr6 = this.R;
            bundle2.setClassLoader(mpr6.f6176R.getClassLoader());
            mpr6.f6177R = bundle2.getBundle("android-support-nav:controller:navigatorState");
            mpr6.f6195R = bundle2.getParcelableArray("android-support-nav:controller:backStack");
            mpr6.e.clear();
            int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
            if (!(intArray == null || stringArrayList == null)) {
                int i3 = 0;
                for (int i4 : intArray) {
                    i3++;
                    mpr6.c.put(Integer.valueOf(i4), stringArrayList.get(i3));
                }
            }
            ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String str : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle2.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                    if (parcelableArray != null) {
                        LinkedHashMap linkedHashMap = mpr6.e;
                        il ilVar = new il(parcelableArray.length);
                        o7s o7s = new o7s(parcelableArray);
                        while (o7s.hasNext()) {
                            Parcelable parcelable = (Parcelable) o7s.next();
                            if (parcelable != null) {
                                ilVar.addLast((ouN) parcelable);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                            }
                        }
                        linkedHashMap.put(str, ilVar);
                    }
                }
            }
            mpr6.f6194R = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
        int i5 = this.m;
        if (i5 != 0) {
            mpr mpr7 = this.R;
            mpr7.i(((nt9) mpr7.f6181R.getValue()).v(i5), null);
        } else {
            Bundle bundle4 = ((pm2) this).c;
            if (bundle4 != null) {
                i = bundle4.getInt("android-support-nav:fragment:graphId");
            }
            if (bundle4 != null) {
                bundle3 = bundle4.getBundle("android-support-nav:fragment:startDestinationArgs");
            }
            if (i != 0) {
                mpr mpr8 = this.R;
                mpr8.i(((nt9) mpr8.f6181R.getValue()).v(i), bundle3);
            }
        }
        super.K(bundle);
    }

    @Override // defpackage.pm2
    public final void W(View view, Bundle bundle) {
        if (view instanceof ViewGroup) {
            view.setTag(R.id.nav_controller_view_tag, this.R);
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    View view2 = (View) parent;
                    this.v = view2;
                    if (view2.getId() == ((pm2) this).L) {
                        this.v.setTag(R.id.nav_controller_view_tag, this.R);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }

    @Override // defpackage.pm2
    public final void h() {
        this.U = true;
        View view = this.v;
        if (view != null && n3x.m(view) == this.R) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.v = null;
    }

    @Override // defpackage.pm2
    public final void n(boolean z) {
        mpr mpr = this.R;
        if (mpr != null) {
            mpr.f6197v = z;
            mpr.K();
            return;
        }
        this.f1351v = Boolean.valueOf(z);
    }

    @Override // defpackage.pm2
    public final void o(Context context) {
        super.o(context);
        if (this.g) {
            KP kp = new KP(C());
            kp.L(this);
            kp.e(false);
        }
    }

    @Override // defpackage.pm2
    public final void z(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.z(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o02.v);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.m = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, l1r.c);
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.g = true;
        }
        obtainStyledAttributes2.recycle();
    }
}
