package defpackage;

/* renamed from: okI  reason: default package */
/* loaded from: classes.dex */
public final class okI extends aFk implements iv7 {
    public final /* synthetic */ kg9 R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public okI(kg9 kg9, aOO aoo) {
        super(2, aoo);
        this.R = kg9;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((okI) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            this.X = 1;
            if (n3x.Z(16, this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return this.R.x(new Long(System.nanoTime()));
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new okI(this.R, aoo);
    }
}
