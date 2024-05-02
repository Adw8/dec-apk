package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* renamed from: RA  reason: default package */
/* loaded from: classes.dex */
public final class RA extends Xb {
    public final /* synthetic */ Q8 R;
    public final Object c;
    public final /* synthetic */ int v = 1;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public RA(Q8 q8, CV cv) {
        super(q8);
        this.R = q8;
        this.c = cv;
    }

    @Override // defpackage.Xb
    public final void H() {
        switch (this.v) {
            case 0:
                this.R.C(true);
                return;
            default:
                this.R.C(true);
                return;
        }
    }

    @Override // defpackage.Xb
    public final int Z() {
        long j;
        switch (this.v) {
            case 0:
                return ((PowerManager) this.c).isPowerSaveMode() ? 2 : 1;
            default:
                CV cv = (CV) this.c;
                ixi ixi = (ixi) cv.c;
                boolean z = false;
                if (ixi.R > System.currentTimeMillis()) {
                    z = ixi.f4782R;
                } else {
                    Location location = null;
                    Location g = gvP.C((Context) cv.f59R, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? cv.g("network") : null;
                    if (gvP.C((Context) cv.f59R, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        location = cv.g("gps");
                    }
                    if (location == null || g == null ? location != null : location.getTime() > g.getTime()) {
                        g = location;
                    }
                    if (g != null) {
                        ixi ixi2 = (ixi) cv.c;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (k5T.R == null) {
                            k5T.R = new k5T();
                        }
                        k5T k5t = k5T.R;
                        k5t.R(currentTimeMillis - 86400000, g.getLatitude(), g.getLongitude());
                        k5t.R(currentTimeMillis, g.getLatitude(), g.getLongitude());
                        if (k5t.f5196R == 1) {
                            z = true;
                        }
                        long j2 = k5t.v;
                        long j3 = k5t.f5197R;
                        k5t.R(currentTimeMillis + 86400000, g.getLatitude(), g.getLongitude());
                        long j4 = k5t.v;
                        if (j2 == -1 || j3 == -1) {
                            j = currentTimeMillis + 43200000;
                        } else {
                            j = (currentTimeMillis > j3 ? j4 + 0 : currentTimeMillis > j2 ? j3 + 0 : j2 + 0) + 60000;
                        }
                        ixi2.f4782R = z;
                        ixi2.R = j;
                        z = ixi.f4782R;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z = true;
                        }
                    }
                }
                return z ? 2 : 1;
        }
    }

    @Override // defpackage.Xb
    public final IntentFilter e() {
        switch (this.v) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public RA(Q8 q8, Context context) {
        super(q8);
        this.R = q8;
        this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
