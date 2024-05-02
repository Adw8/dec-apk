package defpackage;

/* renamed from: aKt  reason: default package */
/* loaded from: classes.dex */
public final class aKt extends e7L {
    public final float R;
    public final float c;
    public final float e;
    public final float v;

    public aKt(float f, float f2, float f3, float f4) {
        super(false, true, 1);
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aKt)) {
            return false;
        }
        aKt akt = (aKt) obj;
        return n3x.v(Float.valueOf(this.R), Float.valueOf(akt.R)) && n3x.v(Float.valueOf(this.v), Float.valueOf(akt.v)) && n3x.v(Float.valueOf(this.c), Float.valueOf(akt.c)) && n3x.v(Float.valueOf(this.e), Float.valueOf(akt.e));
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + jQ.c(this.c, jQ.c(this.v, Float.hashCode(this.R) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("QuadTo(x1=");
        U.append(this.R);
        U.append(", y1=");
        U.append(this.v);
        U.append(", x2=");
        U.append(this.c);
        U.append(", y2=");
        return jQ.N(U, this.e, ')');
    }
}
