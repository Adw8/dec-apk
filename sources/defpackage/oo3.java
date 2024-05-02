package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: oo3  reason: default package */
/* loaded from: classes.dex */
public final class oo3 {
    public final RP R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f6952R;

    /* renamed from: R  reason: collision with other field name */
    public final doT f6953R;

    /* renamed from: R  reason: collision with other field name */
    public final m5f f6954R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6955R;

    public oo3(Context context, doT dot, m5f m5f) {
        this.f6952R = context;
        this.f6953R = dot;
        this.f6954R = m5f;
        this.R = new RP(context, dot);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object R(defpackage.oo3 r10, defpackage.aOO r11) {
        /*
            r10.getClass()
            boolean r0 = r11 instanceof defpackage.bh_
            if (r0 == 0) goto L_0x0016
            r0 = r11
            bh_ r0 = (defpackage.bh_) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x001b
        L_0x0016:
            bh_ r0 = new bh_
            r0.<init>(r10, r11)
        L_0x001b:
            java.lang.Object r11 = r0.R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x002d
            oo3 r10 = r0.f1771R
            defpackage.jjU.o(r11)
            goto L_0x00c7
        L_0x002d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r0 = -3881563399399139219(0xca21eaa755a8186d, double:-1.3092581680595246E49)
            java.lang.String r11 = defpackage.gvP.V(r0)
            r10.<init>(r11)
            throw r10
        L_0x003c:
            defpackage.jjU.o(r11)
            boolean r11 = r10.f6955R
            if (r11 == 0) goto L_0x0047
            o8s r1 = defpackage.o8s.R
            goto L_0x00cd
        L_0x0047:
            pby[] r11 = defpackage.kxm.R
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            androidx.lifecycle.LifecycleCoroutineScopeImpl r2 = defpackage.mxC.N()
            lsf r4 = defpackage.iFn.f4518R
            ffs r5 = new ffs
            r6 = 0
            r5.<init>(r10, r6)
            r7 = 2
            jOh r2 = defpackage.l6.C(r2, r4, r5, r7)
            r11.add(r2)
            androidx.lifecycle.LifecycleCoroutineScopeImpl r2 = defpackage.mxC.N()
            bZp r5 = new bZp
            r5.<init>(r10, r6)
            jOh r2 = defpackage.l6.C(r2, r4, r5, r7)
            r11.add(r2)
            java.io.File r2 = new java.io.File
            android.content.Context r5 = r10.f6952R
            java.io.File r5 = r5.getFilesDir()
            r8 = -3881562810988619667(0xca21eb3055a8186d, double:-1.3094109281641345E49)
            java.lang.String r8 = defpackage.gvP.V(r8)
            r2.<init>(r5, r8)
            boolean r2 = r2.exists()
            if (r2 != 0) goto L_0x009c
            androidx.lifecycle.LifecycleCoroutineScopeImpl r2 = defpackage.mxC.N()
            dwh r5 = new dwh
            r5.<init>(r10, r6)
            jOh r2 = defpackage.l6.C(r2, r4, r5, r7)
            r11.add(r2)
        L_0x009c:
            androidx.lifecycle.LifecycleCoroutineScopeImpl r2 = defpackage.mxC.N()
            f6D r5 = new f6D
            r5.<init>(r10, r6)
            jOh r2 = defpackage.l6.C(r2, r4, r5, r7)
            r11.add(r2)
            r2 = 0
            htf[] r2 = new defpackage.htf[r2]
            java.lang.Object[] r11 = r11.toArray(r2)
            htf[] r11 = (defpackage.htf[]) r11
            int r2 = r11.length
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r2)
            htf[] r11 = (defpackage.htf[]) r11
            r0.f1771R = r10
            r0.e = r3
            java.lang.Object r11 = defpackage.mLz.c(r11, r0)
            if (r11 != r1) goto L_0x00c7
            goto L_0x00cd
        L_0x00c7:
            r10.f6955R = r3
            pby[] r10 = defpackage.kxm.R
            o8s r1 = defpackage.o8s.R
        L_0x00cd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo3.R(oo3, aOO):java.lang.Object");
    }

    public static void v(oo3 oo3, String str) {
        FileOutputStream open = oo3.f6952R.getAssets().open(str);
        try {
            open = new FileOutputStream(new File(oo3.f6952R.getFilesDir(), str));
            th = null;
            jjU.O(open, open);
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083 A[PHI: r10 
      PHI: (r10v2 java.lang.Object) = (r10v4 java.lang.Object), (r10v1 java.lang.Object) binds: [B:20:0x0080, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.aOO r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.lUq
            if (r0 == 0) goto L_0x0013
            r0 = r10
            lUq r0 = (defpackage.lUq) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            lUq r0 = new lUq
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L_0x0040
            if (r2 == r3) goto L_0x003a
            if (r2 != r5) goto L_0x002b
            defpackage.jjU.o(r10)
            goto L_0x0083
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r0 = -3881563773061293971(0xca21ea5055a8186d, double:-1.309161159817911E49)
            java.lang.String r10 = defpackage.gvP.V(r0)
            r9.<init>(r10)
            throw r9
        L_0x003a:
            oo3 r9 = r0.f5756R
            defpackage.jjU.o(r10)
            goto L_0x0071
        L_0x0040:
            defpackage.jjU.o(r10)
            htf[] r10 = new defpackage.htf[r5]
            r2 = 0
            androidx.lifecycle.LifecycleCoroutineScopeImpl r6 = defpackage.mxC.N()
            lsf r7 = defpackage.iFn.f4518R
            kz8 r8 = new kz8
            r8.<init>(r9, r4)
            jOh r6 = defpackage.l6.C(r6, r7, r8, r5)
            r10[r2] = r6
            androidx.lifecycle.LifecycleCoroutineScopeImpl r2 = defpackage.mxC.N()
            lIT r6 = new lIT
            r6.<init>(r9, r4)
            jOh r2 = defpackage.l6.C(r2, r7, r6, r5)
            r10[r3] = r2
            r0.f5756R = r9
            r0.e = r3
            java.lang.Object r10 = defpackage.mLz.c(r10, r0)
            if (r10 != r1) goto L_0x0071
            return r1
        L_0x0071:
            lsf r10 = defpackage.iFn.f4518R
            lW7 r2 = new lW7
            r2.<init>(r9, r4)
            r0.f5756R = r4
            r0.e = r5
            java.lang.Object r10 = defpackage.l6.a(r10, r2, r0)
            if (r10 != r1) goto L_0x0083
            return r1
        L_0x0083:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo3.c(aOO):java.lang.Object");
    }
}
