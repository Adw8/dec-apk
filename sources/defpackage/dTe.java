package defpackage;

import dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel;

/* renamed from: dTe  reason: default package */
/* loaded from: classes.dex */
public final class dTe extends k8G implements f_c {
    public final /* synthetic */ OverviewViewModel R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dTe(OverviewViewModel overviewViewModel, int i) {
        super(0);
        this.X = i;
        this.R = overviewViewModel;
    }

    public final void R() {
        switch (this.X) {
            case 0:
                this.R.Z.H(null);
                return;
            case 1:
                OverviewViewModel overviewViewModel = this.R;
                b1n b1n = (b1n) overviewViewModel.Z.getValue();
                if (b1n != null) {
                    overviewViewModel.Z.H(null);
                    overviewViewModel.m.H(b1n);
                    l6.z(gvP.o(overviewViewModel), null, 0, new ik1(overviewViewModel, b1n, null), 3);
                    return;
                }
                return;
            case 2:
                this.R.Z.H(null);
                return;
            case 3:
                OverviewViewModel overviewViewModel2 = this.R;
                overviewViewModel2.f2770R.H(null);
                overviewViewModel2.O.H(Boolean.FALSE);
                overviewViewModel2.f2771R.R();
                overviewViewModel2.X();
                return;
            default:
                OverviewViewModel overviewViewModel3 = this.R;
                overviewViewModel3.f2770R.H(null);
                overviewViewModel3.O.H(Boolean.FALSE);
                overviewViewModel3.f2771R.R();
                overviewViewModel3.X();
                return;
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                R();
                break;
            case 1:
                R();
                break;
            case 2:
                R();
                break;
            case 3:
                R();
                break;
            default:
                R();
                break;
        }
        return o8s.R;
    }
}
