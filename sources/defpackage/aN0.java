package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: aN0  reason: default package */
/* loaded from: classes.dex */
public final class aN0 extends j4 {
    public static final String c = kfk.P("StorageNotLowTracker");

    public aN0(Context context, CV cv) {
        super(context, cv);
    }

    @Override // defpackage.j4
    public final void O(Intent intent) {
        if (intent.getAction() != null) {
            kfk.U().x(c, String.format("Received %s", intent.getAction()), new Throwable[0]);
            String action = intent.getAction();
            action.getClass();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                v(Boolean.FALSE);
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                v(Boolean.TRUE);
            }
        }
    }

    @Override // defpackage.d72
    public final Object R() {
        Intent registerReceiver = ((d72) this).f2492R.registerReceiver(null, X());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // defpackage.j4
    public final IntentFilter X() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }
}
