package defpackage;

/* renamed from: lU  reason: default package */
/* loaded from: classes.dex */
public final class lU extends aFk implements iv7 {
    public final /* synthetic */ hsk R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWQ f5748R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lU(nWQ nwq, hsk hsk, aOO aoo) {
        super(2, aoo);
        this.f5748R = nwq;
        this.R = hsk;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((lU) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            nWQ nwq = this.f5748R;
            hsk hsk = this.R;
            this.X = 1;
            if (nwq.v(hsk, this) == bgr) {
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
        return new lU(this.f5748R, this.R, aoo);
    }
}
