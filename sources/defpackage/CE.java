package defpackage;

/* renamed from: CE  reason: default package */
/* loaded from: classes.dex */
public final class CE extends aFk implements iv7 {
    public final /* synthetic */ dH9 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f53R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f54R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f55R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f56R;
    public int X;
    public final /* synthetic */ dH9 v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ h0T f57v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public CE(h0T h0t, boolean z, p2E p2e, h0T h0t2, dH9 dh9, dH9 dh92, aOO aoo) {
        super(2, aoo);
        this.f53R = h0t;
        this.f56R = z;
        this.f55R = p2e;
        this.f57v = h0t2;
        this.R = dh9;
        this.v = dh92;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((CE) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Object obj2 = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            ck3 ck3 = (ck3) this.f54R;
            h0T h0t = this.f53R;
            hjM hjm = ((laR) ck3).R;
            long pG = hjm != null ? hjm.pG() : 0;
            long v = cU5.v(((int) (pG >> 32)) / 2, ltH.v(pG) / 2);
            h0t.R(new aWo(aH9.N((float) ((int) (v >> 32)), (float) dU5.v(v))));
            vT vTVar = new vT(this.f56R, this.f55R, this.f57v, this.R, null);
            UX ux = new UX(this.f56R, this.v);
            this.X = 1;
            b3f b3f = pjd.R;
            Object y = ooA.y(ck3, new fj1(new l3X(ck3), vTVar, ux, null), this);
            if (y != obj2) {
                y = o8s.R;
            }
            if (y == obj2) {
                return obj2;
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
        CE ce = new CE(this.f53R, this.f56R, this.f55R, this.f57v, this.R, this.v, aoo);
        ce.f54R = obj;
        return ce;
    }
}
