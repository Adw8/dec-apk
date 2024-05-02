package defpackage;

/* renamed from: aWl  reason: default package */
/* loaded from: classes.dex */
public final class aWl extends aFk implements iv7 {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ojR f905R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aWl(ojR ojr, aOO aoo) {
        super(2, aoo);
        this.f905R = ojr;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((aWl) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Object obj2 = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            ojR ojr = this.f905R;
            this.X = 1;
            Object L = jjU.L(new c5m((ck3) this.R, ojr, null), this);
            if (L != obj2) {
                L = o8s.R;
            }
            if (L == obj2) {
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
        aWl awl = new aWl(this.f905R, aoo);
        awl.R = obj;
        return awl;
    }
}
