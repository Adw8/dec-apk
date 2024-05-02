package defpackage;

/* renamed from: l_W  reason: default package */
/* loaded from: classes.dex */
public final class l_W extends poS {
    public static final gw R;

    /* renamed from: R  reason: collision with other field name */
    public hYk f5778R;

    /* renamed from: R  reason: collision with other field name */
    public mGu f5779R;

    static {
        gw gwVar = new gw();
        gwVar.X(n3.e);
        gwVar.f3991R.setStrokeWidth(1.0f);
        gwVar.x(1);
        R = gwVar;
    }

    public l_W(fue fue, mGu mgu) {
        super(fue);
        this.f5779R = mgu;
        this.f5778R = (!((((j28) mgu).R.e & 512) != 0) || !(mgu instanceof hYk)) ? null : (hYk) mgu;
    }

    @Override // defpackage.poS, defpackage.l0f
    public final void KZ(long j, float f, kg9 kg9) {
        super.KZ(j, f, kg9);
        if (!((emQ) this).R) {
            sS();
            mdz mdz = ((poS) this).f7272R.f3603R;
            int i = h57.R;
            mdz mdz2 = h57.f4042R;
            h57.R = (int) (((l0f) this).R >> 32);
            h57.f4042R = mdz;
            boolean x = gHI.x(this);
            c0().Z();
            ((emQ) this).v = x;
            h57.R = i;
            h57.f4042R = mdz2;
        }
    }

    @Override // defpackage.pc0
    public final l0f L(long j) {
        np(j);
        mGu mgu = this.f5779R;
        LE(((gl4) ((e7) mgu).R).e(this, ((poS) this).f7280R, j));
        lYW lyw = ((poS) this).f7276R;
        if (lyw != null) {
            lyw.m(((l0f) this).R);
        }
        tP();
        return this;
    }

    @Override // defpackage.emQ
    public final int PN(XI xi) {
        otO oto = ((poS) this).f7279R;
        if (oto == null) {
            return msU.H(this, xi);
        }
        Integer num = (Integer) oto.v.get(xi);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.poS
    public final void R2(Gp gp) {
        ((poS) this).f7280R.rz(gp);
        if (msU.Kl(((poS) this).f7272R).getShowLayoutBounds()) {
            tR(gp, R);
        }
    }

    @Override // defpackage.poS
    public final otO WF(h89 h89) {
        hYk hyk = this.f5778R;
        return hyk != null ? new heR(this, h89, hyk) : new icJ(this, h89);
    }

    @Override // defpackage.cxM
    public final int Z(int i) {
        mGu mgu = this.f5779R;
        return ((gl4) ((e7) mgu).R).L(this, ((poS) this).f7280R, i);
    }

    @Override // defpackage.cxM
    public final int ZW(int i) {
        return ((e7) this.f5779R).x(this, ((poS) this).f7280R, i);
    }

    @Override // defpackage.poS
    public final j28 ax() {
        return ((j28) this.f5779R).R;
    }

    @Override // defpackage.cxM
    public final int k(int i) {
        mGu mgu = this.f5779R;
        return ((gl4) ((e7) mgu).R).R(this, ((poS) this).f7280R, i);
    }

    @Override // defpackage.poS
    public final void q_() {
        super.q_();
        mGu mgu = this.f5779R;
        if (!((((j28) mgu).R.e & 512) != 0) || !(mgu instanceof hYk)) {
            this.f5778R = null;
            otO oto = ((poS) this).f7279R;
            if (oto != null) {
                ((poS) this).f7279R = new icJ(this, oto.R);
                return;
            }
            return;
        }
        hYk hyk = (hYk) mgu;
        this.f5778R = hyk;
        otO oto2 = ((poS) this).f7279R;
        if (oto2 != null) {
            ((poS) this).f7279R = new heR(this, oto2.R, hyk);
        }
    }

    @Override // defpackage.cxM
    public final int zw(int i) {
        return ((e7) this.f5779R).m(this, ((poS) this).f7280R, i);
    }
}
