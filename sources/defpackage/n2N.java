package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

/* renamed from: n2N  reason: default package */
/* loaded from: classes.dex */
public final class n2N {
    public static final zI R = new zI("PackMetadataManager", 0);

    /* renamed from: R  reason: collision with other field name */
    public final bu3 f6274R;

    /* renamed from: R  reason: collision with other field name */
    public final chm f6275R;

    /* renamed from: R  reason: collision with other field name */
    public final dRx f6276R;

    public n2N(dRx drx, chm chm, bu3 bu3) {
        this.f6276R = drx;
        this.f6275R = chm;
        this.f6274R = bu3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String R(java.lang.String r8) {
        /*
            r7 = this;
            bu3 r0 = r7.f6274R
            boolean r0 = r0.R()
            if (r0 == 0) goto L_0x0071
            dRx r0 = r7.f6276R
            r0.getClass()
            r1 = 1
            r2 = 0
            java.lang.String r0 = r0.C(r8)     // Catch: IOException -> 0x0017
            if (r0 == 0) goto L_0x0017
            r0 = r1
            goto L_0x0018
        L_0x0017:
            r0 = r2
        L_0x0018:
            if (r0 != 0) goto L_0x001b
            goto L_0x0071
        L_0x001b:
            chm r0 = r7.f6275R
            int r0 = r0.R()
            dRx r7 = r7.f6276R
            long r3 = r7.m(r8)
            java.io.File r5 = new java.io.File
            java.io.File r6 = new java.io.File
            java.io.File r7 = r7.x(r0, r3, r8)
            java.lang.String r3 = "_metadata"
            r6.<init>(r7, r3)
            java.lang.String r7 = "properties.dat"
            r5.<init>(r6, r7)
            boolean r7 = r5.exists()     // Catch: IOException -> 0x0066
            if (r7 != 0) goto L_0x0044
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch: IOException -> 0x0066
            goto L_0x0060
        L_0x0044:
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: IOException -> 0x0066
            r7.<init>(r5)     // Catch: IOException -> 0x0066
            java.util.Properties r3 = new java.util.Properties     // Catch: all -> 0x0061
            r3.<init>()     // Catch: all -> 0x0061
            r3.load(r7)     // Catch: all -> 0x0061
            r7.close()     // Catch: IOException -> 0x0066
            java.lang.String r7 = "moduleVersionTag"
            java.lang.String r7 = r3.getProperty(r7)     // Catch: IOException -> 0x0066
            if (r7 != 0) goto L_0x0060
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch: IOException -> 0x0066
        L_0x0060:
            return r7
        L_0x0061:
            r0 = move-exception
            r7.close()     // Catch: all -> 0x0065
        L_0x0065:
            throw r0     // Catch: IOException -> 0x0066
        L_0x0066:
            zI r7 = defpackage.n2N.R
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r2] = r8
            java.lang.String r8 = "Failed to read pack version tag for pack %s"
            r7.L(r8, r0)
        L_0x0071:
            java.lang.String r7 = ""
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n2N.R(java.lang.String):java.lang.String");
    }

    public final void v(String str, int i, long j, String str2) {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        dRx drx = this.f6276R;
        drx.getClass();
        File file = new File(new File(drx.x(i, j, str), "_metadata"), "properties.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
