package defpackage;

/* renamed from: peo  reason: default package */
/* loaded from: classes.dex */
public final class peo extends aFk implements iv7 {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ojR f7156R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public peo(ojR ojr, aOO aoo) {
        super(2, aoo);
        this.f7156R = ojr;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((peo) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Object obj2 = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            ojR ojr = this.f7156R;
            this.X = 1;
            Object L = jjU.L(new c5m((ck3) this.R, ojr, null), this);
            if (L != obj2) {
                L = o8s.R;
            }
            if (L == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        peo peo = new peo(this.f7156R, aoo);
        peo.R = obj;
        return peo;
    }
}
