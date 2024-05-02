package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: chm  reason: default package */
/* loaded from: classes.dex */
public final class chm {
    public static final zI R = new zI("PackageStateCache", 0);

    /* renamed from: R  reason: collision with other field name */
    public int f2177R = -1;

    /* renamed from: R  reason: collision with other field name */
    public final Context f2178R;

    public chm(Context context) {
        this.f2178R = context;
    }

    public final synchronized int R() {
        if (this.f2177R == -1) {
            try {
                this.f2177R = this.f2178R.getPackageManager().getPackageInfo(this.f2178R.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                R.L("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f2177R;
    }
}
