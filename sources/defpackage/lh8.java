package defpackage;

/* renamed from: lh8  reason: default package */
/* loaded from: classes.dex */
public final class lh8 {
    public f_c R = new q4(9, this);

    /* renamed from: R  reason: collision with other field name */
    public i_c f5803R;

    /* renamed from: R  reason: collision with other field name */
    public jy_ f5804R;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object R(long r8, long r10, defpackage.aOO r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.b1K
            if (r0 == 0) goto L_0x0013
            r0 = r12
            b1K r0 = (defpackage.b1K) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            b1K r0 = new b1K
            r0.<init>(r7, r12)
        L_0x0018:
            r6 = r0
            java.lang.Object r12 = r6.R
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r6.e
            r2 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r2) goto L_0x0028
            defpackage.jjU.o(r12)
            goto L_0x0042
        L_0x0028:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0030:
            defpackage.jjU.o(r12)
            i_c r1 = r7.f5803R
            if (r1 == 0) goto L_0x0047
            r6.e = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.m(r2, r4, r6)
            if (r12 != r0) goto L_0x0042
            return r0
        L_0x0042:
            d_E r12 = (defpackage.d_E) r12
            long r7 = r12.f2672R
            goto L_0x004b
        L_0x0047:
            int r7 = defpackage.d_E.R
            long r7 = defpackage.d_E.v
        L_0x004b:
            d_E r9 = new d_E
            r9.<init>(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh8.R(long, long, aOO):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(long r5, defpackage.aOO r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.g6V
            if (r0 == 0) goto L_0x0013
            r0 = r7
            g6V r0 = (defpackage.g6V) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            g6V r0 = new g6V
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.jjU.o(r7)
            goto L_0x003f
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            defpackage.jjU.o(r7)
            i_c r4 = r4.f5803R
            if (r4 == 0) goto L_0x0044
            r0.e = r3
            java.lang.Object r7 = r4.x(r5, r0)
            if (r7 != r1) goto L_0x003f
            return r1
        L_0x003f:
            d_E r7 = (defpackage.d_E) r7
            long r4 = r7.f2672R
            goto L_0x0048
        L_0x0044:
            int r4 = defpackage.d_E.R
            long r4 = defpackage.d_E.v
        L_0x0048:
            d_E r6 = new d_E
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh8.c(long, aOO):java.lang.Object");
    }

    public final jy_ e() {
        jy_ jy_ = (jy_) this.R.g();
        if (jy_ != null) {
            return jy_;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final long v(int i, long j, long j2) {
        i_c i_c = this.f5803R;
        if (i_c != null) {
            return i_c.H(i, j, j2);
        }
        int i2 = aWo.R;
        return aWo.v;
    }
}
