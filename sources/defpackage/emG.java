package defpackage;

/* renamed from: emG  reason: default package */
/* loaded from: classes.dex */
public abstract class emG {
    public static final kPU R = l6.y(fzi.g);

    public static final void R(ncu ncu, n76 n76, long j, long j2, float f, float f2, lf lfVar, dNH dnh, m88 m88, int i, int i2) {
        jr_ jr_ = (jr_) m88;
        jr_.w(-513881741);
        ncu ncu2 = (i2 & 1) != 0 ? aff.R : ncu;
        n76 n762 = (i2 & 2) != 0 ? cUF.f2104R : n76;
        long o = (i2 & 4) != 0 ? ((E2) jr_.x(_1.R)).o() : j;
        long R2 = (i2 & 8) != 0 ? _1.R(o, jr_) : j2;
        float f3 = (i2 & 16) != 0 ? (float) 0 : f;
        float f4 = (i2 & 32) != 0 ? (float) 0 : f2;
        lf lfVar2 = (i2 & 64) != 0 ? null : lfVar;
        kPU kpu = R;
        float f5 = f3 + ((hoI) jr_.x(kpu)).R;
        l6.R(new bkv[]{kft.R.v(new n3(R2)), kpu.v(new hoI(f5))}, aH9.I(jr_, -70914509, new ogh(ncu2, n762, o, f5, i, lfVar2, f4, dnh)), jr_, 56);
        jr_.g(false);
    }

    public static final ncu c(ncu ncu, n76 n76, long j, lf lfVar, float f) {
        ncu ncu2;
        ncu J = n1P.J(ncu, f, n76);
        if (lfVar != null) {
            ncu2 = g4x.g(aff.R, lBz.Y, new kV(lfVar.R, n76, lfVar.f5797R));
        } else {
            ncu2 = aff.R;
        }
        return gQc.g(ooA.m(J.I(ncu2), j, n76), n76);
    }

    public static final long e(long j, float f, m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(-2079918090);
        owM owm = _1.R;
        if (n3.c(j, ((E2) jr_.x(owm)).o())) {
            j = _1.e((E2) jr_.x(owm), f);
        }
        jr_.g(false);
        return j;
    }

    public static final void v(f_c f_c, ncu ncu, boolean z, n76 n76, long j, long j2, float f, float f2, lf lfVar, p2E p2e, dNH dnh, m88 m88, int i, int i2) {
        p2E p2e2;
        jr_ jr_ = (jr_) m88;
        jr_.w(-789752804);
        ncu ncu2 = (i2 & 2) != 0 ? aff.R : ncu;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        n76 n762 = (i2 & 8) != 0 ? cUF.f2104R : n76;
        long o = (i2 & 16) != 0 ? ((E2) jr_.x(_1.R)).o() : j;
        long R2 = (i2 & 32) != 0 ? _1.R(o, jr_) : j2;
        float f3 = (i2 & 64) != 0 ? (float) 0 : f;
        float f4 = (i2 & 128) != 0 ? (float) 0 : f2;
        lf lfVar2 = (i2 & 256) != 0 ? null : lfVar;
        if ((i2 & 512) != 0) {
            jr_.w(-492369756);
            Object I = jr_.I();
            if (I == ppN.R) {
                I = new p2E();
                jr_.ZW(I);
            }
            jr_.g(false);
            p2e2 = (p2E) I;
        } else {
            p2e2 = p2e;
        }
        kPU kpu = R;
        float f5 = f3 + ((hoI) jr_.x(kpu)).R;
        l6.R(new bkv[]{kft.R.v(new n3(R2)), kpu.v(new hoI(f5))}, aH9.I(jr_, 1279702876, new bxF(ncu2, n762, o, f5, i, lfVar2, f4, p2e2, z2, f_c, dnh)), jr_, 56);
        jr_.g(false);
    }
}
