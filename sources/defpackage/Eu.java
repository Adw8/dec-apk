package defpackage;

/* renamed from: Eu  reason: default package */
/* loaded from: classes.dex */
public final class Eu extends aFk implements iv7 {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ rB f107R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Eu(rB rBVar, aOO aoo) {
        super(2, aoo);
        this.f107R = rBVar;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((Eu) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        mxC.y(((jke) this.f107R.f7382R.getValue()).R, (jy_) this.R, new hki(4, this.f107R));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        Eu eu = new Eu(this.f107R, aoo);
        eu.R = obj;
        return eu;
    }
}
