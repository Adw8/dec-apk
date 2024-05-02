package defpackage;

import dev.kdrag0n.virt.vm.ForwardedPort;
import dev.kdrag0n.virtcontainer.ui.settings.forward.create.PortForwardCreateViewModel;

/* renamed from: cp5  reason: default package */
/* loaded from: classes.dex */
public final class cp5 extends aFk implements iv7 {
    public final /* synthetic */ ForwardedPort R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ PortForwardCreateViewModel f2435R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cp5(PortForwardCreateViewModel portForwardCreateViewModel, ForwardedPort forwardedPort, aOO aoo) {
        super(2, aoo);
        this.f2435R = portForwardCreateViewModel;
        this.R = forwardedPort;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((cp5) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            this.f2435R.L.H(Boolean.TRUE);
            gkP gkp = this.f2435R.f2775R;
            ForwardedPort forwardedPort = this.R;
            this.X = 1;
            if (gkp.R(forwardedPort, this) == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else if (i == 2) {
            jjU.o(obj);
            return o8s.R;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        iyL iyl = this.f2435R.f2778R;
        this.X = 2;
        if (iyl.L(this) == bgr) {
            return bgr;
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new cp5(this.f2435R, this.R, aoo);
    }
}
