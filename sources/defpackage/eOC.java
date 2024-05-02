package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: eOC  reason: default package */
/* loaded from: classes.dex */
public abstract class eOC {
    public static final Pattern R = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    public static ArrayList R(File file, File file2) {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(bcr.R);
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            int length = listFiles.length;
            File[] fileArr2 = new File[length];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split("-")[0]);
                if (parseInt > listFiles.length || fileArr2[parseInt] != null) {
                    throw new bRU("Metadata folder ordering corrupt.");
                }
                fileArr2[parseInt] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    e9S R2 = new mp_(fileInputStream).R();
                    if (R2.f2992R != null) {
                        File file5 = new File(file, R2.f2992R);
                        if (file5.exists()) {
                            arrayList.add(file5);
                            fileInputStream.close();
                        } else {
                            throw new bRU(String.format("Missing asset file %s during slice reconstruction.", file5.getCanonicalPath()));
                        }
                    } else {
                        throw new bRU("Metadata files corrupt. Could not read local file header.");
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
