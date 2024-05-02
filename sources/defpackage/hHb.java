package defpackage;

/* renamed from: hHb  reason: default package */
/* loaded from: classes.dex */
public final class hHb extends aFk implements iv7 {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jyH f4199R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hHb(jyH jyh, aOO aoo) {
        super(2, aoo);
        this.f4199R = jyh;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((hHb) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            ck3 ck3 = (ck3) this.R;
            ojR ojr = this.f4199R.f5168R;
            if (ojr == null) {
                ojr = null;
            }
            this.X = 1;
            if (g4x.i(ck3, ojr, this) == bgr) {
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
        hHb hhb = new hHb(this.f4199R, aoo);
        hhb.R = obj;
        return hhb;
    }
}
