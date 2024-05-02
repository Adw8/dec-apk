package defpackage;

import android.view.View;
import java.util.UUID;

/* renamed from: daH  reason: default package */
/* loaded from: classes.dex */
public abstract class daH {
    public static final kPU R = l6.y(fzi.V);

    public static final void R(f_c f_c, fDb fdb, iv7 iv7, m88 m88, int i, int i2) {
        int i3;
        f_c f_c2;
        jr_ jr_ = (jr_) m88;
        jr_.q(187306684);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            f_c2 = f_c;
        } else if ((i & 14) == 0) {
            f_c2 = f_c;
            i3 = (jr_.O(f_c2) ? 4 : 2) | i;
        } else {
            f_c2 = f_c;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= jr_.O(fdb) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= jr_.O(iv7) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !jr_.J()) {
            f_c f_c3 = i4 != 0 ? null : f_c2;
            View view = (View) jr_.x(ur.X);
            owM owm = lnF.X;
            jJj jjj = (jJj) jr_.x(owm);
            String str = (String) jr_.x(R);
            owM owm2 = lnF.H;
            mdz mdz = (mdz) jr_.x(owm2);
            ngM W = l6.W(jr_);
            h0T s = l6.s(iv7, jr_);
            UUID uuid = (UUID) cpc.T(new Object[0], null, ggT.R, jr_, 6);
            jr_.w(-492369756);
            Object I = jr_.I();
            boolean z = true;
            if (I == ppN.R) {
                gv2 gv2 = new gv2(f_c3, view, jjj, fdb, uuid);
                azM azm = new azM(gv2, 4, s);
                z = true;
                dNH u = aH9.u(azm, true, 686046343);
                gv2.setParentCompositionContext(W);
                gv2.c.R(u);
                gv2.f3985c = true;
                jr_.ZW(gv2);
                I = gv2;
            }
            jr_.g(false);
            gv2 gv22 = (gv2) I;
            caw.v(gv22, new ar(gv22, f_c3, str, mdz, 3), jr_);
            caw.L(new nHl(gv22, f_c3, str, mdz, 1), jr_);
            caw.v(fdb, new V4(gv22, 12, fdb), jr_);
            ncu u2 = g4x.u(aff.R, new h8Y(gv22, 0));
            jvQ jvq = new jvQ(gv22, mdz, 0);
            jr_.w(-1323940314);
            jJj jjj2 = (jJj) jr_.x(owm);
            mdz mdz2 = (mdz) jr_.x(owm2);
            bUo buo = (bUo) jr_.x(lnF.P);
            h1U.R.getClass();
            fme fme = igT.R;
            dNH b = aH9.b(u2);
            if (jr_.f5052R instanceof Su) {
                jr_.mL();
                if (jr_.f5050L) {
                    jr_.H(fme);
                } else {
                    jr_.BF();
                }
                jr_.f5078e = false;
                l6.p(jr_, jvq, igT.c);
                l6.p(jr_, jjj2, igT.v);
                l6.p(jr_, mdz2, igT.e);
                jQ.o(0, b, jQ.m(jr_, buo, igT.X, jr_), jr_, 2058660585, 975527269);
                jQ.K(jr_, false, false, z, false);
                f_c2 = f_c3;
            } else {
                l6.u();
                throw null;
            }
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new iW6(f_c2, fdb, iv7, i, i2, 0);
        }
    }
}
