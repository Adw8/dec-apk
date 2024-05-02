package defpackage;

/* renamed from: arD  reason: default package */
/* loaded from: classes.dex */
public final class arD extends aFk implements iv7 {
    public final /* synthetic */ iv7 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nu_ f1471R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public arD(nu_ nu_, iv7 iv7, aOO aoo) {
        super(2, aoo);
        this.f1471R = nu_;
        this.R = iv7;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((arD) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Object obj2 = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            nu_ nu_ = this.f1471R;
            iMP imp = iMP.STARTED;
            iv7 iv7 = this.R;
            this.X = 1;
            Object d = hDC.d(nu_.O(), imp, iv7, this);
            if (d != obj2) {
                d = o8s.R;
            }
            if (d == obj2) {
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
        return new arD(this.f1471R, this.R, aoo);
    }
}
