package defpackage;

/* renamed from: ngP  reason: default package */
/* loaded from: classes.dex */
public final class ngP extends mjG implements gl4, lHr, bpk {
    public final iUy R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f6508R;
    public final oST v;

    public ngP(iUy iuy, kg9 kg9) {
        this.R = iuy;
        this.f6508R = l6.n(iuy);
        this.v = l6.n(iuy);
    }

    @Override // defpackage.lHr
    public final void P(bS6 bs6) {
        iUy iuy = (iUy) bs6.v(ea_.R);
        this.f6508R.R(new gnI(this.R, iuy));
        this.v.R(new pwr(iuy, this.R));
    }

    @Override // defpackage.gl4
    public final mET e(mZf mzf, pc0 pc0, long j) {
        int R = ((iUy) this.f6508R.getValue()).R(mzf, mzf.getLayoutDirection());
        int e = ((iUy) this.f6508R.getValue()).e(mzf);
        int v = ((iUy) this.f6508R.getValue()).v(mzf, mzf.getLayoutDirection()) + R;
        int c = ((iUy) this.f6508R.getValue()).c(mzf) + e;
        l0f L = pc0.L(dtx.K(-v, -c, j));
        return mzf.f(dtx.x(j, L.e + v), dtx.m(j, L.X + c), iia.R, new aOi(L, R, e));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngP)) {
            return false;
        }
        return n3x.v(((ngP) obj).R, this.R);
    }

    @Override // defpackage.bpk
    public final Object getValue() {
        return (iUy) this.v.getValue();
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    @Override // defpackage.bpk
    public final bsy r() {
        return ea_.R;
    }

    public /* synthetic */ ngP(y3 y3Var) {
        this(y3Var, lBz.Y);
    }
}
