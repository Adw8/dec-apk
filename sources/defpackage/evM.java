package defpackage;

/* renamed from: evM  reason: default package */
/* loaded from: classes.dex */
public final class evM extends aFk implements iv7 {
    public final /* synthetic */ ck3 R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3240R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f3241R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ l3X f3242R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f3243R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public evM(l3X l3x, ck3 ck3, lR3 lr3, kg9 kg9, aOO aoo) {
        super(2, aoo);
        this.f3242R = l3x;
        this.R = ck3;
        this.f3243R = lr3;
        this.f3241R = kg9;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((evM) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            jy_ jy_ = (jy_) this.f3240R;
            l3X l3x = this.f3242R;
            boolean unused = l3x.R.v(null);
            l3x.f5573R = false;
            l3x.v = false;
            ck3 ck3 = this.R;
            lNH lnh = new lNH(this.f3243R, jy_, this.f3242R, this.f3241R, null);
            this.X = 1;
            if (((iTB) ck3).g(lnh, this) == bgr) {
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
        evM evm = new evM(this.f3242R, this.R, this.f3243R, this.f3241R, aoo);
        evm.f3240R = obj;
        return evm;
    }
}
