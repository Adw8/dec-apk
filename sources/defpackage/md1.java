package defpackage;

/* renamed from: md1  reason: default package */
/* loaded from: classes.dex */
public final class md1 extends aFk implements iv7 {
    public final /* synthetic */ h5L R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public md1(h5L h5l, aOO aoo) {
        super(2, aoo);
        this.R = h5l;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((md1) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        mLX mlx;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0 || i == 1) {
            jjU.o(obj);
            do {
                mlx = new mLX(this.R, 0);
                this.X = 1;
            } while (l6.F(mlx, this) != bgr);
            return bgr;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new md1(this.R, aoo);
    }
}
