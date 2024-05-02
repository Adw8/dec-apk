package defpackage;

/* renamed from: h8Y  reason: default package */
/* loaded from: classes.dex */
public final class h8Y extends k8G implements kg9 {
    public final /* synthetic */ gv2 R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8Y(gv2 gv2, int i) {
        super(1);
        this.X = i;
        this.R = gv2;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                poS b = ((hjM) obj).b();
                long j = ((l0f) b).R;
                long v = b.v(aWo.v);
                long v2 = cU5.v(mLz.t(aWo.e(v)), mLz.t(aWo.X(v)));
                gv2 gv2 = this.R;
                int i = (int) (v2 >> 32);
                gv2.f3984R.R(new oOe(i, dU5.v(v2), ((int) (j >> 32)) + i, ltH.v(j) + dU5.v(v2)));
                this.R.x();
                break;
            default:
                long j2 = ((ltH) obj).R;
                gv2 gv22 = this.R;
                gv22.f3987v.R(new ltH(j2));
                this.R.x();
                break;
        }
        return o8s.R;
    }
}
