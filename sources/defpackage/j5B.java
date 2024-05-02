package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.h;
import java.util.Set;

/* renamed from: j5B  reason: default package */
/* loaded from: classes.dex */
public final class j5B implements nu_, ly1, jIY, adL {
    public static final /* synthetic */ int e = 0;
    public final Context R;

    /* renamed from: R  reason: collision with other field name */
    public final Bundle f4820R;

    /* renamed from: R  reason: collision with other field name */
    public e9E f4822R;

    /* renamed from: R  reason: collision with other field name */
    public iMP f4824R;

    /* renamed from: R  reason: collision with other field name */
    public final jTo f4825R;

    /* renamed from: R  reason: collision with other field name */
    public final String f4826R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4828R;
    public final Bundle v;

    /* renamed from: R  reason: collision with other field name */
    public m4i f4827R = new m4i(this);

    /* renamed from: R  reason: collision with other field name */
    public final hSL f4823R = new hSL(this);

    /* renamed from: R  reason: collision with other field name */
    public final bV5 f4821R = new bV5(new krp(this));

    /* renamed from: v  reason: collision with other field name */
    public iMP f4829v = iMP.INITIALIZED;

    static {
        new aYa(0, 0);
    }

    public j5B(Context context, e9E e9e, Bundle bundle, iMP imp, jTo jto, String str, Bundle bundle2) {
        this.R = context;
        this.f4822R = e9e;
        this.f4820R = bundle;
        this.f4824R = imp;
        this.f4825R = jto;
        this.f4826R = str;
        this.v = bundle2;
    }

    @Override // defpackage.jIY
    public final hv5 L() {
        return (h) this.f4821R.getValue();
    }

    @Override // defpackage.nu_
    public final m4i O() {
        return this.f4827R;
    }

    public final void R(iMP imp) {
        this.f4829v = imp;
        v();
    }

    @Override // defpackage.jIY
    public final o0y Z() {
        o0y o0y = new o0y(0);
        Context context = this.R;
        Application application = null;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        }
        if (application != null) {
            o0y.v(ppN.U, application);
        }
        o0y.v(mxC.f6248R, this);
        o0y.v(mxC.f6251v, this);
        Bundle bundle = this.f4820R;
        if (bundle != null) {
            o0y.v(mxC.f6249c, bundle);
        }
        return o0y;
    }

    @Override // defpackage.adL
    public final bhK c() {
        return this.f4823R.f4264R;
    }

    @Override // defpackage.ly1
    public final ns8 e() {
        if (this.f4828R) {
            if (this.f4827R.f5900R != iMP.DESTROYED) {
                jTo jto = this.f4825R;
                if (jto != null) {
                    String str = this.f4826R;
                    bJ3 bj3 = (bJ3) jto;
                    ns8 ns8 = (ns8) bj3.f1587R.get(str);
                    if (ns8 != null) {
                        return ns8;
                    }
                    ns8 ns82 = new ns8();
                    bj3.f1587R.put(str, ns82);
                    return ns82;
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x0083
            boolean r1 = r7 instanceof defpackage.j5B
            if (r1 != 0) goto L_0x0009
            goto L_0x0083
        L_0x0009:
            java.lang.String r1 = r6.f4826R
            j5B r7 = (defpackage.j5B) r7
            java.lang.String r2 = r7.f4826R
            boolean r1 = defpackage.n3x.v(r1, r2)
            r2 = 1
            if (r1 == 0) goto L_0x0083
            e9E r1 = r6.f4822R
            e9E r3 = r7.f4822R
            boolean r1 = defpackage.n3x.v(r1, r3)
            if (r1 == 0) goto L_0x0083
            m4i r1 = r6.f4827R
            m4i r3 = r7.f4827R
            boolean r1 = defpackage.n3x.v(r1, r3)
            if (r1 == 0) goto L_0x0083
            hSL r1 = r6.f4823R
            bhK r1 = r1.f4264R
            hSL r3 = r7.f4823R
            bhK r3 = r3.f4264R
            boolean r1 = defpackage.n3x.v(r1, r3)
            if (r1 == 0) goto L_0x0083
            android.os.Bundle r1 = r6.f4820R
            android.os.Bundle r3 = r7.f4820R
            boolean r1 = defpackage.n3x.v(r1, r3)
            if (r1 != 0) goto L_0x0082
            android.os.Bundle r1 = r6.f4820R
            if (r1 == 0) goto L_0x007f
            java.util.Set r1 = r1.keySet()
            if (r1 == 0) goto L_0x007f
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0054
        L_0x0052:
            r6 = r2
            goto L_0x007b
        L_0x0054:
            java.util.Iterator r1 = r1.iterator()
        L_0x0058:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0052
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r4 = r6.f4820R
            java.lang.Object r4 = r4.get(r3)
            android.os.Bundle r5 = r7.f4820R
            if (r5 == 0) goto L_0x0073
            java.lang.Object r3 = r5.get(r3)
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            boolean r3 = defpackage.n3x.v(r4, r3)
            if (r3 != 0) goto L_0x0058
            r6 = r0
        L_0x007b:
            if (r6 != r2) goto L_0x007f
            r6 = r2
            goto L_0x0080
        L_0x007f:
            r6 = r0
        L_0x0080:
            if (r6 == 0) goto L_0x0083
        L_0x0082:
            r0 = r2
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j5B.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f4822R.hashCode() + (this.f4826R.hashCode() * 31);
        Bundle bundle = this.f4820R;
        if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
            for (String str : keySet) {
                int i = hashCode * 31;
                Object obj = this.f4820R.get(str);
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.f4823R.f4264R.hashCode() + ((this.f4827R.hashCode() + (hashCode * 31)) * 31);
    }

    public final void v() {
        if (!this.f4828R) {
            this.f4823R.R();
            this.f4828R = true;
            if (this.f4825R != null) {
                mxC.C(this);
            }
            this.f4823R.v(this.v);
        }
        if (this.f4824R.ordinal() < this.f4829v.ordinal()) {
            this.f4827R.L(this.f4824R);
        } else {
            this.f4827R.L(this.f4829v);
        }
    }
}
