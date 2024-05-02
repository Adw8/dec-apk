package defpackage;

import dev.kdrag0n.virtcontainer.ui.onboarding.adb.pair.AdbPairViewModel;

/* renamed from: tJ  reason: default package */
/* loaded from: classes.dex */
public final class tJ extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tJ(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        super(2);
        this.X = i2;
        this.R = obj;
        this.v = obj2;
        this.c = obj3;
        this.e = obj4;
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
            case 2:
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
                int i2 = this.O;
                a4b.R((hRH) this.R, (h0T) this.v, (ncu) this.c, (lR3) this.e, m88, (i2 & 896) | 48 | ((i2 >> 6) & 7168), 0);
                return;
            case 1:
                if ((i & 11) == 2) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                ncu zw = aH9.zw(kM4.R((kM4) this.R), ((iv7) this.v) != null ? a4b.v : (float) 0, 0.0f, ((iv7) this.c) != null ? a4b.v : (float) 0, 0.0f, 10);
                iv7 iv7 = (iv7) this.e;
                int i3 = this.O;
                jr_ jr_3 = (jr_) m88;
                jr_3.w(733328855);
                bF9 e = PO.e(dq.R, false, m88);
                jr_3.w(-1323940314);
                jJj jjj = (jJj) jr_3.x(lnF.X);
                mdz mdz = (mdz) jr_3.x(lnF.H);
                bUo buo = (bUo) jr_3.x(lnF.P);
                h1U.R.getClass();
                fme fme = igT.R;
                dNH b = aH9.b(zw);
                if (jr_3.f5052R instanceof Su) {
                    jr_3.mL();
                    if (jr_3.f5050L) {
                        jr_3.H(fme);
                    } else {
                        jr_3.BF();
                    }
                    jr_3.f5078e = false;
                    l6.p(m88, e, igT.c);
                    l6.p(m88, jjj, igT.v);
                    l6.p(m88, mdz, igT.e);
                    l6.p(m88, buo, igT.X);
                    jr_3.j();
                    b.y(new k7Q(m88), m88, 0);
                    jr_3.w(2058660585);
                    jr_3.w(-2137368960);
                    jr_3.w(-1301783630);
                    iv7.J(m88, Integer.valueOf(i3 & 14));
                    jr_3.g(false);
                    jr_3.g(false);
                    jQ.K(jr_3, false, true, false, false);
                    return;
                }
                l6.u();
                throw null;
            case 2:
                ((dNH) this.R).c(this.v, this.c, this.e, m88, this.O | 1);
                return;
            default:
                mxC.X((AdbPairViewModel) this.R, (f_c) this.v, (f_c) this.c, (f_c) this.e, m88, this.O | 1);
                return;
        }
    }
}
