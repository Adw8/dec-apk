package defpackage;

/* renamed from: ecS  reason: default package */
/* loaded from: classes.dex */
public final class ecS extends k8G implements kg9 {
    public final /* synthetic */ kg9 R;
    public final /* synthetic */ int X;
    public final /* synthetic */ kg9 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ecS(kg9 kg9, kg9 kg92, int i) {
        super(1);
        this.X = i;
        this.R = kg9;
        this.v = kg92;
    }

    public final void R(Object obj) {
        switch (this.X) {
            case 1:
                this.R.x(obj);
                this.v.x(obj);
                return;
            case 2:
                this.R.x(obj);
                this.v.x(obj);
                return;
            default:
                this.R.x(obj);
                this.v.x(obj);
                return;
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        int i;
        switch (this.X) {
            case 0:
                nQA nqa = (nQA) obj;
                synchronized (jwU.f5150R) {
                    i = jwU.R;
                    jwU.R = i + 1;
                }
                return new kpt(i, nqa, this.R, this.v);
            case 1:
                R(obj);
                break;
            case 2:
                R(obj);
                break;
            default:
                R(obj);
                break;
        }
        return o8s.R;
    }
}
