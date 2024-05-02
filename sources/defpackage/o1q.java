package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: o1q  reason: default package */
/* loaded from: classes.dex */
public final class o1q extends hZE {
    public final Context R;
    public final /* synthetic */ int c = 1;

    public o1q(Context context, int i, int i2) {
        super(i, i2);
        this.R = context;
    }

    @Override // defpackage.hZE
    public final void R(iUj iuj) {
        switch (this.c) {
            case 0:
                if (this.v >= 10) {
                    iuj.f4620R.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.R.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                iuj.X("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = this.R.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = 0;
                    long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
                    if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                        j = 1;
                    }
                    iuj.R();
                    try {
                        iuj.f4620R.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                        iuj.f4620R.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                        sharedPreferences.edit().clear().apply();
                        iuj.H();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = this.R.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    iuj.R();
                    try {
                        iuj.f4620R.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        iuj.f4620R.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                        sharedPreferences2.edit().clear().apply();
                        iuj.H();
                        return;
                    } finally {
                    }
                } else {
                    return;
                }
        }
    }

    public o1q(Context context) {
        super(9, 10);
        this.R = context;
    }
}
