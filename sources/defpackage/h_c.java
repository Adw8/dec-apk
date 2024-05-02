package defpackage;

/* renamed from: h_c  reason: default package */
/* loaded from: classes.dex */
public final class h_c extends aFk implements iv7 {
    public final /* synthetic */ ck3 R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4311R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f4312R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f4313R;
    public int X;
    public final /* synthetic */ kg9 c;
    public final /* synthetic */ kg9 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public h_c(ck3 ck3, aOO aoo, kg9 kg9, kg9 kg92, kg9 kg93, lR3 lr3) {
        super(2, aoo);
        this.R = ck3;
        this.f4313R = lr3;
        this.f4312R = kg9;
        this.v = kg92;
        this.c = kg93;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((h_c) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            jy_ jy_ = (jy_) this.f4311R;
            l3X l3x = new l3X(this.R);
            ck3 ck3 = this.R;
            jMN jmn = new jMN(l3x, this.f4313R, jy_, this.f4312R, this.v, this.c, null);
            this.X = 1;
            if (ooA.y(ck3, jmn, this) == bgr) {
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
        h_c h_c = new h_c(this.R, aoo, this.f4312R, this.v, this.c, this.f4313R);
        h_c.f4311R = obj;
        return h_c;
    }
}
