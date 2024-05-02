package defpackage;

/* renamed from: B6  reason: default package */
/* loaded from: classes.dex */
public final class B6 extends aFk implements iv7 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ _6 f15R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fO f16R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nto f17R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public B6(_6 _6, fO fOVar, float f, nto nto, aOO aoo) {
        super(2, aoo);
        this.f15R = _6;
        this.f16R = fOVar;
        this.R = f;
        this.f17R = nto;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((B6) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            float f = ((hoI) this.f15R.f687v.getValue()).R;
            nto nto = null;
            if (hoI.R(f, this.f16R.v)) {
                nto = new oDO(aWo.v);
            } else if (hoI.R(f, this.f16R.e)) {
                nto = new a07();
            } else if (hoI.R(f, this.f16R.c)) {
                nto = new k4G();
            }
            _6 _6 = this.f15R;
            float f2 = this.R;
            nto nto2 = this.f17R;
            this.X = 1;
            if (kwT.R(_6, f2, nto, nto2, this) == bgr) {
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
        return new B6(this.f15R, this.f16R, this.R, this.f17R, aoo);
    }
}
