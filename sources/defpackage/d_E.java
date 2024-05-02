package defpackage;

/* renamed from: d_E  reason: default package */
/* loaded from: classes.dex */
public final class d_E {
    public static final /* synthetic */ int R = 0;
    public static final long v = dtx.X(0.0f, 0.0f);

    /* renamed from: R  reason: collision with other field name */
    public final long f2672R;

    public /* synthetic */ d_E(long j) {
        this.f2672R = j;
    }

    public static long R(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = v(j);
        }
        if ((i & 2) != 0) {
            f2 = c(j);
        }
        return dtx.X(f, f2);
    }

    public static final long X(long j, long j2) {
        return dtx.X(v(j2) + v(j), c(j2) + c(j));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long e(long j, long j2) {
        return dtx.X(v(j) - v(j2), c(j) - c(j2));
    }

    public static final float v(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d_E) && this.f2672R == ((d_E) obj).f2672R;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2672R);
    }

    public final String toString() {
        long j = this.f2672R;
        return '(' + v(j) + ", " + c(j) + ") px/sec";
    }
}
