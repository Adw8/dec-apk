package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: cC_  reason: default package */
/* loaded from: classes.dex */
public abstract class cC_ extends Binder implements js8 {
    public static js8 O(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(js8.c);
        return (queryLocalInterface == null || !(queryLocalInterface instanceof js8)) ? new bDs(iBinder) : (js8) queryLocalInterface;
    }
}
