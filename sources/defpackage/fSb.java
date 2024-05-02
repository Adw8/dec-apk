package defpackage;

/* renamed from: fSb  reason: default package */
/* loaded from: classes.dex */
public final class fSb extends aFk implements iv7 {
    public final /* synthetic */ iyL R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fSb(iyL iyl, aOO aoo) {
        super(2, aoo);
        this.R = iyl;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((fSb) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            bLS bls = this.R.R;
            o8s o8s = o8s.R;
            this.X = 1;
            if (bls.R(o8s, this) == bgr) {
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
        return new fSb(this.R, aoo);
    }
}
