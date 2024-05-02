package defpackage;

/* renamed from: fSg  reason: default package */
/* loaded from: classes.dex */
public final class fSg extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f3422R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fSg(long j, iv7 iv7, int i, int i2) {
        super(2);
        this.X = i2;
        this.R = j;
        this.f3422R = iv7;
        this.O = i;
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
                l6.R(new bkv[]{kft.R.v(new n3(this.R))}, aH9.I(m88, -945978686, new he(this.f3422R, this.O, 2)), m88, 56);
                return;
            default:
                if ((i & 11) == 2) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                l6.R(new bkv[]{kft.R.v(new n3(this.R))}, this.f3422R, m88, ((this.O >> 3) & 112) | 8);
                return;
        }
    }
}
