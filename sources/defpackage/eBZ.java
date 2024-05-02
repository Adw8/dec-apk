package defpackage;

/* renamed from: eBZ  reason: default package */
/* loaded from: classes.dex */
public final class eBZ extends k8G implements lR3 {
    public final /* synthetic */ dH9 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f3020R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ j__ f3021R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f3022R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f3023R;
    public final /* synthetic */ int X;
    public final /* synthetic */ dH9 v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ boolean f3024v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public eBZ(int i, nKt nkt, p2E p2e, h0T h0t, h0T h0t2, h0T h0t3, boolean z, boolean z2) {
        super(3);
        this.f3023R = z;
        this.f3021R = nkt;
        this.f3022R = p2e;
        this.X = i;
        this.f3024v = z2;
        this.f3020R = h0t;
        this.R = h0t2;
        this.v = h0t3;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        ncu ncu = (ncu) obj;
        ((Number) obj3).intValue();
        jr_ jr_ = (jr_) ((m88) obj2);
        jr_.w(2040469710);
        if (this.f3023R) {
            Object x = jQ.x(jr_, 773894976, -492369756);
            if (x == ppN.R) {
                hyO hyo = new hyO(caw.N(jr_));
                jr_.ZW(hyo);
                x = hyo;
            }
            jr_.g(false);
            jy_ jy_ = ((hyO) x).R;
            jr_.g(false);
            Object[] objArr = {this.f3021R, this.f3022R, Integer.valueOf(this.X), Boolean.valueOf(this.f3024v)};
            jx3 jx3 = new jx3(this.f3024v, this.X, this.f3020R, this.R, jy_, this.f3021R, this.v, null);
            pdm pdm = lCG.R;
            ncu = g4x.g(ncu, lBz.Y, new fB0(objArr, 9, jx3));
        }
        jr_.g(false);
        return ncu;
    }
}
