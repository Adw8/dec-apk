package defpackage;

/* renamed from: mLX  reason: default package */
/* loaded from: classes.dex */
public final class mLX extends k8G implements kg9 {
    public final /* synthetic */ h5L R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mLX(h5L h5l, int i) {
        super(1);
        this.X = i;
        this.R = h5l;
    }

    public final nRn R() {
        switch (this.X) {
            case 1:
                return new csy(this.R, 0);
            default:
                return new csy(this.R, 1);
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                long longValue = ((Number) obj).longValue();
                if (!this.R.X()) {
                    this.R.O(longValue / 1);
                }
                return o8s.R;
            case 1:
                dlc dlc = (dlc) obj;
                return R();
            default:
                dlc dlc2 = (dlc) obj;
                return R();
        }
    }
}
