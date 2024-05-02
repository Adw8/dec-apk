package defpackage;

/* renamed from: eT9  reason: default package */
/* loaded from: classes.dex */
public final class eT9 {
    public static final lqt[] R = {new lqt(0), new lqt(4294967296L), new lqt(8589934592L)};
    public static final long v = gQc.r(Float.NaN, 0);

    /* renamed from: R  reason: collision with other field name */
    public final long f3107R;

    public /* synthetic */ eT9(long j) {
        this.f3107R = j;
    }

    public static final boolean R(long j, long j2) {
        return j == j2;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String e(long j) {
        long v2 = v(j);
        if (lqt.R(v2, 0)) {
            return "Unspecified";
        }
        if (lqt.R(v2, 4294967296L)) {
            return c(j) + ".sp";
        } else if (!lqt.R(v2, 8589934592L)) {
            return "Invalid";
        } else {
            return c(j) + ".em";
        }
    }

    public static final long v(long j) {
        return R[(int) ((j & 1095216660480L) >>> 32)].R;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof eT9) && this.f3107R == ((eT9) obj).f3107R;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3107R);
    }

    public final String toString() {
        return e(this.f3107R);
    }
}
