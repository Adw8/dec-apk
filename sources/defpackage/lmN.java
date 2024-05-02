package defpackage;

/* renamed from: lmN  reason: default package */
/* loaded from: classes.dex */
public final class lmN {
    public final long R;

    public /* synthetic */ lmN(long j) {
        this.R = j;
    }

    public static final boolean R(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lmN) && this.R == ((lmN) obj).R;
    }

    public final int hashCode() {
        return Long.hashCode(this.R);
    }

    public final String toString() {
        long j = this.R;
        return "RetryInstruction(delayMillis=" + j + ")";
    }
}
