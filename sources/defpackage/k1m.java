package defpackage;

/* renamed from: k1m  reason: default package */
/* loaded from: classes.dex */
public final class k1m {
    public final long R;
    public final long v;

    public k1m(long j, long j2) {
        this.R = j;
        this.v = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1m)) {
            return false;
        }
        k1m k1m = (k1m) obj;
        return n3.c(this.R, k1m.R) && n3.c(this.v, k1m.v);
    }

    public final int hashCode() {
        long j = this.R;
        int i = n3.R;
        return ejC.R(this.v) + (ejC.R(j) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("SelectionColors(selectionHandleColor=");
        U.append((Object) n3.m(this.R));
        U.append(", selectionBackgroundColor=");
        U.append((Object) n3.m(this.v));
        U.append(')');
        return U.toString();
    }
}
