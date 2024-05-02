package defpackage;

/* renamed from: ha  reason: default package */
/* loaded from: classes.dex */
public final class ha extends aFk implements iv7 {
    public final /* synthetic */ HI R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f4316R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ha(HI hi, String str, aOO aoo) {
        super(2, aoo);
        this.R = hi;
        this.f4316R = str;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((ha) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            bLS bls = this.R.R;
            String str = this.f4316R;
            this.X = 1;
            if (bls.R(str, this) == bgr) {
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
        return new ha(this.R, this.f4316R, aoo);
    }
}
