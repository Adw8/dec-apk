package defpackage;

/* renamed from: bxF  reason: default package */
/* loaded from: classes.dex */
public final class bxF extends k8G implements iv7 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ long f1864R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ f_c f1865R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f1866R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lf f1867R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ n76 f1868R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f1869R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f1870R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f1871R;
    public final /* synthetic */ int X = 6;
    public final /* synthetic */ float v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bxF(ncu ncu, n76 n76, long j, float f, int i, lf lfVar, float f2, p2E p2e, boolean z, f_c f_c, dNH dnh) {
        super(2);
        this.f1869R = ncu;
        this.f1868R = n76;
        this.f1864R = j;
        this.R = f;
        this.f1867R = lfVar;
        this.v = f2;
        this.f1870R = p2e;
        this.f1871R = z;
        this.f1865R = f_c;
        this.f1866R = dnh;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        m88 m88 = (m88) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            jr_ jr_ = (jr_) m88;
            if (jr_.J()) {
                jr_.E();
                return o8s.R;
            }
        }
        ncu t = dTl.t(emG.c(oRd.R(this.f1869R), this.f1868R, emG.e(this.f1864R, this.R, m88), this.f1867R, this.v), this.f1870R, ek_.R(false, 0.0f, m88, 0, 7), this.f1871R, new fzf(0), this.f1865R, 8);
        iv7 iv7 = this.f1866R;
        int i = this.X;
        jr_ jr_2 = (jr_) m88;
        jr_2.w(733328855);
        bF9 e = PO.e(dq.R, true, m88);
        jr_2.w(-1323940314);
        jJj jjj = (jJj) jr_2.x(lnF.X);
        mdz mdz = (mdz) jr_2.x(lnF.H);
        bUo buo = (bUo) jr_2.x(lnF.P);
        h1U.R.getClass();
        fme fme = igT.R;
        dNH b = aH9.b(t);
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
            jr_2.w(-126864234);
            iv7.J(m88, Integer.valueOf(i & 14));
            jr_2.g(false);
            jr_2.g(false);
            jQ.K(jr_2, false, true, false, false);
            return o8s.R;
        }
        l6.u();
        throw null;
    }
}
