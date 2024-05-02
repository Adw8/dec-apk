package defpackage;

/* renamed from: oys  reason: default package */
/* loaded from: classes.dex */
public final class oys {

    /* renamed from: R  reason: collision with other field name */
    public final long f7046R;
    public static final int[] R = {18, 20, 17, 15};
    public static final int[] v = {65535, 262143, 32767, 8191};
    public static final int[] c = {32767, 8191, 65535, 262143};

    public /* synthetic */ oys(long j) {
        this.f7046R = j;
    }

    public static String H(long j) {
        int Z = Z(j);
        String str = "Infinity";
        String valueOf = Z == Integer.MAX_VALUE ? str : String.valueOf(Z);
        int L = L(j);
        if (L != Integer.MAX_VALUE) {
            str = String.valueOf(L);
        }
        StringBuilder U = opT.U("Constraints(minWidth = ");
        U.append(x(j));
        U.append(", maxWidth = ");
        U.append(valueOf);
        U.append(", minHeight = ");
        U.append(m(j));
        U.append(", maxHeight = ");
        U.append(str);
        U.append(')');
        return U.toString();
    }

    public static final int L(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> (R[i] + 31))) & c[i];
        if (i2 == 0) {
            return Integer.MAX_VALUE;
        }
        return i2 - 1;
    }

    public static final boolean O(long j) {
        return Z(j) == x(j);
    }

    public static long R(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = x(j);
        }
        if ((i5 & 2) != 0) {
            i2 = Z(j);
        }
        if ((i5 & 4) != 0) {
            i3 = m(j);
        }
        if ((i5 & 8) != 0) {
            i4 = L(j);
        }
        boolean z = false;
        if (i3 >= 0 && i >= 0) {
            if (i2 >= i || i2 == Integer.MAX_VALUE) {
                if (i4 >= i3 || i4 == Integer.MAX_VALUE) {
                    z = true;
                }
                if (z) {
                    return dq.g(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= minHeight(" + i3 + ')').toString());
            }
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= minWidth(" + i + ')').toString());
        }
        throw new IllegalArgumentException(("minHeight(" + i3 + ") and minWidth(" + i + ") must be >= 0").toString());
    }

    public static final boolean X(long j) {
        return L(j) == m(j);
    }

    public static final int Z(long j) {
        int i = ((int) (j >> 33)) & v[(int) (3 & j)];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    public static final boolean c(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> (R[i] + 31))) & c[i]) != 0;
    }

    public static final boolean e(long j) {
        return (((int) (j >> 33)) & v[(int) (3 & j)]) != 0;
    }

    public static final int m(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> R[i])) & c[i];
    }

    public static final boolean v(long j, long j2) {
        return j == j2;
    }

    public static final int x(long j) {
        return ((int) (j >> 2)) & v[(int) (3 & j)];
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oys) && this.f7046R == ((oys) obj).f7046R;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7046R);
    }

    public final String toString() {
        return H(this.f7046R);
    }
}
