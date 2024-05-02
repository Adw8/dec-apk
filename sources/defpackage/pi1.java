package defpackage;

/* renamed from: pi1  reason: default package */
/* loaded from: classes.dex */
public final class pi1 extends mjG implements lHr, bpk, oFl, mij {
    public B8 R;

    /* renamed from: R  reason: collision with other field name */
    public c4U f7187R;

    /* renamed from: R  reason: collision with other field name */
    public czM f7189R;

    /* renamed from: R  reason: collision with other field name */
    public dhh f7190R;

    /* renamed from: R  reason: collision with other field name */
    public ivi f7191R;

    /* renamed from: R  reason: collision with other field name */
    public mgi f7192R;

    /* renamed from: R  reason: collision with other field name */
    public mkt f7193R;

    /* renamed from: R  reason: collision with other field name */
    public pi1 f7194R;

    /* renamed from: R  reason: collision with other field name */
    public poS f7195R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7196R;

    /* renamed from: v  reason: collision with other field name */
    public pi1 f7197v;

    /* renamed from: R  reason: collision with other field name */
    public final biT f7186R = new biT(new pi1[16]);

    /* renamed from: R  reason: collision with other field name */
    public final cX2 f7188R = new cX2();
    public final biT v = new biT(new czM[16]);

    public pi1() {
        mgi mgi = mgi.Inactive;
        this.f7192R = mgi;
    }

    @Override // defpackage.lHr
    public final void P(bS6 bs6) {
        biT bit;
        biT bit2;
        int ordinal;
        poS pos;
        fue fue;
        gzG gzg;
        cjR focusManager;
        pi1 pi1 = (pi1) bs6.v(ofC.R);
        if (!n3x.v(pi1, this.f7194R)) {
            if (pi1 == null && !(((ordinal = this.f7192R.ordinal()) != 0 && ordinal != 2) || (pos = this.f7195R) == null || (fue = pos.f7272R) == null || (gzg = fue.f3595R) == null || (focusManager = gzg.getFocusManager()) == null)) {
                ((o3Z) focusManager).R(true);
            }
            pi1 pi12 = this.f7194R;
            if (!(pi12 == null || (bit2 = pi12.f7186R) == null)) {
                bit2.U(this);
            }
            if (!(pi1 == null || (bit = pi1.f7186R) == null)) {
                bit.v(this);
            }
        }
        this.f7194R = pi1;
        dhh dhh = (dhh) bs6.v(jq5.R);
        if (!n3x.v(dhh, this.f7190R)) {
            dhh dhh2 = this.f7190R;
            if (dhh2 != null) {
                dhh2.H(this);
            }
            if (dhh != null) {
                dhh.c(this);
            }
        }
        this.f7190R = dhh;
        mkt mkt = (mkt) bs6.v(o2k.R);
        if (!n3x.v(mkt, this.f7193R)) {
            mkt mkt2 = this.f7193R;
            if (mkt2 != null) {
                mkt2.H(this);
            }
            if (mkt != null) {
                mkt.c(this);
            }
        }
        this.f7193R = mkt;
        this.f7191R = (ivi) bs6.v(eD_.R);
        this.R = (B8) bs6.v(hV.R);
        this.f7189R = (czM) bs6.v(khu.R);
        this.f7187R = (c4U) bs6.v(hcI.R);
        hcI.R(this);
    }

    public final void U(mgi mgi) {
        this.f7192R = mgi;
        dhh dhh = this.f7190R;
        if (dhh != null) {
            dhh.x();
        }
    }

    @Override // defpackage.bpk
    public final Object getValue() {
        return this;
    }

    @Override // defpackage.oFl
    public final boolean isValid() {
        return this.f7194R != null;
    }

    @Override // defpackage.mij
    public final void j(poS pos) {
        boolean z = this.f7195R == null;
        this.f7195R = pos;
        if (z) {
            hcI.R(this);
        }
        if (this.f7196R) {
            this.f7196R = false;
            msU.cE(this);
        }
    }

    @Override // defpackage.bpk
    public final bsy r() {
        return ofC.R;
    }
}
