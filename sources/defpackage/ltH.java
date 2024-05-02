package defpackage;

/* renamed from: ltH  reason: default package */
/* loaded from: classes.dex */
public final class ltH {
    public final long R;

    public /* synthetic */ ltH(long j) {
        this.R = j;
    }

    public static final boolean R(long j, long j2) {
        return j == j2;
    }

    public static String c(long j) {
        return ((int) (j >> 32)) + " x " + v(j);
    }

    public static final int v(long j) {
        return (int) (j & 4294967295L);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ltH) && this.R == ((ltH) obj).R;
    }

    public final int hashCode() {
        return Long.hashCode(this.R);
    }

    public final String toString() {
        return c(this.R);
    }
}
