package defpackage;

/* renamed from: O_  reason: default package */
/* loaded from: classes.dex */
public final class O_ extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ ncu R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O_(ncu ncu, int i, int i2) {
        super(2);
        this.X = i2;
        this.R = ncu;
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
                PO.R(this.R, m88, this.O | 1);
                return;
            default:
                iq.v(this.R, m88, this.O | 1);
                return;
        }
    }
}
