package defpackage;

/* renamed from: kYP  reason: default package */
/* loaded from: classes.dex */
public final class kYP extends aFk implements iv7 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ b1t f5346R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jM f5347R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kYP(b1t b1t, float f, jM jMVar, aOO aoo) {
        super(2, aoo);
        this.f5346R = b1t;
        this.R = f;
        this.f5347R = jMVar;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((kYP) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            Float f = new Float(this.R);
            jM jMVar = this.f5347R;
            this.X = 1;
            if (_6.R((_6) this.f5346R.v, f, jMVar, this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new kYP(this.f5346R, this.R, this.f5347R, aoo);
    }
}
