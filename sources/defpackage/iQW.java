package defpackage;

/* renamed from: iQW  reason: default package */
/* loaded from: classes.dex */
public final class iQW extends k8G implements f_c {
    public final /* synthetic */ int O;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iQW(int i, int i2) {
        super(0);
        this.X = i2;
        this.O = i;
    }

    @Override // defpackage.f_c
    public final Object g() {
        switch (this.X) {
            case 0:
                return new hNI(this.O);
            default:
                return new aD8(this.O);
        }
    }
}
