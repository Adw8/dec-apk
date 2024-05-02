package defpackage;

/* renamed from: nWm  reason: default package */
/* loaded from: classes.dex */
public final class nWm extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f6422R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nWm(Object obj, boolean z, int i, int i2) {
        super(2);
        this.X = i2;
        this.R = obj;
        this.f6422R = z;
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
                dTl.U((fBS) this.R, this.f6422R, m88, this.O | 1);
                return;
            default:
                ((oyV) this.R).R(this.f6422R, m88, this.O | 1);
                return;
        }
    }
}
