package defpackage;

/* renamed from: dq7  reason: default package */
/* loaded from: classes.dex */
public final class dq7 implements n4N {
    public final jM R;

    /* renamed from: R  reason: collision with other field name */
    public final kbU f2894R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f2895R;

    /* renamed from: R  reason: collision with other field name */
    public final lR3 f2896R;

    /* renamed from: R  reason: collision with other field name */
    public final liQ f2897R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f2898R = l6.n(null);

    public dq7(h4N h4n, kbU kbu, jM jMVar) {
        hIO hio = hIO.v;
        g5M g5m = j8T.R;
        this.f2897R = h4n;
        this.f2894R = kbu;
        this.R = jMVar;
        this.f2896R = hio;
        this.f2895R = g5m;
    }

    public static final boolean v(dq7 dq7, Hd hd, jMO jmo, int i, mCa mca) {
        int i2;
        int i3;
        dq7.getClass();
        float floatValue = ((Number) hd.c()).floatValue();
        int c = (floatValue <= 0.0f || (i3 = jmo.R.v) < i) ? (floatValue >= 0.0f || (i2 = jmo.R.v) > i + -1) ? 0 : dq7.f2897R.c(i2 + 1) : dq7.f2897R.c(i3);
        if (c == 0) {
            return false;
        }
        mca.x(Float.valueOf((float) c));
        return true;
    }

    public final void L(Integer num) {
        this.f2898R.R(num);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(defpackage.gAN r19, defpackage.jMO r20, int r21, float r22, defpackage.aOO r23) {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq7.O(gAN, jMO, int, float, aOO):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c1, code lost:
        if (r2 > 0.0f) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c8, code lost:
        if (r2 < 0.0f) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ca, code lost:
        r2 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cb, code lost:
        r8 = r4;
        r3 = (double) r11;
        r10 = defpackage.caw.x(r9.R.v + defpackage.mLz.y((((double) r2) / r3) - (((double) r12) / r3)), 0, r7.f4040R.L().O() - 1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012f  */
    @Override // defpackage.n4N
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object R(defpackage.jd2 r17, float r18, defpackage.aOO r19) {
        /*
        // Method dump skipped, instructions count: 333
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq7.R(jd2, float, aOO):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object X(defpackage.jd2 r17, defpackage.jMO r18, int r19, float r20, boolean r21, defpackage.aOO r22) {
        /*
            r16 = this;
            r8 = r16
            r0 = r18
            r7 = r19
            r1 = r20
            r2 = r22
            boolean r3 = r2 instanceof defpackage.pwB
            if (r3 == 0) goto L_0x001d
            r3 = r2
            pwB r3 = (defpackage.pwB) r3
            int r4 = r3.e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001d
            int r4 = r4 - r5
            r3.e = r4
            goto L_0x0022
        L_0x001d:
            pwB r3 = new pwB
            r3.<init>(r8, r2)
        L_0x0022:
            r9 = r3
            java.lang.Object r2 = r9.f7322R
            bGR r10 = defpackage.bGR.COROUTINE_SUSPENDED
            int r3 = r9.e
            r11 = 1
            r12 = 0
            if (r3 == 0) goto L_0x0043
            if (r3 != r11) goto L_0x003b
            eLb r0 = r9.f7321R
            dq7 r1 = r9.R
            defpackage.jjU.o(r2)     // Catch: all -> 0x0038
            goto L_0x00aa
        L_0x0038:
            r0 = move-exception
            goto L_0x00b9
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            defpackage.jjU.o(r2)
            iFC r2 = r0.R
            int r2 = r2.v
            if (r2 != r7) goto L_0x005e
            liQ r3 = r8.f2897R
            int r2 = r3.c(r2)
            if (r2 != 0) goto L_0x005e
            float r0 = r8.c(r1)
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r0)
            return r1
        L_0x005e:
            eLb r13 = new eLb
            r13.<init>()
            r13.R = r1
            eLb r2 = new eLb
            r2.<init>()
            r3 = 0
            if (r21 == 0) goto L_0x007c
            iFC r0 = r0.R
            int r0 = r0.v
            int r0 = r7 - r0
            int r0 = java.lang.Math.abs(r0)
            r4 = 2
            if (r0 < r4) goto L_0x007c
            r6 = r11
            goto L_0x007d
        L_0x007c:
            r6 = r3
        L_0x007d:
            java.lang.Integer r0 = new java.lang.Integer     // Catch: all -> 0x00b7
            r0.<init>(r7)     // Catch: all -> 0x00b7
            r8.L(r0)     // Catch: all -> 0x00b7
            r0 = 0
            r3 = 28
            SE r0 = defpackage.o02.v(r0, r1, r3)     // Catch: all -> 0x00b7
            kbU r14 = r8.f2894R     // Catch: all -> 0x00b7
            bxZ r15 = new bxZ     // Catch: all -> 0x00b7
            r1 = r15
            r3 = r17
            r4 = r13
            r5 = r16
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: all -> 0x00b5
            r9.R = r8     // Catch: all -> 0x00b5
            r9.f7321R = r13     // Catch: all -> 0x00b5
            r9.e = r11     // Catch: all -> 0x00b5
            java.lang.Object r0 = defpackage.o02.X(r0, r14, r15, r9)     // Catch: all -> 0x00b5
            if (r0 != r10) goto L_0x00a8
            return r10
        L_0x00a8:
            r1 = r8
            r0 = r13
        L_0x00aa:
            r1.L(r12)
            float r0 = r0.R
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r0)
            return r1
        L_0x00b5:
            r0 = move-exception
            goto L_0x00ba
        L_0x00b7:
            r0 = move-exception
            r1 = r8
        L_0x00b9:
            r8 = r1
        L_0x00ba:
            r8.L(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq7.X(jd2, jMO, int, float, boolean, aOO):java.lang.Object");
    }

    public final float c(float f) {
        if (f < 0.0f && !this.f2897R.v()) {
            return f;
        }
        if (f <= 0.0f || this.f2897R.R()) {
            return 0.0f;
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [gAN] */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0111, code lost:
        if (r1 != 0) goto L_0x0113;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.jd2 r16, int r17, float r18, defpackage.aOO r19) {
        /*
        // Method dump skipped, instructions count: 311
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq7.e(jd2, int, float, aOO):java.lang.Object");
    }
}
