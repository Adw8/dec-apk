package defpackage;

/* renamed from: for  reason: invalid class name and default package */
/* loaded from: classes.dex */
public final class Cfor {
    public final long R;
    public final long v;

    public Cfor(long j, long j2) {
        this.R = j;
        this.v = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cfor)) {
            return false;
        }
        Cfor r8 = (Cfor) obj;
        return aWo.v(this.R, r8.R) && this.v == r8.v;
    }

    public final int hashCode() {
        long j = this.R;
        int i = aWo.R;
        return Long.hashCode(this.v) + (Long.hashCode(j) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("PointAtTime(point=");
        U.append((Object) aWo.m(this.R));
        U.append(", time=");
        U.append(this.v);
        U.append(')');
        return U.toString();
    }
}
