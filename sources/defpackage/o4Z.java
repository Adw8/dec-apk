package defpackage;

import dev.kdrag0n.virt.vm.ForwardedPort;
import dev.kdrag0n.virtcontainer.ui.settings.forward.PortForwardViewModel;

/* renamed from: o4Z  reason: default package */
/* loaded from: classes.dex */
public final class o4Z extends aFk implements iv7 {
    public final /* synthetic */ ForwardedPort R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ PortForwardViewModel f6665R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public o4Z(PortForwardViewModel portForwardViewModel, ForwardedPort forwardedPort, aOO aoo) {
        super(2, aoo);
        this.f6665R = portForwardViewModel;
        this.R = forwardedPort;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((o4Z) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            gkP gkp = this.f6665R.R;
            ForwardedPort forwardedPort = this.R;
            this.X = 1;
            if (gkp.v(forwardedPort, this) == bgr) {
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
        return new o4Z(this.f6665R, this.R, aoo);
    }
}
