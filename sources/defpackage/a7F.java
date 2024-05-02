package defpackage;

/* renamed from: a7F  reason: default package */
/* loaded from: classes.dex */
public final class a7F extends mjG implements gl4 {
    public final float R;
    public final float v;

    public a7F(float f, float f2) {
        this.R = f;
        this.v = f2;
    }

    @Override // defpackage.gl4
    public final int L(mZf mzf, cxM cxm, int i) {
        int Z = cxm.Z(i);
        int B = !hoI.R(this.v, Float.NaN) ? mzf.B(this.v) : 0;
        return Z < B ? B : Z;
    }

    @Override // defpackage.gl4
    public final int R(mZf mzf, cxM cxm, int i) {
        int k = cxm.k(i);
        int B = !hoI.R(this.R, Float.NaN) ? mzf.B(this.R) : 0;
        return k < B ? B : k;
    }

    @Override // defpackage.gl4
    public final int X(mZf mzf, cxM cxm, int i) {
        int zw = cxm.zw(i);
        int B = !hoI.R(this.v, Float.NaN) ? mzf.B(this.v) : 0;
        return zw < B ? B : zw;
    }

    @Override // defpackage.gl4
    public final mET e(mZf mzf, pc0 pc0, long j) {
        int i;
        int i2 = 0;
        if (hoI.R(this.R, Float.NaN) || oys.x(j) != 0) {
            i = oys.x(j);
        } else {
            i = mzf.B(this.R);
            int Z = oys.Z(j);
            if (i > Z) {
                i = Z;
            }
            if (i < 0) {
                i = 0;
            }
        }
        int Z2 = oys.Z(j);
        if (hoI.R(this.v, Float.NaN) || oys.m(j) != 0) {
            i2 = oys.m(j);
        } else {
            int B = mzf.B(this.v);
            int L = oys.L(j);
            if (B > L) {
                B = L;
            }
            if (B >= 0) {
                i2 = B;
            }
        }
        l0f L2 = pc0.L(dtx.R(i, Z2, i2, oys.L(j)));
        return mzf.f(L2.e, L2.X, iia.R, new kW9(L2, 3));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a7F)) {
            return false;
        }
        a7F a7f = (a7F) obj;
        return hoI.R(this.R, a7f.R) && hoI.R(this.v, a7f.v);
    }

    public final int hashCode() {
        return Float.hashCode(this.v) + (Float.hashCode(this.R) * 31);
    }

    @Override // defpackage.gl4
    public final int p(mZf mzf, cxM cxm, int i) {
        int ZW = cxm.ZW(i);
        int B = !hoI.R(this.R, Float.NaN) ? mzf.B(this.R) : 0;
        return ZW < B ? B : ZW;
    }
}
