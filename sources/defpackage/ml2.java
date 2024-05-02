package defpackage;

/* renamed from: ml2  reason: default package */
/* loaded from: classes.dex */
public final class ml2 extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ fVb R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ j4B f6149R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ n76 f6150R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f6151R;
    public final /* synthetic */ int X;
    public final /* synthetic */ boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ml2(boolean z, boolean z2, j4B j4b, fVb fvb, n76 n76, int i, int i2, int i3) {
        super(2);
        this.X = i3;
        this.f6151R = z;
        this.v = z2;
        this.f6149R = j4b;
        this.R = fvb;
        this.f6150R = n76;
        this.O = i;
        this.L = i2;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            default:
                R((m88) obj, ((Number) obj2).intValue());
                break;
        }
        return o8s.R;
    }

    public final void R(m88 m88, int i) {
        switch (this.X) {
            case 0:
                if ((i & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                fVb fvb = this.R;
                n76 n76 = this.f6150R;
                int i2 = this.L;
                mIy.f6001R.v(this.f6151R, this.v, (p2E) this.f6149R, fvb, n76, 0.0f, 0.0f, m88, 12582912 | ((this.O >> 9) & 14) | (i2 & 112) | ((i2 >> 15) & 896) | ((i2 >> 18) & 7168) | ((i2 >> 12) & 57344), 96);
                return;
            default:
                if ((i & 11) == 2) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                mIy miy = mIy.f6001R;
                boolean z = this.f6151R;
                boolean z2 = this.v;
                j4B j4b = this.f6149R;
                fVb fvb2 = this.R;
                n76 n762 = this.f6150R;
                int i3 = this.O;
                int i4 = this.L;
                miy.R(z, z2, j4b, fvb2, n762, m88, 196608 | ((i3 >> 6) & 14) | ((i3 >> 15) & 112) | ((i3 >> 9) & 896) | (i4 & 7168) | ((i4 << 6) & 57344), 0);
                return;
        }
    }
}
