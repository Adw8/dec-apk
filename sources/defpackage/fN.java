package defpackage;

/* renamed from: fN  reason: default package */
/* loaded from: classes.dex */
public final class fN extends aFk implements iv7 {
    public final /* synthetic */ N0 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pa3 f3400R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fN(N0 n0, pa3 pa3, aOO aoo) {
        super(2, aoo);
        this.R = n0;
        this.f3400R = pa3;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((fN) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            g3 g3Var = this.R.R;
            pa3 pa3 = this.f3400R;
            this.X = 1;
            obj = g3Var.R(pa3, this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new fN(this.R, this.f3400R, aoo);
    }
}
