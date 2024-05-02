package defpackage;

/* renamed from: mw8  reason: default package */
/* loaded from: classes.dex */
public final class mw8 extends k8G implements lR3 {
    public final /* synthetic */ c71 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ d5K f6239R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ d5M f6240R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fBS f6241R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kY5 f6242R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f6243R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f6244R;
    public final /* synthetic */ boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mw8(kY5 ky5, fBS fbs, d5M d5m, boolean z, boolean z2, c71 c71, d5K d5k, deW dew) {
        super(3);
        this.f6242R = ky5;
        this.f6241R = fbs;
        this.f6240R = d5m;
        this.f6244R = z;
        this.v = z2;
        this.R = c71;
        this.f6239R = d5k;
        this.f6243R = dew;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        ncu ncu = (ncu) obj;
        ((Number) obj3).intValue();
        jr_ jr_ = (jr_) ((m88) obj2);
        Object x = jQ.x(jr_, 58482146, -492369756);
        if (x == ppN.R) {
            x = new o4E();
            jr_.ZW(x);
        }
        jr_.g(false);
        gWD gwd = new gWD(this.f6242R, this.f6241R, this.f6240R, this.f6244R, this.v, (o4E) x, this.R, this.f6239R, this.f6243R);
        aff aff = aff.R;
        mCa mca = new mCa(1, gwd);
        bsy bsy = khu.R;
        ncu R = mWb.R(aff, new czM(mca, null));
        jr_.g(false);
        return R;
    }
}
