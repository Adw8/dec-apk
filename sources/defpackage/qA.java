package defpackage;

/* renamed from: qA  reason: default package */
/* loaded from: classes.dex */
public final class qA extends aFk implements iv7 {
    public final /* synthetic */ oDO R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f7353R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public qA(p2E p2e, oDO odo, aOO aoo) {
        super(2, aoo);
        this.f7353R = p2e;
        this.R = odo;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((qA) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            p2E p2e = this.f7353R;
            oDO odo = this.R;
            this.X = 1;
            if (p2e.R(odo, this) == bgr) {
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
        return new qA(this.f7353R, this.R, aoo);
    }
}
