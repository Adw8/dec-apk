package defpackage;

import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: ptn  reason: default package */
/* loaded from: classes.dex */
public final class ptn implements hKX {
    public final Object L;
    public final Object O;
    public final Object R;
    public final Object X;
    public final Object Z;
    public final Object c;
    public final Object e;
    public final Object m;
    public final Object v;
    public final Object x;

    public /* synthetic */ ptn(hKX hkx, j58 j58, j58 j582, hKX hkx2, hKX hkx3, hKX hkx4, hKX hkx5, hKX hkx6, hKX hkx7, hKX hkx8) {
        this.R = hkx;
        this.v = j58;
        this.c = j582;
        this.e = hkx2;
        this.X = hkx3;
        this.O = hkx4;
        this.L = hkx5;
        this.Z = hkx6;
        this.m = hkx7;
        this.x = hkx8;
    }

    public /* synthetic */ ptn(msD msd) {
        this.R = msd;
        this.v = new jAB(this, msd, 5);
        this.c = new mit(msd, 0);
        this.e = new mit(msd, 1);
        this.X = new mit(msd, 2);
        this.O = new mit(msd, 3);
        this.L = new mit(msd, 4);
        this.Z = new mit(msd, 5);
        this.m = new mit(msd, 6);
        this.x = new mit(msd, 7);
    }

    public final void C(String str, long j) {
        ((msD) this.R).v();
        mVu R = ((k87) this.Z).R();
        R.X(j, 1);
        if (str == null) {
            R.O(2);
        } else {
            R.Z(2, str);
        }
        ((msD) this.R).c();
        try {
            R.H();
            ((msD) this.R).Z();
        } finally {
            ((msD) this.R).O();
            ((k87) this.Z).c(R);
        }
    }

    public final boolean H() {
        boolean z = false;
        ma1 R = ma1.R(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        ((msD) this.R).v();
        Cursor L = ((msD) this.R).L(R);
        try {
            if (L.moveToFirst()) {
                if (L.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            L.close();
            R.C();
        }
    }

    public final gDn L(String str) {
        ma1 R = ma1.R(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            R.Z(1);
        } else {
            R.H(1, str);
        }
        ((msD) this.R).v();
        gDn gdn = null;
        Cursor L = ((msD) this.R).L(R);
        try {
            if (L.moveToFirst()) {
                gdn = iTI.j(L.getInt(0));
            }
            return gdn;
        } finally {
            L.close();
            R.C();
        }
    }

    public final void N(String str) {
        ((msD) this.R).v();
        mVu R = ((k87) this.L).R();
        if (str == null) {
            R.O(1);
        } else {
            R.Z(1, str);
        }
        ((msD) this.R).c();
        try {
            R.H();
            ((msD) this.R).Z();
        } finally {
            ((msD) this.R).O();
            ((k87) this.L).c(R);
        }
    }

    public final ArrayList O() {
        ma1 ma1;
        Throwable th;
        int U;
        int U2;
        int U3;
        int U4;
        int U5;
        int U6;
        int U7;
        int U8;
        int U9;
        int U10;
        int U11;
        int U12;
        int U13;
        int U14;
        ma1 R = ma1.R(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        ((msD) this.R).v();
        Cursor L = ((msD) this.R).L(R);
        try {
            U = dtx.U(L, "required_network_type");
            U2 = dtx.U(L, "requires_charging");
            U3 = dtx.U(L, "requires_device_idle");
            U4 = dtx.U(L, "requires_battery_not_low");
            U5 = dtx.U(L, "requires_storage_not_low");
            U6 = dtx.U(L, "trigger_content_update_delay");
            U7 = dtx.U(L, "trigger_max_content_delay");
            U8 = dtx.U(L, "content_uri_triggers");
            U9 = dtx.U(L, "id");
            U10 = dtx.U(L, "state");
            U11 = dtx.U(L, "worker_class_name");
            U12 = dtx.U(L, "input_merger_class_name");
            U13 = dtx.U(L, "input");
            U14 = dtx.U(L, "output");
            ma1 = R;
        } catch (Throwable th2) {
            th = th2;
            ma1 = R;
        }
        try {
            int U15 = dtx.U(L, "initial_delay");
            int U16 = dtx.U(L, "interval_duration");
            int U17 = dtx.U(L, "flex_duration");
            int U18 = dtx.U(L, "run_attempt_count");
            int U19 = dtx.U(L, "backoff_policy");
            int U20 = dtx.U(L, "backoff_delay_duration");
            int U21 = dtx.U(L, "period_start_time");
            int U22 = dtx.U(L, "minimum_retention_duration");
            int U23 = dtx.U(L, "schedule_requested_at");
            int U24 = dtx.U(L, "run_in_foreground");
            int U25 = dtx.U(L, "out_of_quota_policy");
            ArrayList arrayList = new ArrayList(L.getCount());
            while (L.moveToNext()) {
                String string = L.getString(U9);
                String string2 = L.getString(U11);
                csc csc = new csc();
                csc.f2441R = iTI.N(L.getInt(U));
                csc.f2442R = L.getInt(U2) != 0;
                csc.f2443v = L.getInt(U3) != 0;
                csc.c = L.getInt(U4) != 0;
                csc.e = L.getInt(U5) != 0;
                csc.f2439R = L.getLong(U6);
                csc.v = L.getLong(U7);
                csc.f2440R = iTI.c(L.getBlob(U8));
                l3L l3l = new l3L(string, string2);
                l3l.f5561R = iTI.j(L.getInt(U10));
                l3l.f5565c = L.getString(U12);
                l3l.f5560R = g2m.R(L.getBlob(U13));
                l3l.f5568v = g2m.R(L.getBlob(U14));
                U14 = U14;
                l3l.f5558R = L.getLong(U15);
                l3l.f5567v = L.getLong(U16);
                U16 = U16;
                l3l.f5564c = L.getLong(U17);
                l3l.R = L.getInt(U18);
                U18 = U18;
                l3l.v = iTI.C(L.getInt(U19));
                U17 = U17;
                l3l.f5566e = L.getLong(U20);
                U20 = U20;
                l3l.X = L.getLong(U21);
                U21 = U21;
                l3l.O = L.getLong(U22);
                U22 = U22;
                l3l.L = L.getLong(U23);
                l3l.f5563R = L.getInt(U24) != 0;
                U24 = U24;
                l3l.c = iTI.P(L.getInt(U25));
                l3l.f5559R = csc;
                arrayList.add(l3l);
                U2 = U2;
                U25 = U25;
                U23 = U23;
                U15 = U15;
                U9 = U9;
                U11 = U11;
                U = U;
                U3 = U3;
                U19 = U19;
                U4 = U4;
            }
            L.close();
            ma1.C();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            L.close();
            ma1.C();
            throw th;
        }
    }

    public final void P(String str, g2m g2m) {
        ((msD) this.R).v();
        mVu R = ((k87) this.e).R();
        byte[] v = g2m.v(g2m);
        if (v == null) {
            R.O(1);
        } else {
            R.R(1, v);
        }
        if (str == null) {
            R.O(2);
        } else {
            R.Z(2, str);
        }
        ((msD) this.R).c();
        try {
            R.H();
            ((msD) this.R).Z();
        } finally {
            ((msD) this.R).O();
            ((k87) this.e).c(R);
        }
    }

    @Override // defpackage.hKX
    public final /* bridge */ /* synthetic */ Object R() {
        Object R = ((hKX) this.R).R();
        imF v = kIP.v((hKX) this.v);
        Object R2 = ((hKX) this.c).R();
        bTK btk = (bTK) ((hKX) this.e).R();
        Object R3 = ((hKX) this.X).R();
        Object R4 = ((hKX) this.O).R();
        Object R5 = ((hKX) this.L).R();
        imF v2 = kIP.v((hKX) this.Z);
        bu3 bu3 = (bu3) ((hKX) this.m).R();
        nt4 nt4 = (nt4) R3;
        gMW gmw = (gMW) R4;
        gkF gkf = (gkF) R5;
        n2N n2n = (n2N) ((hKX) this.x).R();
        return new j5V((dRx) R, v, (e4X) R2, v2);
    }

    public final void U(String str) {
        ((msD) this.R).v();
        mVu R = ((k87) this.O).R();
        if (str == null) {
            R.O(1);
        } else {
            R.Z(1, str);
        }
        ((msD) this.R).c();
        try {
            R.H();
            ((msD) this.R).Z();
        } finally {
            ((msD) this.R).O();
            ((k87) this.O).c(R);
        }
    }

    public final ArrayList X() {
        ma1 ma1;
        Throwable th;
        int U;
        int U2;
        int U3;
        int U4;
        int U5;
        int U6;
        int U7;
        int U8;
        int U9;
        int U10;
        int U11;
        int U12;
        int U13;
        int U14;
        ma1 R = ma1.R(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        ((msD) this.R).v();
        Cursor L = ((msD) this.R).L(R);
        try {
            U = dtx.U(L, "required_network_type");
            U2 = dtx.U(L, "requires_charging");
            U3 = dtx.U(L, "requires_device_idle");
            U4 = dtx.U(L, "requires_battery_not_low");
            U5 = dtx.U(L, "requires_storage_not_low");
            U6 = dtx.U(L, "trigger_content_update_delay");
            U7 = dtx.U(L, "trigger_max_content_delay");
            U8 = dtx.U(L, "content_uri_triggers");
            U9 = dtx.U(L, "id");
            U10 = dtx.U(L, "state");
            U11 = dtx.U(L, "worker_class_name");
            U12 = dtx.U(L, "input_merger_class_name");
            U13 = dtx.U(L, "input");
            U14 = dtx.U(L, "output");
            ma1 = R;
        } catch (Throwable th2) {
            th = th2;
            ma1 = R;
        }
        try {
            int U15 = dtx.U(L, "initial_delay");
            int U16 = dtx.U(L, "interval_duration");
            int U17 = dtx.U(L, "flex_duration");
            int U18 = dtx.U(L, "run_attempt_count");
            int U19 = dtx.U(L, "backoff_policy");
            int U20 = dtx.U(L, "backoff_delay_duration");
            int U21 = dtx.U(L, "period_start_time");
            int U22 = dtx.U(L, "minimum_retention_duration");
            int U23 = dtx.U(L, "schedule_requested_at");
            int U24 = dtx.U(L, "run_in_foreground");
            int U25 = dtx.U(L, "out_of_quota_policy");
            ArrayList arrayList = new ArrayList(L.getCount());
            while (L.moveToNext()) {
                String string = L.getString(U9);
                String string2 = L.getString(U11);
                csc csc = new csc();
                csc.f2441R = iTI.N(L.getInt(U));
                csc.f2442R = L.getInt(U2) != 0;
                csc.f2443v = L.getInt(U3) != 0;
                csc.c = L.getInt(U4) != 0;
                csc.e = L.getInt(U5) != 0;
                csc.f2439R = L.getLong(U6);
                csc.v = L.getLong(U7);
                csc.f2440R = iTI.c(L.getBlob(U8));
                l3L l3l = new l3L(string, string2);
                l3l.f5561R = iTI.j(L.getInt(U10));
                l3l.f5565c = L.getString(U12);
                l3l.f5560R = g2m.R(L.getBlob(U13));
                l3l.f5568v = g2m.R(L.getBlob(U14));
                U14 = U14;
                l3l.f5558R = L.getLong(U15);
                l3l.f5567v = L.getLong(U16);
                U16 = U16;
                l3l.f5564c = L.getLong(U17);
                l3l.R = L.getInt(U18);
                U18 = U18;
                l3l.v = iTI.C(L.getInt(U19));
                U17 = U17;
                l3l.f5566e = L.getLong(U20);
                U20 = U20;
                l3l.X = L.getLong(U21);
                U21 = U21;
                l3l.O = L.getLong(U22);
                U22 = U22;
                l3l.L = L.getLong(U23);
                l3l.f5563R = L.getInt(U24) != 0;
                U24 = U24;
                l3l.c = iTI.P(L.getInt(U25));
                l3l.f5559R = csc;
                arrayList.add(l3l);
                U2 = U2;
                U25 = U25;
                U23 = U23;
                U15 = U15;
                U9 = U9;
                U11 = U11;
                U = U;
                U3 = U3;
                U19 = U19;
                U4 = U4;
            }
            L.close();
            ma1.C();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            L.close();
            ma1.C();
            throw th;
        }
    }

    public final ArrayList Z(String str) {
        ma1 R = ma1.R(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            R.Z(1);
        } else {
            R.H(1, str);
        }
        ((msD) this.R).v();
        Cursor L = ((msD) this.R).L(R);
        try {
            ArrayList arrayList = new ArrayList(L.getCount());
            while (L.moveToNext()) {
                arrayList.add(L.getString(0));
            }
            return arrayList;
        } finally {
            L.close();
            R.C();
        }
    }

    public final ArrayList c() {
        ma1 ma1;
        Throwable th;
        ma1 R = ma1.R(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        R.O((long) 200, 1);
        ((msD) this.R).v();
        Cursor L = ((msD) this.R).L(R);
        try {
            int U = dtx.U(L, "required_network_type");
            int U2 = dtx.U(L, "requires_charging");
            int U3 = dtx.U(L, "requires_device_idle");
            int U4 = dtx.U(L, "requires_battery_not_low");
            int U5 = dtx.U(L, "requires_storage_not_low");
            int U6 = dtx.U(L, "trigger_content_update_delay");
            int U7 = dtx.U(L, "trigger_max_content_delay");
            int U8 = dtx.U(L, "content_uri_triggers");
            int U9 = dtx.U(L, "id");
            int U10 = dtx.U(L, "state");
            int U11 = dtx.U(L, "worker_class_name");
            int U12 = dtx.U(L, "input_merger_class_name");
            int U13 = dtx.U(L, "input");
            int U14 = dtx.U(L, "output");
            ma1 = R;
            try {
                int U15 = dtx.U(L, "initial_delay");
                int U16 = dtx.U(L, "interval_duration");
                int U17 = dtx.U(L, "flex_duration");
                int U18 = dtx.U(L, "run_attempt_count");
                int U19 = dtx.U(L, "backoff_policy");
                int U20 = dtx.U(L, "backoff_delay_duration");
                int U21 = dtx.U(L, "period_start_time");
                int U22 = dtx.U(L, "minimum_retention_duration");
                int U23 = dtx.U(L, "schedule_requested_at");
                int U24 = dtx.U(L, "run_in_foreground");
                int U25 = dtx.U(L, "out_of_quota_policy");
                ArrayList arrayList = new ArrayList(L.getCount());
                while (L.moveToNext()) {
                    String string = L.getString(U9);
                    String string2 = L.getString(U11);
                    csc csc = new csc();
                    csc.f2441R = iTI.N(L.getInt(U));
                    csc.f2442R = L.getInt(U2) != 0;
                    csc.f2443v = L.getInt(U3) != 0;
                    csc.c = L.getInt(U4) != 0;
                    csc.e = L.getInt(U5) != 0;
                    csc.f2439R = L.getLong(U6);
                    csc.v = L.getLong(U7);
                    csc.f2440R = iTI.c(L.getBlob(U8));
                    l3L l3l = new l3L(string, string2);
                    l3l.f5561R = iTI.j(L.getInt(U10));
                    l3l.f5565c = L.getString(U12);
                    l3l.f5560R = g2m.R(L.getBlob(U13));
                    l3l.f5568v = g2m.R(L.getBlob(U14));
                    U14 = U14;
                    l3l.f5558R = L.getLong(U15);
                    l3l.f5567v = L.getLong(U16);
                    U16 = U16;
                    l3l.f5564c = L.getLong(U17);
                    l3l.R = L.getInt(U18);
                    U18 = U18;
                    l3l.v = iTI.C(L.getInt(U19));
                    U17 = U17;
                    l3l.f5566e = L.getLong(U20);
                    U20 = U20;
                    l3l.X = L.getLong(U21);
                    U21 = U21;
                    l3l.O = L.getLong(U22);
                    U22 = U22;
                    l3l.L = L.getLong(U23);
                    l3l.f5563R = L.getInt(U24) != 0;
                    U24 = U24;
                    l3l.c = iTI.P(L.getInt(U25));
                    l3l.f5559R = csc;
                    arrayList.add(l3l);
                    U2 = U2;
                    U25 = U25;
                    U23 = U23;
                    U15 = U15;
                    U9 = U9;
                    U11 = U11;
                    U = U;
                    U3 = U3;
                    U19 = U19;
                    U4 = U4;
                }
                L.close();
                ma1.C();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                L.close();
                ma1.C();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            ma1 = R;
        }
    }

    public final ArrayList e(int i) {
        ma1 ma1;
        Throwable th;
        ma1 R = ma1.R(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        R.O((long) i, 1);
        ((msD) this.R).v();
        Cursor L = ((msD) this.R).L(R);
        try {
            int U = dtx.U(L, "required_network_type");
            int U2 = dtx.U(L, "requires_charging");
            int U3 = dtx.U(L, "requires_device_idle");
            int U4 = dtx.U(L, "requires_battery_not_low");
            int U5 = dtx.U(L, "requires_storage_not_low");
            int U6 = dtx.U(L, "trigger_content_update_delay");
            int U7 = dtx.U(L, "trigger_max_content_delay");
            int U8 = dtx.U(L, "content_uri_triggers");
            int U9 = dtx.U(L, "id");
            int U10 = dtx.U(L, "state");
            int U11 = dtx.U(L, "worker_class_name");
            int U12 = dtx.U(L, "input_merger_class_name");
            int U13 = dtx.U(L, "input");
            int U14 = dtx.U(L, "output");
            ma1 = R;
            try {
                int U15 = dtx.U(L, "initial_delay");
                int U16 = dtx.U(L, "interval_duration");
                int U17 = dtx.U(L, "flex_duration");
                int U18 = dtx.U(L, "run_attempt_count");
                int U19 = dtx.U(L, "backoff_policy");
                int U20 = dtx.U(L, "backoff_delay_duration");
                int U21 = dtx.U(L, "period_start_time");
                int U22 = dtx.U(L, "minimum_retention_duration");
                int U23 = dtx.U(L, "schedule_requested_at");
                int U24 = dtx.U(L, "run_in_foreground");
                int U25 = dtx.U(L, "out_of_quota_policy");
                ArrayList arrayList = new ArrayList(L.getCount());
                while (L.moveToNext()) {
                    String string = L.getString(U9);
                    String string2 = L.getString(U11);
                    csc csc = new csc();
                    csc.f2441R = iTI.N(L.getInt(U));
                    csc.f2442R = L.getInt(U2) != 0;
                    csc.f2443v = L.getInt(U3) != 0;
                    csc.c = L.getInt(U4) != 0;
                    csc.e = L.getInt(U5) != 0;
                    csc.f2439R = L.getLong(U6);
                    csc.v = L.getLong(U7);
                    csc.f2440R = iTI.c(L.getBlob(U8));
                    l3L l3l = new l3L(string, string2);
                    l3l.f5561R = iTI.j(L.getInt(U10));
                    l3l.f5565c = L.getString(U12);
                    l3l.f5560R = g2m.R(L.getBlob(U13));
                    l3l.f5568v = g2m.R(L.getBlob(U14));
                    U14 = U14;
                    l3l.f5558R = L.getLong(U15);
                    l3l.f5567v = L.getLong(U16);
                    l3l.f5564c = L.getLong(U17);
                    l3l.R = L.getInt(U18);
                    U18 = U18;
                    l3l.v = iTI.C(L.getInt(U19));
                    U17 = U17;
                    l3l.f5566e = L.getLong(U20);
                    U20 = U20;
                    l3l.X = L.getLong(U21);
                    U21 = U21;
                    l3l.O = L.getLong(U22);
                    U22 = U22;
                    l3l.L = L.getLong(U23);
                    l3l.f5563R = L.getInt(U24) != 0;
                    U24 = U24;
                    l3l.c = iTI.P(L.getInt(U25));
                    l3l.f5559R = csc;
                    arrayList.add(l3l);
                    U2 = U2;
                    U25 = U25;
                    U23 = U23;
                    U15 = U15;
                    U9 = U9;
                    U11 = U11;
                    U = U;
                    U3 = U3;
                    U4 = U4;
                    U16 = U16;
                    U19 = U19;
                }
                L.close();
                ma1.C();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                L.close();
                ma1.C();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            ma1 = R;
        }
    }

    public final void g(gDn gdn, String... strArr) {
        ((msD) this.R).v();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append("?");
            if (i < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String sb2 = sb.toString();
        msD msd = (msD) this.R;
        msd.R();
        msd.v();
        mVu mvu = new mVu(((iUj) msd.f6207R.L()).f4620R.compileStatement(sb2));
        mvu.X((long) iTI.K(gdn), 1);
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                mvu.O(i2);
            } else {
                mvu.Z(i2, str);
            }
            i2++;
        }
        ((msD) this.R).c();
        try {
            mvu.H();
            ((msD) this.R).Z();
        } finally {
            ((msD) this.R).O();
        }
    }

    public final void j(String str, long j) {
        ((msD) this.R).v();
        mVu R = ((k87) this.X).R();
        R.X(j, 1);
        if (str == null) {
            R.O(2);
        } else {
            R.Z(2, str);
        }
        ((msD) this.R).c();
        try {
            R.H();
            ((msD) this.R).Z();
        } finally {
            ((msD) this.R).O();
            ((k87) this.X).c(R);
        }
    }

    public final l3L m(String str) {
        ma1 ma1;
        Throwable th;
        l3L l3l;
        ma1 R = ma1.R(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            R.Z(1);
        } else {
            R.H(1, str);
        }
        ((msD) this.R).v();
        Cursor L = ((msD) this.R).L(R);
        try {
            int U = dtx.U(L, "required_network_type");
            int U2 = dtx.U(L, "requires_charging");
            int U3 = dtx.U(L, "requires_device_idle");
            int U4 = dtx.U(L, "requires_battery_not_low");
            int U5 = dtx.U(L, "requires_storage_not_low");
            int U6 = dtx.U(L, "trigger_content_update_delay");
            int U7 = dtx.U(L, "trigger_max_content_delay");
            int U8 = dtx.U(L, "content_uri_triggers");
            int U9 = dtx.U(L, "id");
            int U10 = dtx.U(L, "state");
            int U11 = dtx.U(L, "worker_class_name");
            int U12 = dtx.U(L, "input_merger_class_name");
            int U13 = dtx.U(L, "input");
            int U14 = dtx.U(L, "output");
            ma1 = R;
            try {
                int U15 = dtx.U(L, "initial_delay");
                int U16 = dtx.U(L, "interval_duration");
                int U17 = dtx.U(L, "flex_duration");
                int U18 = dtx.U(L, "run_attempt_count");
                int U19 = dtx.U(L, "backoff_policy");
                int U20 = dtx.U(L, "backoff_delay_duration");
                int U21 = dtx.U(L, "period_start_time");
                int U22 = dtx.U(L, "minimum_retention_duration");
                int U23 = dtx.U(L, "schedule_requested_at");
                int U24 = dtx.U(L, "run_in_foreground");
                int U25 = dtx.U(L, "out_of_quota_policy");
                if (L.moveToFirst()) {
                    String string = L.getString(U9);
                    String string2 = L.getString(U11);
                    csc csc = new csc();
                    csc.f2441R = iTI.N(L.getInt(U));
                    csc.f2442R = L.getInt(U2) != 0;
                    csc.f2443v = L.getInt(U3) != 0;
                    csc.c = L.getInt(U4) != 0;
                    csc.e = L.getInt(U5) != 0;
                    csc.f2439R = L.getLong(U6);
                    csc.v = L.getLong(U7);
                    csc.f2440R = iTI.c(L.getBlob(U8));
                    l3l = new l3L(string, string2);
                    l3l.f5561R = iTI.j(L.getInt(U10));
                    l3l.f5565c = L.getString(U12);
                    l3l.f5560R = g2m.R(L.getBlob(U13));
                    l3l.f5568v = g2m.R(L.getBlob(U14));
                    l3l.f5558R = L.getLong(U15);
                    l3l.f5567v = L.getLong(U16);
                    l3l.f5564c = L.getLong(U17);
                    l3l.R = L.getInt(U18);
                    l3l.v = iTI.C(L.getInt(U19));
                    l3l.f5566e = L.getLong(U20);
                    l3l.X = L.getLong(U21);
                    l3l.O = L.getLong(U22);
                    l3l.L = L.getLong(U23);
                    l3l.f5563R = L.getInt(U24) != 0;
                    l3l.c = iTI.P(L.getInt(U25));
                    l3l.f5559R = csc;
                } else {
                    l3l = null;
                }
                L.close();
                ma1.C();
                return l3l;
            } catch (Throwable th2) {
                th = th2;
                L.close();
                ma1.C();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            ma1 = R;
        }
    }

    public final void v(String str) {
        ((msD) this.R).v();
        mVu R = ((k87) this.c).R();
        if (str == null) {
            R.O(1);
        } else {
            R.Z(1, str);
        }
        ((msD) this.R).c();
        try {
            R.H();
            ((msD) this.R).Z();
        } finally {
            ((msD) this.R).O();
            ((k87) this.c).c(R);
        }
    }

    public final ArrayList x(String str) {
        ma1 R = ma1.R(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            R.Z(1);
        } else {
            R.H(1, str);
        }
        ((msD) this.R).v();
        Cursor L = ((msD) this.R).L(R);
        try {
            int U = dtx.U(L, "id");
            int U2 = dtx.U(L, "state");
            ArrayList arrayList = new ArrayList(L.getCount());
            while (L.moveToNext()) {
                pv8 pv8 = new pv8();
                pv8.f7313R = L.getString(U);
                pv8.R = iTI.j(L.getInt(U2));
                arrayList.add(pv8);
            }
            return arrayList;
        } finally {
            L.close();
            R.C();
        }
    }
}
