package defpackage;

/* renamed from: ofz  reason: default package */
/* loaded from: classes.dex */
public final class ofz extends k8G implements f_c {
    public final /* synthetic */ hNI R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ofz(hNI hni, int i) {
        super(0);
        this.X = i;
        this.R = hni;
    }

    public final Float R() {
        switch (this.X) {
            case 0:
                return Float.valueOf((float) this.R.X());
            default:
                return Float.valueOf((float) ((Number) this.R.v.getValue()).intValue());
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                return R();
            default:
                return R();
        }
    }
}
