package defpackage;

/* renamed from: btN  reason: default package */
/* loaded from: classes.dex */
public final class btN extends mjG implements gl4 {
    public final ngd R;

    public btN(ngd ngd) {
        this.R = ngd;
    }

    @Override // defpackage.gl4
    public final mET e(mZf mzf, pc0 pc0, long j) {
        boolean z = false;
        float f = (float) 0;
        if (Float.compare(this.R.e(mzf.getLayoutDirection()), f) >= 0 && Float.compare(this.R.v(), f) >= 0 && Float.compare(this.R.c(mzf.getLayoutDirection()), f) >= 0 && Float.compare(this.R.R(), f) >= 0) {
            z = true;
        }
        if (z) {
            int B = mzf.B(this.R.c(mzf.getLayoutDirection())) + mzf.B(this.R.e(mzf.getLayoutDirection()));
            int B2 = mzf.B(this.R.R()) + mzf.B(this.R.v());
            l0f L = pc0.L(dtx.K(-B, -B2, j));
            return mzf.f(dtx.x(j, L.e + B), dtx.m(j, L.X + B2), iia.R, new ofd(L, mzf, this, 5));
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }

    public final boolean equals(Object obj) {
        btN btn = obj instanceof btN ? (btN) obj : null;
        if (btn == null) {
            return false;
        }
        return n3x.v(this.R, btn.R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }
}
