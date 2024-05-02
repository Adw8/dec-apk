package defpackage;

/* renamed from: aJ  reason: default package */
/* loaded from: classes.dex */
public final class aJ extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ FI R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f826R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aJ(FI fi, iv7 iv7, int i, int i2) {
        super(2);
        this.X = i2;
        this.R = fi;
        this.f826R = iv7;
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
                if ((i & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                ncu v = this.R.v(aH9._(aff.R, ll.f5814v), dq.f2893v);
                iv7 iv7 = this.f826R;
                int i2 = this.O;
                jr_ jr_2 = (jr_) m88;
                jr_2.w(733328855);
                bF9 e = PO.e(dq.R, false, m88);
                jr_2.w(-1323940314);
                jJj jjj = (jJj) jr_2.x(lnF.X);
                mdz mdz = (mdz) jr_2.x(lnF.H);
                bUo buo = (bUo) jr_2.x(lnF.P);
                h1U.R.getClass();
                fme fme = igT.R;
                dNH b = aH9.b(v);
                if (jr_2.f5052R instanceof Su) {
                    jr_2.mL();
                    if (jr_2.f5050L) {
                        jr_2.H(fme);
                    } else {
                        jr_2.BF();
                    }
                    jr_2.f5078e = false;
                    l6.p(m88, e, igT.c);
                    l6.p(m88, jjj, igT.v);
                    l6.p(m88, mdz, igT.e);
                    l6.p(m88, buo, igT.X);
                    jr_2.j();
                    b.y(new k7Q(m88), m88, 0);
                    jr_2.w(2058660585);
                    jr_2.w(-2137368960);
                    jr_2.w(-1552328981);
                    iv7.J(m88, Integer.valueOf((i2 >> 6) & 14));
                    jr_2.g(false);
                    jr_2.g(false);
                    jQ.K(jr_2, false, true, false, false);
                    return;
                }
                l6.u();
                throw null;
            case 1:
                if ((i & 11) == 2) {
                    jr_ jr_3 = (jr_) m88;
                    if (jr_3.J()) {
                        jr_3.E();
                        return;
                    }
                }
                FI fi = this.R;
                ncu v2 = fi.v(aH9._(fi.R(false), ll.e), dq.f2881R);
                iv7 iv72 = this.f826R;
                int i3 = this.O;
                jr_ jr_4 = (jr_) m88;
                jr_4.w(733328855);
                bF9 e2 = PO.e(dq.R, false, m88);
                jr_4.w(-1323940314);
                jJj jjj2 = (jJj) jr_4.x(lnF.X);
                mdz mdz2 = (mdz) jr_4.x(lnF.H);
                bUo buo2 = (bUo) jr_4.x(lnF.P);
                h1U.R.getClass();
                fme fme2 = igT.R;
                dNH b2 = aH9.b(v2);
                if (jr_4.f5052R instanceof Su) {
                    jr_4.mL();
                    if (jr_4.f5050L) {
                        jr_4.H(fme2);
                    } else {
                        jr_4.BF();
                    }
                    jr_4.f5078e = false;
                    l6.p(m88, e2, igT.c);
                    l6.p(m88, jjj2, igT.v);
                    l6.p(m88, mdz2, igT.e);
                    l6.p(m88, buo2, igT.X);
                    jr_4.j();
                    b2.y(new k7Q(m88), m88, 0);
                    jr_4.w(2058660585);
                    jr_4.w(-2137368960);
                    jr_4.w(477417300);
                    iv72.J(m88, Integer.valueOf((i3 >> 12) & 14));
                    jr_4.g(false);
                    jr_4.g(false);
                    jQ.K(jr_4, false, true, false, false);
                    return;
                }
                l6.u();
                throw null;
            default:
                if ((i & 11) == 2) {
                    jr_ jr_5 = (jr_) m88;
                    if (jr_5.J()) {
                        jr_5.E();
                        return;
                    }
                }
                g1c.R(dB8.R((c_P) ((jr_) m88).x(dB8.R), mcX.X), aH9.I(m88, -747827634, new aJ(this.R, this.f826R, this.O, 1)), m88, 48);
                return;
        }
    }
}
