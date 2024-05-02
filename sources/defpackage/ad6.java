package defpackage;

/* renamed from: ad6  reason: default package */
/* loaded from: classes.dex */
public final class ad6 extends aFk implements iv7 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ _6 f938R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ad6(_6 _6, long j, aOO aoo) {
        super(2, aoo);
        this.f938R = _6;
        this.R = j;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((ad6) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            _6 _6 = this.f938R;
            aWo awo = new aWo(this.R);
            ipq ipq = eDJ.f3034R;
            this.X = 1;
            if (_6.R(_6, awo, ipq, this) == bgr) {
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
        return new ad6(this.f938R, this.R, aoo);
    }
}
