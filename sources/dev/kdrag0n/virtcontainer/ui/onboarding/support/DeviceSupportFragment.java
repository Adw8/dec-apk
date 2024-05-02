package dev.kdrag0n.virtcontainer.ui.onboarding.support;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
public final class DeviceSupportFragment extends kq8 {
    public final pr9 R;
    public final pr9 v = new pr9(g8d.R(jke.class), new csm(9, this), new csm(10, this), new pL(this, 3));

    public DeviceSupportFragment() {
        cwX J = pdD.J(new _d(new csm(11, this), 11));
        this.R = new pr9(g8d.R(DeviceSupportViewModel.class), new UG(J, 4), new UJ(this, J, 4), new bE(J, 4));
    }

    @Override // defpackage.pm2
    public final void W(View view, Bundle bundle) {
        E(aH9.u(new bkx(14, this), true, -1700926655));
        ((jke) this.v.getValue()).R.H(Boolean.FALSE);
        mxC.i(this, new cwF(this, null));
    }

    @Override // defpackage.pm2
    public final void d() {
        this.U = true;
        ((jke) this.v.getValue()).R.H(Boolean.TRUE);
    }
}
