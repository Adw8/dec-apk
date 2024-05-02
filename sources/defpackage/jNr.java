package defpackage;

/* renamed from: jNr  reason: default package */
/* loaded from: classes.dex */
public final class jNr extends k8G implements kg9 {
    public final /* synthetic */ int O;
    public final /* synthetic */ kg9 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pi1 f4916R;
    public final /* synthetic */ int X;
    public final /* synthetic */ pi1 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jNr(pi1 pi1, pi1 pi12, int i, kg9 kg9, int i2) {
        super(1);
        this.X = i2;
        this.f4916R = pi1;
        this.v = pi12;
        this.O = i;
        this.R = kg9;
    }

    public final Boolean R(akZ akz) {
        boolean z = false;
        switch (this.X) {
            case 0:
                Boolean valueOf = Boolean.valueOf(msU.yG(this.f4916R, this.v, this.O, this.R));
                if (valueOf.booleanValue() || !akz.f996R.c((i4C) akz.f997R.R, akz.R)) {
                    z = true;
                }
                if (z) {
                    return valueOf;
                }
                return null;
            default:
                Boolean valueOf2 = Boolean.valueOf(msU.pG(this.f4916R, this.v, this.O, this.R));
                if (valueOf2.booleanValue() || !akz.f996R.c((i4C) akz.f997R.R, akz.R)) {
                    z = true;
                }
                if (z) {
                    return valueOf2;
                }
                return null;
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        switch (this.X) {
            case 0:
                return R((akZ) obj);
            default:
                return R((akZ) obj);
        }
    }
}
