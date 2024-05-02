package defpackage;

/* renamed from: goI  reason: default package */
/* loaded from: classes.dex */
public final class goI extends aFk implements iv7 {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWQ f3936R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nhg f3937R;
    public int X;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public goI(nWQ nwq, nhg nhg, Object obj, aOO aoo) {
        super(2, aoo);
        this.f3936R = nwq;
        this.f3937R = nhg;
        this.v = obj;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((goI) X((mAC) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            int ordinal = ((mAC) this.R).ordinal();
            if (ordinal == 0) {
                nWQ nwq = this.f3936R;
                nhg nhg = this.f3937R;
                this.X = 1;
                if (nwq.v(nhg, this) == bgr) {
                    return bgr;
                }
            } else if (ordinal == 2) {
                Object obj2 = this.v;
                if (obj2 == pip.R) {
                    this.f3937R.e();
                } else {
                    this.f3937R.c(obj2);
                }
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
        goI goi = new goI(this.f3936R, this.f3937R, this.v, aoo);
        goi.R = obj;
        return goi;
    }
}
