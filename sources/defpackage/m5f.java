package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;

/* renamed from: m5f  reason: default package */
/* loaded from: classes.dex */
public final class m5f {

    /* renamed from: R  reason: collision with other field name */
    public final F4 f5906R;

    /* renamed from: R  reason: collision with other field name */
    public final ao9 f5907R;

    /* renamed from: R  reason: collision with other field name */
    public final cGy f5908R;

    /* renamed from: R  reason: collision with other field name */
    public final cr f5909R;

    /* renamed from: R  reason: collision with other field name */
    public final eJw f5910R;

    /* renamed from: R  reason: collision with other field name */
    public final eNg f5911R;

    /* renamed from: R  reason: collision with other field name */
    public final gcd f5912R;

    /* renamed from: R  reason: collision with other field name */
    public volatile jOh f5915R;

    /* renamed from: R  reason: collision with other field name */
    public final k2z f5917R;

    /* renamed from: R  reason: collision with other field name */
    public final k49 f5918R;

    /* renamed from: R  reason: collision with other field name */
    public final kUC f5919R;

    /* renamed from: R  reason: collision with other field name */
    public final m3D f5920R;

    /* renamed from: R  reason: collision with other field name */
    public final nax f5921R;
    public final ivW X;

    /* renamed from: v  reason: collision with other field name */
    public final ivW f5923v;
    public final int R = 999957;

    /* renamed from: R  reason: collision with other field name */
    public final String f5916R = Build.PRODUCT;

    /* renamed from: v  reason: collision with other field name */
    public final String f5924v = Build.ID;

    /* renamed from: c  reason: collision with other field name */
    public final String f5922c = Build.FINGERPRINT;

    /* renamed from: R  reason: collision with other field name */
    public final ivW f5914R = g4x.O(null);
    public final ivW c = g4x.O(null);
    public final ivW e = g4x.O(Boolean.FALSE);
    public final ivW O = g4x.O(null);

    /* renamed from: R  reason: collision with other field name */
    public volatile long f5905R = -3600001;
    public volatile long v = -21600001;

    /* renamed from: R  reason: collision with other field name */
    public final hgO f5913R = mxC.c();

    public m5f(Context context, F4 f4, gcd gcd, kUC kuc, eNg eng, k2z k2z, dq dqVar, nax nax, cr crVar, eJw ejw, cGy cgy, ao9 ao9, k49 k49) {
        this.f5906R = f4;
        this.f5912R = gcd;
        this.f5919R = kuc;
        this.f5911R = eng;
        this.f5917R = k2z;
        this.f5921R = nax;
        this.f5909R = crVar;
        this.f5910R = ejw;
        this.f5908R = cgy;
        this.f5907R = ao9;
        this.f5918R = k49;
        pyX pyx = new pyX(null);
        h8R h8r = iFn.R;
        fhC fhc = hJr.R;
        fhc.getClass();
        m3D v = jjU.v(jjU.t(fhc, pyx));
        this.f5920R = v;
        ivW O = g4x.O(null);
        this.f5923v = O;
        ivW O2 = g4x.O(ows.R);
        this.X = O2;
        if (n3x.v(Application.getProcessName(), context.getPackageName())) {
            L();
            l6.z(v, null, 0, new fbm(this, null), 3);
            l6.z(v, null, 0, new c83(this, null), 3);
            mxC.y(l6.J(O), v, new jtq(this, 0));
            mxC.y(O2, v, new jtq(this, 1));
            l6.z(v, null, 0, new o9V(this, null), 3);
            return;
        }
        L();
        mxC.y(gcd.f3805R, v, new jtq(this, 2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object R(defpackage.m5f r4, defpackage.aOO r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof defpackage.nVm
            if (r0 == 0) goto L_0x0016
            r0 = r5
            nVm r0 = (defpackage.nVm) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x001b
        L_0x0016:
            nVm r0 = new nVm
            r0.<init>(r4, r5)
        L_0x001b:
            java.lang.Object r5 = r0.R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x002c
            m5f r4 = r0.f6421R
            defpackage.jjU.o(r5)
            goto L_0x005c
        L_0x002c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r0 = -13176986522508(0xfffff403fe662c74, double:NaN)
            java.lang.String r5 = defpackage.afN.R(r0)
            r4.<init>(r5)
            throw r4
        L_0x003b:
            defpackage.jjU.o(r5)
            ivW r5 = r4.e
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
            r0.f6421R = r4
            r0.e = r3
            lsf r5 = defpackage.iFn.f4518R
            gFp r2 = new gFp
            r3 = 0
            r2.<init>(r4, r3)
            java.lang.Object r5 = defpackage.l6.a(r5, r2, r0)
            if (r5 != r1) goto L_0x005c
            goto L_0x0068
        L_0x005c:
            r1 = r5
            ipB r1 = (defpackage.ipB) r1
            r4.e(r1)
            long r2 = android.os.SystemClock.elapsedRealtime()
            r4.f5905R = r2
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5f.R(m5f, aOO):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(defpackage.m5f r13, defpackage.aOO r14) {
        /*
            r13.getClass()
            boolean r0 = r14 instanceof defpackage.mH3
            if (r0 == 0) goto L_0x0016
            r0 = r14
            mH3 r0 = (defpackage.mH3) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x001b
        L_0x0016:
            mH3 r0 = new mH3
            r0.<init>(r13, r14)
        L_0x001b:
            java.lang.Object r14 = r0.R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x002c
            nWW r13 = r0.f5998R
            defpackage.jjU.o(r14)     // Catch: Exception -> 0x0084
            goto L_0x0084
        L_0x002c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r0 = -13572123513740(0xfffff3a7fe662c74, double:NaN)
            java.lang.String r14 = defpackage.afN.R(r0)
            r13.<init>(r14)
            throw r13
        L_0x003b:
            defpackage.jjU.o(r14)
            blo r14 = new blo
            r14.<init>()
            nWW r2 = new nWW
            r2.<init>()
            ipB r12 = new ipB
            iBb r5 = defpackage.iBb.R
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 126(0x7e, float:1.77E-43)
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r2.R = r12
            fmJ r4 = defpackage.lTs.j()     // Catch: Exception -> 0x0083
            tY r5 = defpackage.cpc.h()     // Catch: Exception -> 0x0083
            cRZ r6 = new cRZ     // Catch: Exception -> 0x0083
            r7 = 0
            r6.<init>(r4, r5, r7)     // Catch: Exception -> 0x0083
            ooO r4 = new ooO     // Catch: Exception -> 0x0083
            r4.<init>(r2, r13, r14, r7)     // Catch: Exception -> 0x0083
            r0.f5998R = r2     // Catch: Exception -> 0x0083
            r0.e = r3     // Catch: Exception -> 0x0083
            int r13 = defpackage.jq1.R     // Catch: Exception -> 0x0083
            iWK r13 = new iWK     // Catch: Exception -> 0x0083
            r13.<init>()     // Catch: Exception -> 0x0083
            ciU r14 = new ciU     // Catch: Exception -> 0x0083
            r14.<init>(r7, r4, r6)     // Catch: Exception -> 0x0083
            java.lang.Object r13 = defpackage.l6.a(r13, r14, r0)     // Catch: Exception -> 0x0083
            if (r13 != r1) goto L_0x0083
            goto L_0x0086
        L_0x0083:
            r13 = r2
        L_0x0084:
            java.lang.Object r1 = r13.R
        L_0x0086:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5f.c(m5f, aOO):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object v(defpackage.m5f r25, defpackage.aOO r26) {
        /*
        // Method dump skipped, instructions count: 466
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5f.v(m5f, aOO):java.lang.Object");
    }

    public final void L() {
        String str;
        gcd gcd = this.f5912R;
        Tq tq = gcd.R;
        String str2 = (String) ((n1) tq.e).c(tq, Tq.R[4]);
        iwX iwx = null;
        if (str2 == null) {
            str = null;
        } else {
            try {
                str = iH_.u(((Ea) gcd.f3806R.getValue()).R(caw.y(str2)));
            } catch (Exception unused) {
                str = null;
            }
        }
        if (str == null) {
            e(new ipB(mRo.R, (String) null, (String) null, (Long) null, (Integer) null, (Integer) null, 126));
            return;
        }
        biy c = this.f5908R.c(str, false);
        if (c instanceof nOH) {
            nOH noh = (nOH) c;
            e(new ipB(mRo.R, noh.f6384R, str, Long.valueOf(noh.R), Integer.valueOf(noh.e), noh.f6383R, 2));
            return;
        }
        cGy cgy = this.f5908R;
        cgy.getClass();
        try {
            iwx = hw1.j((int) ((Long) cgy.R(str, cgy.v).get(afN.R(-6201959633804L))).longValue());
        } catch (Exception unused2) {
        }
        if (iwx == null) {
            iwx = bBw.R;
        }
        e(new ipB(iwx, (String) null, (String) null, (Long) null, (Integer) null, (Integer) null, 126));
    }

    public final Object O(aOO aoo) {
        Object Z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return (elapsedRealtime - this.v >= 21600000 && elapsedRealtime - this.f5905R >= 3600000 && (Z = Z(aoo)) == bGR.COROUTINE_SUSPENDED) ? Z : o8s.R;
    }

    public final boolean X() {
        return this.X.getValue() instanceof oPV;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x0022 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: m5f */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: m5f */
    /* JADX DEBUG: Multi-variable search result rejected for r7v8, resolved type: m5f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v9, types: [hgO, f21] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Z(defpackage.aOO r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.g9R
            if (r0 == 0) goto L_0x0013
            r0 = r8
            g9R r0 = (defpackage.g9R) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            g9R r0 = new g9R
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f3686R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 3
            r6 = 0
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x0046
            if (r2 == r3) goto L_0x003e
            if (r2 != r5) goto L_0x002f
            defpackage.jjU.o(r8)
            goto L_0x00a1
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r0 = -14173418935180(0xfffff31bfe662c74, double:NaN)
            java.lang.String r8 = defpackage.afN.R(r0)
            r7.<init>(r8)
            throw r7
        L_0x003e:
            hgO r7 = r0.R
            m5f r2 = r0.f3687R
            defpackage.jjU.o(r8)
            goto L_0x008d
        L_0x0046:
            m5f r7 = r0.f3687R
            defpackage.jjU.o(r8)     // Catch: all -> 0x0075
            goto L_0x006f
        L_0x004c:
            defpackage.jjU.o(r8)
            hgO r8 = r7.f5913R
            boolean r8 = r8.v(r6)
            if (r8 == 0) goto L_0x007c
            m3D r8 = r7.f5920R     // Catch: all -> 0x0075
            aiv r2 = new aiv     // Catch: all -> 0x0075
            r2.<init>(r7, r6)     // Catch: all -> 0x0075
            jOh r8 = defpackage.l6.C(r8, r6, r2, r5)     // Catch: all -> 0x0075
            r7.f5915R = r8     // Catch: all -> 0x0075
            r0.f3687R = r7     // Catch: all -> 0x0075
            r0.e = r4     // Catch: all -> 0x0075
            java.lang.Object r8 = r8.V(r0)     // Catch: all -> 0x0075
            if (r8 != r1) goto L_0x006f
            return r1
        L_0x006f:
            hgO r7 = r7.f5913R
            defpackage.gvP.W(r7)
            goto L_0x00a4
        L_0x0075:
            r8 = move-exception
            hgO r7 = r7.f5913R
            defpackage.gvP.W(r7)
            throw r8
        L_0x007c:
            hgO r8 = r7.f5913R
            r0.f3687R = r7
            r0.R = r8
            r0.e = r3
            java.lang.Object r2 = r8.R(r6, r0)
            if (r2 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r2 = r7
            r7 = r8
        L_0x008d:
            r7.c(r6)
            jOh r7 = r2.f5915R
            if (r7 == 0) goto L_0x00a4
            r0.f3687R = r6
            r0.R = r6
            r0.e = r5
            java.lang.Object r7 = r7.V(r0)
            if (r7 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            o8s r7 = defpackage.o8s.R
            return r7
        L_0x00a4:
            o8s r7 = defpackage.o8s.R
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5f.Z(aOO):java.lang.Object");
    }

    public final void e(ipB ipb) {
        cYD cyd;
        Object obj;
        long j;
        boolean v = n3x.v(ipb.R, mRo.R);
        this.f5914R.H(ipb.R);
        this.e.H(Boolean.valueOf(v));
        this.f5923v.H(ipb.f4736v);
        String str = ipb.f4734R;
        if (str != null) {
            this.c.H(str);
        }
        ivW ivw = this.O;
        Integer num = ipb.f4735v;
        int i = 0;
        if (num != null) {
            int intValue = num.intValue();
            int i2 = 2;
            if (intValue == 0) {
                i2 = 0;
            } else if (intValue == 1) {
                i2 = 1;
            } else if (intValue != 2) {
                throw new IllegalArgumentException(String.valueOf(intValue));
            }
            cyd = new cYD(i2);
        } else {
            cyd = null;
        }
        ivw.H(cyd);
        ivW ivw2 = this.X;
        Integer num2 = ipb.f4732R;
        if (num2 != null) {
            i = num2.intValue();
        }
        if (i == 0) {
            obj = ows.R;
        } else if (i == 1) {
            obj = oPV.R;
        } else {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        ivw2.H(obj);
        if (ipb.f4733R != null) {
            j = SystemClock.elapsedRealtime() - (this.f5907R.R() - ipb.f4733R.longValue());
        } else {
            j = -21600001;
        }
        this.v = j;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:54:0x010e */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: fG0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: fG0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b1 A[Catch: all -> 0x002f, TryCatch #6 {all -> 0x002f, blocks: (B:12:0x002b, B:22:0x0068, B:23:0x006a, B:26:0x0070, B:28:0x00b1, B:31:0x00bb, B:33:0x00bf, B:36:0x00d3, B:38:0x00db, B:41:0x00e1, B:44:0x00e8, B:47:0x00f4, B:50:0x0100, B:51:0x0102, B:56:0x0111, B:60:0x0125, B:64:0x0139), top: B:75:0x0023 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00db A[Catch: all -> 0x002f, TryCatch #6 {all -> 0x002f, blocks: (B:12:0x002b, B:22:0x0068, B:23:0x006a, B:26:0x0070, B:28:0x00b1, B:31:0x00bb, B:33:0x00bf, B:36:0x00d3, B:38:0x00db, B:41:0x00e1, B:44:0x00e8, B:47:0x00f4, B:50:0x0100, B:51:0x0102, B:56:0x0111, B:60:0x0125, B:64:0x0139), top: B:75:0x0023 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e1 A[Catch: all -> 0x002f, TryCatch #6 {all -> 0x002f, blocks: (B:12:0x002b, B:22:0x0068, B:23:0x006a, B:26:0x0070, B:28:0x00b1, B:31:0x00bb, B:33:0x00bf, B:36:0x00d3, B:38:0x00db, B:41:0x00e1, B:44:0x00e8, B:47:0x00f4, B:50:0x0100, B:51:0x0102, B:56:0x0111, B:60:0x0125, B:64:0x0139), top: B:75:0x0023 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8 A[Catch: all -> 0x002f, TryCatch #6 {all -> 0x002f, blocks: (B:12:0x002b, B:22:0x0068, B:23:0x006a, B:26:0x0070, B:28:0x00b1, B:31:0x00bb, B:33:0x00bf, B:36:0x00d3, B:38:0x00db, B:41:0x00e1, B:44:0x00e8, B:47:0x00f4, B:50:0x0100, B:51:0x0102, B:56:0x0111, B:60:0x0125, B:64:0x0139), top: B:75:0x0023 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f4 A[Catch: all -> 0x002f, TryCatch #6 {all -> 0x002f, blocks: (B:12:0x002b, B:22:0x0068, B:23:0x006a, B:26:0x0070, B:28:0x00b1, B:31:0x00bb, B:33:0x00bf, B:36:0x00d3, B:38:0x00db, B:41:0x00e1, B:44:0x00e8, B:47:0x00f4, B:50:0x0100, B:51:0x0102, B:56:0x0111, B:60:0x0125, B:64:0x0139), top: B:75:0x0023 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0100 A[Catch: all -> 0x002f, TryCatch #6 {all -> 0x002f, blocks: (B:12:0x002b, B:22:0x0068, B:23:0x006a, B:26:0x0070, B:28:0x00b1, B:31:0x00bb, B:33:0x00bf, B:36:0x00d3, B:38:0x00db, B:41:0x00e1, B:44:0x00e8, B:47:0x00f4, B:50:0x0100, B:51:0x0102, B:56:0x0111, B:60:0x0125, B:64:0x0139), top: B:75:0x0023 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(int r19, java.util.Map r20, defpackage.aOO r21) {
        /*
        // Method dump skipped, instructions count: 337
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5f.m(int, java.util.Map, aOO):java.lang.Object");
    }
}
