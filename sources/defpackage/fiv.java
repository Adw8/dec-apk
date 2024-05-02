package defpackage;

import java.util.ArrayList;

/* renamed from: fiv  reason: default package */
/* loaded from: classes.dex */
public interface fiv extends jJj {
    public static final clQ R = clQ.f2185R;

    static void BF(fiv fiv, a1 a1Var, long j, long j2, long j3, gug gug, int i) {
        int i2;
        long j4 = (i & 2) != 0 ? aWo.v : j;
        long t = (i & 4) != 0 ? t(fiv.c(), j4) : j2;
        long j5 = (i & 8) != 0 ? buB.f1848R : j3;
        float f = (i & 16) != 0 ? 1.0f : 0.0f;
        dgk dgk = (i & 32) != 0 ? faV.R : gug;
        if ((i & 128) != 0) {
            R.getClass();
            i2 = clQ.R;
        } else {
            i2 = 0;
        }
        fiv.vl(a1Var, j4, t, j5, f, dgk, null, i2);
    }

    static void H(fiv fiv, long j, long j2, long j3, int i) {
        int i2;
        long j4 = (i & 2) != 0 ? aWo.v : j2;
        long t = (i & 4) != 0 ? t(fiv.c(), j4) : j3;
        float f = (i & 8) != 0 ? 1.0f : 0.0f;
        faV fav = (i & 16) != 0 ? faV.R : null;
        if ((i & 64) != 0) {
            R.getClass();
            i2 = clQ.R;
        } else {
            i2 = 0;
        }
        fiv.d(j, j4, t, f, fav, null, i2);
    }

    static void K(fiv fiv, cnO cno, long j, gug gug) {
        R.getClass();
        fiv.E(cno, j, 1.0f, gug, null, clQ.R);
    }

    static void S(fiv fiv, cnO cno, a1 a1Var, float f, gug gug, int i) {
        int i2;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        faV fav = gug;
        if ((i & 8) != 0) {
            fav = faV.R;
        }
        if ((i & 32) != 0) {
            R.getClass();
            i2 = clQ.R;
        } else {
            i2 = 0;
        }
        fiv.o(cno, a1Var, f, fav, null, i2);
    }

    static void U(fiv fiv, long j, long j2, long j3, float f) {
        R.getClass();
        fiv.N(j, j2, j3, f, 1, 1.0f, null, clQ.R);
    }

    static void WD(fiv fiv, a1 a1Var, long j, long j2, float f, float f2, int i) {
        int i2;
        float f3 = (i & 8) != 0 ? 0.0f : f;
        float f4 = (i & 64) != 0 ? 1.0f : f2;
        if ((i & 256) != 0) {
            R.getClass();
            i2 = clQ.R;
        } else {
            i2 = 0;
        }
        fiv.mL(a1Var, j, j2, f3, 0, f4, null, i2);
    }

    static void X4(fiv fiv, long j, float f, long j2, int i) {
        int i2;
        float c = (i & 2) != 0 ? nqW.c(fiv.c()) / 2.0f : f;
        long u = (i & 4) != 0 ? fiv.u() : j2;
        float f2 = (i & 8) != 0 ? 1.0f : 0.0f;
        faV fav = (i & 16) != 0 ? faV.R : null;
        if ((i & 64) != 0) {
            R.getClass();
            i2 = clQ.R;
        } else {
            i2 = 0;
        }
        fiv.V(j, c, u, f2, fav, null, i2);
    }

    static void cE(fiv fiv, aCQ acq, long j, long j2, long j3, float f, Iw iw, int i, int i2) {
        long j4;
        int i3;
        int i4;
        long j5 = (i2 & 2) != 0 ? dU5.v : j;
        if ((i2 & 4) != 0) {
            lC lCVar = (lC) acq;
            j4 = iTI.R(lCVar.v(), lCVar.R());
        } else {
            j4 = j2;
        }
        long j6 = (i2 & 8) != 0 ? dU5.v : 0;
        long j7 = (i2 & 16) != 0 ? j4 : j3;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        faV fav = (i2 & 64) != 0 ? faV.R : null;
        Iw iw2 = (i2 & 128) != 0 ? null : iw;
        if ((i2 & 256) != 0) {
            R.getClass();
            i3 = clQ.R;
        } else {
            i3 = 0;
        }
        if ((i2 & 512) != 0) {
            R.getClass();
            i4 = clQ.v;
        } else {
            i4 = i;
        }
        fiv.Kl(acq, j5, j4, j6, j7, f2, fav, iw2, i3, i4);
    }

    static void cr(fiv fiv, aCQ acq, Iw iw) {
        long j = aWo.v;
        faV fav = faV.R;
        R.getClass();
        fiv.wm(acq, j, 1.0f, fav, iw, clQ.R);
    }

    static void s(fiv fiv, long j, long j2, long j3, long j4, dgk dgk, int i) {
        int i2;
        long j5 = (i & 2) != 0 ? aWo.v : j2;
        long t = (i & 4) != 0 ? t(fiv.c(), j5) : j3;
        long j6 = (i & 8) != 0 ? buB.f1848R : j4;
        dgk dgk2 = (i & 16) != 0 ? faV.R : dgk;
        float f = (i & 32) != 0 ? 1.0f : 0.0f;
        if ((i & 128) != 0) {
            R.getClass();
            i2 = clQ.R;
        } else {
            i2 = 0;
        }
        fiv.xN(j, j5, t, j6, dgk2, f, null, i2);
    }

    private static long t(long j, long j2) {
        return n1P.e(nqW.e(j) - aWo.e(j2), nqW.v(j) - aWo.X(j2));
    }

    static void w(fiv fiv, long j, float f, float f2, long j2, long j3, gug gug) {
        R.getClass();
        fiv.Q(j, f, f2, j2, j3, 1.0f, gug, null, clQ.R);
    }

    static void z(fiv fiv, a1 a1Var, long j, long j2, float f, dgk dgk, int i) {
        int i2;
        long j3 = (i & 2) != 0 ? aWo.v : j;
        long t = (i & 4) != 0 ? t(fiv.c(), j3) : j2;
        float f2 = (i & 8) != 0 ? 1.0f : f;
        dgk dgk2 = (i & 16) != 0 ? faV.R : dgk;
        if ((i & 64) != 0) {
            R.getClass();
            i2 = clQ.R;
        } else {
            i2 = 0;
        }
        fiv.h(a1Var, j3, t, f2, dgk2, null, i2);
    }

    void E(cnO cno, long j, float f, dgk dgk, Iw iw, int i);

    JF G();

    void Kl(aCQ acq, long j, long j2, long j3, long j4, float f, dgk dgk, Iw iw, int i, int i2);

    void N(long j, long j2, long j3, float f, int i, float f2, Iw iw, int i2);

    void Q(long j, float f, float f2, long j2, long j3, float f3, dgk dgk, Iw iw, int i);

    void V(long j, float f, long j2, float f2, dgk dgk, Iw iw, int i);

    void a(ArrayList arrayList, long j, float f, int i, float f2, Iw iw, int i2);

    default long c() {
        return G().v();
    }

    void d(long j, long j2, long j3, float f, dgk dgk, Iw iw, int i);

    mdz getLayoutDirection();

    void h(a1 a1Var, long j, long j2, float f, dgk dgk, Iw iw, int i);

    void mL(a1 a1Var, long j, long j2, float f, int i, float f2, Iw iw, int i2);

    void o(cnO cno, a1 a1Var, float f, dgk dgk, Iw iw, int i);

    default long u() {
        return n1P.N(G().v());
    }

    void vl(a1 a1Var, long j, long j2, long j3, float f, dgk dgk, Iw iw, int i);

    void wm(aCQ acq, long j, float f, dgk dgk, Iw iw, int i);

    void xN(long j, long j2, long j3, long j4, dgk dgk, float f, Iw iw, int i);
}
