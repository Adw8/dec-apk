package defpackage;

/* renamed from: chb  reason: default package */
/* loaded from: classes.dex */
public final class chb extends k8G implements f_c {
    public final /* synthetic */ h0T R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ chb(h0T h0t, int i) {
        super(0);
        this.X = i;
        this.R = h0t;
    }

    public final void R() {
        switch (this.X) {
            case 0:
                this.R.R(Boolean.TRUE);
                return;
            case 1:
                this.R.R(Boolean.TRUE);
                return;
            case 2:
                this.R.R(Boolean.FALSE);
                return;
            case 3:
                this.R.R(Boolean.TRUE);
                return;
            case 4:
                this.R.R(Boolean.FALSE);
                return;
            default:
                this.R.R(Boolean.FALSE);
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
            case 3:
                R();
                break;
            case 4:
                R();
                break;
            default:
                R();
                break;
        }
        return o8s.R;
    }
}
