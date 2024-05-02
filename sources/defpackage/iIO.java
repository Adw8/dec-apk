package defpackage;

/* renamed from: iIO  reason: default package */
/* loaded from: classes.dex */
public final class iIO extends aFk implements iv7 {
    public final /* synthetic */ h0T R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f4532R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iIO(p2E p2e, h0T h0t, aOO aoo) {
        super(2, aoo);
        this.f4532R = p2e;
        this.R = h0t;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((iIO) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            p2E p2e = this.f4532R;
            h0T h0t = this.R;
            this.X = 1;
            if (mGH.R(p2e, h0t, this) == bgr) {
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
        return new iIO(this.f4532R, this.R, aoo);
    }
}
