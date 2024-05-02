package defpackage;

/* renamed from: nIf  reason: default package */
/* loaded from: classes.dex */
public final class nIf extends aFk implements iv7 {
    public final /* synthetic */ h2V R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWQ f6357R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public nIf(aOO aoo, nWQ nwq, h2V h2v) {
        super(2, aoo);
        this.f6357R = nwq;
        this.R = h2v;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((nIf) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            nWQ nwq = this.f6357R;
            h2V h2v = this.R;
            this.X = 1;
            if (mxC.m(this, nwq, h2v) == bgr) {
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
        return new nIf(aoo, this.f6357R, this.R);
    }
}
