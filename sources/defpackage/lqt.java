package defpackage;

/* renamed from: lqt  reason: default package */
/* loaded from: classes.dex */
public final class lqt {
    public final long R;

    public /* synthetic */ lqt(long j) {
        this.R = j;
    }

    public static final boolean R(long j, long j2) {
        return j == j2;
    }

    public static String v(long j) {
        return R(j, 0) ? "Unspecified" : R(j, 4294967296L) ? "Sp" : R(j, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lqt) && this.R == ((lqt) obj).R;
    }

    public final int hashCode() {
        return Long.hashCode(this.R);
    }

    public final String toString() {
        return v(this.R);
    }
}
