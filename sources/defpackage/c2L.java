package defpackage;

/* renamed from: c2L  reason: default package */
/* loaded from: classes.dex */
public final class c2L {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final long f1949R;
    public final float v;

    public c2L(float f, float f2, long j) {
        this.R = f;
        this.v = f2;
        this.f1949R = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2L)) {
            return false;
        }
        c2L c2l = (c2L) obj;
        return n3x.v(Float.valueOf(this.R), Float.valueOf(c2l.R)) && n3x.v(Float.valueOf(this.v), Float.valueOf(c2l.v)) && this.f1949R == c2l.f1949R;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1949R) + jQ.c(this.v, Float.hashCode(this.R) * 31, 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("FlingInfo(initialVelocity=");
        U.append(this.R);
        U.append(", distance=");
        U.append(this.v);
        U.append(", duration=");
        U.append(this.f1949R);
        U.append(')');
        return U.toString();
    }
}
