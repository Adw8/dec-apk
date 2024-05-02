package defpackage;

/* renamed from: bs4  reason: default package */
/* loaded from: classes.dex */
public final class bs4 {
    public final acA R;

    /* renamed from: R  reason: collision with other field name */
    public final dH9 f1826R;

    /* renamed from: R  reason: collision with other field name */
    public final dmk f1827R;

    /* renamed from: R  reason: collision with other field name */
    public final n4N f1828R;

    /* renamed from: R  reason: collision with other field name */
    public final nLK f1829R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f1830R = l6.n(Boolean.FALSE);

    /* renamed from: R  reason: collision with other field name */
    public final boolean f1831R;

    public bs4(nLK nlk, boolean z, h0T h0t, dmk dmk, n4N n4n, acA aca) {
        this.f1829R = nlk;
        this.f1831R = z;
        this.f1826R = h0t;
        this.f1827R = dmk;
        this.f1828R = n4n;
        this.R = aca;
    }

    public final long R(gAN gan, long j, int i) {
        long R = aWo.R(j, this.f1829R == nLK.Horizontal ? 1 : 2);
        acA aca = this.R;
        long O = aWo.O(R, (aca == null || !aca.isEnabled()) ? aWo.v : this.R.R(R));
        lh8 lh8 = (lh8) this.f1826R.getValue();
        i_c i_c = lh8.f5803R;
        long O2 = aWo.O(O, i_c != null ? i_c.c(O, i) : aWo.v);
        long X = X(gan.R(e(this.f1831R ? aWo.Z(-1.0f, O2) : O2)));
        if (this.f1831R) {
            X = aWo.Z(-1.0f, X);
        }
        long O3 = aWo.O(O2, X);
        long v = lh8.v(i, X, O3);
        long O4 = aWo.O(O3, v);
        acA aca2 = this.R;
        if (aca2 != null && aca2.isEnabled()) {
            this.R.O(i, O2, O4);
        }
        return aWo.O(O3, v);
    }

    public final long X(float f) {
        if (!(f == 0.0f)) {
            return this.f1829R == nLK.Horizontal ? aH9.N(f, 0.0f) : aH9.N(0.0f, f);
        }
        int i = aWo.R;
        return aWo.v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0114 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(long r18, defpackage.aOO r20) {
        /*
        // Method dump skipped, instructions count: 288
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs4.c(long, aOO):java.lang.Object");
    }

    public final float e(long j) {
        return this.f1829R == nLK.Horizontal ? aWo.e(j) : aWo.X(j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(long r12, defpackage.aOO r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.fei
            if (r0 == 0) goto L_0x0013
            r0 = r14
            fei r0 = (defpackage.fei) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            fei r0 = new fei
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f3476R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            dRB r11 = r0.f3475R
            defpackage.jjU.o(r14)
            goto L_0x0053
        L_0x0029:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0031:
            defpackage.jjU.o(r14)
            dRB r14 = new dRB
            r14.<init>()
            r14.R = r12
            dmk r2 = r11.f1827R
            oWf r10 = new oWf
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r14
            r7 = r12
            r4.<init>(r5, r6, r7, r9)
            r0.f3475R = r14
            r0.e = r3
            java.lang.Object r11 = defpackage.dmk.v(r2, r10, r0)
            if (r11 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r11 = r14
        L_0x0053:
            long r11 = r11.R
            d_E r13 = new d_E
            r13.<init>(r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs4.v(long, aOO):java.lang.Object");
    }
}
