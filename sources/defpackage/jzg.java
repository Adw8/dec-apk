package defpackage;

/* renamed from: jzg  reason: default package */
/* loaded from: classes.dex */
public abstract class jzg {

    /* renamed from: R  reason: collision with other field name */
    public static final oxy f5174R = new oxy();
    public static final bsy R = new bsy(fzi.O);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    public static final java.lang.Object R(defpackage.lAs r5, defpackage.aOO r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ify
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ify r0 = (defpackage.ify) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            ify r0 = new ify
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            lAs r5 = r0.f4689R
            defpackage.jjU.o(r6)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            defpackage.jjU.o(r6)
        L_0x0034:
            r0.f4689R = r5
            r0.e = r3
            java.lang.Object r6 = defpackage.lAs.e(r5, r0)
            if (r6 != r1) goto L_0x003f
            goto L_0x004c
        L_0x003f:
            pdm r6 = (defpackage.pdm) r6
            int r2 = r6.R
            r4 = 6
            if (r2 != r4) goto L_0x0048
            r2 = r3
            goto L_0x0049
        L_0x0048:
            r2 = 0
        L_0x0049:
            if (r2 == 0) goto L_0x0034
            r1 = r6
        L_0x004c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzg.R(lAs, aOO):java.lang.Object");
    }

    public static final ncu v(ncu ncu, dmk dmk, nLK nlk, acA aca, boolean z, boolean z2, n4N n4n, p2E p2e) {
        boolean z3 = mWb.R;
        return g4x.g(ncu, lBz.Y, new aRA(aca, n4n, nlk, dmk, p2e, z2, z));
    }
}
