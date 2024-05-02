package defpackage;

/* renamed from: lUf  reason: default package */
/* loaded from: classes.dex */
public final class lUf extends mjG implements gl4 {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final dH9 f5755R;
    public final dH9 v;

    public lUf(float f, oST ost, oST ost2, int i) {
        ost = (i & 4) != 0 ? null : ost;
        ost2 = (i & 8) != 0 ? null : ost2;
        this.R = f;
        this.f5755R = ost;
        this.v = ost2;
    }

    @Override // defpackage.gl4
    public final mET e(mZf mzf, pc0 pc0, long j) {
        dH9 dh9 = this.f5755R;
        int t = (dh9 == null || ((Number) dh9.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : mLz.t(((Number) this.f5755R.getValue()).floatValue() * this.R);
        dH9 dh92 = this.v;
        int t2 = (dh92 == null || ((Number) dh92.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : mLz.t(((Number) this.v.getValue()).floatValue() * this.R);
        int x = t != Integer.MAX_VALUE ? t : oys.x(j);
        int m = t2 != Integer.MAX_VALUE ? t2 : oys.m(j);
        if (t == Integer.MAX_VALUE) {
            t = oys.Z(j);
        }
        if (t2 == Integer.MAX_VALUE) {
            t2 = oys.L(j);
        }
        l0f L = pc0.L(dtx.R(x, t, m, t2));
        return mzf.f(L.e, L.X, iia.R, new kW9(L, 4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lUf)) {
            return false;
        }
        lUf luf = (lUf) obj;
        if (n3x.v(this.f5755R, luf.f5755R) && n3x.v(this.v, luf.v)) {
            if (this.R == luf.R) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dH9 dh9 = this.f5755R;
        int i = 0;
        int hashCode = (dh9 != null ? dh9.hashCode() : 0) * 31;
        dH9 dh92 = this.v;
        if (dh92 != null) {
            i = dh92.hashCode();
        }
        return Float.hashCode(this.R) + ((hashCode + i) * 31);
    }
}
