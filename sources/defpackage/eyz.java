package defpackage;

/* renamed from: eyz  reason: default package */
/* loaded from: classes.dex */
public final class eyz extends aFk implements iv7 {
    public final /* synthetic */ kVD R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public eyz(kVD kvd, aOO aoo) {
        super(2, aoo);
        this.R = kvd;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((eyz) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        mCa mca;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0 || i == 1) {
            jjU.o(obj);
            do {
                mca = new mCa(0, this.R);
                this.X = 1;
            } while (o02.o(mca, this) != bgr);
            return bgr;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new eyz(this.R, aoo);
    }
}
