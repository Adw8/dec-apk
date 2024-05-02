package defpackage;

/* renamed from: gHK  reason: default package */
/* loaded from: classes.dex */
public final class gHK extends aFk implements iv7 {
    public final /* synthetic */ aLd R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iMP f3714R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f3715R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3716R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gHK(aLd ald, iMP imp, iv7 iv7, aOO aoo) {
        super(2, aoo);
        this.R = ald;
        this.f3714R = imp;
        this.f3715R = iv7;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((gHK) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Throwable th;
        goZ goz;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            nbD C = ((jy_) this.f3716R).C();
            int i2 = pd2.v;
            pd2 pd2 = (pd2) C.O(hw1.O);
            if (pd2 != null) {
                gX5 gx5 = new gX5();
                goZ goz2 = new goZ(this.R, this.f3714R, gx5.R, pd2);
                try {
                    iv7 iv7 = this.f3715R;
                    this.f3716R = goz2;
                    this.X = 1;
                    obj = l6.a(gx5, iv7, this);
                    if (obj == bgr) {
                        return bgr;
                    }
                    goz = goz2;
                } catch (Throwable th2) {
                    th = th2;
                    goz = goz2;
                    goz.R();
                    throw th;
                }
            } else {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
        } else if (i == 1) {
            goz = (goZ) this.f3716R;
            try {
                jjU.o(obj);
            } catch (Throwable th3) {
                th = th3;
                goz.R();
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        goz.R();
        return obj;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        gHK ghk = new gHK(this.R, this.f3714R, this.f3715R, aoo);
        ghk.f3716R = obj;
        return ghk;
    }
}
