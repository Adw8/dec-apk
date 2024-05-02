package defpackage;

import dev.kdrag0n.virtcontainer.ui.onboarding.support.DeviceSupportFragment;
import dev.kdrag0n.virtcontainer.ui.onboarding.support.DeviceSupportViewModel;

/* renamed from: cwF  reason: default package */
/* loaded from: classes.dex */
public final class cwF extends aFk implements iv7 {
    public final /* synthetic */ DeviceSupportFragment R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f2459R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cwF(DeviceSupportFragment deviceSupportFragment, aOO aoo) {
        super(2, aoo);
        this.R = deviceSupportFragment;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((cwF) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        mxC.y(((DeviceSupportViewModel) this.R.R.getValue()).R, (jy_) this.f2459R, new hki(10, this.R));
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        cwF cwf = new cwF(this.R, aoo);
        cwf.f2459R = obj;
        return cwf;
    }
}
