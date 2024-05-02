package defpackage;

/* renamed from: lh2  reason: default package */
/* loaded from: classes.dex */
public final class lh2 extends aFk implements iv7 {
    public final /* synthetic */ ck3 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ f_c f5800R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lh2(ck3 ck3, f_c f_c, aOO aoo) {
        super(2, aoo);
        this.R = ck3;
        this.f5800R = f_c;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((lh2) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            ck3 ck3 = this.R;
            hJz hjz = new hJz(this.f5800R, null);
            this.X = 1;
            if (((iTB) ck3).g(hjz, this) == bgr) {
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
        return new lh2(this.R, this.f5800R, aoo);
    }
}
