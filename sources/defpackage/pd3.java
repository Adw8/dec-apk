package defpackage;

/* renamed from: pd3  reason: default package */
/* loaded from: classes.dex */
public final class pd3 extends k8G implements bBk {
    public final /* synthetic */ int O;
    public final /* synthetic */ bBk R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ m9m f7132R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mBF f7133R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pd3(m9m m9m, bBk bbk, mBF mbf, int i, int i2) {
        super(4);
        this.X = i2;
        this.f7132R = m9m;
        this.R = bbk;
        this.f7133R = mbf;
        this.O = i;
    }

    public final void R(bmu bmu, int i, m88 m88, int i2) {
        int i3;
        int i4;
        int i5 = 4;
        int i6 = 2;
        switch (this.X) {
            case 0:
                if ((i2 & 14) == 0) {
                    if (((jr_) m88).O(bmu)) {
                        i6 = 4;
                    }
                    i4 = i6 | i2;
                } else {
                    i4 = i2;
                }
                if ((i2 & 112) == 0) {
                    i4 |= ((jr_) m88).e(i) ? 32 : 16;
                }
                if ((i4 & 731) == 146) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                ncu U = adU.U(g4x.g(aff.R, lBz.Y, new fB0(null, 7, this.f7132R)).I(new lUf(1.0f, null, bmu.v, 4)), null, 3);
                bBk bbk = this.R;
                mBF mbf = this.f7133R;
                int i7 = this.O;
                jr_ jr_2 = (jr_) m88;
                jr_2.w(733328855);
                bF9 e = PO.e(dq.R, false, jr_2);
                jr_2.w(-1323940314);
                jJj jjj = (jJj) jr_2.x(lnF.X);
                mdz mdz = (mdz) jr_2.x(lnF.H);
                bUo buo = (bUo) jr_2.x(lnF.P);
                h1U.R.getClass();
                fme fme = igT.R;
                dNH b = aH9.b(U);
                if (jr_2.f5052R instanceof Su) {
                    jr_2.mL();
                    if (jr_2.f5050L) {
                        jr_2.H(fme);
                    } else {
                        jr_2.BF();
                    }
                    jr_2.f5078e = false;
                    l6.p(jr_2, e, igT.c);
                    l6.p(jr_2, jjj, igT.v);
                    l6.p(jr_2, mdz, igT.e);
                    l6.p(jr_2, buo, igT.X);
                    jr_2.j();
                    b.y(new k7Q(jr_2), jr_2, 0);
                    jr_2.w(2058660585);
                    jr_2.w(-2137368960);
                    bbk.m(mbf, Integer.valueOf(i), jr_2, Integer.valueOf((i7 & 896) | (i4 & 112)));
                    jr_2.g(false);
                    jQ.K(jr_2, false, true, false, false);
                    return;
                }
                l6.u();
                throw null;
            default:
                if ((i2 & 14) == 0) {
                    if (!((jr_) m88).O(bmu)) {
                        i5 = 2;
                    }
                    i3 = i5 | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 112) == 0) {
                    i3 |= ((jr_) m88).e(i) ? 32 : 16;
                }
                if ((i3 & 731) == 146) {
                    jr_ jr_3 = (jr_) m88;
                    if (jr_3.J()) {
                        jr_3.E();
                        return;
                    }
                }
                ncu U2 = adU.U(g4x.g(aff.R, lBz.Y, new fB0(null, 7, this.f7132R)).I(new lUf(1.0f, bmu.R, null, 8)), null, 3);
                bBk bbk2 = this.R;
                mBF mbf2 = this.f7133R;
                int i8 = this.O;
                jr_ jr_4 = (jr_) m88;
                jr_4.w(733328855);
                bF9 e2 = PO.e(dq.R, false, jr_4);
                jr_4.w(-1323940314);
                jJj jjj2 = (jJj) jr_4.x(lnF.X);
                mdz mdz2 = (mdz) jr_4.x(lnF.H);
                bUo buo2 = (bUo) jr_4.x(lnF.P);
                h1U.R.getClass();
                fme fme2 = igT.R;
                dNH b2 = aH9.b(U2);
                if (jr_4.f5052R instanceof Su) {
                    jr_4.mL();
                    if (jr_4.f5050L) {
                        jr_4.H(fme2);
                    } else {
                        jr_4.BF();
                    }
                    jr_4.f5078e = false;
                    l6.p(jr_4, e2, igT.c);
                    l6.p(jr_4, jjj2, igT.v);
                    l6.p(jr_4, mdz2, igT.e);
                    l6.p(jr_4, buo2, igT.X);
                    jr_4.j();
                    b2.y(new k7Q(jr_4), jr_4, 0);
                    jr_4.w(2058660585);
                    jr_4.w(-2137368960);
                    bbk2.m(mbf2, Integer.valueOf(i), jr_4, Integer.valueOf((i8 & 896) | (i3 & 112)));
                    jr_4.g(false);
                    jQ.K(jr_4, false, true, false, false);
                    return;
                }
                l6.u();
                throw null;
        }
    }

    @Override // defpackage.bBk
    public final /* bridge */ /* synthetic */ Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.X) {
            case 0:
                R((bmu) obj, ((Number) obj2).intValue(), (m88) obj3, ((Number) obj4).intValue());
                break;
            default:
                R((bmu) obj, ((Number) obj2).intValue(), (m88) obj3, ((Number) obj4).intValue());
                break;
        }
        return o8s.R;
    }
}
