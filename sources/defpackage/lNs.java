package defpackage;

/* renamed from: lNs  reason: default package */
/* loaded from: classes.dex */
public final class lNs extends k8G implements iv7 {
    public final /* synthetic */ ceM R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ d5M f5693R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fBS f5694R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iuk f5695R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jJj f5696R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kMk f5697R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kY5 f5698R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f5699R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f5700R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ze f5701R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f5702R;
    public final /* synthetic */ int X;
    public final /* synthetic */ ncu c;
    public final /* synthetic */ ncu e;
    public final /* synthetic */ ncu v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ boolean f5703v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lNs(kY5 ky5, int i, kMk kmk, ceM cem, d5M d5m, iuk iuk, ncu ncu, ncu ncu2, ncu ncu3, ncu ncu4, ze zeVar, fBS fbs, boolean z, boolean z2, kg9 kg9, jJj jjj) {
        super(2);
        this.f5698R = ky5;
        this.X = i;
        this.f5697R = kmk;
        this.R = cem;
        this.f5693R = d5m;
        this.f5695R = iuk;
        this.f5700R = ncu;
        this.v = ncu2;
        this.c = ncu3;
        this.e = ncu4;
        this.f5701R = zeVar;
        this.f5694R = fbs;
        this.f5702R = z;
        this.f5703v = z2;
        this.f5699R = kg9;
        this.f5696R = jjj;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ncu ncu;
        m88 m88 = (m88) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            jr_ jr_ = (jr_) m88;
            if (jr_.J()) {
                jr_.E();
                return o8s.R;
            }
        }
        ncu L = adU.L(aff.R, ((hoI) this.f5698R.f5343v.getValue()).R, 0.0f, 2);
        int i = this.X;
        kMk kmk = this.f5697R;
        lBz lbz = lBz.Y;
        ncu g = g4x.g(L, lbz, new YJ(i, kmk));
        ceM cem = this.R;
        d5M d5m = this.f5693R;
        iuk iuk = this.f5695R;
        q4 q4Var = new q4(2, this.f5698R);
        nLK nlk = (nLK) cem.c.getValue();
        long j = d5m.R;
        int i2 = odN.R;
        int i3 = (int) (j >> 32);
        if (i3 == ((int) (cem.f2168R >> 32))) {
            i3 = odN.c(j) != odN.c(cem.f2168R) ? odN.c(j) : odN.X(j);
        }
        cem.f2168R = d5m.R;
        hh4 H = dtx.H(iuk, d5m.f2488R);
        int ordinal = nlk.ordinal();
        if (ordinal == 0) {
            ncu = new fNw(cem, i3, H, q4Var);
        } else if (ordinal == 1) {
            ncu = new jxP(cem, i3, H, q4Var);
        } else {
            throw new j8f((Object) null);
        }
        msU.X(g4x.g(g4x.y(gQc.y(g).I(ncu).I(this.f5700R).I(this.v), new x9(3, this.f5697R)).I(this.c).I(this.e), lbz, new x9(0, this.f5701R)), aH9.I(m88, 19580180, new oNz(this.f5694R, this.f5698R, this.f5702R, this.f5703v, this.f5699R, this.f5696R, this.X)), m88, 48, 0);
        return o8s.R;
    }
}
