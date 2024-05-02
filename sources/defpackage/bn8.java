package defpackage;

/* renamed from: bn8  reason: default package */
/* loaded from: classes.dex */
public final class bn8 extends e7L {
    public final float R;
    public final float v;

    public bn8(float f, float f2) {
        super(false, false, 3);
        this.R = f;
        this.v = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn8)) {
            return false;
        }
        bn8 bn8 = (bn8) obj;
        return n3x.v(Float.valueOf(this.R), Float.valueOf(bn8.R)) && n3x.v(Float.valueOf(this.v), Float.valueOf(bn8.v));
    }

    public final int hashCode() {
        return Float.hashCode(this.v) + (Float.hashCode(this.R) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("RelativeMoveTo(dx=");
        U.append(this.R);
        U.append(", dy=");
        return jQ.N(U, this.v, ')');
    }
}
