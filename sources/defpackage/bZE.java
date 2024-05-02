package defpackage;

/* renamed from: bZE  reason: default package */
/* loaded from: classes.dex */
public final class bZE extends aFk implements lR3 {
    public /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ jy_ f1726R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f1727R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nLK f1728R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bZE(lR3 lr3, nLK nlk, aOO aoo) {
        super(3, aoo);
        this.f1727R = lr3;
        this.f1728R = nlk;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            jy_ jy_ = this.f1726R;
            long j = this.R;
            lR3 lr3 = this.f1727R;
            Float f = new Float(this.f1728R == nLK.Vertical ? d_E.c(j) : d_E.v(j));
            this.X = 1;
            if (lr3.y(jy_, f, this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return o8s.R;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        long j = ((d_E) obj2).f2672R;
        bZE bze = new bZE(this.f1727R, this.f1728R, (aOO) obj3);
        bze.f1726R = (jy_) obj;
        bze.R = j;
        return bze.O(o8s.R);
    }
}
