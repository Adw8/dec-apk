package defpackage;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: o6_  reason: default package */
/* loaded from: classes.dex */
public abstract class o6_ {

    /* renamed from: R  reason: collision with other field name */
    public static final ThreadPoolExecutor f6671R;

    /* renamed from: R  reason: collision with other field name */
    public static final nX6 f6672R = new nX6(16);

    /* renamed from: R  reason: collision with other field name */
    public static final Object f6670R = new Object();
    public static final cE0 R = new cE0();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new nZH());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f6671R = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.kFU R(java.lang.String r6, android.content.Context r7, defpackage.Jd r8, int r9) {
        /*
            nX6 r0 = defpackage.o6_.f6672R
            java.lang.Object r0 = r0.R(r6)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0010
            kFU r6 = new kFU
            r6.<init>(r0)
            return r6
        L_0x0010:
            c85 r8 = defpackage.aJV.R(r7, r8)     // Catch: NameNotFoundException -> 0x0064
            int r0 = r8.e
            r1 = -3
            r2 = 1
            if (r0 == 0) goto L_0x001f
            if (r0 == r2) goto L_0x001d
            goto L_0x0036
        L_0x001d:
            r0 = -2
            goto L_0x003f
        L_0x001f:
            java.lang.Object r0 = r8.R
            ec7[] r0 = (defpackage.ec7[]) r0
            if (r0 == 0) goto L_0x003e
            int r3 = r0.length
            if (r3 != 0) goto L_0x0029
            goto L_0x003e
        L_0x0029:
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L_0x002c:
            if (r4 >= r2) goto L_0x003d
            r5 = r0[r4]
            int r5 = r5.c
            if (r5 == 0) goto L_0x003a
            if (r5 >= 0) goto L_0x0038
        L_0x0036:
            r0 = r1
            goto L_0x003f
        L_0x0038:
            r0 = r5
            goto L_0x003f
        L_0x003a:
            int r4 = r4 + 1
            goto L_0x002c
        L_0x003d:
            r2 = r3
        L_0x003e:
            r0 = r2
        L_0x003f:
            if (r0 == 0) goto L_0x0047
            kFU r6 = new kFU
            r6.<init>(r0)
            return r6
        L_0x0047:
            java.lang.Object r8 = r8.R
            ec7[] r8 = (defpackage.ec7[]) r8
            gqg r0 = defpackage.bIw.R
            android.graphics.Typeface r7 = r0.s(r7, r8, r9)
            if (r7 == 0) goto L_0x005e
            nX6 r8 = defpackage.o6_.f6672R
            r8.v(r6, r7)
            kFU r6 = new kFU
            r6.<init>(r7)
            return r6
        L_0x005e:
            kFU r6 = new kFU
            r6.<init>(r1)
            return r6
        L_0x0064:
            kFU r6 = new kFU
            r7 = -1
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o6_.R(java.lang.String, android.content.Context, Jd, int):kFU");
    }
}
