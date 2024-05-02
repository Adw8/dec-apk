package defpackage;

/* renamed from: o1H  reason: default package */
/* loaded from: classes.dex */
public final class o1H extends k8G implements kg9 {
    public final /* synthetic */ gIA R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1H(gIA gia, int i) {
        super(1);
        this.X = i;
        this.R = gia;
    }

    public final Boolean R(fue fue) {
        boolean z = true;
        switch (this.X) {
            case 0:
                poS L = iTI.L(fue);
                if (!L.p() || n3x.v(this.R, ooA.g(L).j(L, true))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                poS L2 = iTI.L(fue);
                if (!L2.p() || n3x.v(this.R, ooA.g(L2).j(L2, true))) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        switch (this.X) {
            case 0:
                return R((fue) obj);
            default:
                return R((fue) obj);
        }
    }
}
