package defpackage;

/* renamed from: onC  reason: default package */
/* loaded from: classes.dex */
public final class onC extends aFk implements iv7 {
    public final /* synthetic */ k6z R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWQ f6937R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public onC(nWQ nwq, k6z k6z, aOO aoo) {
        super(2, aoo);
        this.f6937R = nwq;
        this.R = k6z;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((onC) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            nWQ nwq = this.f6937R;
            hki hki = new hki(1, this.R);
            this.X = 1;
            if (nwq.v(hki, this) == bgr) {
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
        return new onC(this.f6937R, this.R, aoo);
    }
}
