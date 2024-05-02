package defpackage;

/* renamed from: lud  reason: default package */
/* loaded from: classes.dex */
public final class lud extends k8G implements f_c {
    public final /* synthetic */ pi1 R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lud(pi1 pi1, int i) {
        super(0);
        this.X = i;
        this.R = pi1;
    }

    public final void R() {
        switch (this.X) {
            case 0:
                dhh dhh = this.R.f7190R;
                if (dhh != null) {
                    dhh.x();
                    return;
                }
                return;
            default:
                pi1 pi1 = this.R;
                c4U c4u = pi1.f7187R;
                if (c4u != null) {
                    c4u.U(pi1.f7188R);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                R();
                break;
            default:
                R();
                break;
        }
        return o8s.R;
    }
}
