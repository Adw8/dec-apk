package defpackage;

/* renamed from: lBx  reason: default package */
/* loaded from: classes.dex */
public final class lBx extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ fVb R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ j4B f5611R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f5612R;
    public final /* synthetic */ int X;
    public final /* synthetic */ boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lBx(boolean z, boolean z2, j4B j4b, fVb fvb, int i, int i2) {
        super(2);
        this.f5612R = z;
        this.v = z2;
        this.f5611R = j4b;
        this.R = fvb;
        this.X = i;
        this.O = i2;
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
        f3L f3l = vC.f7433R;
        mIy miy = mIy.f6001R;
        boolean z = this.f5612R;
        boolean z2 = this.v;
        j4B j4b = this.f5611R;
        fVb fvb = this.R;
        int i = this.X;
        miy.v(z, z2, j4b, fvb, null, 0.0f, 0.0f, m88, 12582912 | ((i >> 6) & 14) | ((i >> 15) & 112) | ((i >> 9) & 896) | ((this.O << 3) & 7168), 112);
        return o8s.R;
    }
}
