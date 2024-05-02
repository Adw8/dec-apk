package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: kpt  reason: default package */
/* loaded from: classes.dex */
public class kpt extends dR6 {
    public Set R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f5441R;
    public final kg9 v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f5444v;

    /* renamed from: v  reason: collision with other field name */
    public nQA f5443v = nQA.R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f5442R = new int[0];
    public int e = 1;

    public kpt(int i, nQA nqa, kg9 kg9, kg9 kg92) {
        super(i, nqa);
        this.f5441R = kg9;
        this.v = kg92;
    }

    @Override // defpackage.dR6
    public void C(nmZ nmz) {
        Set V = V();
        Set set = V;
        if (V == null) {
            HashSet hashSet = new HashSet();
            J(hashSet);
            set = hashSet;
        }
        set.add(nmz);
    }

    @Override // defpackage.dR6
    public void H() {
        int i = this.e;
        if (i > 0) {
            int i2 = i - 1;
            this.e = i2;
            if (i2 == 0 && !this.f5444v) {
                Set<nmZ> V = V();
                if (V != null) {
                    if (true ^ this.f5444v) {
                        J(null);
                        int e = e();
                        for (nmZ nmz : V) {
                            for (jJG C = nmz.C(); C != null; C = C.f4901R) {
                                int i3 = C.R;
                                if (i3 == e || dF.F(this.f5443v, Integer.valueOf(i3))) {
                                    C.R = 0;
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
                    }
                }
                R();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public void J(HashSet hashSet) {
        this.R = hashSet;
    }

    public final void K(int i) {
        synchronized (jwU.f5150R) {
            this.f5443v = this.f5443v.C(i);
        }
    }

    @Override // defpackage.dR6
    public boolean L() {
        return false;
    }

    @Override // defpackage.dR6
    public final void N() {
        int length = this.f5442R.length;
        for (int i = 0; i < length; i++) {
            jwU.N(this.f5442R[i]);
        }
        int i2 = ((dR6) this).v;
        if (i2 >= 0) {
            jwU.N(i2);
            ((dR6) this).v = -1;
        }
    }

    @Override // defpackage.dR6
    public final kg9 O() {
        return this.f5441R;
    }

    @Override // defpackage.dR6
    public void U() {
        if (!this.f5444v && !((dR6) this).f2607R) {
            t();
        }
    }

    public Set V() {
        return this.R;
    }

    public kpt Y(kg9 kg9, kg9 kg92) {
        lTe lte;
        if (!((dR6) this).f2607R) {
            h();
            K(e());
            Object obj = jwU.f5150R;
            synchronized (obj) {
                int i = jwU.R;
                jwU.R = i + 1;
                jwU.f5153R = jwU.f5153R.C(i);
                nQA X = X();
                g(X.C(i));
                nQA nqa = X;
                for (int e = e() + 1; e < i; e++) {
                    nqa = nqa.C(e);
                }
                lte = new lTe(i, nqa, jwU.Z(kg9, this.f5441R, true), jwU.R(kg92, this.v), this);
            }
            if (!this.f5444v && !((dR6) this).f2607R) {
                int e2 = e();
                synchronized (obj) {
                    int i2 = jwU.R;
                    jwU.R = i2 + 1;
                    j(i2);
                    jwU.f5153R = jwU.f5153R.C(e());
                }
                nQA X2 = X();
                int e3 = e();
                for (int i3 = e2 + 1; i3 < e3; i3++) {
                    X2 = X2.C(i3);
                }
                g(X2);
            }
            return lte;
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }

    @Override // defpackage.dR6
    public final kg9 Z() {
        return this.v;
    }

    @Override // defpackage.dR6
    public void c() {
        if (!((dR6) this).f2607R) {
            ((dR6) this).f2607R = true;
            synchronized (jwU.f5150R) {
                int i = ((dR6) this).v;
                if (i >= 0) {
                    jwU.N(i);
                    ((dR6) this).v = -1;
                }
            }
            H();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        if ((((defpackage.dR6) r3).v >= 0) != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r3 = this;
            boolean r0 = r3.f5444v
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000f
            int r3 = r3.v
            if (r3 < 0) goto L_0x000c
            r3 = r2
            goto L_0x000d
        L_0x000c:
            r3 = r1
        L_0x000d:
            if (r3 == 0) goto L_0x0010
        L_0x000f:
            r1 = r2
        L_0x0010:
            if (r1 == 0) goto L_0x0013
            return
        L_0x0013:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unsupported operation on a disposed or applied snapshot"
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpt.h():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bb A[LOOP:0: B:31:0x00b9->B:32:0x00bb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6 A[LOOP:1: B:37:0x00d4->B:38:0x00d6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.aJV i() {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpt.i():aJV");
    }

    public final aJV o(int i, HashMap hashMap, nQA nqa) {
        jJG U;
        jJG jjg;
        nQA H = X().C(e()).H(this.f5443v);
        Set<nmZ> V = V();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (nmZ nmz : V) {
            jJG C = nmz.C();
            jJG U2 = jwU.U(C, i, nqa);
            if (!(U2 == null || (U = jwU.U(C, e(), H)) == null || n3x.v(U2, U))) {
                jJG U3 = jwU.U(C, e(), X());
                if (U3 != null) {
                    if (hashMap == null || (jjg = (jJG) hashMap.get(U2)) == null) {
                        jjg = nmz.v(U, U2, U3);
                    }
                    if (jjg == null) {
                        return new aws();
                    }
                    if (!n3x.v(jjg, U3)) {
                        if (n3x.v(jjg, U2)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(new kSh(nmz, U2.v()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(nmz);
                        } else {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(!n3x.v(jjg, U) ? new kSh(nmz, jjg) : new kSh(nmz, U.v()));
                        }
                    }
                } else {
                    jwU.H();
                    throw null;
                }
            }
        }
        if (arrayList != null) {
            t();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                kSh ksh = (kSh) arrayList.get(i2);
                nmZ nmz2 = (nmZ) ksh.R;
                jJG jjg2 = (jJG) ksh.v;
                jjg2.R = e();
                synchronized (jwU.f5150R) {
                    jjg2.f4901R = nmz2.C();
                    nmz2.H(jjg2);
                }
            }
        }
        if (arrayList2 != null) {
            V.removeAll(arrayList2);
        }
        return ncP.R;
    }

    public final void t() {
        K(e());
        if (!(this.f5444v || ((dR6) this).f2607R)) {
            int e = e();
            synchronized (jwU.f5150R) {
                int i = jwU.R;
                jwU.R = i + 1;
                j(i);
                jwU.f5153R = jwU.f5153R.C(e());
            }
            nQA X = X();
            int e2 = e();
            for (int i2 = e + 1; i2 < e2; i2++) {
                X = X.C(i2);
            }
            g(X);
        }
    }

    @Override // defpackage.dR6
    public final void v() {
        jwU.f5153R = jwU.f5153R.v(e()).R(this.f5443v);
    }

    @Override // defpackage.dR6
    public void x() {
        this.e++;
    }

    @Override // defpackage.dR6
    public dR6 y(kg9 kg9) {
        iLJ ilj;
        if (!((dR6) this).f2607R) {
            h();
            int e = e();
            K(e());
            Object obj = jwU.f5150R;
            synchronized (obj) {
                int i = jwU.R;
                jwU.R = i + 1;
                jwU.f5153R = jwU.f5153R.C(i);
                nQA X = X();
                while (true) {
                    e++;
                    if (e >= i) {
                        break;
                    }
                    X = X.C(e);
                }
                ilj = new iLJ(i, X, kg9, this);
            }
            if (!this.f5444v && !((dR6) this).f2607R) {
                int e2 = e();
                synchronized (obj) {
                    int i2 = jwU.R;
                    jwU.R = i2 + 1;
                    j(i2);
                    jwU.f5153R = jwU.f5153R.C(e());
                }
                nQA X2 = X();
                int e3 = e();
                for (int i3 = e2 + 1; i3 < e3; i3++) {
                    X2 = X2.C(i3);
                }
                g(X2);
            }
            return ilj;
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }
}
