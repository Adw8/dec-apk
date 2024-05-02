package defpackage;

/* renamed from: ka  reason: default package */
/* loaded from: classes.dex */
public final class ka extends k8G implements iv7 {
    public final /* synthetic */ fQ2 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iUy f5359R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f5360R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kMk f5361R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lPv f5362R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f5363R;
    public final /* synthetic */ int X;
    public final /* synthetic */ iv7 c;
    public final /* synthetic */ iv7 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ka(iUy iuy, fQ2 fq2, iv7 iv7, kMk kmk, boolean z, iv7 iv72, dNH dnh, int i, lPv lpv) {
        super(2);
        this.f5359R = iuy;
        this.R = fq2;
        this.f5360R = iv7;
        this.f5361R = kmk;
        this.f5363R = z;
        this.v = iv72;
        this.c = dnh;
        this.X = i;
        this.f5362R = lpv;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        lqA lqa;
        m88 m88 = (m88) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            jr_ jr_ = (jr_) m88;
            if (jr_.J()) {
                jr_.E();
                return o8s.R;
            }
        }
        Object x = ((jr_) m88).x(lnF.X);
        lPv lpv = this.f5362R;
        float R = ((lpv == null || (lqa = ((lkd) lpv).f5812R) == null) ? 0.0f : lqa.R()) + ((jJj) x).mZ(cKd.R);
        iUy iuy = this.f5359R;
        bsy bsy = ea_.R;
        ncu y = gQc.y(new ngP(iuy, lBz.Y));
        fQ2 fq2 = this.R;
        long j = fq2.c;
        long j2 = fq2.e;
        long j3 = fq2.X;
        iv7 iv7 = this.f5360R;
        kMk kmk = this.f5361R;
        oy oyVar = nA.f6329R;
        h8 h8Var = this.f5363R ? oyVar : nA.R;
        iv7 iv72 = this.v;
        iv7 iv73 = this.c;
        int i = this.X;
        int i2 = i << 12;
        c3.c(y, R, j, j2, j3, iv7, kmk, 1.0f, oyVar, h8Var, 0, false, iv72, iv73, m88, (i2 & 458752) | 113246208 | (i2 & 3670016), ((i >> 6) & 896) | 3126);
        return o8s.R;
    }
}
