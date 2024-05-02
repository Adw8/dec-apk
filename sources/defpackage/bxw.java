package defpackage;

/* renamed from: bxw  reason: default package */
/* loaded from: classes.dex */
public final class bxw extends hlx {
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nfJ f1875R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bxw(oLj olj, nfJ nfj, Object obj) {
        super(olj);
        this.f1875R = nfj;
        this.R = obj;
    }

    @Override // defpackage.KZ
    public final lmI c(Object obj) {
        oLj olj = (oLj) obj;
        if (this.f1875R.E() == this.R) {
            return null;
        }
        return n1P.f6268R;
    }
}
