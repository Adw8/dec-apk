package defpackage;

/* renamed from: iuI  reason: default package */
/* loaded from: classes.dex */
public final class iuI extends aFk implements iv7 {
    public final /* synthetic */ _6 R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iuI(_6 _6, aOO aoo) {
        super(2, aoo);
        this.R = _6;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((iuI) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            _6 _6 = this.R;
            Float f = new Float(1.0f);
            this.X = 1;
            if (_6.e(f, this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else if (i == 2) {
            jjU.o(obj);
            return o8s.R;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        _6 _62 = this.R;
        Float f2 = new Float(0.0f);
        buZ buz = pk5.f7209R;
        this.X = 2;
        if (_6.R(_62, f2, buz, this) == bgr) {
            return bgr;
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new iuI(this.R, aoo);
    }
}
