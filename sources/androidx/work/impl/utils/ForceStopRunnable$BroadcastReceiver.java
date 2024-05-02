package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    public static final String R = kfk.P("ForceStopRunnable$Rcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            kfk U = kfk.U();
            String str = R;
            if (U.f5390R <= 2) {
                Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
            }
            String str2 = d7z.f2504R;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
            intent2.setAction("ACTION_FORCE_STOP_RESCHEDULE");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent2, 167772160);
            long currentTimeMillis = System.currentTimeMillis() + d7z.R;
            if (alarmManager != null) {
                alarmManager.setExact(0, currentTimeMillis, broadcast);
            }
        }
    }
}
