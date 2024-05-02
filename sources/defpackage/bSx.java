package defpackage;

/* renamed from: bSx  reason: default package */
/* loaded from: classes.dex */
public final class bSx {
    public final float R;
    public final float v;

    public bSx(float f, float f2) {
        this.R = f;
        this.v = f2;
    }

    public final float[] R() {
        float f = this.R;
        float f2 = this.v;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bSx)) {
            return false;
        }
        bSx bsx = (bSx) obj;
        return n3x.v(Float.valueOf(this.R), Float.valueOf(bsx.R)) && n3x.v(Float.valueOf(this.v), Float.valueOf(bsx.v));
    }

    public final int hashCode() {
        return Float.hashCode(this.v) + (Float.hashCode(this.R) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("WhitePoint(x=");
        U.append(this.R);
        U.append(", y=");
        return jQ.N(U, this.v, ')');
    }
}
