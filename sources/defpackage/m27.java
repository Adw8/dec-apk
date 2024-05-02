package defpackage;

/* renamed from: m27  reason: default package */
/* loaded from: classes.dex */
public final class m27 extends aFk implements iv7 {
    public final /* synthetic */ f_c R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5889R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public m27(f_c f_c, aOO aoo) {
        super(2, aoo);
        this.R = f_c;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((m27) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            lh2 lh2 = new lh2((ck3) this.f5889R, this.R, null);
            this.X = 1;
            if (jjU.L(lh2, this) == bgr) {
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
        m27 m27 = new m27(this.R, aoo);
        m27.f5889R = obj;
        return m27;
    }
}
