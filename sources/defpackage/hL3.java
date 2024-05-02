package defpackage;

/* renamed from: hL3  reason: default package */
/* loaded from: classes.dex */
public final class hL3 extends aFk implements iv7 {
    public final /* synthetic */ l3X R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f4210R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ phU f4211R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hL3(lR3 lr3, l3X l3x, phU phu, aOO aoo) {
        super(2, aoo);
        this.f4210R = lr3;
        this.R = l3x;
        this.f4211R = phu;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((hL3) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            lR3 lr3 = this.f4210R;
            l3X l3x = this.R;
            aWo awo = new aWo(this.f4211R.c);
            this.X = 1;
            if (lr3.y(l3x, awo, this) == bgr) {
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
        return new hL3(this.f4210R, this.R, this.f4211R, aoo);
    }
}
