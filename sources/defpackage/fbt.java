package defpackage;

/* renamed from: fbt  reason: default package */
/* loaded from: classes.dex */
public final class fbt implements gIB {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ aAC f3469R;

    public /* synthetic */ fbt(k8G k8g, int i) {
        this.R = i;
        this.f3469R = k8g;
    }

    public final void R() {
        switch (this.R) {
            case 0:
                iv7 iv7 = (iv7) this.f3469R;
                synchronized (jwU.f5150R) {
                    jwU.f5151R.remove(iv7);
                }
                return;
            default:
                kg9 kg9 = (kg9) this.f3469R;
                synchronized (jwU.f5150R) {
                    jwU.v.remove(kg9);
                }
                jwU.e(nqF.Z);
                return;
        }
    }
}
