package defpackage;

/* renamed from: fO  reason: default package */
/* loaded from: classes.dex */
public final class fO {
    public final float R;
    public final float X;
    public final float c;
    public final float e;
    public final float v;

    public fO(float f, float f2, float f3, float f4, float f5) {
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
        this.X = f5;
    }

    public final SE R(boolean z, p2E p2e, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        Object x = jQ.x(jr_, -1312510462, -492369756);
        f1A f1a = ppN.R;
        if (x == f1a) {
            x = new gnW();
            jr_.ZW(x);
        }
        jr_.g(false);
        gnW gnw = (gnW) x;
        jr_.w(511388516);
        boolean O = jr_.O(p2e) | jr_.O(gnw);
        Object I = jr_.I();
        if (O || I == f1a) {
            I = new SM(p2e, gnw, null);
            jr_.ZW(I);
        }
        jr_.g(false);
        caw.e(p2e, (iv7) I, jr_);
        nto nto = (nto) dF.vl(gnw);
        float f = !z ? this.X : nto instanceof oDO ? this.v : nto instanceof a07 ? this.e : nto instanceof k4G ? this.c : this.R;
        jr_.w(-492369756);
        Object I2 = jr_.I();
        if (I2 == f1a) {
            I2 = new _6(new hoI(f), kYZ.c, null);
            jr_.ZW(I2);
        }
        jr_.g(false);
        _6 _6 = (_6) I2;
        if (!z) {
            jr_.w(-719929912);
            caw.e(new hoI(f), new Vn(_6, f, null), jr_);
            jr_.g(false);
        } else {
            jr_.w(-719929769);
            caw.e(new hoI(f), new B6(_6, this, f, nto, null), jr_);
            jr_.g(false);
        }
        SE se = _6.f680R;
        jr_.g(false);
        return se;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fO)) {
            return false;
        }
        fO fOVar = (fO) obj;
        return hoI.R(this.R, fOVar.R) && hoI.R(this.v, fOVar.v) && hoI.R(this.c, fOVar.c) && hoI.R(this.e, fOVar.e) && hoI.R(this.X, fOVar.X);
    }

    public final int hashCode() {
        return Float.hashCode(this.X) + jQ.c(this.e, jQ.c(this.c, jQ.c(this.v, Float.hashCode(this.R) * 31, 31), 31), 31);
    }
}
