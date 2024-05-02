package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: gH5  reason: default package */
/* loaded from: classes.dex */
public final class gH5 implements kYJ, cpn {
    public static final String R = kfk.P("Processor");

    /* renamed from: R  reason: collision with other field name */
    public CV f3704R;

    /* renamed from: R  reason: collision with other field name */
    public Context f3705R;

    /* renamed from: R  reason: collision with other field name */
    public WorkDatabase f3707R;

    /* renamed from: R  reason: collision with other field name */
    public List f3712R;

    /* renamed from: R  reason: collision with other field name */
    public l_s f3713R;
    public HashMap v = new HashMap();

    /* renamed from: R  reason: collision with other field name */
    public HashMap f3710R = new HashMap();

    /* renamed from: R  reason: collision with other field name */
    public HashSet f3711R = new HashSet();

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f3709R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public PowerManager.WakeLock f3706R = null;

    /* renamed from: R  reason: collision with other field name */
    public final Object f3708R = new Object();

    public gH5(Context context, l_s l_s, CV cv, WorkDatabase workDatabase, List list) {
        this.f3705R = context;
        this.f3713R = l_s;
        this.f3704R = cv;
        this.f3707R = workDatabase;
        this.f3712R = list;
    }

    public static boolean c(String str, iwe iwe) {
        boolean z;
        if (iwe != null) {
            iwe.f4775R = true;
            iwe.m();
            nA8 na8 = iwe.f4772R;
            if (na8 != null) {
                z = na8.isDone();
                iwe.f4772R.cancel(true);
            } else {
                z = false;
            }
            ListenableWorker listenableWorker = iwe.f4762R;
            if (listenableWorker == null || z) {
                kfk.U().x(iwe.c, String.format("WorkSpec %s is already done. Not interrupting.", iwe.f4770R), new Throwable[0]);
            } else {
                listenableWorker.O();
            }
            kfk.U().x(R, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
            return true;
        }
        kfk.U().x(R, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
        return false;
    }

    public final boolean L(String str) {
        boolean c;
        synchronized (this.f3708R) {
            kfk.U().x(R, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            c = c(str, (iwe) this.f3710R.remove(str));
        }
        return c;
    }

    public final void O() {
        synchronized (this.f3708R) {
            if (!(!this.f3710R.isEmpty())) {
                Context context = this.f3705R;
                String str = pe3.v;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                this.f3705R.startService(intent);
                PowerManager.WakeLock wakeLock = this.f3706R;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f3706R = null;
                }
            }
        }
    }

    public final void R(kYJ kyj) {
        synchronized (this.f3708R) {
            this.f3709R.add(kyj);
        }
    }

    public final boolean X(String str, CV cv) {
        synchronized (this.f3708R) {
            try {
                if (e(str)) {
                    kfk.U().x(R, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                    return false;
                }
                jal jal = new jal(this.f3705R, this.f3713R, this.f3704R, this, this.f3707R, str);
                jal.L = this.f3712R;
                if (cv != null) {
                    jal.f4973R = cv;
                }
                iwe iwe = new iwe(jal);
                gXD gxd = iwe.f4766R;
                gxd.R(new dX(this, str, gxd, 5, 0), (Executor) this.f3704R.c);
                this.v.put(str, iwe);
                ((o9L) this.f3704R.f59R).execute(iwe);
                kfk.U().x(R, String.format("%s: processing %s", gH5.class.getSimpleName(), str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean Z(String str) {
        boolean c;
        synchronized (this.f3708R) {
            kfk.U().x(R, String.format("Processor stopping background work %s", str), new Throwable[0]);
            c = c(str, (iwe) this.v.remove(str));
        }
        return c;
    }

    public final boolean e(String str) {
        boolean z;
        synchronized (this.f3708R) {
            if (!this.v.containsKey(str) && !this.f3710R.containsKey(str)) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    @Override // defpackage.kYJ
    public final void v(String str, boolean z) {
        synchronized (this.f3708R) {
            this.v.remove(str);
            kfk.U().x(R, String.format("%s %s executed; reschedule = %s", gH5.class.getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
            Iterator it = this.f3709R.iterator();
            while (it.hasNext()) {
                ((kYJ) it.next()).v(str, z);
            }
        }
    }
}
