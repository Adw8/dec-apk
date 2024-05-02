package defpackage;

/* renamed from: eaP  reason: default package */
/* loaded from: classes.dex */
public final class eaP extends aFk implements iv7 {
    public final /* synthetic */ c71 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ d5M f3152R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kY5 f3153R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mjp f3154R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ze f3155R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public eaP(ze zeVar, d5M d5m, kY5 ky5, mjp mjp, c71 c71, aOO aoo) {
        super(2, aoo);
        this.f3155R = zeVar;
        this.f3152R = d5m;
        this.f3153R = ky5;
        this.f3154R = mjp;
        this.R = c71;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((eaP) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            ze zeVar = this.f3155R;
            d5M d5m = this.f3152R;
            d9j d9j = this.f3153R.f5333R;
            iRR irr = this.f3154R.f6140R;
            c71 c71 = this.R;
            this.X = 1;
            int Z = c71.Z(odN.e(d5m.R));
            Object R = ((M4) zeVar).R(Z < irr.f4590R.f4165R.length() ? irr.v(Z) : Z != 0 ? irr.v(Z - 1) : new gIA(0.0f, 0.0f, 1.0f, (float) ltH.v(crU.R(d9j.f2512R, d9j.f2510R, d9j.f2509R, crU.R, 1))), this);
            if (R != bgr) {
                R = o8s.R;
            }
            if (R == bgr) {
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
        return new eaP(this.f3155R, this.f3152R, this.f3153R, this.f3154R, this.R, aoo);
    }
}
