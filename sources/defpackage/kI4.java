package defpackage;

/* renamed from: kI4  reason: default package */
/* loaded from: classes.dex */
public final class kI4 implements h2V {
    public final Object R;
    public final Object c;
    public final /* synthetic */ int e = 0;
    public final Object v;

    public kI4(gUn gun, nWW nww, h2V h2v) {
        this.R = gun;
        this.v = nww;
        this.c = h2v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    @Override // defpackage.h2V
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object R(java.lang.Object r6, defpackage.aOO r7) {
        /*
            r5 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r5.e
            switch(r1) {
                case 0: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0074
        L_0x0008:
            boolean r1 = r7 instanceof defpackage.h7q
            if (r1 == 0) goto L_0x001b
            r1 = r7
            h7q r1 = (defpackage.h7q) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001b
            int r2 = r2 - r3
            r1.e = r2
            goto L_0x0020
        L_0x001b:
            h7q r1 = new h7q
            r1.<init>(r5, r7)
        L_0x0020:
            java.lang.Object r7 = r1.R
            int r2 = r1.e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            defpackage.jjU.o(r7)
            goto L_0x0071
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            defpackage.jjU.o(r7)
            java.lang.Object r7 = r5.R
            gUn r7 = (defpackage.gUn) r7
            kg9 r7 = r7.f3766R
            java.lang.Object r7 = r7.x(r6)
            java.lang.Object r2 = r5.v
            nWW r2 = (defpackage.nWW) r2
            java.lang.Object r2 = r2.R
            lmI r4 = defpackage.aJV.f827R
            if (r2 == r4) goto L_0x005e
            java.lang.Object r4 = r5.R
            gUn r4 = (defpackage.gUn) r4
            iv7 r4 = r4.R
            java.lang.Object r2 = r4.J(r2, r7)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0071
        L_0x005e:
            java.lang.Object r2 = r5.v
            nWW r2 = (defpackage.nWW) r2
            r2.R = r7
            java.lang.Object r5 = r5.c
            h2V r5 = (defpackage.h2V) r5
            r1.e = r3
            java.lang.Object r5 = r5.R(r6, r1)
            if (r5 != r0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            o8s r0 = defpackage.o8s.R
        L_0x0073:
            return r0
        L_0x0074:
            java.lang.Object r1 = r5.R
            nbD r1 = (defpackage.nbD) r1
            java.lang.Object r2 = r5.v
            java.lang.Object r5 = r5.c
            iv7 r5 = (defpackage.iv7) r5
            java.lang.Object r2 = defpackage.cU5.i(r1, r2)
            h6p r3 = new h6p     // Catch: all -> 0x0098
            r3.<init>(r7, r1)     // Catch: all -> 0x0098
            r7 = 2
            defpackage.gvP.L(r7, r5)     // Catch: all -> 0x0098
            java.lang.Object r5 = r5.J(r6, r3)     // Catch: all -> 0x0098
            defpackage.cU5.C(r1, r2)
            if (r5 != r0) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            o8s r5 = defpackage.o8s.R
        L_0x0097:
            return r5
        L_0x0098:
            r5 = move-exception
            defpackage.cU5.C(r1, r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kI4.R(java.lang.Object, aOO):java.lang.Object");
    }

    public kI4(h2V h2v, nbD nbd) {
        this.R = nbd;
        this.v = cU5.g(nbd);
        this.c = new jos(h2v, null);
    }
}
