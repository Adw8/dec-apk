package defpackage;

/* renamed from: Ig  reason: default package */
/* loaded from: classes.dex */
public final class Ig extends k8G implements iv7 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f188R;
    public final /* synthetic */ int X;
    public final /* synthetic */ long c;

    /* renamed from: c  reason: collision with other field name */
    public final /* synthetic */ iv7 f189c;
    public final /* synthetic */ long e;

    /* renamed from: e  reason: collision with other field name */
    public final /* synthetic */ iv7 f190e;
    public final /* synthetic */ long v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ iv7 f191v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Ig(iv7 iv7, iv7 iv72, iv7 iv73, long j, int i, long j2, long j3, long j4, iv7 iv74) {
        super(2);
        this.f188R = iv7;
        this.f191v = iv72;
        this.f189c = iv73;
        this.R = j;
        this.X = i;
        this.v = j2;
        this.c = j3;
        this.e = j4;
        this.f190e = iv74;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ky1 ky1;
        boolean z;
        m88 m88 = (m88) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            jr_ jr_ = (jr_) m88;
            if (jr_.J()) {
                jr_.E();
                return o8s.R;
            }
        }
        aff aff = aff.R;
        ncu _ = aH9._(adU.x(aff, ll.R, 0.0f, ll.v, 10), ll.f5813R);
        iv7 iv7 = this.f188R;
        iv7 iv72 = this.f191v;
        iv7 iv73 = this.f189c;
        long j = this.R;
        int i = this.X;
        long j2 = this.v;
        long j3 = this.c;
        long j4 = this.e;
        iv7 iv74 = this.f190e;
        jr_ jr_2 = (jr_) m88;
        jr_2.w(-483455358);
        bF9 R = VA.R(nA.f6330R, dq.f2881R, m88);
        jr_2.w(-1323940314);
        owM owm = lnF.X;
        jJj jjj = (jJj) jr_2.x(owm);
        owM owm2 = lnF.H;
        mdz mdz = (mdz) jr_2.x(owm2);
        owM owm3 = lnF.P;
        bUo buo = (bUo) jr_2.x(owm3);
        h1U.R.getClass();
        fme fme = igT.R;
        dNH b = aH9.b(_);
        if (jr_2.f5052R instanceof Su) {
            jr_2.mL();
            if (jr_2.f5050L) {
                jr_2.H(fme);
            } else {
                jr_2.BF();
            }
            jr_2.f5078e = false;
            ky1 ky12 = igT.c;
            l6.p(m88, R, ky12);
            ky1 ky13 = igT.v;
            l6.p(m88, jjj, ky13);
            ky1 ky14 = igT.e;
            l6.p(m88, mdz, ky14);
            ky1 ky15 = igT.X;
            l6.p(m88, buo, ky15);
            jr_2.j();
            b.y(new k7Q(m88), m88, 0);
            jr_2.w(2058660585);
            jr_2.w(-1163856341);
            _n _nVar = _n.R;
            jr_2.w(-1370717838);
            jr_2.w(76440864);
            if (iv7 == null) {
                z = false;
                ky1 = ky14;
            } else {
                ky1 = ky14;
                l6.R(new bkv[]{kft.R.v(new n3(j))}, aH9.I(m88, 934657765, new aJ(_nVar, iv7, i, 0)), m88, 56);
                z = false;
            }
            jr_2.g(z);
            jr_2.w(76441259);
            if (iv72 != null) {
                bkv[] bkvArr = new bkv[1];
                bkv v = kft.R.v(new n3(j2));
                char c = z ? 1 : 0;
                char c2 = z ? 1 : 0;
                char c3 = z ? 1 : 0;
                bkvArr[c] = v;
                l6.R(bkvArr, aH9.I(m88, 1845262876, new TI(_nVar, iv7, iv72, i, 1)), m88, 56);
                z = false;
            }
            jr_2.g(z);
            jr_2.w(76442209);
            if (iv73 != null) {
                bkv[] bkvArr2 = new bkv[1];
                bkv v2 = kft.R.v(new n3(j3));
                char c4 = z ? 1 : 0;
                char c5 = z ? 1 : 0;
                bkvArr2[c4] = v2;
                l6.R(bkvArr2, aH9.I(m88, 613970333, new aJ(_nVar, iv73, i, 2)), m88, 56);
            }
            jr_2.g(z);
            ncu v3 = _nVar.v(aff, dq.f2886c);
            jr_2.w(733328855);
            bF9 e = PO.e(dq.R, z, m88);
            jr_2.w(-1323940314);
            jJj jjj2 = (jJj) jr_2.x(owm);
            mdz mdz2 = (mdz) jr_2.x(owm2);
            bUo buo2 = (bUo) jr_2.x(owm3);
            dNH b2 = aH9.b(v3);
            if (jr_2.f5052R instanceof Su) {
                jr_2.mL();
                if (jr_2.f5050L) {
                    jr_2.H(fme);
                } else {
                    jr_2.BF();
                }
                jr_2.f5078e = false;
                l6.p(m88, e, ky12);
                l6.p(m88, jjj2, ky13);
                l6.p(m88, mdz2, ky1);
                l6.p(m88, buo2, ky15);
                jr_2.j();
                b2.y(new k7Q(m88), m88, 0);
                jr_2.w(2058660585);
                jr_2.w(-2137368960);
                jr_2.w(1902704376);
                l6.R(new bkv[]{kft.R.v(new n3(j4))}, aH9.I(m88, -433542216, new he(iv74, i, 0)), m88, 56);
                jr_2.g(false);
                jr_2.g(false);
                jr_2.g(false);
                jr_2.g(true);
                jQ.K(jr_2, false, false, false, false);
                jQ.K(jr_2, false, true, false, false);
                return o8s.R;
            }
            l6.u();
            throw null;
        }
        l6.u();
        throw null;
    }
}
