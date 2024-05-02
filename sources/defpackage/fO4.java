package defpackage;

/* renamed from: fO4  reason: default package */
/* loaded from: classes.dex */
public final class fO4 extends k8G implements iv7 {
    public final /* synthetic */ iv7 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ miv f3404R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f3405R;
    public final /* synthetic */ int X;
    public final /* synthetic */ iv7 c;
    public final /* synthetic */ iv7 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fO4(iv7 iv7, miv miv, boolean z, int i, iv7 iv72, iv7 iv73) {
        super(2);
        this.R = iv7;
        this.f3404R = miv;
        this.f3405R = z;
        this.X = i;
        this.v = iv72;
        this.c = iv73;
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
        jr_ jr_2 = (jr_) m88;
        jr_2.w(1426254055);
        if (this.R != null) {
            bkv[] bkvArr = new bkv[1];
            kPU kpu = kft.R;
            miv miv = this.f3404R;
            boolean z = this.f3405R;
            miv.getClass();
            jr_2.w(1521013607);
            h0T s = l6.s(new n3(z ? miv.v : miv.X), jr_2);
            jr_2.g(false);
            bkvArr[0] = kpu.v(s.getValue());
            l6.R(bkvArr, aH9.I(m88, 2035552199, new he(this.R, this.X, 3)), m88, 56);
        }
        jr_2.g(false);
        bkv[] bkvArr2 = new bkv[1];
        kPU kpu2 = kft.R;
        miv miv2 = this.f3404R;
        boolean z2 = this.f3405R;
        miv2.getClass();
        jr_2.w(-1023108655);
        h0T s2 = l6.s(new n3(z2 ? miv2.R : miv2.e), jr_2);
        jr_2.g(false);
        bkvArr2[0] = kpu2.v(s2.getValue());
        l6.R(bkvArr2, aH9.I(m88, -1728894036, new tJ(nAL.R, this.R, this.v, this.c, this.X, 1)), m88, 56);
        if (this.v != null) {
            bkv[] bkvArr3 = new bkv[1];
            miv miv3 = this.f3404R;
            boolean z3 = this.f3405R;
            miv3.getClass();
            jr_2.w(1024062809);
            h0T s3 = l6.s(new n3(z3 ? miv3.c : miv3.O), jr_2);
            jr_2.g(false);
            bkvArr3[0] = kpu2.v(s3.getValue());
            l6.R(bkvArr3, aH9.I(m88, 580312062, new he(this.v, this.X, 4)), m88, 56);
        }
        return o8s.R;
    }
}
