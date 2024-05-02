package defpackage;

/* renamed from: aMZ  reason: default package */
/* loaded from: classes.dex */
public final class aMZ extends k8G implements kg9 {
    public final /* synthetic */ nTx R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aMZ(nTx ntx, int i) {
        super(1);
        this.X = i;
        this.R = ntx;
    }

    public final Double R(double d) {
        switch (this.X) {
            case 0:
                nTx ntx = this.R;
                double d2 = ntx.v;
                double d3 = ntx.c;
                double d4 = ntx.e;
                return Double.valueOf(d >= ntx.X * d4 ? (Math.pow(d, 1.0d / ntx.R) - d3) / d2 : d / d4);
            case 1:
                nTx ntx2 = this.R;
                double d5 = ntx2.v;
                double d6 = ntx2.c;
                double d7 = ntx2.e;
                return Double.valueOf(d >= ntx2.X * d7 ? (Math.pow(d - ntx2.O, 1.0d / ntx2.R) - d6) / d5 : (d - ntx2.L) / d7);
            case 2:
                nTx ntx3 = this.R;
                return Double.valueOf(d >= ntx3.X ? Math.pow((ntx3.v * d) + ntx3.c, ntx3.R) : d * ntx3.e);
            default:
                nTx ntx4 = this.R;
                double d8 = ntx4.v;
                double d9 = ntx4.c;
                double d10 = ntx4.e;
                return Double.valueOf(d >= ntx4.X ? Math.pow((d8 * d) + d9, ntx4.R) + ntx4.O : (d10 * d) + ntx4.L);
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        switch (this.X) {
            case 0:
                return R(((Number) obj).doubleValue());
            case 1:
                return R(((Number) obj).doubleValue());
            case 2:
                return R(((Number) obj).doubleValue());
            default:
                return R(((Number) obj).doubleValue());
        }
    }
}
