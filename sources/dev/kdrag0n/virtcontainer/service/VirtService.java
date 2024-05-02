package dev.kdrag0n.virtcontainer.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import dev.kdrag0n.virtcontainer.R;
import java.lang.Thread;

/* loaded from: classes.dex */
public final class VirtService extends kak {
    public static final /* synthetic */ int X = 0;

    /* renamed from: R  reason: collision with other field name */
    public dkr f2740R;

    /* renamed from: R  reason: collision with other field name */
    public iHI f2741R;

    /* renamed from: R  reason: collision with other field name */
    public iKP f2742R;

    /* renamed from: R  reason: collision with other field name */
    public nbF f2744R;

    /* renamed from: R  reason: collision with other field name */
    public final Thread.UncaughtExceptionHandler f2743R = Thread.getDefaultUncaughtExceptionHandler();
    public final ba1 R = new ba1(this);

    public VirtService() {
        super(1);
    }

    public final void L() {
        nbF nbf = this.f2744R;
        if (nbf == null) {
            nbf = null;
        }
        dkr dkr = this.f2740R;
        if (dkr == null) {
            dkr = null;
        }
        boolean booleanValue = ((Boolean) dkr.f2853R.getValue()).booleanValue();
        nbf.getClass();
        Notification.Builder builder = new Notification.Builder(nbf.R, "service__persistent");
        Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
        intent.putExtra(":settings:fragment_args_key", "block");
        Bundle bundle = new Bundle();
        bundle.putString(":settings:fragment_args_key", "block");
        intent.putExtra(":settings:show_fragment_args", bundle);
        intent.putExtra("android.provider.extra.APP_PACKAGE", "dev.kdrag0n.virtcontainer");
        intent.putExtra("android.provider.extra.CHANNEL_ID", "service__persistent");
        intent.addFlags(268435456);
        PendingIntent B = hDC.B(intent, nbf.R, 100);
        builder.setContentTitle(nbf.R.getString(R.string.service_persistent_active));
        builder.setContentText(nbf.R.getString(R.string.service_persistent_active_desc));
        builder.setContentIntent(B);
        builder.setSmallIcon(R.drawable.ic_fluent_layer_24_filled);
        builder.setForegroundServiceBehavior(1);
        builder.setOnlyAlertOnce(true);
        Service service = nbf.R;
        Intent intent2 = new Intent(service, service.getClass());
        intent2.putExtra("requestCode", 2);
        builder.addAction(new Notification.Action.Builder((Icon) null, nbf.R.getString(R.string.stop), PendingIntent.getForegroundService(service, 10002, intent2, 201326592)).build());
        Service service2 = nbf.R;
        Intent intent3 = new Intent(service2, service2.getClass());
        intent3.putExtra("requestCode", 3);
        builder.addAction(new Notification.Action.Builder((Icon) null, nbf.R.getString(booleanValue ? R.string.service_action_wakelock_off : R.string.service_action_wakelock_on), PendingIntent.getForegroundService(service2, 10003, intent3, 201326592)).build());
        nbf.R.startForeground(100, builder.build());
    }

    public final iHI X() {
        iHI ihi = this.f2741R;
        if (ihi != null) {
            return ihi;
        }
        return null;
    }

    @Override // defpackage.kak, defpackage.gCv, android.app.Service
    public final void onCreate() {
        kxm.v(cUF.v(this), 4, "onCreate", null);
        super.onCreate();
        L();
        iKP ikp = this.f2742R;
        if (ikp == null) {
            ikp = null;
        }
        oLT olt = ikp.R;
        if (!(C1.R(olt.f6770R, olt.R.R) == 0)) {
            kxm.v(cUF.v(this), 6, "Missing permission, abort", null);
            stopSelf();
            return;
        }
        l6.z(gQc.Q(this), null, 0, new fOA(this, null), 3);
        Thread.setDefaultUncaughtExceptionHandler(this.R);
    }

    @Override // defpackage.gCv, android.app.Service
    public final void onDestroy() {
        kxm.v(cUF.v(this), 4, "onDestroy", null);
        super.onDestroy();
        X().e();
        Thread.setDefaultUncaughtExceptionHandler(this.f2743R);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        kxm.v(cUF.v(this), 4, "onLowMemory", null);
        l6.z(mxC.N(), null, 0, new h05(this, null), 3);
    }

    @Override // defpackage.gCv, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        dkr dkr = null;
        Integer valueOf = intent != null ? Integer.valueOf(intent.getIntExtra("requestCode", 0)) : null;
        if (valueOf != null && valueOf.intValue() == 2) {
            X().e();
        } else if (valueOf != null && valueOf.intValue() == 3) {
            dkr dkr2 = this.f2740R;
            if (dkr2 != null) {
                dkr = dkr2;
            }
            ivW ivw = dkr.f2853R;
            ivw.H(Boolean.valueOf(!((Boolean) ivw.getValue()).booleanValue()));
            L();
        }
        super.onStartCommand(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        kxm.v(cUF.v(this), 4, opT.Z("onTrimMemory: level=", i), null);
        l6.z(mxC.N(), null, 0, new eaF(this, null), 3);
    }
}
