package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: ep0  reason: default package */
/* loaded from: classes.dex */
public final class ep0 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ eyJ R;

    public ep0(eyJ eyj) {
        this.R = eyj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        kfk.U().x(eyJ.v, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
        eyJ eyj = this.R;
        eyj.v(eyj.X());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        kfk.U().x(eyJ.v, "Network connection lost", new Throwable[0]);
        eyJ eyj = this.R;
        eyj.v(eyj.X());
    }
}
