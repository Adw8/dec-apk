package defpackage;

/* renamed from: ir2  reason: default package */
/* loaded from: classes.dex */
public final class ir2 extends aFk implements iv7 {
    public final /* synthetic */ h0T R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f4747R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ir2(p2E p2e, h0T h0t, aOO aoo) {
        super(2, aoo);
        this.R = h0t;
        this.f4747R = p2e;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((ir2) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            h0T h0t = this.R;
            p2E p2e = this.f4747R;
            this.X = 1;
            if (mGH.v(p2e, h0t, this) == bgr) {
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
        return new ir2(this.f4747R, this.R, aoo);
    }
}
