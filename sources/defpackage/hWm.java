package defpackage;

/* renamed from: hWm  reason: default package */
/* loaded from: classes.dex */
public final class hWm extends aFk implements iv7 {
    public hgO R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iHI f4292R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hWm(iHI ihi, aOO aoo) {
        super(2, aoo);
        this.f4292R = ihi;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((hWm) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Throwable th;
        hgO hgo;
        Object obj2 = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            iHI ihi = this.f4292R;
            hgO hgo2 = ihi.f4522R;
            if (hgo2.v(null)) {
                try {
                    this.R = hgo2;
                    this.X = 1;
                    Object a = l6.a(iFn.f4518R, new jVx(ihi, null), this);
                    if (a != obj2) {
                        a = o8s.R;
                    }
                    if (a == obj2) {
                        return obj2;
                    }
                    hgo = hgo2;
                } catch (Throwable th2) {
                    th = th2;
                    hgo = hgo2;
                    hgo.c(null);
                    throw th;
                }
            }
            return o8s.R;
        } else if (i == 1) {
            hgo = this.R;
            try {
                jjU.o(obj);
            } catch (Throwable th3) {
                th = th3;
                hgo.c(null);
                throw th;
            }
        } else {
            throw new IllegalStateException(gvP.V(-3881555518134151059L));
        }
        hgo.c(null);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new hWm(this.f4292R, aoo);
    }
}
