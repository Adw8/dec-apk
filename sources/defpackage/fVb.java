package defpackage;

/* renamed from: fVb  reason: default package */
/* loaded from: classes.dex */
public final class fVb {
    public final long C;
    public final long H;
    public final long I;
    public final long J;
    public final long K;
    public final long L;
    public final long N;
    public final long O;
    public final long P;
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final k1m f3439R;
    public final long U;
    public final long V;
    public final long X;
    public final long Y;
    public final long Z;
    public final long c;
    public final long e;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long m;
    public final long o;
    public final long t;
    public final long v;
    public final long x;
    public final long y;

    public fVb(long j, long j2, long j3, long j4, long j5, k1m k1m, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27) {
        this.R = j;
        this.v = j2;
        this.c = j3;
        this.e = j4;
        this.X = j5;
        this.f3439R = k1m;
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
        this.g = j17;
        this.y = j18;
        this.t = j19;
        this.i = j20;
        this.V = j21;
        this.o = j22;
        this.K = j23;
        this.J = j24;
        this.Y = j25;
        this.h = j26;
        this.I = j27;
    }

    public final h0T R(boolean z, m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(-1885422187);
        h0T s = l6.s(new n3(z ? this.X : this.e), jr_);
        jr_.g(false);
        return s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fVb)) {
            return false;
        }
        fVb fvb = (fVb) obj;
        return n3.c(this.R, fvb.R) && n3.c(this.v, fvb.v) && n3.c(this.e, fvb.e) && n3.c(this.X, fvb.X) && n3x.v(this.f3439R, fvb.f3439R) && n3.c(this.O, fvb.O) && n3.c(this.L, fvb.L) && n3.c(this.Z, fvb.Z) && n3.c(this.m, fvb.m) && n3.c(this.x, fvb.x) && n3.c(this.H, fvb.H) && n3.c(this.U, fvb.U) && n3.c(this.C, fvb.C) && n3.c(this.N, fvb.N) && n3.c(this.P, fvb.P) && n3.c(this.j, fvb.j) && n3.c(this.g, fvb.g) && n3.c(this.c, fvb.c) && n3.c(this.y, fvb.y) && n3.c(this.t, fvb.t) && n3.c(this.i, fvb.i) && n3.c(this.V, fvb.V) && n3.c(this.o, fvb.o) && n3.c(this.K, fvb.K) && n3.c(this.J, fvb.J) && n3.c(this.Y, fvb.Y) && n3.c(this.h, fvb.h) && n3.c(this.I, fvb.I);
    }

    public final int hashCode() {
        long j = this.R;
        int i = n3.R;
        int e = jQ.e(this.X, jQ.e(this.e, jQ.e(this.v, ejC.R(j) * 31, 31), 31), 31);
        return ejC.R(this.I) + jQ.e(this.h, jQ.e(this.Y, jQ.e(this.J, jQ.e(this.K, jQ.e(this.o, jQ.e(this.V, jQ.e(this.i, jQ.e(this.t, jQ.e(this.y, jQ.e(this.c, jQ.e(this.g, jQ.e(this.j, jQ.e(this.P, jQ.e(this.N, jQ.e(this.C, jQ.e(this.U, jQ.e(this.H, jQ.e(this.x, jQ.e(this.m, jQ.e(this.Z, jQ.e(this.L, jQ.e(this.O, (this.f3439R.hashCode() + e) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final h0T v(boolean z, m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(2080722220);
        h0T s = l6.s(new n3(z ? this.R : this.v), jr_);
        jr_.g(false);
        return s;
    }
}
