package defpackage;

/* renamed from: bVD  reason: default package */
/* loaded from: classes.dex */
public final class bVD extends k8G implements lR3 {
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bVD(Object obj, Object obj2, int i, int i2) {
        super(3);
        this.X = i2;
        this.R = obj;
        this.v = obj2;
        this.O = i;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                Su su = (Su) obj;
                mdh mdh = (mdh) obj2;
                h1W h1w = (h1W) obj3;
                Object g = ((f_c) this.R).g();
                mdh.B(mdh.c((WB) this.v), g);
                su.R(this.O, g);
                su.O(g);
                return o8s.R;
            default:
                ngd ngd = (ngd) obj;
                m88 m88 = (m88) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 14) == 0) {
                    intValue |= ((jr_) m88).O(ngd) ? 4 : 2;
                }
                if ((intValue & 91) == 18) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return o8s.R;
                    }
                }
                ncu g2 = g4x.g(aH9._(aff.R, ngd), lBz.Y, new fB0(null, 7, ((lkd) ((lPv) this.R)).R));
                lR3 lr3 = (lR3) this.v;
                int i = (this.O >> 6) & 7168;
                jr_ jr_2 = (jr_) m88;
                jr_2.w(733328855);
                bF9 e = PO.e(dq.R, false, jr_2);
                jr_2.w(-1323940314);
                jJj jjj = (jJj) jr_2.x(lnF.X);
                mdz mdz = (mdz) jr_2.x(lnF.H);
                bUo buo = (bUo) jr_2.x(lnF.P);
                h1U.R.getClass();
                fme fme = igT.R;
                dNH b = aH9.b(g2);
                int i2 = ((((i << 3) & 112) << 9) & 7168) | 6;
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
                    b.y(jQ.m(jr_2, buo, igT.X, jr_2), jr_2, Integer.valueOf((i2 >> 3) & 112));
                    jr_2.w(2058660585);
                    jr_2.w(-2137368960);
                    if (((i2 >> 9) & 14 & 11) != 2 || !jr_2.J()) {
                        lr3.y(lv.R, jr_2, Integer.valueOf(((i >> 6) & 112) | 6));
                    } else {
                        jr_2.E();
                    }
                    jQ.K(jr_2, false, false, true, false);
                    jr_2.g(false);
                    return o8s.R;
                }
                l6.u();
                throw null;
        }
    }
}
