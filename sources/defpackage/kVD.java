package defpackage;

/* renamed from: kVD  reason: default package */
/* loaded from: classes.dex */
public final class kVD {

    /* renamed from: R  reason: collision with other field name */
    public final biT f5314R = new biT(new ija[16]);

    /* renamed from: R  reason: collision with other field name */
    public final oST f5315R = l6.n(Boolean.FALSE);
    public long R = Long.MIN_VALUE;
    public final oST v = l6.n(Boolean.TRUE);

    public final void R(m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(2102343854);
        if (((Boolean) this.v.getValue()).booleanValue() || ((Boolean) this.f5315R.getValue()).booleanValue()) {
            caw.e(this, new eyz(this, null), jr_);
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new m2w(i, 0, this);
        }
    }
}
