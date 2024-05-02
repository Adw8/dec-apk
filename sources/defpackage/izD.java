package defpackage;

/* renamed from: izD  reason: default package */
/* loaded from: classes.dex */
public final class izD extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ mpr R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ izD(mpr mpr, int i, int i2) {
        super(2);
        this.X = i2;
        this.R = mpr;
        this.O = i;
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
                cpc.U(this.R, m88, this.O | 1);
                return;
            case 1:
                vd.O(this.R, m88, this.O | 1);
                return;
            default:
                mxC.O(this.R, m88, this.O | 1);
                return;
        }
    }
}
