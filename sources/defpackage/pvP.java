package defpackage;

import dev.kdrag0n.virtcontainer.ui.settings.forward.create.PortForwardCreateViewModel;

/* renamed from: pvP  reason: default package */
/* loaded from: classes.dex */
public final class pvP extends aFk implements iv7 {
    public final /* synthetic */ PortForwardCreateViewModel R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f7314R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public pvP(PortForwardCreateViewModel portForwardCreateViewModel, aOO aoo) {
        super(2, aoo);
        this.R = portForwardCreateViewModel;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((pvP) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        jy_ jy_ = (jy_) this.f7314R;
        PortForwardCreateViewModel portForwardCreateViewModel = this.R;
        mxC.t(portForwardCreateViewModel.v, jy_, new dxB(portForwardCreateViewModel, 0));
        PortForwardCreateViewModel portForwardCreateViewModel2 = this.R;
        mxC.t(portForwardCreateViewModel2.c, jy_, new dxB(portForwardCreateViewModel2, 1));
        PortForwardCreateViewModel portForwardCreateViewModel3 = this.R;
        mxC.t(portForwardCreateViewModel3.e, jy_, new dxB(portForwardCreateViewModel3, 2));
        PortForwardCreateViewModel portForwardCreateViewModel4 = this.R;
        mxC.t(portForwardCreateViewModel4.X, jy_, new dxB(portForwardCreateViewModel4, 3));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        pvP pvp = new pvP(this.R, aoo);
        pvp.f7314R = obj;
        return pvp;
    }
}
