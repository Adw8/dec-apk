package defpackage;

/* renamed from: e6  reason: default package */
/* loaded from: classes.dex */
public final class e6 extends aFk implements iv7 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dH9 f2974R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f2975R;

    /* renamed from: R  reason: collision with other field name */
    public oDO f2976R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f2977R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public e6(dH9 dh9, long j, p2E p2e, h0T h0t, aOO aoo) {
        super(2, aoo);
        this.f2974R = dh9;
        this.R = j;
        this.f2977R = p2e;
        this.f2975R = h0t;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((e6) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        oDO odo;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            if (((Boolean) ((f_c) this.f2974R.getValue()).g()).booleanValue()) {
                long j = t4.f7419R;
                this.X = 1;
                if (n3x.Z(j, this) == bgr) {
                    return bgr;
                }
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else if (i == 2) {
            odo = this.f2976R;
            jjU.o(obj);
            this.f2975R.R(odo);
            return o8s.R;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oDO odo2 = new oDO(this.R);
        p2E p2e = this.f2977R;
        this.f2976R = odo2;
        this.X = 2;
        if (p2e.R(odo2, this) == bgr) {
            return bgr;
        }
        odo = odo2;
        this.f2975R.R(odo);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new e6(this.f2974R, this.R, this.f2977R, this.f2975R, aoo);
    }
}
