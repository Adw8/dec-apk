package defpackage;

/* renamed from: dU5  reason: default package */
/* loaded from: classes.dex */
public final class dU5 {
    public static final /* synthetic */ int R = 0;
    public static final long v = cU5.v(0, 0);

    /* renamed from: R  reason: collision with other field name */
    public final long f2628R;

    public /* synthetic */ dU5(long j) {
        this.f2628R = j;
    }

    public static final boolean R(long j, long j2) {
        return j == j2;
    }

    public static String c(long j) {
        return '(' + ((int) (j >> 32)) + ", " + v(j) + ')';
    }

    public static final int v(long j) {
        return (int) (j & 4294967295L);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dU5) && this.f2628R == ((dU5) obj).f2628R;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2628R);
    }

    public final String toString() {
        return c(this.f2628R);
    }
}
