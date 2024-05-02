package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    public static final String R = kfk.P("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX INFO: finally extract failed */
    public static String Z(ndl ndl, ndl ndl2, CV cv, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l3L l3l = (l3L) it.next();
            nlH i = cv.i(l3l.f5562R);
            Integer num = null;
            if (i != null) {
                num = Integer.valueOf(i.R);
            }
            String str = l3l.f5562R;
            ndl.getClass();
            ma1 R2 = ma1.R(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                R2.Z(1);
            } else {
                R2.H(1, str);
            }
            ndl.f6495R.v();
            Cursor L = ndl.f6495R.L(R2);
            try {
                ArrayList arrayList2 = new ArrayList(L.getCount());
                while (L.moveToNext()) {
                    arrayList2.add(L.getString(0));
                }
                L.close();
                R2.C();
                sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", l3l.f5562R, l3l.f5569v, num, l3l.f5561R.name(), TextUtils.join(",", arrayList2), TextUtils.join(",", ndl2.c(l3l.f5562R))));
            } catch (Throwable th) {
                L.close();
                R2.C();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final n6o L() {
        ma1 ma1;
        Throwable th;
        CV cv;
        ndl ndl;
        ndl ndl2;
        int i;
        WorkDatabase workDatabase = jFe.R(((ListenableWorker) this).R).f4887R;
        ptn N = workDatabase.N();
        ndl U = workDatabase.U();
        ndl P = workDatabase.P();
        CV H = workDatabase.H();
        N.getClass();
        ma1 R2 = ma1.R(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        R2.O(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1), 1);
        ((msD) N.R).v();
        Cursor L = ((msD) N.R).L(R2);
        try {
            int U2 = dtx.U(L, "required_network_type");
            int U3 = dtx.U(L, "requires_charging");
            int U4 = dtx.U(L, "requires_device_idle");
            int U5 = dtx.U(L, "requires_battery_not_low");
            int U6 = dtx.U(L, "requires_storage_not_low");
            int U7 = dtx.U(L, "trigger_content_update_delay");
            int U8 = dtx.U(L, "trigger_max_content_delay");
            int U9 = dtx.U(L, "content_uri_triggers");
            int U10 = dtx.U(L, "id");
            int U11 = dtx.U(L, "state");
            int U12 = dtx.U(L, "worker_class_name");
            int U13 = dtx.U(L, "input_merger_class_name");
            int U14 = dtx.U(L, "input");
            int U15 = dtx.U(L, "output");
            ma1 = R2;
            try {
                int U16 = dtx.U(L, "initial_delay");
                int U17 = dtx.U(L, "interval_duration");
                int U18 = dtx.U(L, "flex_duration");
                int U19 = dtx.U(L, "run_attempt_count");
                int U20 = dtx.U(L, "backoff_policy");
                int U21 = dtx.U(L, "backoff_delay_duration");
                int U22 = dtx.U(L, "period_start_time");
                int U23 = dtx.U(L, "minimum_retention_duration");
                int U24 = dtx.U(L, "schedule_requested_at");
                int U25 = dtx.U(L, "run_in_foreground");
                int U26 = dtx.U(L, "out_of_quota_policy");
                ArrayList arrayList = new ArrayList(L.getCount());
                while (L.moveToNext()) {
                    String string = L.getString(U10);
                    String string2 = L.getString(U12);
                    csc csc = new csc();
                    csc.f2441R = iTI.N(L.getInt(U2));
                    csc.f2442R = L.getInt(U3) != 0;
                    csc.f2443v = L.getInt(U4) != 0;
                    csc.c = L.getInt(U5) != 0;
                    csc.e = L.getInt(U6) != 0;
                    csc.f2439R = L.getLong(U7);
                    csc.v = L.getLong(U8);
                    csc.f2440R = iTI.c(L.getBlob(U9));
                    l3L l3l = new l3L(string, string2);
                    l3l.f5561R = iTI.j(L.getInt(U11));
                    l3l.f5565c = L.getString(U13);
                    l3l.f5560R = g2m.R(L.getBlob(U14));
                    l3l.f5568v = g2m.R(L.getBlob(U15));
                    U15 = U15;
                    l3l.f5558R = L.getLong(U16);
                    l3l.f5567v = L.getLong(U17);
                    l3l.f5564c = L.getLong(U18);
                    l3l.R = L.getInt(U19);
                    l3l.v = iTI.C(L.getInt(U20));
                    U18 = U18;
                    l3l.f5566e = L.getLong(U21);
                    l3l.X = L.getLong(U22);
                    U22 = U22;
                    l3l.O = L.getLong(U23);
                    l3l.L = L.getLong(U24);
                    l3l.f5563R = L.getInt(U25) != 0;
                    l3l.c = iTI.P(L.getInt(U26));
                    l3l.f5559R = csc;
                    arrayList.add(l3l);
                    U26 = U26;
                    U14 = U14;
                    U3 = U3;
                    U17 = U17;
                    U19 = U19;
                    U24 = U24;
                    U25 = U25;
                    U23 = U23;
                    U16 = U16;
                    U13 = U13;
                    U4 = U4;
                    U2 = U2;
                    arrayList = arrayList;
                    U12 = U12;
                    U21 = U21;
                    U11 = U11;
                    U20 = U20;
                }
                L.close();
                ma1.C();
                ArrayList X = N.X();
                ArrayList c = N.c();
                if (!arrayList.isEmpty()) {
                    kfk U27 = kfk.U();
                    String str = R;
                    i = 0;
                    U27.C(str, "Recently completed work:\n\n", new Throwable[0]);
                    cv = H;
                    ndl2 = U;
                    ndl = P;
                    kfk.U().C(str, Z(ndl2, ndl, cv, arrayList), new Throwable[0]);
                } else {
                    cv = H;
                    ndl2 = U;
                    ndl = P;
                    i = 0;
                }
                if (!X.isEmpty()) {
                    kfk U28 = kfk.U();
                    String str2 = R;
                    U28.C(str2, "Running work:\n\n", new Throwable[i]);
                    kfk.U().C(str2, Z(ndl2, ndl, cv, X), new Throwable[i]);
                }
                if (!c.isEmpty()) {
                    kfk U29 = kfk.U();
                    String str3 = R;
                    U29.C(str3, "Enqueued work:\n\n", new Throwable[i]);
                    kfk.U().C(str3, Z(ndl2, ndl, cv, c), new Throwable[i]);
                }
                return new n6o(g2m.R);
            } catch (Throwable th2) {
                th = th2;
                L.close();
                ma1.C();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            ma1 = R2;
        }
    }
}
