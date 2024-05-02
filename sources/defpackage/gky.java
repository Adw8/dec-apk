package defpackage;

import dev.kdrag0n.virtcontainer.ui.settings.forward.create.PortForwardCreateViewModel;
import dev.kdrag0n.virtcontainer.ui.settings.forward.create.PortForwardFragment;

/* renamed from: gky  reason: default package */
/* loaded from: classes.dex */
public final class gky extends aFk implements iv7 {
    public final /* synthetic */ PortForwardFragment R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3922R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gky(PortForwardFragment portForwardFragment, aOO aoo) {
        super(2, aoo);
        this.R = portForwardFragment;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((gky) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        mxC.y(((PortForwardCreateViewModel) this.R.R.getValue()).f2778R, (jy_) this.f3922R, new hki(11, this.R));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        gky gky = new gky(this.R, aoo);
        gky.f3922R = obj;
        return gky;
    }
}
