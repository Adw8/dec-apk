package defpackage;

/* renamed from: nqW  reason: default package */
/* loaded from: classes.dex */
public final class nqW {
    public static final /* synthetic */ int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public final long f6610R;
    public static final long v = n1P.e(0.0f, 0.0f);
    public static final long c = n1P.e(Float.NaN, Float.NaN);

    public /* synthetic */ nqW(long j) {
        this.f6610R = j;
    }

    public static String O(long j) {
        if (!(j != c)) {
            return "Size.Unspecified";
        }
        StringBuilder U = opT.U("Size(");
        U.append(ooA.J(e(j)));
        U.append(", ");
        U.append(ooA.J(v(j)));
        U.append(')');
        return U.toString();
    }

    public static final boolean R(long j, long j2) {
        return j == j2;
    }

    public static final boolean X(long j) {
        return e(j) <= 0.0f || v(j) <= 0.0f;
    }

    public static final float c(long j) {
        return Math.min(Math.abs(e(j)), Math.abs(v(j)));
    }

    public static final float e(long j) {
        if (j != c) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static final float v(long j) {
        if (j != c) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nqW) && this.f6610R == ((nqW) obj).f6610R;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6610R);
    }

    public final String toString() {
        return O(this.f6610R);
    }
}
