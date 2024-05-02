package defpackage;

/* renamed from: idZ  reason: default package */
/* loaded from: classes.dex */
public final class idZ extends jww {
    public fJK R;

    /* renamed from: R  reason: collision with other field name */
    public final m2X f4677R;

    /* renamed from: v  reason: collision with other field name */
    public Iw f4679v;

    /* renamed from: R  reason: collision with other field name */
    public final oST f4678R = l6.n(new nqW(nqW.v));

    /* renamed from: v  reason: collision with other field name */
    public final oST f4680v = l6.n(Boolean.FALSE);
    public final oST c = l6.n(Boolean.TRUE);
    public float v = 1.0f;

    public idZ() {
        m2X m2x = new m2X();
        m2x.f5896v = new q4(8, this);
        this.f4677R = m2x;
    }

    @Override // defpackage.jww
    public final void R(float f) {
        this.v = f;
    }

    public final void X(String str, float f, float f2, bBk bbk, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(1264894527);
        m2X m2x = this.f4677R;
        jnu jnu = m2x.f5893R;
        jnu.f5019R = str;
        jnu.c();
        boolean z = false;
        if (!(m2x.R == f)) {
            m2x.R = f;
            m2x.f5895R = true;
            m2x.f5896v.g();
        }
        if (m2x.v == f2) {
            z = true;
        }
        if (!z) {
            m2x.v = f2;
            m2x.f5895R = true;
            m2x.f5896v.g();
        }
        ngM W = l6.W(jr_);
        fJK fjk = this.R;
        if (fjk == null || fjk.c()) {
            hBj hbj = new hBj(this.f4677R.f5893R);
            Object obj = aEl.R;
            fjk = new hAe(W, hbj);
        }
        this.R = fjk;
        fjk.v(aH9.u(new azM(bbk, 7, this), true, -1916507005));
        caw.v(fjk, new _0(27, fjk), jr_);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new mGW(this, str, f, f2, bbk, i);
        }
    }

    @Override // defpackage.jww
    public final long c() {
        return ((nqW) this.f4678R.getValue()).f6610R;
    }

    @Override // defpackage.jww
    public final void e(fiv fiv) {
        m2X m2x = this.f4677R;
        Iw iw = this.f4679v;
        if (iw == null) {
            iw = (Iw) m2x.f5894R.getValue();
        }
        if (!((Boolean) this.f4680v.getValue()).booleanValue() || fiv.getLayoutDirection() != mdz.Rtl) {
            m2x.X(fiv, this.v, iw);
        } else {
            long u = fiv.u();
            JF G = fiv.G();
            long v = G.v();
            G.R().y();
            G.f201R.c(u);
            m2x.X(fiv, this.v, iw);
            G.R().j();
            G.c(v);
        }
        if (((Boolean) this.c.getValue()).booleanValue()) {
            this.c.R(Boolean.FALSE);
        }
    }

    @Override // defpackage.jww
    public final void v(Iw iw) {
        this.f4679v = iw;
    }
}
