package defpackage;

/* renamed from: X4  reason: default package */
/* loaded from: classes.dex */
public final class X4 extends aFk implements iv7 {
    public final /* synthetic */ _F R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f615R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public X4(_F _f, aOO aoo) {
        super(2, aoo);
        this.R = _f;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((X4) X((h2V) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            _F _f = this.R;
            this.X = 1;
            if (_f.x((h2V) this.f615R, this) == bgr) {
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
        X4 x4 = new X4(this.R, aoo);
        x4.f615R = obj;
        return x4;
    }
}
