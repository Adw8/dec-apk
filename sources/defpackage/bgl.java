package defpackage;

/* renamed from: bgl  reason: default package */
/* loaded from: classes.dex */
public final class bgl extends aFk implements iv7 {
    public final /* synthetic */ l3X R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f1766R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ phU f1767R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bgl(lR3 lr3, l3X l3x, phU phu, aOO aoo) {
        super(2, aoo);
        this.f1766R = lr3;
        this.R = l3x;
        this.f1767R = phu;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((bgl) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            lR3 lr3 = this.f1766R;
            l3X l3x = this.R;
            aWo awo = new aWo(this.f1767R.c);
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
        return new bgl(this.f1766R, this.R, this.f1767R, aoo);
    }
}
