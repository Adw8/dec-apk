package defpackage;

import java.util.List;

/* renamed from: N0  reason: default package */
/* loaded from: classes.dex */
public final class N0 implements dH9 {
    public final g3 R;

    /* renamed from: R  reason: collision with other field name */
    public final List f302R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f303R;

    /* renamed from: R  reason: collision with other field name */
    public final nlN f304R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f305R;

    /* renamed from: R  reason: collision with other field name */
    public final xh f306R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f307R = true;

    public N0(List list, Object obj, nlN nln, xh xhVar, kg9 kg9, g3 g3Var) {
        this.f302R = list;
        this.f304R = nln;
        this.f306R = xhVar;
        this.f303R = kg9;
        this.R = g3Var;
        this.f305R = l6.n(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.pa3 r8, defpackage.aOO r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.A_
            if (r0 == 0) goto L_0x0013
            r0 = r9
            A_ r0 = (defpackage.A_) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            A_ r0 = new A_
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f1R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            pa3 r8 = r0.f2R
            defpackage.jjU.o(r9)     // Catch: CancellationException -> 0x0072, Exception -> 0x0049
            goto L_0x0047
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            defpackage.jjU.o(r9)
            r5 = 15000(0x3a98, double:7.411E-320)
            fN r9 = new fN     // Catch: CancellationException -> 0x0072, Exception -> 0x0049
            r9.<init>(r7, r8, r4)     // Catch: CancellationException -> 0x0072, Exception -> 0x0049
            r0.f2R = r8     // Catch: CancellationException -> 0x0072, Exception -> 0x0049
            r0.e = r3     // Catch: CancellationException -> 0x0072, Exception -> 0x0049
            java.lang.Object r9 = defpackage.l6.D(r5, r9, r0)     // Catch: CancellationException -> 0x0072, Exception -> 0x0049
            if (r9 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r4 = r9
            goto L_0x007b
        L_0x0049:
            r7 = move-exception
            nbD r9 = r0.R
            dq r1 = defpackage.dq.f2883c
            hdJ r9 = r9.O(r1)
            pqS r9 = (defpackage.pqS) r9
            if (r9 == 0) goto L_0x007b
            nbD r0 = r0.R
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to load font "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r1.<init>(r8, r7)
            r9.a(r0, r1)
            goto L_0x007b
        L_0x0072:
            r7 = move-exception
            nbD r8 = r0.R
            boolean r8 = defpackage.dTl.A(r8)
            if (r8 == 0) goto L_0x007c
        L_0x007b:
            return r4
        L_0x007c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.N0.c(pa3, aOO):java.lang.Object");
    }

    @Override // defpackage.dH9
    public final Object getValue() {
        return this.f305R.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063 A[Catch: all -> 0x00f8, TryCatch #2 {all -> 0x00f8, blocks: (B:23:0x005a, B:25:0x0063, B:30:0x0075, B:35:0x0097, B:38:0x00c1), top: B:54:0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097 A[Catch: all -> 0x00f8, TRY_LEAVE, TryCatch #2 {all -> 0x00f8, blocks: (B:23:0x005a, B:25:0x0063, B:30:0x0075, B:35:0x0097, B:38:0x00c1), top: B:54:0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1 A[Catch: all -> 0x00f8, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00f8, blocks: (B:23:0x005a, B:25:0x0063, B:30:0x0075, B:35:0x0097, B:38:0x00c1), top: B:54:0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(defpackage.aOO r14) {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.N0.v(aOO):java.lang.Object");
    }
}
