package defpackage;

/* renamed from: kN6  reason: default package */
/* loaded from: classes.dex */
public final class kN6 extends e7L {
    public final float R;
    public final float v;

    public kN6(float f, float f2) {
        super(false, true, 1);
        this.R = f;
        this.v = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kN6)) {
            return false;
        }
        kN6 kn6 = (kN6) obj;
        return n3x.v(Float.valueOf(this.R), Float.valueOf(kn6.R)) && n3x.v(Float.valueOf(this.v), Float.valueOf(kn6.v));
    }

    public final int hashCode() {
        return Float.hashCode(this.v) + (Float.hashCode(this.R) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("ReflectiveQuadTo(x=");
        U.append(this.R);
        U.append(", y=");
        return jQ.N(U, this.v, ')');
    }
}
