package defpackage;

/* renamed from: kPA  reason: default package */
/* loaded from: classes.dex */
public final class kPA {
    public final long C;
    public final long H;
    public final long L;
    public final long N;
    public final long O;
    public final long P;
    public final long R;
    public final long U;
    public final long X;
    public final long Z;
    public final long c;
    public final long e;
    public final long j;
    public final long m;
    public final long v;
    public final long x;

    public kPA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
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
        this.U = j12;
        this.C = j13;
        this.N = j14;
        this.P = j15;
        this.j = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kPA)) {
            return false;
        }
        kPA kpa = (kPA) obj;
        return n3.c(this.R, kpa.R) && n3.c(this.v, kpa.v) && n3.c(this.c, kpa.c) && n3.c(this.e, kpa.e) && n3.c(this.X, kpa.X) && n3.c(this.O, kpa.O) && n3.c(this.L, kpa.L) && n3.c(this.Z, kpa.Z) && n3.c(this.m, kpa.m) && n3.c(this.x, kpa.x) && n3.c(this.H, kpa.H) && n3.c(this.U, kpa.U) && n3.c(this.C, kpa.C) && n3.c(this.N, kpa.N) && n3.c(this.P, kpa.P) && n3.c(this.j, kpa.j);
    }

    public final int hashCode() {
        long j = this.R;
        int i = n3.R;
        return ejC.R(this.j) + jQ.e(this.P, jQ.e(this.N, jQ.e(this.C, jQ.e(this.U, jQ.e(this.H, jQ.e(this.x, jQ.e(this.m, jQ.e(this.Z, jQ.e(this.L, jQ.e(this.O, jQ.e(this.X, jQ.e(this.e, jQ.e(this.c, jQ.e(this.v, ejC.R(j) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
