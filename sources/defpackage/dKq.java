package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: dKq  reason: default package */
/* loaded from: classes.dex */
public abstract class dKq {
    public static final fcD R;

    /* renamed from: R  reason: collision with other field name */
    public static final ArrayList f2563R;
    public static final fcD v;

    /* renamed from: R  reason: collision with other field name */
    public static final byte[] f2565R = {(byte) 107, (byte) 68, (byte) 82, 1};

    /* renamed from: R  reason: collision with other field name */
    public static final List f2564R = Collections.singletonList(new kSh(gvP.V(-3881547353401321363L), gvP.V(-3881547383466092435L)));

    static {
        fcD fcd = fcD.R;
        f2563R = dF.cE(fcd, fcd);
        R = fcd;
        v = fcd;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:88)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:452)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:51)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static final void R(java.util.zip.ZipOutputStream r3, java.io.File r4, java.lang.String r5) {
        /*
            java.io.File r0 = new java.io.File     // Catch: Exception -> 0x002a, all -> 0x0028
            r0.<init>(r4, r5)     // Catch: Exception -> 0x002a, all -> 0x0028
            boolean r4 = r0.exists()     // Catch: Exception -> 0x002a, all -> 0x0028
            if (r4 != 0) goto L_0x000c
            goto L_0x0044
        L_0x000c:
            java.util.zip.ZipEntry r4 = new java.util.zip.ZipEntry     // Catch: Exception -> 0x002a, all -> 0x0028
            r4.<init>(r5)     // Catch: Exception -> 0x002a, all -> 0x0028
            r3.putNextEntry(r4)     // Catch: Exception -> 0x002a, all -> 0x0028
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: Exception -> 0x002a, all -> 0x0028
            r4.<init>(r0)     // Catch: Exception -> 0x002a, all -> 0x0028
            r0 = 0
            defpackage.jjU.O(r4, r3)     // Catch: all -> 0x0021
            defpackage.dTl.V(r4, r0)     // Catch: Exception -> 0x002a, all -> 0x0028
            goto L_0x0044
        L_0x0021:
            r0 = move-exception
            throw r0     // Catch: all -> 0x0023
        L_0x0023:
            r1 = move-exception
            defpackage.dTl.V(r4, r0)     // Catch: Exception -> 0x002a, all -> 0x0028
            throw r1     // Catch: Exception -> 0x002a, all -> 0x0028
        L_0x0028:
            r4 = move-exception
            goto L_0x0048
        L_0x002a:
            r4 = move-exception
            r0 = 6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x0028
            r1.<init>()     // Catch: all -> 0x0028
            java.lang.String r2 = "Failed to write debug file from disk: "
            r1.append(r2)     // Catch: all -> 0x0028
            r1.append(r5)     // Catch: all -> 0x0028
            java.lang.String r5 = r1.toString()     // Catch: all -> 0x0028
            java.lang.String r1 = defpackage.cUF.v(r3)     // Catch: all -> 0x0028
            defpackage.kxm.v(r1, r0, r5, r4)     // Catch: all -> 0x0028
        L_0x0044:
            r3.closeEntry()
            return
        L_0x0048:
            r3.closeEntry()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dKq.R(java.util.zip.ZipOutputStream, java.io.File, java.lang.String):void");
    }

    public static final void v(ZipOutputStream zipOutputStream, String str, f_c f_c) {
        try {
            try {
                zipOutputStream.putNextEntry(new ZipEntry(str));
                f_c.g();
            } catch (Exception e) {
                kxm.v(cUF.v(zipOutputStream), 6, "Failed to write debug file from memory: " + str, e);
            }
        } finally {
            zipOutputStream.closeEntry();
        }
    }
}
