package defpackage;

/* renamed from: tt  reason: default package */
/* loaded from: classes.dex */
public final class tt extends k8G implements kg9 {
    public final /* synthetic */ hfa R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tt(hfa hfa, int i) {
        super(1);
        this.X = i;
        this.R = hfa;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                dlc dlc = (dlc) obj;
                this.R.show();
                return new acE(9, this.R);
            default:
                jnM jnm = (jnM) obj;
                hfa hfa = this.R;
                if (hfa.f4341R.f3762R) {
                    hfa.f4340R.g();
                }
                return o8s.R;
        }
    }
}
