package defpackage;

/* renamed from: fbm  reason: default package */
/* loaded from: classes.dex */
public final class fbm extends aFk implements iv7 {
    public final /* synthetic */ m5f R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fbm(m5f m5f, aOO aoo) {
        super(2, aoo);
        this.R = m5f;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((fbm) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        this.R.f5907R.R.v();
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new fbm(this.R, aoo);
    }
}
