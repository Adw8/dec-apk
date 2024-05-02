package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: gCv  reason: default package */
/* loaded from: classes.dex */
public abstract class gCv extends Service implements nu_ {
    public final CV R = new CV(this);

    @Override // defpackage.nu_
    public final m4i O() {
        return (m4i) this.R.f59R;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.R.u(alX.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.R.u(alX.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        CV cv = this.R;
        cv.u(alX.ON_STOP);
        cv.u(alX.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.R.u(alX.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
