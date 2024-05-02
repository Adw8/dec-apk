package defpackage;

/* renamed from: Gt  reason: default package */
/* loaded from: classes.dex */
public final class Gt extends aFk implements iv7 {
    public final /* synthetic */ h2V R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f162R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ l7 f163R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Gt(l7 l7Var, h2V h2v, aOO aoo) {
        super(2, aoo);
        this.f163R = l7Var;
        this.R = h2v;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((Gt) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            nWW nww = new nWW();
            l7 l7Var = this.f163R;
            nWQ nwq = ((_F) l7Var).R;
            Ir ir = new Ir(nww, (jy_) this.f162R, l7Var, this.R);
            this.X = 1;
            if (nwq.v(ir, this) == bgr) {
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
        Gt gt = new Gt(this.f163R, this.R, aoo);
        gt.f162R = obj;
        return gt;
    }
}
