package defpackage;

/* renamed from: SM  reason: default package */
/* loaded from: classes.dex */
public final class SM extends aFk implements iv7 {
    public final /* synthetic */ gnW R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ j4B f514R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public SM(j4B j4b, gnW gnw, aOO aoo) {
        super(2, aoo);
        this.f514R = j4b;
        this.R = gnw;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((SM) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            bLS bls = ((p2E) this.f514R).R;
            Ro ro = new Ro(this.R, 0);
            this.X = 1;
            bls.getClass();
            if (bLS.U(bls, ro, this) == bgr) {
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
        return new SM(this.f514R, this.R, aoo);
    }
}
