package defpackage;

/* renamed from: mf7  reason: default package */
/* loaded from: classes.dex */
public final class mf7 extends k8G implements iv7 {
    public final /* synthetic */ n67 R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf7(n67 n67, int i) {
        super(2);
        this.X = i;
        this.R = n67;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                fue fue = (fue) obj;
                this.R.R().f5638R = (hYA) obj2;
                break;
            case 1:
                lGT R = this.R.R();
                ((fue) obj).B(new fWD(R, (iv7) obj2, R.f5640R));
                break;
            default:
                fue fue2 = (fue) obj;
                n67 n67 = (n67) obj2;
                n67 n672 = this.R;
                lGT lgt = fue2.f3602R;
                if (lgt == null) {
                    lgt = new lGT(fue2, n672.R);
                    fue2.f3602R = lgt;
                }
                n672.f6303R = lgt;
                this.R.R().v();
                lGT R2 = this.R.R();
                j5I j5i = this.R.R;
                if (R2.f5639R != j5i) {
                    R2.f5639R = j5i;
                    R2.R(0);
                }
                return o8s.R;
        }
        return o8s.R;
    }
}
