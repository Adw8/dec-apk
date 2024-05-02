package defpackage;

/* renamed from: m0Y  reason: default package */
/* loaded from: classes.dex */
public final class m0Y extends k8G implements lR3 {
    public final /* synthetic */ f_c R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ j__ f5880R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f5881R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f5882R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nLK f5883R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f5884R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f5885R;
    public final /* synthetic */ lR3 v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ boolean f5886v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public m0Y(j__ j__, nLK nlk, p2E p2e, f_c f_c, kg9 kg9, lR3 lr3, lR3 lr32, boolean z, boolean z2) {
        super(3);
        this.f5884R = p2e;
        this.R = f_c;
        this.f5881R = kg9;
        this.f5882R = lr3;
        this.v = lr32;
        this.f5880R = j__;
        this.f5883R = nlk;
        this.f5885R = z;
        this.f5886v = z2;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        ncu ncu = (ncu) obj;
        ((Number) obj3).intValue();
        jr_ jr_ = (jr_) ((m88) obj2);
        Object x = jQ.x(jr_, 597193710, -492369756);
        f1A f1a = ppN.R;
        if (x == f1a) {
            x = l6.n(null);
            jr_.ZW(x);
        }
        jr_.g(false);
        h0T h0t = (h0T) x;
        p2E p2e = this.f5884R;
        jr_.w(511388516);
        boolean O = jr_.O(h0t) | jr_.O(p2e);
        Object I = jr_.I();
        if (O || I == f1a) {
            I = new mr_(h0t, p2e, 2);
            jr_.ZW(I);
        }
        jr_.g(false);
        caw.v(p2e, (kg9) I, jr_);
        jr_.w(-492369756);
        Object I2 = jr_.I();
        if (I2 == f1a) {
            I2 = jjU.R(Integer.MAX_VALUE, null, 6);
            jr_.ZW(I2);
        }
        jr_.g(false);
        gn gnVar = (gn) I2;
        h0T s = l6.s(this.R, jr_);
        h0T s2 = l6.s(this.f5881R, jr_);
        h0T s3 = l6.s(new gd1(this.f5882R, this.v, h0t, this.f5884R), jr_);
        j__ j__ = this.f5880R;
        caw.e(j__, new jiB(gnVar, j__, s3, this.f5883R, null), jr_);
        aff aff = aff.R;
        Object[] objArr = {this.f5883R, Boolean.valueOf(this.f5885R), Boolean.valueOf(this.f5886v)};
        jYZ jyz = new jYZ(this.f5885R, s2, s, this.f5883R, gnVar, this.f5886v, null);
        pdm pdm = lCG.R;
        ncu g = g4x.g(aff, lBz.Y, new fB0(objArr, 9, jyz));
        jr_.g(false);
        return g;
    }
}
