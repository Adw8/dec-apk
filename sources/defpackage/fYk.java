package defpackage;

/* renamed from: fYk  reason: default package */
/* loaded from: classes.dex */
public final class fYk extends e7L {
    public final float R;
    public final float c;
    public final float e;
    public final float v;

    public fYk(float f, float f2, float f3, float f4) {
        super(true, false, 2);
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fYk)) {
            return false;
        }
        fYk fyk = (fYk) obj;
        return n3x.v(Float.valueOf(this.R), Float.valueOf(fyk.R)) && n3x.v(Float.valueOf(this.v), Float.valueOf(fyk.v)) && n3x.v(Float.valueOf(this.c), Float.valueOf(fyk.c)) && n3x.v(Float.valueOf(this.e), Float.valueOf(fyk.e));
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + jQ.c(this.c, jQ.c(this.v, Float.hashCode(this.R) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("RelativeReflectiveCurveTo(dx1=");
        U.append(this.R);
        U.append(", dy1=");
        U.append(this.v);
        U.append(", dx2=");
        U.append(this.c);
        U.append(", dy2=");
        return jQ.N(U, this.e, ')');
    }
}
