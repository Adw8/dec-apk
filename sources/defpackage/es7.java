package defpackage;

/* renamed from: es7  reason: default package */
/* loaded from: classes.dex */
public final class es7 extends aFk implements iv7 {
    public final /* synthetic */ jUs R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public es7(jUs jus, aOO aoo) {
        super(2, aoo);
        this.R = jus;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((es7) X((o8s) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        ((f30) this.R).R.update();
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new es7(this.R, aoo);
    }
}
