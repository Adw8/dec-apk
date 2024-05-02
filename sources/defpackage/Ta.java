package defpackage;

/* renamed from: Ta  reason: default package */
/* loaded from: classes.dex */
public final class Ta extends aFk implements kg9 {
    public final /* synthetic */ N0 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pa3 f535R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Ta(N0 n0, pa3 pa3, aOO aoo) {
        super(1, aoo);
        this.R = n0;
        this.f535R = pa3;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            N0 n0 = this.R;
            pa3 pa3 = this.f535R;
            this.X = 1;
            obj = n0.c(pa3, this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        return new Ta(this.R, this.f535R, (aOO) obj).O(o8s.R);
    }
}
