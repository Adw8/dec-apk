package defpackage;

/* renamed from: iTW  reason: default package */
/* loaded from: classes.dex */
public final class iTW {
    public final long R;
    public final long c;
    public final long e;
    public final long v;

    public iTW(long j, long j2, long j3, long j4) {
        this.R = j;
        this.v = j2;
        this.c = j3;
        this.e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof iTW)) {
            return false;
        }
        iTW itw = (iTW) obj;
        return n3.c(this.R, itw.R) && n3.c(this.v, itw.v) && n3.c(this.c, itw.c) && n3.c(this.e, itw.e);
    }

    public final int hashCode() {
        long j = this.R;
        int i = n3.R;
        return ejC.R(this.e) + jQ.e(this.c, jQ.e(this.v, ejC.R(j) * 31, 31), 31);
    }
}
