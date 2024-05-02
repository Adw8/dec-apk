package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: dUU  reason: default package */
/* loaded from: classes.dex */
public final class dUU implements kYJ {
    public static final String R = kfk.P("SystemAlarmDispatcher");

    /* renamed from: R  reason: collision with other field name */
    public final CV f2630R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f2631R;

    /* renamed from: R  reason: collision with other field name */
    public final dNF f2634R;

    /* renamed from: R  reason: collision with other field name */
    public f7i f2635R;

    /* renamed from: R  reason: collision with other field name */
    public final gH5 f2636R;

    /* renamed from: R  reason: collision with other field name */
    public final jFe f2638R;

    /* renamed from: R  reason: collision with other field name */
    public final icq f2637R = new icq();

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f2639R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public Intent f2632R = null;

    /* renamed from: R  reason: collision with other field name */
    public final Handler f2633R = new Handler(Looper.getMainLooper());

    public dUU(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f2631R = applicationContext;
        this.f2634R = new dNF(applicationContext);
        jFe R2 = jFe.R(context);
        this.f2638R = R2;
        gH5 gh5 = R2.f4888R;
        this.f2636R = gh5;
        this.f2630R = R2.f4884R;
        gh5.R(this);
    }

    public final void O() {
        c();
        PowerManager.WakeLock R2 = aWc.R(this.f2631R, "ProcessCommand");
        try {
            R2.acquire();
            this.f2638R.f4884R.X(new pbC(this, 0));
        } finally {
            R2.release();
        }
    }

    public final void R(Intent intent, int i) {
        kfk U = kfk.U();
        String str = R;
        boolean z = false;
        U.x(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            kfk.U().g(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f2639R) {
                Iterator it = this.f2639R.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                return;
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f2639R) {
            boolean z2 = !this.f2639R.isEmpty();
            this.f2639R.add(intent);
            if (!z2) {
                O();
            }
        }
    }

    public final void X(Runnable runnable) {
        this.f2633R.post(runnable);
    }

    public final void c() {
        if (this.f2633R.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void e() {
        kfk.U().x(R, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        gH5 gh5 = this.f2636R;
        synchronized (gh5.f3708R) {
            gh5.f3709R.remove(this);
        }
        icq icq = this.f2637R;
        if (!icq.f4672R.isShutdown()) {
            icq.f4672R.shutdownNow();
        }
        this.f2635R = null;
    }

    @Override // defpackage.kYJ
    public final void v(String str, boolean z) {
        Context context = this.f2631R;
        String str2 = dNF.R;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        X(new kBb(this, intent, 0));
    }
}
