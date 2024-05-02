package dev.kdrag0n.virtcontainer.ui.settings.usb;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
public final class UsbFragment extends fVr {
    public static final /* synthetic */ int x = 0;
    public final bTd R = new bTd(this);

    /* renamed from: R  reason: collision with other field name */
    public final pr9 f2788R;
    public boolean t;

    public UsbFragment() {
        cwX J = pdD.J(new _d(new csm(21, this), 17));
        this.f2788R = new pr9(g8d.R(UsbViewModel.class), new UG(J, 10), new UJ(this, J, 10), new bE(J, 10));
    }

    public final UsbViewModel D() {
        return (UsbViewModel) this.f2788R.getValue();
    }

    @Override // defpackage.pm2
    public final void W(View view, Bundle bundle) {
        E(aH9.u(new bkx(21, this), true, 848932702));
        mxC.i(this, new ist(this, null));
    }

    @Override // defpackage.pm2
    public final void Y() {
        this.U = true;
        if (this.t) {
            k().unregisterReceiver(this.R);
        }
    }
}
