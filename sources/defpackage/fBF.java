package defpackage;

/* renamed from: fBF  reason: default package */
/* loaded from: classes.dex */
public final class fBF extends k8G implements kg9 {
    public final /* synthetic */ int O;
    public final /* synthetic */ cXC R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ l0f f3335R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mZf f3336R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fBF(cXC cxc, int i, l0f l0f, int i2, mZf mzf) {
        super(1);
        this.R = cxc;
        this.X = i;
        this.f3335R = l0f;
        this.O = i2;
        this.f3336R = mzf;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        iv7 iv7 = this.R.R;
        int i = this.X;
        l0f l0f = this.f3335R;
        h57.e((h57) obj, this.f3335R, ((dU5) iv7.J(new ltH(iTI.R(i - l0f.e, this.O - l0f.X)), this.f3336R.getLayoutDirection())).f2628R);
        return o8s.R;
    }
}
