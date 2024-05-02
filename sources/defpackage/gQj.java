package defpackage;

/* renamed from: gQj  reason: default package */
/* loaded from: classes.dex */
public final class gQj extends aFk implements iv7 {
    public final /* synthetic */ aJj R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3759R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gQj(aJj ajj, aOO aoo) {
        super(2, aoo);
        this.R = ajj;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((gQj) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        jy_ jy_ = (jy_) this.f3759R;
        l6.z(jy_, null, 0, new f1M(this.R, null), 3);
        l6.z(jy_, null, 0, new jYm(this.R, null), 3);
        return l6.z(jy_, null, 0, new hsm(this.R, null), 3);
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        gQj gqj = new gQj(this.R, aoo);
        gqj.f3759R = obj;
        return gqj;
    }
}
