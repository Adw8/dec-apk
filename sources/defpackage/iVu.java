package defpackage;

import java.util.List;

/* renamed from: iVu  reason: default package */
/* loaded from: classes.dex */
public abstract class iVu {

    /* renamed from: R  reason: collision with other field name */
    public static final dgP f4622R = new dgP(0);
    public static final dgP v = new dgP(1);
    public static final float R = ((float) 0.125d) / ((float) 18);

    public static final float L(bUo buo, int i) {
        return i == 2 ? buo.c() * R : buo.c();
    }

    public static final boolean O(pdm pdm, long j) {
        Object obj;
        List list = pdm.f7140R;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (k8q.R(((phU) obj).f7171R, j)) {
                break;
            }
            i++;
        }
        phU phu = (phU) obj;
        if (phu != null && phu.f7175R) {
            z = true;
        }
        return true ^ z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b4, code lost:
        if ((!defpackage.aWo.v(defpackage.n1P.K(r7, true), defpackage.aWo.v)) != false) goto L_0x00b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0079 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object R(long r12, defpackage.lAs r14, defpackage.aOO r15) {
        /*
            boolean r0 = r15 instanceof defpackage.hmi
            if (r0 == 0) goto L_0x0013
            r0 = r15
            hmi r0 = (defpackage.hmi) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            hmi r0 = new hmi
            r0.<init>(r15)
        L_0x0018:
            java.lang.Object r15 = r0.f4378R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            dRB r12 = r0.R
            lAs r13 = r0.f4379R
            defpackage.jjU.o(r15)
            r14 = r13
            goto L_0x0058
        L_0x002d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0035:
            defpackage.jjU.o(r15)
            iTB r15 = r14.v
            pdm r15 = r15.f4598R
            boolean r15 = O(r15, r12)
            if (r15 == 0) goto L_0x0043
            return r3
        L_0x0043:
            dRB r15 = new dRB
            r15.<init>()
            r15.R = r12
            r12 = r15
        L_0x004b:
            r0.f4379R = r14
            r0.R = r12
            r0.e = r4
            java.lang.Object r15 = defpackage.lAs.e(r14, r0)
            if (r15 != r1) goto L_0x0058
            return r1
        L_0x0058:
            pdm r15 = (defpackage.pdm) r15
            java.util.List r13 = r15.f7140R
            int r2 = r13.size()
            r5 = 0
            r6 = r5
        L_0x0062:
            if (r6 >= r2) goto L_0x0079
            java.lang.Object r7 = r13.get(r6)
            r8 = r7
            phU r8 = (defpackage.phU) r8
            long r8 = r8.f7171R
            long r10 = r12.R
            boolean r8 = defpackage.k8q.R(r8, r10)
            if (r8 == 0) goto L_0x0076
            goto L_0x007a
        L_0x0076:
            int r6 = r6 + 1
            goto L_0x0062
        L_0x0079:
            r7 = r3
        L_0x007a:
            phU r7 = (defpackage.phU) r7
            if (r7 != 0) goto L_0x0080
            r7 = r3
            goto L_0x00b6
        L_0x0080:
            boolean r13 = defpackage.n1P.H(r7)
            if (r13 == 0) goto L_0x00a9
            java.util.List r13 = r15.f7140R
            int r15 = r13.size()
            r2 = r5
        L_0x008d:
            if (r2 >= r15) goto L_0x009e
            java.lang.Object r6 = r13.get(r2)
            r8 = r6
            phU r8 = (defpackage.phU) r8
            boolean r8 = r8.f7175R
            if (r8 == 0) goto L_0x009b
            goto L_0x009f
        L_0x009b:
            int r2 = r2 + 1
            goto L_0x008d
        L_0x009e:
            r6 = r3
        L_0x009f:
            phU r6 = (defpackage.phU) r6
            if (r6 != 0) goto L_0x00a4
            goto L_0x00b6
        L_0x00a4:
            long r5 = r6.f7171R
            r12.R = r5
            goto L_0x004b
        L_0x00a9:
            long r8 = defpackage.n1P.K(r7, r4)
            long r10 = defpackage.aWo.v
            boolean r13 = defpackage.aWo.v(r8, r10)
            r13 = r13 ^ r4
            if (r13 == 0) goto L_0x004b
        L_0x00b6:
            if (r7 == 0) goto L_0x00bf
            boolean r12 = r7.v()
            if (r12 != 0) goto L_0x00bf
            goto L_0x00c0
        L_0x00bf:
            r4 = r5
        L_0x00c0:
            if (r4 == 0) goto L_0x00c3
            r3 = r7
        L_0x00c3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iVu.R(long, lAs, aOO):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00df, code lost:
        if ((r10 ^ 1) != 0) goto L_0x00e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x009f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object X(defpackage.lAs r17, long r18, defpackage.kg9 r20, defpackage.aOO r21) {
        /*
        // Method dump skipped, instructions count: 263
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iVu.X(lAs, long, kg9, aOO):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00df, code lost:
        if ((r10 ^ 1) != 0) goto L_0x00e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x009f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object Z(defpackage.lAs r17, long r18, defpackage.cCR r20, defpackage.aOO r21) {
        /*
        // Method dump skipped, instructions count: 263
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iVu.Z(lAs, long, cCR, aOO):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(long r9, defpackage.lAs r11, defpackage.aOO r12) {
        /*
            boolean r0 = r12 instanceof defpackage.b4x
            if (r0 == 0) goto L_0x0013
            r0 = r12
            b4x r0 = (defpackage.b4x) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            b4x r0 = new b4x
            r0.<init>(r12)
        L_0x0018:
            java.lang.Object r12 = r0.R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            nWW r9 = r0.f1522R
            phU r10 = r0.f1523R
            defpackage.jjU.o(r12)     // Catch: dnC -> 0x002d
            goto L_0x009a
        L_0x002d:
            r3 = r10
            goto L_0x0092
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            defpackage.jjU.o(r12)
            iTB r12 = r11.v
            pdm r12 = r12.f4598R
            boolean r12 = O(r12, r9)
            if (r12 == 0) goto L_0x0045
            return r3
        L_0x0045:
            iTB r12 = r11.v
            pdm r12 = r12.f4598R
            java.util.List r12 = r12.f7140R
            r2 = 0
            int r5 = r12.size()
        L_0x0050:
            if (r2 >= r5) goto L_0x0065
            java.lang.Object r6 = r12.get(r2)
            r7 = r6
            phU r7 = (defpackage.phU) r7
            long r7 = r7.f7171R
            boolean r7 = defpackage.k8q.R(r7, r9)
            if (r7 == 0) goto L_0x0062
            goto L_0x0066
        L_0x0062:
            int r2 = r2 + 1
            goto L_0x0050
        L_0x0065:
            r6 = r3
        L_0x0066:
            phU r6 = (defpackage.phU) r6
            if (r6 != 0) goto L_0x006b
            return r3
        L_0x006b:
            nWW r9 = new nWW
            r9.<init>()
            nWW r10 = new nWW
            r10.<init>()
            r10.R = r6
            iTB r12 = r11.v
            bUo r12 = r12.f4594R
            long r7 = r12.e()
            dtq r12 = new dtq     // Catch: dnC -> 0x0091
            r12.<init>(r10, r9, r3)     // Catch: dnC -> 0x0091
            r0.f1523R = r6     // Catch: dnC -> 0x0091
            r0.f1522R = r9     // Catch: dnC -> 0x0091
            r0.e = r4     // Catch: dnC -> 0x0091
            java.lang.Object r9 = r11.O(r7, r12, r0)     // Catch: dnC -> 0x0091
            if (r9 != r1) goto L_0x009a
            return r1
        L_0x0091:
            r3 = r6
        L_0x0092:
            java.lang.Object r9 = r9.R
            phU r9 = (defpackage.phU) r9
            if (r9 != 0) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            r3 = r9
        L_0x009a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iVu.c(long, lAs, aOO):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(defpackage.lAs r4, long r5, defpackage.kg9 r7, defpackage.aOO r8) {
        /*
            boolean r0 = r8 instanceof defpackage.nHz
            if (r0 == 0) goto L_0x0013
            r0 = r8
            nHz r0 = (defpackage.nHz) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            nHz r0 = new nHz
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kg9 r4 = r0.f6355R
            lAs r5 = r0.f6356R
            defpackage.jjU.o(r8)
            r7 = r4
            r4 = r5
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            defpackage.jjU.o(r8)
        L_0x0038:
            r0.f6356R = r4
            r0.f6355R = r7
            r0.e = r3
            java.lang.Object r8 = R(r5, r4, r0)
            if (r8 != r1) goto L_0x0045
            return r1
        L_0x0045:
            phU r8 = (defpackage.phU) r8
            if (r8 != 0) goto L_0x004c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L_0x004c:
            boolean r5 = defpackage.n1P.H(r8)
            if (r5 == 0) goto L_0x0055
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L_0x0055:
            r7.x(r8)
            long r5 = r8.f7171R
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iVu.e(lAs, long, kg9, aOO):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v9, types: [lPL] */
    /* JADX WARN: Type inference failed for: r14v10, types: [lPL] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e1 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object v(defpackage.lAs r20, long r21, int r23, defpackage.bkx r24, defpackage.aOO r25) {
        /*
        // Method dump skipped, instructions count: 473
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iVu.v(lAs, long, int, bkx, aOO):java.lang.Object");
    }
}
