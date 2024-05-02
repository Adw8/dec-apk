package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import java.util.HashMap;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements kYJ {
    public static final String R = kfk.P("SystemJobService");

    /* renamed from: R  reason: collision with other field name */
    public jFe f1459R;

    /* renamed from: R  reason: collision with other field name */
    public final HashMap f1460R = new HashMap();

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            jFe R2 = jFe.R(getApplicationContext());
            this.f1459R = R2;
            R2.f4888R.R(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                kfk.U().g(R, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        jFe jfe = this.f1459R;
        if (jfe != null) {
            gH5 gh5 = jfe.f4888R;
            synchronized (gh5.f3708R) {
                gh5.f3709R.remove(this);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    @Override // android.app.job.JobService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            jFe r0 = r8.f1459R
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            kfk r0 = defpackage.kfk.U()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.R
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r0.x(r3, r4, r5)
            r8.jobFinished(r9, r1)
            return r2
        L_0x0017:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r3 = r9.getExtras()     // Catch: NullPointerException -> 0x002a
            if (r3 == 0) goto L_0x002a
            boolean r4 = r3.containsKey(r0)     // Catch: NullPointerException -> 0x002a
            if (r4 == 0) goto L_0x002a
            java.lang.String r0 = r3.getString(r0)     // Catch: NullPointerException -> 0x002a
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x003f
            kfk r8 = defpackage.kfk.U()
            java.lang.String r9 = androidx.work.impl.background.systemjob.SystemJobService.R
            java.lang.String r0 = "WorkSpec id not found!"
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]
            r8.H(r9, r0, r1)
            return r2
        L_0x003f:
            java.util.HashMap r3 = r8.f1460R
            monitor-enter(r3)
            java.util.HashMap r4 = r8.f1460R     // Catch: all -> 0x00af
            boolean r4 = r4.containsKey(r0)     // Catch: all -> 0x00af
            if (r4 == 0) goto L_0x0061
            kfk r8 = defpackage.kfk.U()     // Catch: all -> 0x00af
            java.lang.String r9 = androidx.work.impl.background.systemjob.SystemJobService.R     // Catch: all -> 0x00af
            java.lang.String r4 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: all -> 0x00af
            r1[r2] = r0     // Catch: all -> 0x00af
            java.lang.String r0 = java.lang.String.format(r4, r1)     // Catch: all -> 0x00af
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch: all -> 0x00af
            r8.x(r9, r0, r1)     // Catch: all -> 0x00af
            monitor-exit(r3)     // Catch: all -> 0x00af
            return r2
        L_0x0061:
            kfk r4 = defpackage.kfk.U()     // Catch: all -> 0x00af
            java.lang.String r5 = androidx.work.impl.background.systemjob.SystemJobService.R     // Catch: all -> 0x00af
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: all -> 0x00af
            r7[r2] = r0     // Catch: all -> 0x00af
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch: all -> 0x00af
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch: all -> 0x00af
            r4.x(r5, r6, r2)     // Catch: all -> 0x00af
            java.util.HashMap r2 = r8.f1460R     // Catch: all -> 0x00af
            r2.put(r0, r9)     // Catch: all -> 0x00af
            monitor-exit(r3)     // Catch: all -> 0x00af
            CV r2 = new CV
            r3 = 13
            r2.<init>(r3)
            android.net.Uri[] r3 = r9.getTriggeredContentUris()
            if (r3 == 0) goto L_0x0093
            android.net.Uri[] r3 = r9.getTriggeredContentUris()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.v = r3
        L_0x0093:
            java.lang.String[] r3 = r9.getTriggeredContentAuthorities()
            if (r3 == 0) goto L_0x00a3
            java.lang.String[] r3 = r9.getTriggeredContentAuthorities()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.f59R = r3
        L_0x00a3:
            android.net.Network r9 = r9.getNetwork()
            r2.c = r9
            jFe r8 = r8.f1459R
            r8.X(r0, r2)
            return r1
        L_0x00af:
            r8 = move-exception
            monitor-exit(r3)     // Catch: all -> 0x00af
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    @Override // android.app.job.JobService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStopJob(android.app.job.JobParameters r7) {
        /*
            r6 = this;
            jFe r0 = r6.f1459R
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0014
            kfk r6 = defpackage.kfk.U()
            java.lang.String r7 = androidx.work.impl.background.systemjob.SystemJobService.R
            java.lang.String r0 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            r6.x(r7, r0, r1)
            return r2
        L_0x0014:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r7 = r7.getExtras()     // Catch: NullPointerException -> 0x0027
            if (r7 == 0) goto L_0x0027
            boolean r3 = r7.containsKey(r0)     // Catch: NullPointerException -> 0x0027
            if (r3 == 0) goto L_0x0027
            java.lang.String r7 = r7.getString(r0)     // Catch: NullPointerException -> 0x0027
            goto L_0x0028
        L_0x0027:
            r7 = 0
        L_0x0028:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x003c
            kfk r6 = defpackage.kfk.U()
            java.lang.String r7 = androidx.work.impl.background.systemjob.SystemJobService.R
            java.lang.String r0 = "WorkSpec id not found!"
            java.lang.Throwable[] r2 = new java.lang.Throwable[r1]
            r6.H(r7, r0, r2)
            return r1
        L_0x003c:
            kfk r0 = defpackage.kfk.U()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.R
            java.lang.String r4 = "onStopJob for %s"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r7
            java.lang.String r4 = java.lang.String.format(r4, r5)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r1]
            r0.x(r3, r4, r5)
            java.util.HashMap r0 = r6.f1460R
            monitor-enter(r0)
            java.util.HashMap r3 = r6.f1460R     // Catch: all -> 0x0079
            r3.remove(r7)     // Catch: all -> 0x0079
            monitor-exit(r0)     // Catch: all -> 0x0079
            jFe r0 = r6.f1459R
            CV r3 = r0.f4884R
            nTd r4 = new nTd
            r4.<init>(r0, r7, r1)
            r3.X(r4)
            jFe r6 = r6.f1459R
            gH5 r6 = r6.f4888R
            java.lang.Object r1 = r6.f3708R
            monitor-enter(r1)
            java.util.HashSet r6 = r6.f3711R     // Catch: all -> 0x0076
            boolean r6 = r6.contains(r7)     // Catch: all -> 0x0076
            monitor-exit(r1)     // Catch: all -> 0x0076
            r6 = r6 ^ r2
            return r6
        L_0x0076:
            r6 = move-exception
            monitor-exit(r1)     // Catch: all -> 0x0076
            throw r6
        L_0x0079:
            r6 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x0079
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }

    @Override // defpackage.kYJ
    public final void v(String str, boolean z) {
        JobParameters jobParameters;
        kfk.U().x(R, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f1460R) {
            jobParameters = (JobParameters) this.f1460R.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }
}
