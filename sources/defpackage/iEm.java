package defpackage;

/* renamed from: iEm  reason: default package */
/* loaded from: classes.dex */
public final class iEm {
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

    public iEm(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
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
    }

    public final h0T R(boolean z, boolean z2, m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(337026738);
        h0T s = l6.s(new n3(z ? z2 ? this.c : this.X : z2 ? this.Z : this.x), jr_);
        jr_.g(false);
        return s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof iEm)) {
            return false;
        }
        iEm iem = (iEm) obj;
        return n3.c(this.R, iem.R) && n3.c(this.v, iem.v) && n3.c(this.c, iem.c) && n3.c(this.e, iem.e) && n3.c(this.X, iem.X) && n3.c(this.O, iem.O) && n3.c(this.L, iem.L) && n3.c(this.Z, iem.Z) && n3.c(this.m, iem.m) && n3.c(this.x, iem.x);
    }

    public final int hashCode() {
        long j = this.R;
        int i = n3.R;
        return ejC.R(this.x) + jQ.e(this.m, jQ.e(this.Z, jQ.e(this.L, jQ.e(this.O, jQ.e(this.X, jQ.e(this.e, jQ.e(this.c, jQ.e(this.v, ejC.R(j) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final h0T v(boolean z, boolean z2, m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(760609284);
        h0T s = l6.s(new n3(z ? z2 ? this.v : this.e : z2 ? this.L : this.m), jr_);
        jr_.g(false);
        return s;
    }
}
