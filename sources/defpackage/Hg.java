package defpackage;

/* renamed from: Hg  reason: default package */
/* loaded from: classes.dex */
public final class Hg extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Hg(int i, int i2) {
        super(2);
        this.X = i2;
        this.O = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                m88 m88 = (m88) obj;
                ((Number) obj2).intValue();
                switch (this.X) {
                    case 0:
                        hDC.c(m88, this.O | 1);
                        break;
                    default:
                        iqx.O(m88, this.O | 1);
                        break;
                }
                return o8s.R;
            default:
                m88 m882 = (m88) obj;
                ((Number) obj2).intValue();
                switch (this.X) {
                    case 0:
                        hDC.c(m882, this.O | 1);
                        break;
                    default:
                        iqx.O(m882, this.O | 1);
                        break;
                }
                return o8s.R;
        }
    }
}
