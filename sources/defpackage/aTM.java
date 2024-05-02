package defpackage;

/* renamed from: aTM  reason: default package */
/* loaded from: classes.dex */
public final class aTM extends aFk implements iv7 {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWW f894R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aTM(nWW nww, aOO aoo) {
        super(2, aoo);
        this.f894R = nww;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((aTM) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            this.f894R.R = l6.C((jy_) this.R, null, new onu(null), 3);
            this.X = 1;
            if (((htf) this.f894R.R).k(this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException(gvP.V(-3881549445050394515L));
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        aTM atm = new aTM(this.f894R, aoo);
        atm.R = obj;
        return atm;
    }
}
