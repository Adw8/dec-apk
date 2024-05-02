package defpackage;

/* renamed from: Bj  reason: default package */
/* loaded from: classes.dex */
public final class Bj extends jww {
    public int R = 1;

    /* renamed from: R  reason: collision with other field name */
    public final long f39R;

    /* renamed from: R  reason: collision with other field name */
    public final aCQ f40R;
    public final long c;
    public float v;

    /* renamed from: v  reason: collision with other field name */
    public final long f41v;

    /* renamed from: v  reason: collision with other field name */
    public Iw f42v;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (defpackage.ltH.v(r2) <= r9.R()) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Bj(defpackage.aCQ r9) {
        /*
            r8 = this;
            long r0 = defpackage.dU5.v
            r2 = r9
            lC r2 = (defpackage.lC) r2
            int r3 = r2.v()
            int r2 = r2.R()
            long r2 = defpackage.iTI.R(r3, r2)
            r8.<init>()
            r8.f40R = r9
            r8.f39R = r0
            r8.f41v = r2
            r4 = 1
            r8.R = r4
            r5 = 32
            long r6 = r0 >> r5
            int r6 = (int) r6
            if (r6 < 0) goto L_0x0048
            int r0 = defpackage.dU5.v(r0)
            if (r0 < 0) goto L_0x0048
            long r0 = r2 >> r5
            int r0 = (int) r0
            if (r0 < 0) goto L_0x0048
            int r1 = defpackage.ltH.v(r2)
            if (r1 < 0) goto L_0x0048
            lC r9 = (defpackage.lC) r9
            int r1 = r9.v()
            if (r0 > r1) goto L_0x0048
            int r0 = defpackage.ltH.v(r2)
            int r9 = r9.R()
            if (r0 > r9) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r4 = 0
        L_0x0049:
            if (r4 == 0) goto L_0x0052
            r8.c = r2
            r9 = 1065353216(0x3f800000, float:1.0)
            r8.v = r9
            return
        L_0x0052:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Failed requirement."
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Bj.<init>(aCQ):void");
    }

    @Override // defpackage.jww
    public final void R(float f) {
        this.v = f;
    }

    @Override // defpackage.jww
    public final long c() {
        return iTI.J(this.c);
    }

    @Override // defpackage.jww
    public final void e(fiv fiv) {
        fiv.cE(fiv, this.f40R, this.f39R, this.f41v, iTI.R(mLz.t(nqW.e(fiv.c())), mLz.t(nqW.v(fiv.c()))), this.v, this.f42v, this.R, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bj)) {
            return false;
        }
        Bj bj = (Bj) obj;
        if (!n3x.v(this.f40R, bj.f40R) || !dU5.R(this.f39R, bj.f39R) || !ltH.R(this.f41v, bj.f41v)) {
            return false;
        }
        int i = this.R;
        int i2 = bj.R;
        int i3 = mxC.R;
        return i == i2;
    }

    public final int hashCode() {
        long j = this.f39R;
        int i = dU5.R;
        return Integer.hashCode(this.R) + opT.X(this.f41v, opT.X(j, this.f40R.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder U = opT.U("BitmapPainter(image=");
        U.append(this.f40R);
        U.append(", srcOffset=");
        U.append((Object) dU5.c(this.f39R));
        U.append(", srcSize=");
        U.append((Object) ltH.c(this.f41v));
        U.append(", filterQuality=");
        int i = this.R;
        boolean z = false;
        if (i == 0) {
            str = "None";
        } else {
            if (i == 1) {
                str = "Low";
            } else {
                if (i == 2) {
                    str = "Medium";
                } else {
                    if (i == 3) {
                        z = true;
                    }
                    str = z ? "High" : "Unknown";
                }
            }
        }
        U.append((Object) str);
        U.append(')');
        return U.toString();
    }

    @Override // defpackage.jww
    public final void v(Iw iw) {
        this.f42v = iw;
    }
}
