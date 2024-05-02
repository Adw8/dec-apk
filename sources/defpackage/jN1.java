package defpackage;

/* renamed from: jN1  reason: default package */
/* loaded from: classes.dex */
public final class jN1 extends aFk implements iv7 {
    public final /* synthetic */ iHI R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4915R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jN1(iHI ihi, aOO aoo) {
        super(2, aoo);
        this.R = ihi;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((jN1) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            jy_ jy_ = (jy_) this.f4915R;
            iHI ihi = this.R;
            this.X = 1;
            ihi.getClass();
            l6.z(jy_, null, 0, new iJO(ihi, null), 3);
            l6.z(jy_, null, 0, new nn4(ihi, null), 3);
            l6.z(jy_, null, 0, new aay(ihi, null), 3);
            l6.z(jy_, null, 0, new fPq(ihi, null), 3);
            if (o8s.R == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException(gvP.V(-3881556703545124755L));
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        jN1 jn1 = new jN1(this.R, aoo);
        jn1.f4915R = obj;
        return jn1;
    }
}
