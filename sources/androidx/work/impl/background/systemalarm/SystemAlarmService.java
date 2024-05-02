package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SystemAlarmService extends gCv implements f7i {
    public static final String R = kfk.P("SystemAlarmService");

    /* renamed from: R  reason: collision with other field name */
    public dUU f1457R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1458R;

    public final void e() {
        this.f1458R = true;
        kfk.U().x(R, "All commands completed in dispatcher", new Throwable[0]);
        String str = aWc.R;
        HashMap hashMap = new HashMap();
        WeakHashMap weakHashMap = aWc.f904R;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                kfk.U().g(aWc.R, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // defpackage.gCv, android.app.Service
    public final void onCreate() {
        super.onCreate();
        v();
        this.f1458R = false;
    }

    @Override // defpackage.gCv, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1458R = true;
        this.f1457R.e();
    }

    @Override // defpackage.gCv, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f1458R) {
            kfk.U().C(R, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f1457R.e();
            v();
            this.f1458R = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f1457R.R(intent, i2);
        return 3;
    }

    public final void v() {
        dUU duu = new dUU(this);
        this.f1457R = duu;
        if (duu.f2635R != null) {
            kfk.U().H(dUU.R, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            duu.f2635R = this;
        }
    }
}
