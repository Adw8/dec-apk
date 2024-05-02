package defpackage;

import dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel;

/* renamed from: jzD  reason: default package */
/* loaded from: classes.dex */
public final class jzD extends k8G implements f_c {
    public final /* synthetic */ OverviewViewModel R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f5169R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jzD(OverviewViewModel overviewViewModel, h0T h0t, int i) {
        super(0);
        this.X = i;
        this.R = overviewViewModel;
        this.f5169R = h0t;
    }

    public final void R() {
        switch (this.X) {
            case 0:
                ivW ivw = this.R.f2767R.f2853R;
                ivw.H(Boolean.valueOf(!((Boolean) ivw.getValue()).booleanValue()));
                this.f5169R.R(Boolean.FALSE);
                return;
            case 1:
                ivW ivw2 = this.R.f2767R.f2853R;
                ivw2.H(Boolean.valueOf(!((Boolean) ivw2.getValue()).booleanValue()));
                this.f5169R.R(Boolean.FALSE);
                return;
            default:
                OverviewViewModel overviewViewModel = this.R;
                overviewViewModel.getClass();
                l6.z(gvP.o(overviewViewModel), null, 0, new oze(overviewViewModel, null), 3);
                this.f5169R.R(Boolean.FALSE);
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
            default:
                R();
                break;
        }
        return o8s.R;
    }
}
