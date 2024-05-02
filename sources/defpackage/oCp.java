package defpackage;

/* renamed from: oCp  reason: default package */
/* loaded from: classes.dex */
public final class oCp extends aFk implements iv7 {
    public final /* synthetic */ gRY R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f6704R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ n_I f6705R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public oCp(n_I n_i, gRY gry, iv7 iv7, aOO aoo) {
        super(2, aoo);
        this.f6705R = n_i;
        this.R = gry;
        this.f6704R = iv7;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((oCp) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            n_I n_i = this.f6705R;
            j5q j5q = n_i.f6461R;
            fjG fjg = n_i.R;
            gRY gry = this.R;
            bau bau = new bau(n_i, this.f6704R, null);
            this.X = 1;
            j5q.getClass();
            if (jjU.L(new kfh(gry, j5q, bau, fjg, null), this) == bgr) {
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
        return new oCp(this.f6705R, this.R, this.f6704R, aoo);
    }
}
