package defpackage;

import dev.kdrag0n.virtcontainer.service.VirtService;

/* renamed from: fOA  reason: default package */
/* loaded from: classes.dex */
public final class fOA extends aFk implements iv7 {
    public final /* synthetic */ VirtService R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3406R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fOA(VirtService virtService, aOO aoo) {
        super(2, aoo);
        this.R = virtService;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((fOA) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        jy_ jy_ = (jy_) this.f3406R;
        iHI X = this.R.X();
        X.getClass();
        l6.z(mxC.N(), null, 0, new hWm(X, null), 3);
        mxC.t(this.R.X().f4523R, jy_, new hki(8, new llN(jy_, this.R, null)));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        fOA foa = new fOA(this.R, aoo);
        foa.f3406R = obj;
        return foa;
    }
}
