package defpackage;

/* renamed from: hpO  reason: default package */
/* loaded from: classes.dex */
public final class hpO {
    public static final hpO R = new hpO();

    /* renamed from: R  reason: collision with other field name */
    public final float f4389R;

    /* renamed from: R  reason: collision with other field name */
    public final long f4390R;
    public final long v;

    public hpO(long j, long j2, float f) {
        this.f4390R = j;
        this.v = j2;
        this.f4389R = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpO)) {
            return false;
        }
        hpO hpo = (hpO) obj;
        if (!n3.c(this.f4390R, hpo.f4390R) || !aWo.v(this.v, hpo.v)) {
            return false;
        }
        return (this.f4389R > hpo.f4389R ? 1 : (this.f4389R == hpo.f4389R ? 0 : -1)) == 0;
    }

    public final int hashCode() {
        long j = this.f4390R;
        int i = n3.R;
        long j2 = this.v;
        int i2 = aWo.R;
        return Float.hashCode(this.f4389R) + opT.X(j2, ejC.R(j) * 31, 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("Shadow(color=");
        U.append((Object) n3.m(this.f4390R));
        U.append(", offset=");
        U.append((Object) aWo.m(this.v));
        U.append(", blurRadius=");
        return jQ.N(U, this.f4389R, ')');
    }

    public hpO() {
        this(aH9.O(4278190080L), aWo.v, 0.0f);
    }
}
