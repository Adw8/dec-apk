package defpackage;

/* renamed from: ff  reason: default package */
/* loaded from: classes.dex */
public final class ff extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ lR3 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ngd f3494R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ff(ngd ngd, lR3 lr3, int i, int i2) {
        super(2);
        this.X = i2;
        this.f3494R = ngd;
        this.R = lr3;
        this.O = i;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
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
                ncu _ = aH9._(adU.v(aff.R, Al.R, Al.v), this.f3494R);
                oy oyVar = nA.f6329R;
                ky kyVar = dq.f2891v;
                lR3 lr3 = this.R;
                int i2 = ((this.O >> 18) & 7168) | 432;
                jr_ jr_2 = (jr_) m88;
                jr_2.w(693286680);
                bF9 R = ktl.R(oyVar, kyVar, m88);
                jr_2.w(-1323940314);
                jJj jjj = (jJj) jr_2.x(lnF.X);
                mdz mdz = (mdz) jr_2.x(lnF.H);
                bUo buo = (bUo) jr_2.x(lnF.P);
                h1U.R.getClass();
                fme fme = igT.R;
                dNH b = aH9.b(_);
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
                g1c.R(((c_P) ((jr_) m88).x(dB8.R)).C, aH9.I(m88, -2136309793, new ff(this.f3494R, this.R, this.O, 0)), m88, 48);
                return;
        }
    }
}
