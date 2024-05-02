package defpackage;

/* renamed from: eln  reason: default package */
/* loaded from: classes.dex */
public final class eln extends aFk implements iv7 {
    public final /* synthetic */ iv7 R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3194R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public eln(iv7 iv7, aOO aoo) {
        super(2, aoo);
        this.R = iv7;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((eln) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            iv7 iv7 = this.R;
            this.X = 1;
            if (iv7.J((jy_) this.f3194R, this) == bgr) {
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
        eln eln = new eln(this.R, aoo);
        eln.f3194R = obj;
        return eln;
    }
}
