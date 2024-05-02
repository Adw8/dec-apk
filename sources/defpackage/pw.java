package defpackage;

/* renamed from: pw  reason: default package */
/* loaded from: classes.dex */
public final class pw extends aFk implements iv7 {
    public final /* synthetic */ h0T R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h5L f7318R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public pw(h5L h5l, h0T h0t, aOO aoo) {
        super(2, aoo);
        this.f7318R = h5l;
        this.R = h0t;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((pw) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            i31 l = l6.l(new dH(this.f7318R, 0));
            tD tDVar = new tD(this.R, 0);
            this.X = 1;
            if (l.v(tDVar, this) == bgr) {
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
        return new pw(this.f7318R, this.R, aoo);
    }
}
