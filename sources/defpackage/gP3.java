package defpackage;

/* renamed from: gP3  reason: default package */
/* loaded from: classes.dex */
public final class gP3 extends aFk implements lR3 {
    public final /* synthetic */ dH9 R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gP3(dH9 dh9, aOO aoo) {
        super(3, aoo);
        this.R = dh9;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        ((f_c) this.R.getValue()).g();
        return o8s.R;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        jy_ jy_ = (jy_) obj;
        ((Number) obj2).floatValue();
        gP3 gp3 = new gP3(this.R, (aOO) obj3);
        o8s o8s = o8s.R;
        gp3.O(o8s);
        return o8s;
    }
}
