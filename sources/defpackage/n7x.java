package defpackage;

/* renamed from: n7x  reason: default package */
/* loaded from: classes.dex */
public final class n7x extends aFk implements iv7 {
    public final /* synthetic */ dH9 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ j__ f6314R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public n7x(j__ j__, dH9 dh9, aOO aoo) {
        super(2, aoo);
        this.f6314R = j__;
        this.R = dh9;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((n7x) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            j__ j__ = this.f6314R;
            m0C m0c = new m0C(null);
            this.X = 1;
            if (j__.v(m0c, this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((f_c) this.R.getValue()).g();
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new n7x(this.f6314R, this.R, aoo);
    }
}
