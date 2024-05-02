package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashSet;

/* renamed from: e7  reason: default package */
/* loaded from: classes.dex */
public final class e7 extends j28 implements mGu, hYk, oYk, hUv, oSr, e6u, bS6, dnR, jo5, lqm, oFl, J2 {
    public eo1 R;

    /* renamed from: R  reason: collision with other field name */
    public hjM f2979R;

    /* renamed from: R  reason: collision with other field name */
    public mR f2981R;
    public boolean v = true;

    /* renamed from: R  reason: collision with other field name */
    public HashSet f2980R = new HashSet();

    public e7(eo1 eo1) {
        this.e = msU.i(eo1);
        this.R = eo1;
    }

    public final void H() {
        if (((j28) this).f4792R) {
            eo1 eo1 = this.R;
            boolean z = true;
            if ((this.e & 32) != 0) {
                if (eo1 instanceof bpk) {
                    bLT modifierLocalManager = msU.BF(this).getModifierLocalManager();
                    modifierLocalManager.c.v(new kSh(msU.vz(this), ((bpk) eo1).r()));
                    modifierLocalManager.R();
                }
                if (eo1 instanceof lHr) {
                    ((lHr) eo1).P(iTI.R);
                }
            }
            if ((this.e & 8) == 0) {
                z = false;
            }
            if (z) {
                ((AndroidComposeView) msU.BF(this)).j();
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // defpackage.j28
    public final void L() {
        H();
    }

    @Override // defpackage.j28
    public final void O() {
        Z(true);
    }

    public final void U() {
        if (((j28) this).f4792R) {
            this.f2980R.clear();
            pcP snapshotObserver = msU.BF(this).getSnapshotObserver();
            dq dqVar = iTI.R;
            snapshotObserver.R(this, nqF.Y, new Z8(this, 3));
        }
    }

    public final void Z(boolean z) {
        if (((j28) this).f4792R) {
            eo1 eo1 = this.R;
            boolean z2 = true;
            if ((this.e & 32) != 0) {
                if (eo1 instanceof bpk) {
                    bpk bpk = (bpk) eo1;
                    mR mRVar = this.f2981R;
                    if (mRVar == null || !mRVar.C(bpk.r())) {
                        this.f2981R = new mR(bpk);
                        if (((j28) msU.vz(this).f3600R.c).f4792R) {
                            bLT modifierLocalManager = msU.BF(this).getModifierLocalManager();
                            modifierLocalManager.R.v(new kSh(this, bpk.r()));
                            modifierLocalManager.R();
                        }
                    } else {
                        mRVar.R = bpk;
                        bLT modifierLocalManager2 = msU.BF(this).getModifierLocalManager();
                        modifierLocalManager2.v.v(new kSh(this, bpk.r()));
                        modifierLocalManager2.R();
                    }
                }
                if (eo1 instanceof lHr) {
                    if (z) {
                        U();
                    } else {
                        Z8 z8 = new Z8(this, 0);
                        AndroidComposeView androidComposeView = (AndroidComposeView) msU.BF(this);
                        if (!androidComposeView.f1196R.Z(z8)) {
                            androidComposeView.f1196R.v(z8);
                        }
                    }
                }
            }
            if ((this.e & 4) != 0) {
                if (eo1 instanceof lYY) {
                    this.v = true;
                }
                msU.ZW(this, 2).FP();
            }
            if ((this.e & 2) != 0) {
                if (((j28) msU.vz(this).f3600R.c).f4792R) {
                    poS pos = ((j28) this).f4791R;
                    ((l_W) pos).f5779R = this;
                    pos.q_();
                }
                msU.ZW(this, 2).FP();
                msU.vz(this).V();
            }
            if (eo1 instanceof aG3) {
                ((aG3) eo1).R.c.R(this);
            }
            if ((this.e & 128) != 0) {
                if ((eo1 instanceof kES) && ((j28) msU.vz(this).f3600R.c).f4792R) {
                    msU.vz(this).V();
                }
                if (eo1 instanceof mij) {
                    this.f2979R = null;
                    if (((j28) msU.vz(this).f3600R.c).f4792R) {
                        AndroidComposeView androidComposeView2 = (AndroidComposeView) msU.BF(this);
                        androidComposeView2.f1209R.f4938R.v(new VP(this));
                        androidComposeView2.t(null);
                    }
                }
            }
            if (((this.e & 256) != 0) && (eo1 instanceof cIc) && ((j28) msU.vz(this).f3600R.c).f4792R) {
                msU.vz(this).V();
            }
            if (((this.e & 16) != 0) && (eo1 instanceof h_4)) {
                ((h_4) eo1).k().R = ((j28) this).f4791R;
            }
            if ((this.e & 8) == 0) {
                z2 = false;
            }
            if (z2) {
                ((AndroidComposeView) msU.BF(this)).j();
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // defpackage.J2
    public final long c() {
        return iTI.J(((l0f) msU.ZW(this, 128)).R);
    }

    @Override // defpackage.hUv
    public final kEW e() {
        return ((b2X) ((ed5) this.R)).f1512R;
    }

    @Override // defpackage.J2
    public final jJj getDensity() {
        return msU.vz(this).f3599R;
    }

    @Override // defpackage.J2
    public final mdz getLayoutDirection() {
        return msU.vz(this).f3603R;
    }

    @Override // defpackage.oFl
    public final boolean isValid() {
        return ((j28) this).f4792R;
    }

    public final int m(mZf mzf, cxM cxm, int i) {
        return ((gl4) this.R).X(mzf, cxm, i);
    }

    public final String toString() {
        return this.R.toString();
    }

    @Override // defpackage.bS6
    public final Object v(bsy bsy) {
        jal jal;
        this.f2980R.add(bsy);
        j28 j28 = ((j28) this).R;
        if (j28.f4792R) {
            j28 j282 = j28.v;
            fue vz = msU.vz(this);
            while (vz != null) {
                if ((((j28) vz.f3600R.e).X & 32) != 0) {
                    while (j282 != null) {
                        if ((j282.e & 32) != 0 && (j282 instanceof e6u)) {
                            e7 e7Var = (e7) ((e6u) j282);
                            caw caw = e7Var.f2981R;
                            if (caw == null) {
                                caw = mcF.R;
                            }
                            if (caw.C(bsy)) {
                                caw caw2 = e7Var.f2981R;
                                if (caw2 == null) {
                                    caw2 = mcF.R;
                                }
                                return caw2.t(bsy);
                            }
                        }
                        j282 = j282.v;
                    }
                }
                vz = vz.N();
                j282 = (vz == null || (jal = vz.f3600R) == null) ? null : (j28) jal.c;
            }
            return bsy.R.g();
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int x(mZf mzf, cxM cxm, int i) {
        return ((gl4) this.R).p(mzf, cxm, i);
    }
}
