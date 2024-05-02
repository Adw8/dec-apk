package defpackage;

/* renamed from: ejC  reason: default package */
/* loaded from: classes.dex */
public final class ejC implements Comparable {
    public final long R;

    public /* synthetic */ ejC(long j) {
        this.R = j;
    }

    public static int R(long j) {
        return (int) (j ^ (j >>> 32));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = ((this.R ^ Long.MIN_VALUE) > (((ejC) obj).R ^ Long.MIN_VALUE) ? 1 : ((this.R ^ Long.MIN_VALUE) == (((ejC) obj).R ^ Long.MIN_VALUE) ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return (obj instanceof ejC) && this.R == ((ejC) obj).R;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return R(this.R);
    }

    @Override // java.lang.Object
    public final String toString() {
        long j = this.R;
        if (j >= 0) {
            jjU.X(10);
            return Long.toString(j, 10);
        }
        long j2 = (long) 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        jjU.X(10);
        sb.append(Long.toString(j3, 10));
        jjU.X(10);
        sb.append(Long.toString(j4, 10));
        return sb.toString();
    }
}
