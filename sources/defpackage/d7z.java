package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: d7z  reason: default package */
/* loaded from: classes.dex */
public final class d7z implements Runnable {

    /* renamed from: R  reason: collision with other field name */
    public final Context f2505R;

    /* renamed from: R  reason: collision with other field name */
    public final jFe f2506R;
    public int e = 0;

    /* renamed from: R  reason: collision with other field name */
    public static final String f2504R = kfk.P("ForceStopRunnable");
    public static final long R = TimeUnit.DAYS.toMillis(3650);

    public d7z(Context context, jFe jfe) {
        this.f2505R = context.getApplicationContext();
        this.f2506R = jfe;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0092 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x008e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R() {
        /*
        // Method dump skipped, instructions count: 550
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d7z.R():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (v()) {
                while (true) {
                    aeR.R(this.f2505R);
                    kfk.U().x(f2504R, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        R();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                        int i = this.e + 1;
                        this.e = i;
                        if (i < 3) {
                            kfk.U().x(f2504R, String.format("Retrying after %s", Long.valueOf(((long) i) * 300)), e);
                            try {
                                Thread.sleep(((long) this.e) * 300);
                            } catch (InterruptedException unused) {
                            }
                        } else {
                            kfk.U().H(f2504R, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            this.f2506R.f4890R.getClass();
                            throw illegalStateException;
                        }
                    }
                }
            }
        } finally {
            this.f2506R.c();
        }
    }

    public final boolean v() {
        l_s l_s = this.f2506R.f4890R;
        l_s.getClass();
        if (TextUtils.isEmpty(null)) {
            kfk.U().x(f2504R, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean R2 = j9n.R(this.f2505R, l_s);
        kfk.U().x(f2504R, String.format("Is default app process = %s", Boolean.valueOf(R2)), new Throwable[0]);
        return R2;
    }
}
