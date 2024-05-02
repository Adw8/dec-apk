package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: jr_  reason: default package */
/* loaded from: classes.dex */
public final class jr_ implements m88 {
    public int H;
    public int L;

    /* renamed from: L  reason: collision with other field name */
    public boolean f5050L;
    public int O;

    /* renamed from: O  reason: collision with other field name */
    public boolean f5051O;
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final Su f5052R;

    /* renamed from: R  reason: collision with other field name */
    public WB f5053R;

    /* renamed from: R  reason: collision with other field name */
    public final fzE f5055R;

    /* renamed from: R  reason: collision with other field name */
    public final hYA f5057R;

    /* renamed from: R  reason: collision with other field name */
    public ilY f5058R;

    /* renamed from: R  reason: collision with other field name */
    public HashMap f5060R;

    /* renamed from: R  reason: collision with other field name */
    public List f5061R;

    /* renamed from: R  reason: collision with other field name */
    public final Set f5062R;

    /* renamed from: R  reason: collision with other field name */
    public mMV f5064R;

    /* renamed from: R  reason: collision with other field name */
    public mdh f5065R;

    /* renamed from: R  reason: collision with other field name */
    public final mq9 f5066R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5067R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f5068R;
    public int U;
    public int X;

    /* renamed from: X  reason: collision with other field name */
    public final l7M f5069X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f5070X;
    public int Z;

    /* renamed from: Z  reason: collision with other field name */
    public boolean f5071Z;

    /* renamed from: c  reason: collision with other field name */
    public btA f5072c;

    /* renamed from: c  reason: collision with other field name */
    public final ArrayList f5073c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f5075c;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public final btA f5076e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f5078e;
    public int m;

    /* renamed from: m  reason: collision with other field name */
    public boolean f5079m;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public g2d f5081v;

    /* renamed from: v  reason: collision with other field name */
    public ArrayList f5082v;

    /* renamed from: v  reason: collision with other field name */
    public List f5084v;

    /* renamed from: v  reason: collision with other field name */
    public mq9 f5086v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f5087v;
    public int x;

    /* renamed from: R  reason: collision with other field name */
    public final btA f5054R = new btA();

    /* renamed from: R  reason: collision with other field name */
    public l7M f5063R = new l7M();

    /* renamed from: v  reason: collision with other field name */
    public l7M f5085v = new l7M();

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f5059R = new ArrayList();

    /* renamed from: c  reason: collision with other field name */
    public final l7M f5074c = new l7M();

    /* renamed from: R  reason: collision with other field name */
    public g2d f5056R = e76.R;

    /* renamed from: v  reason: collision with other field name */
    public final HashMap f5083v = new HashMap();

    /* renamed from: e  reason: collision with other field name */
    public final l7M f5077e = new l7M();
    public int c = -1;

    /* renamed from: v  reason: collision with other field name */
    public final btA f5080v = new btA();

    /* JADX INFO: finally extract failed */
    public jr_(s8 s8Var, hYA hya, mq9 mq9, HashSet hashSet, ArrayList arrayList, ArrayList arrayList2, fzE fze) {
        this.f5052R = s8Var;
        this.f5057R = hya;
        this.f5066R = mq9;
        this.f5062R = hashSet;
        this.f5061R = arrayList;
        this.f5084v = arrayList2;
        this.f5055R = fze;
        jwU.L();
        ilY c = mq9.c();
        c.c();
        this.f5058R = c;
        mq9 mq92 = new mq9();
        this.f5086v = mq92;
        mdh H = mq92.H();
        H.O();
        this.f5065R = H;
        ilY c2 = this.f5086v.c();
        try {
            WB R = c2.R(0);
            c2.c();
            this.f5053R = R;
            this.f5073c = new ArrayList();
            this.f5072c = new btA();
            this.f5079m = true;
            this.f5069X = new l7M();
            this.f5076e = new btA();
            this.m = -1;
            this.x = -1;
            this.H = -1;
        } catch (Throwable th) {
            c2.c();
            throw th;
        }
    }

    public static final int B(jr_ jr_, int i, boolean z, int i2) {
        ilY ily = jr_.f5058R;
        int[] iArr = ily.f4714R;
        int i3 = i * 5;
        if ((iArr[i3 + 1] & 134217728) != 0) {
            int i4 = iArr[i3];
            Object H = ily.H(iArr, i);
            if (i4 != 206 || !n3x.v(H, vC.O)) {
                return l6.Z(jr_.f5058R.f4714R, i);
            }
            Object L = jr_.f5058R.L(i, 0);
            a3N a3n = L instanceof a3N ? (a3N) L : null;
            if (a3n != null) {
                for (jr_ jr_2 : a3n.R.f6504R) {
                    jr_2.G();
                }
            }
            return l6.Z(jr_.f5058R.f4714R, i);
        } else if (!l6.v(iArr, i)) {
            return l6.Z(jr_.f5058R.f4714R, i);
        } else {
            int Z = jr_.f5058R.Z(i) + i;
            int i5 = i + 1;
            int i6 = 0;
            while (i5 < Z) {
                boolean m = jr_.f5058R.m(i5);
                if (m) {
                    jr_.z();
                    jr_.f5072c.e(jr_.f5058R.x(i5));
                }
                i6 += B(jr_, i5, m || z, m ? 0 : i2 + i6);
                if (m) {
                    jr_.z();
                    jr_.k();
                }
                i5 += jr_.f5058R.Z(i5);
            }
            return i6;
        }
    }

    public static final void h(mdh mdh, Su su, int i) {
        while (true) {
            int i2 = mdh.U;
            if (!((i > i2 && i < mdh.c) || (i2 == 0 && i == 0))) {
                mdh.d();
                if (mdh.t(mdh.U)) {
                    su.e();
                }
                mdh.m();
            } else {
                return;
            }
        }
    }

    public static Object l(kxN kxn, g2d g2d) {
        if (!((e76) g2d).containsKey(kxn)) {
            return kxn.R.getValue();
        }
        dH9 dh9 = (dH9) ((e76) g2d).get(kxn);
        if (dh9 != null) {
            return dh9.getValue();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:3:0x000d, B:5:0x0013, B:6:0x0018, B:9:0x001e, B:14:0x002f, B:15:0x003c), top: B:21:0x000d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v(defpackage.jr_ r7, defpackage.g2d r8, java.lang.Object r9) {
        /*
            r0 = 126665345(0x78cc281, float:2.1179178E-34)
            r1 = 0
            r2 = 0
            r7.f(r0, r1, r1, r2)
            r7.O(r9)
            int r3 = r7.O
            r7.O = r0     // Catch: all -> 0x006c
            boolean r0 = r7.f5050L     // Catch: all -> 0x006c
            if (r0 == 0) goto L_0x0018
            mdh r0 = r7.f5065R     // Catch: all -> 0x006c
            defpackage.mdh.i(r0)     // Catch: all -> 0x006c
        L_0x0018:
            boolean r0 = r7.f5050L     // Catch: all -> 0x006c
            r4 = 1
            if (r0 == 0) goto L_0x001e
            goto L_0x002c
        L_0x001e:
            ilY r0 = r7.f5058R     // Catch: all -> 0x006c
            java.lang.Object r0 = r0.X()     // Catch: all -> 0x006c
            boolean r0 = defpackage.n3x.v(r0, r8)     // Catch: all -> 0x006c
            if (r0 != 0) goto L_0x002c
            r0 = r4
            goto L_0x002d
        L_0x002c:
            r0 = r2
        L_0x002d:
            if (r0 == 0) goto L_0x003c
            java.util.HashMap r5 = r7.f5083v     // Catch: all -> 0x006c
            ilY r6 = r7.f5058R     // Catch: all -> 0x006c
            int r6 = r6.c     // Catch: all -> 0x006c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: all -> 0x006c
            r5.put(r6, r8)     // Catch: all -> 0x006c
        L_0x003c:
            r5 = 202(0xca, float:2.83E-43)
            f3L r6 = defpackage.vC.c     // Catch: all -> 0x006c
            r7.f(r5, r6, r8, r2)     // Catch: all -> 0x006c
            boolean r8 = r7.f5050L     // Catch: all -> 0x006c
            boolean r8 = r7.f5075c     // Catch: all -> 0x006c
            r7.f5075c = r0     // Catch: all -> 0x006c
            r0 = 694380496(0x296367d0, float:5.049417E-14)
            azM r5 = new azM     // Catch: all -> 0x006c
            r6 = 5
            r5.<init>(r1, r6, r9)     // Catch: all -> 0x006c
            dNH r9 = defpackage.aH9.u(r5, r4, r0)     // Catch: all -> 0x006c
            r0 = 2
            defpackage.gvP.L(r0, r9)     // Catch: all -> 0x006c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: all -> 0x006c
            r9.J(r7, r0)     // Catch: all -> 0x006c
            r7.f5075c = r8     // Catch: all -> 0x006c
            r7.g(r2)
            r7.O = r3
            r7.g(r2)
            return
        L_0x006c:
            r8 = move-exception
            r7.g(r2)
            r7.O = r3
            r7.g(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr_.v(jr_, g2d, java.lang.Object):void");
    }

    public final boolean A(mAv mav) {
        if (this.f5061R.isEmpty()) {
            if (!(mav.R > 0) && !(!this.f5059R.isEmpty())) {
                return false;
            }
            N(mav, null);
            return !this.f5061R.isEmpty();
        }
        vC.e("Expected applyChanges() to have been called".toString());
        throw null;
    }

    public final void BF() {
        if (this.f5087v) {
            this.f5087v = false;
            if (!this.f5050L) {
                ilY ily = this.f5058R;
                this.f5072c.e(ily.x(ily.X));
                return;
            }
            vC.e("useNode() called while inserting".toString());
            throw null;
        }
        vC.e("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
        throw null;
    }

    public final void C() {
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.f5057R.C(this);
            this.f5080v.R.clear();
            this.f5059R.clear();
            this.f5061R.clear();
            this.f5083v.clear();
            this.f5052R.clear();
        } finally {
            Trace.endSection();
        }
    }

    public final void D() {
        int i = 126;
        if (this.f5050L || (!this.f5078e ? this.f5058R.O() != 126 : this.f5058R.O() != 125)) {
            i = 125;
        }
        f(i, null, null, true);
        this.f5087v = true;
    }

    public final void E() {
        if (this.v == 0) {
            dYh o = o();
            if (o != null) {
                o.R |= 16;
            }
            if (this.f5059R.isEmpty()) {
                M();
            } else {
                d();
            }
        } else {
            vC.e("No nodes can be emitted before calling skipAndEndGroup".toString());
            throw null;
        }
    }

    public final void F(int i, f3L f3l) {
        f(i, f3l, null, false);
    }

    public final void G() {
        mq9 mq9 = this.f5066R;
        if (mq9.e > 0 && l6.v(mq9.f6199R, 0)) {
            ArrayList arrayList = new ArrayList();
            this.f5082v = arrayList;
            ilY c = this.f5066R.c();
            try {
                this.f5058R = c;
                List list = this.f5061R;
                this.f5061R = arrayList;
                B(this, 0, false, 0);
                z();
                Q();
                if (this.f5071Z) {
                    W(G9.Y);
                    if (this.f5071Z) {
                        r(false, G9.o);
                        this.f5071Z = false;
                    }
                }
                this.f5061R = list;
            } finally {
                c.c();
            }
        }
    }

    public final void H(f_c f_c) {
        if (this.f5087v) {
            this.f5087v = false;
            if (this.f5050L) {
                l7M l7m = this.f5063R;
                int i = l7m.f5588R[l7m.v - 1];
                mdh mdh = this.f5065R;
                WB v = mdh.v(mdh.U);
                this.v++;
                this.f5073c.add(new bVD(f_c, v, i, 0));
                this.f5076e.e(new nQG(i, 1, v));
                return;
            }
            vC.e("createNode() can only be called when inserting".toString());
            throw null;
        }
        vC.e("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
        throw null;
    }

    public final Object I() {
        Object obj;
        int i;
        if (!this.f5050L) {
            ilY ily = this.f5058R;
            if (ily.O > 0 || (i = ily.L) >= ily.Z) {
                obj = ppN.R;
            } else {
                Object[] objArr = ily.f4715R;
                ily.L = i + 1;
                obj = objArr[i];
            }
            return this.f5078e ? ppN.R : obj;
        } else if (!this.f5087v) {
            return ppN.R;
        } else {
            vC.e("A call to createNode(), emitNode() or useNode() expected".toString());
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean J() {
        /*
            r3 = this;
            boolean r0 = r3.f5050L
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0025
            boolean r0 = r3.f5078e
            if (r0 != 0) goto L_0x0025
            boolean r0 = r3.f5075c
            if (r0 != 0) goto L_0x0025
            dYh r3 = r3.o()
            if (r3 == 0) goto L_0x0021
            int r3 = r3.R
            r3 = r3 & 8
            if (r3 == 0) goto L_0x001c
            r3 = r1
            goto L_0x001d
        L_0x001c:
            r3 = r2
        L_0x001d:
            if (r3 != 0) goto L_0x0021
            r3 = r1
            goto L_0x0022
        L_0x0021:
            r3 = r2
        L_0x0022:
            if (r3 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = r2
        L_0x0026:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr_.J():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean K() {
        /*
            r3 = this;
            boolean r0 = r3.f5075c
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001c
            dYh r3 = r3.o()
            if (r3 == 0) goto L_0x0019
            int r3 = r3.R
            r3 = r3 & 4
            if (r3 == 0) goto L_0x0014
            r3 = r2
            goto L_0x0015
        L_0x0014:
            r3 = r1
        L_0x0015:
            if (r3 != r2) goto L_0x0019
            r3 = r2
            goto L_0x001a
        L_0x0019:
            r3 = r1
        L_0x001a:
            if (r3 == 0) goto L_0x001d
        L_0x001c:
            r1 = r2
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr_.K():boolean");
    }

    public final boolean L(boolean z) {
        Object I = I();
        if ((I instanceof Boolean) && z == ((Boolean) I).booleanValue()) {
            return false;
        }
        ZW(Boolean.valueOf(z));
        return true;
    }

    public final void M() {
        ilY ily = this.f5058R;
        int i = ily.X;
        this.v = i >= 0 ? l6.Z(ily.f4714R, i) : 0;
        this.f5058R.P();
    }

    public final void N(mAv mav, dNH dnh) {
        if (!this.f5070X) {
            Trace.beginSection("Compose:recompose");
            try {
                this.X = jwU.L().e();
                this.f5083v.clear();
                int i = mav.R;
                for (int i2 = 0; i2 < i; i2++) {
                    Object obj = ((Object[]) mav.f5962R)[i2];
                    kyQ kyq = (kyQ) ((Object[]) mav.v)[i2];
                    dYh dyh = (dYh) obj;
                    WB wb = dyh.f2663R;
                    if (wb != null) {
                        this.f5059R.add(new pnH(dyh, wb.R, kyq));
                    } else {
                        Trace.endSection();
                        return;
                    }
                }
                ArrayList arrayList = this.f5059R;
                if (arrayList.size() > 1) {
                    gvk gvk = new gvk(0);
                    if (arrayList.size() > 1) {
                        Collections.sort(arrayList, gvk);
                    }
                }
                this.R = 0;
                this.f5070X = true;
                X4();
                Object I = I();
                if (!(I == dnh || dnh == null)) {
                    ZW(dnh);
                }
                l6.A(new orl(this, 0), new orl(this, 1), new h31(dnh, this, I, 3));
                i();
                this.f5070X = false;
                this.f5059R.clear();
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            vC.e("Reentrant composition is not supported".toString());
            throw null;
        }
    }

    public final boolean O(Object obj) {
        if (n3x.v(I(), obj)) {
            return false;
        }
        ZW(obj);
        return true;
    }

    public final void P(int i, int i2) {
        if (i > 0 && i != i2) {
            P(this.f5058R.U(i), i2);
            if (this.f5058R.m(i)) {
                this.f5072c.e(this.f5058R.x(i));
            }
        }
    }

    public final void Q() {
        int i = this.L;
        if (i > 0) {
            this.L = 0;
            W(new bgC(i, 1));
        }
    }

    public final void R() {
        Z();
        this.f5054R.R.clear();
        this.f5063R.v = 0;
        this.f5085v.v = 0;
        this.f5074c.v = 0;
        this.f5077e.v = 0;
        this.f5083v.clear();
        ilY ily = this.f5058R;
        if (!ily.f4713R) {
            ily.c();
        }
        mdh mdh = this.f5065R;
        if (!mdh.f6091R) {
            mdh.O();
        }
        vC.m(this.f5065R.f6091R);
        mq9 mq9 = new mq9();
        this.f5086v = mq9;
        mdh H = mq9.H();
        H.O();
        this.f5065R = H;
        this.O = 0;
        this.e = 0;
        this.f5087v = false;
        this.f5050L = false;
        this.f5078e = false;
        this.f5070X = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        if (r0 == null) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object S(defpackage.fzE r15, defpackage.fzE r16, java.lang.Integer r17, java.util.List r18, defpackage.f_c r19) {
        /*
            r14 = this;
            r1 = r14
            r0 = r16
            boolean r2 = r1.f5079m
            boolean r3 = r1.f5070X
            int r4 = r1.R
            r5 = 0
            r1.f5079m = r5     // Catch: all -> 0x007e
            r6 = 1
            r1.f5070X = r6     // Catch: all -> 0x007e
            r1.R = r5     // Catch: all -> 0x007e
            int r6 = r18.size()     // Catch: all -> 0x007e
            r7 = r5
        L_0x0016:
            r8 = 0
            if (r7 >= r6) goto L_0x0040
            r9 = r18
            java.lang.Object r10 = r9.get(r7)     // Catch: all -> 0x007e
            kSh r10 = (defpackage.kSh) r10     // Catch: all -> 0x007e
            java.lang.Object r11 = r10.R     // Catch: all -> 0x007e
            dYh r11 = (defpackage.dYh) r11     // Catch: all -> 0x007e
            java.lang.Object r10 = r10.v     // Catch: all -> 0x007e
            kyQ r10 = (defpackage.kyQ) r10     // Catch: all -> 0x007e
            if (r10 == 0) goto L_0x003a
            int r8 = r10.e     // Catch: all -> 0x007e
            r12 = r5
        L_0x002e:
            if (r12 >= r8) goto L_0x003d
            java.lang.Object[] r13 = r10.R     // Catch: all -> 0x007e
            r13 = r13[r12]     // Catch: all -> 0x007e
            r14.zw(r11, r13)     // Catch: all -> 0x007e
            int r12 = r12 + 1
            goto L_0x002e
        L_0x003a:
            r14.zw(r11, r8)     // Catch: all -> 0x007e
        L_0x003d:
            int r7 = r7 + 1
            goto L_0x0016
        L_0x0040:
            if (r15 == 0) goto L_0x0073
            if (r17 == 0) goto L_0x0049
            int r6 = r17.intValue()     // Catch: all -> 0x007e
            goto L_0x004a
        L_0x0049:
            r6 = -1
        L_0x004a:
            r7 = r15
            hAe r7 = (defpackage.hAe) r7     // Catch: all -> 0x007e
            if (r0 == 0) goto L_0x006d
            boolean r9 = defpackage.n3x.v(r0, r7)     // Catch: all -> 0x007e
            if (r9 != 0) goto L_0x006d
            if (r6 < 0) goto L_0x006d
            hAe r0 = (defpackage.hAe) r0     // Catch: all -> 0x007e
            r7.f4141R = r0     // Catch: all -> 0x007e
            r7.e = r6     // Catch: all -> 0x007e
            java.lang.Object r0 = r19.g()     // Catch: all -> 0x0066
            r7.f4141R = r8     // Catch: all -> 0x007e
            r7.e = r5     // Catch: all -> 0x007e
            goto L_0x0071
        L_0x0066:
            r0 = move-exception
            r6 = r0
            r7.f4141R = r8     // Catch: all -> 0x007e
            r7.e = r5     // Catch: all -> 0x007e
            throw r6     // Catch: all -> 0x007e
        L_0x006d:
            java.lang.Object r0 = r19.g()     // Catch: all -> 0x007e
        L_0x0071:
            if (r0 != 0) goto L_0x0077
        L_0x0073:
            java.lang.Object r0 = r19.g()     // Catch: all -> 0x007e
        L_0x0077:
            r1.f5079m = r2
            r1.f5070X = r3
            r1.R = r4
            return r0
        L_0x007e:
            r0 = move-exception
            r1.f5079m = r2
            r1.f5070X = r3
            r1.R = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr_.S(fzE, fzE, java.lang.Integer, java.util.List, f_c):java.lang.Object");
    }

    public final void T(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                vC.e(("Invalid remove index " + i).toString());
                throw null;
            } else if (this.m == i) {
                this.U += i2;
            } else {
                z();
                this.m = i;
                this.U = i2;
            }
        }
    }

    public final g2d U(Integer num) {
        g2d g2d;
        if (num == null && (g2d = this.f5081v) != null) {
            return g2d;
        }
        if (this.f5050L && this.f5051O) {
            int i = this.f5065R.U;
            while (i > 0) {
                mdh mdh = this.f5065R;
                if (mdh.f6092R[mdh.N(i) * 5] == 202) {
                    mdh mdh2 = this.f5065R;
                    int N = mdh2.N(i);
                    int[] iArr = mdh2.f6092R;
                    int i2 = N * 5;
                    int i3 = iArr[i2 + 1];
                    if (n3x.v((536870912 & i3) != 0 ? mdh2.f6093R[l6.i(i3 >> 30) + iArr[i2 + 4]] : null, vC.c)) {
                        mdh mdh3 = this.f5065R;
                        int N2 = mdh3.N(i);
                        g2d g2d2 = (g2d) (l6.X(mdh3.f6092R, N2) ? mdh3.f6093R[mdh3.e(mdh3.f6092R, N2)] : ppN.R);
                        this.f5081v = g2d2;
                        return g2d2;
                    }
                }
                i = this.f5065R.h(i);
            }
        }
        ilY ily = this.f5058R;
        if (ily.R > 0) {
            int intValue = num != null ? num.intValue() : ily.X;
            while (intValue > 0) {
                ilY ily2 = this.f5058R;
                int[] iArr2 = ily2.f4714R;
                if (iArr2[intValue * 5] != 202 || !n3x.v(ily2.H(iArr2, intValue), vC.c)) {
                    intValue = this.f5058R.U(intValue);
                } else {
                    g2d g2d3 = (g2d) this.f5083v.get(Integer.valueOf(intValue));
                    if (g2d3 == null) {
                        ilY ily3 = this.f5058R;
                        g2d3 = (g2d) ily3.v(ily3.f4714R, intValue);
                    }
                    this.f5081v = g2d3;
                    return g2d3;
                }
            }
        }
        g2d g2d4 = this.f5056R;
        this.f5081v = g2d4;
        return g2d4;
    }

    public final void V(boolean z, mMV mmv) {
        this.f5054R.e(this.f5064R);
        this.f5064R = mmv;
        this.f5063R.v(this.R);
        if (z) {
            this.R = 0;
        }
        this.f5085v.v(this.v);
        this.v = 0;
    }

    public final void W(lR3 lr3) {
        this.f5061R.add(lr3);
    }

    public final boolean X(long j) {
        Object I = I();
        if ((I instanceof Long) && j == ((Number) I).longValue()) {
            return false;
        }
        ZW(Long.valueOf(j));
        return true;
    }

    public final void X4() {
        this.f5058R = this.f5066R.c();
        f(100, null, null, false);
        this.f5057R.U();
        this.f5056R = this.f5057R.e();
        this.f5077e.v(this.f5075c ? 1 : 0);
        this.f5075c = O(this.f5056R);
        this.f5081v = null;
        if (!this.f5067R) {
            this.f5067R = this.f5057R.c();
        }
        Set set = (Set) l(ntS.R, this.f5056R);
        if (set != null) {
            set.add(this.f5066R);
            this.f5057R.x(set);
        }
        f(this.f5057R.X(), null, null, false);
    }

    public final void Y(ArrayList arrayList) {
        List list = this.f5084v;
        List list2 = this.f5061R;
        try {
            this.f5061R = list;
            W(G9.J);
            if (arrayList.size() <= 0) {
                W(G9.V);
                this.Z = 0;
                return;
            }
            kSh ksh = (kSh) arrayList.get(0);
            p4d p4d = (p4d) ksh.R;
            p4d p4d2 = (p4d) ksh.v;
            p4d.getClass();
            p4d.getClass();
            throw null;
        } finally {
            this.f5061R = list2;
        }
    }

    public final void Z() {
        this.f5064R = null;
        this.R = 0;
        this.v = 0;
        this.Z = 0;
        this.O = 0;
        this.f5087v = false;
        this.f5071Z = false;
        this.f5069X.v = 0;
        this.f5080v.R.clear();
        this.f5068R = null;
        this.f5060R = null;
    }

    public final void ZW(Object obj) {
        if (this.f5050L) {
            this.f5065R.k(obj);
            if (obj instanceof ddq) {
                W(new mBy(0, obj));
                this.f5062R.add(obj);
                return;
            }
            return;
        }
        ilY ily = this.f5058R;
        int m = (ily.L - l6.m(ily.f4714R, ily.X)) - 1;
        if (obj instanceof ddq) {
            this.f5062R.add(obj);
        }
        r(true, new nQG(m, 0, obj));
    }

    public final void _(Object obj) {
        if (this.f5058R.O() == 207 && !n3x.v(this.f5058R.X(), obj) && this.c < 0) {
            this.c = this.f5058R.c;
            this.f5078e = true;
        }
        f(207, null, obj, false);
    }

    public final void a() {
        f(-127, null, null, false);
    }

    public final void b(Object obj, boolean z) {
        if (z) {
            ilY ily = this.f5058R;
            if (ily.O > 0) {
                return;
            }
            if (l6.O(ily.f4714R, ily.c)) {
                ily.j();
                return;
            }
            throw new IllegalArgumentException("Expected a node group".toString());
        }
        if (!(obj == null || this.f5058R.X() == obj)) {
            r(false, new mBy(1, obj));
        }
        this.f5058R.j();
    }

    public final boolean c(float f) {
        Object I = I();
        if (I instanceof Float) {
            if (f == ((Number) I).floatValue()) {
                return false;
            }
        }
        ZW(Float.valueOf(f));
        return true;
    }

    public final void cE(int i, int i2) {
        if (vz(i) == i2) {
            return;
        }
        if (i < 0) {
            HashMap hashMap = this.f5060R;
            if (hashMap == null) {
                hashMap = new HashMap();
                this.f5060R = hashMap;
            }
            hashMap.put(Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        int[] iArr = this.f5068R;
        if (iArr == null) {
            int i3 = this.f5058R.R;
            int[] iArr2 = new int[i3];
            Arrays.fill(iArr2, 0, i3, -1);
            this.f5068R = iArr2;
            iArr = iArr2;
        }
        iArr[i] = i2;
    }

    public final void cr(int i) {
        this.O = Integer.rotateRight(Integer.hashCode(i) ^ this.O, 3);
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Throwable, g2d] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (r8.R < r3) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0098 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009a A[LOOP:1: B:28:0x006f->B:38:0x009a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01c6  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
        // Method dump skipped, instructions count: 500
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr_.d():void");
    }

    public final boolean e(int i) {
        Object I = I();
        if ((I instanceof Integer) && i == ((Number) I).intValue()) {
            return false;
        }
        ZW(Integer.valueOf(i));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(int r18, java.lang.Object r19, java.lang.Object r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 690
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr_.f(int, java.lang.Object, java.lang.Object, boolean):void");
    }

    public final void g(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i = 0;
        if (this.f5050L) {
            mdh mdh = this.f5065R;
            int i2 = mdh.U;
            int i3 = mdh.f6092R[mdh.N(i2) * 5];
            mdh mdh2 = this.f5065R;
            int N = mdh2.N(i2);
            int[] iArr = mdh2.f6092R;
            int i4 = N * 5;
            int i5 = iArr[i4 + 1];
            Object obj = (536870912 & i5) != 0 ? mdh2.f6093R[l6.i(i5 >> 30) + iArr[i4 + 4]] : null;
            mdh mdh3 = this.f5065R;
            int N2 = mdh3.N(i2);
            vr(obj, i3, l6.X(mdh3.f6092R, N2) ? mdh3.f6093R[mdh3.e(mdh3.f6092R, N2)] : ppN.R);
        } else {
            ilY ily = this.f5058R;
            int i6 = ily.X;
            int[] iArr2 = ily.f4714R;
            int i7 = iArr2[i6 * 5];
            Object H = ily.H(iArr2, i6);
            ilY ily2 = this.f5058R;
            vr(H, i7, ily2.v(ily2.f4714R, i6));
        }
        int i8 = this.v;
        mMV mmv = this.f5064R;
        if (mmv != null && mmv.f6017R.size() > 0) {
            List list = mmv.f6017R;
            ArrayList arrayList = mmv.f6015R;
            HashSet hashSet = new HashSet(arrayList.size());
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                hashSet.add(arrayList.get(i9));
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int size3 = list.size();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i10 < size3) {
                kFD kfd = (kFD) list.get(i10);
                if (!hashSet.contains(kfd)) {
                    T(mmv.R(kfd) + mmv.R, kfd.c);
                    mmv.v(kfd.v, i);
                    int i13 = kfd.v;
                    ilY ily3 = this.f5058R;
                    hashSet = hashSet;
                    this.Z = i13 - (ily3.c - this.Z);
                    ily3.C(i13);
                    s();
                    this.f5058R.N();
                    ArrayList arrayList2 = this.f5059R;
                    int i14 = kfd.v;
                    vC.R(i14, this.f5058R.Z(i14) + i14, arrayList2);
                } else {
                    hashSet = hashSet;
                    if (!linkedHashSet.contains(kfd)) {
                        if (i11 < size2) {
                            kFD kfd2 = (kFD) arrayList.get(i11);
                            if (kfd2 != kfd) {
                                int R = mmv.R(kfd2);
                                linkedHashSet.add(kfd2);
                                if (R != i12) {
                                    hsu hsu = (hsu) mmv.f6016R.get(Integer.valueOf(kfd2.v));
                                    int i15 = hsu != null ? hsu.c : kfd2.c;
                                    int i16 = mmv.R;
                                    int i17 = R + i16;
                                    int i18 = i16 + i12;
                                    if (i15 > 0) {
                                        arrayList = arrayList;
                                        int i19 = this.U;
                                        if (i19 > 0) {
                                            linkedHashSet = linkedHashSet;
                                            size2 = size2;
                                            if (this.x == i17 - i19 && this.H == i18 - i19) {
                                                this.U = i19 + i15;
                                            }
                                        } else {
                                            linkedHashSet = linkedHashSet;
                                            size2 = size2;
                                        }
                                        z();
                                        this.x = i17;
                                        this.H = i18;
                                        this.U = i15;
                                    } else {
                                        arrayList = arrayList;
                                        linkedHashSet = linkedHashSet;
                                        size2 = size2;
                                    }
                                    if (R > i12) {
                                        for (hsu hsu2 : mmv.f6016R.values()) {
                                            int i20 = hsu2.v;
                                            if (R <= i20 && i20 < R + i15) {
                                                hsu2.v = (i20 - R) + i12;
                                            } else if (i12 <= i20 && i20 < R) {
                                                hsu2.v = i20 + i15;
                                            }
                                        }
                                    } else if (i12 > R) {
                                        for (hsu hsu3 : mmv.f6016R.values()) {
                                            int i21 = hsu3.v;
                                            if (R <= i21 && i21 < R + i15) {
                                                hsu3.v = (i21 - R) + i12;
                                            } else if (R + 1 <= i21 && i21 < i12) {
                                                hsu3.v = i21 - i15;
                                            }
                                        }
                                    }
                                } else {
                                    arrayList = arrayList;
                                    linkedHashSet = linkedHashSet;
                                    size2 = size2;
                                }
                            } else {
                                arrayList = arrayList;
                                linkedHashSet = linkedHashSet;
                                size2 = size2;
                                i10++;
                            }
                            i11++;
                            hsu hsu4 = (hsu) mmv.f6016R.get(Integer.valueOf(kfd2.v));
                            i12 += hsu4 != null ? hsu4.c : kfd2.c;
                            hashSet = hashSet;
                            i = 0;
                        }
                        i = 0;
                    }
                }
                i10++;
                i = 0;
            }
            z();
            if (list.size() > 0) {
                ilY ily4 = this.f5058R;
                this.Z = ily4.e - (ily4.c - this.Z);
                ily4.P();
            }
        }
        int i22 = this.R;
        while (true) {
            ilY ily5 = this.f5058R;
            if ((ily5.O > 0) || ily5.c == ily5.e) {
                break;
            }
            int i23 = ily5.c;
            s();
            T(i22, this.f5058R.N());
            vC.R(i23, this.f5058R.c, this.f5059R);
        }
        boolean z5 = this.f5050L;
        int i24 = -1;
        if (z5) {
            if (z) {
                this.f5073c.add(this.f5076e.c());
                i8 = 1;
            }
            ilY ily6 = this.f5058R;
            int i25 = ily6.O;
            if (i25 > 0) {
                ily6.O = i25 - 1;
                mdh mdh4 = this.f5065R;
                int i26 = mdh4.U;
                mdh4.m();
                if (!(this.f5058R.O > 0)) {
                    int i27 = -2;
                    int i28 = -2 - i26;
                    this.f5065R.x();
                    this.f5065R.O();
                    WB wb = this.f5053R;
                    if (this.f5073c.isEmpty()) {
                        fB0 fb0 = new fB0(this.f5086v, 5, wb);
                        n(false);
                        ilY ily7 = this.f5058R;
                        if (ily7.R > 0) {
                            int i29 = ily7.X;
                            l7M l7m = this.f5069X;
                            int i30 = l7m.v;
                            if (i30 > 0) {
                                i27 = l7m.f5588R[i30 - 1];
                            }
                            if (i27 != i29) {
                                if (this.f5071Z || !this.f5079m) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                    r(false, G9.h);
                                    this.f5071Z = true;
                                }
                                if (i29 > 0) {
                                    WB R2 = ily7.R(i29);
                                    this.f5069X.v(i29);
                                    r(z4, new n3l(2, R2));
                                }
                            }
                        }
                        W(fb0);
                        z2 = false;
                    } else {
                        ArrayList arrayList3 = new ArrayList(this.f5073c);
                        this.f5073c.clear();
                        Q();
                        u();
                        ezT ezt = new ezT(this.f5086v, wb, arrayList3, 0);
                        n(false);
                        ilY ily8 = this.f5058R;
                        if (ily8.R > 0) {
                            int i31 = ily8.X;
                            l7M l7m2 = this.f5069X;
                            int i32 = l7m2.v;
                            if (i32 > 0) {
                                i27 = l7m2.f5588R[i32 - 1];
                            }
                            if (i27 != i31) {
                                if (this.f5071Z || !this.f5079m) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                    r(false, G9.h);
                                    this.f5071Z = true;
                                }
                                if (i31 > 0) {
                                    WB R3 = ily8.R(i31);
                                    this.f5069X.v(i31);
                                    r(z2, new n3l(2, R3));
                                }
                                W(ezt);
                            }
                        }
                        z2 = false;
                        W(ezt);
                    }
                    this.f5050L = z2;
                    if (this.f5066R.e == 0) {
                        z3 = true;
                    } else {
                        boolean z6 = z2 ? 1 : 0;
                        Object[] objArr = z2 ? 1 : 0;
                        Object[] objArr2 = z2 ? 1 : 0;
                        Object[] objArr3 = z2 ? 1 : 0;
                        Object[] objArr4 = z2 ? 1 : 0;
                        Object[] objArr5 = z2 ? 1 : 0;
                        Object[] objArr6 = z2 ? 1 : 0;
                        z3 = z6;
                    }
                    if (!z3) {
                        int i33 = z2 ? 1 : 0;
                        int i34 = z2 ? 1 : 0;
                        int i35 = z2 ? 1 : 0;
                        int i36 = z2 ? 1 : 0;
                        int i37 = z2 ? 1 : 0;
                        int i38 = z2 ? 1 : 0;
                        int i39 = z2 ? 1 : 0;
                        cE(i28, i33);
                        iE(i28, i8);
                    }
                }
            } else {
                throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
            }
        } else {
            if (z) {
                k();
            }
            int i40 = this.f5058R.X;
            l7M l7m3 = this.f5069X;
            int i41 = l7m3.v;
            if ((i41 > 0 ? l7m3.f5588R[i41 + -1] : -1) <= i40) {
                if (i41 > 0) {
                    i24 = l7m3.f5588R[i41 - 1];
                }
                if (i24 == i40) {
                    l7m3.R();
                    r(false, G9.o);
                }
                int i42 = this.f5058R.X;
                if (i8 != vz(i42)) {
                    iE(i42, i8);
                }
                if (z) {
                    i8 = 1;
                }
                this.f5058R.e();
                z();
            } else {
                vC.e("Missed recording an endGroup".toString());
                throw null;
            }
        }
        mMV mmv2 = (mMV) this.f5054R.c();
        if (mmv2 != null && !z5) {
            mmv2.v++;
        }
        this.f5064R = mmv2;
        this.R = this.f5063R.R() + i8;
        this.v = this.f5085v.R() + i8;
    }

    public final void i() {
        boolean z = false;
        g(false);
        this.f5057R.v();
        g(false);
        if (this.f5071Z) {
            r(false, G9.o);
            this.f5071Z = false;
        }
        Q();
        if (this.f5054R.R.isEmpty()) {
            if (this.f5069X.v == 0) {
                z = true;
            }
            if (z) {
                Z();
                this.f5058R.c();
                return;
            }
            vC.e("Missed recording an endGroup()".toString());
            throw null;
        }
        vC.e("Start/end imbalance".toString());
        throw null;
    }

    public final void iE(int i, int i2) {
        int vz = vz(i);
        if (vz != i2) {
            int i3 = i2 - vz;
            int size = this.f5054R.R.size() - 1;
            while (i != -1) {
                int vz2 = vz(i) + i3;
                cE(i, vz2);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        mMV mmv = (mMV) this.f5054R.R.get(i4);
                        if (mmv != null && mmv.v(i, vz2)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.f5058R.X;
                } else if (!this.f5058R.m(i)) {
                    i = this.f5058R.U(i);
                } else {
                    return;
                }
            }
        }
    }

    public final void j() {
        this.f5078e = this.c >= 0;
    }

    public final void k() {
        if (!this.f5072c.R.isEmpty()) {
            this.f5072c.c();
        } else {
            this.L++;
        }
    }

    public final int m(int i, int i2, int i3) {
        Object v;
        if (i == i2) {
            return i3;
        }
        ilY ily = this.f5058R;
        int[] iArr = ily.f4714R;
        int i4 = i * 5;
        boolean z = true;
        int i5 = 0;
        if ((iArr[i4 + 1] & 536870912) == 0) {
            z = false;
        }
        if (z) {
            Object H = ily.H(iArr, i);
            if (H != null) {
                i5 = H instanceof Enum ? ((Enum) H).ordinal() : H.hashCode();
            }
        } else {
            i5 = iArr[i4];
            if (i5 == 207 && (v = ily.v(iArr, i)) != null && !n3x.v(v, ppN.R)) {
                i5 = v.hashCode();
            }
        }
        return i5 == 126665345 ? i5 : Integer.rotateLeft(m(this.f5058R.U(i), i2, i3), 3) ^ i5;
    }

    public final void mL() {
        f(125, null, null, true);
        this.f5087v = true;
    }

    public final void n(boolean z) {
        int i = z ? this.f5058R.X : this.f5058R.c;
        int i2 = i - this.Z;
        if (!(i2 >= 0)) {
            vC.e("Tried to seek backward".toString());
            throw null;
        } else if (i2 > 0) {
            W(new bgC(i2, 0));
            this.Z = i;
        }
    }

    public final dYh o() {
        btA bta = this.f5080v;
        if (this.e != 0 || !(!bta.R.isEmpty())) {
            return null;
        }
        ArrayList arrayList = bta.R;
        return (dYh) arrayList.get(arrayList.size() - 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0077 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(int r7, int r8, int r9) {
        /*
            r6 = this;
            ilY r0 = r6.f5058R
            if (r7 != r8) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            if (r7 == r9) goto L_0x006a
            if (r8 != r9) goto L_0x000b
            goto L_0x006a
        L_0x000b:
            int r1 = r0.U(r7)
            if (r1 != r8) goto L_0x0014
            r9 = r8
            goto L_0x006a
        L_0x0014:
            int r1 = r0.U(r8)
            if (r1 != r7) goto L_0x001c
        L_0x001a:
            r9 = r7
            goto L_0x006a
        L_0x001c:
            int r1 = r0.U(r7)
            int r2 = r0.U(r8)
            if (r1 != r2) goto L_0x002b
            int r9 = r0.U(r7)
            goto L_0x006a
        L_0x002b:
            r1 = 0
            r2 = r7
            r3 = r1
        L_0x002e:
            if (r2 <= 0) goto L_0x0039
            if (r2 == r9) goto L_0x0039
            int r2 = r0.U(r2)
            int r3 = r3 + 1
            goto L_0x002e
        L_0x0039:
            r2 = r8
            r4 = r1
        L_0x003b:
            if (r2 <= 0) goto L_0x0046
            if (r2 == r9) goto L_0x0046
            int r2 = r0.U(r2)
            int r4 = r4 + 1
            goto L_0x003b
        L_0x0046:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L_0x004a:
            if (r2 >= r9) goto L_0x0053
            int r5 = r0.U(r5)
            int r2 = r2 + 1
            goto L_0x004a
        L_0x0053:
            int r4 = r4 - r3
            r9 = r8
        L_0x0055:
            if (r1 >= r4) goto L_0x005e
            int r9 = r0.U(r9)
            int r1 = r1 + 1
            goto L_0x0055
        L_0x005e:
            if (r5 == r9) goto L_0x0069
            int r5 = r0.U(r5)
            int r9 = r0.U(r9)
            goto L_0x005e
        L_0x0069:
            r9 = r5
        L_0x006a:
            if (r7 <= 0) goto L_0x007c
            if (r7 == r9) goto L_0x007c
            boolean r1 = r0.m(r7)
            if (r1 == 0) goto L_0x0077
            r6.k()
        L_0x0077:
            int r7 = r0.U(r7)
            goto L_0x006a
        L_0x007c:
            r6.P(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr_.p(int, int, int):void");
    }

    public final jr_ q(int i) {
        Object obj;
        dYh dyh;
        int i2;
        pnH pnh = null;
        boolean z = false;
        f(i, null, null, false);
        if (this.f5050L) {
            dYh dyh2 = new dYh((hAe) this.f5055R);
            this.f5080v.e(dyh2);
            ZW(dyh2);
            dyh2.v = this.X;
            dyh2.R &= -17;
        } else {
            ArrayList arrayList = this.f5059R;
            int O = vC.O(this.f5058R.X, arrayList);
            if (O >= 0) {
                pnh = (pnH) arrayList.remove(O);
            }
            ilY ily = this.f5058R;
            if (ily.O > 0 || (i2 = ily.L) >= ily.Z) {
                obj = ppN.R;
            } else {
                Object[] objArr = ily.f4715R;
                ily.L = i2 + 1;
                obj = objArr[i2];
            }
            if (n3x.v(obj, ppN.R)) {
                dyh = new dYh((hAe) this.f5055R);
                ZW(dyh);
            } else {
                dyh = (dYh) obj;
            }
            if (pnh != null) {
                z = true;
            }
            if (z) {
                dyh.R |= 8;
            } else {
                dyh.R &= -9;
            }
            this.f5080v.e(dyh);
            dyh.v = this.X;
            dyh.R &= -17;
        }
        return this;
    }

    public final void r(boolean z, lR3 lr3) {
        n(z);
        W(lr3);
    }

    public final void s() {
        B(this, this.f5058R.c, false, 0);
        z();
        G9 g9 = G9.K;
        n(false);
        ilY ily = this.f5058R;
        if (ily.R > 0) {
            int i = ily.X;
            l7M l7m = this.f5069X;
            int i2 = -2;
            int i3 = l7m.v;
            if (i3 > 0) {
                i2 = l7m.f5588R[i3 - 1];
            }
            if (i2 != i) {
                if (!this.f5071Z && this.f5079m) {
                    r(false, G9.h);
                    this.f5071Z = true;
                }
                if (i > 0) {
                    WB R = ily.R(i);
                    this.f5069X.v(i);
                    r(false, new n3l(2, R));
                }
            }
        }
        W(g9);
        int i4 = this.Z;
        ilY ily2 = this.f5058R;
        this.Z = l6.e(ily2.f4714R, ily2.c) + i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.dYh t() {
        /*
            r9 = this;
            btA r0 = r9.f5080v
            java.util.ArrayList r0 = r0.R
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            btA r0 = r9.f5080v
            java.lang.Object r0 = r0.c()
            dYh r0 = (defpackage.dYh) r0
            goto L_0x0017
        L_0x0016:
            r0 = r2
        L_0x0017:
            if (r0 != 0) goto L_0x001a
            goto L_0x0020
        L_0x001a:
            int r3 = r0.R
            r3 = r3 & -9
            r0.R = r3
        L_0x0020:
            r3 = 0
            if (r0 == 0) goto L_0x0063
            int r4 = r9.X
            eJ5 r5 = r0.f2664R
            if (r5 == 0) goto L_0x0057
            int r6 = r0.R
            r6 = r6 & 16
            if (r6 == 0) goto L_0x0031
            r6 = r1
            goto L_0x0032
        L_0x0031:
            r6 = r3
        L_0x0032:
            if (r6 != 0) goto L_0x0057
            int r6 = r5.R
            r7 = r3
        L_0x0037:
            if (r7 >= r6) goto L_0x004d
            java.lang.Object[] r8 = r5.f3050R
            r8 = r8[r7]
            int[] r8 = r5.f3049R
            r8 = r8[r7]
            if (r8 == r4) goto L_0x0045
            r8 = r1
            goto L_0x0046
        L_0x0045:
            r8 = r3
        L_0x0046:
            if (r8 == 0) goto L_0x004a
            r6 = r1
            goto L_0x004e
        L_0x004a:
            int r7 = r7 + 1
            goto L_0x0037
        L_0x004d:
            r6 = r3
        L_0x004e:
            if (r6 == 0) goto L_0x0057
            cHs r6 = new cHs
            r7 = 2
            r6.<init>(r0, r4, r5, r7)
            goto L_0x0058
        L_0x0057:
            r6 = r2
        L_0x0058:
            if (r6 == 0) goto L_0x0063
            fB0 r4 = new fB0
            r5 = 3
            r4.<init>(r6, r5, r9)
            r9.W(r4)
        L_0x0063:
            if (r0 == 0) goto L_0x009d
            int r4 = r0.R
            r5 = r4 & 16
            if (r5 == 0) goto L_0x006d
            r5 = r1
            goto L_0x006e
        L_0x006d:
            r5 = r3
        L_0x006e:
            if (r5 != 0) goto L_0x009d
            r4 = r4 & r1
            if (r4 == 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r1 = r3
        L_0x0075:
            if (r1 != 0) goto L_0x007b
            boolean r1 = r9.f5067R
            if (r1 == 0) goto L_0x009d
        L_0x007b:
            WB r1 = r0.f2663R
            if (r1 != 0) goto L_0x0096
            boolean r1 = r9.f5050L
            if (r1 == 0) goto L_0x008c
            mdh r1 = r9.f5065R
            int r2 = r1.U
            WB r1 = r1.v(r2)
            goto L_0x0094
        L_0x008c:
            ilY r1 = r9.f5058R
            int r2 = r1.X
            WB r1 = r1.R(r2)
        L_0x0094:
            r0.f2663R = r1
        L_0x0096:
            int r1 = r0.R
            r1 = r1 & -5
            r0.R = r1
            r2 = r0
        L_0x009d:
            r9.g(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr_.t():dYh");
    }

    public final void u() {
        if (!this.f5072c.R.isEmpty()) {
            btA bta = this.f5072c;
            int size = bta.R.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = bta.R.get(i);
            }
            W(new n3l(1, objArr));
            this.f5072c.R.clear();
        }
    }

    public final void vl(Object obj, int i, Object obj2) {
        if (obj == null) {
            if (obj2 == null || i != 207 || n3x.v(obj2, ppN.R)) {
                this.O = Integer.rotateLeft(this.O, 3) ^ i;
            } else {
                this.O = obj2.hashCode() ^ Integer.rotateLeft(this.O, 3);
            }
        } else if (obj instanceof Enum) {
            this.O = ((Enum) obj).ordinal() ^ Integer.rotateLeft(this.O, 3);
        } else {
            this.O = obj.hashCode() ^ Integer.rotateLeft(this.O, 3);
        }
    }

    public final void vr(Object obj, int i, Object obj2) {
        if (obj == null) {
            if (obj2 == null || i != 207 || n3x.v(obj2, ppN.R)) {
                cr(i);
            } else {
                cr(obj2.hashCode());
            }
        } else if (obj instanceof Enum) {
            cr(((Enum) obj).ordinal());
        } else {
            cr(obj.hashCode());
        }
    }

    public final int vz(int i) {
        int i2;
        Integer num;
        if (i < 0) {
            HashMap hashMap = this.f5060R;
            if (hashMap == null || (num = (Integer) hashMap.get(Integer.valueOf(i))) == null) {
                return 0;
            }
            return num.intValue();
        }
        int[] iArr = this.f5068R;
        return (iArr == null || (i2 = iArr[i]) < 0) ? l6.Z(this.f5058R.f4714R, i) : i2;
    }

    public final void w(int i) {
        f(i, null, null, false);
    }

    public final Object x(kxN kxn) {
        return l(kxn, U(null));
    }

    public final e76 xN(g2d g2d, g2d g2d2) {
        e76 e76 = (e76) g2d;
        e76.getClass();
        mWd mwd = new mWd(e76);
        mwd.putAll(g2d2);
        e76 R = mwd.R();
        F(204, vC.X);
        O(R);
        O(g2d2);
        g(false);
        return R;
    }

    public final void y() {
        boolean z = false;
        g(false);
        dYh o = o();
        if (o != null) {
            int i = o.R;
            z = true;
            if ((i & 1) != 0) {
            }
            if (z) {
                o.R = i | 2;
            }
        }
    }

    public final void z() {
        int i = this.U;
        this.U = 0;
        if (i > 0) {
            int i2 = this.m;
            if (i2 >= 0) {
                this.m = -1;
                eko eko = new eko(i2, i);
                Q();
                u();
                W(eko);
                return;
            }
            int i3 = this.x;
            this.x = -1;
            int i4 = this.H;
            this.H = -1;
            hiG hig = new hiG(i3, i4, i);
            Q();
            u();
            W(hig);
        }
    }

    public final boolean zw(dYh dyh, Object obj) {
        WB wb = dyh.f2663R;
        if (wb == null) {
            return false;
        }
        int v = this.f5066R.v(wb);
        if (!this.f5070X || v < this.f5058R.c) {
            return false;
        }
        ArrayList arrayList = this.f5059R;
        int O = vC.O(v, arrayList);
        kyQ kyq = null;
        if (O < 0) {
            int i = -(O + 1);
            if (obj != null) {
                kyq = new kyQ();
                kyq.add(obj);
            }
            arrayList.add(i, new pnH(dyh, v, kyq));
        } else if (obj == null) {
            ((pnH) arrayList.get(O)).f7266R = null;
        } else {
            kyQ kyq2 = ((pnH) arrayList.get(O)).f7266R;
            if (kyq2 != null) {
                kyq2.add(obj);
            }
        }
        return true;
    }
}
