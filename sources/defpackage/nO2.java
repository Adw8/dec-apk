package defpackage;

/* renamed from: nO2  reason: default package */
/* loaded from: classes.dex */
public final class nO2 extends aFk implements iv7 {
    public final /* synthetic */ h0T R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f6381R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f6382R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public nO2(iv7 iv7, h0T h0t, aOO aoo) {
        super(2, aoo);
        this.f6381R = iv7;
        this.R = h0t;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((nO2) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            iv7 iv7 = this.f6381R;
            chP chp = new chP(this.R, ((jy_) this.f6382R).C());
            this.X = 1;
            if (iv7.J(chp, this) == bgr) {
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
        nO2 no2 = new nO2(this.f6381R, this.R, aoo);
        no2.f6382R = obj;
        return no2;
    }
}
