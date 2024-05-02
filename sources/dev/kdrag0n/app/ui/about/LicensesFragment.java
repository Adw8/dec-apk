package dev.kdrag0n.app.ui.about;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes.dex */
public final class LicensesFragment extends eA9 {
    public g1p R;

    public LicensesFragment() {
        super(1);
    }

    @Override // defpackage.gE
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(k(), null, 6);
        oer.v(composeView, aH9.u(new bkx(6, this), true, 932447086));
        return composeView;
    }

    @Override // defpackage.gE, defpackage.pm2
    public final void W(View view, Bundle bundle) {
        super.W(view, bundle);
        View view2 = ((pm2) this).f7228R;
        if (view2 != null) {
            view2.setBackgroundResource(17170445);
        }
    }
}
