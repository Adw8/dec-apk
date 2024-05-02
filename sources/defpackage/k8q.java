package defpackage;

/* renamed from: k8q  reason: default package */
/* loaded from: classes.dex */
public final class k8q {
    public final long R;

    public /* synthetic */ k8q(long j) {
        this.R = j;
    }

    public static final boolean R(long j, long j2) {
        return j == j2;
    }

    public static String v(long j) {
        return "PointerId(value=" + j + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k8q) && this.R == ((k8q) obj).R;
    }

    public final int hashCode() {
        return Long.hashCode(this.R);
    }

    public final String toString() {
        return v(this.R);
    }
}
