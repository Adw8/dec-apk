package defpackage;

/* renamed from: mGH  reason: default package */
/* loaded from: classes.dex */
public final class mGH extends k8G implements lR3 {
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f5987R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mGH(p2E p2e, boolean z) {
        super(3);
        this.X = 1;
        this.f5987R = z;
        this.R = p2e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object R(defpackage.p2E r4, defpackage.h0T r5, defpackage.aOO r6) {
        /*
            boolean r0 = r6 instanceof defpackage.cli
            if (r0 == 0) goto L_0x0013
            r0 = r6
            cli r0 = (defpackage.cli) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            cli r0 = new cli
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f2187R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            a07 r4 = r0.R
            h0T r5 = r0.f2186R
            defpackage.jjU.o(r6)
            goto L_0x0051
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.jjU.o(r6)
            java.lang.Object r6 = r5.getValue()
            a07 r6 = (defpackage.a07) r6
            if (r6 != 0) goto L_0x0054
            a07 r6 = new a07
            r6.<init>()
            r0.f2186R = r5
            r0.R = r6
            r0.e = r3
            java.lang.Object r4 = r4.R(r6, r0)
            if (r4 != r1) goto L_0x0050
            goto L_0x0056
        L_0x0050:
            r4 = r6
        L_0x0051:
            r5.R(r4)
        L_0x0054:
            o8s r1 = defpackage.o8s.R
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mGH.R(p2E, h0T, aOO):java.lang.Object");
    }

    public static final boolean e(h0T h0t) {
        return ((Boolean) h0t.getValue()).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object v(defpackage.p2E r4, defpackage.h0T r5, defpackage.aOO r6) {
        /*
            boolean r0 = r6 instanceof defpackage.fil
            if (r0 == 0) goto L_0x0013
            r0 = r6
            fil r0 = (defpackage.fil) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            fil r0 = new fil
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f3522R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            h0T r5 = r0.R
            defpackage.jjU.o(r6)
            goto L_0x004c
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            defpackage.jjU.o(r6)
            java.lang.Object r6 = r5.getValue()
            a07 r6 = (defpackage.a07) r6
            if (r6 == 0) goto L_0x0050
            bNQ r2 = new bNQ
            r2.<init>(r6)
            r0.R = r5
            r0.e = r3
            java.lang.Object r4 = r4.R(r2, r0)
            if (r4 != r1) goto L_0x004c
            goto L_0x0052
        L_0x004c:
            r4 = 0
            r5.R(r4)
        L_0x0050:
            o8s r1 = defpackage.o8s.R
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mGH.v(p2E, h0T, aOO):java.lang.Object");
    }

    public final ncu c(ncu ncu, m88 m88) {
        ncu ncu2;
        ncu ncu3;
        boolean z;
        ncu ncu4;
        boolean z2;
        ncu ncu5;
        switch (this.X) {
            case 0:
                jr_ jr_ = (jr_) m88;
                jr_.w(1871352361);
                jr_.w(773894976);
                jr_.w(-492369756);
                Object I = jr_.I();
                Object obj = ppN.R;
                if (I == obj) {
                    Object hyo = new hyO(caw.N(jr_));
                    jr_.ZW(hyo);
                    I = hyo;
                }
                jr_.g(false);
                jy_ jy_ = ((hyO) I).R;
                jr_.g(false);
                jr_.w(-492369756);
                Object I2 = jr_.I();
                if (I2 == obj) {
                    I2 = l6.n(null);
                    jr_.ZW(I2);
                }
                jr_.g(false);
                h0T h0t = (h0T) I2;
                jr_.w(-492369756);
                Object I3 = jr_.I();
                if (I3 == obj) {
                    I3 = l6.n(null);
                    jr_.ZW(I3);
                }
                jr_.g(false);
                h0T h0t2 = (h0T) I3;
                jr_.w(-492369756);
                Object I4 = jr_.I();
                if (I4 == obj) {
                    I4 = l6.n(Boolean.FALSE);
                    jr_.ZW(I4);
                }
                jr_.g(false);
                h0T h0t3 = (h0T) I4;
                jr_.w(-492369756);
                Object I5 = jr_.I();
                if (I5 == obj) {
                    I5 = new jzQ();
                    jr_.ZW(I5);
                }
                jr_.g(false);
                jzQ jzq = (jzQ) I5;
                jr_.w(-492369756);
                Object I6 = jr_.I();
                if (I6 == obj) {
                    I6 = new M4();
                    jr_.ZW(I6);
                }
                jr_.g(false);
                ze zeVar = (ze) I6;
                p2E p2e = (p2E) this.R;
                jr_.w(511388516);
                boolean O = jr_.O(h0t) | jr_.O(p2e);
                Object I7 = jr_.I();
                if (O || I7 == obj) {
                    I7 = new mr_(h0t, p2e, 0);
                    jr_.ZW(I7);
                }
                jr_.g(false);
                caw.v(p2e, (kg9) I7, jr_);
                caw.v(Boolean.valueOf(this.f5987R), new V3(this.f5987R, jy_, h0t, (p2E) this.R, 1), jr_);
                if (this.f5987R) {
                    jr_.w(1407541023);
                    if (e(h0t3)) {
                        jr_.w(-492369756);
                        Object I8 = jr_.I();
                        if (I8 == obj) {
                            I8 = new jJd();
                            jr_.ZW(I8);
                        }
                        z = false;
                        jr_.g(false);
                        ncu4 = (ncu) I8;
                    } else {
                        z = false;
                        ncu4 = aff.R;
                    }
                    jr_.g(z);
                    ncu N = cU5.N(aff.R, z, new V4(h0t3, 2, jzq));
                    jr_.w(1157296644);
                    boolean O2 = jr_.O(h0t2);
                    Object I9 = jr_.I();
                    if (O2 || I9 == obj) {
                        z2 = false;
                        I9 = new n2R(h0t2, 0);
                        jr_.ZW(I9);
                    } else {
                        z2 = false;
                    }
                    jr_.g(z2);
                    ncu R = mWb.R(N, new iTa((kg9) I9));
                    lBz lbz = lBz.Y;
                    int i = z2 ? 1 : 0;
                    int i2 = z2 ? 1 : 0;
                    int i3 = z2 ? 1 : 0;
                    ncu g = g4x.g(R, lbz, new x9(i, zeVar));
                    bsy bsy = o2k.R;
                    ncu g2 = g4x.g(g4x.g(g, lbz, new x9(5, jzq)).I(ncu4), lbz, new nzF(2, new lML(jy_, h0t3, zeVar, h0t2, h0t, (p2E) this.R, 1)));
                    bsy bsy2 = ofC.R;
                    ncu3 = g4x.g(g2, lbz, hIO.R);
                } else {
                    ncu3 = aff.R;
                }
                jr_.g(false);
                return ncu3;
            case 1:
                jr_ jr_2 = (jr_) m88;
                jr_2.w(-618949501);
                _0 _0 = new _0(3, (px0) jr_2.x(lnF.x));
                bsy bsy3 = hcI.R;
                ncu g3 = g4x.g(new c4U(_0), lBz.Y, new mGH((p2E) this.R, this.f5987R, 0));
                jr_2.g(false);
                return g3;
            case 2:
                jr_ jr_3 = (jr_) m88;
                jr_3.w(1294013553);
                jr_3.w(773894976);
                jr_3.w(-492369756);
                Object I10 = jr_3.I();
                Object obj2 = ppN.R;
                if (I10 == obj2) {
                    Object hyo2 = new hyO(caw.N(jr_3));
                    jr_3.ZW(hyo2);
                    I10 = hyo2;
                }
                jr_3.g(false);
                jy_ jy_2 = ((hyO) I10).R;
                jr_3.g(false);
                jr_3.w(-492369756);
                Object I11 = jr_3.I();
                if (I11 == obj2) {
                    I11 = l6.n(null);
                    jr_3.ZW(I11);
                }
                jr_3.g(false);
                h0T h0t4 = (h0T) I11;
                p2E p2e2 = (p2E) this.R;
                jr_3.w(511388516);
                boolean O3 = jr_3.O(h0t4) | jr_3.O(p2e2);
                Object I12 = jr_3.I();
                if (O3 || I12 == obj2) {
                    I12 = new mr_(h0t4, p2e2, 1);
                    jr_3.ZW(I12);
                }
                jr_3.g(false);
                caw.v(p2e2, (kg9) I12, jr_3);
                Boolean valueOf = Boolean.valueOf(this.f5987R);
                Object valueOf2 = Boolean.valueOf(this.f5987R);
                p2E p2e3 = (p2E) this.R;
                boolean z3 = this.f5987R;
                jr_3.w(1618982084);
                boolean O4 = jr_3.O(valueOf2) | jr_3.O(h0t4) | jr_3.O(p2e3);
                Object I13 = jr_3.I();
                if (O4 || I13 == obj2) {
                    I13 = new m6Q(p2e3, h0t4, null, z3);
                    jr_3.ZW(I13);
                }
                jr_3.g(false);
                caw.e(valueOf, (iv7) I13, jr_3);
                if (this.f5987R) {
                    aff aff = aff.R;
                    p2E p2e4 = (p2E) this.R;
                    ncu5 = lCG.R(aff, p2e4, new daI(p2e4, h0t4, null, jy_2));
                } else {
                    ncu5 = aff.R;
                }
                jr_3.g(false);
                return ncu5;
            default:
                jr_ jr_4 = (jr_) m88;
                jr_4.w(811087536);
                bQf bqf = (bQf) jr_4.x(lnF.g);
                if (bqf == null) {
                    ncu2 = aff.R;
                } else {
                    Boolean valueOf3 = Boolean.valueOf(this.f5987R);
                    oLw olw = new oLw(this.f5987R, bqf, (oSj) this.R, null);
                    pdm pdm = lCG.R;
                    ncu2 = g4x.g(ncu, lBz.Y, new ezT((oSj) this.R, valueOf3, olw, 1));
                }
                jr_4.g(false);
                return ncu2;
        }
    }

    @Override // defpackage.lR3
    public final /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                ((Number) obj3).intValue();
                return c((ncu) obj, (m88) obj2);
            case 1:
                ((Number) obj3).intValue();
                return c((ncu) obj, (m88) obj2);
            case 2:
                ((Number) obj3).intValue();
                return c((ncu) obj, (m88) obj2);
            default:
                ((Number) obj3).intValue();
                return c((ncu) obj, (m88) obj2);
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mGH(Object obj, boolean z, int i) {
        super(3);
        this.X = i;
        this.R = obj;
        this.f5987R = z;
    }
}
