package defpackage;

/* renamed from: gG  reason: default package */
/* loaded from: classes.dex */
public final class gG extends aFk implements iv7 {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pU f3700R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gG(pU pUVar, aOO aoo) {
        super(2, aoo);
        this.f3700R = pUVar;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((gG) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            Tn tn = new Tn(this.f3700R, null);
            this.X = 1;
            if (ooA.y((ck3) this.R, tn, this) == bgr) {
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
        gG gGVar = new gG(this.f3700R, aoo);
        gGVar.R = obj;
        return gGVar;
    }
}
