package defpackage;

/* renamed from: oNz  reason: default package */
/* loaded from: classes.dex */
public final class oNz extends k8G implements iv7 {
    public final /* synthetic */ fBS R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jJj f6813R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kY5 f6814R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f6815R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f6816R;
    public final /* synthetic */ int X;
    public final /* synthetic */ boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public oNz(fBS fbs, kY5 ky5, boolean z, boolean z2, kg9 kg9, jJj jjj, int i) {
        super(2);
        this.R = fbs;
        this.f6814R = ky5;
        this.f6816R = z;
        this.v = z2;
        this.f6815R = kg9;
        this.f6813R = jjj;
        this.X = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        hjM hjm;
        m88 m88 = (m88) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            jr_ jr_ = (jr_) m88;
            if (jr_.J()) {
                jr_.E();
                return o8s.R;
            }
        }
        mvf mvf = new mvf(this.f6814R, this.f6815R, this.f6813R, this.X);
        jr_ jr_2 = (jr_) m88;
        jr_2.w(-1323940314);
        aff aff = aff.R;
        jJj jjj = (jJj) jr_2.x(lnF.X);
        mdz mdz = (mdz) jr_2.x(lnF.H);
        bUo buo = (bUo) jr_2.x(lnF.P);
        h1U.R.getClass();
        fme fme = igT.R;
        dNH b = aH9.b(aff);
        if (jr_2.f5052R instanceof Su) {
            jr_2.mL();
            if (jr_2.f5050L) {
                jr_2.H(fme);
            } else {
                jr_2.BF();
            }
            boolean z = false;
            jr_2.f5078e = false;
            l6.p(m88, mvf, igT.c);
            l6.p(m88, jjj, igT.v);
            l6.p(m88, mdz, igT.e);
            l6.p(m88, buo, igT.X);
            jr_2.j();
            b.y(new k7Q(m88), m88, 0);
            jr_2.w(2058660585);
            jr_2.w(1714611517);
            jr_2.g(false);
            jr_2.g(false);
            jr_2.g(true);
            jr_2.g(false);
            fBS fbs = this.R;
            if (this.f6814R.R() == m3z.Selection && (hjm = this.f6814R.f5338R) != null && hjm.p() && this.f6816R) {
                z = true;
            }
            dTl.U(fbs, z, m88, 8);
            if (this.f6814R.R() == m3z.Cursor && !this.v && this.f6816R) {
                dTl.H(this.R, m88, 8);
            }
            return o8s.R;
        }
        l6.u();
        throw null;
    }
}
