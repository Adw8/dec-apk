package defpackage;

/* renamed from: lIh  reason: default package */
/* loaded from: classes.dex */
public final class lIh implements nWQ {
    public final /* synthetic */ nWQ R;
    public final /* synthetic */ int X = 1;
    public final /* synthetic */ int e;

    public /* synthetic */ lIh(nWQ nwq, int i) {
        this.e = i;
        this.R = nwq;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:8|(2:10|(6:12|14|30|(1:(2:17|18)(2:19|20))(3:21|22|(1:33))|27|28))|13|14|30|(0)(0)|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (r5.R != r6) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        throw r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    @Override // defpackage.nWQ
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(defpackage.h2V r6, defpackage.aOO r7) {
        /*
            r5 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r5.e
            switch(r1) {
                case 0: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0021
        L_0x0008:
            blo r1 = new blo
            r1.<init>()
            nWQ r2 = r5.R
            bMl r3 = new bMl
            int r5 = r5.X
            r4 = 0
            r3.<init>(r1, r5, r6, r4)
            java.lang.Object r5 = r2.v(r3, r7)
            if (r5 != r0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            o8s r5 = defpackage.o8s.R
        L_0x0020:
            return r5
        L_0x0021:
            boolean r1 = r7 instanceof defpackage.gjl
            if (r1 == 0) goto L_0x0034
            r1 = r7
            gjl r1 = (defpackage.gjl) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0034
            int r2 = r2 - r3
            r1.e = r2
            goto L_0x0039
        L_0x0034:
            gjl r1 = new gjl
            r1.<init>(r5, r7)
        L_0x0039:
            java.lang.Object r7 = r1.f3913R
            int r2 = r1.e
            r3 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 != r3) goto L_0x0048
            h2V r6 = r1.R
            defpackage.jjU.o(r7)     // Catch: v6 -> 0x006c
            goto L_0x0071
        L_0x0048:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0050:
            defpackage.jjU.o(r7)
            blo r7 = new blo
            r7.<init>()
            nWQ r2 = r5.R     // Catch: v6 -> 0x006c
            bMl r4 = new bMl     // Catch: v6 -> 0x006c
            int r5 = r5.X     // Catch: v6 -> 0x006c
            r4.<init>(r7, r5, r6, r3)     // Catch: v6 -> 0x006c
            r1.R = r6     // Catch: v6 -> 0x006c
            r1.e = r3     // Catch: v6 -> 0x006c
            java.lang.Object r5 = r2.v(r4, r1)     // Catch: v6 -> 0x006c
            if (r5 != r0) goto L_0x0071
            goto L_0x0073
        L_0x006c:
            r5 = move-exception
            h2V r7 = r5.R
            if (r7 != r6) goto L_0x0074
        L_0x0071:
            o8s r0 = defpackage.o8s.R
        L_0x0073:
            return r0
        L_0x0074:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lIh.v(h2V, aOO):java.lang.Object");
    }
}
