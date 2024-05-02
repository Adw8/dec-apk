package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.File;
import java.lang.reflect.Type;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: CV  reason: default package */
/* loaded from: classes.dex */
public final class CV implements dI4, IC, cof, Ia {
    public static CV R;

    /* renamed from: R  reason: collision with other field name */
    public Object f59R;
    public Object c;
    public final /* synthetic */ int e;
    public Object v;

    public CV(int i) {
        this.e = i;
        if (i == 13) {
            this.f59R = Collections.emptyList();
            this.v = Collections.emptyList();
        } else if (i == 16) {
            this.f59R = new ArrayList();
            this.v = imB.R;
            this.c = null;
        }
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CV(fMX fmx, dYv dyv) {
        this(fmx, 17, dyv);
        this.e = 17;
    }

    public static CV Y(Context context, AttributeSet attributeSet, int[] iArr) {
        return new CV(context, 2, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static CV h(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new CV(context, 2, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public final void A(m_b m_b) {
        ((ArrayList) this.f59R).clear();
        int size = ((hqD) m_b).v.size();
        for (int i = 0; i < size; i++) {
            kwo kwo = (kwo) ((hqD) m_b).v.get(i);
            int[] iArr = kwo.f5510c;
            if (iArr[0] == 3 || iArr[1] == 3) {
                ((ArrayList) this.f59R).add(kwo);
            }
        }
        m_b.f6065R.f5752R = true;
    }

    public final Drawable C(int i) {
        int resourceId;
        Drawable O;
        if (!((TypedArray) this.v).hasValue(i) || (resourceId = ((TypedArray) this.v).getResourceId(i, 0)) == 0) {
            return null;
        }
        pp R2 = pp.R();
        Context context = (Context) this.f59R;
        synchronized (R2) {
            O = R2.f7286R.O(context, resourceId, true);
        }
        return O;
    }

    public final int H(int i, int i2) {
        return ((TypedArray) this.v).getDimensionPixelSize(i, i2);
    }

    public final boolean I() {
        Iterator it = ((CopyOnWriteArrayList) this.v).iterator();
        while (it.hasNext()) {
            if (((eI8) it.next()).R.P()) {
                return true;
            }
        }
        return false;
    }

    public final boolean J(int i, kwo kwo, kQB kqb) {
        M_ m_ = (M_) this.v;
        int[] iArr = kwo.f5510c;
        m_.R = iArr[0];
        boolean z = true;
        m_.v = iArr[1];
        m_.c = kwo.P();
        ((M_) this.v).e = kwo.m();
        M_ m_2 = (M_) this.v;
        m_2.f293v = false;
        m_2.Z = i;
        boolean z2 = m_2.R == 3;
        boolean z3 = m_2.v == 3;
        boolean z4 = z2 && kwo.X > 0.0f;
        boolean z5 = z3 && kwo.X > 0.0f;
        if (z4 && kwo.f5499R[0] == 4) {
            m_2.R = 1;
        }
        if (z5 && kwo.f5499R[1] == 4) {
            m_2.v = 1;
        }
        kqb.v(kwo, m_2);
        kwo.T(((M_) this.v).X);
        kwo.d(((M_) this.v).O);
        Object obj = this.v;
        M_ m_3 = (M_) obj;
        kwo.f5484L = m_3.f292R;
        int i2 = m_3.L;
        kwo.i = i2;
        if (i2 <= 0) {
            z = false;
        }
        kwo.f5484L = z;
        M_ m_4 = (M_) obj;
        m_4.Z = 0;
        return m_4.f293v;
    }

    public final void K(nlH nlh) {
        ((msD) this.f59R).v();
        ((msD) this.f59R).c();
        try {
            ((gHo) this.v).X(nlh);
            ((msD) this.f59R).Z();
        } finally {
            ((msD) this.f59R).O();
        }
    }

    public final kvj L(Class cls, String str) {
        kvj kvj;
        kvj kvj2 = (kvj) ((ns8) this.f59R).R.get(str);
        if (cls.isInstance(kvj2)) {
            hv5 hv5 = (hv5) this.v;
            gIt git = hv5 instanceof gIt ? (gIt) hv5 : null;
            if (git != null) {
                git.c(kvj2);
            }
            if (kvj2 != null) {
                return kvj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        }
        o0y o0y = new o0y((f3V) this.c);
        o0y.v(dq.U, str);
        try {
            kvj = ((hv5) this.v).v(cls, o0y);
        } catch (AbstractMethodError unused) {
            kvj = ((hv5) this.v).R(cls);
        }
        kvj kvj3 = (kvj) ((ns8) this.f59R).R.put(str, kvj);
        if (kvj3 != null) {
            kvj3.v();
        }
        return kvj;
    }

    public final Typeface N(int i, int i2, Lk lk) {
        int resourceId = ((TypedArray) this.v).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.c) == null) {
            this.c = new TypedValue();
        }
        Context context = (Context) this.f59R;
        TypedValue typedValue = (TypedValue) this.c;
        ThreadLocal threadLocal = cu3.f2452R;
        if (context.isRestricted()) {
            return null;
        }
        return cu3.R(context, resourceId, typedValue, i2, lk, true, false);
    }

    public final kvj O(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return L(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final int P(int i, int i2) {
        return ((TypedArray) this.v).getInt(i, i2);
    }

    public final void Q(m_b m_b, int i, int i2, int i3) {
        int i4 = m_b.V;
        int i5 = m_b.o;
        m_b.V = 0;
        m_b.o = 0;
        m_b.T(i2);
        m_b.d(i3);
        if (i4 < 0) {
            m_b.V = 0;
        } else {
            m_b.V = i4;
        }
        if (i5 < 0) {
            m_b.o = 0;
        } else {
            m_b.o = i5;
        }
        m_b m_b2 = (m_b) this.c;
        m_b2.u = i;
        m_b2.p();
    }

    @Override // defpackage.Ia
    public final Object R(oEG oeg) {
        Executor executor = (Executor) this.v;
        return executor == null ? oeg : new lxm(executor, oeg);
    }

    public final Drawable U(int i) {
        int resourceId;
        return (!((TypedArray) this.v).hasValue(i) || (resourceId = ((TypedArray) this.v).getResourceId(i, 0)) == 0) ? ((TypedArray) this.v).getDrawable(i) : aH9.p((Context) this.f59R, resourceId);
    }

    public final CharSequence V(int i) {
        return ((TypedArray) this.v).getText(i);
    }

    public final void X(Runnable runnable) {
        ((o9L) this.f59R).execute(runnable);
    }

    public final boolean Z(int i, boolean z) {
        return ((TypedArray) this.v).getBoolean(i, z);
    }

    public final eGm c() {
        boolean z;
        if (((ArrayList) this.f59R) != null) {
            Integer num = (Integer) this.c;
            if (num != null) {
                int intValue = num.intValue();
                Iterator it = ((ArrayList) this.f59R).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((klr) it.next()).R == intValue) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    throw new GeneralSecurityException("primary key ID is not present in entries");
                }
            }
            eGm egm = new eGm((imB) this.v, Collections.unmodifiableList((ArrayList) this.f59R), (Integer) this.c);
            this.f59R = null;
            return egm;
        }
        throw new IllegalStateException("cannot call build() twice");
    }

    @Override // defpackage.Ia
    public final Type e() {
        return (Type) this.f59R;
    }

    public final Location g(String str) {
        try {
            if (((LocationManager) this.v).isProviderEnabled(str)) {
                return ((LocationManager) this.v).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    public final nlH i(String str) {
        ma1 R2 = ma1.R(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            R2.Z(1);
        } else {
            R2.H(1, str);
        }
        ((msD) this.f59R).v();
        nlH nlh = null;
        Cursor L = ((msD) this.f59R).L(R2);
        try {
            int U = dtx.U(L, "work_spec_id");
            int U2 = dtx.U(L, "system_id");
            if (L.moveToFirst()) {
                nlh = new nlH(L.getString(U), L.getInt(U2));
            }
            return nlh;
        } finally {
            L.close();
            R2.C();
        }
    }

    public final eIr j() {
        eIr eir = (eIr) this.f59R;
        if (eir != null) {
            return eir;
        }
        return null;
    }

    public final ColorStateList m(int i) {
        int resourceId;
        ColorStateList v;
        return (!((TypedArray) this.v).hasValue(i) || (resourceId = ((TypedArray) this.v).getResourceId(i, 0)) == 0 || (v = C1.v((Context) this.f59R, resourceId)) == null) ? ((TypedArray) this.v).getColorStateList(i) : v;
    }

    public final void n(String str) {
        ((msD) this.f59R).v();
        mVu R2 = ((k87) this.c).R();
        if (str == null) {
            R2.O(1);
        } else {
            R2.Z(1, str);
        }
        ((msD) this.f59R).c();
        try {
            R2.H();
            ((msD) this.f59R).Z();
        } finally {
            ((msD) this.f59R).O();
            ((k87) this.c).c(R2);
        }
    }

    public final boolean o(int i) {
        return ((TypedArray) this.v).hasValue(i);
    }

    @Override // defpackage.IC
    public final void onCancel() {
        ((Animator) this.f59R).end();
        if (hAW.W(2)) {
            StringBuilder U = opT.U("Animator from operation ");
            U.append((kuA) this.v);
            U.append(" has been canceled.");
            Log.v("FragmentManager", U.toString());
        }
    }

    public final String t(int i) {
        return ((TypedArray) this.v).getString(i);
    }

    public final String toString() {
        switch (this.e) {
            case 4:
                String str = "[ ";
                if (((aLq) this.f59R) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder U = opT.U(str);
                        U.append(((aLq) this.f59R).f846v[i]);
                        U.append(" ");
                        str = U.toString();
                    }
                }
                StringBuilder t = jQ.t(str, "] ");
                t.append((aLq) this.f59R);
                return t.toString();
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                StringBuilder t2 = jQ.t("NavDeepLinkRequest", "{");
                if (((Uri) this.f59R) != null) {
                    t2.append(" uri=");
                    t2.append(String.valueOf((Uri) this.f59R));
                }
                if (((String) this.v) != null) {
                    t2.append(" action=");
                    t2.append((String) this.v);
                }
                if (((String) this.c) != null) {
                    t2.append(" mimetype=");
                    t2.append((String) this.c);
                }
                t2.append(" }");
                return t2.toString();
            default:
                return super.toString();
        }
    }

    public final void u(alX alx) {
        Object obj = this.c;
        if (((iV4) obj) != null) {
            ((iV4) obj).run();
        }
        iV4 iv4 = new iV4((m4i) this.f59R, alx);
        this.c = iv4;
        ((Handler) this.v).postAtFrontOfQueue(iv4);
    }

    @Override // defpackage.cof
    public final fIY v(bOp bop) {
        return new n4X(bop.f1618R, (String) this.f59R, (File) this.v, bop.R.R, ((cof) this.c).v(bop));
    }

    public final int x(int i, int i2) {
        return ((TypedArray) this.v).getDimensionPixelOffset(i, i2);
    }

    public final int y(int i, int i2) {
        return ((TypedArray) this.v).getResourceId(i, i2);
    }

    public final void z() {
        ((TypedArray) this.v).recycle();
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public CV(ns8 ns8, gUZ guz, int i) {
        this(ns8, guz);
        this.e = 10;
    }

    public /* synthetic */ CV(Comparable comparable, Object obj, Object obj2, int i) {
        this.e = i;
        this.f59R = comparable;
        this.v = obj;
        this.c = obj2;
    }

    public /* synthetic */ CV(Object obj, int i, Object obj2) {
        this.e = i;
        this.f59R = obj;
        this.v = obj2;
    }

    public /* synthetic */ CV(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.c = obj;
        this.f59R = obj2;
        this.v = obj3;
    }

    public CV(msD msd) {
        this.e = 14;
        this.f59R = msd;
        this.v = new jAB(this, msd, 2);
        this.c = new m8B(this, msd, 2);
    }

    public CV(ExecutorService executorService) {
        this.e = 15;
        this.v = new Handler(Looper.getMainLooper());
        this.c = new hye(this);
        this.f59R = new o9L(executorService);
    }

    public CV(nu_ nu_) {
        this.e = 9;
        this.f59R = new m4i(nu_);
        this.v = new Handler();
    }

    public CV(j_m j_m, j_m j_m2) {
        this.e = 4;
        this.c = j_m;
        this.v = j_m2;
    }

    public CV(ns8 ns8, hv5 hv5, f3V f3v) {
        this.e = 10;
        this.f59R = ns8;
        this.v = hv5;
        this.c = f3v;
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CV(ns8 ns8, gUZ guz) {
        this(ns8, guz, jLB.R);
        this.e = 10;
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public CV(Intent intent) {
        this((Comparable) intent.getData(), (Object) intent.getAction(), (Object) intent.getType(), 11);
        this.e = 11;
    }

    public CV(mBn mbn) {
        this.e = 6;
        this.v = new CopyOnWriteArrayList();
        this.c = new HashMap();
        this.f59R = mbn;
    }

    public CV(Context context, LocationManager locationManager) {
        this.e = 1;
        this.c = new ixi();
        this.f59R = context;
        this.v = locationManager;
    }

    public CV(m_b m_b) {
        this.e = 5;
        this.f59R = new ArrayList();
        this.v = new M_();
        this.c = m_b;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CV(defpackage.ly1 r3, defpackage.hv5 r4) {
        /*
            r2 = this;
            r0 = 10
            r2.e = r0
            ns8 r0 = r3.e()
            boolean r1 = r3 instanceof defpackage.jIY
            if (r1 == 0) goto L_0x0013
            jIY r3 = (defpackage.jIY) r3
            o0y r3 = r3.Z()
            goto L_0x0015
        L_0x0013:
            jLB r3 = defpackage.jLB.R
        L_0x0015:
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CV.<init>(ly1, hv5):void");
    }
}
