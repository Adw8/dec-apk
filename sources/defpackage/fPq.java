package defpackage;

/* renamed from: fPq  reason: default package */
/* loaded from: classes.dex */
public final class fPq extends aFk implements iv7 {
    public final /* synthetic */ iHI R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fPq(iHI ihi, aOO aoo) {
        super(2, aoo);
        this.R = ihi;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((fPq) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            iHI ihi = this.R;
            this.X = 1;
            ihi.getClass();
            kxm.v(cUF.v(ihi), 4, gvP.V(-3881559349244979091L), null);
            Object L = ihi.L(900, new x9(7, ihi), this);
            if (L != bgr) {
                L = o8s.R;
            }
            if (L != bgr) {
                L = o8s.R;
            }
            if (L == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException(gvP.V(-3881565057256515475L));
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new fPq(this.R, aoo);
    }
}
