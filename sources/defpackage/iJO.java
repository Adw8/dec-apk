package defpackage;

/* renamed from: iJO  reason: default package */
/* loaded from: classes.dex */
public final class iJO extends aFk implements iv7 {
    public final /* synthetic */ iHI R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iJO(iHI ihi, aOO aoo) {
        super(2, aoo);
        this.R = ihi;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((iJO) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Object obj2 = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            iHI ihi = this.R;
            this.X = 1;
            ihi.getClass();
            Object L = jjU.L(new b6i(ihi, null), this);
            if (L != obj2) {
                L = o8s.R;
            }
            if (L == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException(gvP.V(-3881563979219724179L));
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new iJO(this.R, aoo);
    }
}
