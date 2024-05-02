package defpackage;

/* renamed from: mQC  reason: default package */
/* loaded from: classes.dex */
public final class mQC extends aFk implements iv7 {
    public final /* synthetic */ iHI R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mQC(iHI ihi, aOO aoo) {
        super(2, aoo);
        this.R = ihi;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((mQC) X((dCq) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            lIh E = l6.E(new cMC(5, this.R.v));
            this.X = 1;
            obj = l6.B(E, this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException(gvP.V(-3881556909703554963L));
        }
        return obj;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new mQC(this.R, aoo);
    }
}
