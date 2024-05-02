package defpackage;

/* renamed from: C5  reason: default package */
/* loaded from: classes.dex */
public final class C5 extends aFk implements iv7 {
    public final /* synthetic */ pF R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public C5(pF pFVar, aOO aoo) {
        super(2, aoo);
        this.R = pFVar;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((C5) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        nax nax = this.R.f7071R;
        if (nax == null) {
            nax = null;
        }
        if (!nax.R()) {
            b61.R();
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new C5(this.R, aoo);
    }
}
