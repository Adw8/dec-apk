package defpackage;

/* renamed from: gyU  reason: default package */
/* loaded from: classes.dex */
public final class gyU implements lHr, bpk, i_c {
    public static final /* synthetic */ int e = 0;
    public final i_c R;

    /* renamed from: R  reason: collision with other field name */
    public final lh8 f4001R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f4002R = l6.n(null);

    public gyU(lh8 lh8, i_c i_c) {
        this.f4001R = lh8;
        this.R = i_c;
        lh8.R = new q4(10, this);
    }

    public final gyU C() {
        return (gyU) this.f4002R.getValue();
    }

    @Override // defpackage.i_c
    public final long H(int i, long j, long j2) {
        long j3;
        long H = this.R.H(i, j, j2);
        gyU C = C();
        if (C != null) {
            j3 = C.H(i, aWo.L(j, H), aWo.O(j2, H));
        } else {
            int i2 = aWo.R;
            j3 = aWo.v;
        }
        return aWo.L(H, j3);
    }

    @Override // defpackage.lHr
    public final void P(bS6 bs6) {
        this.f4002R.R((gyU) bs6.v(aq9.R));
        this.f4001R.f5803R = C();
    }

    public final jy_ U() {
        jy_ jy_;
        gyU C = C();
        if ((C != null && (jy_ = C.U()) != null) || (jy_ = this.f4001R.f5804R) != null) {
            return jy_;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // defpackage.i_c
    public final long c(long j, int i) {
        long j2;
        gyU C = C();
        if (C != null) {
            j2 = C.c(j, i);
        } else {
            int i2 = aWo.R;
            j2 = aWo.v;
        }
        return aWo.L(j2, this.R.c(aWo.O(j, j2), i));
    }

    @Override // defpackage.bpk
    public final Object getValue() {
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e  */
    @Override // defpackage.i_c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(long r16, long r18, defpackage.aOO r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof defpackage.fOv
            if (r2 == 0) goto L_0x0016
            r2 = r1
            fOv r2 = (defpackage.fOv) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.e = r3
            goto L_0x001b
        L_0x0016:
            fOv r2 = new fOv
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.f3408R
            bGR r9 = defpackage.bGR.COROUTINE_SUSPENDED
            int r3 = r2.e
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 == r4) goto L_0x0037
            if (r3 != r10) goto L_0x002f
            long r2 = r2.R
            defpackage.jjU.o(r1)
            goto L_0x0088
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0037:
            long r3 = r2.v
            long r5 = r2.R
            gyU r0 = r2.f3407R
            defpackage.jjU.o(r1)
            r13 = r3
            r11 = r5
            goto L_0x0060
        L_0x0043:
            defpackage.jjU.o(r1)
            i_c r3 = r0.R
            r2.f3407R = r0
            r11 = r16
            r2.R = r11
            r13 = r18
            r2.v = r13
            r2.e = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.m(r4, r6, r8)
            if (r1 != r9) goto L_0x0060
            return r9
        L_0x0060:
            d_E r1 = (defpackage.d_E) r1
            long r3 = r1.f2672R
            gyU r0 = r0.C()
            if (r0 == 0) goto L_0x008e
            long r5 = defpackage.d_E.X(r11, r3)
            long r7 = defpackage.d_E.e(r13, r3)
            r1 = 0
            r2.f3407R = r1
            r2.R = r3
            r2.e = r10
            r15 = r0
            r16 = r5
            r18 = r7
            r20 = r2
            java.lang.Object r1 = r15.m(r16, r18, r20)
            if (r1 != r9) goto L_0x0087
            return r9
        L_0x0087:
            r2 = r3
        L_0x0088:
            d_E r1 = (defpackage.d_E) r1
            long r0 = r1.f2672R
            r3 = r2
            goto L_0x0090
        L_0x008e:
            long r0 = defpackage.d_E.v
        L_0x0090:
            long r0 = defpackage.d_E.X(r3, r0)
            d_E r2 = new d_E
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyU.m(long, long, aOO):java.lang.Object");
    }

    @Override // defpackage.bpk
    public final bsy r() {
        return aq9.R;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    @Override // defpackage.i_c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(long r9, defpackage.aOO r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.iOB
            if (r0 == 0) goto L_0x0013
            r0 = r11
            iOB r0 = (defpackage.iOB) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            iOB r0 = new iOB
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f4553R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            long r8 = r0.R
            defpackage.jjU.o(r11)
            goto L_0x0071
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            long r8 = r0.R
            gyU r10 = r0.f4552R
            defpackage.jjU.o(r11)
            r6 = r8
            r8 = r10
            r9 = r6
            goto L_0x0055
        L_0x003f:
            defpackage.jjU.o(r11)
            gyU r11 = r8.C()
            if (r11 == 0) goto L_0x005a
            r0.f4552R = r8
            r0.R = r9
            r0.e = r4
            java.lang.Object r11 = r11.x(r9, r0)
            if (r11 != r1) goto L_0x0055
            return r1
        L_0x0055:
            d_E r11 = (defpackage.d_E) r11
            long r4 = r11.f2672R
            goto L_0x005c
        L_0x005a:
            long r4 = defpackage.d_E.v
        L_0x005c:
            i_c r8 = r8.R
            long r9 = defpackage.d_E.e(r9, r4)
            r11 = 0
            r0.f4552R = r11
            r0.R = r4
            r0.e = r3
            java.lang.Object r11 = r8.x(r9, r0)
            if (r11 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r8 = r4
        L_0x0071:
            d_E r11 = (defpackage.d_E) r11
            long r10 = r11.f2672R
            long r8 = defpackage.d_E.X(r8, r10)
            d_E r10 = new d_E
            r10.<init>(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyU.x(long, aOO):java.lang.Object");
    }
}
