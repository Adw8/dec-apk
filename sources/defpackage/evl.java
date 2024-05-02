package defpackage;

/* renamed from: evl  reason: default package */
/* loaded from: classes.dex */
public final class evl extends aFk implements iv7 {
    public final /* synthetic */ iTB R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f3244R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3245R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public evl(iTB itb, iv7 iv7, aOO aoo) {
        super(2, aoo);
        this.R = itb;
        this.f3244R = iv7;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((evl) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            iTB itb = this.R;
            itb.f4597R = (jy_) this.f3245R;
            iv7 iv7 = this.f3244R;
            this.X = 1;
            if (iv7.J(itb, this) == bgr) {
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
        evl evl = new evl(this.R, this.f3244R, aoo);
        evl.f3245R = obj;
        return evl;
    }
}
