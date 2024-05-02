package dev.kdrag0n.virtcontainer.ui.settings.root;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.provider.Settings;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class RootSettingsViewModel extends kvj {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f2779R;

    /* renamed from: R  reason: collision with other field name */
    public final SharedPreferences f2780R;

    /* renamed from: R  reason: collision with other field name */
    public final iHI f2782R;

    /* renamed from: R  reason: collision with other field name */
    public final j2f f2785R;

    /* renamed from: R  reason: collision with other field name */
    public final pir f2787R;
    public final ivW c;

    /* renamed from: R  reason: collision with other field name */
    public final ivW f2783R = g4x.O(Boolean.TRUE);

    /* renamed from: R  reason: collision with other field name */
    public final oST f2786R = l6.n(Boolean.FALSE);

    /* renamed from: R  reason: collision with other field name */
    public final bLS f2781R = pip.R(0, 0, null, 7);

    /* renamed from: R  reason: collision with other field name */
    public final iyL f2784R = new iyL();
    public final ivW v = g4x.O(Boolean.valueOf(Environment.isExternalStorageManager()));

    public RootSettingsViewModel(Context context, doT dot, m5f m5f, f1X f1x, pir pir, j2f j2f, iHI ihi) {
        this.f2779R = context;
        this.f2787R = pir;
        this.f2785R = j2f;
        this.f2782R = ihi;
        boolean z = false;
        this.f2780R = dot.R;
        this.c = g4x.O(Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "settings_enable_monitor_phantom_procs", 1) == 0 ? true : z));
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Object obj = C1.R;
        ((ActivityManager) dmD.v(context, ActivityManager.class)).getMemoryInfo(memoryInfo);
        long j = (long) 1024;
        this.R = mLz.y(((double) ((int) ((((memoryInfo.totalMem * ((long) 6)) / ((long) 10)) / j) / j))) / ((double) 200)) * 200;
        mxC.y(m5f.X, gvP.o(this), new hYc(m5f, f1x, this));
    }

    public final void e() {
        boolean z = !((Boolean) this.c.getValue()).booleanValue();
        Settings.Global.putInt(this.f2779R.getContentResolver(), "settings_enable_monitor_phantom_procs", !z ? 1 : 0);
        this.c.H(Boolean.valueOf(z));
    }
}
