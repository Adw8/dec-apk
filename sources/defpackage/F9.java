package defpackage;

/* renamed from: F9  reason: default package */
/* loaded from: classes.dex */
public final class F9 extends k8G implements iv7 {
    public final /* synthetic */ vV R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F9(vV vVVar, int i) {
        super(2);
        this.X = i;
        this.R = vVVar;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return Integer.valueOf(this.R.R(0, ((Number) obj).intValue(), (mdz) obj2));
            default:
                long j = ((ltH) obj).R;
                return new dU5(cU5.v(this.R.R(0, (int) (j >> 32), (mdz) obj2), 0));
        }
    }
}
