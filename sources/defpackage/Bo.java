package defpackage;

/* renamed from: Bo  reason: default package */
/* loaded from: classes.dex */
public final class Bo extends k8G implements kg9 {
    public final /* synthetic */ bkb R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Bo(bkb bkb, int i) {
        super(1);
        this.X = i;
        this.R = bkb;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                this.R.C(((hjM) obj).b());
                break;
            default:
                this.R.m10setPopupContentSizefhxjrPA(new ltH(((ltH) obj).R));
                this.R.N();
                break;
        }
        return o8s.R;
    }
}
