package dev.kdrag0n.virtcontainer.ui.onboarding.adb.pair;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService;
import dev.kdrag0n.virtcontainer.ui.main.MainActivity;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class AdbPairFragment extends bqi {
    public static final /* synthetic */ int U = 0;
    public F4 R;

    /* renamed from: R  reason: collision with other field name */
    public final Ks f2755R;

    /* renamed from: R  reason: collision with other field name */
    public doT f2756R;

    /* renamed from: R  reason: collision with other field name */
    public final pr9 f2757R;
    public final pr9 v = new pr9(g8d.R(jke.class), new csm(5, this), new csm(6, this), new pL(this, 2));

    public AdbPairFragment() {
        super(1);
        cwX J = pdD.J(new _d(new csm(7, this), 9));
        this.f2757R = new pr9(g8d.R(AdbPairViewModel.class), new UG(J, 2), new UJ(this, J, 2), new bE(J, 2));
        Dk dk = new Dk(0);
        nxC nxc = new nxC(4, this);
        Zz zz = new Zz(this);
        if (((pm2) this).e <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            fvd fvd = new fvd(this, zz, atomicReference, dk, nxc);
            if (((pm2) this).e >= 0) {
                fvd.R();
            } else {
                ((pm2) this).f7239R.add(fvd);
            }
            this.f2755R = new Ks(this, atomicReference, dk, 2);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    @Override // defpackage.dl
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(k(), null, 6);
        oer.v(composeView, aH9.u(new bkx(12, this), true, -1422465960));
        return composeView;
    }

    @Override // defpackage.pm2
    public final void Q() {
        this.U = true;
        if (w().e()) {
            b();
        }
    }

    @Override // defpackage.dl, defpackage.pm2
    public final void W(View view, Bundle bundle) {
        super.W(view, bundle);
        mxC.i(this, new QS(this, null));
    }

    public final void b() {
        doT dot = this.f2756R;
        F4 f4 = null;
        if (dot == null) {
            dot = null;
        }
        dot.c(true);
        eAj eaj = ((pm2) this).f7232R;
        hm9 hm9 = eaj == null ? null : (hm9) eaj.R;
        F4 f42 = this.R;
        if (f42 != null) {
            f4 = f42;
        }
        f4.getClass();
        l(new Intent(hm9, MainActivity.class));
        r().finish();
    }

    public final void q() {
        if (!Y5.O || k().checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            w().f2760R.c(null);
            k().startForegroundService(new Intent(k(), AdbPairingService.class));
            return;
        }
        this.f2755R.R();
    }

    public final AdbPairViewModel w() {
        return (AdbPairViewModel) this.f2757R.getValue();
    }
}
