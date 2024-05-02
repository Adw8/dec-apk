package defpackage;

/* renamed from: lEB  reason: default package */
/* loaded from: classes.dex */
public final class lEB extends k8G implements kg9 {
    public final /* synthetic */ dHi R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lEB(dHi dhi, int i) {
        super(1);
        this.X = i;
        this.R = dhi;
    }

    public final Double R(double d) {
        switch (this.X) {
            case 0:
                dHi dhi = this.R;
                return (Double) dhi.f2554v.x(Double.valueOf(caw.Z(d, (double) dhi.R, (double) dhi.v)));
            default:
                double doubleValue = ((Number) this.R.f2549R.x(Double.valueOf(d))).doubleValue();
                dHi dhi2 = this.R;
                return Double.valueOf(caw.Z(doubleValue, (double) dhi2.R, (double) dhi2.v));
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
