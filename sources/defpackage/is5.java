package defpackage;

/* renamed from: is5  reason: default package */
/* loaded from: classes.dex */
public final class is5 extends aFk implements iv7 {
    public final /* synthetic */ aD8 R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public is5(aD8 ad8, aOO aoo) {
        super(2, aoo);
        this.R = ad8;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((is5) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            lIh K = l6.K(new cMC(0, l6.l(new hNx(this.R, 0))));
            lvV lvv = new lvV(this.R, 0);
            this.X = 1;
            if (K.v(lvv, this) == bgr) {
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
        return new is5(this.R, aoo);
    }
}
