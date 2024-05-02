package defpackage;

/* renamed from: dOC  reason: default package */
/* loaded from: classes.dex */
public final class dOC implements i_c {
    public final /* synthetic */ dH9 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f2590R;

    public dOC(h0T h0t, boolean z) {
        this.R = h0t;
        this.f2590R = z;
    }

    @Override // defpackage.i_c
    public final long H(int i, long j, long j2) {
        if (!this.f2590R) {
            return aWo.v;
        }
        bs4 bs4 = (bs4) this.R.getValue();
        if (bs4.f1827R.c()) {
            return aWo.v;
        }
        dmk dmk = bs4.f1827R;
        float e = bs4.e(j2);
        if (bs4.f1831R) {
            e *= (float) -1;
        }
        float e2 = dmk.e(e);
        if (bs4.f1831R) {
            e2 *= (float) -1;
        }
        return bs4.X(e2);
    }

    @Override // defpackage.i_c
    public final long c(long j, int i) {
        if (i == 2) {
            ((bs4) this.R.getValue()).f1830R.R(Boolean.TRUE);
        }
        return aWo.v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    @Override // defpackage.i_c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(long r3, long r5, defpackage.aOO r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof defpackage.gz2
            if (r3 == 0) goto L_0x0013
            r3 = r7
            gz2 r3 = (defpackage.gz2) r3
            int r4 = r3.e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L_0x0013
            int r4 = r4 - r0
            r3.e = r4
            goto L_0x0018
        L_0x0013:
            gz2 r3 = new gz2
            r3.<init>(r2, r7)
        L_0x0018:
            java.lang.Object r4 = r3.f4008R
            bGR r7 = defpackage.bGR.COROUTINE_SUSPENDED
            int r0 = r3.e
            r1 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r1) goto L_0x002b
            long r5 = r3.R
            dOC r2 = r3.f4007R
            defpackage.jjU.o(r4)
            goto L_0x004f
        L_0x002b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L_0x0033:
            defpackage.jjU.o(r4)
            boolean r4 = r2.f2590R
            if (r4 == 0) goto L_0x0058
            dH9 r4 = r2.R
            java.lang.Object r4 = r4.getValue()
            bs4 r4 = (defpackage.bs4) r4
            r3.f4007R = r2
            r3.R = r5
            r3.e = r1
            java.lang.Object r4 = r4.v(r5, r3)
            if (r4 != r7) goto L_0x004f
            return r7
        L_0x004f:
            d_E r4 = (defpackage.d_E) r4
            long r3 = r4.f2672R
            long r3 = defpackage.d_E.e(r5, r3)
            goto L_0x005a
        L_0x0058:
            long r3 = defpackage.d_E.v
        L_0x005a:
            d_E r5 = new d_E
            r5.<init>(r3)
            dH9 r2 = r2.R
            java.lang.Object r2 = r2.getValue()
            bs4 r2 = (defpackage.bs4) r2
            oST r2 = r2.f1830R
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.R(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dOC.m(long, long, aOO):java.lang.Object");
    }
}
