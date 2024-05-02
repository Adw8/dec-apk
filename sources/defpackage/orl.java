package defpackage;

/* renamed from: orl  reason: default package */
/* loaded from: classes.dex */
public final class orl extends k8G implements kg9 {
    public final /* synthetic */ jr_ R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ orl(jr_ jr_, int i) {
        super(1);
        this.X = i;
        this.R = jr_;
    }

    public final void R() {
        switch (this.X) {
            case 0:
                this.R.e++;
                return;
            default:
                jr_ jr_ = this.R;
                jr_.e--;
                return;
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        switch (this.X) {
            case 0:
                dH9 dh9 = (dH9) obj;
                R();
                break;
            default:
                dH9 dh92 = (dH9) obj;
                R();
                break;
        }
        return o8s.R;
    }
}
