package defpackage;

/* renamed from: iI2  reason: default package */
/* loaded from: classes.dex */
public final class iI2 extends k8G implements kg9 {
    public final /* synthetic */ double R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iI2(double d, int i) {
        super(1);
        this.X = i;
        this.R = d;
    }

    public final Double R(double d) {
        switch (this.X) {
            case 0:
                if (d < 0.0d) {
                    d = 0.0d;
                }
                return Double.valueOf(Math.pow(d, 1.0d / this.R));
            default:
                if (d < 0.0d) {
                    d = 0.0d;
                }
                return Double.valueOf(Math.pow(d, this.R));
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        switch (this.X) {
            case 0:
                return R(((Number) obj).doubleValue());
            default:
                return R(((Number) obj).doubleValue());
        }
    }
}
