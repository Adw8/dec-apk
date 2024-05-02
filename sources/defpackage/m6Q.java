package defpackage;

/* renamed from: m6Q  reason: default package */
/* loaded from: classes.dex */
public final class m6Q extends aFk implements iv7 {
    public final /* synthetic */ h0T R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f5929R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f5930R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public m6Q(p2E p2e, h0T h0t, aOO aoo, boolean z) {
        super(2, aoo);
        this.f5930R = z;
        this.R = h0t;
        this.f5929R = p2e;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((m6Q) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            if (!this.f5930R) {
                h0T h0t = this.R;
                p2E p2e = this.f5929R;
                this.X = 1;
                if (mGH.v(p2e, h0t, this) == bgr) {
                    return bgr;
                }
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
        boolean z = this.f5930R;
        return new m6Q(this.f5929R, this.R, aoo, z);
    }
}
