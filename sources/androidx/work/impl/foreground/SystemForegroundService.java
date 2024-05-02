package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.UUID;

/* loaded from: classes.dex */
public class SystemForegroundService extends gCv implements lbh {
    public static final String R = kfk.P("SystemFgService");

    /* renamed from: R  reason: collision with other field name */
    public NotificationManager f1461R;

    /* renamed from: R  reason: collision with other field name */
    public Handler f1462R;

    /* renamed from: R  reason: collision with other field name */
    public pe3 f1463R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1464R;

    @Override // defpackage.gCv, android.app.Service
    public final void onCreate() {
        super.onCreate();
        v();
    }

    @Override // defpackage.gCv, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        pe3 pe3 = this.f1463R;
        pe3.f7149R = null;
        synchronized (pe3.f7144R) {
            pe3.f7142R.c();
        }
        gH5 gh5 = pe3.f7143R.f4888R;
        synchronized (gh5.f3708R) {
            gh5.f3709R.remove(pe3);
        }
    }

    @Override // defpackage.gCv, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f1464R) {
            kfk.U().C(R, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            pe3 pe3 = this.f1463R;
            pe3.f7149R = null;
            synchronized (pe3.f7144R) {
                pe3.f7142R.c();
            }
            gH5 gh5 = pe3.f7143R.f4888R;
            synchronized (gh5.f3708R) {
                gh5.f3709R.remove(pe3);
            }
            v();
            this.f1464R = false;
        }
        if (intent == null) {
            return 3;
        }
        pe3 pe32 = this.f1463R;
        pe32.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            kfk.U().C(pe3.v, String.format("Started foreground service %s", intent), new Throwable[0]);
            pe32.R.X(new dX(pe32, pe32.f7143R.f4887R, intent.getStringExtra("KEY_WORKSPEC_ID"), 8));
            pe32.e(intent);
            return 3;
        } else if ("ACTION_NOTIFY".equals(action)) {
            pe32.e(intent);
            return 3;
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            kfk.U().C(pe3.v, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            jFe jfe = pe32.f7143R;
            UUID fromString = UUID.fromString(stringExtra);
            jfe.getClass();
            jfe.f4884R.X(new ss(jfe, fromString));
            return 3;
        } else if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        } else {
            kfk.U().C(pe3.v, "Stopping foreground service", new Throwable[0]);
            lbh lbh = pe32.f7149R;
            if (lbh == null) {
                return 3;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) lbh;
            systemForegroundService.f1464R = true;
            kfk.U().x(R, "All commands completed.", new Throwable[0]);
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
            return 3;
        }
    }

    public final void v() {
        this.f1462R = new Handler(Looper.getMainLooper());
        this.f1461R = (NotificationManager) getApplicationContext().getSystemService("notification");
        pe3 pe3 = new pe3(getApplicationContext());
        this.f1463R = pe3;
        if (pe3.f7149R != null) {
            kfk.U().H(pe3.v, "A callback already exists.", new Throwable[0]);
        } else {
            pe3.f7149R = this;
        }
    }
}
