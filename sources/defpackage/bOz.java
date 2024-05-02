package defpackage;

/* renamed from: bOz  reason: default package */
/* loaded from: classes.dex */
public final class bOz extends aFk implements iv7 {
    public final /* synthetic */ chP R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWQ f1630R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bOz(nWQ nwq, chP chp, aOO aoo) {
        super(2, aoo);
        this.f1630R = nwq;
        this.R = chp;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((bOz) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            nWQ nwq = this.f1630R;
            iV2 iv2 = new iV2(this.R, 1);
            this.X = 1;
            if (nwq.v(iv2, this) == bgr) {
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
        return new bOz(this.f1630R, this.R, aoo);
    }
}
