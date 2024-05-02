package defpackage;

/* renamed from: E2  reason: default package */
/* loaded from: classes.dex */
public final class E2 {
    public final oST C;
    public final oST H;
    public final oST I;
    public final oST J;
    public final oST K;
    public final oST L;
    public final oST N;
    public final oST O;
    public final oST P;
    public final oST R;
    public final oST U;
    public final oST V;
    public final oST X;
    public final oST Y;
    public final oST Z;
    public final oST c;
    public final oST e;
    public final oST g;
    public final oST h;
    public final oST i;
    public final oST j;
    public final oST m;
    public final oST o;
    public final oST t;
    public final oST u;
    public final oST v;
    public final oST x;
    public final oST y;
    public final oST z;

    public E2(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        n3 n3Var = new n3(j);
        bHa bha = bHa.R;
        this.R = new oST(n3Var, bha);
        this.v = new oST(new n3(j2), bha);
        this.c = new oST(new n3(j3), bha);
        this.e = new oST(new n3(j4), bha);
        this.X = new oST(new n3(j5), bha);
        this.O = new oST(new n3(j6), bha);
        this.L = new oST(new n3(j7), bha);
        this.Z = new oST(new n3(j8), bha);
        this.m = new oST(new n3(j9), bha);
        this.x = new oST(new n3(j10), bha);
        this.H = new oST(new n3(j11), bha);
        this.U = new oST(new n3(j12), bha);
        this.C = new oST(new n3(j13), bha);
        this.N = new oST(new n3(j14), bha);
        this.P = new oST(new n3(j15), bha);
        this.j = new oST(new n3(j16), bha);
        this.g = new oST(new n3(j17), bha);
        this.y = new oST(new n3(j18), bha);
        this.t = new oST(new n3(j19), bha);
        this.i = new oST(new n3(j20), bha);
        this.V = new oST(new n3(j21), bha);
        this.o = new oST(new n3(j22), bha);
        this.K = new oST(new n3(j23), bha);
        this.J = new oST(new n3(j24), bha);
        this.Y = new oST(new n3(j25), bha);
        this.h = new oST(new n3(j26), bha);
        this.I = new oST(new n3(j27), bha);
        this.u = new oST(new n3(j28), bha);
        this.z = new oST(new n3(j29), bha);
    }

    public static E2 R(E2 e2, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        long y = (i & 1) != 0 ? e2.y() : j;
        long x = (i & 2) != 0 ? e2.x() : j2;
        long t = (i & 4) != 0 ? e2.t() : j3;
        long H = (i & 8) != 0 ? e2.H() : j4;
        long j7 = (i & 16) != 0 ? ((n3) e2.X.getValue()).f6279R : 0;
        long i2 = (i & 32) != 0 ? e2.i() : 0;
        long U = (i & 64) != 0 ? e2.U() : 0;
        long V = (i & 128) != 0 ? e2.V() : 0;
        long C = (i & 256) != 0 ? e2.C() : 0;
        long Y = (i & 512) != 0 ? e2.Y() : 0;
        long j8 = (i & 1024) != 0 ? e2.j() : 0;
        long h = (i & 2048) != 0 ? e2.h() : 0;
        long g = (i & 4096) != 0 ? e2.g() : 0;
        long v = (i & 8192) != 0 ? e2.v() : 0;
        long L = (i & 16384) != 0 ? e2.L() : 0;
        long o = (32768 & i) != 0 ? e2.o() : 0;
        long N = (65536 & i) != 0 ? e2.N() : 0;
        long J = (131072 & i) != 0 ? e2.J() : j5;
        long P = (262144 & i) != 0 ? e2.P() : j6;
        long K = (524288 & i) != 0 ? e2.K() : 0;
        long O = (1048576 & i) != 0 ? e2.O() : 0;
        long X = (2097152 & i) != 0 ? e2.X() : 0;
        long c = (4194304 & i) != 0 ? e2.c() : 0;
        long Z = (8388608 & i) != 0 ? e2.Z() : 0;
        long e = (16777216 & i) != 0 ? e2.e() : 0;
        long m = (33554432 & i) != 0 ? e2.m() : 0;
        long j9 = (67108864 & i) != 0 ? ((n3) e2.I.getValue()).f6279R : 0;
        long j10 = (134217728 & i) != 0 ? ((n3) e2.u.getValue()).f6279R : 0;
        long j11 = (i & 268435456) != 0 ? ((n3) e2.z.getValue()).f6279R : 0;
        e2.getClass();
        return new E2(y, x, t, H, j7, i2, U, V, C, Y, j8, h, g, v, L, o, N, J, P, K, O, X, c, Z, e, m, j9, j10, j11);
    }

    public final long C() {
        return ((n3) this.m.getValue()).f6279R;
    }

    public final long H() {
        return ((n3) this.e.getValue()).f6279R;
    }

    public final long J() {
        return ((n3) this.y.getValue()).f6279R;
    }

    public final long K() {
        return ((n3) this.i.getValue()).f6279R;
    }

    public final long L() {
        return ((n3) this.P.getValue()).f6279R;
    }

    public final long N() {
        return ((n3) this.g.getValue()).f6279R;
    }

    public final long O() {
        return ((n3) this.V.getValue()).f6279R;
    }

    public final long P() {
        return ((n3) this.t.getValue()).f6279R;
    }

    public final long U() {
        return ((n3) this.L.getValue()).f6279R;
    }

    public final long V() {
        return ((n3) this.Z.getValue()).f6279R;
    }

    public final long X() {
        return ((n3) this.o.getValue()).f6279R;
    }

    public final long Y() {
        return ((n3) this.x.getValue()).f6279R;
    }

    public final long Z() {
        return ((n3) this.J.getValue()).f6279R;
    }

    public final long c() {
        return ((n3) this.K.getValue()).f6279R;
    }

    public final long e() {
        return ((n3) this.Y.getValue()).f6279R;
    }

    public final long g() {
        return ((n3) this.C.getValue()).f6279R;
    }

    public final long h() {
        return ((n3) this.U.getValue()).f6279R;
    }

    public final long i() {
        return ((n3) this.O.getValue()).f6279R;
    }

    public final long j() {
        return ((n3) this.H.getValue()).f6279R;
    }

    public final long m() {
        return ((n3) this.h.getValue()).f6279R;
    }

    public final long o() {
        return ((n3) this.j.getValue()).f6279R;
    }

    public final long t() {
        return ((n3) this.c.getValue()).f6279R;
    }

    public final String toString() {
        StringBuilder U = opT.U("ColorScheme(primary=");
        U.append((Object) n3.m(y()));
        U.append("onPrimary=");
        U.append((Object) n3.m(x()));
        U.append("primaryContainer=");
        U.append((Object) n3.m(t()));
        U.append("onPrimaryContainer=");
        U.append((Object) n3.m(H()));
        U.append("inversePrimary=");
        U.append((Object) n3.m(((n3) this.X.getValue()).f6279R));
        U.append("secondary=");
        U.append((Object) n3.m(i()));
        U.append("onSecondary=");
        U.append((Object) n3.m(U()));
        U.append("secondaryContainer=");
        U.append((Object) n3.m(V()));
        U.append("onSecondaryContainer=");
        U.append((Object) n3.m(C()));
        U.append("tertiary=");
        U.append((Object) n3.m(Y()));
        U.append("onTertiary=");
        U.append((Object) n3.m(j()));
        U.append("tertiaryContainer=");
        U.append((Object) n3.m(h()));
        U.append("onTertiaryContainer=");
        U.append((Object) n3.m(g()));
        U.append("background=");
        U.append((Object) n3.m(v()));
        U.append("onBackground=");
        U.append((Object) n3.m(L()));
        U.append("surface=");
        U.append((Object) n3.m(o()));
        U.append("onSurface=");
        U.append((Object) n3.m(N()));
        U.append("surfaceVariant=");
        U.append((Object) n3.m(J()));
        U.append("onSurfaceVariant=");
        U.append((Object) n3.m(P()));
        U.append("surfaceTint=");
        U.append((Object) n3.m(K()));
        U.append("inverseSurface=");
        U.append((Object) n3.m(O()));
        U.append("inverseOnSurface=");
        U.append((Object) n3.m(X()));
        U.append("error=");
        U.append((Object) n3.m(c()));
        U.append("onError=");
        U.append((Object) n3.m(Z()));
        U.append("errorContainer=");
        U.append((Object) n3.m(e()));
        U.append("onErrorContainer=");
        U.append((Object) n3.m(m()));
        U.append("outline=");
        U.append((Object) n3.m(((n3) this.I.getValue()).f6279R));
        U.append("outlineVariant=");
        U.append((Object) n3.m(((n3) this.u.getValue()).f6279R));
        U.append("scrim=");
        U.append((Object) n3.m(((n3) this.z.getValue()).f6279R));
        U.append(')');
        return U.toString();
    }

    public final long v() {
        return ((n3) this.N.getValue()).f6279R;
    }

    public final long x() {
        return ((n3) this.v.getValue()).f6279R;
    }

    public final long y() {
        return ((n3) this.R.getValue()).f6279R;
    }
}
