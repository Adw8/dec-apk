package defpackage;

/* renamed from: Sv  reason: default package */
/* loaded from: classes.dex */
public final class Sv extends k8G implements iv7 {
    public final /* synthetic */ h0T R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Sv(h0T h0t, int i) {
        super(2);
        this.X = i;
        this.R = h0t;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                R((oOe) obj, (oOe) obj2);
                break;
            case 1:
                R((oOe) obj, (oOe) obj2);
                break;
            case 2:
                m88 m88 = (m88) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return o8s.R;
                    }
                }
                oyV.f7045R.R(d_f.R(this.R), m88, 64);
                return o8s.R;
            default:
                phU phu = (phU) obj;
                long j = ((aWo) obj2).f906R;
                h0T h0t = this.R;
                float f = iqx.R;
                h0t.R(new aWo(aWo.L(((aWo) h0t.getValue()).f906R, j)));
                return o8s.R;
        }
        return o8s.R;
    }

    public final void R(oOe ooe, oOe ooe2) {
        switch (this.X) {
            case 0:
                this.R.R(new b3a(a4b.c(ooe, ooe2)));
                return;
            default:
                this.R.R(new b3a(a4b.c(ooe, ooe2)));
                return;
        }
    }
}
