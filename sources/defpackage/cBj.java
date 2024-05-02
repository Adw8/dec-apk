package defpackage;

/* renamed from: cBj  reason: default package */
/* loaded from: classes.dex */
public final class cBj extends e7L {
    public final float O;
    public final float R;
    public final float X;
    public final float c;
    public final float e;
    public final float v;

    public cBj(float f, float f2, float f3, float f4, float f5, float f6) {
        super(true, false, 2);
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
        this.X = f5;
        this.O = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cBj)) {
            return false;
        }
        cBj cbj = (cBj) obj;
        return n3x.v(Float.valueOf(this.R), Float.valueOf(cbj.R)) && n3x.v(Float.valueOf(this.v), Float.valueOf(cbj.v)) && n3x.v(Float.valueOf(this.c), Float.valueOf(cbj.c)) && n3x.v(Float.valueOf(this.e), Float.valueOf(cbj.e)) && n3x.v(Float.valueOf(this.X), Float.valueOf(cbj.X)) && n3x.v(Float.valueOf(this.O), Float.valueOf(cbj.O));
    }

    public final int hashCode() {
        return Float.hashCode(this.O) + jQ.c(this.X, jQ.c(this.e, jQ.c(this.c, jQ.c(this.v, Float.hashCode(this.R) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("CurveTo(x1=");
        U.append(this.R);
        U.append(", y1=");
        U.append(this.v);
        U.append(", x2=");
        U.append(this.c);
        U.append(", y2=");
        U.append(this.e);
        U.append(", x3=");
        U.append(this.X);
        U.append(", y3=");
        return jQ.N(U, this.O, ')');
    }
}
