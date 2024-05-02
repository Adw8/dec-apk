package defpackage;

/* renamed from: baH  reason: default package */
/* loaded from: classes.dex */
public final class baH extends aFk implements iv7 {
    public final /* synthetic */ gRY R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f1751R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nKt f1752R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public baH(nKt nkt, gRY gry, iv7 iv7, aOO aoo) {
        super(2, aoo);
        this.f1752R = nkt;
        this.R = gry;
        this.f1751R = iv7;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((baH) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            this.f1752R.f6369R.R(Boolean.TRUE);
            nKt nkt = this.f1752R;
            j5q j5q = nkt.f6367R;
            cfD cfd = nkt.R;
            gRY gry = this.R;
            iv7 iv7 = this.f1751R;
            this.X = 1;
            j5q.getClass();
            if (jjU.L(new kfh(gry, j5q, iv7, cfd, null), this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f1752R.f6369R.R(Boolean.FALSE);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new baH(this.f1752R, this.R, this.f1751R, aoo);
    }
}
