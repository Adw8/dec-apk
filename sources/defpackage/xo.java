package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;

/* renamed from: xo  reason: default package */
/* loaded from: classes.dex */
public abstract class xo {
    public static final String R = kfk.P("Alarms");

    public static void R(int i, Context context, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, dNF.R(context, str), 603979776);
        if (service != null && alarmManager != null) {
            kfk.U().x(R, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i)), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void v(Context context, jFe jfe, String str, long j) {
        int intValue;
        WorkDatabase workDatabase = jfe.f4887R;
        CV H = workDatabase.H();
        nlH i = H.i(str);
        if (i != null) {
            R(i.R, context, str);
            int i2 = i.R;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i2, dNF.R(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        synchronized (ocK.class) {
            workDatabase.c();
            Long v = workDatabase.x().v("next_alarm_manager_id");
            intValue = v != null ? v.intValue() : 0;
            workDatabase.x().X(new h0c("next_alarm_manager_id", (long) (intValue == Integer.MAX_VALUE ? 0 : intValue + 1)));
            workDatabase.Z();
            workDatabase.O();
        }
        H.K(new nlH(str, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, intValue, dNF.R(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
