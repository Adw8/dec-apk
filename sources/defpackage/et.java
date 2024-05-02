package defpackage;

/* renamed from: et  reason: default package */
/* loaded from: classes.dex */
public final class et extends aFk implements iv7 {
    public final /* synthetic */ gh R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3232R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f3233R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public et(boolean z, gh ghVar, aOO aoo) {
        super(2, aoo);
        this.f3233R = z;
        this.R = ghVar;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((et) X((Integer) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        Integer num = (Integer) this.f3232R;
        if (!this.f3233R && num != null) {
            gh ghVar = this.R;
            pby[] pbyArr = kxm.R;
            Tq tq = ghVar.f3865R;
            ((n1) tq.f540R).R(tq, Tq.R[1], num);
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        et etVar = new et(this.f3233R, this.R, aoo);
        etVar.f3232R = obj;
        return etVar;
    }
}
