package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: puc  reason: default package */
/* loaded from: classes.dex */
public final class puc implements kOC, kYJ, gAS {
    public static final String v = kfk.P("DelayMetCommandHandler");
    public final Context R;

    /* renamed from: R  reason: collision with other field name */
    public PowerManager.WakeLock f7307R;

    /* renamed from: R  reason: collision with other field name */
    public final dUU f7308R;

    /* renamed from: R  reason: collision with other field name */
    public final idW f7309R;

    /* renamed from: R  reason: collision with other field name */
    public final String f7311R;
    public final int e;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7312R = false;
    public int X = 0;

    /* renamed from: R  reason: collision with other field name */
    public final Object f7310R = new Object();

    public puc(Context context, int i, String str, dUU duu) {
        this.R = context;
        this.e = i;
        this.f7308R = duu;
        this.f7311R = str;
        this.f7309R = new idW(context, duu.f2630R, this);
    }

    public final void O() {
        synchronized (this.f7310R) {
            if (this.X < 2) {
                this.X = 2;
                kfk U = kfk.U();
                String str = v;
                U.x(str, String.format("Stopping work for WorkSpec %s", this.f7311R), new Throwable[0]);
                Context context = this.R;
                String str2 = this.f7311R;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                dUU duu = this.f7308R;
                duu.X(new kBb(duu, intent, this.e));
                if (this.f7308R.f2636R.e(this.f7311R)) {
                    kfk.U().x(str, String.format("WorkSpec %s needs to be rescheduled", this.f7311R), new Throwable[0]);
                    Intent c = dNF.c(this.R, this.f7311R);
                    dUU duu2 = this.f7308R;
                    duu2.X(new kBb(duu2, c, this.e));
                } else {
                    kfk.U().x(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f7311R), new Throwable[0]);
                }
            } else {
                kfk.U().x(v, String.format("Already stopped work for %s", this.f7311R), new Throwable[0]);
            }
        }
    }

    @Override // defpackage.kOC
    public final void R(List list) {
        if (list.contains(this.f7311R)) {
            synchronized (this.f7310R) {
                if (this.X == 0) {
                    this.X = 1;
                    kfk.U().x(v, String.format("onAllConstraintsMet for %s", this.f7311R), new Throwable[0]);
                    if (this.f7308R.f2636R.X(this.f7311R, null)) {
                        this.f7308R.f2637R.R(this.f7311R, this);
                    } else {
                        e();
                    }
                } else {
                    kfk.U().x(v, String.format("Already started work for %s", this.f7311R), new Throwable[0]);
                }
            }
        }
    }

    public final void X() {
        this.f7307R = aWc.R(this.R, String.format("%s (%s)", this.f7311R, Integer.valueOf(this.e)));
        kfk U = kfk.U();
        String str = v;
        U.x(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f7307R, this.f7311R), new Throwable[0]);
        this.f7307R.acquire();
        l3L m = this.f7308R.f2638R.f4887R.N().m(this.f7311R);
        if (m == null) {
            O();
            return;
        }
        boolean v2 = m.v();
        this.f7312R = v2;
        if (!v2) {
            kfk.U().x(str, String.format("No constraints for %s", this.f7311R), new Throwable[0]);
            R(Collections.singletonList(this.f7311R));
            return;
        }
        this.f7309R.v(Collections.singletonList(m));
    }

    @Override // defpackage.kOC
    public final void c(ArrayList arrayList) {
        O();
    }

    public final void e() {
        synchronized (this.f7310R) {
            this.f7309R.c();
            this.f7308R.f2637R.v(this.f7311R);
            PowerManager.WakeLock wakeLock = this.f7307R;
            if (wakeLock != null && wakeLock.isHeld()) {
                kfk.U().x(v, String.format("Releasing wakelock %s for WorkSpec %s", this.f7307R, this.f7311R), new Throwable[0]);
                this.f7307R.release();
            }
        }
    }

    @Override // defpackage.kYJ
    public final void v(String str, boolean z) {
        kfk.U().x(v, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        e();
        if (z) {
            Intent c = dNF.c(this.R, this.f7311R);
            dUU duu = this.f7308R;
            duu.X(new kBb(duu, c, this.e));
        }
        if (this.f7312R) {
            Intent intent = new Intent(this.R, SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            dUU duu2 = this.f7308R;
            duu2.X(new kBb(duu2, intent, this.e));
        }
    }
}
