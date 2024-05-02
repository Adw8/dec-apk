package defpackage;

/* renamed from: o9V  reason: default package */
/* loaded from: classes.dex */
public final class o9V extends aFk implements iv7 {
    public final /* synthetic */ m5f R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public o9V(m5f m5f, aOO aoo) {
        super(2, aoo);
        this.R = m5f;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((o9V) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            eJw ejw = this.R.f5910R;
            this.X = 1;
            if (ejw.c(this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException(afN.R(-455293391756L));
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new o9V(this.R, aoo);
    }
}
