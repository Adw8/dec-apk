package defpackage;

/* renamed from: o5j  reason: default package */
/* loaded from: classes.dex */
public final class o5j extends e7L {
    public final float R;
    public final float v;

    public o5j(float f, float f2) {
        super(false, false, 3);
        this.R = f;
        this.v = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5j)) {
            return false;
        }
        o5j o5j = (o5j) obj;
        return n3x.v(Float.valueOf(this.R), Float.valueOf(o5j.R)) && n3x.v(Float.valueOf(this.v), Float.valueOf(o5j.v));
    }

    public final int hashCode() {
        return Float.hashCode(this.v) + (Float.hashCode(this.R) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("RelativeLineTo(dx=");
        U.append(this.R);
        U.append(", dy=");
        return jQ.N(U, this.v, ')');
    }
}
