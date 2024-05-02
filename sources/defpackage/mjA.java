package defpackage;

/* renamed from: mjA  reason: default package */
/* loaded from: classes.dex */
public final class mjA extends aFk implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ oey R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mjA(oey oey, int i, int i2, aOO aoo) {
        super(2, aoo);
        this.R = oey;
        this.X = i;
        this.O = i2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((mjA) X((gAN) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        this.R.m(this.X, this.O);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new mjA(this.R, this.X, this.O, aoo);
    }
}
