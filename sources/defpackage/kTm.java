package defpackage;

/* renamed from: kTm  reason: default package */
/* loaded from: classes.dex */
public final class kTm extends k8G implements f_c {
    public final /* synthetic */ ojR R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kTm(ojR ojr, int i) {
        super(0);
        this.X = i;
        this.R = ojr;
    }

    public final void R() {
        switch (this.X) {
            case 0:
                this.R.e();
                return;
            case 1:
                this.R.onCancel();
                return;
            case 2:
                this.R.e();
                return;
            default:
                this.R.onCancel();
                return;
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                R();
                break;
            case 1:
                R();
                break;
            case 2:
                R();
                break;
            default:
                R();
                break;
        }
        return o8s.R;
    }
}
