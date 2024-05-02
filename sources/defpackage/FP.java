package defpackage;

/* renamed from: FP  reason: default package */
/* loaded from: classes.dex */
public final class FP {
    public final long H;
    public final long L;
    public final long O;
    public final long R;
    public final long X;
    public final long Z;
    public final long c;
    public final long e;
    public final long m;
    public final long v;
    public final long x;

    public FP(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.R = j;
        this.v = j2;
        this.c = j3;
        this.e = j4;
        this.X = j5;
        this.O = j6;
        this.L = j7;
        this.Z = j8;
        this.m = j9;
        this.x = j10;
        this.H = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FP)) {
            return false;
        }
        FP fp = (FP) obj;
        return n3.c(this.R, fp.R) && n3.c(this.v, fp.v) && n3.c(this.c, fp.c) && n3.c(this.e, fp.e) && n3.c(this.X, fp.X) && n3.c(this.O, fp.O) && n3.c(this.L, fp.L) && n3.c(this.Z, fp.Z) && n3.c(this.m, fp.m) && n3.c(this.x, fp.x) && n3.c(this.H, fp.H);
    }

    public final int hashCode() {
        long j = this.R;
        int i = n3.R;
        return ejC.R(this.H) + jQ.e(this.x, jQ.e(this.m, jQ.e(this.Z, jQ.e(this.L, jQ.e(this.O, jQ.e(this.X, jQ.e(this.e, jQ.e(this.c, jQ.e(this.v, ejC.R(j) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
