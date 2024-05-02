package defpackage;

/* renamed from: UA  reason: default package */
/* loaded from: classes.dex */
public abstract class UA implements nWQ {
    public abstract Object O(kMD kmd, aOO aoo);

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    @Override // defpackage.nWQ
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(defpackage.h2V r5, defpackage.aOO r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.R8
            if (r0 == 0) goto L_0x0013
            r0 = r6
            R8 r0 = (defpackage.R8) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            R8 r0 = new R8
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f477R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kMD r4 = r0.f478R
            defpackage.jjU.o(r6)     // Catch: all -> 0x0029
            goto L_0x0049
        L_0x0029:
            r5 = move-exception
            goto L_0x0052
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.jjU.o(r6)
            kMD r6 = new kMD
            nbD r2 = r0.R
            r6.<init>(r5, r2)
            r0.f478R = r6     // Catch: all -> 0x004f
            r0.e = r3     // Catch: all -> 0x004f
            java.lang.Object r4 = r4.O(r6, r0)     // Catch: all -> 0x004f
            if (r4 != r1) goto L_0x0048
            return r1
        L_0x0048:
            r4 = r6
        L_0x0049:
            r4.L()
            o8s r4 = defpackage.o8s.R
            return r4
        L_0x004f:
            r4 = move-exception
            r5 = r4
            r4 = r6
        L_0x0052:
            r4.L()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.UA.v(h2V, aOO):java.lang.Object");
    }
}
