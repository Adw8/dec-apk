package defpackage;

/* renamed from: e0_  reason: default package */
/* loaded from: classes.dex */
public final class e0_ extends k8G implements lR3 {
    public final /* synthetic */ iv7 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f2934R;
    public final /* synthetic */ int X;
    public final /* synthetic */ String v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public e0_(String str, int i, String str2, iv7 iv7) {
        super(3);
        this.f2934R = str;
        this.X = i;
        this.v = str2;
        this.R = iv7;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        FI fi = (FI) obj;
        m88 m88 = (m88) obj2;
        if ((((Number) obj3).intValue() & 81) == 16) {
            jr_ jr_ = (jr_) m88;
            if (jr_.J()) {
                jr_.E();
                return o8s.R;
            }
        }
        ncu mL = aH9.mL(adU.f942R, (float) 16);
        String str = this.f2934R;
        int i = this.X;
        String str2 = this.v;
        iv7 iv7 = this.R;
        jr_ jr_2 = (jr_) m88;
        jr_2.w(-483455358);
        bF9 R = VA.R(nA.f6330R, dq.f2881R, jr_2);
        jr_2.w(-1323940314);
        jJj jjj = (jJj) jr_2.x(lnF.X);
        mdz mdz = (mdz) jr_2.x(lnF.H);
        bUo buo = (bUo) jr_2.x(lnF.P);
        h1U.R.getClass();
        fme fme = igT.R;
        dNH b = aH9.b(mL);
        if (jr_2.f5052R instanceof Su) {
            jr_2.mL();
            if (jr_2.f5050L) {
                jr_2.H(fme);
            } else {
                jr_2.BF();
            }
            jr_2.f5078e = false;
            l6.p(jr_2, R, igT.c);
            l6.p(jr_2, jjj, igT.v);
            l6.p(jr_2, mdz, igT.e);
            jQ.o(0, b, jQ.m(jr_2, buo, igT.X, jr_2), jr_2, 2058660585, -1163856341);
            owM owm = dB8.R;
            g1c.c(str, null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, ((c_P) jr_2.x(owm)).Z, jr_2, i & 14, 0, 32766);
            g1c.c(str2, null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, ((c_P) jr_2.x(owm)).H, jr_2, (i >> 3) & 14, 0, 32766);
            iv7.J(jr_2, Integer.valueOf((i >> 6) & 14));
            jr_2.g(false);
            jr_2.g(false);
            jr_2.g(true);
            jr_2.g(false);
            jr_2.g(false);
            return o8s.R;
        }
        l6.u();
        throw null;
    }
}
