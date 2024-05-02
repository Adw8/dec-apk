package defpackage;

/* renamed from: z_  reason: default package */
/* loaded from: classes.dex */
public final class z_ extends aFk implements iv7 {
    public final /* synthetic */ blo R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public z_(blo blo, aOO aoo) {
        super(2, aoo);
        this.R = blo;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((z_) X((h2V) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        this.R.e = 0;
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new z_(this.R, aoo);
    }
}
