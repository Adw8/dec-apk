package defpackage;

/* renamed from: gpj  reason: default package */
/* loaded from: classes.dex */
public final class gpj extends aFk implements iv7 {
    public h0T R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f3946R;
    public int X;
    public final /* synthetic */ h0T v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gpj(p2E p2e, h0T h0t, aOO aoo) {
        super(2, aoo);
        this.v = h0t;
        this.f3946R = p2e;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((gpj) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        h0T h0t;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            k4G k4g = (k4G) this.v.getValue();
            if (k4g != null) {
                p2E p2e = this.f3946R;
                h0t = this.v;
                ktE kte = new ktE(k4g);
                if (p2e != null) {
                    this.R = h0t;
                    this.X = 1;
                    if (p2e.R(kte, this) == bgr) {
                        return bgr;
                    }
                    h0t = h0t;
                }
                h0t.R(null);
            }
            return o8s.R;
        } else if (i == 1) {
            h0t = this.R;
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h0t.R(null);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new gpj(this.f3946R, this.v, aoo);
    }
}
