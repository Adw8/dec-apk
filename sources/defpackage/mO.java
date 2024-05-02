package defpackage;

/* renamed from: mO  reason: default package */
/* loaded from: classes.dex */
public abstract class mO extends nfJ implements aOO, jy_ {
    public final nbD R;

    public mO(nbD nbd, boolean z) {
        super(z);
        D((pd2) nbd.O(hw1.O));
        this.R = nbd.M(this);
    }

    public void BF(Throwable th, boolean z) {
    }

    @Override // defpackage.jy_
    public final nbD C() {
        return this.R;
    }

    @Override // defpackage.nfJ
    public final void F(j8f j8f) {
        pdD.o(this.R, j8f);
    }

    @Override // defpackage.nfJ
    public final String I() {
        return getClass().getSimpleName() + " was cancelled";
    }

    public void Kl(Object obj) {
    }

    @Override // defpackage.nfJ, defpackage.pd2
    public boolean X() {
        return super.X();
    }

    @Override // defpackage.aOO
    public final void Y(Object obj) {
        Throwable R = mwl.R(obj);
        if (R != null) {
            obj = new pag(R, false);
        }
        Object _ = _(obj);
        if (_ != dTl.f2624v) {
            vz(_);
        }
    }

    @Override // defpackage.nfJ
    public String mL() {
        return super.mL();
    }

    public final void mZ(int i, mO mOVar, iv7 iv7) {
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 0) {
                try {
                    ooA.V(n3x.U(n3x.L(mOVar, this, iv7)), o8s.R, null);
                } finally {
                    Y(new bvw(th));
                }
            } else if (i2 == 1) {
            } else {
                if (i2 == 2) {
                    n3x.U(n3x.L(mOVar, this, iv7)).Y(o8s.R);
                } else if (i2 == 3) {
                    try {
                        nbD nbd = this.R;
                        Object i3 = cU5.i(nbd, null);
                        gvP.L(2, iv7);
                        Object J = iv7.J(mOVar, this);
                        cU5.C(nbd, i3);
                        if (J != bGR.COROUTINE_SUSPENDED) {
                            Y(J);
                        }
                    } catch (Throwable th) {
                    }
                } else {
                    throw new j8f((Object) null);
                }
            }
        } else {
            throw null;
        }
    }

    @Override // defpackage.aOO
    public final nbD v() {
        return this.R;
    }

    @Override // defpackage.nfJ
    public final void vl(Object obj) {
        if (obj instanceof pag) {
            pag pag = (pag) obj;
            BF(pag.f7100R, pag.R());
            return;
        }
        Kl(obj);
    }

    public void vz(Object obj) {
        y(obj);
    }
}
