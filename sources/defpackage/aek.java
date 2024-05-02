package defpackage;

/* renamed from: aek  reason: default package */
/* loaded from: classes.dex */
public final class aek extends aFk implements lR3 {
    public final /* synthetic */ int O;
    public /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dH9 f952R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f953R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ l3X f954R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f955R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aek(boolean z, int i, h0T h0t, dH9 dh9, aOO aoo) {
        super(3, aoo);
        this.f955R = z;
        this.O = i;
        this.f953R = h0t;
        this.f952R = dh9;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x0005 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: aek */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: aek */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, o8s] */
    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        try {
            if (i == 0) {
                jjU.o(obj);
                l3X l3x = this.f954R;
                long j = this.R;
                this.f953R.R(new Float((this.f955R ? ((float) this.O) - aWo.e(j) : aWo.e(j)) - ((Number) this.f952R.getValue()).floatValue()));
                this.X = 1;
                if (l3x.R(this) == bgr) {
                    return bgr;
                }
            } else if (i == 1) {
                jjU.o(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (mF4 unused) {
            this.f953R.R(new Float(0.0f));
        }
        this = o8s.R;
        return this;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        long j = ((aWo) obj2).f906R;
        aek aek = new aek(this.f955R, this.O, this.f953R, this.f952R, (aOO) obj3);
        aek.f954R = (l3X) obj;
        aek.R = j;
        return aek.O(o8s.R);
    }
}
