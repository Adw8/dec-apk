package defpackage;

/* renamed from: f1M  reason: default package */
/* loaded from: classes.dex */
public final class f1M extends aFk implements iv7 {
    public final /* synthetic */ aJj R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public f1M(aJj ajj, aOO aoo) {
        super(2, aoo);
        this.R = ajj;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((f1M) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            _6 _6 = this.R.f829R;
            Float f = new Float(1.0f);
            o3h t = o02.t(75, 0, hiK.R, 2);
            this.X = 1;
            if (_6.R(_6, f, t, this) == bgr) {
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
        return new f1M(this.R, aoo);
    }
}
