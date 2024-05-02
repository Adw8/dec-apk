package defpackage;

/* renamed from: mC9  reason: default package */
/* loaded from: classes.dex */
public final class mC9 extends oGu {
    public final _0 R = new _0(1, this);

    /* renamed from: R  reason: collision with other field name */
    public final aGK f5977R;

    /* renamed from: R  reason: collision with other field name */
    public final dH9 f5978R;

    /* renamed from: R  reason: collision with other field name */
    public mz f5979R;
    public final dH9 c;
    public final aGK v;

    /* renamed from: v  reason: collision with other field name */
    public final dH9 f5980v;

    public mC9(aGK agk, aGK agk2, dH9 dh9, dH9 dh92, h0T h0t) {
        this.f5977R = agk;
        this.v = agk2;
        this.f5978R = dh9;
        this.f5980v = dh92;
        this.c = h0t;
    }

    @Override // defpackage.gl4
    public final mET e(mZf mzf, pc0 pc0, long j) {
        l0f L = pc0.L(j);
        long R = iTI.R(L.e, L.X);
        long j2 = ((ltH) this.f5977R.R(this.R, new cGe(this, R, 0)).getValue()).R;
        long j3 = ((dU5) this.v.R(a0.m, new cGe(this, R, 1)).getValue()).f2628R;
        mz mzVar = this.f5979R;
        dU5 du5 = mzVar == null ? null : new dU5(((Y6) mzVar).R(R, j2, mdz.Ltr));
        return mzf.f((int) (j2 >> 32), ltH.v(j2), iia.R, new jcX(L, du5 == null ? dU5.v : du5.f2628R, j3));
    }
}
