package defpackage;

/* renamed from: mr_  reason: default package */
/* loaded from: classes.dex */
public final class mr_ extends k8G implements kg9 {
    public final /* synthetic */ h0T R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f6206R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mr_(h0T h0t, p2E p2e, int i) {
        super(1);
        this.X = i;
        this.R = h0t;
        this.f6206R = p2e;
    }

    public final nRn R() {
        switch (this.X) {
            case 0:
                return new gyl(this.R, this.f6206R, 0);
            case 1:
                return new gyl(this.R, this.f6206R, 1);
            case 2:
                return new gyl(this.R, this.f6206R, 2);
            default:
                return new gyl(this.R, this.f6206R, 3);
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        switch (this.X) {
            case 0:
                dlc dlc = (dlc) obj;
                return R();
            case 1:
                dlc dlc2 = (dlc) obj;
                return R();
            case 2:
                dlc dlc3 = (dlc) obj;
                return R();
            default:
                dlc dlc4 = (dlc) obj;
                return R();
        }
    }
}
