package defpackage;

/* renamed from: I_  reason: default package */
/* loaded from: classes.dex */
public final class I_ extends aFk implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ HI R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public I_(HI hi, int i, aOO aoo) {
        super(2, aoo);
        this.R = hi;
        this.O = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((I_) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            bLS bls = this.R.R;
            String Z = opT.Z("code ", this.O);
            this.X = 1;
            if (bls.R(Z, this) == bgr) {
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
        return new I_(this.R, this.O, aoo);
    }
}
