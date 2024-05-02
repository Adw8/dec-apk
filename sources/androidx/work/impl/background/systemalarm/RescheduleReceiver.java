package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String R = kfk.P("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        kfk.U().x(R, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            jFe R2 = jFe.R(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            R2.getClass();
            synchronized (jFe.f4883R) {
                R2.f4885R = goAsync;
                if (R2.f4892R) {
                    goAsync.finish();
                    R2.f4885R = null;
                }
            }
        } catch (IllegalStateException e) {
            kfk.U().H(R, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
