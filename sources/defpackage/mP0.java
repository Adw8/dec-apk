package defpackage;

/* renamed from: mP0  reason: default package */
/* loaded from: classes.dex */
public final class mP0 extends mjG implements gl4 {
    public final float R;
    public final float c;
    public final float e;
    public final float v;

    public mP0(float f, float f2, float f3, float f4) {
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
        if (!((f >= 0.0f || hoI.R(f, Float.NaN)) && (f2 >= 0.0f || hoI.R(f2, Float.NaN)) && ((f3 >= 0.0f || hoI.R(f3, Float.NaN)) && (f4 >= 0.0f || hoI.R(f4, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    @Override // defpackage.gl4
    public final mET e(mZf mzf, pc0 pc0, long j) {
        int B = mzf.B(this.c) + mzf.B(this.R);
        int B2 = mzf.B(this.e) + mzf.B(this.v);
        l0f L = pc0.L(dtx.K(-B, -B2, j));
        return mzf.f(dtx.x(j, L.e + B), dtx.m(j, L.X + B2), iia.R, new ofd(this, L, mzf, 4));
    }

    public final boolean equals(Object obj) {
        mP0 mp0 = obj instanceof mP0 ? (mP0) obj : null;
        return mp0 != null && hoI.R(this.R, mp0.R) && hoI.R(this.v, mp0.v) && hoI.R(this.c, mp0.c) && hoI.R(this.e, mp0.e);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + jQ.c(this.e, jQ.c(this.c, jQ.c(this.v, Float.hashCode(this.R) * 31, 31), 31), 31);
    }
}
