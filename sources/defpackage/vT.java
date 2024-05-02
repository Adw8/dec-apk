package defpackage;

/* renamed from: vT  reason: default package */
/* loaded from: classes.dex */
public final class vT extends aFk implements lR3 {
    public /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dH9 f7437R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f7438R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ l3X f7439R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f7440R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f7441R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public vT(boolean z, p2E p2e, h0T h0t, dH9 dh9, aOO aoo) {
        super(3, aoo);
        this.f7441R = z;
        this.f7440R = p2e;
        this.f7438R = h0t;
        this.f7437R = dh9;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Object obj2 = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            l3X l3x = this.f7439R;
            long j = this.R;
            if (this.f7441R) {
                p2E p2e = this.f7440R;
                h0T h0t = this.f7438R;
                dH9 dh9 = this.f7437R;
                this.X = 1;
                Object L = jjU.L(new K8(l3x, j, p2e, h0t, dh9, null), this);
                if (L != obj2) {
                    L = o8s.R;
                }
                if (L == obj2) {
                    return obj2;
                }
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return o8s.R;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        long j = ((aWo) obj2).f906R;
        vT vTVar = new vT(this.f7441R, this.f7440R, this.f7438R, this.f7437R, (aOO) obj3);
        vTVar.f7439R = (l3X) obj;
        vTVar.R = j;
        return vTVar.O(o8s.R);
    }
}
