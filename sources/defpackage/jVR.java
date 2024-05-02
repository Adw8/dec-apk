package defpackage;

import dev.kdrag0n.virtcontainer.ui.settings.forward.create.PortForwardCreateViewModel;
import java.util.List;

/* renamed from: jVR  reason: default package */
/* loaded from: classes.dex */
public final class jVR extends aFk implements iv7 {
    public final /* synthetic */ PortForwardCreateViewModel R;

    /* renamed from: R  reason: collision with other field name */
    public ivW f4945R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jVR(PortForwardCreateViewModel portForwardCreateViewModel, aOO aoo) {
        super(2, aoo);
        this.R = portForwardCreateViewModel;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((jVR) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        ivW ivw;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        boolean z = true;
        if (i == 0) {
            jjU.o(obj);
            PortForwardCreateViewModel portForwardCreateViewModel = this.R;
            ivW ivw2 = portForwardCreateViewModel.f2777R;
            aME ame = portForwardCreateViewModel.R;
            this.f4945R = ivw2;
            this.X = 1;
            obj = ame.X(this);
            if (obj == bgr) {
                return bgr;
            }
            ivw = ivw2;
        } else if (i == 1) {
            ivw = this.f4945R;
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ivw.H(obj);
        List list = (List) this.R.f2777R.getValue();
        if (list == null || !(!list.isEmpty())) {
            z = false;
        }
        if (z) {
            PortForwardCreateViewModel portForwardCreateViewModel2 = this.R;
            portForwardCreateViewModel2.v.H(((b1n) ((List) portForwardCreateViewModel2.f2777R.getValue()).get(0)).R);
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new jVR(this.R, aoo);
    }
}
