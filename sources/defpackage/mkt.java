package defpackage;

/* renamed from: mkt  reason: default package */
/* loaded from: classes.dex */
public final class mkt implements lHr, bpk {
    public final biT R = new biT(new pi1[16]);

    /* renamed from: R  reason: collision with other field name */
    public mkt f6148R;

    public mkt(jzQ jzq) {
        jzq.f5170R.v(this);
    }

    public final void H(pi1 pi1) {
        this.R.U(pi1);
        mkt mkt = this.f6148R;
        if (mkt != null) {
            mkt.H(pi1);
        }
    }

    @Override // defpackage.lHr
    public final void P(bS6 bs6) {
        mkt mkt = (mkt) bs6.v(o2k.R);
        if (!n3x.v(mkt, this.f6148R)) {
            mkt mkt2 = this.f6148R;
            if (mkt2 != null) {
                mkt2.U(this.R);
            }
            if (mkt != null) {
                mkt.m(this.R);
            }
            this.f6148R = mkt;
        }
    }

    public final void U(biT bit) {
        this.R.C(bit);
        mkt mkt = this.f6148R;
        if (mkt != null) {
            mkt.U(bit);
        }
    }

    public final void c(pi1 pi1) {
        this.R.v(pi1);
        mkt mkt = this.f6148R;
        if (mkt != null) {
            mkt.c(pi1);
        }
    }

    @Override // defpackage.bpk
    public final Object getValue() {
        return this;
    }

    public final void m(biT bit) {
        biT bit2 = this.R;
        bit2.c(bit2.e, bit);
        mkt mkt = this.f6148R;
        if (mkt != null) {
            mkt.m(bit);
        }
    }

    @Override // defpackage.bpk
    public final bsy r() {
        return o2k.R;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r6.indexOf(r4) < r6.indexOf(r5)) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.pi1 x() {
        /*
            r8 = this;
            biT r8 = r8.R
            int r0 = r8.e
            r1 = 0
            if (r0 <= 0) goto L_0x0067
            r2 = 0
            java.lang.Object[] r8 = r8.f1772R
        L_0x000a:
            r3 = r8[r2]
            pi1 r3 = (defpackage.pi1) r3
            if (r1 == 0) goto L_0x0062
            poS r4 = r1.f7195R
            if (r4 == 0) goto L_0x0062
            fue r4 = r4.f7272R
            if (r4 != 0) goto L_0x0019
            goto L_0x0062
        L_0x0019:
            poS r5 = r3.f7195R
            if (r5 == 0) goto L_0x0063
            fue r5 = r5.f7272R
            if (r5 != 0) goto L_0x0022
            goto L_0x0063
        L_0x0022:
            int r6 = r4.O
            int r7 = r5.O
            if (r6 <= r7) goto L_0x002d
            fue r4 = r4.N()
            goto L_0x0022
        L_0x002d:
            int r6 = r5.O
            int r7 = r4.O
            if (r6 <= r7) goto L_0x0038
            fue r5 = r5.N()
            goto L_0x002d
        L_0x0038:
            fue r6 = r4.N()
            fue r7 = r5.N()
            boolean r6 = defpackage.n3x.v(r6, r7)
            if (r6 != 0) goto L_0x004f
            fue r4 = r4.N()
            fue r5 = r5.N()
            goto L_0x0038
        L_0x004f:
            fue r6 = r4.N()
            java.util.List r6 = r6.H()
            int r4 = r6.indexOf(r4)
            int r5 = r6.indexOf(r5)
            if (r4 >= r5) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r1 = r3
        L_0x0063:
            int r2 = r2 + 1
            if (r2 < r0) goto L_0x000a
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkt.x():pi1");
    }
}
