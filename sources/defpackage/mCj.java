package defpackage;

/* renamed from: mCj  reason: default package */
/* loaded from: classes.dex */
public final class mCj extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mCj(int i, int i2, int i3) {
        super(2);
        this.X = i3;
        this.O = i;
        this.L = i2;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 1:
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
                f7Z.v(iTI.g(this.O, m88), null, null, 0, m88, 56, 12);
                return;
            case 1:
                cpc.P(this.O, m88, this.L | 1);
                return;
            default:
                pdD.v(this.O, m88, this.L | 1);
                return;
        }
    }
}
