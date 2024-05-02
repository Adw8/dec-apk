package defpackage;

/* renamed from: ohY  reason: default package */
/* loaded from: classes.dex */
public final class ohY extends aFk implements iv7 {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ojR f6895R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ohY(ojR ojr, aOO aoo) {
        super(2, aoo);
        this.f6895R = ojr;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((ohY) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            gfZ gfz = new gfZ(this.f6895R, null);
            this.X = 1;
            if (((iTB) ((ck3) this.R)).g(gfz, this) == bgr) {
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
        ohY ohy = new ohY(this.f6895R, aoo);
        ohy.R = obj;
        return ohy;
    }
}
