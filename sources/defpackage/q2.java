package defpackage;

/* renamed from: q2  reason: default package */
/* loaded from: classes.dex */
public abstract class q2 {
    public static final /* synthetic */ int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public static final long f7347R;
    public static final long c;
    public static final long e;
    public static final long v;

    static {
        long j = (long) 3;
        long j2 = j << 32;
        f7347R = (((long) 0) & 4294967295L) | j2;
        v = (((long) 1) & 4294967295L) | j2;
        c = j2 | (((long) 2) & 4294967295L);
        e = (j & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean R(long j, long j2) {
        return j == j2;
    }

    public static String v(long j) {
        return R(j, f7347R) ? "Rgb" : R(j, v) ? "Xyz" : R(j, c) ? "Lab" : R(j, e) ? "Cmyk" : "Unknown";
    }
}
