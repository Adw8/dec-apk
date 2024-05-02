package defpackage;

/* renamed from: ogh  reason: default package */
/* loaded from: classes.dex */
public final class ogh extends k8G implements iv7 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ long f6890R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f6891R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lf f6892R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ n76 f6893R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f6894R;
    public final /* synthetic */ int X;
    public final /* synthetic */ float v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ogh(ncu ncu, n76 n76, long j, float f, int i, lf lfVar, float f2, dNH dnh) {
        super(2);
        this.f6894R = ncu;
        this.f6893R = n76;
        this.f6890R = j;
        this.R = f;
        this.X = i;
        this.f6892R = lfVar;
        this.v = f2;
        this.f6891R = dnh;
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
        ncu R = lCG.R(cU5.N(emG.c(this.f6894R, this.f6893R, emG.e(this.f6890R, this.R, m88), this.f6892R, this.v), false, eOv.R), o8s.R, new o3X(null));
        iv7 iv7 = this.f6891R;
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
        dNH b = aH9.b(R);
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
            jr_2.w(1703151929);
            iv7.J(m88, Integer.valueOf((i >> 21) & 14));
            jr_2.g(false);
            jr_2.g(false);
            jQ.K(jr_2, false, true, false, false);
            return o8s.R;
        }
        l6.u();
        throw null;
    }
}
