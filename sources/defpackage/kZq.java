package defpackage;

/* renamed from: kZq  reason: default package */
/* loaded from: classes.dex */
public final class kZq extends aFk implements iv7 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ aD8 f5348R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jJj f5349R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kZq(jJj jjj, aD8 ad8, float f, aOO aoo) {
        super(2, aoo);
        this.f5349R = jjj;
        this.f5348R = ad8;
        this.R = f;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((kZq) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        jJj jjj = this.f5349R;
        this.f5348R.f797v.R(Integer.valueOf(jjj.B(this.R)));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new kZq(this.f5349R, this.f5348R, this.R, aoo);
    }
}
