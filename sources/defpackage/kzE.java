package defpackage;

/* renamed from: kzE  reason: default package */
/* loaded from: classes.dex */
public final class kzE extends aFk implements iv7 {
    public final /* synthetic */ aD8 R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kzE(aD8 ad8, int i, aOO aoo) {
        super(2, aoo);
        this.R = ad8;
        this.X = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((kzE) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        aD8 ad8 = this.R;
        int min = Math.min(this.X - 1, ad8.Z());
        if (min < 0) {
            min = 0;
        }
        if (min != ad8.Z()) {
            ad8.f795R.R(Integer.valueOf(min));
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new kzE(this.R, this.X, aoo);
    }
}
