package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: jwU  reason: default package */
/* loaded from: classes.dex */
public abstract class jwU {
    public static int R;

    /* renamed from: R  reason: collision with other field name */
    public static final dR6 f5148R;

    /* renamed from: R  reason: collision with other field name */
    public static final AtomicReference f5152R;

    /* renamed from: R  reason: collision with other field name */
    public static nQA f5153R;

    /* renamed from: R  reason: collision with other field name */
    public static final h5 f5149R = new h5(5);

    /* renamed from: R  reason: collision with other field name */
    public static final Object f5150R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public static final aXt f5147R = new aXt();

    /* renamed from: R  reason: collision with other field name */
    public static final ArrayList f5151R = new ArrayList();
    public static final ArrayList v = new ArrayList();

    static {
        nQA nqa = nQA.R;
        f5153R = nqa;
        R = 1;
        int i = R;
        R = i + 1;
        n3s n3s = new n3s(i, nqa);
        f5153R = f5153R.C(((dR6) n3s).R);
        AtomicReference atomicReference = new AtomicReference(n3s);
        f5152R = atomicReference;
        f5148R = (dR6) atomicReference.get();
    }

    public static final jJG C(jJG jjg, nmZ nmz) {
        jJG U;
        dR6 L = L();
        kg9 O = L.O();
        if (O != null) {
            O.x(nmz);
        }
        jJG U2 = U(jjg, L.e(), L.X());
        if (U2 != null) {
            return U2;
        }
        synchronized (f5150R) {
            dR6 L2 = L();
            U = U(jjg, L2.e(), L2.X());
        }
        if (U != null) {
            return U;
        }
        H();
        throw null;
    }

    public static final void H() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final dR6 L() {
        dR6 dr6 = (dR6) f5149R.H();
        return dr6 == null ? (dR6) f5152R.get() : dr6;
    }

    public static final void N(int i) {
        int i2;
        aXt axt = f5147R;
        int i3 = ((int[]) axt.f917R)[i];
        axt.v(i3, axt.v - 1);
        axt.v--;
        int[] iArr = (int[]) axt.f918R;
        int i4 = iArr[i3];
        int i5 = i3;
        while (i5 > 0) {
            int i6 = ((i5 + 1) >> 1) - 1;
            if (iArr[i6] <= i4) {
                break;
            }
            axt.v(i6, i5);
            i5 = i6;
        }
        int[] iArr2 = (int[]) axt.f918R;
        int i7 = axt.v >> 1;
        while (i3 < i7) {
            int i8 = (i3 + 1) << 1;
            int i9 = i8 - 1;
            if (i8 < axt.v && (i2 = iArr2[i8]) < iArr2[i9]) {
                if (i2 >= iArr2[i3]) {
                    break;
                }
                axt.v(i8, i3);
                i3 = i8;
            } else if (iArr2[i9] >= iArr2[i3]) {
                break;
            } else {
                axt.v(i9, i3);
                i3 = i9;
            }
        }
        ((int[]) axt.f917R)[i] = axt.c;
        axt.c = i;
    }

    public static final jJG O(jJG jjg) {
        jJG U;
        dR6 L = L();
        jJG U2 = U(jjg, L.e(), L.X());
        if (U2 != null) {
            return U2;
        }
        synchronized (f5150R) {
            dR6 L2 = L();
            U = U(jjg, L2.e(), L2.X());
        }
        if (U != null) {
            return U;
        }
        H();
        throw null;
    }

    public static final Object P(dR6 dr6, kg9 kg9) {
        Object x = kg9.x(f5153R.v(dr6.e()));
        synchronized (f5150R) {
            int i = R;
            R = i + 1;
            nQA v2 = f5153R.v(dr6.e());
            f5153R = v2;
            f5152R.set(new n3s(i, v2));
            dr6.c();
            f5153R = f5153R.C(i);
        }
        return x;
    }

    public static final kg9 R(kg9 kg9, kg9 kg92) {
        return (kg9 == null || kg92 == null || n3x.v(kg9, kg92)) ? kg9 == null ? kg92 : kg9 : new ecS(kg9, kg92, 3);
    }

    public static final jJG U(jJG jjg, int i, nQA nqa) {
        jJG jjg2 = null;
        while (jjg != null) {
            int i2 = jjg.R;
            if ((i2 != 0 && i2 <= i && !nqa.c(i2)) && (jjg2 == null || jjg2.R < jjg.R)) {
                jjg2 = jjg;
            }
            jjg = jjg.f4901R;
        }
        if (jjg2 != null) {
            return jjg2;
        }
        return null;
    }

    public static final dR6 X(dR6 dr6, kg9 kg9, boolean z) {
        boolean z2 = dr6 instanceof kpt;
        if (!z2 && dr6 != null) {
            return new cg1(dr6, kg9, z);
        }
        return new b5u(z2 ? (kpt) dr6 : null, kg9, null, false, z);
    }

    public static final kg9 Z(kg9 kg9, kg9 kg92, boolean z) {
        if (!z) {
            kg92 = null;
        }
        return (kg9 == null || kg92 == null || n3x.v(kg9, kg92)) ? kg9 == null ? kg92 : kg9 : new ecS(kg9, kg92, 2);
    }

    public static final void c(dR6 dr6) {
        if (!f5153R.c(dr6.e())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    public static final Object e(kg9 kg9) {
        Object obj;
        Object P;
        ArrayList arrayList;
        n3s n3s = (n3s) f5148R;
        Object obj2 = f5150R;
        synchronized (obj2) {
            obj = f5152R.get();
            P = P((dR6) obj, kg9);
        }
        Set set = ((kpt) ((n3s) obj)).R;
        if (set != null) {
            synchronized (obj2) {
                arrayList = new ArrayList(f5151R);
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((iv7) arrayList.get(i)).J(set, obj);
            }
        }
        return P;
    }

    public static final jJG j(jJG jjg, nmZ nmz, dR6 dr6) {
        if (dr6.L()) {
            dr6.C(nmz);
        }
        jJG U = U(jjg, dr6.e(), dr6.X());
        if (U == null) {
            H();
            throw null;
        } else if (U.R == dr6.e()) {
            return U;
        } else {
            jJG m = m(U, nmz);
            m.R(U);
            m.R = dr6.e();
            dr6.C(nmz);
            return m;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r5 == false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.jJG m(defpackage.jJG r12, defpackage.nmZ r13) {
        /*
            jJG r0 = r13.C()
            aXt r1 = defpackage.jwU.f5147R
            int r2 = defpackage.jwU.R
            int r3 = r1.v
            r4 = 0
            if (r3 <= 0) goto L_0x0013
            java.lang.Object r1 = r1.f918R
            int[] r1 = (int[]) r1
            r2 = r1[r4]
        L_0x0013:
            int r2 = r2 + -1
            r1 = 0
            r3 = r1
        L_0x0017:
            if (r0 == 0) goto L_0x005f
            int r5 = r0.R
            if (r5 != 0) goto L_0x001e
            goto L_0x0058
        L_0x001e:
            r6 = 1
            if (r5 == 0) goto L_0x004b
            if (r5 > r2) goto L_0x004b
            int r5 = r5 + 0
            r7 = 1
            r9 = 64
            r10 = 0
            if (r5 < 0) goto L_0x0039
            if (r5 >= r9) goto L_0x0039
            long r7 = r7 << r5
            long r7 = r7 & r10
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0037
        L_0x0035:
            r5 = r6
            goto L_0x0048
        L_0x0037:
            r5 = r4
            goto L_0x0048
        L_0x0039:
            if (r5 < r9) goto L_0x0037
            r9 = 128(0x80, float:1.794E-43)
            if (r5 >= r9) goto L_0x0037
            int r5 = r5 + -64
            long r7 = r7 << r5
            long r7 = r7 & r10
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0037
            goto L_0x0035
        L_0x0048:
            if (r5 != 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r6 = r4
        L_0x004c:
            if (r6 == 0) goto L_0x005c
            if (r3 != 0) goto L_0x0052
            r3 = r0
            goto L_0x005c
        L_0x0052:
            int r1 = r0.R
            int r2 = r3.R
            if (r1 >= r2) goto L_0x005a
        L_0x0058:
            r1 = r0
            goto L_0x005f
        L_0x005a:
            r1 = r3
            goto L_0x005f
        L_0x005c:
            jJG r0 = r0.f4901R
            goto L_0x0017
        L_0x005f:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == 0) goto L_0x0067
            r1.R = r0
            goto L_0x0076
        L_0x0067:
            jJG r1 = r12.v()
            r1.R = r0
            jJG r12 = r13.C()
            r1.f4901R = r12
            r13.H(r1)
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwU.m(jJG, nmZ):jJG");
    }

    public static final HashMap v(kpt kpt, kpt kpt2, nQA nqa) {
        jJG U;
        Set<nmZ> V = kpt2.V();
        int e = kpt.e();
        if (V == null) {
            return null;
        }
        nQA H = kpt2.X().C(kpt2.e()).H(kpt2.f5443v);
        HashMap hashMap = null;
        for (nmZ nmz : V) {
            jJG C = nmz.C();
            jJG U2 = U(C, e, nqa);
            if (!(U2 == null || (U = U(C, e, H)) == null || n3x.v(U2, U))) {
                jJG U3 = U(C, kpt2.e(), kpt2.X());
                if (U3 != null) {
                    jJG v2 = nmz.v(U, U2, U3);
                    if (v2 == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(U2, v2);
                } else {
                    H();
                    throw null;
                }
            }
        }
        return hashMap;
    }

    public static final void x(dR6 dr6, nmZ nmz) {
        kg9 Z = dr6.Z();
        if (Z != null) {
            Z.x(nmz);
        }
    }
}
