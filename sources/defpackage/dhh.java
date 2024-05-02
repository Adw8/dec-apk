package defpackage;

/* renamed from: dhh  reason: default package */
/* loaded from: classes.dex */
public final class dhh implements bpk, lHr {

    /* renamed from: R  reason: collision with other field name */
    public dhh f2827R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f2828R;
    public final biT R = new biT(new dhh[16]);
    public final biT v = new biT(new pi1[16]);

    public dhh(kg9 kg9) {
        this.f2828R = kg9;
    }

    public final void H(pi1 pi1) {
        this.v.U(pi1);
        dhh dhh = this.f2827R;
        if (dhh != null) {
            dhh.H(pi1);
        }
    }

    @Override // defpackage.lHr
    public final void P(bS6 bs6) {
        bsy bsy = jq5.R;
        dhh dhh = (dhh) bs6.v(bsy);
        if (!n3x.v(dhh, this.f2827R)) {
            dhh dhh2 = this.f2827R;
            if (dhh2 != null) {
                dhh2.R.U(this);
                dhh2.U(this.v);
            }
            this.f2827R = dhh;
            if (dhh != null) {
                dhh.R.v(this);
                dhh.m(this.v);
            }
        }
        this.f2827R = (dhh) bs6.v(bsy);
    }

    public final void U(biT bit) {
        this.v.C(bit);
        dhh dhh = this.f2827R;
        if (dhh != null) {
            dhh.U(bit);
        }
    }

    public final void c(pi1 pi1) {
        this.v.v(pi1);
        dhh dhh = this.f2827R;
        if (dhh != null) {
            dhh.c(pi1);
        }
    }

    @Override // defpackage.bpk
    public final Object getValue() {
        return this;
    }

    public final void m(biT bit) {
        biT bit2 = this.v;
        bit2.c(bit2.e, bit);
        dhh dhh = this.f2827R;
        if (dhh != null) {
            dhh.m(bit);
        }
    }

    @Override // defpackage.bpk
    public final bsy r() {
        return jq5.R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Boolean] */
    public final void x() {
        pi1 pi1;
        mgi mgi;
        pi1 pi12;
        mgi mgi2 = mgi.Inactive;
        biT bit = this.v;
        int i = bit.e;
        if (i != 0) {
            int i2 = 0;
            if (i != 1) {
                pi1 pi13 = null;
                if (i > 0) {
                    Object[] objArr = bit.f1772R;
                    pi1 pi14 = null;
                    do {
                        pi1 pi15 = (pi1) objArr[i2];
                        int ordinal = pi15.f7192R.ordinal();
                        if (!(ordinal == 0 || ordinal == 1 || ordinal == 2)) {
                            pi12 = pi13;
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    pi12 = pi13;
                                    if (ordinal == 5) {
                                        pi12 = Boolean.FALSE;
                                    }
                                }
                            } else if (pi13 == null) {
                                pi12 = Boolean.TRUE;
                            }
                            i2++;
                            pi13 = pi12;
                        }
                        pi14 = pi15;
                        pi12 = Boolean.FALSE;
                        i2++;
                        pi13 = pi12;
                    } while (i2 < i);
                    pi1 = pi12;
                    pi13 = pi14;
                } else {
                    pi1 = null;
                }
                if (pi13 != null && (mgi = pi13.f7192R) != null) {
                    mgi2 = mgi;
                } else if (n3x.v(pi1, Boolean.TRUE)) {
                    mgi2 = mgi.Deactivated;
                }
            } else {
                mgi2 = ((pi1) bit.f1772R[0]).f7192R;
            }
        }
        this.f2828R.x(mgi2);
        dhh dhh = this.f2827R;
        if (dhh != null) {
            dhh.x();
        }
    }
}
