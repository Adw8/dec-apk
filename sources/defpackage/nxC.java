package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import dev.kdrag0n.virtcontainer.ui.onboarding.adb.pair.AdbPairFragment;

/* renamed from: nxC  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nxC implements P_, aXc, Sw, d1H {
    public final /* synthetic */ Object R;

    public /* synthetic */ nxC(int i, Object obj) {
        this.R = obj;
    }

    @Override // defpackage.Sw
    public final void R(Object obj) {
        AdbPairFragment adbPairFragment = (AdbPairFragment) this.R;
        int i = AdbPairFragment.U;
        if (((Boolean) obj).booleanValue()) {
            adbPairFragment.q();
        } else {
            adbPairFragment.w().v.R(Boolean.TRUE);
        }
    }

    @Override // defpackage.aXc
    public final void v(Object obj) {
        l4A l4a = (l4A) this.R;
        nu_ nu_ = (nu_) obj;
        if (nu_ != null) {
            nu_.O().R(new DefaultLifecycleObserver() { // from class: dev.kdrag0n.app.ui.utils.FragmentViewBindingDelegate$1$viewLifecycleOwnerLiveDataObserver$1$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final void onDestroy(nu_ nu_2) {
                    l4A.this.R = null;
                }
            });
        }
    }
}
