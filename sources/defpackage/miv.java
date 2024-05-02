package defpackage;

/* renamed from: miv  reason: default package */
/* loaded from: classes.dex */
public final class miv {
    public final long O;
    public final long R;
    public final long X;
    public final long c;
    public final long e;
    public final long v;

    public miv(long j, long j2, long j3, long j4, long j5, long j6) {
        this.R = j;
        this.v = j2;
        this.c = j3;
        this.e = j4;
        this.X = j5;
        this.O = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof miv)) {
            return false;
        }
        miv miv = (miv) obj;
        return n3.c(this.R, miv.R) && n3.c(this.v, miv.v) && n3.c(this.c, miv.c) && n3.c(this.e, miv.e) && n3.c(this.X, miv.X) && n3.c(this.O, miv.O);
    }

    public final int hashCode() {
        long j = this.R;
        int i = n3.R;
        return ejC.R(this.O) + jQ.e(this.X, jQ.e(this.e, jQ.e(this.c, jQ.e(this.v, ejC.R(j) * 31, 31), 31), 31), 31);
    }
}
