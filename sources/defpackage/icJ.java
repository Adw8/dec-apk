package defpackage;

/* renamed from: icJ  reason: default package */
/* loaded from: classes.dex */
public final class icJ extends otO {
    public final /* synthetic */ int O = 0;
    public final /* synthetic */ poS v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public icJ(jP7 jp7, h89 h89) {
        super(jp7, h89);
        this.v = jp7;
    }

    @Override // defpackage.pc0
    public final l0f L(long j) {
        switch (this.O) {
            case 0:
                np(j);
                biT j2 = ((otO) this).f7012R.f7272R.j();
                int i = j2.e;
                if (i > 0) {
                    int i2 = 0;
                    Object[] objArr = j2.f1772R;
                    do {
                        ((fue) objArr[i2]).H = 3;
                        i2++;
                    } while (i2 < i);
                    fue fue = ((otO) this).f7012R.f7272R;
                    otO.S9(this, fue.f3591R.v(this, fue.m(), j));
                    return this;
                }
                fue fue = ((otO) this).f7012R.f7272R;
                otO.S9(this, fue.f3591R.v(this, fue.m(), j));
                return this;
            default:
                l_W l_w = (l_W) this.v;
                np(j);
                mGu mgu = l_w.f5779R;
                otO.S9(this, ((gl4) ((e7) mgu).R).e(this, ((poS) l_w).f7280R.f7279R, j));
                return this;
        }
    }

    @Override // defpackage.emQ
    public final int PN(XI xi) {
        switch (this.O) {
            case 0:
                lGL lgl = ((otO) this).f7012R.f7272R.f3606R.f7298R;
                if (!lgl.f5633R) {
                    pso pso = lgl.f5632R;
                    if (pso.R == 2) {
                        k5m k5m = lgl.f5630R;
                        k5m.X = true;
                        if (((lt) k5m).f5851R) {
                            pso.X = true;
                            pso.O = true;
                        }
                    } else {
                        lgl.f5630R.O = true;
                    }
                }
                otO oto = ((poS) lgl.i()).f7279R;
                if (oto != null) {
                    ((emQ) oto).v = true;
                }
                lgl.F();
                otO oto2 = ((poS) lgl.i()).f7279R;
                if (oto2 != null) {
                    ((emQ) oto2).v = false;
                }
                Integer num = (Integer) ((lt) lgl.f5630R).R.get(xi);
                int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
                ((otO) this).v.put(xi, Integer.valueOf(intValue));
                return intValue;
            default:
                int H = msU.H(this, xi);
                ((otO) this).v.put(xi, Integer.valueOf(H));
                return H;
        }
    }

    @Override // defpackage.otO, defpackage.cxM
    public final int Z(int i) {
        switch (this.O) {
            case 0:
                i6M i6m = ((otO) this).f7012R.f7272R.f3598R;
                return i6m.R().e(i6m.R.C(), i6m.R.m(), i);
            default:
                l_W l_w = (l_W) this.v;
                mGu mgu = l_w.f5779R;
                return ((gl4) ((e7) mgu).R).L(this, ((poS) l_w).f7280R.f7279R, i);
        }
    }

    @Override // defpackage.otO, defpackage.cxM
    public final int ZW(int i) {
        switch (this.O) {
            case 0:
                i6M i6m = ((otO) this).f7012R.f7272R.f3598R;
                return i6m.R().X(i6m.R.C(), i6m.R.m(), i);
            default:
                l_W l_w = (l_W) this.v;
                return ((e7) l_w.f5779R).x(this, ((poS) l_w).f7280R.f7279R, i);
        }
    }

    @Override // defpackage.otO
    public final void aS() {
        switch (this.O) {
            case 0:
                lGL lgl = ((otO) this).f7012R.f7272R.f3606R.f7298R;
                if (!lgl.f5634c) {
                    lgl.f5634c = true;
                    if (!lgl.e) {
                        lgl.zE();
                    }
                }
                ((otO) this).f7012R.f7272R.f3606R.f7298R.F();
                return;
            default:
                super.aS();
                return;
        }
    }

    @Override // defpackage.otO, defpackage.cxM
    public final int k(int i) {
        switch (this.O) {
            case 0:
                i6M i6m = ((otO) this).f7012R.f7272R.f3598R;
                return i6m.R().c(i6m.R.C(), i6m.R.m(), i);
            default:
                l_W l_w = (l_W) this.v;
                mGu mgu = l_w.f5779R;
                return ((gl4) ((e7) mgu).R).R(this, ((poS) l_w).f7280R.f7279R, i);
        }
    }

    @Override // defpackage.otO, defpackage.cxM
    public final int zw(int i) {
        switch (this.O) {
            case 0:
                i6M i6m = ((otO) this).f7012R.f7272R.f3598R;
                return i6m.R().R(i6m.R.C(), i6m.R.m(), i);
            default:
                l_W l_w = (l_W) this.v;
                return ((e7) l_w.f5779R).m(this, ((poS) l_w).f7280R.f7279R, i);
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public icJ(l_W l_w, h89 h89) {
        super(l_w, h89);
        this.v = l_w;
    }
}
