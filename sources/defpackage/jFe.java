package defpackage;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: jFe  reason: default package */
/* loaded from: classes.dex */
public final class jFe extends iSm {

    /* renamed from: R  reason: collision with other field name */
    public CV f4884R;

    /* renamed from: R  reason: collision with other field name */
    public BroadcastReceiver.PendingResult f4885R;

    /* renamed from: R  reason: collision with other field name */
    public Context f4886R;

    /* renamed from: R  reason: collision with other field name */
    public WorkDatabase f4887R;

    /* renamed from: R  reason: collision with other field name */
    public gH5 f4888R;

    /* renamed from: R  reason: collision with other field name */
    public List f4889R;

    /* renamed from: R  reason: collision with other field name */
    public l_s f4890R;

    /* renamed from: R  reason: collision with other field name */
    public ocK f4891R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4892R;
    public static jFe R = null;
    public static jFe v = null;

    /* renamed from: R  reason: collision with other field name */
    public static final Object f4883R = new Object();

    static {
        kfk.P("WorkManagerImpl");
    }

    public jFe(Context context, l_s l_s, CV cv) {
        bSR bsr;
        String str;
        Executor executor;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        o9L o9l = (o9L) cv.f59R;
        int i = WorkDatabase.R;
        if (z) {
            bsr = new bSR(applicationContext, null);
            bsr.f1670R = true;
        } else {
            String str2 = aeR.R;
            bsr = new bSR(applicationContext, "androidx.work.workdb");
            bsr.f1663R = new n1w(applicationContext, 0);
        }
        bsr.f1669R = o9l;
        hJ0 hj0 = new hJ0();
        if (bsr.f1667R == null) {
            bsr.f1667R = new ArrayList();
        }
        bsr.f1667R.add(hj0);
        bsr.R(dgk.R);
        int i2 = 2;
        bsr.R(new o1q(applicationContext, 2, 3));
        bsr.R(dgk.v);
        bsr.R(dgk.c);
        bsr.R(new o1q(applicationContext, 5, 6));
        bsr.R(dgk.e);
        bsr.R(dgk.X);
        bsr.R(dgk.O);
        bsr.R(new o1q(applicationContext));
        bsr.R(new o1q(applicationContext, 10, 11));
        bsr.R(dgk.L);
        bsr.f1671v = false;
        bsr.c = true;
        Context context2 = bsr.R;
        if (context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        } else if (bsr.f1665R != null) {
            Executor executor2 = bsr.f1669R;
            if (executor2 == null && bsr.v == null) {
                r0 r0Var = CW.f60R;
                bsr.v = r0Var;
                bsr.f1669R = r0Var;
            } else if (executor2 != null && bsr.v == null) {
                bsr.v = executor2;
            } else if (executor2 == null && (executor = bsr.v) != null) {
                bsr.f1669R = executor;
            }
            if (bsr.f1663R == null) {
                bsr.f1663R = new aYa(11);
            }
            String str3 = bsr.f1666R;
            cof cof = bsr.f1663R;
            gL6 gl6 = bsr.f1664R;
            ArrayList arrayList = bsr.f1667R;
            boolean z2 = bsr.f1670R;
            ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
            if (activityManager != null && !activityManager.isLowRamDevice()) {
                i2 = 3;
            }
            Executor executor3 = bsr.f1669R;
            aDq adq = new aDq(context2, str3, cof, gl6, arrayList, z2, i2, executor3, bsr.v, bsr.f1671v, bsr.c);
            Class cls = bsr.f1665R;
            String name = cls.getPackage().getName();
            String canonicalName = cls.getCanonicalName();
            canonicalName = !name.isEmpty() ? canonicalName.substring(name.length() + 1) : canonicalName;
            String str4 = canonicalName.replace('.', '_') + "_Impl";
            try {
                if (name.isEmpty()) {
                    str = str4;
                } else {
                    str = name + "." + str4;
                }
                msD msd = (msD) Class.forName(str).newInstance();
                fIY X = msd.X(adq);
                msd.f6207R = X;
                if (X instanceof n4X) {
                    ((n4X) X).R = adq;
                }
                boolean z3 = i2 == 3;
                X.setWriteAheadLoggingEnabled(z3);
                msd.f6210R = arrayList;
                msd.f6211R = executor3;
                new ArrayDeque();
                msd.f6213R = z2;
                msd.v = z3;
                WorkDatabase workDatabase = (WorkDatabase) msd;
                Context applicationContext2 = context.getApplicationContext();
                kfk kfk = new kfk(l_s.R);
                synchronized (kfk.class) {
                    kfk.R = kfk;
                }
                String str5 = hak.R;
                gW_ gw_ = new gW_(applicationContext2, this);
                aGH.R(applicationContext2, SystemJobService.class, true);
                kfk.U().x(hak.R, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
                List asList = Arrays.asList(gw_, new jQy(applicationContext2, l_s, cv, this));
                gH5 gh5 = new gH5(context, l_s, cv, workDatabase, asList);
                Context applicationContext3 = context.getApplicationContext();
                this.f4886R = applicationContext3;
                this.f4890R = l_s;
                this.f4884R = cv;
                this.f4887R = workDatabase;
                this.f4889R = asList;
                this.f4888R = gh5;
                this.f4891R = new ocK(workDatabase);
                this.f4892R = false;
                if (!applicationContext3.isDeviceProtectedStorage()) {
                    this.f4884R.X(new d7z(applicationContext3, this));
                    return;
                }
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            } catch (ClassNotFoundException unused) {
                StringBuilder U = opT.U("cannot find implementation for ");
                U.append(cls.getCanonicalName());
                U.append(". ");
                U.append(str4);
                U.append(" does not exist");
                throw new RuntimeException(U.toString());
            } catch (IllegalAccessException unused2) {
                StringBuilder U2 = opT.U("Cannot access the constructor");
                U2.append(cls.getCanonicalName());
                throw new RuntimeException(U2.toString());
            } catch (InstantiationException unused3) {
                StringBuilder U3 = opT.U("Failed to create an instance of ");
                U3.append(cls.getCanonicalName());
                throw new RuntimeException(U3.toString());
            }
        } else {
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
    }

    public static jFe R(Context context) {
        jFe jfe;
        Object obj = f4883R;
        synchronized (obj) {
            synchronized (obj) {
                jfe = R;
                if (jfe == null) {
                    jfe = v;
                }
            }
            return jfe;
        }
        if (jfe == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof a0A) {
                pF pFVar = (pF) ((a0A) applicationContext);
                pFVar.getClass();
                dOV dov = new dOV();
                glK glk = pFVar.f7069R;
                if (glk == null) {
                    glk = null;
                }
                dov.R = glk;
                v(applicationContext, new l_s(dov));
                jfe = R(applicationContext);
            } else {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
        }
        return jfe;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (defpackage.jFe.v != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        defpackage.jFe.v = new defpackage.jFe(r4, r5, new defpackage.CV(r5.f5788v));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        defpackage.jFe.R = defpackage.jFe.v;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void v(android.content.Context r4, defpackage.l_s r5) {
        /*
            java.lang.Object r0 = defpackage.jFe.f4883R
            monitor-enter(r0)
            jFe r1 = defpackage.jFe.R     // Catch: all -> 0x0032
            if (r1 == 0) goto L_0x0014
            jFe r2 = defpackage.jFe.v     // Catch: all -> 0x0032
            if (r2 != 0) goto L_0x000c
            goto L_0x0014
        L_0x000c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: all -> 0x0032
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: all -> 0x0032
            throw r4     // Catch: all -> 0x0032
        L_0x0014:
            if (r1 != 0) goto L_0x0030
            android.content.Context r4 = r4.getApplicationContext()     // Catch: all -> 0x0032
            jFe r1 = defpackage.jFe.v     // Catch: all -> 0x0032
            if (r1 != 0) goto L_0x002c
            jFe r1 = new jFe     // Catch: all -> 0x0032
            CV r2 = new CV     // Catch: all -> 0x0032
            java.util.concurrent.ExecutorService r3 = r5.f5788v     // Catch: all -> 0x0032
            r2.<init>(r3)     // Catch: all -> 0x0032
            r1.<init>(r4, r5, r2)     // Catch: all -> 0x0032
            defpackage.jFe.v = r1     // Catch: all -> 0x0032
        L_0x002c:
            jFe r4 = defpackage.jFe.v     // Catch: all -> 0x0032
            defpackage.jFe.R = r4     // Catch: all -> 0x0032
        L_0x0030:
            monitor-exit(r0)     // Catch: all -> 0x0032
            return
        L_0x0032:
            r4 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x0032
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jFe.v(android.content.Context, l_s):void");
    }

    public final void X(String str, CV cv) {
        this.f4884R.X(new dX(this, str, cv, 9, 0));
    }

    public final void c() {
        synchronized (f4883R) {
            this.f4892R = true;
            BroadcastReceiver.PendingResult pendingResult = this.f4885R;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f4885R = null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void e() {
        ArrayList v2;
        Context context = this.f4886R;
        String str = gW_.R;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!(jobScheduler == null || (v2 = gW_.v(context, jobScheduler)) == null || v2.isEmpty())) {
            Iterator it = v2.iterator();
            while (it.hasNext()) {
                gW_.R(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        ptn N = this.f4887R.N();
        ((msD) N.R).v();
        mVu R2 = ((k87) N.m).R();
        ((msD) N.R).c();
        try {
            R2.H();
            ((msD) N.R).Z();
            ((msD) N.R).O();
            ((k87) N.m).c(R2);
            hak.R(this.f4890R, this.f4887R, this.f4889R);
        } catch (Throwable th) {
            ((msD) N.R).O();
            ((k87) N.m).c(R2);
            throw th;
        }
    }
}
