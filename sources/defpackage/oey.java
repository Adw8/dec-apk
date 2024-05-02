package defpackage;

/* renamed from: oey  reason: default package */
/* loaded from: classes.dex */
public final class oey implements dmk {
    public static final ift R = new ift(7, 0);

    /* renamed from: R  reason: collision with other field name */
    public static final k_s f6871R = msU.mL(iJF.t, ih.U);

    /* renamed from: R  reason: collision with other field name */
    public float f6872R;

    /* renamed from: R  reason: collision with other field name */
    public final jum f6878R;

    /* renamed from: R  reason: collision with other field name */
    public oFh f6880R;

    /* renamed from: c  reason: collision with other field name */
    public boolean f6884c;

    /* renamed from: e  reason: collision with other field name */
    public boolean f6885e;

    /* renamed from: v  reason: collision with other field name */
    public boolean f6886v;

    /* renamed from: R  reason: collision with other field name */
    public final aB_ f6875R = new aB_(this);

    /* renamed from: R  reason: collision with other field name */
    public final oST f6881R = l6.n(fBc.R);

    /* renamed from: R  reason: collision with other field name */
    public final p2E f6882R = new p2E();
    public final oST v = l6.n(new i4B(1.0f, 1.0f));

    /* renamed from: R  reason: collision with other field name */
    public final n_I f6879R = new n_I(new _0(10, this));

    /* renamed from: R  reason: collision with other field name */
    public boolean f6883R = true;

    /* renamed from: R  reason: collision with other field name */
    public int f6873R = -1;
    public final oST c = l6.n(null);

    /* renamed from: R  reason: collision with other field name */
    public final aG3 f6876R = new aG3(this);

    /* renamed from: R  reason: collision with other field name */
    public final Br f6874R = new Br();
    public final oST e = l6.n(null);
    public final oST X = l6.n(new oys(dtx.c(0, 0, 15)));

    /* renamed from: R  reason: collision with other field name */
    public final gL6 f6877R = new gL6(4);

    public oey(int i, int i2) {
        this.f6878R = new jum(i, i2);
    }

    public static Object Z(oey oey, int i, aOO aoo) {
        oey.getClass();
        Object R2 = oey.R(gRY.Default, new mjA(oey, i, 0, null), aoo);
        return R2 == bGR.COROUTINE_SUSPENDED ? R2 : o8s.R;
    }

    public final b9a L() {
        return (b9a) this.f6881R.getValue();
    }

    public final int O() {
        return ((hNA) this.f6878R.f5111R.getValue()).R;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061 A[RETURN] */
    @Override // defpackage.dmk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object R(defpackage.gRY r6, defpackage.iv7 r7, defpackage.aOO r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.adP
            if (r0 == 0) goto L_0x0013
            r0 = r8
            adP r0 = (defpackage.adP) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            adP r0 = new adP
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f940R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            defpackage.jjU.o(r8)
            goto L_0x0062
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            iv7 r7 = r0.f939R
            gRY r6 = r0.R
            oey r5 = r0.f941R
            defpackage.jjU.o(r8)
            goto L_0x0050
        L_0x003c:
            defpackage.jjU.o(r8)
            Br r8 = r5.f6874R
            r0.f941R = r5
            r0.R = r6
            r0.f939R = r7
            r0.e = r4
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L_0x0050
            return r1
        L_0x0050:
            n_I r5 = r5.f6879R
            r8 = 0
            r0.f941R = r8
            r0.R = r8
            r0.f939R = r8
            r0.e = r3
            java.lang.Object r5 = r5.R(r6, r7, r0)
            if (r5 != r1) goto L_0x0062
            return r1
        L_0x0062:
            o8s r5 = defpackage.o8s.R
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oey.R(gRY, iv7, aOO):java.lang.Object");
    }

    public final Object X(int i, int i2, n6J n6j) {
        aB_ ab_ = this.f6875R;
        float f = eGZ.R;
        Object v = dmk.v(ab_.R, new hnc(i, i2, ab_, null), n6j);
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        if (v != bgr) {
            v = o8s.R;
        }
        if (v != bgr) {
            v = o8s.R;
        }
        return v == bgr ? v : o8s.R;
    }

    @Override // defpackage.dmk
    public final boolean c() {
        return this.f6879R.c();
    }

    @Override // defpackage.dmk
    public final float e(float f) {
        return this.f6879R.e(f);
    }

    public final void m(int i, int i2) {
        jum jum = this.f6878R;
        jum.R(i, i2);
        jum.R = null;
        osg osg = (osg) this.e.getValue();
        if (osg != null) {
            osg.f6990R.clear();
            osg.f6992R = iia.R;
            osg.R = -1;
            osg.v = 0;
            osg.c = -1;
            osg.e = 0;
        }
        owG owg = (owG) this.c.getValue();
        if (owg != null) {
            owg.R();
        }
    }

    public final void x(m9D m9d) {
        Integer num;
        jum jum = this.f6878R;
        jum.getClass();
        dR6 c = ift.c();
        try {
            dR6 m = c.m();
            Object obj = jum.R;
            int i = ((hNA) jum.f5111R.getValue()).R;
            if (obj != null && ((i >= m9d.L() || !n3x.v(obj, m9d.v(i))) && (num = (Integer) m9d.O().get(obj)) != null)) {
                i = num.intValue();
            }
            jum.R(i, ((Number) jum.v.getValue()).intValue());
            dR6.P(m);
        } finally {
            c.c();
        }
    }
}
