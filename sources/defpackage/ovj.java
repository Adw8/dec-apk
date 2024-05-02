package defpackage;

/* renamed from: ovj  reason: default package */
/* loaded from: classes.dex */
public final class ovj extends aFk implements lR3 {
    public /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dH9 f7022R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f7023R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ovj(h0T h0t, dH9 dh9, aOO aoo) {
        super(3, aoo);
        this.f7023R = h0t;
        this.f7022R = dh9;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        l6.z(((lh8) this.f7023R.getValue()).e(), null, 0, new gFb(this.f7022R, this.R, null), 3);
        return o8s.R;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        jy_ jy_ = (jy_) obj;
        long j = ((d_E) obj2).f2672R;
        ovj ovj = new ovj(this.f7023R, this.f7022R, (aOO) obj3);
        ovj.R = j;
        o8s o8s = o8s.R;
        ovj.O(o8s);
        return o8s;
    }
}
