package defpackage;

/* renamed from: daI  reason: default package */
/* loaded from: classes.dex */
public final class daI extends aFk implements iv7 {
    public final /* synthetic */ h0T R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f2674R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jy_ f2675R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f2676R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public daI(p2E p2e, h0T h0t, aOO aoo, jy_ jy_) {
        super(2, aoo);
        this.f2675R = jy_;
        this.f2676R = p2e;
        this.R = h0t;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((daI) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            fmu fmu = new fmu(((plU) this).R, this.f2675R, this.f2676R, this.R, null);
            this.X = 1;
            if (((iTB) ((ck3) this.f2674R)).g(fmu, this) == bgr) {
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
        daI dai = new daI(this.f2676R, this.R, aoo, this.f2675R);
        dai.f2674R = obj;
        return dai;
    }
}
