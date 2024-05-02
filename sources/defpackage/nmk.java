package defpackage;

/* renamed from: nmk  reason: default package */
/* loaded from: classes.dex */
public final class nmk extends aFk implements iv7 {
    public final /* synthetic */ Ms R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ cwX f6582R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nhg f6583R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public nmk(nhg nhg, Ms ms, cwX cwx, aOO aoo) {
        super(2, aoo);
        this.f6583R = nhg;
        this.R = ms;
        this.f6582R = cwx;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((nmk) X((jy_) obj, (aOO) obj2)).O(o8s.R);
        return bGR.COROUTINE_SUSPENDED;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            nhg nhg = this.f6583R;
            aLH alh = new aLH(this.R, 3, this.f6582R);
            this.X = 1;
            if (nhg.v(alh, this) == bgr) {
                return bgr;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            jjU.o(obj);
        }
        throw new j8f((Object) null);
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new nmk(this.f6583R, this.R, this.f6582R, aoo);
    }
}
