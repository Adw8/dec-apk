package defpackage;

/* renamed from: eAU  reason: default package */
/* loaded from: classes.dex */
public final class eAU implements h2V {
    public final /* synthetic */ h2V R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWW f3003R;

    public eAU(h2V h2v, nWW nww) {
        this.R = h2v;
        this.f3003R = nww;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x001f */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: eAU */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: eAU */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, o8s] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    @Override // defpackage.h2V
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object R(java.lang.Object r5, defpackage.aOO r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.pwM
            if (r0 == 0) goto L_0x0013
            r0 = r6
            pwM r0 = (defpackage.pwM) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            pwM r0 = new pwM
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f7323R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            eAU r4 = r0.R
            defpackage.jjU.o(r6)     // Catch: all -> 0x0044
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            defpackage.jjU.o(r6)
            h2V r6 = r4.R     // Catch: all -> 0x0044
            r0.R = r4     // Catch: all -> 0x0044
            r0.e = r3     // Catch: all -> 0x0044
            java.lang.Object r4 = r6.R(r5, r0)     // Catch: all -> 0x0044
            if (r4 != r1) goto L_0x0041
            return r1
        L_0x0041:
            o8s r4 = defpackage.o8s.R
            return r4
        L_0x0044:
            r5 = move-exception
            nWW r4 = r4.f3003R
            r4.R = r5
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eAU.R(java.lang.Object, aOO):java.lang.Object");
    }
}
