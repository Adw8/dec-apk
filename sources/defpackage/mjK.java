package defpackage;

/* renamed from: mjK  reason: default package */
/* loaded from: classes.dex */
public final class mjK extends aFk implements iv7 {
    public final /* synthetic */ N0 R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mjK(N0 n0, aOO aoo) {
        super(2, aoo);
        this.R = n0;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((mjK) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            N0 n0 = this.R;
            this.X = 1;
            if (n0.v(this) == bgr) {
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
        return new mjK(this.R, aoo);
    }
}
