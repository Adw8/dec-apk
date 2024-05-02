package defpackage;

/* renamed from: dUx  reason: default package */
/* loaded from: classes.dex */
public final class dUx extends aFk implements iv7 {
    public final /* synthetic */ mMh R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public dUx(mMh mmh, aOO aoo) {
        super(2, aoo);
        this.R = mmh;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((dUx) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            iKP ikp = this.R.f6022R;
            this.X = 1;
            ikp.getClass();
            obj = iKP.R(this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException(gvP.V(-3881548706316019603L));
        }
        return obj;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new dUx(this.R, aoo);
    }
}
