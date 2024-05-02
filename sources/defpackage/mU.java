package defpackage;

/* renamed from: mU  reason: default package */
/* loaded from: classes.dex */
public final class mU extends aFk implements kg9 {
    public final /* synthetic */ _6 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f6049R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mU(_6 _6, Object obj, aOO aoo) {
        super(1, aoo);
        this.R = _6;
        this.f6049R = obj;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        _6 _6 = this.R;
        SE se = _6.f680R;
        se.f506R.e();
        se.R = Long.MIN_VALUE;
        _6.f684R.R(Boolean.FALSE);
        Object v = this.R.v(this.f6049R);
        this.R.f680R.f508R.R(v);
        this.R.f687v.R(v);
        return o8s.R;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        mU mUVar = new mU(this.R, this.f6049R, (aOO) obj);
        o8s o8s = o8s.R;
        mUVar.O(o8s);
        return o8s;
    }
}
