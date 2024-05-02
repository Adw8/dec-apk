package defpackage;

/* renamed from: kWx  reason: default package */
/* loaded from: classes.dex */
public final class kWx extends jJG {
    public static final Object v = new Object();
    public Object R = v;

    /* renamed from: R  reason: collision with other field name */
    public mAv f5321R;

    /* renamed from: v  reason: collision with other field name */
    public int f5322v;

    @Override // defpackage.jJG
    public final void R(jJG jjg) {
        kWx kwx = (kWx) jjg;
        this.f5321R = kwx.f5321R;
        this.R = kwx.R;
        this.f5322v = kwx.f5322v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:16:0x0031, B:18:0x0036, B:21:0x004d, B:23:0x0052, B:25:0x0064, B:26:0x006d, B:27:0x0070, B:30:0x0073, B:32:0x0085, B:33:0x0091, B:34:0x0094, B:35:0x0097), top: B:50:0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(defpackage.gHm r12, defpackage.dR6 r13) {
        /*
            r11 = this;
            java.lang.Object r0 = defpackage.jwU.f5150R
            monitor-enter(r0)
            mAv r11 = r11.f5321R     // Catch: all -> 0x00c4
            monitor-exit(r0)
            r0 = 7
            if (r11 == 0) goto L_0x00c3
            h5 r1 = defpackage.aPK.v
            java.lang.Object r1 = r1.H()
            biT r1 = (defpackage.biT) r1
            r2 = 0
            if (r1 != 0) goto L_0x001b
            biT r1 = new biT
            kSh[] r3 = new defpackage.kSh[r2]
            r1.<init>(r3)
        L_0x001b:
            int r3 = r1.e
            r4 = 1
            if (r3 <= 0) goto L_0x0031
            java.lang.Object[] r5 = r1.f1772R
            r6 = r2
        L_0x0023:
            r7 = r5[r6]
            kSh r7 = (defpackage.kSh) r7
            java.lang.Object r7 = r7.R
            kg9 r7 = (defpackage.kg9) r7
            r7.x(r12)
            int r6 = r6 + r4
            if (r6 < r3) goto L_0x0023
        L_0x0031:
            int r3 = r11.R     // Catch: all -> 0x0071
            r5 = r2
        L_0x0034:
            if (r5 >= r3) goto L_0x0098
            java.lang.Object r6 = r11.f5962R     // Catch: all -> 0x0071
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: all -> 0x0071
            r6 = r6[r5]     // Catch: all -> 0x0071
            java.lang.Object r7 = r11.v     // Catch: all -> 0x0071
            java.lang.Object[] r7 = (java.lang.Object[]) r7     // Catch: all -> 0x0071
            r7 = r7[r5]     // Catch: all -> 0x0071
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: all -> 0x0071
            int r7 = r7.intValue()     // Catch: all -> 0x0071
            nmZ r6 = (defpackage.nmZ) r6     // Catch: all -> 0x0071
            if (r7 == r4) goto L_0x004d
            goto L_0x0091
        L_0x004d:
            boolean r7 = r6 instanceof defpackage.gHm     // Catch: all -> 0x0071
            r8 = 0
            if (r7 == 0) goto L_0x0073
            gHm r6 = (defpackage.gHm) r6     // Catch: all -> 0x0071
            kWx r7 = r6.f3717R     // Catch: all -> 0x0071
            int r9 = r13.e()     // Catch: all -> 0x0071
            nQA r10 = r13.X()     // Catch: all -> 0x0071
            jJG r7 = defpackage.jwU.U(r7, r9, r10)     // Catch: all -> 0x0071
            if (r7 == 0) goto L_0x006d
            kWx r7 = (defpackage.kWx) r7     // Catch: all -> 0x0071
            f_c r8 = r6.R     // Catch: all -> 0x0071
            kWx r6 = r6.c(r7, r13, r2, r8)     // Catch: all -> 0x0071
            goto L_0x0085
        L_0x006d:
            defpackage.jwU.H()     // Catch: all -> 0x0071
            throw r8     // Catch: all -> 0x0071
        L_0x0071:
            r11 = move-exception
            goto L_0x00ad
        L_0x0073:
            jJG r6 = r6.C()     // Catch: all -> 0x0071
            int r7 = r13.e()     // Catch: all -> 0x0071
            nQA r9 = r13.X()     // Catch: all -> 0x0071
            jJG r6 = defpackage.jwU.U(r6, r7, r9)     // Catch: all -> 0x0071
            if (r6 == 0) goto L_0x0094
        L_0x0085:
            int r0 = r0 * 31
            int r7 = java.lang.System.identityHashCode(r6)     // Catch: all -> 0x0071
            int r0 = r0 + r7
            int r0 = r0 * 31
            int r6 = r6.R     // Catch: all -> 0x0071
            int r0 = r0 + r6
        L_0x0091:
            int r5 = r5 + 1
            goto L_0x0034
        L_0x0094:
            defpackage.jwU.H()     // Catch: all -> 0x0071
            throw r8     // Catch: all -> 0x0071
        L_0x0098:
            int r11 = r1.e
            if (r11 <= 0) goto L_0x00c3
            java.lang.Object[] r13 = r1.f1772R
        L_0x009e:
            r1 = r13[r2]
            kSh r1 = (defpackage.kSh) r1
            java.lang.Object r1 = r1.v
            kg9 r1 = (defpackage.kg9) r1
            r1.x(r12)
            int r2 = r2 + r4
            if (r2 < r11) goto L_0x009e
            goto L_0x00c3
        L_0x00ad:
            int r13 = r1.e
            if (r13 <= 0) goto L_0x00c2
            java.lang.Object[] r0 = r1.f1772R
        L_0x00b3:
            r1 = r0[r2]
            kSh r1 = (defpackage.kSh) r1
            java.lang.Object r1 = r1.v
            kg9 r1 = (defpackage.kg9) r1
            r1.x(r12)
            int r2 = r2 + r4
            if (r2 >= r13) goto L_0x00c2
            goto L_0x00b3
        L_0x00c2:
            throw r11
        L_0x00c3:
            return r0
        L_0x00c4:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kWx.c(gHm, dR6):int");
    }

    @Override // defpackage.jJG
    public final jJG v() {
        return new kWx();
    }
}
