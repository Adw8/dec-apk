package defpackage;

/* renamed from: geT  reason: default package */
/* loaded from: classes.dex */
public final class geT extends oGu {
    public final _0 R = new _0(2, this);

    /* renamed from: R  reason: collision with other field name */
    public final aGK f3832R;

    /* renamed from: R  reason: collision with other field name */
    public final dH9 f3833R;
    public final dH9 v;

    public geT(aGK agk, dH9 dh9, dH9 dh92) {
        this.f3832R = agk;
        this.f3833R = dh9;
        this.v = dh92;
    }

    @Override // defpackage.gl4
    public final mET e(mZf mzf, pc0 pc0, long j) {
        l0f L = pc0.L(j);
        long R = iTI.R(L.e, L.X);
        return mzf.f(L.e, L.X, iia.R, new jGU(this, L, R));
    }
}
