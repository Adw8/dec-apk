package defpackage;

/* renamed from: bau  reason: default package */
/* loaded from: classes.dex */
public final class bau extends aFk implements iv7 {
    public final /* synthetic */ iv7 R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f1755R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ n_I f1756R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bau(n_I n_i, iv7 iv7, aOO aoo) {
        super(2, aoo);
        this.f1756R = n_i;
        this.R = iv7;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((bau) X((gAN) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0005 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: bau */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: bau */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, o8s] */
    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        try {
            if (i == 0) {
                jjU.o(obj);
                gAN gan = (gAN) this.f1755R;
                this.f1756R.f6463R.R(Boolean.TRUE);
                iv7 iv7 = this.R;
                this.X = 1;
                if (iv7.J(gan, this) == bgr) {
                    return bgr;
                }
            } else if (i == 1) {
                jjU.o(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f1756R.f6463R.R(Boolean.FALSE);
            this = o8s.R;
            return this;
        } catch (Throwable th) {
            this.f1756R.f6463R.R(Boolean.FALSE);
            throw th;
        }
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        bau bau = new bau(this.f1756R, this.R, aoo);
        bau.f1755R = obj;
        return bau;
    }
}
