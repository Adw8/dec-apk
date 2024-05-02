package defpackage;

import java.util.ArrayList;

/* renamed from: FC  reason: default package */
/* loaded from: classes.dex */
public final class FC implements fiv {

    /* renamed from: R  reason: collision with other field name */
    public gw f117R;
    public gw v;

    /* renamed from: R  reason: collision with other field name */
    public final lE f118R = new lE();
    public final JF R = new JF(this);

    public static long O(float f, long j) {
        return !((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0) ? n3.v(j, n3.e(j) * f) : j;
    }

    public static gw R(FC fc, long j, dgk dgk, float f, Iw iw, int i) {
        fiv.R.getClass();
        int i2 = clQ.v;
        gw Z = fc.Z(dgk);
        long O = O(f, j);
        if (!n3.c(aH9.X(Z.f3991R.getColor()), O)) {
            Z.X(O);
        }
        if (Z.f3992R != null) {
            Z.f3992R = null;
            Z.f3991R.setShader(null);
        }
        if (!n3x.v(Z.f3990R, iw)) {
            Z.O(iw);
        }
        boolean z = true;
        if (!(Z.R == i)) {
            Z.R = i;
            lys.R.R(Z.f3991R, i);
        }
        if (Z.R() != i2) {
            z = false;
        }
        if (!z) {
            Z.L(i2);
        }
        return Z;
    }

    public static gw X(FC fc, long j, float f, int i, float f2, Iw iw, int i2) {
        fiv.R.getClass();
        int i3 = clQ.v;
        gw L = fc.L();
        long O = O(f2, j);
        if (!n3.c(aH9.X(L.f3991R.getColor()), O)) {
            L.X(O);
        }
        if (L.f3992R != null) {
            L.f3992R = null;
            L.f3991R.setShader(null);
        }
        if (!n3x.v(L.f3990R, iw)) {
            L.O(iw);
        }
        boolean z = true;
        if (!(L.R == i2)) {
            L.R = i2;
            lys.R.R(L.f3991R, i2);
        }
        if (!(L.f3991R.getStrokeWidth() == f)) {
            L.f3991R.setStrokeWidth(f);
        }
        if (!(L.f3991R.getStrokeMiter() == 4.0f)) {
            L.f3991R.setStrokeMiter(4.0f);
        }
        if (!(L.v() == i)) {
            L.Z(i);
        }
        if (!(L.c() == 0)) {
            L.m(0);
        }
        if (!n3x.v(null, null)) {
            L.f3991R.setPathEffect(null);
        }
        if (L.R() != i3) {
            z = false;
        }
        if (!z) {
            L.L(i3);
        }
        return L;
    }

    public static gw e(FC fc, a1 a1Var, dgk dgk, float f, Iw iw, int i) {
        fiv.R.getClass();
        return fc.v(a1Var, dgk, f, iw, i, clQ.v);
    }

    @Override // defpackage.jJj
    public final float D() {
        return this.f118R.f5619R.D();
    }

    @Override // defpackage.fiv
    public final void E(cnO cno, long j, float f, dgk dgk, Iw iw, int i) {
        this.f118R.f5618R.X(cno, R(this, j, dgk, f, iw, i));
    }

    @Override // defpackage.fiv
    public final JF G() {
        return this.R;
    }

    @Override // defpackage.fiv
    public final void Kl(aCQ acq, long j, long j2, long j3, long j4, float f, dgk dgk, Iw iw, int i, int i2) {
        this.f118R.f5618R.R(acq, j, j2, j3, j4, v(null, dgk, f, iw, i, i2));
    }

    public final gw L() {
        gw gwVar = this.v;
        if (gwVar != null) {
            return gwVar;
        }
        gw gwVar2 = new gw();
        int i = iWF.R;
        gwVar2.x(1);
        this.v = gwVar2;
        return gwVar2;
    }

    @Override // defpackage.fiv
    public final void N(long j, long j2, long j3, float f, int i, float f2, Iw iw, int i2) {
        this.f118R.f5618R.c(j2, j3, X(this, j, f, i, f2, iw, i2));
    }

    @Override // defpackage.fiv
    public final void Q(long j, float f, float f2, long j2, long j3, float f3, dgk dgk, Iw iw, int i) {
        this.f118R.f5618R.P(aWo.e(j2), aWo.X(j2), nqW.e(j3) + aWo.e(j2), nqW.v(j3) + aWo.X(j2), f, f2, R(this, j, dgk, f3, iw, i));
    }

    @Override // defpackage.fiv
    public final void V(long j, float f, long j2, float f2, dgk dgk, Iw iw, int i) {
        this.f118R.f5618R.e(f, j2, R(this, j, dgk, f2, iw, i));
    }

    public final gw Z(dgk dgk) {
        boolean z = false;
        if (n3x.v(dgk, faV.R)) {
            gw gwVar = this.f117R;
            if (gwVar != null) {
                return gwVar;
            }
            gw gwVar2 = new gw();
            gwVar2.x(0);
            this.f117R = gwVar2;
            return gwVar2;
        } else if (dgk instanceof gug) {
            gw L = L();
            float strokeWidth = L.f3991R.getStrokeWidth();
            gug gug = (gug) dgk;
            float f = gug.R;
            if (!(strokeWidth == f)) {
                L.f3991R.setStrokeWidth(f);
            }
            int v = L.v();
            int i = gug.f3975R;
            if (!(v == i)) {
                L.Z(i);
            }
            float strokeMiter = L.f3991R.getStrokeMiter();
            float f2 = gug.v;
            if (!(strokeMiter == f2)) {
                L.f3991R.setStrokeMiter(f2);
            }
            int c = L.c();
            int i2 = gug.f3976v;
            if (c == i2) {
                z = true;
            }
            if (!z) {
                L.m(i2);
            }
            if (!n3x.v(null, null)) {
                L.f3991R.setPathEffect(null);
            }
            return L;
        } else {
            throw new j8f((Object) null);
        }
    }

    @Override // defpackage.fiv
    public final void a(ArrayList arrayList, long j, float f, int i, float f2, Iw iw, int i2) {
        this.f118R.f5618R.x(X(this, j, f, i, f2, iw, i2), arrayList);
    }

    @Override // defpackage.fiv
    public final void d(long j, long j2, long j3, float f, dgk dgk, Iw iw, int i) {
        this.f118R.f5618R.t(aWo.e(j2), aWo.X(j2), nqW.e(j3) + aWo.e(j2), nqW.v(j3) + aWo.X(j2), R(this, j, dgk, f, iw, i));
    }

    @Override // defpackage.fiv
    public final mdz getLayoutDirection() {
        return this.f118R.f5620R;
    }

    @Override // defpackage.fiv
    public final void h(a1 a1Var, long j, long j2, float f, dgk dgk, Iw iw, int i) {
        this.f118R.f5618R.t(aWo.e(j), aWo.X(j), nqW.e(j2) + aWo.e(j), nqW.v(j2) + aWo.X(j), e(this, a1Var, dgk, f, iw, i));
    }

    @Override // defpackage.fiv
    public final void mL(a1 a1Var, long j, long j2, float f, int i, float f2, Iw iw, int i2) {
        Gp gp = this.f118R.f5618R;
        fiv.R.getClass();
        int i3 = clQ.v;
        gw L = L();
        a1Var.R(f2, c(), L);
        if (!n3x.v(L.f3990R, iw)) {
            L.O(iw);
        }
        boolean z = false;
        if (!(L.R == i2)) {
            L.R = i2;
            lys.R.R(L.f3991R, i2);
        }
        if (!(L.f3991R.getStrokeWidth() == f)) {
            L.f3991R.setStrokeWidth(f);
        }
        if (!(L.f3991R.getStrokeMiter() == 4.0f)) {
            L.f3991R.setStrokeMiter(4.0f);
        }
        if (!(L.v() == i)) {
            L.Z(i);
        }
        if (!(L.c() == 0)) {
            L.m(0);
        }
        if (!n3x.v(null, null)) {
            L.f3991R.setPathEffect(null);
        }
        if (L.R() == i3) {
            z = true;
        }
        if (!z) {
            L.L(i3);
        }
        gp.c(j, j2, L);
    }

    @Override // defpackage.fiv
    public final void o(cnO cno, a1 a1Var, float f, dgk dgk, Iw iw, int i) {
        this.f118R.f5618R.X(cno, e(this, a1Var, dgk, f, iw, i));
    }

    public final gw v(a1 a1Var, dgk dgk, float f, Iw iw, int i, int i2) {
        gw Z = Z(dgk);
        boolean z = true;
        if (a1Var != null) {
            a1Var.R(f, c(), Z);
        } else {
            if (!(((float) Z.f3991R.getAlpha()) / 255.0f == f)) {
                Z.e(f);
            }
        }
        if (!n3x.v(Z.f3990R, iw)) {
            Z.O(iw);
        }
        if (!(Z.R == i)) {
            Z.R = i;
            lys.R.R(Z.f3991R, i);
        }
        if (Z.R() != i2) {
            z = false;
        }
        if (!z) {
            Z.L(i2);
        }
        return Z;
    }

    @Override // defpackage.fiv
    public final void vl(a1 a1Var, long j, long j2, long j3, float f, dgk dgk, Iw iw, int i) {
        this.f118R.f5618R.N(aWo.e(j), aWo.X(j), aWo.e(j) + nqW.e(j2), aWo.X(j) + nqW.v(j2), buB.v(j3), buB.c(j3), e(this, a1Var, dgk, f, iw, i));
    }

    @Override // defpackage.jJj
    public final float vr() {
        return this.f118R.f5619R.vr();
    }

    @Override // defpackage.fiv
    public final void wm(aCQ acq, long j, float f, dgk dgk, Iw iw, int i) {
        this.f118R.f5618R.v(acq, j, e(this, null, dgk, f, iw, i));
    }

    @Override // defpackage.fiv
    public final void xN(long j, long j2, long j3, long j4, dgk dgk, float f, Iw iw, int i) {
        this.f118R.f5618R.N(aWo.e(j2), aWo.X(j2), nqW.e(j3) + aWo.e(j2), nqW.v(j3) + aWo.X(j2), buB.v(j4), buB.c(j4), R(this, j, dgk, f, iw, i));
    }
}
