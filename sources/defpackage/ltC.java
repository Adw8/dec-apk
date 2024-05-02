package defpackage;

/* renamed from: ltC  reason: default package */
/* loaded from: classes.dex */
public final class ltC extends k8G implements kg9 {
    public final /* synthetic */ double R;
    public final /* synthetic */ int X;
    public final /* synthetic */ double c;
    public final /* synthetic */ double e;
    public final /* synthetic */ double v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ltC(double d, double d2, double d3, double d4, int i) {
        super(1);
        this.X = i;
        this.R = d;
        this.v = d2;
        this.c = d3;
        this.e = d4;
    }

    public final Double R(double d) {
        switch (this.X) {
            case 0:
                return Double.valueOf((Math.exp(this.c * d) * ((this.v * d) + this.R)) + this.e);
            default:
                double d2 = this.R;
                double d3 = this.v;
                double exp = Math.exp(d3 * d) * d2 * d3;
                double d4 = this.c;
                double d5 = this.e;
                return Double.valueOf((Math.exp(d5 * d) * d4 * d5) + exp);
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
