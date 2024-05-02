package defpackage;

/* renamed from: jvE  reason: default package */
/* loaded from: classes.dex */
public final class jvE extends aFk implements iv7 {
    public final /* synthetic */ _6 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dH9 f5115R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5116R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jvE(dH9 dh9, _6 _6, aOO aoo) {
        super(2, aoo);
        this.f5115R = dh9;
        this.R = _6;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((jvE) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            i31 l = l6.l(new fBj(this.f5115R, 5));
            aLH alh = new aLH(this.R, 0, (jy_) this.f5116R);
            this.X = 1;
            if (l.v(alh, this) == bgr) {
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
        jvE jve = new jvE(this.f5115R, this.R, aoo);
        jve.f5116R = obj;
        return jve;
    }
}
