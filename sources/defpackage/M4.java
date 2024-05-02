package defpackage;

/* renamed from: M4  reason: default package */
/* loaded from: classes.dex */
public final class M4 implements ze {
    public final biT R = new biT(new sR[16]);

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0083, code lost:
        if (r10 < r12) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object R(defpackage.gIA r11, defpackage.aOO r12) {
        /*
            r10 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            boolean r1 = r12 instanceof defpackage.Za
            if (r1 == 0) goto L_0x0015
            r1 = r12
            Za r1 = (defpackage.Za) r1
            int r2 = r1.O
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.O = r2
            goto L_0x001a
        L_0x0015:
            Za r1 = new Za
            r1.<init>(r10, r12)
        L_0x001a:
            java.lang.Object r12 = r1.f668R
            int r2 = r1.O
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            int r10 = r1.X
            int r11 = r1.e
            java.lang.Object[] r2 = r1.f669R
            gIA r4 = r1.f667R
            defpackage.jjU.o(r12)
            r12 = r11
            r11 = r4
            r4 = r2
            r2 = r1
            r1 = r0
            goto L_0x0082
        L_0x0034:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003c:
            defpackage.jjU.o(r12)
            biT r10 = r10.R
            int r12 = r10.e
            if (r12 <= 0) goto L_0x0085
            r2 = 0
            java.lang.Object[] r10 = r10.f1772R
            r4 = r10
            r10 = r2
            r2 = r1
            r1 = r0
        L_0x004c:
            r5 = r4[r10]
            sR r5 = (defpackage.sR) r5
            r2.f667R = r11
            r2.f669R = r4
            r2.e = r12
            r2.X = r10
            r2.O = r3
            v2 r6 = r5.v
            if (r6 != 0) goto L_0x0060
            v2 r6 = r5.f618R
        L_0x0060:
            hjM r7 = r5.R
            r8 = 0
            if (r7 == 0) goto L_0x006c
            boolean r9 = r7.p()
            if (r9 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r7 = r8
        L_0x006d:
            if (r7 != 0) goto L_0x0070
            goto L_0x007d
        L_0x0070:
            _c r8 = new _c
            r9 = 3
            r8.<init>(r11, r9, r5)
            java.lang.Object r5 = r6.c(r7, r8, r2)
            if (r5 != r0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            o8s r5 = defpackage.o8s.R
        L_0x007f:
            if (r5 != r1) goto L_0x0082
            return r1
        L_0x0082:
            int r10 = r10 + r3
            if (r10 < r12) goto L_0x004c
        L_0x0085:
            o8s r10 = defpackage.o8s.R
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.M4.R(gIA, aOO):java.lang.Object");
    }
}
