package defpackage;

import dev.kdrag0n.virtcontainer.ui.onboarding.adb.pair.AdbPairViewModel;

/* renamed from: Vr  reason: default package */
/* loaded from: classes.dex */
public final class Vr extends k8G implements f_c {
    public final /* synthetic */ AdbPairViewModel R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Vr(AdbPairViewModel adbPairViewModel, int i) {
        super(0);
        this.X = i;
        this.R = adbPairViewModel;
    }

    public final void R() {
        switch (this.X) {
            case 0:
                AdbPairViewModel adbPairViewModel = this.R;
                adbPairViewModel.getClass();
                l6.z(gvP.o(adbPairViewModel), iFn.f4518R, 0, new sN(adbPairViewModel, null), 2);
                return;
            default:
                this.R.f2762R.R(Boolean.FALSE);
                return;
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                R();
                break;
            default:
                R();
                break;
        }
        return o8s.R;
    }
}
