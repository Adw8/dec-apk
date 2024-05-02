package defpackage;

import android.content.Context;
import android.provider.Settings;

/* renamed from: oLT  reason: default package */
/* loaded from: classes.dex */
public final class oLT {
    public final OT R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f6770R;

    public oLT(Context context, IO io2) {
        this.f6770R = context;
        this.R = io2;
    }

    public final boolean R() {
        return Settings.Global.getInt(this.f6770R.getContentResolver(), "development_settings_enabled", 0) == 1;
    }
}
