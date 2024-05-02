package defpackage;

/* renamed from: fmJ  reason: default package */
/* loaded from: classes.dex */
public final class fmJ extends aFk implements iv7 {
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fmJ(int i, aOO aoo) {
        super(2, aoo);
        this.X = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((fmJ) X(obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        return new lmN(hDC.J(((plU) this).R).e + 1 >= this.X ? -1 : 0);
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new fmJ(this.X, aoo);
    }
}
