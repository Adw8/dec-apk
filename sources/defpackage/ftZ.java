package defpackage;

/* renamed from: ftZ  reason: default package */
/* loaded from: classes.dex */
public final class ftZ extends aFk implements iv7 {
    public final /* synthetic */ fql R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ hUt f3576R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ftZ(hUt hut, fql fql, aOO aoo) {
        super(2, aoo);
        this.f3576R = hut;
        this.R = fql;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((ftZ) X((jy_) obj, (aOO) obj2)).O(o8s.R);
        return bGR.COROUTINE_SUSPENDED;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            hUt hut = this.f3576R;
            hki hki = new hki(0, this.R);
            this.X = 1;
            if (hut.v(hki, this) == bgr) {
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
        return new ftZ(this.f3576R, this.R, aoo);
    }
}
