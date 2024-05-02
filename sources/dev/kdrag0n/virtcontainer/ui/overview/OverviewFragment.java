package dev.kdrag0n.virtcontainer.ui.overview;

import android.os.Bundle;
import android.view.View;
import dev.kdrag0n.virtcontainer.ui.main.MainSharedViewModel;

/* loaded from: classes.dex */
public final class OverviewFragment extends cG_ {
    public static final /* synthetic */ int x = 0;
    public final pr9 R;
    public final pr9 v = new pr9(g8d.R(MainSharedViewModel.class), new csm(14, this), new csm(15, this), new pL(this, 5));

    public OverviewFragment() {
        cwX J = pdD.J(new _d(new csm(16, this), 12));
        this.R = new pr9(g8d.R(OverviewViewModel.class), new UG(J, 5), new UJ(this, J, 5), new bE(J, 5));
    }

    @Override // defpackage.pm2
    public final void S() {
        this.U = true;
        MainSharedViewModel mainSharedViewModel = (MainSharedViewModel) this.v.getValue();
        mainSharedViewModel.getClass();
        l6.z(gvP.o(mainSharedViewModel), iFn.f4518R, 0, new jAK(mainSharedViewModel, null), 2);
        ((OverviewViewModel) this.R.getValue()).X();
    }

    @Override // defpackage.pm2
    public final void W(View view, Bundle bundle) {
        E(aH9.u(new bkx(15, this), true, -437907334));
    }
}
