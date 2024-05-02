package defpackage;

/* renamed from: PO  reason: default package */
/* loaded from: classes.dex */
public abstract class PO {
    public static final JE R = new JE(dq.R, false);

    /* renamed from: R  reason: collision with other field name */
    public static final uM f385R = uM.R;

    public static final void R(ncu ncu, m88 m88, int i) {
        int i2;
        jr_ jr_ = (jr_) m88;
        jr_.q(-211209833);
        if ((i & 14) == 0) {
            i2 = (jr_.O(ncu) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !jr_.J()) {
            uM uMVar = f385R;
            jr_.w(-1323940314);
            jJj jjj = (jJj) jr_.x(lnF.X);
            mdz mdz = (mdz) jr_.x(lnF.H);
            bUo buo = (bUo) jr_.x(lnF.P);
            h1U.R.getClass();
            fme fme = igT.R;
            dNH b = aH9.b(ncu);
            int i3 = (((((i2 << 3) & 112) | 384) << 9) & 7168) | 6;
            if (jr_.f5052R instanceof Su) {
                jr_.mL();
                if (jr_.f5050L) {
                    jr_.H(fme);
                } else {
                    jr_.BF();
                }
                jr_.f5078e = false;
                l6.p(jr_, uMVar, igT.c);
                l6.p(jr_, jjj, igT.v);
                l6.p(jr_, mdz, igT.e);
                b.y(jQ.m(jr_, buo, igT.X, jr_), jr_, Integer.valueOf((i3 >> 3) & 112));
                jr_.w(2058660585);
                jr_.w(1021196736);
                if (((i3 >> 9) & 14 & 11) == 2 && jr_.J()) {
                    jr_.E();
                }
                jQ.K(jr_, false, false, true, false);
            } else {
                l6.u();
                throw null;
            }
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new O_(ncu, i, 0);
        }
    }

    public static final Z1 c(pc0 pc0) {
        Object R2 = pc0.R();
        if (R2 instanceof Z1) {
            return (Z1) R2;
        }
        return null;
    }

    public static final bF9 e(Y6 y6, boolean z, m88 m88) {
        bF9 bf9;
        jr_ jr_ = (jr_) m88;
        jr_.w(56522820);
        if (!n3x.v(y6, dq.R) || z) {
            Boolean valueOf = Boolean.valueOf(z);
            jr_.w(511388516);
            boolean O = jr_.O(valueOf) | jr_.O(y6);
            Object I = jr_.I();
            if (O || I == ppN.R) {
                I = new JE(y6, z);
                jr_.ZW(I);
            }
            jr_.g(false);
            bf9 = (bF9) I;
        } else {
            bf9 = R;
        }
        jr_.g(false);
        return bf9;
    }

    public static final void v(h57 h57, l0f l0f, pc0 pc0, mdz mdz, int i, int i2, mz mzVar) {
        mz mzVar2;
        Z1 c = c(pc0);
        if (!(c == null || (mzVar2 = c.R) == null)) {
            mzVar = mzVar2;
        }
        long R2 = ((Y6) mzVar).R(iTI.R(l0f.e, l0f.X), iTI.R(i, i2), mdz);
        h57.getClass();
        h57.c(l0f, R2, 0.0f);
    }
}
