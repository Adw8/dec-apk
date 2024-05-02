package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: gb  reason: default package */
/* loaded from: classes.dex */
public final class gb extends j4 {
    public static final String c = kfk.P("BatteryChrgTracker");

    public gb(Context context, CV cv) {
        super(context, cv);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r7.equals("android.os.action.DISCHARGING") == false) goto L_0x0026;
     */
    @Override // defpackage.j4
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r7 = r7.getAction()
            if (r7 != 0) goto L_0x0007
            return
        L_0x0007:
            kfk r0 = defpackage.kfk.U()
            java.lang.String r1 = defpackage.gb.c
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r7
            java.lang.String r5 = "Received %s"
            java.lang.String r3 = java.lang.String.format(r5, r3)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r4]
            r0.x(r1, r3, r5)
            r0 = -1
            int r1 = r7.hashCode()
            switch(r1) {
                case -1886648615: goto L_0x0047;
                case -54942926: goto L_0x003e;
                case 948344062: goto L_0x0033;
                case 1019184907: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            r2 = r0
            goto L_0x0051
        L_0x0028:
            java.lang.String r1 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0031
            goto L_0x0026
        L_0x0031:
            r2 = 3
            goto L_0x0051
        L_0x0033:
            java.lang.String r1 = "android.os.action.CHARGING"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x003c
            goto L_0x0026
        L_0x003c:
            r2 = 2
            goto L_0x0051
        L_0x003e:
            java.lang.String r1 = "android.os.action.DISCHARGING"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0051
            goto L_0x0026
        L_0x0047:
            java.lang.String r1 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0050
            goto L_0x0026
        L_0x0050:
            r2 = r4
        L_0x0051:
            switch(r2) {
                case 0: goto L_0x0067;
                case 1: goto L_0x0061;
                case 2: goto L_0x005b;
                case 3: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x006c
        L_0x0055:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6.v(r7)
            goto L_0x006c
        L_0x005b:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6.v(r7)
            goto L_0x006c
        L_0x0061:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.v(r7)
            goto L_0x006c
        L_0x0067:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.v(r7)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb.O(android.content.Intent):void");
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
        if (intExtra == 2 || intExtra == 5) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.j4
    public final IntentFilter X() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }
}
