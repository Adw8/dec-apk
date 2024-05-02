package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: gW_  reason: default package */
/* loaded from: classes.dex */
public final class gW_ implements fjo {
    public static final String R = kfk.P("SystemJobScheduler");

    /* renamed from: R  reason: collision with other field name */
    public final JobScheduler f3782R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f3783R;

    /* renamed from: R  reason: collision with other field name */
    public final fHD f3784R;

    /* renamed from: R  reason: collision with other field name */
    public final jFe f3785R;

    public gW_(Context context, jFe jfe) {
        fHD fhd = new fHD(context);
        this.f3783R = context;
        this.f3785R = jfe;
        this.f3782R = (JobScheduler) context.getSystemService("jobscheduler");
        this.f3784R = fhd;
    }

    public static void R(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            kfk.U().H(R, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList v(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            kfk.U().H(R, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x003c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0016 A[SYNTHETIC] */
    @Override // defpackage.fjo
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O(java.lang.String r8) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f3783R
            android.app.job.JobScheduler r1 = r7.f3782R
            java.util.ArrayList r0 = v(r0, r1)
            r1 = 0
            if (r0 != 0) goto L_0x000c
            goto L_0x0049
        L_0x000c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 2
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0048
            java.lang.Object r3 = r0.next()
            android.app.job.JobInfo r3 = (android.app.job.JobInfo) r3
            java.lang.String r4 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r5 = r3.getExtras()
            if (r5 == 0) goto L_0x0035
            boolean r6 = r5.containsKey(r4)     // Catch: NullPointerException -> 0x0035
            if (r6 == 0) goto L_0x0035
            java.lang.String r4 = r5.getString(r4)     // Catch: NullPointerException -> 0x0035
            goto L_0x0036
        L_0x0035:
            r4 = r1
        L_0x0036:
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x0016
            int r3 = r3.getId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L_0x0016
        L_0x0048:
            r1 = r2
        L_0x0049:
            if (r1 == 0) goto L_0x0076
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0076
            java.util.Iterator r0 = r1.iterator()
        L_0x0055:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x006b
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            android.app.job.JobScheduler r2 = r7.f3782R
            R(r2, r1)
            goto L_0x0055
        L_0x006b:
            jFe r7 = r7.f3785R
            androidx.work.impl.WorkDatabase r7 = r7.f4887R
            CV r7 = r7.H()
            r7.n(r8)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gW_.O(java.lang.String):void");
    }

    /* JADX INFO: finally extract failed */
    @Override // defpackage.fjo
    public final void X(l3L... l3lArr) {
        int i;
        int i2;
        WorkDatabase workDatabase = this.f3785R.f4887R;
        int length = l3lArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            l3L l3l = l3lArr[i4];
            workDatabase.c();
            try {
                l3L m = workDatabase.N().m(l3l.f5562R);
                if (m == null) {
                    kfk.U().g(R, "Skipping scheduling " + l3l.f5562R + " because it's no longer in the DB", new Throwable[i3]);
                    workDatabase.Z();
                } else if (m.f5561R != gDn.ENQUEUED) {
                    kfk.U().g(R, "Skipping scheduling " + l3l.f5562R + " because it is no longer enqueued", new Throwable[i3]);
                    workDatabase.Z();
                } else {
                    nlH i5 = workDatabase.H().i(l3l.f5562R);
                    if (i5 != null) {
                        i2 = i5.R;
                        i = i4;
                    } else {
                        this.f3785R.f4890R.getClass();
                        int i6 = this.f3785R.f4890R.v;
                        synchronized (ocK.class) {
                            workDatabase.c();
                            Long v = workDatabase.x().v("next_job_scheduler_id");
                            int intValue = v != null ? v.intValue() : i3;
                            i = i4;
                            workDatabase.x().X(new h0c("next_job_scheduler_id", (long) (intValue == Integer.MAX_VALUE ? i3 : intValue + 1)));
                            workDatabase.Z();
                            workDatabase.O();
                            if (intValue >= 0 && intValue <= i6) {
                                i2 = intValue;
                            }
                            workDatabase.x().X(new h0c("next_job_scheduler_id", (long) 1));
                            i2 = 0;
                        }
                    }
                    if (i5 == null) {
                        this.f3785R.f4887R.H().K(new nlH(l3l.f5562R, i2));
                    }
                    c(l3l, i2);
                    workDatabase.Z();
                    workDatabase.O();
                    i4 = i + 1;
                    i3 = 0;
                }
                i = i4;
                workDatabase.O();
                i4 = i + 1;
                i3 = 0;
            } catch (Throwable th) {
                workDatabase.O();
                throw th;
            }
        }
    }

    public final void c(l3L l3l, int i) {
        int i2;
        fHD fhd = this.f3784R;
        fhd.getClass();
        csc csc = l3l.f5559R;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", l3l.f5562R);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", l3l.c());
        JobInfo.Builder extras = new JobInfo.Builder(i, fhd.f3370R).setRequiresCharging(csc.f2442R).setRequiresDeviceIdle(csc.f2443v).setExtras(persistableBundle);
        g_9 g_9 = csc.f2441R;
        if (g_9 == g_9.TEMPORARILY_UNMETERED) {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            int ordinal = g_9.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        i2 = 2;
                    } else if (ordinal != 3) {
                        i2 = 4;
                        if (ordinal != 4) {
                            kfk.U().x(fHD.R, String.format("API version too low. Cannot convert network type value %s", g_9), new Throwable[0]);
                        }
                    } else {
                        i2 = 3;
                    }
                }
                i2 = 1;
            } else {
                i2 = 0;
            }
            extras.setRequiredNetworkType(i2);
        }
        if (!csc.f2443v) {
            extras.setBackoffCriteria(l3l.f5566e, l3l.v == 2 ? 0 : 1);
        }
        long max = Math.max(l3l.R() - System.currentTimeMillis(), 0L);
        int i3 = (max > 0 ? 1 : (max == 0 ? 0 : -1));
        if (i3 > 0) {
            extras.setMinimumLatency(max);
        } else if (!l3l.f5563R) {
            extras.setImportantWhileForeground(true);
        }
        if ((csc.f2440R.R.size() > 0 ? 1 : null) != null) {
            Iterator it = csc.f2440R.R.iterator();
            while (it.hasNext()) {
                pu6 pu6 = (pu6) it.next();
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(pu6.R, pu6.f7303R ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(csc.f2439R);
            extras.setTriggerContentMaxDelay(csc.v);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(csc.c);
        extras.setRequiresStorageNotLow(csc.e);
        Object[] objArr = l3l.R > 0 ? 1 : null;
        Object[] objArr2 = i3 > 0 ? 1 : null;
        if (l3l.f5563R && objArr == null && objArr2 == null) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        kfk U = kfk.U();
        String str = R;
        U.x(str, String.format("Scheduling work ID %s Job ID %s", l3l.f5562R, Integer.valueOf(i)), new Throwable[0]);
        try {
            if (this.f3782R.schedule(build) == 0) {
                kfk.U().g(str, String.format("Unable to schedule work ID %s", l3l.f5562R), new Throwable[0]);
                if (l3l.f5563R && l3l.c == 1) {
                    l3l.f5563R = false;
                    kfk.U().x(str, String.format("Scheduling a non-expedited job (work ID %s)", l3l.f5562R), new Throwable[0]);
                    c(l3l, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList v = v(this.f3783R, this.f3782R);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(v != null ? v.size() : 0), Integer.valueOf(this.f3785R.f4887R.N().O().size()), Integer.valueOf(this.f3785R.f4890R.c));
            kfk.U().H(R, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            kfk.U().H(R, String.format("Unable to schedule %s", l3l), th);
        }
    }

    @Override // defpackage.fjo
    public final boolean e() {
        return true;
    }
}
