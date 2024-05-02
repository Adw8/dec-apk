package defpackage;

/* renamed from: iOj  reason: default package */
/* loaded from: classes.dex */
public final class iOj extends aFk implements iv7 {
    public final /* synthetic */ f_c R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f4558R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4559R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f4560R;
    public int X;
    public final /* synthetic */ f_c v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iOj(aOO aoo, f_c f_c, f_c f_c2, kg9 kg9, iv7 iv7) {
        super(2, aoo);
        this.f4560R = kg9;
        this.f4558R = iv7;
        this.R = f_c;
        this.v = f_c2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((iOj) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            bDb bdb = new bDb(null, this.R, this.v, this.f4560R, this.f4558R);
            this.X = 1;
            if (((iTB) ((ck3) this.f4559R)).g(bdb, this) == bgr) {
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
        iOj ioj = new iOj(aoo, this.R, this.v, this.f4560R, this.f4558R);
        ioj.f4559R = obj;
        return ioj;
    }
}
