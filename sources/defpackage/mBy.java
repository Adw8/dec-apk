package defpackage;

/* renamed from: mBy  reason: default package */
/* loaded from: classes.dex */
public final class mBy extends k8G implements lR3 {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mBy(int i, Object obj) {
        super(3);
        this.X = i;
        this.R = obj;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        switch (i) {
            case 0:
                Su su = (Su) obj;
                mdh mdh = (mdh) obj2;
                h1W h1w = (h1W) obj3;
                switch (i) {
                    case 0:
                        h1w.X((ddq) this.R);
                        break;
                    default:
                        mdh.p(this.R);
                        break;
                }
                return o8s.R;
            default:
                Su su2 = (Su) obj;
                mdh mdh2 = (mdh) obj2;
                h1W h1w2 = (h1W) obj3;
                switch (i) {
                    case 0:
                        h1w2.X((ddq) this.R);
                        break;
                    default:
                        mdh2.p(this.R);
                        break;
                }
                return o8s.R;
        }
    }
}
