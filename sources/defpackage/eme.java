package defpackage;

/* renamed from: eme  reason: default package */
/* loaded from: classes.dex */
public final class eme extends aFk implements iv7 {
    public final /* synthetic */ Tq R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3196R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ltB f3197R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public eme(Tq tq, ltB ltb, aOO aoo) {
        super(2, aoo);
        this.R = tq;
        this.f3197R = ltb;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((eme) X((h2V) obj, (aOO) obj2)).O(o8s.R);
        return bGR.COROUTINE_SUSPENDED;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            bLS bls = this.R.f539R;
            aLH alh = new aLH(this.f3197R, (h2V) this.f3196R);
            this.X = 1;
            bls.getClass();
            if (bLS.U(bls, alh, this) == bgr) {
                return bgr;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            jjU.o(obj);
        }
        throw new j8f((Object) null);
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        eme eme = new eme(this.R, this.f3197R, aoo);
        eme.f3196R = obj;
        return eme;
    }
}
