package defpackage;

/* renamed from: Z8  reason: default package */
/* loaded from: classes.dex */
public final class Z8 extends k8G implements f_c {
    public final /* synthetic */ e7 R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z8(e7 e7Var, int i) {
        super(0);
        this.X = i;
        this.R = e7Var;
    }

    public final void R() {
        switch (this.X) {
            case 0:
                this.R.U();
                return;
            case 1:
            default:
                e7 e7Var = this.R;
                ((lHr) e7Var.R).P(e7Var);
                return;
            case 2:
                this.R.getClass();
                throw null;
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                R();
                break;
            case 1:
            default:
                R();
                break;
            case 2:
                R();
                break;
        }
        return o8s.R;
    }
}
