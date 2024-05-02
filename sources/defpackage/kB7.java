package defpackage;

/* renamed from: kB7  reason: default package */
/* loaded from: classes.dex */
public final class kB7 extends aFk implements iv7 {
    public final /* synthetic */ iHI R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5205R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kB7(iHI ihi, aOO aoo) {
        super(2, aoo);
        this.R = ihi;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((kB7) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            jy_ jy_ = (jy_) this.f5205R;
            if (!((Boolean) this.R.f4523R.getValue()).booleanValue()) {
                return o8s.R;
            }
            kxm.v(gvP.V(-3881555221781407635L), 4, gvP.V(-3881555277615982483L), null);
            j2f j2f = this.R.f4526R;
            this.X = 1;
            if (j2f.L(this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException(gvP.V(-3881555311975720851L));
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        kB7 kb7 = new kB7(this.R, aoo);
        kb7.f5205R = obj;
        return kb7;
    }
}
