package defpackage;

/* renamed from: h6T  reason: default package */
/* loaded from: classes.dex */
public final class h6T implements Zs, kES, mij {
    public static final /* synthetic */ int e = 0;
    public final dmk R;

    /* renamed from: R  reason: collision with other field name */
    public hjM f4050R;

    /* renamed from: R  reason: collision with other field name */
    public final jy_ f4051R;

    /* renamed from: R  reason: collision with other field name */
    public ltH f4052R;

    /* renamed from: R  reason: collision with other field name */
    public final nLK f4053R;

    /* renamed from: R  reason: collision with other field name */
    public final ncu f4054R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f4055R = l6.n(null);

    /* renamed from: R  reason: collision with other field name */
    public pd2 f4056R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f4057R;
    public hjM c;
    public hjM v;

    public h6T(jy_ jy_, nLK nlk, dmk dmk, boolean z) {
        this.f4051R = jy_;
        this.f4053R = nlk;
        this.R = dmk;
        this.f4057R = z;
        _0 _0 = new _0(6, this);
        bsy bsy = bwK.R;
        lBz lbz = lBz.Y;
        this.f4054R = g4x.g(g4x.g(this, lbz, new nzF(0, _0)), lbz, new x9(1, this));
    }

    public static float x(float f, float f2, float f3) {
        if ((f >= 0.0f && f2 <= f3) || (f < 0.0f && f2 > f3)) {
            return 0.0f;
        }
        float f4 = f2 - f3;
        return Math.abs(f) < Math.abs(f4) ? f : f4;
    }

    @Override // defpackage.kES
    public final void ZW(long j) {
        hjM hjm;
        gIA gia;
        hjM hjm2 = this.v;
        ltH lth = this.f4052R;
        if (lth != null && !ltH.R(lth.R, j)) {
            boolean z = true;
            if (hjm2 != null && hjm2.p()) {
                long j2 = lth.R;
                if (this.f4053R != nLK.Horizontal ? ltH.v(hjm2.pG()) >= ltH.v(j2) : ((int) (hjm2.pG() >> 32)) >= ((int) (j2 >> 32))) {
                    z = false;
                }
                if (z && (hjm = this.f4050R) != null) {
                    gIA j3 = hjm2.j(hjm, false);
                    if (hjm == this.c) {
                        gia = (gIA) this.f4055R.getValue();
                        if (gia == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                    } else {
                        gia = j3;
                    }
                    if (msU.e(aWo.v, iTI.J(j2)).v(gia)) {
                        gIA c = c(hjm2.pG(), gia);
                        if (!n3x.v(c, gia)) {
                            this.c = hjm;
                            this.f4055R.R(c);
                            l6.z(this.f4051R, hpC.R, 0, new iNm(this, j3, c, null), 2);
                        }
                    }
                }
            }
        }
        this.f4052R = new ltH(j);
    }

    public final gIA c(long j, gIA gia) {
        long J = iTI.J(j);
        int ordinal = this.f4053R.ordinal();
        if (ordinal == 0) {
            return gia.c(0.0f, -x(gia.v, gia.e, nqW.v(J)));
        }
        if (ordinal == 1) {
            return gia.c(-x(gia.f3720R, gia.c, nqW.e(J)), 0.0f);
        }
        throw new j8f((Object) null);
    }

    @Override // defpackage.mij
    public final void j(poS pos) {
        this.v = pos;
    }

    public final Object m(gIA gia, gIA gia2, aOO aoo) {
        float f;
        float f2;
        int ordinal = this.f4053R.ordinal();
        if (ordinal == 0) {
            f = gia2.v;
            f2 = gia.v;
        } else if (ordinal == 1) {
            f = gia2.f3720R;
            f2 = gia.f3720R;
        } else {
            throw new j8f((Object) null);
        }
        float f3 = f - f2;
        if (this.f4057R) {
            f3 = -f3;
        }
        Object obj = gQc.C(this.R, f3, o02.y(0.0f, null, 7), aoo);
        return obj == bGR.COROUTINE_SUSPENDED ? obj : o8s.R;
    }
}
