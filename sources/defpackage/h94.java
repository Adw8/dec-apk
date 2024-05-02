package defpackage;

/* renamed from: h94  reason: default package */
/* loaded from: classes.dex */
public final class h94 extends aFk implements iv7 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ _6 f4092R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public h94(_6 _6, float f, aOO aoo) {
        super(2, aoo);
        this.f4092R = _6;
        this.R = f;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((h94) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            _6 _6 = this.f4092R;
            Float f = new Float(this.R);
            o3h o3h = nP4.f6385R;
            this.X = 1;
            if (_6.R(_6, f, o3h, this) == bgr) {
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
        return new h94(this.f4092R, this.R, aoo);
    }
}
