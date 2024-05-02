package defpackage;

/* renamed from: gU0  reason: default package */
/* loaded from: classes.dex */
public final class gU0 extends aFk implements iv7 {
    public final /* synthetic */ iTB R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f3764R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3765R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gU0(iTB itb, iv7 iv7, aOO aoo) {
        super(2, aoo);
        this.R = itb;
        this.f3764R = iv7;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((gU0) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            iTB itb = this.R;
            itb.f4597R = (jy_) this.f3765R;
            iv7 iv7 = this.f3764R;
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
        gU0 gu0 = new gU0(this.R, this.f3764R, aoo);
        gu0.f3765R = obj;
        return gu0;
    }
}
