package dev.kdrag0n.app.ui.onboarding.adb.dev;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import dev.kdrag0n.virtcontainer.R;

/* loaded from: classes.dex */
public final class AdbDevOptionsFragment extends bqi {
    public static final /* synthetic */ int U = 0;
    public final pr9 R;
    public boolean t;
    public final pr9 v = new pr9(g8d.R(jke.class), new csm(1, this), new csm(2, this), new pL(this, 1));

    public AdbDevOptionsFragment() {
        super(0);
        cwX J = pdD.J(new _d(new csm(3, this), 7));
        this.R = new pr9(g8d.R(AdbDevOptionsViewModel.class), new UG(J, 0), new UJ(this, J, 0), new bE(J, 0));
    }

    @Override // defpackage.dl
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(k(), null, 6);
        oer.v(composeView, dXA.R);
        return composeView;
    }

    @Override // defpackage.pm2
    public final void Q() {
        this.U = true;
        if (((AdbDevOptionsViewModel) this.R.getValue()).R.R() && !this.t) {
            b();
        }
    }

    @Override // defpackage.dl, defpackage.pm2
    public final void W(View view, Bundle bundle) {
        super.W(view, bundle);
        mxC.i(this, new am(this, null));
    }

    public final void b() {
        e9E O = iTI.Z(this).O();
        boolean z = false;
        if (O != null && O.e == R.id.onboarding_adb_dev_options) {
            z = true;
        }
        if (z) {
            try {
                iTI.Z(this).H(R.id.onboarding_adb_pair, null, null);
            } catch (IllegalArgumentException unused) {
            }
            this.t = true;
        }
    }
}
