package defpackage;

/* renamed from: a95  reason: default package */
/* loaded from: classes.dex */
public final class a95 extends aFk implements iv7 {
    public final /* synthetic */ dVV R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ j4B f759R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f760R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public a95(j4B j4b, dVV dvv, aOO aoo) {
        super(2, aoo);
        this.f759R = j4b;
        this.R = dvv;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((a95) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            bLS bls = ((p2E) this.f759R).R;
            aLH alh = new aLH(this.R, 1, (jy_) this.f760R);
            this.X = 1;
            bls.getClass();
            if (bLS.U(bls, alh, this) == bgr) {
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
        a95 a95 = new a95(this.f759R, this.R, aoo);
        a95.f760R = obj;
        return a95;
    }
}
