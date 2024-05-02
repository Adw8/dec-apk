package defpackage;

/* renamed from: kz8  reason: default package */
/* loaded from: classes.dex */
public final class kz8 extends aFk implements iv7 {
    public final /* synthetic */ oo3 R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kz8(oo3 oo3, aOO aoo) {
        super(2, aoo);
        this.R = oo3;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((kz8) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            oo3 oo3 = this.R;
            this.X = 1;
            if (oo3.R(oo3, this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException(gvP.V(-3881554929723631507L));
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new kz8(this.R, aoo);
    }
}
