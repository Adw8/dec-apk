package defpackage;

/* renamed from: gJB  reason: default package */
/* loaded from: classes.dex */
public final class gJB extends aFk implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ bf5 R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3726R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f3727R;
    public int X;
    public final /* synthetic */ boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gJB(bf5 bf5, boolean z, boolean z2, int i, aOO aoo) {
        super(2, aoo);
        this.R = bf5;
        this.f3727R = z;
        this.v = z2;
        this.O = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((gJB) X((k6z) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            k6z k6z = (k6z) this.f3726R;
            boolean[] zArr = new boolean[1];
            jiM jim = new jiM(this.R, k6z);
            boolean z = this.f3727R;
            boolean z2 = this.v;
            int i2 = this.O;
            this.f3726R = k6z;
            this.X = 1;
            xx xxVar = new xx(1, n3x.U(this));
            xxVar.j();
            l6.z(k6z, iFn.f4518R, 0, new aCf(z, z2, i2, zArr, jim, xxVar, null), 2);
            xxVar.y(new mox(12, zArr));
            if (xxVar.P() == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            k6z k6z2 = (k6z) this.f3726R;
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        gJB gjb = new gJB(this.R, this.f3727R, this.v, this.O, aoo);
        gjb.f3726R = obj;
        return gjb;
    }
}
