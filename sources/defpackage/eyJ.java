package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* renamed from: eyJ  reason: default package */
/* loaded from: classes.dex */
public final class eyJ extends d72 {
    public static final String v = kfk.P("NetworkStateTracker");
    public final ConnectivityManager R = (ConnectivityManager) ((d72) this).f2492R.getSystemService("connectivity");

    /* renamed from: R  reason: collision with other field name */
    public ep0 f3258R = new ep0(this);

    public eyJ(Context context, CV cv) {
        super(context, cv);
    }

    @Override // defpackage.d72
    public final Object R() {
        return X();
    }

    public final b_y X() {
        boolean z;
        NetworkCapabilities networkCapabilities;
        NetworkInfo activeNetworkInfo = this.R.getActiveNetworkInfo();
        boolean z2 = true;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = this.R.getNetworkCapabilities(this.R.getActiveNetwork());
        } catch (SecurityException e) {
            kfk.U().H(v, "Unable to validate active network", e);
        }
        if (networkCapabilities != null) {
            if (networkCapabilities.hasCapability(16)) {
                z = true;
                boolean R = pq6.R(this.R);
                if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                    z2 = false;
                }
                return new b_y(z3, z, R, z2);
            }
        }
        z = false;
        boolean R = pq6.R(this.R);
        if (activeNetworkInfo != null) {
        }
        z2 = false;
        return new b_y(z3, z, R, z2);
    }

    @Override // defpackage.d72
    public final void c() {
        try {
            kfk.U().x(v, "Registering network callback", new Throwable[0]);
            this.R.registerDefaultNetworkCallback(this.f3258R);
        } catch (IllegalArgumentException | SecurityException e) {
            kfk.U().H(v, "Received exception while registering network callback", e);
        }
    }

    @Override // defpackage.d72
    public final void e() {
        try {
            kfk.U().x(v, "Unregistering network callback", new Throwable[0]);
            this.R.unregisterNetworkCallback(this.f3258R);
        } catch (IllegalArgumentException | SecurityException e) {
            kfk.U().H(v, "Received exception while unregistering network callback", e);
        }
    }
}
