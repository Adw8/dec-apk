package defpackage;

import android.view.View;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: c85  reason: default package */
/* loaded from: classes.dex */
public final class c85 implements RL {
    public Object R;
    public final int e;

    public c85(WorkDatabase_Impl workDatabase_Impl) {
        this.R = workDatabase_Impl;
        this.e = 12;
    }

    public static void R(iUj iuj) {
        iuj.X("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        iuj.X("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        iuj.X("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        iuj.X("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        iuj.X("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        iuj.X("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        iuj.X("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        iuj.X("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        iuj.X("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        iuj.X("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        iuj.X("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        iuj.X("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        iuj.X("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        iuj.X("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        iuj.X("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static lTo v(iUj iuj) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new kMM("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap.put("prerequisite_id", new kMM("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new fIC("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new fIC("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new iR5("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
        hashSet2.add(new iR5("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
        imc imc = new imc("Dependency", hashMap, hashSet, hashSet2);
        imc R = imc.R(iuj, "Dependency");
        if (!imc.equals(R)) {
            return new lTo("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + imc + "\n Found:\n" + R, false);
        }
        HashMap hashMap2 = new HashMap(25);
        hashMap2.put("id", new kMM("id", "TEXT", true, 1, null, 1));
        hashMap2.put("state", new kMM("state", "INTEGER", true, 0, null, 1));
        hashMap2.put("worker_class_name", new kMM("worker_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input_merger_class_name", new kMM("input_merger_class_name", "TEXT", false, 0, null, 1));
        hashMap2.put("input", new kMM("input", "BLOB", true, 0, null, 1));
        hashMap2.put("output", new kMM("output", "BLOB", true, 0, null, 1));
        hashMap2.put("initial_delay", new kMM("initial_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("interval_duration", new kMM("interval_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("flex_duration", new kMM("flex_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_attempt_count", new kMM("run_attempt_count", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_policy", new kMM("backoff_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_delay_duration", new kMM("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("period_start_time", new kMM("period_start_time", "INTEGER", true, 0, null, 1));
        hashMap2.put("minimum_retention_duration", new kMM("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("schedule_requested_at", new kMM("schedule_requested_at", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_in_foreground", new kMM("run_in_foreground", "INTEGER", true, 0, null, 1));
        hashMap2.put("out_of_quota_policy", new kMM("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("required_network_type", new kMM("required_network_type", "INTEGER", false, 0, null, 1));
        hashMap2.put("requires_charging", new kMM("requires_charging", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_device_idle", new kMM("requires_device_idle", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_battery_not_low", new kMM("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_storage_not_low", new kMM("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_content_update_delay", new kMM("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_max_content_delay", new kMM("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("content_uri_triggers", new kMM("content_uri_triggers", "BLOB", false, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new iR5("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
        hashSet4.add(new iR5("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
        imc imc2 = new imc("WorkSpec", hashMap2, hashSet3, hashSet4);
        imc R2 = imc.R(iuj, "WorkSpec");
        if (!imc2.equals(R2)) {
            return new lTo("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + imc2 + "\n Found:\n" + R2, false);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new kMM("tag", "TEXT", true, 1, null, 1));
        hashMap3.put("work_spec_id", new kMM("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new fIC("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new iR5("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
        imc imc3 = new imc("WorkTag", hashMap3, hashSet5, hashSet6);
        imc R3 = imc.R(iuj, "WorkTag");
        if (!imc3.equals(R3)) {
            return new lTo("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + imc3 + "\n Found:\n" + R3, false);
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("work_spec_id", new kMM("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap4.put("system_id", new kMM("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new fIC("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        imc imc4 = new imc("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        imc R4 = imc.R(iuj, "SystemIdInfo");
        if (!imc4.equals(R4)) {
            return new lTo("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + imc4 + "\n Found:\n" + R4, false);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new kMM("name", "TEXT", true, 1, null, 1));
        hashMap5.put("work_spec_id", new kMM("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new fIC("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new iR5("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
        imc imc5 = new imc("WorkName", hashMap5, hashSet8, hashSet9);
        imc R5 = imc.R(iuj, "WorkName");
        if (!imc5.equals(R5)) {
            return new lTo("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + imc5 + "\n Found:\n" + R5, false);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new kMM("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap6.put("progress", new kMM("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new fIC("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        imc imc6 = new imc("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        imc R6 = imc.R(iuj, "WorkProgress");
        if (!imc6.equals(R6)) {
            return new lTo("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + imc6 + "\n Found:\n" + R6, false);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new kMM("key", "TEXT", true, 1, null, 1));
        hashMap7.put("long_value", new kMM("long_value", "INTEGER", false, 0, null, 1));
        imc imc7 = new imc("Preference", hashMap7, new HashSet(0), new HashSet(0));
        imc R7 = imc.R(iuj, "Preference");
        if (imc7.equals(R7)) {
            return new lTo((String) null, true);
        }
        return new lTo("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + imc7 + "\n Found:\n" + R7, false);
    }

    @Override // defpackage.RL
    public final boolean c(View view) {
        ((BottomSheetBehavior) this.R).I(this.e);
        return true;
    }

    public final float e(c85 c85) {
        int i = this.e;
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += ((Float[]) c85.R)[i2].floatValue() * ((Float[]) this.R)[i2].floatValue();
        }
        return f;
    }

    public /* synthetic */ c85(pgk pgk, int i) {
        this.R = pgk;
        this.e = i;
    }

    public /* synthetic */ c85(int i, ec7[] ec7Arr) {
        this.e = i;
        this.R = ec7Arr;
    }

    public c85(int i, int i2) {
        if (i2 != 5) {
            this.e = i;
            Float[] fArr = new Float[i];
            for (int i3 = 0; i3 < i; i3++) {
                fArr[i3] = Float.valueOf(0.0f);
            }
            this.R = fArr;
            return;
        }
        this.R = new HashSet();
        this.e = i;
    }

    public /* synthetic */ c85(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.R = bottomSheetBehavior;
        this.e = i;
    }
}
