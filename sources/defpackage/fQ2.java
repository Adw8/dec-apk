package defpackage;

/* renamed from: fQ2  reason: default package */
/* loaded from: classes.dex */
public final class fQ2 {
    public final long R;
    public final long X;
    public final long c;
    public final long e;
    public final long v;

    public fQ2(long j, long j2, long j3, long j4, long j5) {
        this.R = j;
        this.v = j2;
        this.c = j3;
        this.e = j4;
        this.X = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fQ2)) {
            return false;
        }
        fQ2 fq2 = (fQ2) obj;
        return n3.c(this.R, fq2.R) && n3.c(this.v, fq2.v) && n3.c(this.c, fq2.c) && n3.c(this.e, fq2.e) && n3.c(this.X, fq2.X);
    }

    public final int hashCode() {
        long j = this.R;
        int i = n3.R;
        return ejC.R(this.X) + jQ.e(this.e, jQ.e(this.c, jQ.e(this.v, ejC.R(j) * 31, 31), 31), 31);
    }
}
