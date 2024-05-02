package defpackage;

/* renamed from: hJ_  reason: default package */
/* loaded from: classes.dex */
public final class hJ_ extends aFk implements iv7 {
    public final /* synthetic */ f_c R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hJ_(f_c f_c, aOO aoo) {
        super(2, aoo);
        this.R = f_c;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((hJ_) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        return this.R.g();
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new hJ_(this.R, aoo);
    }
}
