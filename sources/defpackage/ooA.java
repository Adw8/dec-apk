package defpackage;

import android.graphics.Rect;
import dev.kdrag0n.virtcontainer.R;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: ooA  reason: default package */
/* loaded from: classes.dex */
public abstract class ooA {
    public static final /* synthetic */ int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public static final lmI f6956R = new lmI("UNDEFINED");
    public static final lmI v = new lmI("REUSABLE_CLAIMED");

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f6957R = {16843173, 16843551, 16844359, R.attr.alpha, R.attr.lStar};

    /* renamed from: v  reason: collision with other field name */
    public static final int[] f6958v = {R.attr.fontProviderAuthority, R.attr.fontProviderCerts, R.attr.fontProviderFetchStrategy, R.attr.fontProviderFetchTimeout, R.attr.fontProviderPackage, R.attr.fontProviderQuery, R.attr.fontProviderSystemFontFamily};
    public static final int[] c = {16844082, 16844083, 16844095, 16844143, 16844144, R.attr.font, R.attr.fontStyle, R.attr.fontVariationSettings, R.attr.fontWeight, R.attr.ttcIndex};
    public static final int[] e = {16843165, 16843166, 16843169, 16843170, 16843171, 16843172, 16843265, 16843275, 16844048, 16844049, 16844050, 16844051};
    public static final int[] X = {16843173, 16844052};

    public static final gIA C(hjM hjm) {
        hjM g = g(hjm);
        gIA j = g(hjm).j(hjm, true);
        float pG = (float) ((int) (g.pG() >> 32));
        float v2 = (float) ltH.v(g.pG());
        float m = caw.m(j.f3720R, 0.0f, pG);
        float m2 = caw.m(j.v, 0.0f, v2);
        float m3 = caw.m(j.c, 0.0f, pG);
        float m4 = caw.m(j.e, 0.0f, v2);
        if (!(m == m3)) {
            if (!(m2 == m4)) {
                long v3 = g.v(aH9.N(m, m2));
                long v4 = g.v(aH9.N(m3, m2));
                long v5 = g.v(aH9.N(m3, m4));
                long v6 = g.v(aH9.N(m, m4));
                float e2 = aWo.e(v3);
                float[] fArr = {aWo.e(v4), aWo.e(v6), aWo.e(v5)};
                for (int i = 0; i < 3; i++) {
                    e2 = Math.min(e2, fArr[i]);
                }
                float X2 = aWo.X(v3);
                float[] fArr2 = {aWo.X(v4), aWo.X(v6), aWo.X(v5)};
                for (int i2 = 0; i2 < 3; i2++) {
                    X2 = Math.min(X2, fArr2[i2]);
                }
                float e3 = aWo.e(v3);
                float[] fArr3 = {aWo.e(v4), aWo.e(v6), aWo.e(v5)};
                for (int i3 = 0; i3 < 3; i3++) {
                    e3 = Math.max(e3, fArr3[i3]);
                }
                float X3 = aWo.X(v3);
                float[] fArr4 = {aWo.X(v4), aWo.X(v6), aWo.X(v5)};
                for (int i4 = 0; i4 < 3; i4++) {
                    X3 = Math.max(X3, fArr4[i4]);
                }
                return new gIA(e2, X2, e3, X3);
            }
        }
        return gIA.R;
    }

    public static final gIA H(jP7 jp7) {
        poS b = jp7.b();
        if (b != null) {
            return b.j(jp7, true);
        }
        long j = ((l0f) jp7).R;
        return new gIA(0.0f, 0.0f, (float) ((int) (j >> 32)), (float) ltH.v(j));
    }

    public static final String J(float f) {
        int max = Math.max(1, 0);
        float pow = (float) Math.pow((double) 10.0f, (double) max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - ((float) i) >= 0.5f) {
            i++;
        }
        float f3 = ((float) i) / pow;
        return max > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static final g2o K(ojk ojk) {
        return new g2o(ojk.f6899R, ojk.v, ojk.c, ojk.e);
    }

    public static final ncu L(ncu ncu, float f) {
        return !((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0) ? msU.a(ncu, f, 0.0f, null, true, 61435) : ncu;
    }

    public static final void N(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(jQ.U("index: ", i, ", size: ", i2));
        }
    }

    public static final Object[] O(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        P7.r(objArr, objArr2, 0, 0, i, 6);
        int i2 = i + 1;
        System.arraycopy(objArr, i2, objArr2, i, objArr.length - i2);
        return objArr2;
    }

    public static final void P(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(jQ.U("index: ", i, ", size: ", i2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void R(defpackage.kg9 r20, defpackage.ncu r21, defpackage.kg9 r22, defpackage.m88 r23, int r24, int r25) {
        /*
        // Method dump skipped, instructions count: 466
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ooA.R(kg9, ncu, kg9, m88, int, int):void");
    }

    public static final gIA U(hjM hjm) {
        return g(hjm).j(hjm, true);
    }

    public static final void V(aOO aoo, Object obj, kg9 kg9) {
        if (aoo instanceof na6) {
            na6 na6 = (na6) aoo;
            Throwable R2 = mwl.R(obj);
            boolean z = false;
            Object kie = R2 == null ? kg9 != null ? new kIe(obj, kg9) : obj : new pag(R2, false);
            if (na6.f6470R.zw(na6.v())) {
                na6.f6469R = kie;
                na6.e = 1;
                na6.f6470R.mL(na6.v(), na6);
                return;
            }
            mpq R3 = dbV.R();
            if (R3.iE()) {
                na6.f6469R = kie;
                na6.e = 1;
                R3.vr(na6);
                return;
            }
            R3.cE(true);
            try {
                pd2 pd2 = (pd2) na6.v().O(hw1.O);
                if (pd2 != null && !pd2.X()) {
                    CancellationException Z = pd2.Z();
                    na6.R(kie, Z);
                    na6.Y(new bvw(Z));
                    z = true;
                }
                if (!z) {
                    aOO aoo2 = na6.f6468R;
                    Object obj2 = na6.v;
                    nbD v2 = aoo2.v();
                    Object i = cU5.i(v2, obj2);
                    ho9 f = i != cU5.R ? l6.f(aoo2, v2, i) : null;
                    na6.f6468R.Y(obj);
                    if (f == null || f.pG()) {
                        cU5.C(v2, i);
                    }
                }
                do {
                } while (R3.ZW());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        aoo.Y(obj);
    }

    public static final Object[] X(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        P7.r(objArr, objArr2, 0, 0, i, 6);
        int i2 = i + 2;
        System.arraycopy(objArr, i2, objArr2, i, objArr.length - i2);
        return objArr2;
    }

    public static final ncu Y(boolean z, p2E p2e, f8n f8n, boolean z2, fzf fzf, kg9 kg9) {
        return mWb.R(aff.R, h(z ? aJk.On : aJk.Off, p2e, f8n, z2, fzf, new omQ(kg9, z, 0)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if ((!r8) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r8 = defpackage.gKj.c;
        r0.f6961R = r7;
        r0.e = 1;
        r8 = r7.R(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (r8 != r1) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007d, code lost:
        if (r8 == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        return defpackage.o8s.R;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object Z(defpackage.lAs r7, defpackage.aOO r8) {
        /*
            boolean r0 = r8 instanceof defpackage.ooX
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ooX r0 = (defpackage.ooX) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            ooX r0 = new ooX
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            lAs r7 = r0.f6961R
            defpackage.jjU.o(r8)
            goto L_0x0062
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            defpackage.jjU.o(r8)
            iTB r8 = r7.v
            pdm r8 = r8.f4598R
            java.util.List r8 = r8.f7140R
            int r2 = r8.size()
            r5 = r3
        L_0x0040:
            if (r5 >= r2) goto L_0x0051
            java.lang.Object r6 = r8.get(r5)
            phU r6 = (defpackage.phU) r6
            boolean r6 = r6.f7175R
            if (r6 == 0) goto L_0x004e
            r8 = r4
            goto L_0x0052
        L_0x004e:
            int r5 = r5 + 1
            goto L_0x0040
        L_0x0051:
            r8 = r3
        L_0x0052:
            r8 = r8 ^ r4
            if (r8 != 0) goto L_0x007f
        L_0x0055:
            gKj r8 = defpackage.gKj.Final
            r0.f6961R = r7
            r0.e = r4
            java.lang.Object r8 = r7.R(r8, r0)
            if (r8 != r1) goto L_0x0062
            return r1
        L_0x0062:
            pdm r8 = (defpackage.pdm) r8
            java.util.List r8 = r8.f7140R
            int r2 = r8.size()
            r5 = r3
        L_0x006b:
            if (r5 >= r2) goto L_0x007c
            java.lang.Object r6 = r8.get(r5)
            phU r6 = (defpackage.phU) r6
            boolean r6 = r6.f7175R
            if (r6 == 0) goto L_0x0079
            r8 = r4
            goto L_0x007d
        L_0x0079:
            int r5 = r5 + 1
            goto L_0x006b
        L_0x007c:
            r8 = r3
        L_0x007d:
            if (r8 != 0) goto L_0x0055
        L_0x007f:
            o8s r7 = defpackage.o8s.R
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ooA.Z(lAs, aOO):java.lang.Object");
    }

    public static final void c(List list, int i, String str, a1 a1Var, float f, a1 a1Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, m88 m88, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        jr_ jr_ = (jr_) m88;
        jr_.q(-1478270750);
        if ((i6 & 2) != 0) {
            int i10 = jnb.R;
            i7 = 0;
        } else {
            i7 = i;
        }
        String str2 = (i6 & 4) != 0 ? "" : str;
        a1 a1Var3 = (i6 & 8) != 0 ? null : a1Var;
        float f8 = (i6 & 16) != 0 ? 1.0f : f;
        a1 a1Var4 = (i6 & 32) != 0 ? null : a1Var2;
        float f9 = (i6 & 64) != 0 ? 1.0f : f2;
        float f10 = (i6 & 128) != 0 ? 0.0f : f3;
        if ((i6 & 256) != 0) {
            int i11 = jnb.R;
            i8 = 0;
        } else {
            i8 = i2;
        }
        if ((i6 & 512) != 0) {
            int i12 = jnb.R;
            i9 = 0;
        } else {
            i9 = i3;
        }
        float f11 = (i6 & 1024) != 0 ? 4.0f : f4;
        float f12 = (i6 & 2048) != 0 ? 0.0f : f5;
        float f13 = (i6 & 4096) != 0 ? 1.0f : f6;
        float f14 = (i6 & 8192) != 0 ? 0.0f : f7;
        em2 em2 = em2.R;
        jr_.w(1886828752);
        if (jr_.f5052R instanceof hBj) {
            jr_.D();
            if (jr_.f5050L) {
                jr_.H(new _d(em2, 4));
            } else {
                jr_.BF();
            }
            l6.p(jr_, str2, hY0.R);
            l6.p(jr_, list, jLC.R);
            l6.p(jr_, new a2Y(i7), nsg.R);
            l6.p(jr_, a1Var3, kOX.R);
            l6.p(jr_, Float.valueOf(f8), oti.R);
            l6.p(jr_, a1Var4, c3x.R);
            l6.p(jr_, Float.valueOf(f9), luO.R);
            l6.p(jr_, Float.valueOf(f10), m5l.R);
            l6.p(jr_, new oGA(i9), h6e.R);
            l6.p(jr_, new nuR(i8), lVW.R);
            l6.p(jr_, Float.valueOf(f11), f0M.R);
            l6.p(jr_, Float.valueOf(f12), bLD.R);
            l6.p(jr_, Float.valueOf(f13), p0z.R);
            l6.p(jr_, Float.valueOf(f14), hrD.R);
            jr_.g(true);
            jr_.g(false);
            dYh t = jr_.t();
            if (t != null) {
                t.f2666R = new jsz(list, i7, str2, a1Var3, f8, a1Var4, f9, f10, i8, i9, f11, f12, f13, f14, i4, i5, i6);
                return;
            }
            return;
        }
        l6.u();
        throw null;
    }

    public static final Object[] e(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        P7.r(objArr, objArr2, 0, 0, i, 6);
        System.arraycopy(objArr, i, objArr2, i + 2, objArr.length - i);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final hjM g(hjM hjm) {
        poS pos = hjm.b();
        poS pos2 = hjm;
        while (pos != null) {
            pos = pos.b();
            pos2 = pos;
        }
        poS pos3 = pos2 instanceof poS ? pos2 : null;
        if (pos3 == null) {
            return pos2;
        }
        pos3 = pos3.f7284v;
        while (pos3 != null) {
            pos3 = pos3.f7284v;
        }
        return pos3;
    }

    public static final ncu h(aJk ajk, p2E p2e, f8n f8n, boolean z, fzf fzf, f_c f_c) {
        aff aff = aff.R;
        return mWb.R(aff, cU5.N(dTl.t(aff, p2e, f8n, z, fzf, f_c, 8), false, new _0(15, ajk)));
    }

    public static final long i(hjM hjm) {
        int i = aWo.R;
        return hjm.X(aWo.v);
    }

    public static final void j(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder y = jQ.y("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
            y.append(i3);
            throw new IndexOutOfBoundsException(y.toString());
        } else if (i > i2) {
            throw new IllegalArgumentException(jQ.U("fromIndex: ", i, " > toIndex: ", i2));
        }
    }

    public static final ncu m(ncu ncu, long j, n76 n76) {
        return ncu.I(new lp(new n3(j), n76));
    }

    public static final Rect o(gIA gia) {
        return new Rect((int) gia.f3720R, (int) gia.v, (int) gia.c, (int) gia.e);
    }

    public static final float t(iRR irr, int i, boolean z, boolean z2) {
        boolean z3 = false;
        if (irr.R(((!z || z2) && (z || !z2)) ? Math.max(i - 1, 0) : i) == irr.C(i)) {
            z3 = true;
        }
        pm5 pm5 = irr.f4592R;
        pm5.c(i);
        pps pps = (pps) pm5.f7261v.get(i == pm5.f7258R.R.length() ? pdD.i(pm5.f7261v) : cU5.X(i, pm5.f7261v));
        return pps.f7288R.c(pps.R(i), z3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v(java.lang.String r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, java.util.List r27, defpackage.iv7 r28, defpackage.m88 r29, int r30, int r31) {
        /*
        // Method dump skipped, instructions count: 587
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ooA.v(java.lang.String, float, float, float, float, float, float, float, java.util.List, iv7, m88, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008c A[Catch: CancellationException -> 0x0096, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0096, blocks: (B:32:0x0075, B:35:0x008c), top: B:57:0x0075 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0090 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object y(defpackage.ck3 r10, defpackage.iv7 r11, defpackage.aOO r12) {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ooA.y(ck3, iv7, aOO):java.lang.Object");
    }
}
