package defpackage;

/* renamed from: aV  reason: default package */
/* loaded from: classes.dex */
public final class aV extends k8G implements kg9 {
    public final /* synthetic */ int O;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aV(int i, int i2) {
        super(1);
        this.X = i2;
        this.O = i;
    }

    public final Integer R(cxM cxm) {
        switch (this.X) {
            case 0:
                return Integer.valueOf(cxm.Z(this.O));
            case 1:
                return Integer.valueOf(cxm.k(this.O));
            case 2:
                return Integer.valueOf(cxm.zw(this.O));
            default:
                return Integer.valueOf(cxm.ZW(this.O));
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        switch (this.X) {
            case 0:
                return R((cxM) obj);
            case 1:
                return R((cxM) obj);
            case 2:
                return R((cxM) obj);
            default:
                return R((cxM) obj);
        }
    }
}
