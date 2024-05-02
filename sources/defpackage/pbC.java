package defpackage;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: pbC  reason: default package */
/* loaded from: classes.dex */
public final class pbC implements Runnable {
    public final dUU R;
    public final /* synthetic */ int e;

    public /* synthetic */ pbC(dUU duu, int i) {
        this.e = i;
        this.R = duu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        dUU duu;
        pbC pbc;
        boolean z2 = true;
        switch (this.e) {
            case 0:
                synchronized (this.R.f2639R) {
                    try {
                        dUU duu2 = this.R;
                        duu2.f2632R = (Intent) duu2.f2639R.get(0);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Intent intent = this.R.f2632R;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.R.f2632R.getIntExtra("KEY_START_ID", 0);
                    kfk U = kfk.U();
                    String str = dUU.R;
                    U.x(str, String.format("Processing command %s, %s", this.R.f2632R, Integer.valueOf(intExtra)), new Throwable[0]);
                    PowerManager.WakeLock R = aWc.R(this.R.f2631R, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                    try {
                        kfk.U().x(str, String.format("Acquiring operation wake lock (%s) %s", action, R), new Throwable[0]);
                        R.acquire();
                        dUU duu3 = this.R;
                        duu3.f2634R.e(duu3.f2632R, intExtra, duu3);
                        kfk.U().x(str, String.format("Releasing operation wake lock (%s) %s", action, R), new Throwable[0]);
                        R.release();
                        duu = this.R;
                        pbc = new pbC(duu, 1);
                    } catch (Throwable th2) {
                        try {
                            kfk U2 = kfk.U();
                            String str2 = dUU.R;
                            U2.H(str2, "Unexpected error in onHandleIntent", th2);
                            kfk.U().x(str2, String.format("Releasing operation wake lock (%s) %s", action, R), new Throwable[0]);
                            R.release();
                            duu = this.R;
                            pbc = new pbC(duu, 1);
                        } catch (Throwable th3) {
                            kfk.U().x(dUU.R, String.format("Releasing operation wake lock (%s) %s", action, R), new Throwable[0]);
                            R.release();
                            dUU duu4 = this.R;
                            duu4.X(new pbC(duu4, 1));
                            throw th3;
                        }
                    }
                    duu.X(pbc);
                    return;
                }
                return;
            default:
                dUU duu5 = this.R;
                duu5.getClass();
                kfk U3 = kfk.U();
                String str3 = dUU.R;
                U3.x(str3, "Checking if commands are complete.", new Throwable[0]);
                duu5.c();
                synchronized (duu5.f2639R) {
                    try {
                        if (duu5.f2632R != null) {
                            kfk.U().x(str3, String.format("Removing command %s", duu5.f2632R), new Throwable[0]);
                            if (((Intent) duu5.f2639R.remove(0)).equals(duu5.f2632R)) {
                                duu5.f2632R = null;
                            } else {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                        }
                        o9L o9l = (o9L) duu5.f2630R.f59R;
                        dNF dnf = duu5.f2634R;
                        synchronized (dnf.f2583R) {
                            z = !dnf.f2584R.isEmpty();
                        }
                        if (!z && duu5.f2639R.isEmpty()) {
                            synchronized (o9l.R) {
                                if (o9l.f6694R.isEmpty()) {
                                    z2 = false;
                                }
                            }
                            if (!z2) {
                                kfk.U().x(str3, "No more commands & intents.", new Throwable[0]);
                                f7i f7i = duu5.f2635R;
                                if (f7i != null) {
                                    ((SystemAlarmService) f7i).e();
                                }
                            }
                        }
                        if (!duu5.f2639R.isEmpty()) {
                            duu5.O();
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
        }
    }
}
