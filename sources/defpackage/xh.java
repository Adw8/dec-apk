package defpackage;

/* renamed from: xh  reason: default package */
/* loaded from: classes.dex */
public final class xh {

    /* renamed from: R  reason: collision with other field name */
    public final e2I f7473R = new e2I();

    /* renamed from: R  reason: collision with other field name */
    public final nk9 f7474R = new nk9();
    public final dq R = new dq((Object) null);

    public static void R(xh xhVar, pa3 pa3, Object obj) {
        Of of = new Of(pa3);
        synchronized (xhVar.R) {
            try {
                if (obj == null) {
                    OQ oq = (OQ) xhVar.f7474R.e(of, new OQ(null));
                } else {
                    OQ oq2 = (OQ) xhVar.f7473R.v(of, new OQ(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(defpackage.pa3 r8, defpackage.g3 r9, defpackage.Ta r10, defpackage.aOO r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.T1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            T1 r0 = (defpackage.T1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            T1 r0 = new T1
            r0.<init>(r7, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f522R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            boolean r5 = r0.f524R
            Of r7 = r0.R
            xh r8 = r0.f523R
            defpackage.jjU.o(r11)
            r6 = r11
            r11 = r7
            r7 = r8
            r8 = r6
            goto L_0x0071
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            defpackage.jjU.o(r11)
            Of r11 = new Of
            r9.getClass()
            r11.<init>(r8)
            dq r8 = r7.R
            monitor-enter(r8)
            e2I r9 = r7.f7473R     // Catch: all -> 0x009e
            java.lang.Object r9 = r9.R(r11)     // Catch: all -> 0x009e
            OQ r9 = (defpackage.OQ) r9     // Catch: all -> 0x009e
            if (r9 != 0) goto L_0x005b
            nk9 r9 = r7.f7474R     // Catch: all -> 0x009e
            java.lang.Object r9 = r9.R(r11)     // Catch: all -> 0x009e
            OQ r9 = (defpackage.OQ) r9     // Catch: all -> 0x009e
        L_0x005b:
            if (r9 == 0) goto L_0x0061
            java.lang.Object r7 = r9.R     // Catch: all -> 0x009e
            monitor-exit(r8)
            return r7
        L_0x0061:
            monitor-exit(r8)
            r0.f523R = r7
            r0.R = r11
            r0.f524R = r5
            r0.e = r4
            java.lang.Object r8 = r10.x(r0)
            if (r8 != r1) goto L_0x0071
            return r1
        L_0x0071:
            dq r9 = r7.R
            monitor-enter(r9)
            if (r8 != 0) goto L_0x0083
            nk9 r7 = r7.f7474R     // Catch: all -> 0x0081
            OQ r10 = new OQ     // Catch: all -> 0x0081
            r10.<init>(r3)     // Catch: all -> 0x0081
            r7.e(r11, r10)     // Catch: all -> 0x0081
            goto L_0x009a
        L_0x0081:
            r7 = move-exception
            goto L_0x009c
        L_0x0083:
            if (r5 == 0) goto L_0x0090
            nk9 r7 = r7.f7474R     // Catch: all -> 0x0081
            OQ r10 = new OQ     // Catch: all -> 0x0081
            r10.<init>(r8)     // Catch: all -> 0x0081
            r7.e(r11, r10)     // Catch: all -> 0x0081
            goto L_0x009a
        L_0x0090:
            e2I r7 = r7.f7473R     // Catch: all -> 0x0081
            OQ r10 = new OQ     // Catch: all -> 0x0081
            r10.<init>(r8)     // Catch: all -> 0x0081
            r7.v(r11, r10)     // Catch: all -> 0x0081
        L_0x009a:
            monitor-exit(r9)
            return r8
        L_0x009c:
            monitor-exit(r9)
            throw r7
        L_0x009e:
            r7 = move-exception
            monitor-exit(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xh.v(pa3, g3, Ta, aOO):java.lang.Object");
    }
}
