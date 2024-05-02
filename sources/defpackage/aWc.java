package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* renamed from: aWc  reason: default package */
/* loaded from: classes.dex */
public abstract class aWc {
    public static final String R = kfk.P("WakeLocks");

    /* renamed from: R  reason: collision with other field name */
    public static final WeakHashMap f904R = new WeakHashMap();

    public static PowerManager.WakeLock R(Context context, String str) {
        String H = opT.H("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, H);
        WeakHashMap weakHashMap = f904R;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, H);
        }
        return newWakeLock;
    }
}
