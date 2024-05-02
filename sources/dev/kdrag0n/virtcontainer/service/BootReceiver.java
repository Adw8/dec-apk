package dev.kdrag0n.virtcontainer.service;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class BootReceiver extends dop {
    public doT R;

    /* renamed from: R  reason: collision with other field name */
    public kdp f2739R;

    @Override // defpackage.dop, defpackage.kkd, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if (n3x.v(intent.getAction(), "android.intent.action.BOOT_COMPLETED") || n3x.v(intent.getAction(), "android.intent.action.MY_PACKAGE_REPLACED")) {
            kdp kdp = null;
            kxm.v(cUF.v(this), 4, "Boot completed", null);
            doT dot = this.R;
            if (dot == null) {
                dot = null;
            }
            if (((Boolean) dot.X.v(dot, doT.v[3])).booleanValue()) {
                try {
                    kdp kdp2 = this.f2739R;
                    if (kdp2 != null) {
                        kdp = kdp2;
                    }
                    kdp.R();
                } catch (ForegroundServiceStartNotAllowedException e) {
                    kxm.v(cUF.v(this), 5, "Failed to start service", e);
                }
            }
        }
    }
}
