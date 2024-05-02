package defpackage;

/* renamed from: jls  reason: default package */
/* loaded from: classes.dex */
public final class jls extends e7L {
    public final float R;
    public final float v;

    public jls(float f, float f2) {
        super(false, false, 3);
        this.R = f;
        this.v = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jls)) {
            return false;
        }
        jls jls = (jls) obj;
        return n3x.v(Float.valueOf(this.R), Float.valueOf(jls.R)) && n3x.v(Float.valueOf(this.v), Float.valueOf(jls.v));
    }

    public final int hashCode() {
        return Float.hashCode(this.v) + (Float.hashCode(this.R) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("MoveTo(x=");
        U.append(this.R);
        U.append(", y=");
        return jQ.N(U, this.v, ')');
    }
}
