package defpackage;

/* renamed from: lb4  reason: default package */
/* loaded from: classes.dex */
public final class lb4 extends aFk implements iv7 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ eLb f5790R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jM f5791R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5792R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lb4(float f, jM jMVar, eLb elb, aOO aoo) {
        super(2, aoo);
        this.R = f;
        this.f5791R = jMVar;
        this.f5790R = elb;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((lb4) X((gAN) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Object obj2 = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            float f = this.R;
            jM jMVar = this.f5791R;
            azM azm = new azM(this.f5790R, 1, (gAN) this.f5792R);
            this.X = 1;
            oHg ohg = kYZ.R;
            Float f2 = new Float(0.0f);
            Float f3 = new Float(f);
            Float f4 = new Float(0.0f);
            a0 a0Var = a0.P;
            Pc pc = (Pc) a0Var.x(f4);
            if (pc == null) {
                pc = ((Pc) a0Var.x(f2)).c();
            }
            Object e = o02.e(new SE(ohg, f2, pc, 56), new hgI(jMVar, ohg, f2, f3, pc), Long.MIN_VALUE, new cVI(azm, 0, ohg), this);
            if (e != obj2) {
                e = o8s.R;
            }
            if (e != obj2) {
                e = o8s.R;
            }
            if (e == obj2) {
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
        lb4 lb4 = new lb4(this.R, this.f5791R, this.f5790R, aoo);
        lb4.f5792R = obj;
        return lb4;
    }
}
