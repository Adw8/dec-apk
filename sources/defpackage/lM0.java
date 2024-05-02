package defpackage;

/* renamed from: lM0  reason: default package */
/* loaded from: classes.dex */
public final class lM0 extends k8G implements kg9 {
    public final /* synthetic */ c71 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ d5M f5657R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ djV f5658R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fBS f5659R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ hh4 f5660R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jzQ f5661R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kY5 f5662R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f5663R;
    public final /* synthetic */ boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lM0(djV djv, hh4 hh4, d5M d5m, boolean z, boolean z2, kY5 ky5, c71 c71, fBS fbs, jzQ jzq) {
        super(1);
        this.f5658R = djv;
        this.f5660R = hh4;
        this.f5657R = d5m;
        this.f5663R = z;
        this.v = z2;
        this.f5662R = ky5;
        this.R = c71;
        this.f5659R = fbs;
        this.f5661R = jzq;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        bNL bnl = (bNL) obj;
        int i = this.f5658R.c;
        b_t b_t = onS.x;
        icv[] icvArr = onS.f6950R;
        icv icv = icvArr[11];
        b_t.R(bnl, new j8k(i));
        bz bzVar = this.f5660R.R;
        b_t b_t2 = onS.Z;
        icv icv2 = icvArr[9];
        b_t2.R(bnl, bzVar);
        long j = this.f5657R.R;
        b_t b_t3 = onS.m;
        icv icv3 = icvArr[10];
        b_t3.R(bnl, new odN(j));
        if (!this.f5663R) {
            ((kEW) bnl).c(dwC.m, o8s.R);
        }
        kEW kew = (kEW) bnl;
        kew.c(jGN.R, new Tp(null, new deW(this.f5662R, 2)));
        kew.c(jGN.Z, new Tp(null, new deW(this.f5662R, 3)));
        kew.c(jGN.L, new Tp(null, new kzT(this.R, this.f5663R, this.f5657R, this.f5659R, this.f5662R)));
        kew.c(jGN.v, new Tp(null, new eOg(0, this.f5662R, this.f5661R, this.v)));
        kew.c(jGN.c, new Tp(null, new bVE(this.f5659R, 0)));
        if (!odN.v(this.f5657R.R)) {
            kew.c(jGN.m, new Tp(null, new bVE(this.f5659R, 1)));
            if (this.f5663R && !this.v) {
                kew.c(jGN.x, new Tp(null, new bVE(this.f5659R, 2)));
            }
        }
        if (this.f5663R && !this.v) {
            kew.c(jGN.H, new Tp(null, new bVE(this.f5659R, 3)));
        }
        return o8s.R;
    }
}
