package defpackage;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* renamed from: aeR  reason: default package */
/* loaded from: classes.dex */
public abstract class aeR {
    public static final String R = kfk.P("WrkDbPathHelper");

    /* renamed from: R  reason: collision with other field name */
    public static final String[] f951R = {"-journal", "-shm", "-wal"};

    public static void R(Context context) {
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            kfk.U().x(R, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap hashMap = new HashMap();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            hashMap.put(databasePath, file);
            String[] strArr = f951R;
            for (String str : strArr) {
                hashMap.put(new File(databasePath.getPath() + str), new File(file.getPath() + str));
            }
            for (File file2 : hashMap.keySet()) {
                File file3 = (File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        kfk.U().g(R, String.format("Over-writing contents of %s", file3), new Throwable[0]);
                    }
                    kfk.U().x(R, file2.renameTo(file3) ? String.format("Migrated %s to %s", file2, file3) : String.format("Renaming %s to %s failed", file2, file3), new Throwable[0]);
                }
            }
        }
    }
}
