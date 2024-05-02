package defpackage;

/* renamed from: fj1  reason: default package */
/* loaded from: classes.dex */
public final class fj1 extends aFk implements iv7 {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f3524R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ l3X f3525R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f3526R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fj1(l3X l3x, lR3 lr3, kg9 kg9, aOO aoo) {
        super(2, aoo);
        this.f3525R = l3x;
        this.f3526R = lr3;
        this.f3524R = kg9;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((fj1) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            evM evm = new evM(this.f3525R, (ck3) this.R, this.f3526R, this.f3524R, null);
            this.X = 1;
            if (jjU.L(evm, this) == bgr) {
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
        fj1 fj1 = new fj1(this.f3525R, this.f3526R, this.f3524R, aoo);
        fj1.R = obj;
        return fj1;
    }
}
