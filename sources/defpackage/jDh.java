package defpackage;

import java.util.ArrayList;

/* renamed from: jDh  reason: default package */
/* loaded from: classes.dex */
public final class jDh implements fiv, ohT {
    public final FC R = new FC();

    /* renamed from: R  reason: collision with other field name */
    public oYk f4858R;

    @Override // defpackage.jJj
    public final int B(float f) {
        return this.R.B(f);
    }

    @Override // defpackage.jJj
    public final long C(long j) {
        return this.R.C(j);
    }

    @Override // defpackage.jJj
    public final float D() {
        return this.R.D();
    }

    @Override // defpackage.fiv
    public final void E(cnO cno, long j, float f, dgk dgk, Iw iw, int i) {
        this.R.E(cno, j, f, dgk, iw, i);
    }

    @Override // defpackage.fiv
    public final JF G() {
        return this.R.R;
    }

    @Override // defpackage.fiv
    public final void Kl(aCQ acq, long j, long j2, long j3, long j4, float f, dgk dgk, Iw iw, int i, int i2) {
        this.R.Kl(acq, j, j2, j3, j4, f, dgk, iw, i, i2);
    }

    @Override // defpackage.jJj
    public final long M(long j) {
        return this.R.M(j);
    }

    @Override // defpackage.fiv
    public final void N(long j, long j2, long j3, float f, int i, float f2, Iw iw, int i2) {
        this.R.N(j, j2, j3, f, i, f2, iw, i2);
    }

    @Override // defpackage.fiv
    public final void Q(long j, float f, float f2, long j2, long j3, float f3, dgk dgk, Iw iw, int i) {
        this.R.Q(j, f, f2, j2, j3, f3, dgk, iw, i);
    }

    public final void R(Gp gp, long j, poS pos, oYk oyk) {
        boolean z;
        oYk oyk2 = this.f4858R;
        this.f4858R = oyk;
        FC fc = this.R;
        mdz mdz = pos.f7272R.f3603R;
        lE lEVar = fc.f118R;
        jJj jjj = lEVar.f5619R;
        mdz mdz2 = lEVar.f5620R;
        Gp gp2 = lEVar.f5618R;
        long j2 = lEVar.R;
        lEVar.f5619R = pos;
        lEVar.f5620R = mdz;
        lEVar.f5618R = gp;
        lEVar.R = j;
        gp.y();
        e7 e7Var = (e7) oyk;
        eo1 eo1 = e7Var.R;
        g4j g4j = (g4j) eo1;
        if (e7Var.v && ((z = eo1 instanceof lYY))) {
            if (z) {
                msU.BF(e7Var).getSnapshotObserver().R(e7Var, nqF.K, new _c(eo1, 10, e7Var));
            }
            e7Var.v = false;
        }
        g4j.A(this);
        gp.j();
        lE lEVar2 = fc.f118R;
        lEVar2.f5619R = jjj;
        lEVar2.f5620R = mdz2;
        lEVar2.f5618R = gp2;
        lEVar2.R = j2;
        this.f4858R = oyk2;
    }

    @Override // defpackage.fiv
    public final void V(long j, float f, long j2, float f2, dgk dgk, Iw iw, int i) {
        this.R.V(j, f, j2, f2, dgk, iw, i);
    }

    @Override // defpackage.fiv
    public final void a(ArrayList arrayList, long j, float f, int i, float f2, Iw iw, int i2) {
        this.R.a(arrayList, j, f, i, f2, iw, i2);
    }

    @Override // defpackage.fiv
    public final long c() {
        return this.R.c();
    }

    @Override // defpackage.fiv
    public final void d(long j, long j2, long j3, float f, dgk dgk, Iw iw, int i) {
        this.R.d(j, j2, j3, f, dgk, iw, i);
    }

    @Override // defpackage.fiv
    public final mdz getLayoutDirection() {
        return this.R.f118R.f5620R;
    }

    @Override // defpackage.fiv
    public final void h(a1 a1Var, long j, long j2, float f, dgk dgk, Iw iw, int i) {
        this.R.h(a1Var, j, j2, f, dgk, iw, i);
    }

    @Override // defpackage.jJj
    public final float l(int i) {
        return this.R.l(i);
    }

    @Override // defpackage.fiv
    public final void mL(a1 a1Var, long j, long j2, float f, int i, float f2, Iw iw, int i2) {
        this.R.mL(a1Var, j, j2, f, i, f2, iw, i2);
    }

    @Override // defpackage.jJj
    public final float mZ(float f) {
        return this.R.D() * f;
    }

    @Override // defpackage.fiv
    public final void o(cnO cno, a1 a1Var, float f, dgk dgk, Iw iw, int i) {
        this.R.o(cno, a1Var, f, dgk, iw, i);
    }

    @Override // defpackage.jJj
    public final float q(float f) {
        return f / this.R.D();
    }

    @Override // defpackage.fiv
    public final long u() {
        return this.R.u();
    }

    public final void v() {
        Gp R = this.R.R.R();
        oYk oyk = this.f4858R;
        j28 j28 = ((j28) oyk).R.c;
        oYk oyk2 = null;
        if (j28 != null && (j28.X & 4) != 0) {
            while (j28 != null) {
                int i = j28.e;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    oyk2 = (oYk) j28;
                    break;
                } else {
                    j28 = j28.c;
                }
            }
        }
        if (oyk2 != null) {
            poS ZW = msU.ZW(oyk2, 4);
            long J = iTI.J(((l0f) ZW).R);
            fue fue = ZW.f7272R;
            fue.getClass();
            msU.Kl(fue).getSharedDrawScope().R(R, J, ZW, oyk2);
            return;
        }
        poS ZW2 = msU.ZW(oyk, 4);
        if (ZW2.ax() == oyk) {
            ZW2 = ZW2.f7280R;
        }
        ZW2.R2(R);
    }

    @Override // defpackage.fiv
    public final void vl(a1 a1Var, long j, long j2, long j3, float f, dgk dgk, Iw iw, int i) {
        this.R.vl(a1Var, j, j2, j3, f, dgk, iw, i);
    }

    @Override // defpackage.jJj
    public final float vr() {
        return this.R.vr();
    }

    @Override // defpackage.jJj
    public final float vz(long j) {
        return this.R.vz(j);
    }

    @Override // defpackage.fiv
    public final void wm(aCQ acq, long j, float f, dgk dgk, Iw iw, int i) {
        this.R.wm(acq, j, f, dgk, iw, i);
    }

    @Override // defpackage.fiv
    public final void xN(long j, long j2, long j3, long j4, dgk dgk, float f, Iw iw, int i) {
        this.R.xN(j, j2, j3, j4, dgk, f, iw, i);
    }
}
