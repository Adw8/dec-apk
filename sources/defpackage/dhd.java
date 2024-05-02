package defpackage;

/* renamed from: dhd  reason: default package */
/* loaded from: classes.dex */
public final class dhd extends aFk implements iv7 {
    public final /* synthetic */ Zh R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ oSF f2826R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public dhd(oSF osf, Zh zh, aOO aoo) {
        super(2, aoo);
        this.f2826R = osf;
        this.R = zh;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((dhd) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            ivW ivw = this.f2826R.R;
            OP op = new OP(this.R, 1);
            this.X = 1;
            if (mxC.m(this, ivw, op) == bgr) {
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
        return new dhd(this.f2826R, this.R, aoo);
    }
}
