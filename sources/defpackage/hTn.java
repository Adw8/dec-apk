package defpackage;

/* renamed from: hTn  reason: default package */
/* loaded from: classes.dex */
public final class hTn {
    public float R = 0.0f;
    public float v = 0.0f;

    public final void R() {
        this.R = 0.0f;
        this.v = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hTn)) {
            return false;
        }
        hTn htn = (hTn) obj;
        return n3x.v(Float.valueOf(this.R), Float.valueOf(htn.R)) && n3x.v(Float.valueOf(this.v), Float.valueOf(htn.v));
    }

    public final int hashCode() {
        return Float.hashCode(this.v) + (Float.hashCode(this.R) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("PathPoint(x=");
        U.append(this.R);
        U.append(", y=");
        return jQ.N(U, this.v, ')');
    }
}
