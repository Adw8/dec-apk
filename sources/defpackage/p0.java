package defpackage;

/* renamed from: p0  reason: default package */
/* loaded from: classes.dex */
public final class p0 extends aFk implements iv7 {
    public final /* synthetic */ Tq R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f7050R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Tq tq, String str, aOO aoo) {
        super(2, aoo);
        this.R = tq;
        this.f7050R = str;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((p0) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            bLS bls = this.R.f539R;
            String str = this.f7050R;
            this.X = 1;
            if (bls.R(str, this) == bgr) {
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
        return new p0(this.R, this.f7050R, aoo);
    }
}
