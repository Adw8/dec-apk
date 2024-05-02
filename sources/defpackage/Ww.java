package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: Ww  reason: default package */
/* loaded from: classes.dex */
public final class Ww extends j4 {
    public static final String c = kfk.P("BatteryNotLowTracker");

    public Ww(Context context, CV cv) {
        super(context, cv);
    }

    @Override // defpackage.j4
    public final void O(Intent intent) {
        if (intent.getAction() != null) {
            kfk.U().x(c, String.format("Received %s", intent.getAction()), new Throwable[0]);
            String action = intent.getAction();
            action.getClass();
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                v(Boolean.TRUE);
            } else if (action.equals("android.intent.action.BATTERY_LOW")) {
                v(Boolean.FALSE);
            }
        }
    }

    @Override // defpackage.d72
    public final Object R() {
        Intent registerReceiver = ((d72) this).f2492R.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            kfk.U().H(c, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        if (intExtra == 1 || intExtra2 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.j4
    public final IntentFilter X() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }
}
