package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.LockSupport;

/* renamed from: l6  reason: default package */
/* loaded from: classes.dex */
public abstract class l6 {
    public static final lmI R = new lmI("EMPTY");
    public static final lmI v = new lmI("OFFER_SUCCESS");
    public static final lmI c = new lmI("OFFER_FAILED");
    public static final lmI e = new lmI("POLL_FAILED");
    public static final lmI X = new lmI("ENQUEUE_FAILED");
    public static final lmI O = new lmI("ON_CLOSE_HANDLER_INVOKED");

    public static final void A(kg9 kg9, kg9 kg92, f_c f_c) {
        h5 h5Var = aPK.v;
        biT bit = (biT) h5Var.H();
        if (bit == null) {
            biT bit2 = new biT(new kSh[16]);
            h5Var.o(bit2);
            bit = bit2;
        }
        try {
            bit.v(new kSh(kg9, kg92));
            f_c.g();
        } finally {
            bit.N(bit.e - 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object B(defpackage.lIh r5, defpackage.aOO r6) {
        /*
            boolean r0 = r6 instanceof defpackage.hNq
            if (r0 == 0) goto L_0x0013
            r0 = r6
            hNq r0 = (defpackage.hNq) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            hNq r0 = new hNq
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            nWW r5 = r0.f4225R
            defpackage.jjU.o(r6)
            goto L_0x0050
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            defpackage.jjU.o(r6)
            nWW r6 = new nWW
            r6.<init>()
            lmI r2 = defpackage.aJV.f827R
            r6.R = r2
            hki r2 = new hki
            r4 = 13
            r2.<init>(r4, r6)
            r0.f4225R = r6
            r0.e = r3
            java.lang.Object r5 = r5.v(r2, r0)
            if (r5 != r1) goto L_0x004f
            goto L_0x0056
        L_0x004f:
            r5 = r6
        L_0x0050:
            java.lang.Object r1 = r5.R
            lmI r5 = defpackage.aJV.f827R
            if (r1 == r5) goto L_0x0057
        L_0x0056:
            return r1
        L_0x0057:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Flow is empty"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l6.B(lIh, aOO):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [mO, jOh] */
    public static jOh C(jy_ jy_, nzn nzn, iv7 iv7, int i) {
        nbD nbd = nzn;
        if ((i & 1) != 0) {
            nbd = aIH.R;
        }
        boolean z = false;
        int i2 = (i & 2) != 0 ? 1 : 0;
        nbD Q = Q(jy_, nbd);
        if (i2 == 2) {
            z = true;
        }
        hZY hzy = z ? new hZY(Q, iv7) : new jOh(Q, true);
        hzy.mZ(i2, hzy, iv7);
        return hzy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object D(long r7, defpackage.iv7 r9, defpackage.aOO r10) {
        /*
            boolean r0 = r10 instanceof defpackage.kti
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kti r0 = (defpackage.kti) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            kti r0 = new kti
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            nWW r7 = r0.f5459R
            defpackage.jjU.o(r10)     // Catch: maT -> 0x002a
            goto L_0x0058
        L_0x002a:
            r8 = move-exception
            goto L_0x005c
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            defpackage.jjU.o(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x003e
            return r3
        L_0x003e:
            nWW r10 = new nWW
            r10.<init>()
            r0.getClass()     // Catch: maT -> 0x0059
            r0.f5459R = r10     // Catch: maT -> 0x0059
            r0.e = r4     // Catch: maT -> 0x0059
            bjV r2 = new bjV     // Catch: maT -> 0x0059
            r2.<init>(r7, r0)     // Catch: maT -> 0x0059
            r10.R = r2     // Catch: maT -> 0x0059
            java.lang.Object r10 = G(r2, r9)     // Catch: maT -> 0x0059
            if (r10 != r1) goto L_0x0058
            return r1
        L_0x0058:
            return r10
        L_0x0059:
            r7 = move-exception
            r8 = r7
            r7 = r10
        L_0x005c:
            pd2 r9 = r8.R
            java.lang.Object r7 = r7.R
            if (r9 != r7) goto L_0x0063
            return r3
        L_0x0063:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l6.D(long, iv7, aOO):java.lang.Object");
    }

    public static final lIh E(cMC cmc) {
        return new lIh(cmc, 1);
    }

    public static final Object F(kg9 kg9, aOO aoo) {
        kJx kjx = (kJx) aoo.v().O(dq.f2877O);
        if (kjx != null) {
            return kjx.W(kg9, aoo);
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    public static final Object G(bjV bjv, iv7 iv7) {
        Object obj;
        Object _;
        hdJ O2 = ((lZe) bjv).R.v().O(hw1.c);
        mou mou = O2 instanceof mou ? (mou) O2 : null;
        if (mou == null) {
            mou = bEz.R;
        }
        boolean z = false;
        bjv.l(new oRu(0, mou.f(bjv.R, bjv, ((mO) bjv).R)));
        try {
            gvP.L(2, iv7);
            obj = iv7.J(bjv, bjv);
        } catch (Throwable th) {
            obj = new pag(th, false);
        }
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        if (obj == bgr || (_ = bjv._(obj)) == dTl.f2624v) {
            return bgr;
        }
        if (_ instanceof pag) {
            Throwable th2 = ((pag) _).f7100R;
            if (!(th2 instanceof maT) || ((maT) th2).R != bjv) {
                z = true;
            }
            if (z) {
                throw th2;
            } else if (obj instanceof pag) {
                throw ((pag) obj).f7100R;
            }
        } else {
            obj = dTl.G(_);
        }
        return obj;
    }

    public static final void H(int i, int i2, int[] iArr) {
        vC.m(i2 >= 0 && i2 < 67108863);
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & -67108864);
    }

    public static String I(long j, String[] strArr) {
        long j2 = 4294967295L & j;
        long j3 = (j2 ^ (j2 >>> 33)) * 7109453100751455733L;
        long u = pdD.u(((j3 ^ (j3 >>> 28)) * -3808689974395783757L) >>> 32);
        long u2 = pdD.u(u);
        int i = (int) (((j >>> 32) ^ ((u >>> 32) & 65535)) ^ ((u2 >>> 16) & -65536));
        long u3 = pdD.u(u2) ^ (((long) strArr[i / 8191].charAt(i % 8191)) << 32);
        int i2 = (int) ((u3 >>> 32) & 65535);
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3 + 1;
            u3 = pdD.u(u3) ^ (((long) strArr[i4 / 8191].charAt(i4 % 8191)) << 32);
            cArr[i3] = (char) ((int) ((u3 >>> 32) & 65535));
        }
        return new String(cArr);
    }

    public static final cMC J(nWQ nwq) {
        return new cMC(6, nwq);
    }

    public static final lIh K(nWQ nwq) {
        return new lIh(nwq, 0);
    }

    public static final int L(ArrayList arrayList, int i, int i2) {
        int k = k(arrayList, i, i2);
        return k >= 0 ? k : -(k + 1);
    }

    public static final i4m M(nWQ nwq, jy_ jy_, f11 f11, Object obj) {
        lmG lmg;
        YX yx;
        nWQ Z;
        h9 h9Var = h9.SUSPEND;
        gn.R.getClass();
        int i = rE.R;
        if (1 >= i) {
            i = 1;
        }
        int i2 = i - 1;
        boolean z = false;
        if (!(nwq instanceof YX) || (Z = (yx = (YX) nwq).Z()) == null) {
            lmg = new lmG(i2, aIH.R, h9Var, nwq);
        } else {
            int i3 = yx.e;
            if (i3 != -3 && i3 != -2 && i3 != 0) {
                i2 = i3;
            } else if (yx.R != h9Var || i3 == 0) {
                i2 = 0;
            }
            lmg = new lmG(i2, yx.f634R, yx.R, Z);
        }
        ivW O2 = g4x.O(obj);
        nbD nbd = (nbD) lmg.v;
        nWQ nwq2 = (nWQ) lmg.f5828R;
        int i4 = n3x.v(f11, dq.f2880R) ? 1 : 4;
        hk_ hk_ = new hk_(f11, nwq2, O2, obj, null);
        nbD Q = Q(jy_, nbd);
        if (i4 == 2) {
            z = true;
        }
        mO emt = z ? new emT(Q, hk_) : new o7V(Q, true);
        emt.mZ(i4, emt, hk_);
        return new i4m(O2);
    }

    public static nWQ N(YX yx, int i) {
        h9 h9Var = h9.SUSPEND;
        if (i >= 0 || i == -2 || i == -1) {
            if (i == -1) {
                h9Var = h9.DROP_OLDEST;
                i = 0;
            }
            return jjU.U(yx, null, i, h9Var, 1);
        }
        throw new IllegalArgumentException(opT.Z("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i).toString());
    }

    public static final boolean O(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 1073741824) != 0;
    }

    public static final cPP P(kg9 kg9, Object obj, cPP cpp) {
        try {
            kg9.x(obj);
        } catch (Throwable th) {
            if (cpp == null || cpp.getCause() == th) {
                return new cPP("Exception in undelivered element handler for " + obj, th);
            }
            U(cpp, th);
        }
        return cpp;
    }

    public static final nbD Q(jy_ jy_, nbD nbd) {
        nbD h = h(jy_.C(), nbd, true);
        h8R h8r = iFn.R;
        return (h == h8r || h.O(hw1.c) != null) ? h : h.M(h8r);
    }

    public static final void R(bkv[] bkvArr, iv7 iv7, m88 m88, int i) {
        boolean z;
        e76 e76;
        jr_ jr_ = (jr_) m88;
        jr_.q(-1390796515);
        g2d U = jr_.U(null);
        jr_.F(201, vC.v);
        jr_.F(203, vC.e);
        azM azm = new azM(bkvArr, 6, U);
        gvP.L(2, azm);
        boolean z2 = true;
        g2d g2d = (g2d) azm.J(jr_, 1);
        jr_.g(false);
        if (jr_.f5050L) {
            e76 = jr_.xN(U, g2d);
            jr_.f5051O = true;
            z = false;
        } else {
            ilY ily = jr_.f5058R;
            g2d g2d2 = (g2d) ily.L(ily.c, 0);
            ilY ily2 = jr_.f5058R;
            g2d g2d3 = (g2d) ily2.L(ily2.c, 1);
            if (!jr_.J() || !n3x.v(g2d3, g2d)) {
                e76 = jr_.xN(U, g2d);
                z = !n3x.v(e76, g2d2);
            } else {
                jr_.v = jr_.f5058R.N() + jr_.v;
                z = false;
                e76 = g2d2;
            }
        }
        if (z && !jr_.f5050L) {
            jr_.f5083v.put(Integer.valueOf(jr_.f5058R.c), e76);
        }
        jr_.f5077e.v(jr_.f5075c ? 1 : 0);
        jr_.f5075c = z;
        jr_.f5081v = e76;
        jr_.f(202, vC.c, e76, false);
        iv7.J(jr_, Integer.valueOf((i >> 3) & 14));
        jr_.g(false);
        jr_.g(false);
        if (jr_.f5077e.R() == 0) {
            z2 = false;
        }
        jr_.f5075c = z2;
        jr_.f5081v = null;
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new _a(bkvArr, iv7, i, 9);
        }
    }

    public static final boolean S(String str) {
        return !n3x.v(str, "GET") && !n3x.v(str, "HEAD");
    }

    public static final Object T(nbD nbd, iv7 iv7) {
        nbD nbd2;
        mpq mpq;
        Thread currentThread = Thread.currentThread();
        e86 e86 = hw1.c;
        mx9 mx9 = (mx9) nbd.O(e86);
        if (mx9 == null) {
            mpq = dbV.R();
            nbd2 = h(aIH.R, nbd.M(mpq), true);
            h8R h8r = iFn.R;
            if (nbd2 != h8r && nbd2.O(e86) == null) {
                nbd2 = nbd2.M(h8r);
            }
        } else {
            if (mx9 instanceof mpq) {
                mpq mpq2 = (mpq) mx9;
            }
            mpq = (mpq) dbV.R.get();
            nbd2 = h(aIH.R, nbd, true);
            h8R h8r2 = iFn.R;
            if (nbd2 != h8r2 && nbd2.O(e86) == null) {
                nbd2 = nbd2.M(h8r2);
            }
        }
        i2 i2Var = new i2(nbd2, currentThread, mpq);
        i2Var.mZ(1, i2Var, iv7);
        mpq mpq3 = i2Var.f4440R;
        if (mpq3 != null) {
            int i = mpq.e;
            mpq3.cE(false);
        }
        while (!Thread.interrupted()) {
            mpq mpq4 = i2Var.f4440R;
            long xN = mpq4 != null ? mpq4.xN() : Long.MAX_VALUE;
            if (!(!(i2Var.E() instanceof cav))) {
                LockSupport.parkNanos(i2Var, xN);
            } else {
                mpq mpq5 = i2Var.f4440R;
                if (mpq5 != null) {
                    int i2 = mpq.e;
                    mpq5.vl(false);
                }
                Object G = dTl.G(i2Var.E());
                pag pag = G instanceof pag ? (pag) G : null;
                if (pag == null) {
                    return G;
                }
                throw pag.f7100R;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        i2Var.K(interruptedException);
        throw interruptedException;
    }

    public static final void U(Throwable th, Throwable th2) {
        if (th != th2) {
            bmo.R.R(th, th2);
        }
    }

    public static final gHm V(f_c f_c) {
        h5 h5Var = aPK.R;
        return new gHm(f_c);
    }

    public static final ngM W(m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(-1165786124);
        jr_.F(206, vC.O);
        if (jr_.f5050L) {
            mdh.i(jr_.f5065R);
        }
        Object I = jr_.I();
        a3N a3n = I instanceof a3N ? (a3N) I : null;
        if (a3n == null) {
            a3n = new a3N(new ngM(jr_, jr_.O, jr_.f5067R));
            jr_.ZW(a3n);
        }
        a3n.R.f6506R.R(jr_.U(null));
        jr_.g(false);
        ngM ngm = a3n.R;
        jr_.g(false);
        return ngm;
    }

    public static final boolean X(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 268435456) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r5.v(r2, r0) == r1) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object Y(defpackage.nWQ r5, defpackage.iv7 r6, defpackage.aOO r7) {
        /*
            boolean r0 = r7 instanceof defpackage.dBA
            if (r0 == 0) goto L_0x0013
            r0 = r7
            dBA r0 = (defpackage.dBA) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            dBA r0 = new dBA
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f2522R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            oT_ r5 = r0.f2524R
            nWW r6 = r0.f2523R
            iv7 r0 = r0.R
            defpackage.jjU.o(r7)     // Catch: v6 -> 0x002d
            goto L_0x0064
        L_0x002d:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r0
            r0 = r4
            goto L_0x005e
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            defpackage.jjU.o(r7)
            nWW r7 = new nWW
            r7.<init>()
            lmI r2 = defpackage.aJV.f827R
            r7.R = r2
            oT_ r2 = new oT_
            r2.<init>(r6, r7)
            r0.R = r6     // Catch: v6 -> 0x005b
            r0.f2523R = r7     // Catch: v6 -> 0x005b
            r0.f2524R = r2     // Catch: v6 -> 0x005b
            r0.e = r3     // Catch: v6 -> 0x005b
            java.lang.Object r5 = r5.v(r2, r0)     // Catch: v6 -> 0x005b
            if (r5 != r1) goto L_0x0062
            goto L_0x006a
        L_0x005b:
            r5 = move-exception
            r0 = r5
            r5 = r2
        L_0x005e:
            h2V r1 = r0.R
            if (r1 != r5) goto L_0x0082
        L_0x0062:
            r0 = r6
            r6 = r7
        L_0x0064:
            java.lang.Object r1 = r6.R
            lmI r5 = defpackage.aJV.f827R
            if (r1 == r5) goto L_0x006b
        L_0x006a:
            return r1
        L_0x006b:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x0082:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l6.Y(nWQ, iv7, aOO):java.lang.Object");
    }

    public static final int Z(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & 67108863;
    }

    public static final Object a(nbD nbd, iv7 iv7, aOO aoo) {
        nbD v2 = aoo.v();
        nbD M = !((Boolean) nbd.o(Boolean.FALSE, go2.g)).booleanValue() ? v2.M(nbd) : h(v2, nbd, false);
        dTl.K(M);
        if (M == v2) {
            lZe lze = new lZe(aoo, M);
            return n3x.t(lze, lze, iv7);
        }
        hw1 hw1 = hw1.c;
        if (n3x.v(M.O(hw1), v2.O(hw1))) {
            ho9 ho9 = new ho9(aoo, M);
            Object i = cU5.i(M, null);
            try {
                return n3x.t(ho9, ho9, iv7);
            } finally {
                cU5.C(M, i);
            }
        } else {
            otR otr = new otR(aoo, M);
            try {
                ooA.V(n3x.U(n3x.L(otr, otr, iv7)), o8s.R, null);
                return otr.pG();
            } catch (Throwable th) {
                otr.Y(new bvw(th));
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(defpackage.h2V r4, java.lang.Object r5, defpackage.aOO r6) {
        /*
            boolean r0 = r6 instanceof defpackage.kGW
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kGW r0 = (defpackage.kGW) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            kGW r0 = new kGW
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f5232R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002b:
            h2V r4 = r0.R
            defpackage.jjU.o(r6)
            goto L_0x003f
        L_0x0031:
            defpackage.jjU.o(r6)
            r0.R = r4
            r0.e = r3
            java.lang.Object r5 = r4.R(r5, r0)
            if (r5 != r1) goto L_0x003f
            return
        L_0x003f:
            v6 r5 = new v6
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l6.c(h2V, java.lang.Object, aOO):void");
    }

    public static int d(InputStream inputStream, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, 0 + i2, i - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        return i2;
    }

    public static final int e(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    public static final ho9 f(aOO aoo, nbD nbd, Object obj) {
        ho9 ho9 = null;
        if (!(aoo instanceof k5j)) {
            return null;
        }
        if (!(nbd.O(jXl.R) != null)) {
            return null;
        }
        k5j k5j = (k5j) aoo;
        while (true) {
            if (!(k5j instanceof otR) && (k5j = k5j.i()) != null) {
                if (k5j instanceof ho9) {
                    ho9 = (ho9) k5j;
                    break;
                }
            } else {
                break;
            }
        }
        if (ho9 != null) {
            ho9.R.set(new kSh(nbd, obj));
        }
        return ho9;
    }

    public static final void g(AutoCloseable autoCloseable, Throwable th) {
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            U(th, th2);
        }
    }

    public static final nbD h(nbD nbd, nbD nbd2, boolean z) {
        Boolean bool = Boolean.FALSE;
        go2 go2 = go2.g;
        boolean booleanValue = ((Boolean) nbd.o(bool, go2)).booleanValue();
        boolean booleanValue2 = ((Boolean) nbd2.o(bool, go2)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return nbd.M(nbd2);
        }
        nWW nww = new nWW();
        nww.R = nbd2;
        aIH aih = aIH.R;
        nbD nbd3 = (nbD) nbd.o(aih, new jgi(nww, z, 2));
        if (booleanValue2) {
            nww.R = ((nbD) nww.R).o(aih, go2.j);
        }
        return nbd3.M((nbD) nww.R);
    }

    public static final int i(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.Serializable j(defpackage.aOO r4, defpackage.nWQ r5, defpackage.h2V r6) {
        /*
            boolean r0 = r4 instanceof defpackage.n_S
            if (r0 == 0) goto L_0x0013
            r0 = r4
            n_S r0 = (defpackage.n_S) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            n_S r0 = new n_S
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            nWW r5 = r0.f6467R
            defpackage.jjU.o(r4)     // Catch: all -> 0x0029
            goto L_0x004c
        L_0x0029:
            r4 = move-exception
            r1 = r4
            goto L_0x0051
        L_0x002c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0034:
            defpackage.jjU.o(r4)
            nWW r4 = new nWW
            r4.<init>()
            eAU r2 = new eAU     // Catch: all -> 0x004e
            r2.<init>(r6, r4)     // Catch: all -> 0x004e
            r0.f6467R = r4     // Catch: all -> 0x004e
            r0.e = r3     // Catch: all -> 0x004e
            java.lang.Object r4 = r5.v(r2, r0)     // Catch: all -> 0x004e
            if (r4 != r1) goto L_0x004c
            goto L_0x0089
        L_0x004c:
            r1 = 0
            goto L_0x0089
        L_0x004e:
            r5 = move-exception
            r1 = r5
            r5 = r4
        L_0x0051:
            java.lang.Object r4 = r5.R
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r5 = 0
            if (r4 == 0) goto L_0x0060
            boolean r6 = defpackage.n3x.v(r4, r1)
            if (r6 == 0) goto L_0x0060
            r6 = r3
            goto L_0x0061
        L_0x0060:
            r6 = r5
        L_0x0061:
            if (r6 != 0) goto L_0x0096
            nbD r6 = r0.R
            hw1 r0 = defpackage.hw1.O
            hdJ r6 = r6.O(r0)
            pd2 r6 = (defpackage.pd2) r6
            if (r6 == 0) goto L_0x0085
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x0076
            goto L_0x0085
        L_0x0076:
            java.util.concurrent.CancellationException r6 = r6.Z()
            if (r6 == 0) goto L_0x0083
            boolean r6 = defpackage.n3x.v(r6, r1)
            if (r6 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r3 = r5
        L_0x0084:
            r5 = r3
        L_0x0085:
            if (r5 != 0) goto L_0x0096
            if (r4 != 0) goto L_0x008a
        L_0x0089:
            return r1
        L_0x008a:
            boolean r5 = r1 instanceof java.util.concurrent.CancellationException
            if (r5 == 0) goto L_0x0092
            U(r4, r1)
            throw r4
        L_0x0092:
            U(r1, r4)
            throw r1
        L_0x0096:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l6.j(aOO, nWQ, h2V):java.io.Serializable");
    }

    public static final int k(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((WB) arrayList.get(i4)).R;
            if (i5 < 0) {
                i5 += i2;
            }
            int O2 = n3x.O(i5, i);
            if (O2 < 0) {
                i3 = i4 + 1;
            } else if (O2 <= 0) {
                return i4;
            } else {
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final i31 l(f_c f_c) {
        return new i31(new hUu(f_c, null));
    }

    public static final int m(int[] iArr, int i) {
        int i2 = i * 5;
        return i(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static oST n(Object obj) {
        return new oST(obj, bHa.R);
    }

    public static final nWQ o(nWQ nwq) {
        if (nwq instanceof hUt) {
            return nwq;
        }
        g5M g5m = g5M.u;
        go2 go2 = go2.y;
        if (nwq instanceof gUn) {
            gUn gun = (gUn) nwq;
            if (gun.f3766R == g5m && gun.R == go2) {
                return nwq;
            }
        }
        return new gUn(nwq);
    }

    public static final void p(m88 m88, Object obj, iv7 iv7) {
        jr_ jr_ = (jr_) m88;
        if (jr_.f5050L || !n3x.v(jr_.I(), obj)) {
            jr_.ZW(obj);
            mrK mrk = new mrK(iv7, obj);
            if (jr_.f5050L) {
                jr_.f5073c.add(mrk);
                return;
            }
            jr_.Q();
            jr_.u();
            jr_.W(mrk);
        }
    }

    public static final h0T s(Object obj, m88 m88) {
        jr_ jr_ = (jr_) m88;
        Object x = jQ.x(jr_, -1058319986, -492369756);
        if (x == ppN.R) {
            x = n(obj);
            jr_.ZW(x);
        }
        jr_.g(false);
        h0T h0t = (h0T) x;
        h0t.R(obj);
        jr_.g(false);
        return h0t;
    }

    public static final Collection t(Collection collection, Iterable iterable) {
        if (collection instanceof Set) {
            return collection;
        }
        if (!(collection instanceof Collection)) {
            return M0.R ? dF.Kl(collection) : dF.pG(collection);
        }
        if ((iterable instanceof Collection) && ((Collection) iterable).size() < 2) {
            return collection;
        }
        return M0.R && collection.size() > 2 && (collection instanceof ArrayList) ? dF.Kl(collection) : collection;
    }

    public static final void u() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    public static final boolean v(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 67108864) != 0;
    }

    public static final void x(int i, int i2, int[] iArr) {
        vC.m(i2 >= 0);
        iArr[(i * 5) + 3] = i2;
    }

    public static kPU y(f_c f_c) {
        return new kPU(bHa.R, f_c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [mO, o7V] */
    public static o7V z(jy_ jy_, xZ xZVar, int i, iv7 iv7, int i2) {
        nbD nbd = xZVar;
        if ((i2 & 1) != 0) {
            nbd = aIH.R;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        nbD Q = Q(jy_, nbd);
        emT emt = i == 2 ? new emT(Q, iv7) : new o7V(Q, true);
        emt.mZ(i, emt, iv7);
        return emt;
    }
}
