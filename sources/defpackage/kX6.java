package defpackage;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import java.util.ArrayList;

/* renamed from: kX6  reason: default package */
/* loaded from: classes.dex */
public final class kX6 implements ServiceConnection {
    public Notification R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f5323R;

    /* renamed from: R  reason: collision with other field name */
    public ExtractionForegroundService f5324R;

    /* renamed from: R  reason: collision with other field name */
    public final zI f5326R = new zI("ExtractionForegroundServiceConnection", 0);

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f5325R = new ArrayList();

    public kX6(Context context) {
        this.f5323R = context;
    }

    public final void R() {
        ArrayList arrayList;
        synchronized (this.f5325R) {
            arrayList = new ArrayList(this.f5325R);
            this.f5325R.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k8L k8l = (k8L) arrayList.get(i);
            try {
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                Parcel O = k8l.O();
                int i2 = okB.R;
                O.writeInt(1);
                bundle.writeToParcel(O, 0);
                O.writeInt(1);
                bundle2.writeToParcel(O, 0);
                k8l.L(O, 2);
            } catch (RemoteException unused) {
                this.f5326R.L("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5326R.X("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((ihb) iBinder).R;
        this.f5324R = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.R);
        R();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
