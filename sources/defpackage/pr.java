package defpackage;

/* renamed from: pr  reason: default package */
/* loaded from: classes.dex */
public final class pr {
    public final float R;
    public final float v;

    public pr(float f, float f2) {
        this.R = f;
        this.v = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr)) {
            return false;
        }
        pr prVar = (pr) obj;
        return n3x.v(Float.valueOf(this.R), Float.valueOf(prVar.R)) && n3x.v(Float.valueOf(this.v), Float.valueOf(prVar.v));
    }

    public final int hashCode() {
        return Float.hashCode(this.v) + (Float.hashCode(this.R) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("FlingResult(distanceCoefficient=");
        U.append(this.R);
        U.append(", velocityCoefficient=");
        return jQ.N(U, this.v, ')');
    }
}
