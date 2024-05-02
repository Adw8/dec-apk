package defpackage;

/* renamed from: odN  reason: default package */
/* loaded from: classes.dex */
public final class odN {
    public static final /* synthetic */ int R = 0;
    public static final long v = dtx.e(0, 0);

    /* renamed from: R  reason: collision with other field name */
    public final long f6859R;

    public /* synthetic */ odN(long j) {
        this.f6859R = j;
    }

    public static String L(long j) {
        StringBuilder U = opT.U("TextRange(");
        U.append((int) (j >> 32));
        U.append(", ");
        U.append(c(j));
        U.append(')');
        return U.toString();
    }

    public static final boolean O(long j) {
        return ((int) (j >> 32)) > c(j);
    }

    public static final boolean R(long j, long j2) {
        return j == j2;
    }

    public static final int X(long j) {
        int i = (int) (j >> 32);
        return i > c(j) ? c(j) : i;
    }

    public static final int c(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int e(long j) {
        int i = (int) (j >> 32);
        return i > c(j) ? i : c(j);
    }

    public static final boolean v(long j) {
        return ((int) (j >> 32)) == c(j);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof odN) && this.f6859R == ((odN) obj).f6859R;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6859R);
    }

    public final String toString() {
        return L(this.f6859R);
    }
}
