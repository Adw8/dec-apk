package defpackage;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: fWY  reason: default package */
/* loaded from: classes.dex */
public final class fWY implements Runnable {
    public final /* synthetic */ Notification R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ SystemForegroundService f3442R;
    public final /* synthetic */ int X;
    public final /* synthetic */ int e;

    public fWY(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.f3442R = systemForegroundService;
        this.e = i;
        this.R = notification;
        this.X = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3442R.startForeground(this.e, this.R, this.X);
    }
}
