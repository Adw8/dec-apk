package defpackage;

/* renamed from: _b  reason: default package */
/* loaded from: classes.dex */
public final class _b extends aFk implements iv7 {
    public final /* synthetic */ h2V R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f706R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ l7 f707R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public _b(l7 l7Var, h2V h2v, Object obj, aOO aoo) {
        super(2, aoo);
        this.f707R = l7Var;
        this.R = h2v;
        this.f706R = obj;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((_b) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            lR3 lr3 = this.f707R.R;
            h2V h2v = this.R;
            Object obj2 = this.f706R;
            this.X = 1;
            if (lr3.y(h2v, obj2, this) == bgr) {
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
        return new _b(this.f707R, this.R, this.f706R, aoo);
    }
}
