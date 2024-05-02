package defpackage;

/* renamed from: fxz  reason: default package */
/* loaded from: classes.dex */
public final class fxz extends aFk implements iv7 {
    public final /* synthetic */ aJj R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3642R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fxz(aJj ajj, aOO aoo) {
        super(2, aoo);
        this.R = ajj;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((fxz) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        return l6.z((jy_) this.f3642R, null, 0, new d4Q(this.R, null), 3);
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        fxz fxz = new fxz(this.R, aoo);
        fxz.f3642R = obj;
        return fxz;
    }
}
