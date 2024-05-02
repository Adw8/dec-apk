package dev.kdrag0n.virtcontainer.ui.settings.debug;

import android.content.Context;
import android.content.SharedPreferences;
import de.Maxr1998.modernpreferences.PreferencesAdapter;

/* loaded from: classes.dex */
public final class DebugSettingsViewModel extends m5 {
    public final PreferencesAdapter R;

    /* renamed from: R  reason: collision with other field name */
    public final eD0 f2772R;
    public final bLS v = pip.R(0, 0, null, 7);

    /* renamed from: R  reason: collision with other field name */
    public final iyL f2773R = new iyL();
    public final bLS c = pip.R(0, 1, null, 5);

    public DebugSettingsViewModel(doT dot, eD0 ed0) {
        this.f2772R = ed0;
        pdD.J(new bBd(4, this));
        cH4 ch4 = new cH4(((Tq) dot).f538R);
        SharedPreferences sharedPreferences = dot.R;
        ch4.f2053R = sharedPreferences;
        if (sharedPreferences == null) {
            Context context = ch4.R;
            ch4.f2053R = context == null ? null : context.getSharedPreferences(ch4.v, 0);
        }
        ch4.R = null;
        this.R = new PreferencesAdapter(new mkC(ch4));
    }
}
