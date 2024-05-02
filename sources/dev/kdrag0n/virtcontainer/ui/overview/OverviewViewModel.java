package dev.kdrag0n.virtcontainer.ui.overview;

/* loaded from: classes.dex */
public final class OverviewViewModel extends kvj {
    public final ivW L;
    public final aME R;

    /* renamed from: R  reason: collision with other field name */
    public final dkr f2767R;

    /* renamed from: R  reason: collision with other field name */
    public final i4m f2768R;

    /* renamed from: R  reason: collision with other field name */
    public final iHI f2769R;

    /* renamed from: R  reason: collision with other field name */
    public final kdp f2771R;
    public final ivW X;
    public final ivW c;
    public final ivW e;

    /* renamed from: R  reason: collision with other field name */
    public final ivW f2770R = g4x.O(null);
    public final ivW v = g4x.O(null);
    public final ivW O = g4x.O(Boolean.FALSE);
    public final ivW Z = g4x.O(null);
    public final ivW m = g4x.O(null);
    public final ivW x = g4x.O(null);

    public OverviewViewModel(iHI ihi, aME ame, m_e m_e, kdp kdp, dkr dkr) {
        this.f2769R = ihi;
        this.R = ame;
        this.f2771R = kdp;
        this.f2767R = dkr;
        this.c = m_e.f6069R;
        this.e = ihi.e;
        i4m i4m = ihi.f4523R;
        this.f2768R = i4m;
        this.X = ihi.v;
        this.L = dkr.f2853R;
        kdp.R();
        mxC.y(ihi.f4521R, gvP.o(this), new ag5(this, 0));
        mxC.y(ihi.f4525R, gvP.o(this), new ag5(this, 1));
        mxC.y(i4m, gvP.o(this), new ag5(this, 2));
    }

    public final void X() {
        l6.z(gvP.o(this), null, 0, new kjQ(this, null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.b1n r7, defpackage.aOO r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.aWT
            if (r0 == 0) goto L_0x0013
            r0 = r8
            aWT r0 = (defpackage.aWT) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            aWT r0 = new aWT
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f903R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel r6 = r0.R
            defpackage.jjU.o(r8)
            goto L_0x007f
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            defpackage.jjU.o(r8)
            ivW r8 = r6.c
            java.lang.Object r8 = r8.getValue()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r2 = r8 instanceof java.util.Collection
            r4 = 0
            if (r2 == 0) goto L_0x004b
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x004b
            goto L_0x0066
        L_0x004b:
            java.util.Iterator r8 = r8.iterator()
        L_0x004f:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0066
            java.lang.Object r2 = r8.next()
            ihm r2 = (defpackage.ihm) r2
            java.lang.String r2 = r2.v
            java.lang.String r5 = r7.R
            boolean r2 = defpackage.n3x.v(r2, r5)
            if (r2 == 0) goto L_0x004f
            r4 = r3
        L_0x0066:
            if (r4 == 0) goto L_0x006b
            o8s r6 = defpackage.o8s.R
            return r6
        L_0x006b:
            ivW r8 = r6.x
            r8.H(r7)
            aME r8 = r6.R
            java.lang.String r7 = r7.R
            r0.R = r6
            r0.e = r3
            java.lang.Object r7 = r8.H(r7, r0)
            if (r7 != r1) goto L_0x007f
            return r1
        L_0x007f:
            ivW r6 = r6.x
            r7 = 0
            r6.H(r7)
            o8s r6 = defpackage.o8s.R
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel.e(b1n, aOO):java.lang.Object");
    }
}
