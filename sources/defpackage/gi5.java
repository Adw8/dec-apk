package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: gi5  reason: default package */
/* loaded from: classes.dex */
public abstract class gi5 extends BroadcastReceiver {
    public static final String R = kfk.P("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        kfk.U().x(R, String.format("onReceive : %s", intent), new Throwable[0]);
        String str = dNF.R;
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
