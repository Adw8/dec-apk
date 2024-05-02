package defpackage;

/* renamed from: j9i  reason: default package */
/* loaded from: classes.dex */
public final class j9i extends aFk implements iv7 {
    public final /* synthetic */ aqk R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dH9 f4845R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4846R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public j9i(aqk aqk, dH9 dh9, aOO aoo) {
        super(2, aoo);
        this.R = aqk;
        this.f4845R = dh9;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((j9i) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            gcM gcm = new gcM(this.R, this.f4845R, null);
            this.X = 1;
            if (((iTB) ((ck3) this.f4846R)).g(gcm, this) == bgr) {
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
        j9i j9i = new j9i(this.R, this.f4845R, aoo);
        j9i.f4846R = obj;
        return j9i;
    }
}
