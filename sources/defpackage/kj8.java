package defpackage;

/* renamed from: kj8  reason: default package */
/* loaded from: classes.dex */
public final class kj8 extends aFk implements iv7 {
    public final /* synthetic */ iv7 R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5399R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mtG f5400R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kj8(mtG mtg, iv7 iv7, aOO aoo) {
        super(2, aoo);
        this.f5400R = mtg;
        this.R = iv7;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((kj8) X((gAN) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            mtG mtg = this.f5400R;
            mtg.f6223R = (gAN) this.f5399R;
            iv7 iv7 = this.R;
            this.X = 1;
            if (iv7.J(mtg, this) == bgr) {
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
        kj8 kj8 = new kj8(this.f5400R, this.R, aoo);
        kj8.f5399R = obj;
        return kj8;
    }
}
