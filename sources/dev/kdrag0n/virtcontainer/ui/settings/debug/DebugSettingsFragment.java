package dev.kdrag0n.virtcontainer.ui.settings.debug;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import de.Maxr1998.modernpreferences.PreferencesAdapter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class DebugSettingsFragment extends kGl {
    public static final /* synthetic */ int H = 0;
    public final pr9 v;

    public DebugSettingsFragment() {
        cwX J = pdD.J(new _d(new csm(17, this), 13));
        this.v = new pr9(g8d.R(DebugSettingsViewModel.class), new UG(J, 6), new UJ(this, J, 6), new bE(J, 6));
    }

    public final DebugSettingsViewModel F() {
        return (DebugSettingsViewModel) this.v.getValue();
    }

    @Override // defpackage.gE, defpackage.pm2
    public final void W(View view, Bundle bundle) {
        super.W(view, bundle);
        DebugSettingsViewModel F = F();
        RecyclerView recyclerView = (RecyclerView) ((aQ) this).R.f6624R;
        PreferencesAdapter preferencesAdapter = F.R;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(preferencesAdapter);
        mkC Z = preferencesAdapter.Z();
        if (!(Z.x == 0 && Z.H == 0)) {
            kds layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int i = Z.x;
                int i2 = Z.H;
                linearLayoutManager.L = i;
                linearLayoutManager.Z = i2;
                m6N m6n = linearLayoutManager.f1366R;
                if (m6n != null) {
                    m6n.e = -1;
                }
                linearLayoutManager.cE();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            }
        }
        gcA gca = preferencesAdapter.f2692R;
        ArrayList arrayList = recyclerView.f1416e;
        if (arrayList != null) {
            arrayList.remove(gca);
        }
        recyclerView.Z(preferencesAdapter.f2692R);
        mxC.i(this, new nmk(((okK) F()).R, this, pdD.J(new mT(2, this)), null));
        mxC.i(this, new jLx(this, null));
    }
}
