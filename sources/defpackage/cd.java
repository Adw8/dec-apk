package defpackage;

/* renamed from: cd  reason: default package */
/* loaded from: classes.dex */
public final class cd extends aFk implements iv7 {
    public final /* synthetic */ bP R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ gIA f2163R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ hjM f2164R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f2165R;
    public int X;
    public final /* synthetic */ gIA v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cd(bP bPVar, hjM hjm, gIA gia, gIA gia2, aOO aoo) {
        super(2, aoo);
        this.R = bPVar;
        this.f2164R = hjm;
        this.f2163R = gia;
        this.v = gia2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((cd) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            l6.z((jy_) this.f2165R, null, 0, new xK(this.R, this.f2163R, null), 3);
            bP bPVar = this.R;
            v2 v2Var = ((XS) bPVar).v;
            if (v2Var == null) {
                v2Var = ((XS) bPVar).f618R;
            }
            hjM hjm = this.f2164R;
            f_ f_Var = new f_(this.v);
            this.X = 1;
            if (v2Var.c(hjm, f_Var, this) == bgr) {
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
        cd cdVar = new cd(this.R, this.f2164R, this.f2163R, this.v, aoo);
        cdVar.f2165R = obj;
        return cdVar;
    }
}
