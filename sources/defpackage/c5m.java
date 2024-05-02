package defpackage;

/* renamed from: c5m  reason: default package */
/* loaded from: classes.dex */
public final class c5m extends aFk implements iv7 {
    public final /* synthetic */ ck3 R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f1966R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ojR f1967R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public c5m(ck3 ck3, ojR ojr, aOO aoo) {
        super(2, aoo);
        this.R = ck3;
        this.f1967R = ojr;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((c5m) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        jy_ jy_ = (jy_) this.f1966R;
        l6.z(jy_, null, 0, new osp(this.R, this.f1967R, null), 3);
        return l6.z(jy_, null, 0, new aCI(this.R, this.f1967R, null), 3);
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        c5m c5m = new c5m(this.R, this.f1967R, aoo);
        c5m.f1966R = obj;
        return c5m;
    }
}
