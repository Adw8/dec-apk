package defpackage;

/* renamed from: DG  reason: default package */
/* loaded from: classes.dex */
public final class DG extends aFk implements iv7 {
    public final /* synthetic */ YX R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f74R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public DG(YX yx, aOO aoo) {
        super(2, aoo);
        this.R = yx;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((DG) X((k6z) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            YX yx = this.R;
            this.X = 1;
            if (yx.O((k6z) this.f74R, this) == bgr) {
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
        DG dg = new DG(this.R, aoo);
        dg.f74R = obj;
        return dg;
    }
}
