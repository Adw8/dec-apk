package defpackage;

/* renamed from: nrE  reason: default package */
/* loaded from: classes.dex */
public final class nrE extends aFk implements iv7 {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kJx f6611R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f6612R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public nrE(lR3 lr3, kJx kjx, aOO aoo) {
        super(2, aoo);
        this.f6612R = lr3;
        this.f6611R = kjx;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((nrE) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            lR3 lr3 = this.f6612R;
            kJx kjx = this.f6611R;
            this.X = 1;
            if (lr3.y((jy_) this.R, kjx, this) == bgr) {
                return bgr;
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
        nrE nre = new nrE(this.f6612R, this.f6611R, aoo);
        nre.R = obj;
        return nre;
    }
}
