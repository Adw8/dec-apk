package defpackage;

/* renamed from: fBZ  reason: default package */
/* loaded from: classes.dex */
public final class fBZ extends aFk implements iv7 {
    public final /* synthetic */ gnW R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f3350R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fBZ(p2E p2e, gnW gnw, aOO aoo) {
        super(2, aoo);
        this.f3350R = p2e;
        this.R = gnw;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((fBZ) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            bLS bls = this.f3350R.R;
            Ro ro = new Ro(this.R, 3);
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
        return new fBZ(this.f3350R, this.R, aoo);
    }
}
