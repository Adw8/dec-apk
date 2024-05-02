package defpackage;

import dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel;

/* renamed from: gbA  reason: default package */
/* loaded from: classes.dex */
public final class gbA extends k8G implements iv7 {
    public final /* synthetic */ OverviewViewModel R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gbA(OverviewViewModel overviewViewModel, int i) {
        super(2);
        this.X = i;
        this.R = overviewViewModel;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 1:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            default:
                R((m88) obj, ((Number) obj2).intValue());
                break;
        }
        return o8s.R;
    }

    public final void R(m88 m88, int i) {
        switch (this.X) {
            case 0:
                if ((i & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                vd.v(null, "Delete", new dTe(this.R, 1), m88, 48, 1);
                return;
            case 1:
                if ((i & 11) == 2) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                vd.v(null, "Cancel", new dTe(this.R, 2), m88, 48, 1);
                return;
            default:
                if ((i & 11) == 2) {
                    jr_ jr_3 = (jr_) m88;
                    if (jr_3.J()) {
                        jr_3.E();
                        return;
                    }
                }
                prr prr = adU.f942R;
                FW fw = nA.v;
                OverviewViewModel overviewViewModel = this.R;
                jr_ jr_4 = (jr_) m88;
                jr_4.w(693286680);
                bF9 R = ktl.R(fw, dq.f2879R, jr_4);
                jr_4.w(-1323940314);
                jJj jjj = (jJj) jr_4.x(lnF.X);
                mdz mdz = (mdz) jr_4.x(lnF.H);
                bUo buo = (bUo) jr_4.x(lnF.P);
                h1U.R.getClass();
                fme fme = igT.R;
                dNH b = aH9.b(prr);
                if (jr_4.f5052R instanceof Su) {
                    jr_4.mL();
                    if (jr_4.f5050L) {
                        jr_4.H(fme);
                    } else {
                        jr_4.BF();
                    }
                    jr_4.f5078e = false;
                    l6.p(jr_4, R, igT.c);
                    l6.p(jr_4, jjj, igT.v);
                    l6.p(jr_4, mdz, igT.e);
                    b.y(jQ.m(jr_4, buo, igT.X, jr_4), jr_4, 0);
                    jr_4.w(2058660585);
                    jr_4.w(-678309503);
                    vd.v(null, "Try again", new dTe(overviewViewModel, 3), jr_4, 48, 1);
                    jQ.K(jr_4, false, false, true, false);
                    jr_4.g(false);
                    return;
                }
                l6.u();
                throw null;
        }
    }
}
