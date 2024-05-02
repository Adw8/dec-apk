package defpackage;

/* renamed from: jos  reason: default package */
/* loaded from: classes.dex */
public final class jos extends aFk implements iv7 {
    public final /* synthetic */ h2V R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5030R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jos(h2V h2v, aOO aoo) {
        super(2, aoo);
        this.R = h2v;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((jos) X(obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            Object obj2 = this.f5030R;
            h2V h2v = this.R;
            this.X = 1;
            if (h2v.R(obj2, this) == bgr) {
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
        jos jos = new jos(this.R, aoo);
        jos.f5030R = obj;
        return jos;
    }
}
