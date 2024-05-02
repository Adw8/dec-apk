package defpackage;

/* renamed from: mjp  reason: default package */
/* loaded from: classes.dex */
public final class mjp {
    public hjM R;

    /* renamed from: R  reason: collision with other field name */
    public final iRR f6140R;
    public hjM v;

    public mjp(iRR irr) {
        this.f6140R = irr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r2 == null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long R(long r4) {
        /*
            r3 = this;
            hjM r0 = r3.R
            if (r0 == 0) goto L_0x0019
            boolean r1 = r0.p()
            r2 = 0
            if (r1 == 0) goto L_0x0015
            hjM r3 = r3.v
            if (r3 == 0) goto L_0x0017
            r1 = 1
            gIA r2 = r3.j(r0, r1)
            goto L_0x0017
        L_0x0015:
            gIA r2 = defpackage.gIA.R
        L_0x0017:
            if (r2 != 0) goto L_0x001b
        L_0x0019:
            gIA r2 = defpackage.gIA.R
        L_0x001b:
            float r3 = defpackage.aWo.e(r4)
            float r0 = r2.f3720R
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L_0x0026
            goto L_0x0035
        L_0x0026:
            float r3 = defpackage.aWo.e(r4)
            float r0 = r2.c
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0031
            goto L_0x0035
        L_0x0031:
            float r0 = defpackage.aWo.e(r4)
        L_0x0035:
            float r3 = defpackage.aWo.X(r4)
            float r1 = r2.v
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x0040
            goto L_0x004f
        L_0x0040:
            float r3 = defpackage.aWo.X(r4)
            float r1 = r2.e
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x004b
            goto L_0x004f
        L_0x004b:
            float r1 = defpackage.aWo.X(r4)
        L_0x004f:
            long r3 = defpackage.aH9.N(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mjp.R(long):long");
    }

    public final long c(long j) {
        aWo awo;
        hjM hjm = this.R;
        if (hjm == null) {
            return j;
        }
        hjM hjm2 = this.v;
        if (hjm2 != null) {
            awo = new aWo((!hjm.p() || !hjm2.p()) ? j : hjm.Y(hjm2, j));
        } else {
            awo = null;
        }
        return awo != null ? awo.f906R : j;
    }

    public final int v(long j, boolean z) {
        if (z) {
            j = R(j);
        }
        return this.f6140R.U(c(j));
    }
}
