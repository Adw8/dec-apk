package defpackage;

/* renamed from: gIA  reason: default package */
/* loaded from: classes.dex */
public final class gIA {
    public static final gIA R = new gIA(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: R  reason: collision with other field name */
    public final float f3720R;
    public final float c;
    public final float e;
    public final float v;

    public gIA(float f, float f2, float f3, float f4) {
        this.f3720R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
    }

    public final long R() {
        float f = this.f3720R;
        float f2 = ((this.c - f) / 2.0f) + f;
        float f3 = this.v;
        return aH9.N(f2, ((this.e - f3) / 2.0f) + f3);
    }

    public final gIA c(float f, float f2) {
        return new gIA(this.f3720R + f, this.v + f2, this.c + f, this.e + f2);
    }

    public final gIA e(long j) {
        return new gIA(aWo.e(j) + this.f3720R, aWo.X(j) + this.v, aWo.e(j) + this.c, aWo.X(j) + this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gIA)) {
            return false;
        }
        gIA gia = (gIA) obj;
        return n3x.v(Float.valueOf(this.f3720R), Float.valueOf(gia.f3720R)) && n3x.v(Float.valueOf(this.v), Float.valueOf(gia.v)) && n3x.v(Float.valueOf(this.c), Float.valueOf(gia.c)) && n3x.v(Float.valueOf(this.e), Float.valueOf(gia.e));
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + jQ.c(this.c, jQ.c(this.v, Float.hashCode(this.f3720R) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("Rect.fromLTRB(");
        U.append(ooA.J(this.f3720R));
        U.append(", ");
        U.append(ooA.J(this.v));
        U.append(", ");
        U.append(ooA.J(this.c));
        U.append(", ");
        U.append(ooA.J(this.e));
        U.append(')');
        return U.toString();
    }

    public final boolean v(gIA gia) {
        return this.c > gia.f3720R && gia.c > this.f3720R && this.e > gia.v && gia.e > this.v;
    }
}
