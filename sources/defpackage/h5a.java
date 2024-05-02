package defpackage;

/* renamed from: h5a  reason: default package */
/* loaded from: classes.dex */
public final class h5a {
    public static final h5a R = new h5a(1.0f, 0.0f);

    /* renamed from: R  reason: collision with other field name */
    public final float f4049R;
    public final float v;

    public h5a(float f, float f2) {
        this.f4049R = f;
        this.v = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5a)) {
            return false;
        }
        h5a h5a = (h5a) obj;
        if (!(this.f4049R == h5a.f4049R)) {
            return false;
        }
        return (this.v > h5a.v ? 1 : (this.v == h5a.v ? 0 : -1)) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.v) + (Float.hashCode(this.f4049R) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("TextGeometricTransform(scaleX=");
        U.append(this.f4049R);
        U.append(", skewX=");
        return jQ.N(U, this.v, ')');
    }
}
