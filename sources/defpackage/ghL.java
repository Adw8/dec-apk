package defpackage;

/* renamed from: ghL  reason: default package */
/* loaded from: classes.dex */
public final class ghL extends aFk implements iv7 {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nhg f3874R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ghL(nhg nhg, aOO aoo) {
        super(2, aoo);
        this.f3874R = nhg;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((ghL) X((gAN) obj, (aOO) obj2)).O(o8s.R);
        return bGR.COROUTINE_SUSPENDED;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            nhg nhg = this.f3874R;
            hki hki = new hki(12, (gAN) this.R);
            this.X = 1;
            if (nhg.v(hki, this) == bgr) {
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
        ghL ghl = new ghL(this.f3874R, aoo);
        ghl.R = obj;
        return ghl;
    }
}
