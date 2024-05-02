package defpackage;

/* renamed from: TI  reason: default package */
/* loaded from: classes.dex */
public final class TI extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ FI R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f532R;
    public final /* synthetic */ int X;
    public final /* synthetic */ iv7 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TI(FI fi, iv7 iv7, iv7 iv72, int i, int i2) {
        super(2);
        this.X = i2;
        this.R = fi;
        this.f532R = iv7;
        this.v = iv72;
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
                ncu v = this.R.v(aH9._(aff.R, ll.c), this.f532R == null ? dq.f2881R : dq.f2893v);
                iv7 iv7 = this.v;
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
                    jr_2.w(1708709843);
                    iv7.J(m88, Integer.valueOf((i2 >> 9) & 14));
                    jr_2.g(false);
                    jr_2.g(false);
                    jQ.K(jr_2, false, true, false, false);
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
                g1c.R(dB8.R((c_P) ((jr_) m88).x(dB8.R), mcX.c), aH9.I(m88, 483464909, new TI(this.R, this.f532R, this.v, this.O, 0)), m88, 48);
                return;
        }
    }
}
