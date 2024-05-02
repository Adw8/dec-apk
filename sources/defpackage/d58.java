package defpackage;

/* renamed from: d58  reason: default package */
/* loaded from: classes.dex */
public final class d58 extends aFk implements iv7 {
    public final /* synthetic */ gIA R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h6T f2483R;
    public int X;
    public final /* synthetic */ gIA v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public d58(h6T h6t, gIA gia, gIA gia2, aOO aoo) {
        super(2, aoo);
        this.f2483R = h6t;
        this.R = gia;
        this.v = gia2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((d58) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            h6T h6t = this.f2483R;
            gIA gia = this.R;
            gIA gia2 = this.v;
            this.X = 1;
            int i2 = h6T.e;
            if (h6t.m(gia, gia2, this) == bgr) {
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
        return new d58(this.f2483R, this.R, this.v, aoo);
    }
}
