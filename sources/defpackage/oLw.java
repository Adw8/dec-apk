package defpackage;

/* renamed from: oLw  reason: default package */
/* loaded from: classes.dex */
public final class oLw extends aFk implements iv7 {
    public final /* synthetic */ bQf R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f6771R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f6772R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public oLw(boolean z, bQf bqf, oSj osj, aOO aoo) {
        super(2, aoo);
        this.f6772R = z;
        this.R = bqf;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((oLw) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            gyx gyx = new gyx(this.f6772R, this.R, null, null);
            this.X = 1;
            if (((iTB) ((ck3) this.f6771R)).g(gyx, this) == bgr) {
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
        oLw olw = new oLw(this.f6772R, this.R, null, aoo);
        olw.f6771R = obj;
        return olw;
    }
}
