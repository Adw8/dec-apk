package defpackage;

import dev.kdrag0n.virtcontainer.R;

/* renamed from: o02  reason: default package */
/* loaded from: classes.dex */
public abstract class o02 {
    public static final ovi R = new ovi(0.16f, 0.12f, 0.08f, 0.12f);

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f6651R = {16842755, R.attr.action, R.attr.data, R.attr.dataPattern, R.attr.targetPackage};
    public static final int[] v = {R.attr.navGraph};
    public static final int[] c = {R.attr.graph};

    public static final c0y C(h5L h5l, Object obj, Object obj2, nKE nke, oHg ohg, String str, m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(460682138);
        jr_.w(-3686930);
        boolean O = jr_.O(h5l);
        Object I = jr_.I();
        if (O || I == ppN.R) {
            I = new c0y(h5l, obj, ((Pc) ohg.R.x(obj2)).c(), ohg);
            jr_.ZW(I);
        }
        jr_.g(false);
        c0y c0y = (c0y) I;
        if (h5l.X()) {
            c0y.e(obj, obj2, nke);
        } else {
            c0y.X(obj2, nke);
        }
        caw.v(c0y, new cVI(h5l, 4, c0y), jr_);
        jr_.g(false);
        return c0y;
    }

    public static SE H(SE se) {
        float f = ((O2) se.f506R).R;
        return new SE(se.f507R, Float.valueOf(0.0f), new O2(f), se.R, se.v, se.f509R);
    }

    public static Object L(SE se, Float f, jM jMVar, boolean z, kg9 kg9, plU plu, int i) {
        if ((i & 2) != 0) {
            jMVar = y(0.0f, null, 7);
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            kg9 = a0.x;
        }
        Object e = e(se, new hgI(jMVar, se.f507R, se.getValue(), f, se.f506R), z ? se.R : Long.MIN_VALUE, kg9, plu);
        return e == bGR.COROUTINE_SUSPENDED ? e : o8s.R;
    }

    public static final void N(Hd hd, long j, px pxVar, SE se, kg9 kg9) {
        hd.v = j;
        long j2 = j - hd.R;
        hd.f179R.R(pxVar.X(j2));
        hd.f175R = pxVar.v(j2);
        if (pxVar.L(j2)) {
            hd.c = hd.v;
            hd.f180v.R(Boolean.FALSE);
        }
        i(hd, se);
        kg9.x(hd);
    }

    public static final ija O(kVD kvd, float f, buZ buz, m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(1399864148);
        ija Z = Z(kvd, Float.valueOf(0.0f), Float.valueOf(f), kYZ.R, buz, jr_);
        jr_.g(false);
        return Z;
    }

    public static Pc P(iHW ihw, Pc pc, Pc pc2, Pc pc3) {
        return ihw.c(ihw.X(pc, pc2, pc3), pc, pc2, pc3);
    }

    public static _6 R(float f) {
        return new _6(Float.valueOf(f), kYZ.R, Float.valueOf(0.01f));
    }

    public static final aGK U(h5L h5l, oHg ohg, String str, m88 m88) {
        eDo edo;
        jr_ jr_ = (jr_) m88;
        jr_.w(-44505534);
        jr_.w(-3686930);
        boolean O = jr_.O(h5l);
        Object I = jr_.I();
        if (O || I == ppN.R) {
            I = new aGK(h5l, ohg, str);
            jr_.ZW(I);
        }
        jr_.g(false);
        aGK agk = (aGK) I;
        caw.v(agk, new cVI(h5l, 3, agk), jr_);
        if (h5l.X() && (edo = agk.R) != null) {
            h5L h5l2 = agk.f814R;
            edo.f3037R.e(edo.v.x(h5l2.c().R), edo.v.x(h5l2.c().v), (nKE) edo.f3038R.x(h5l2.c()));
        }
        jr_.g(false);
        return agk;
    }

    public static final h5L V(Object obj, String str, m88 m88, int i, int i2) {
        jr_ jr_ = (jr_) m88;
        jr_.w(1641299376);
        if ((i2 & 2) != 0) {
            str = null;
        }
        jr_.w(-3687241);
        Object I = jr_.I();
        if (I == ppN.R) {
            I = new h5L(new hRH(obj), str);
            jr_.ZW(I);
        }
        jr_.g(false);
        h5L h5l = (h5L) I;
        h5l.R(obj, jr_, (i & 14) | (i & 8) | 48);
        caw.v(h5l, new mLX(h5l, 1), jr_);
        jr_.g(false);
        return h5l;
    }

    public static Object X(SE se, kbU kbu, kg9 kg9, plU plu) {
        Object e = e(se, new eA4(kbu, se.f507R, se.getValue(), se.f506R), Long.MIN_VALUE, kg9, plu);
        return e == bGR.COROUTINE_SUSPENDED ? e : o8s.R;
    }

    public static final ija Z(kVD kvd, Number number, Number number2, oHg ohg, buZ buz, m88 m88) {
        jr_ jr_ = (jr_) m88;
        Object x = jQ.x(jr_, 1847699412, -3687241);
        if (x == ppN.R) {
            x = new ija(kvd, number, number2, ohg, buz);
            jr_.ZW(x);
        }
        jr_.g(false);
        ija ija = (ija) x;
        caw.L(new nHl(number, ija, number2, buz), jr_);
        caw.v(ija, new cVI(kvd, 1, ija), jr_);
        jr_.g(false);
        return ija;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a8, code lost:
        if ((r30 & 4) != 0) goto L_0x00d3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(defpackage.E2 r24, defpackage.eG1 r25, defpackage.c_P r26, defpackage.iv7 r27, defpackage.m88 r28, int r29, int r30) {
        /*
        // Method dump skipped, instructions count: 865
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o02.c(E2, eG1, c_P, iv7, m88, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d3 A[Catch: CancellationException -> 0x0046, TryCatch #2 {CancellationException -> 0x0046, blocks: (B:15:0x0040, B:31:0x00c9, B:33:0x00d3, B:35:0x00e9, B:36:0x00ee), top: B:60:0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(defpackage.SE r25, defpackage.px r26, long r27, defpackage.kg9 r29, defpackage.aOO r30) {
        /*
        // Method dump skipped, instructions count: 298
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o02.e(SE, px, long, kg9, aOO):java.lang.Object");
    }

    public static boolean g(px pxVar, long j) {
        return j >= pxVar.e();
    }

    public static final void i(Hd hd, SE se) {
        se.f508R.R(hd.v());
        Pc pc = se.f506R;
        Pc pc2 = hd.f175R;
        int v2 = pc.v();
        int i = 0;
        while (i < v2) {
            i++;
            pc.X(i, pc2.R(i));
        }
        se.v = hd.c;
        se.R = hd.v;
        se.f509R = hd.e();
    }

    public static buZ j(jXh jxh) {
        return new buZ(jxh, 1, (long) 0);
    }

    public static final oli m(double d) {
        return d < 0.0d ? new oli(0.0d, Math.sqrt(Math.abs(d))) : new oli(Math.sqrt(d), 0.0d);
    }

    public static final Object o(kg9 kg9, plU plu) {
        mOr mor = (mOr) plu.v().O(dq.f2882X);
        return mor == null ? l6.F(kg9, plu) : mor.G();
    }

    public static o3h t(int i, int i2, oUk ouk, int i3) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            ouk = me6.R;
        }
        return new o3h(i, i2, ouk);
    }

    public static SE v(float f, float f2, int i) {
        return new SE(kYZ.R, Float.valueOf(f), new O2((i & 2) != 0 ? 0.0f : f2), (i & 4) != 0 ? Long.MIN_VALUE : 0, (i & 8) != 0 ? Long.MIN_VALUE : 0, false);
    }

    public static final Pc x(Pc pc) {
        Pc c2 = pc.c();
        int i = 0;
        int v2 = c2.v();
        while (i < v2) {
            i++;
            c2.X(i, pc.R(i));
        }
        return c2;
    }

    public static ipq y(float f, Object obj, int i) {
        float f2 = (i & 1) != 0 ? 1.0f : 0.0f;
        if ((i & 2) != 0) {
            f = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new ipq(f2, f, obj);
    }
}
