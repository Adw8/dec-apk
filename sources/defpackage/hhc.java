package defpackage;

/* renamed from: hhc  reason: default package */
/* loaded from: classes.dex */
public final class hhc extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ lR3 R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hhc(lR3 lr3, int i, int i2) {
        super(2);
        this.X = i2;
        this.R = lr3;
        this.O = i;
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
                aH9.C(this.R, m88, this.O | 1);
                return;
            case 1:
                if ((i & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                FW fw = nA.v;
                ky kyVar = dq.f2891v;
                lR3 lr3 = this.R;
                int i2 = ((this.O >> 6) & 7168) | 432;
                jr_ jr_2 = (jr_) m88;
                jr_2.w(693286680);
                aff aff = aff.R;
                bF9 R = ktl.R(fw, kyVar, m88);
                jr_2.w(-1323940314);
                jJj jjj = (jJj) jr_2.x(lnF.X);
                mdz mdz = (mdz) jr_2.x(lnF.H);
                bUo buo = (bUo) jr_2.x(lnF.P);
                h1U.R.getClass();
                fme fme = igT.R;
                dNH b = aH9.b(aff);
                int i3 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
                if (jr_2.f5052R instanceof Su) {
                    jr_2.mL();
                    if (jr_2.f5050L) {
                        jr_2.H(fme);
                    } else {
                        jr_2.BF();
                    }
                    jr_2.f5078e = false;
                    l6.p(m88, R, igT.c);
                    l6.p(m88, jjj, igT.v);
                    l6.p(m88, mdz, igT.e);
                    l6.p(m88, buo, igT.X);
                    jr_2.j();
                    b.y(new k7Q(m88), m88, Integer.valueOf((i3 >> 3) & 112));
                    jr_2.w(2058660585);
                    jr_2.w(-678309503);
                    if (((i3 >> 9) & 14 & 11) != 2 || !jr_2.J()) {
                        lr3.y(nAL.R, m88, Integer.valueOf(((i2 >> 6) & 112) | 6));
                    } else {
                        jr_2.E();
                    }
                    jQ.K(jr_2, false, false, true, false);
                    jr_2.g(false);
                    return;
                }
                l6.u();
                throw null;
            default:
                if ((i & 11) == 2) {
                    jr_ jr_3 = (jr_) m88;
                    if (jr_3.J()) {
                        jr_3.E();
                        return;
                    }
                }
                lR3 lr32 = this.R;
                int i4 = (this.O >> 6) & 7168;
                jr_ jr_4 = (jr_) m88;
                jr_4.w(-483455358);
                aff aff2 = aff.R;
                bF9 R2 = VA.R(nA.f6330R, dq.f2881R, m88);
                jr_4.w(-1323940314);
                jJj jjj2 = (jJj) jr_4.x(lnF.X);
                mdz mdz2 = (mdz) jr_4.x(lnF.H);
                bUo buo2 = (bUo) jr_4.x(lnF.P);
                h1U.R.getClass();
                fme fme2 = igT.R;
                dNH b2 = aH9.b(aff2);
                int i5 = ((((i4 << 3) & 112) << 9) & 7168) | 6;
                if (jr_4.f5052R instanceof Su) {
                    jr_4.mL();
                    if (jr_4.f5050L) {
                        jr_4.H(fme2);
                    } else {
                        jr_4.BF();
                    }
                    jr_4.f5078e = false;
                    l6.p(m88, R2, igT.c);
                    l6.p(m88, jjj2, igT.v);
                    l6.p(m88, mdz2, igT.e);
                    l6.p(m88, buo2, igT.X);
                    jr_4.j();
                    b2.y(new k7Q(m88), m88, Integer.valueOf((i5 >> 3) & 112));
                    jr_4.w(2058660585);
                    jr_4.w(-1163856341);
                    if (((i5 >> 9) & 14 & 11) != 2 || !jr_4.J()) {
                        lr32.y(_n.R, m88, Integer.valueOf(((i4 >> 6) & 112) | 6));
                    } else {
                        jr_4.E();
                    }
                    jQ.K(jr_4, false, false, true, false);
                    jr_4.g(false);
                    return;
                }
                l6.u();
                throw null;
        }
    }
}
