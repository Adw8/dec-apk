package defpackage;

/* renamed from: mPl  reason: default package */
/* loaded from: classes.dex */
public final class mPl implements gl4 {
    public final long R;

    public mPl(long j) {
        this.R = j;
    }

    @Override // defpackage.gl4
    public final mET e(mZf mzf, pc0 pc0, long j) {
        l0f L = pc0.L(j);
        int max = Math.max(L.e, mzf.B(o2S.v(this.R)));
        int max2 = Math.max(L.X, mzf.B(o2S.R(this.R)));
        return mzf.f(max, max2, iia.R, new aOi(max, L, max2));
    }

    public final boolean equals(Object obj) {
        mPl mpl = obj instanceof mPl ? (mPl) obj : null;
        if (mpl == null) {
            return false;
        }
        long j = this.R;
        long j2 = mpl.R;
        int i = o2S.R;
        return j == j2;
    }

    public final int hashCode() {
        long j = this.R;
        int i = o2S.R;
        return Long.hashCode(j);
    }
}
