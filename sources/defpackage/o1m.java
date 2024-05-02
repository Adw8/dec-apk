package defpackage;

/* renamed from: o1m  reason: default package */
/* loaded from: classes.dex */
public final class o1m extends aFk implements iv7 {
    public final /* synthetic */ aLd R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iMP f6652R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f6653R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWQ f6654R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public o1m(aLd ald, iMP imp, nWQ nwq, aOO aoo) {
        super(2, aoo);
        this.R = ald;
        this.f6652R = imp;
        this.f6654R = nwq;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((o1m) X((k6z) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        k6z k6z;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            k6z k6z2 = (k6z) this.f6653R;
            aLd ald = this.R;
            iMP imp = this.f6652R;
            onC onc = new onC(this.f6654R, k6z2, null);
            this.f6653R = k6z2;
            this.X = 1;
            if (hDC.d(ald, imp, onc, this) == bgr) {
                return bgr;
            }
            k6z = k6z2;
        } else if (i == 1) {
            k6z = (k6z) this.f6653R;
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((hP3) k6z).m(null);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        o1m o1m = new o1m(this.R, this.f6652R, this.f6654R, aoo);
        o1m.f6653R = obj;
        return o1m;
    }
}
