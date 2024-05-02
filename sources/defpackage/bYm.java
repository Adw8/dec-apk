package defpackage;

/* renamed from: bYm  reason: default package */
/* loaded from: classes.dex */
public final class bYm extends aFk implements iv7 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ f_c f1725R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bYm(long j, f_c f_c, aOO aoo) {
        super(2, aoo);
        this.R = j;
        this.f1725R = f_c;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((bYm) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            long j = this.R;
            hJ_ hj_ = new hJ_(this.f1725R, null);
            this.X = 1;
            if (j > 0) {
                obj = l6.G(new bjV(j, this), hj_);
                if (obj == bgr) {
                    return bgr;
                }
            } else {
                throw new maT("Timed out immediately", null);
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new bYm(this.R, this.f1725R, aoo);
    }
}
