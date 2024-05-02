package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* renamed from: dRx  reason: default package */
/* loaded from: classes.dex */
public final class dRx {
    public static final zI R = new zI("AssetPackStorage", 0);

    /* renamed from: R  reason: collision with other field name */
    public final Context f2609R;

    /* renamed from: R  reason: collision with other field name */
    public final chm f2610R;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        timeUnit.toMillis(14);
        timeUnit.toMillis(28);
    }

    public dRx(Context context, chm chm) {
        this.f2609R = context;
        this.f2610R = chm;
    }

    public static boolean L(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z &= L(file2);
            }
        }
        if (!file.delete()) {
            return false;
        }
        return z;
    }

    public static void O(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long v = v(file, false);
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (!file2.getName().equals(String.valueOf(v)) && !file2.getName().equals("stale.tmp")) {
                    L(file2);
                }
            }
        }
    }

    public static long v(File file, boolean z) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            R.x("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e) {
            R.Z(e, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    public final String C(String str) {
        int length;
        File file = new File(e(), str);
        if (!file.exists()) {
            R.X("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f2610R.R()));
        if (!file2.exists()) {
            R.X("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f2610R.R()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            R.X("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f2610R.R()));
            return null;
        } else if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        } else {
            R.L("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f2610R.R()));
            return null;
        }
    }

    public final File H(String str, int i, long j, String str2) {
        return new File(new File(new File(c(i, j, str), "_slices"), "_unverified"), str2);
    }

    public final HashMap N() {
        HashMap hashMap = new HashMap();
        Iterator it = X().iterator();
        while (it.hasNext()) {
            String name = ((File) it.next()).getName();
            int v = (int) v(new File(e(), name), true);
            long v2 = v(new File(new File(e(), name), String.valueOf(v)), true);
            if (x(v, v2, name).exists()) {
                hashMap.put(name, Long.valueOf(v2));
            }
        }
        return hashMap;
    }

    public final void R(int i, long j, String str) {
        File file = new File(e(), str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (!file2.getName().equals(String.valueOf(i)) && !file2.getName().equals("stale.tmp")) {
                    L(file2);
                } else if (file2.getName().equals(String.valueOf(i))) {
                    File[] listFiles2 = file2.listFiles();
                    for (File file3 : listFiles2) {
                        if (!file3.getName().equals(String.valueOf(j))) {
                            L(file3);
                        }
                    }
                }
            }
        }
    }

    public final File U(String str, int i, long j, String str2) {
        return new File(new File(new File(c(i, j, str), "_slices"), "_verified"), str2);
    }

    public final ArrayList X() {
        ArrayList arrayList = new ArrayList();
        try {
        } catch (IOException e) {
            R.L("Could not process directory while scanning installed packs. %s", e);
        }
        if (e().exists() && e().listFiles() != null) {
            File[] listFiles = e().listFiles();
            for (File file : listFiles) {
                if (!file.getCanonicalPath().equals(new File(e(), "_tmp").getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    public final int Z(int i, long j, String str) {
        File file = new File(new File(c(i, j, str), "_packs"), "merge.tmp");
        if (!file.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e) {
                    throw new bRU("Merge checkpoint file corrupt.", e);
                }
            } else {
                throw new bRU("Merge checkpoint file corrupt.");
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final File c(int i, long j, String str) {
        return new File(new File(new File(new File(e(), "_tmp"), str), String.valueOf(i)), String.valueOf(j));
    }

    public final File e() {
        return new File(this.f2609R.getFilesDir(), "assetpacks");
    }

    public final long m(String str) {
        return v(new File(new File(e(), str), String.valueOf((int) v(new File(e(), str), true))), true);
    }

    public final File x(int i, long j, String str) {
        return new File(new File(new File(e(), str), String.valueOf(i)), String.valueOf(j));
    }
}
