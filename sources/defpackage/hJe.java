package defpackage;

/* renamed from: hJe  reason: default package */
/* loaded from: classes.dex */
public final class hJe {
    public final float R;
    public final float c;
    public final float e;
    public final float v;

    public hJe(float f, float f2, float f3, float f4) {
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
    }

    public final SE R(p2E p2e, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        Object x = jQ.x(jr_, -1845106002, -492369756);
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
            I = new bv7(p2e, gnw, null);
            jr_.ZW(I);
        }
        jr_.g(false);
        caw.e(p2e, (iv7) I, jr_);
        nto nto = (nto) dF.vl(gnw);
        float f = nto instanceof oDO ? this.v : nto instanceof a07 ? this.e : nto instanceof k4G ? this.c : this.R;
        jr_.w(-492369756);
        Object I2 = jr_.I();
        if (I2 == f1a) {
            I2 = new _6(new hoI(f), kYZ.c, null);
            jr_.ZW(I2);
        }
        jr_.g(false);
        _6 _6 = (_6) I2;
        caw.e(new hoI(f), new eNM(_6, this, f, nto, null), jr_);
        SE se = _6.f680R;
        jr_.g(false);
        return se;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hJe)) {
            return false;
        }
        hJe hje = (hJe) obj;
        return hoI.R(this.R, hje.R) && hoI.R(this.v, hje.v) && hoI.R(this.c, hje.c) && hoI.R(this.e, hje.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + jQ.c(this.c, jQ.c(this.v, Float.hashCode(this.R) * 31, 31), 31);
    }
}
