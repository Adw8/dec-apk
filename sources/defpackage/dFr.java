package defpackage;

/* renamed from: dFr  reason: default package */
/* loaded from: classes.dex */
public final class dFr extends aFk implements iv7 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nhg f2545R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public dFr(nhg nhg, float f, aOO aoo) {
        super(2, aoo);
        this.f2545R = nhg;
        this.R = f;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((dFr) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            nhg nhg = this.f2545R;
            Float f = new Float((-this.R) * 2.0f);
            this.X = 1;
            if (nhg.R(f, this) == bgr) {
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
        return new dFr(this.f2545R, this.R, aoo);
    }
}
