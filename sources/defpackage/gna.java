package defpackage;

/* renamed from: gna  reason: default package */
/* loaded from: classes.dex */
public final class gna extends k8G implements lR3 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fVb f3930R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f3931R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f3932R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gna(float f, fVb fvb, boolean z, int i, iv7 iv7, int i2) {
        super(3);
        this.R = f;
        this.f3930R = fvb;
        this.f3932R = z;
        this.f3931R = iv7;
        this.X = i2;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        ncu ncu = (ncu) obj;
        m88 m88 = (m88) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 14) == 0) {
            intValue |= ((jr_) m88).O(ncu) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            jr_ jr_ = (jr_) m88;
            if (jr_.J()) {
                jr_.E();
                return o8s.R;
            }
        }
        ncu L = ooA.L(ncu, this.R);
        fVb fvb = this.f3930R;
        boolean z = this.f3932R;
        iv7 iv7 = this.f3931R;
        int i = this.X;
        jr_ jr_2 = (jr_) m88;
        jr_2.w(733328855);
        bF9 e = PO.e(dq.R, false, m88);
        jr_2.w(-1323940314);
        jJj jjj = (jJj) jr_2.x(lnF.X);
        mdz mdz = (mdz) jr_2.x(lnF.H);
        bUo buo = (bUo) jr_2.x(lnF.P);
        h1U.R.getClass();
        fme fme = igT.R;
        dNH b = aH9.b(L);
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
            jr_2.w(828149203);
            fvb.getClass();
            jr_2.w(-117469162);
            h0T s = l6.s(new n3(z ? fvb.o : fvb.K), jr_2);
            jr_2.g(false);
            c5p.v(((n3) s.getValue()).f6279R, ((c_P) ((jr_) m88).x(dB8.R)).x, iv7, m88, (i >> 9) & 896, 0);
            jQ.K(jr_2, false, false, false, true);
            jr_2.g(false);
            jr_2.g(false);
            return o8s.R;
        }
        l6.u();
        throw null;
    }
}
