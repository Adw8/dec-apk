package dev.kdrag0n.virtcontainer.ui.settings.root;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;

/* loaded from: classes.dex */
public final class RootSettingsFragment extends bss {
    public static final /* synthetic */ int x = 0;
    public final pr9 R;

    public RootSettingsFragment() {
        cwX J = pdD.J(new _d(new csm(20, this), 16));
        this.R = new pr9(g8d.R(RootSettingsViewModel.class), new UG(J, 9), new UJ(this, J, 9), new bE(J, 9));
    }

    @Override // defpackage.pm2
    public final void Q() {
        this.U = true;
        a().v.H(Boolean.valueOf(Environment.isExternalStorageManager()));
    }

    @Override // defpackage.pm2
    public final void W(View view, Bundle bundle) {
        E(aH9.u(new bkx(20, this), true, -357530248));
        mxC.i(this, new d44(this, null));
    }

    public final RootSettingsViewModel a() {
        return (RootSettingsViewModel) this.R.getValue();
    }
}
