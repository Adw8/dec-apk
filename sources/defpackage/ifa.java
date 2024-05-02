package defpackage;

/* renamed from: ifa  reason: default package */
/* loaded from: classes.dex */
public final class ifa extends aFk implements iv7 {
    public final /* synthetic */ h0T R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4688R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ifa(h0T h0t, aOO aoo) {
        super(2, aoo);
        this.R = h0t;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((ifa) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Object obj2 = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            h0T h0t = this.R;
            n2R n2r = new n2R(h0t, 7);
            Sv sv = new Sv(h0t, 3);
            this.X = 1;
            fzi fzi = fzi.e;
            fzi fzi2 = fzi.X;
            dgP dgp = iVu.f4622R;
            Object y = ooA.y((ck3) this.f4688R, new aRK(null, fzi2, fzi, n2r, sv), this);
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
        ifa ifa = new ifa(this.R, aoo);
        ifa.f4688R = obj;
        return ifa;
    }
}
