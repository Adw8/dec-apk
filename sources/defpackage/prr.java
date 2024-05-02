package defpackage;

/* renamed from: prr  reason: default package */
/* loaded from: classes.dex */
public final class prr extends mjG implements gl4 {
    public final int O;
    public final float R;

    public prr(int i, float f, dio dio) {
        this.O = i;
        this.R = f;
    }

    @Override // defpackage.gl4
    public final mET e(mZf mzf, pc0 pc0, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        if (!oys.e(j) || this.O == 1) {
            i2 = oys.x(j);
            i = oys.Z(j);
        } else {
            i2 = caw.x(mLz.t(((float) oys.Z(j)) * this.R), oys.x(j), oys.Z(j));
            i = i2;
        }
        if (!oys.c(j) || this.O == 2) {
            i4 = oys.m(j);
            i3 = oys.L(j);
        } else {
            i4 = caw.x(mLz.t(((float) oys.L(j)) * this.R), oys.m(j), oys.L(j));
            i3 = i4;
        }
        l0f L = pc0.L(dtx.R(i2, i, i4, i3));
        return mzf.f(L.e, L.X, iia.R, new kW9(L, 0));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof prr) {
            prr prr = (prr) obj;
            if (this.O == prr.O) {
                if (this.R == prr.R) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.R) + (jQ.I(this.O) * 31);
    }
}
