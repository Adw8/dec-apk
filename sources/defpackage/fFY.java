package defpackage;

/* renamed from: fFY  reason: default package */
/* loaded from: classes.dex */
public final class fFY extends aFk implements iv7 {
    public final /* synthetic */ dH9 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f3359R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3360R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jy_ f3361R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f3362R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fFY(jy_ jy_, h0T h0t, p2E p2e, dH9 dh9, aOO aoo) {
        super(2, aoo);
        this.f3361R = jy_;
        this.f3359R = h0t;
        this.f3362R = p2e;
        this.R = dh9;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((fFY) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Object obj2 = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            ck3 ck3 = (ck3) this.f3360R;
            jy_ jy_ = this.f3361R;
            giK gik = new giK(this.f3362R, this.f3359R, null, jy_);
            jb4 jb4 = new jb4(this.R, 4);
            this.X = 1;
            b3f b3f = pjd.R;
            Object y = ooA.y(ck3, new fj1(new l3X(ck3), gik, jb4, null), this);
            if (y != obj2) {
                y = o8s.R;
            }
            if (y == obj2) {
                return obj2;
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
        fFY ffy = new fFY(this.f3361R, this.f3359R, this.f3362R, this.R, aoo);
        ffy.f3360R = obj;
        return ffy;
    }
}
