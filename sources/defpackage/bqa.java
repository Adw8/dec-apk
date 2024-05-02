package defpackage;

import java.util.List;

/* renamed from: bqa  reason: default package */
/* loaded from: classes.dex */
public abstract class bqa {
    public static final kSh R;

    static {
        fcD fcd = fcD.R;
        R = new kSh(fcd, fcd);
    }

    public static final void R(bz bzVar, List list, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-110905764);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            m3 m3Var = (m3) list.get(i2);
            lR3 lr3 = (lR3) m3Var.f5897R;
            int i3 = m3Var.R;
            int i4 = m3Var.v;
            c6c c6c = c6c.R;
            jr_.w(-1323940314);
            aff aff = aff.R;
            jJj jjj = (jJj) jr_.x(lnF.X);
            mdz mdz = (mdz) jr_.x(lnF.H);
            bUo buo = (bUo) jr_.x(lnF.P);
            h1U.R.getClass();
            fme fme = igT.R;
            dNH b = aH9.b(aff);
            if (jr_.f5052R instanceof Su) {
                jr_.mL();
                if (jr_.f5050L) {
                    jr_.H(fme);
                } else {
                    jr_.BF();
                }
                jr_.f5078e = false;
                l6.p(jr_, c6c, igT.c);
                l6.p(jr_, jjj, igT.v);
                l6.p(jr_, mdz, igT.e);
                l6.p(jr_, buo, igT.X);
                jr_.j();
                b.y(new k7Q(jr_), jr_, 0);
                jr_.w(2058660585);
                jr_.w(-72427749);
                lr3.y(bzVar.subSequence(i3, i4).R, jr_, 0);
                jr_.g(false);
                jr_.g(false);
                jr_.g(true);
                jr_.g(false);
            } else {
                l6.u();
                throw null;
            }
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new yy(bzVar, list, i, 1);
        }
    }

    public static final d9j v(d9j d9j, bz bzVar, kMk kmk, jJj jjj, gP7 gp7, boolean z, int i, int i2, List list) {
        if (n3x.v(d9j.f2508R, bzVar) && n3x.v(d9j.f2512R, kmk)) {
            if (d9j.f2515R != z) {
                return new d9j(bzVar, kmk, i2, z, i, jjj, gp7, list);
            }
            if (!(d9j.v == i)) {
                return new d9j(bzVar, kmk, i2, z, i, jjj, gp7, list);
            }
            if (d9j.R == i2 && n3x.v(d9j.f2510R, jjj)) {
                if (n3x.v(d9j.f2511R, list) && d9j.f2509R == gp7) {
                    return d9j;
                }
                return new d9j(bzVar, kmk, i2, z, i, jjj, gp7, list);
            }
            return new d9j(bzVar, kmk, i2, z, i, jjj, gp7, list);
        }
        return new d9j(bzVar, kmk, i2, z, i, jjj, gp7, list);
    }
}
