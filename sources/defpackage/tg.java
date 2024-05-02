package defpackage;

/* renamed from: tg  reason: default package */
/* loaded from: classes.dex */
public final class tg extends hlx {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ DW f7420R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tg(oLj olj, DW dw, int i) {
        super(olj);
        this.R = i;
        this.f7420R = dw;
    }

    @Override // defpackage.KZ
    public final /* bridge */ /* synthetic */ lmI c(Object obj) {
        switch (this.R) {
            case 0:
                oLj olj = (oLj) obj;
                return (lmI) e();
            default:
                oLj olj2 = (oLj) obj;
                return (lmI) e();
        }
    }

    public final Object e() {
        switch (this.R) {
            case 0:
                if (((nJ) this.f7420R).o()) {
                    return null;
                }
                return n1P.f6268R;
            default:
                if (this.f7420R.C()) {
                    return null;
                }
                return n1P.f6268R;
        }
    }
}
