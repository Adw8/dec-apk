package defpackage;

/* renamed from: mu5  reason: default package */
/* loaded from: classes.dex */
public final class mu5 extends mjG implements gl4 {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f6224R;
    public final float c;
    public final float e;
    public final float v;

    public /* synthetic */ mu5(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
    }

    @Override // defpackage.gl4
    public final int L(mZf mzf, cxM cxm, int i) {
        long U = U(mzf);
        return oys.X(U) ? oys.L(U) : dtx.m(U, cxm.Z(i));
    }

    @Override // defpackage.gl4
    public final int R(mZf mzf, cxM cxm, int i) {
        long U = U(mzf);
        return oys.O(U) ? oys.Z(U) : dtx.x(U, cxm.k(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        if (r5 != Integer.MAX_VALUE) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long U(defpackage.jJj r8) {
        /*
            r7 = this;
            float r0 = r7.c
            r1 = 2143289344(0x7fc00000, float:NaN)
            boolean r0 = defpackage.hoI.R(r0, r1)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != 0) goto L_0x0029
            float r0 = r7.c
            hoI r4 = new hoI
            r4.<init>(r0)
            float r0 = (float) r3
            hoI r5 = new hoI
            r5.<init>(r0)
            int r0 = r4.compareTo(r5)
            if (r0 >= 0) goto L_0x0022
            r4 = r5
        L_0x0022:
            float r0 = r4.R
            int r0 = r8.B(r0)
            goto L_0x002a
        L_0x0029:
            r0 = r2
        L_0x002a:
            float r4 = r7.e
            boolean r4 = defpackage.hoI.R(r4, r1)
            if (r4 != 0) goto L_0x004d
            float r4 = r7.e
            hoI r5 = new hoI
            r5.<init>(r4)
            float r4 = (float) r3
            hoI r6 = new hoI
            r6.<init>(r4)
            int r4 = r5.compareTo(r6)
            if (r4 >= 0) goto L_0x0046
            r5 = r6
        L_0x0046:
            float r4 = r5.R
            int r4 = r8.B(r4)
            goto L_0x004e
        L_0x004d:
            r4 = r2
        L_0x004e:
            float r5 = r7.R
            boolean r5 = defpackage.hoI.R(r5, r1)
            if (r5 != 0) goto L_0x0065
            float r5 = r7.R
            int r5 = r8.B(r5)
            if (r5 <= r0) goto L_0x005f
            r5 = r0
        L_0x005f:
            if (r5 >= 0) goto L_0x0062
            r5 = r3
        L_0x0062:
            if (r5 == r2) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r5 = r3
        L_0x0066:
            float r6 = r7.v
            boolean r1 = defpackage.hoI.R(r6, r1)
            if (r1 != 0) goto L_0x007d
            float r7 = r7.v
            int r7 = r8.B(r7)
            if (r7 <= r4) goto L_0x0077
            r7 = r4
        L_0x0077:
            if (r7 >= 0) goto L_0x007a
            r7 = r3
        L_0x007a:
            if (r7 == r2) goto L_0x007d
            r3 = r7
        L_0x007d:
            long r7 = defpackage.dtx.R(r5, r0, r3, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu5.U(jJj):long");
    }

    @Override // defpackage.gl4
    public final int X(mZf mzf, cxM cxm, int i) {
        long U = U(mzf);
        return oys.X(U) ? oys.L(U) : dtx.m(U, cxm.zw(i));
    }

    @Override // defpackage.gl4
    public final mET e(mZf mzf, pc0 pc0, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        long U = U(mzf);
        if (this.f6224R) {
            j2 = dtx.Z(j, U);
        } else {
            if (!hoI.R(this.R, Float.NaN)) {
                i = oys.x(U);
            } else {
                i = oys.x(j);
                int Z = oys.Z(U);
                if (i > Z) {
                    i = Z;
                }
            }
            if (!hoI.R(this.c, Float.NaN)) {
                i2 = oys.Z(U);
            } else {
                i2 = oys.Z(j);
                int x = oys.x(U);
                if (i2 < x) {
                    i2 = x;
                }
            }
            if (!hoI.R(this.v, Float.NaN)) {
                i3 = oys.m(U);
            } else {
                i3 = oys.m(j);
                int L = oys.L(U);
                if (i3 > L) {
                    i3 = L;
                }
            }
            if (!hoI.R(this.e, Float.NaN)) {
                i4 = oys.L(U);
            } else {
                i4 = oys.L(j);
                int m = oys.m(U);
                if (i4 < m) {
                    i4 = m;
                }
            }
            j2 = dtx.R(i, i2, i3, i4);
        }
        l0f L2 = pc0.L(j2);
        return mzf.f(L2.e, L2.X, iia.R, new kW9(L2, 2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mu5)) {
            return false;
        }
        mu5 mu5 = (mu5) obj;
        return hoI.R(this.R, mu5.R) && hoI.R(this.v, mu5.v) && hoI.R(this.c, mu5.c) && hoI.R(this.e, mu5.e) && this.f6224R == mu5.f6224R;
    }

    public final int hashCode() {
        return jQ.c(this.e, jQ.c(this.c, jQ.c(this.v, Float.hashCode(this.R) * 31, 31), 31), 31);
    }

    @Override // defpackage.gl4
    public final int p(mZf mzf, cxM cxm, int i) {
        long U = U(mzf);
        return oys.O(U) ? oys.Z(U) : dtx.x(U, cxm.ZW(i));
    }

    public mu5(float f, float f2, float f3, float f4, boolean z) {
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
        this.f6224R = z;
    }
}
