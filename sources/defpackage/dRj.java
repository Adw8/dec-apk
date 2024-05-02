package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: dRj  reason: default package */
/* loaded from: classes.dex */
public final class dRj {
    public static final zI R = new zI("MergeSliceTaskHandler", 0);

    /* renamed from: R  reason: collision with other field name */
    public final dRx f2608R;

    public dRj(dRx drx) {
        this.f2608R = drx;
    }

    public static void v(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            File[] listFiles = file.listFiles();
            for (File file3 : listFiles) {
                v(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                throw new bRU("Unable to delete directory: ".concat(String.valueOf(file)));
            }
        } else if (file2.exists()) {
            throw new bRU("File clashing with existing file from other slice: ".concat(file2.toString()));
        } else if (!file.renameTo(file2)) {
            throw new bRU("Unable to move file: ".concat(String.valueOf(file)));
        }
    }

    public final void R(aE1 ae1) {
        File U = this.f2608R.U((String) ((oC1) ae1).f6699R, ae1.v, ae1.R, ae1.f806R);
        if (U.exists()) {
            dRx drx = this.f2608R;
            int i = ae1.v;
            long j = ae1.R;
            drx.getClass();
            File file = new File(drx.c(i, j, (String) ((oC1) ae1).f6699R), "_packs");
            if (!file.exists()) {
                file.mkdirs();
            }
            v(U, file);
            try {
                int Z = this.f2608R.Z(ae1.v, ae1.R, (String) ((oC1) ae1).f6699R);
                dRx drx2 = this.f2608R;
                int i2 = ae1.v;
                long j2 = ae1.R;
                drx2.getClass();
                File file2 = new File(new File(drx2.c(i2, j2, (String) ((oC1) ae1).f6699R), "_packs"), "merge.tmp");
                Properties properties = new Properties();
                properties.put("numberOfMerges", String.valueOf(Z + 1));
                file2.getParentFile().mkdirs();
                file2.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                properties.store(fileOutputStream, (String) null);
                fileOutputStream.close();
            } catch (IOException e) {
                R.L("Writing merge checkpoint failed with %s.", e.getMessage());
                throw new bRU("Writing merge checkpoint failed.", e, ((oC1) ae1).R);
            }
        } else {
            throw new bRU(String.format("Cannot find verified files for slice %s.", ae1.f806R), ((oC1) ae1).R);
        }
    }
}
