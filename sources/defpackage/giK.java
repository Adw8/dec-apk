package defpackage;

/* renamed from: giK  reason: default package */
/* loaded from: classes.dex */
public final class giK extends aFk implements lR3 {
    public /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f3876R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jy_ f3877R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ l3X f3878R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f3879R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public giK(p2E p2e, h0T h0t, aOO aoo, jy_ jy_) {
        super(3, aoo);
        this.f3877R = jy_;
        this.f3876R = h0t;
        this.f3879R = p2e;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            l3X l3x = this.f3878R;
            l6.z(this.f3877R, null, 0, new aBF(this.f3876R, this.R, this.f3879R, null), 3);
            this.X = 1;
            obj = l3x.v(this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        l6.z(this.f3877R, null, 0, new ixo(this.f3879R, this.f3876R, null, booleanValue), 3);
        return o8s.R;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        long j = ((aWo) obj2).f906R;
        jy_ jy_ = this.f3877R;
        h0T h0t = this.f3876R;
        giK gik = new giK(this.f3879R, h0t, (aOO) obj3, jy_);
        gik.f3878R = (l3X) obj;
        gik.R = j;
        return gik.O(o8s.R);
    }
}
