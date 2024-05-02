package defpackage;

/* renamed from: L4  reason: default package */
/* loaded from: classes.dex */
public final class L4 extends k8G implements iv7 {
    public final /* synthetic */ ky R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L4(ky kyVar, int i) {
        super(2);
        this.X = i;
        this.R = kyVar;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                mdz mdz = (mdz) obj2;
                return Integer.valueOf(this.R.R(0, ((Number) obj).intValue()));
            default:
                mdz mdz2 = (mdz) obj2;
                return new dU5(cU5.v(0, this.R.R(0, ltH.v(((ltH) obj).R))));
        }
    }
}
