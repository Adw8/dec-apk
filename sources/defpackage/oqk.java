package defpackage;

/* renamed from: oqk  reason: default package */
/* loaded from: classes.dex */
public final class oqk extends aFk implements iv7 {
    public final /* synthetic */ l5n R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public oqk(l5n l5n, aOO aoo) {
        super(2, aoo);
        this.R = l5n;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((oqk) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            l5n l5n = this.R;
            _6 _6 = l5n.f5581R;
            dU5 du5 = new dU5(l5n.f5580R);
            this.X = 1;
            if (_6.e(du5, this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.R.f5582R.R(Boolean.FALSE);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new oqk(this.R, aoo);
    }
}
