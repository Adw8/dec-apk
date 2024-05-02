package defpackage;

/* renamed from: lVb  reason: default package */
/* loaded from: classes.dex */
public final class lVb extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ h5L R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f5765R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lVb(h5L h5l, Object obj, int i, int i2) {
        super(2);
        this.X = i2;
        this.R = h5l;
        this.f5765R = obj;
        this.O = i;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            default:
                R((m88) obj, ((Number) obj2).intValue());
                break;
        }
        return o8s.R;
    }

    public final void R(m88 m88, int i) {
        switch (this.X) {
            case 0:
                this.R.R(this.f5765R, m88, this.O | 1);
                return;
            default:
                this.R.m(this.f5765R, m88, this.O | 1);
                return;
        }
    }
}
