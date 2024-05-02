package defpackage;

/* renamed from: jP7  reason: default package */
/* loaded from: classes.dex */
public final class jP7 extends poS {
    public static final gw R;

    /* renamed from: R  reason: collision with other field name */
    public final mDL f4923R;

    static {
        gw gwVar = new gw();
        gwVar.X(n3.c);
        gwVar.f3991R.setStrokeWidth(1.0f);
        gwVar.x(1);
        R = gwVar;
    }

    public jP7(fue fue) {
        super(fue);
        mDL mdl = new mDL(0);
        this.f4923R = mdl;
        ((j28) mdl).f4791R = this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.poS
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EZ(defpackage.bTI r20, long r21, defpackage.pfJ r23, boolean r24, boolean r25) {
        /*
        // Method dump skipped, instructions count: 336
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jP7.EZ(bTI, long, pfJ, boolean, boolean):void");
    }

    @Override // defpackage.poS, defpackage.l0f
    public final void KZ(long j, float f, kg9 kg9) {
        super.KZ(j, f, kg9);
        if (!((emQ) this).R) {
            sS();
            fue fue = ((poS) this).f7272R;
            fue N = fue.N();
            float f2 = ((poS) fue.f3600R.f4974R).f7283v;
            poS C = fue.C();
            jP7 jp7 = fue.f3600R.f4974R;
            while (C != jp7) {
                l_W l_w = (l_W) C;
                f2 += ((poS) l_w).f7283v;
                C = ((poS) l_w).f7280R;
            }
            boolean z = false;
            if (!(f2 == fue.f3590R)) {
                fue.f3590R = f2;
                if (N != null) {
                    N.n();
                }
                if (N != null) {
                    N.t();
                }
            }
            if (!fue.f3608X) {
                if (N != null) {
                    N.t();
                }
                fue.h();
            }
            if (N == null) {
                fue.L = 0;
            } else if (!fue.f3611m && N.f3606R.R == 3) {
                if (fue.L == Integer.MAX_VALUE) {
                    z = true;
                }
                if (z) {
                    int i = N.m;
                    fue.L = i;
                    N.m = i + 1;
                } else {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
            }
            fue.f3606R.f7296R.F();
        }
    }

    @Override // defpackage.pc0
    public final l0f L(long j) {
        np(j);
        biT j2 = ((poS) this).f7272R.j();
        int i = j2.e;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = j2.f1772R;
            do {
                ((fue) objArr[i2]).x = 3;
                i2++;
            } while (i2 < i);
            fue fue = ((poS) this).f7272R;
            LE(fue.f3591R.v(this, fue.x(), j));
            tP();
            return this;
        }
        fue fue = ((poS) this).f7272R;
        LE(fue.f3591R.v(this, fue.x(), j));
        tP();
        return this;
    }

    @Override // defpackage.emQ
    public final int PN(XI xi) {
        otO oto = ((poS) this).f7279R;
        if (oto != null) {
            return oto.PN(xi);
        }
        cRM crm = ((poS) this).f7272R.f3606R.f7296R;
        if (!crm.f2096c) {
            pso pso = crm.f2094R;
            if (pso.R == 1) {
                k5m k5m = crm.f2092R;
                k5m.X = true;
                if (((lt) k5m).f5851R) {
                    pso.f7300v = true;
                    pso.c = true;
                }
            } else {
                crm.f2092R.O = true;
            }
        }
        ((emQ) crm.i()).v = true;
        crm.F();
        ((emQ) crm.i()).v = false;
        Integer num = (Integer) ((lt) crm.f2092R).R.get(xi);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.poS
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R2(defpackage.Gp r7) {
        /*
            r6 = this;
            fue r0 = r6.f7272R
            gzG r0 = defpackage.msU.Kl(r0)
            fue r1 = r6.f7272R
            biT r1 = r1.P()
            int r2 = r1.e
            if (r2 <= 0) goto L_0x0022
            r3 = 0
            java.lang.Object[] r1 = r1.f1772R
        L_0x0013:
            r4 = r1[r3]
            fue r4 = (defpackage.fue) r4
            boolean r5 = r4.f3608X
            if (r5 == 0) goto L_0x001e
            r4.Z(r7)
        L_0x001e:
            int r3 = r3 + 1
            if (r3 < r2) goto L_0x0013
        L_0x0022:
            boolean r0 = r0.getShowLayoutBounds()
            if (r0 == 0) goto L_0x002d
            gw r0 = defpackage.jP7.R
            r6.tR(r7, r0)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jP7.R2(Gp):void");
    }

    @Override // defpackage.poS
    public final otO WF(h89 h89) {
        return new icJ(this, h89);
    }

    @Override // defpackage.cxM
    public final int Z(int i) {
        i6M i6m = ((poS) this).f7272R.f3598R;
        return i6m.R().e(i6m.R.C(), i6m.R.x(), i);
    }

    @Override // defpackage.cxM
    public final int ZW(int i) {
        i6M i6m = ((poS) this).f7272R.f3598R;
        return i6m.R().X(i6m.R.C(), i6m.R.x(), i);
    }

    @Override // defpackage.poS
    public final j28 ax() {
        return this.f4923R;
    }

    @Override // defpackage.cxM
    public final int k(int i) {
        i6M i6m = ((poS) this).f7272R.f3598R;
        return i6m.R().c(i6m.R.C(), i6m.R.x(), i);
    }

    @Override // defpackage.cxM
    public final int zw(int i) {
        i6M i6m = ((poS) this).f7272R.f3598R;
        return i6m.R().R(i6m.R.C(), i6m.R.x(), i);
    }
}
