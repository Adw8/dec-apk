package defpackage;

/* renamed from: aWo  reason: default package */
/* loaded from: classes.dex */
public final class aWo {
    public static final /* synthetic */ int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public final long f906R;
    public static final long v = aH9.N(0.0f, 0.0f);
    public static final long c = aH9.N(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final long e = aH9.N(Float.NaN, Float.NaN);

    public /* synthetic */ aWo(long j) {
        this.f906R = j;
    }

    public static final long L(long j, long j2) {
        return aH9.N(e(j2) + e(j), X(j2) + X(j));
    }

    public static final long O(long j, long j2) {
        return aH9.N(e(j) - e(j2), X(j) - X(j2));
    }

    public static long R(long j, int i) {
        float f = 0.0f;
        float e2 = (i & 1) != 0 ? e(j) : 0.0f;
        if ((i & 2) != 0) {
            f = X(j);
        }
        return aH9.N(e2, f);
    }

    public static final float X(long j) {
        if (j != e) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static final long Z(float f, long j) {
        return aH9.N(e(j) * f, X(j) * f);
    }

    public static final float c(long j) {
        return (float) Math.sqrt((double) ((X(j) * X(j)) + (e(j) * e(j))));
    }

    public static final float e(long j) {
        if (j != e) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static String m(long j) {
        if (!aH9.f(j)) {
            return "Offset.Unspecified";
        }
        StringBuilder U = opT.U("Offset(");
        U.append(ooA.J(e(j)));
        U.append(", ");
        U.append(ooA.J(X(j)));
        U.append(')');
        return U.toString();
    }

    public static final boolean v(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aWo) && this.f906R == ((aWo) obj).f906R;
    }

    public final int hashCode() {
        return Long.hashCode(this.f906R);
    }

    public final String toString() {
        return m(this.f906R);
    }
}
