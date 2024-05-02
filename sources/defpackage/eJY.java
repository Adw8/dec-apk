package defpackage;

/* renamed from: eJY  reason: default package */
/* loaded from: classes.dex */
public final class eJY extends aFk implements iv7 {
    public final /* synthetic */ b1t R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jM f3051R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public eJY(b1t b1t, jM jMVar, aOO aoo) {
        super(2, aoo);
        this.R = b1t;
        this.f3051R = jMVar;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((eJY) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            Float f = new Float(0.0f);
            jM jMVar = this.f3051R;
            this.X = 1;
            if (_6.R((_6) this.R.v, f, jMVar, this) == bgr) {
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
        return new eJY(this.R, this.f3051R, aoo);
    }
}
