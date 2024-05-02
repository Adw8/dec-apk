package defpackage;

/* renamed from: eNM  reason: default package */
/* loaded from: classes.dex */
public final class eNM extends aFk implements iv7 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ _6 f3069R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ hJe f3070R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nto f3071R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public eNM(_6 _6, hJe hje, float f, nto nto, aOO aoo) {
        super(2, aoo);
        this.f3069R = _6;
        this.f3070R = hje;
        this.R = f;
        this.f3071R = nto;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((eNM) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            float f = ((hoI) this.f3069R.f687v.getValue()).R;
            nto nto = null;
            if (hoI.R(f, this.f3070R.v)) {
                nto = new oDO(aWo.v);
            } else if (hoI.R(f, this.f3070R.e)) {
                nto = new a07();
            } else if (hoI.R(f, this.f3070R.c)) {
                nto = new k4G();
            }
            _6 _6 = this.f3069R;
            float f2 = this.R;
            nto nto2 = this.f3071R;
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
        return new eNM(this.f3069R, this.f3070R, this.R, this.f3071R, aoo);
    }
}
