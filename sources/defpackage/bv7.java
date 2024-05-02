package defpackage;

/* renamed from: bv7  reason: default package */
/* loaded from: classes.dex */
public final class bv7 extends aFk implements iv7 {
    public final /* synthetic */ gnW R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ j4B f1857R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bv7(j4B j4b, gnW gnw, aOO aoo) {
        super(2, aoo);
        this.f1857R = j4b;
        this.R = gnw;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((bv7) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            bLS bls = ((p2E) this.f1857R).R;
            Ro ro = new Ro(this.R, 2);
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
        return new bv7(this.f1857R, this.R, aoo);
    }
}
