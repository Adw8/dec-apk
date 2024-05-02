package defpackage;

/* renamed from: opo  reason: default package */
/* loaded from: classes.dex */
public final class opo extends k8G implements f_c {
    public final /* synthetic */ oey R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ opo(oey oey, int i) {
        super(0);
        this.X = i;
        this.R = oey;
    }

    @Override // defpackage.f_c
    public final Object g() {
        switch (this.X) {
            case 0:
                return Integer.valueOf(this.R.O());
            default:
                return Float.valueOf((((float) ((Number) this.R.f6878R.v.getValue()).intValue()) / 100000.0f) + ((float) this.R.O()));
        }
    }
}
