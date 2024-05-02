package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: m6r  reason: default package */
/* loaded from: classes.dex */
public final class m6r implements bvr {

    /* renamed from: R  reason: collision with other field name */
    public final int f5933R;

    /* renamed from: R  reason: collision with other field name */
    public final hwQ f5934R;

    /* renamed from: R  reason: collision with other field name */
    public final k3o f5935R;

    /* renamed from: R  reason: collision with other field name */
    public final mxz f5936R;

    /* renamed from: R  reason: collision with other field name */
    public final nRz f5937R;

    /* renamed from: R  reason: collision with other field name */
    public final qN f5938R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f5939R;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f5940R;

    /* renamed from: R  reason: collision with other field name */
    public final Object[] f5941R;

    /* renamed from: c  reason: collision with other field name */
    public final int f5942c;
    public final int e;
    public final int v;

    /* renamed from: v  reason: collision with other field name */
    public final boolean f5943v;

    /* renamed from: v  reason: collision with other field name */
    public final int[] f5944v;
    public static final int[] c = new int[0];
    public static final Unsafe R = hU3.j();

    public m6r(int[] iArr, Object[] objArr, int i, int i2, qN qNVar, boolean z, int[] iArr2, int i3, int i4, mxz mxz, hwQ hwq, k3o k3o, aVf avf, nRz nrz) {
        this.f5940R = iArr;
        this.f5941R = objArr;
        this.f5933R = i;
        this.v = i2;
        this.f5939R = qNVar instanceof csA;
        this.f5943v = z;
        this.f5944v = iArr2;
        this.f5942c = i3;
        this.e = i4;
        this.f5936R = mxz;
        this.f5934R = hwq;
        this.f5935R = k3o;
        this.f5938R = qNVar;
        this.f5937R = nrz;
    }

    public static long I(int i) {
        return (long) (i & 1048575);
    }

    public static List V(long j, Object obj) {
        return (List) hU3.P(j, obj);
    }

    public static m6r Y(bWV bwv, mxz mxz, hwQ hwq, k3o k3o, aVf avf, nRz nrz) {
        if (bwv instanceof kob) {
            return h((kob) bwv, mxz, hwq, k3o, avf, nrz);
        }
        jQ.Y(bwv);
        throw null;
    }

    public static void f(int i, Object obj, gL6 gl6) {
        if (obj instanceof String) {
            d3 d3Var = (d3) gl6.R;
            d3Var.S(i, 2);
            d3Var.A((String) obj);
            return;
        }
        gl6.i(i, (b0) obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:157:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0348  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.m6r h(defpackage.kob r35, defpackage.mxz r36, defpackage.hwQ r37, defpackage.k3o r38, defpackage.aVf r39, defpackage.nRz r40) {
        /*
        // Method dump skipped, instructions count: 1040
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6r.h(kob, mxz, hwQ, k3o, aVf, nRz):m6r");
    }

    public static f2c j(Object obj) {
        csA csa = (csA) obj;
        f2c f2c = csa.unknownFields;
        if (f2c != f2c.R) {
            return f2c;
        }
        f2c v = f2c.v();
        csa.unknownFields = v;
        return v;
    }

    public static Field k(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder i = jQ.i("Field ", str, " for ");
            i.append(cls.getName());
            i.append(" not found. Known fields are ");
            i.append(Arrays.toString(declaredFields));
            throw new RuntimeException(i.toString());
        }
    }

    public static int l(int i) {
        return (i & 267386880) >>> 20;
    }

    public static int u(long j, Object obj) {
        return ((Integer) hU3.P(j, obj)).intValue();
    }

    public static long z(long j, Object obj) {
        return ((Long) hU3.P(j, obj)).longValue();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:217:0x0017 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:221:0x0017 */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0467 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, defpackage.cDk r37) {
        /*
        // Method dump skipped, instructions count: 1276
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6r.A(java.lang.Object, byte[], int, int, int, cDk):int");
    }

    public final int B(int i, int i2) {
        int length = (this.f5940R.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f5940R[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final puu C(int i) {
        return (puu) this.f5941R[((i / 3) * 2) + 1];
    }

    public final void E(Object obj, gL6 gl6) {
        int i;
        int length = this.f5940R.length;
        Unsafe unsafe = R;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int M = M(i4);
            int[] iArr = this.f5940R;
            int i6 = iArr[i4];
            int i7 = (267386880 & M) >>> 20;
            if (i7 <= 17) {
                int i8 = iArr[i4 + 2];
                int i9 = i8 & i2;
                if (i9 != i3) {
                    i5 = unsafe.getInt(obj, (long) i9);
                    i3 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j = (long) (M & i2);
            switch (i7) {
                case 0:
                    if ((i5 & i) != 0) {
                        gl6.V(hU3.H(j, obj), i6);
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 1:
                    if ((i5 & i) != 0) {
                        gl6.Y(i6, hU3.U(j, obj));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 2:
                    if ((i5 & i) != 0) {
                        gl6.u(unsafe.getLong(obj, j), i6);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 3:
                    if ((i5 & i) != 0) {
                        gl6.W(unsafe.getLong(obj, j), i6);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 4:
                    if ((i5 & i) != 0) {
                        gl6.I(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                    if ((i5 & i) != 0) {
                        gl6.J(unsafe.getLong(obj, j), i6);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 6:
                    if ((i5 & i) != 0) {
                        gl6.K(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 7:
                    if ((i5 & i) != 0) {
                        gl6.t(i6, hU3.L(j, obj));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case VmNativeCallback.$stable:
                    if ((i5 & i) != 0) {
                        f(i6, unsafe.getObject(obj, j), gl6);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 9:
                    if ((i5 & i) != 0) {
                        gl6.z(i6, P(i4), unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 10:
                    if ((i5 & i) != 0) {
                        gl6.i(i6, (b0) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case lVo.HKDF_SALT_FIELD_NUMBER:
                    if ((i5 & i) != 0) {
                        gl6.d(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 12:
                    if ((i5 & i) != 0) {
                        gl6.o(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 13:
                    if ((i5 & i) != 0) {
                        gl6.n(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 14:
                    if ((i5 & i) != 0) {
                        gl6.Q(unsafe.getLong(obj, j), i6);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 15:
                    if ((i5 & i) != 0) {
                        gl6.A(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 16:
                    if ((i5 & i) != 0) {
                        gl6.S(unsafe.getLong(obj, j), i6);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 17:
                    if ((i5 & i) != 0) {
                        gl6.h(i6, P(i4), unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                case 18:
                    dA8.S(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 19:
                    dA8.T(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 20:
                    dA8.p(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 21:
                    dA8.F(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 22:
                    dA8.k(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 23:
                    dA8.s(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 24:
                    dA8.W(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 25:
                    dA8.Q(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                case 26:
                    dA8.f(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6);
                    break;
                case 27:
                    dA8.G(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, P(i4));
                    break;
                case 28:
                    dA8.A(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6);
                    break;
                case 29:
                    dA8.a(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, false);
                    break;
                case 30:
                    dA8.d(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, false);
                    break;
                case 31:
                    dA8.B(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, false);
                    break;
                case 32:
                    dA8.l(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, false);
                    break;
                case 33:
                    dA8.M(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, false);
                    break;
                case 34:
                    dA8.E(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, false);
                    break;
                case 35:
                    dA8.S(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, true);
                    break;
                case 36:
                    dA8.T(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, true);
                    break;
                case 37:
                    dA8.p(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, true);
                    break;
                case 38:
                    dA8.F(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, true);
                    break;
                case 39:
                    dA8.k(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, true);
                    break;
                case 40:
                    dA8.s(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, true);
                    break;
                case 41:
                    dA8.W(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, true);
                    break;
                case 42:
                    dA8.Q(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, true);
                    break;
                case 43:
                    dA8.a(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, true);
                    break;
                case 44:
                    dA8.d(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, true);
                    break;
                case 45:
                    dA8.B(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, true);
                    break;
                case 46:
                    dA8.l(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, true);
                    break;
                case 47:
                    dA8.M(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, true);
                    break;
                case 48:
                    dA8.E(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, true);
                    break;
                case 49:
                    dA8.r(this.f5940R[i4], (List) unsafe.getObject(obj, j), gl6, P(i4));
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        nRz nrz = this.f5937R;
                        Object N = N(i4);
                        nrz.getClass();
                        jQ.Y(N);
                        throw null;
                    }
                    break;
                case 51:
                    if (i(i6, i4, obj)) {
                        gl6.V(((Double) hU3.P(j, obj)).doubleValue(), i6);
                        break;
                    }
                    break;
                case 52:
                    if (i(i6, i4, obj)) {
                        gl6.Y(i6, ((Float) hU3.P(j, obj)).floatValue());
                        break;
                    }
                    break;
                case 53:
                    if (i(i6, i4, obj)) {
                        gl6.u(z(j, obj), i6);
                        break;
                    }
                    break;
                case 54:
                    if (i(i6, i4, obj)) {
                        gl6.W(z(j, obj), i6);
                        break;
                    }
                    break;
                case 55:
                    if (i(i6, i4, obj)) {
                        gl6.I(i6, u(j, obj));
                        break;
                    }
                    break;
                case 56:
                    if (i(i6, i4, obj)) {
                        gl6.J(z(j, obj), i6);
                        break;
                    }
                    break;
                case 57:
                    if (i(i6, i4, obj)) {
                        gl6.K(i6, u(j, obj));
                        break;
                    }
                    break;
                case 58:
                    if (i(i6, i4, obj)) {
                        gl6.t(i6, ((Boolean) hU3.P(j, obj)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (i(i6, i4, obj)) {
                        f(i6, unsafe.getObject(obj, j), gl6);
                        break;
                    }
                    break;
                case 60:
                    if (i(i6, i4, obj)) {
                        gl6.z(i6, P(i4), unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 61:
                    if (i(i6, i4, obj)) {
                        gl6.i(i6, (b0) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (i(i6, i4, obj)) {
                        gl6.d(i6, u(j, obj));
                        break;
                    }
                    break;
                case 63:
                    if (i(i6, i4, obj)) {
                        gl6.o(i6, u(j, obj));
                        break;
                    }
                    break;
                case 64:
                    if (i(i6, i4, obj)) {
                        gl6.n(i6, u(j, obj));
                        break;
                    }
                    break;
                case 65:
                    if (i(i6, i4, obj)) {
                        gl6.Q(z(j, obj), i6);
                        break;
                    }
                    break;
                case 66:
                    if (i(i6, i4, obj)) {
                        gl6.A(i6, u(j, obj));
                        break;
                    }
                    break;
                case 67:
                    if (i(i6, i4, obj)) {
                        gl6.S(z(j, obj), i6);
                        break;
                    }
                    break;
                case 68:
                    if (i(i6, i4, obj)) {
                        gl6.h(i6, P(i4), unsafe.getObject(obj, j));
                        break;
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        this.f5935R.getClass();
        ((csA) obj).unknownFields.e(gl6);
    }

    public final void G(int i, int i2, Object obj) {
        hU3.K(i, (long) (this.f5940R[i2 + 2] & 1048575), obj);
    }

    public final boolean H(Object obj, int i, Object obj2) {
        return t(i, obj) == t(i, obj2);
    }

    public final void J(Object obj, int i, Object obj2) {
        int M = M(i);
        int i2 = this.f5940R[i];
        long j = (long) (M & 1048575);
        if (i(i2, i, obj2)) {
            Object obj3 = null;
            if (i(i2, i, obj)) {
                obj3 = hU3.P(j, obj);
            }
            Object P = hU3.P(j, obj2);
            if (obj3 != null && P != null) {
                hU3.Y(j, obj, ibk.v(obj3, P));
                G(i2, i, obj);
            } else if (P != null) {
                hU3.Y(j, obj, P);
                G(i2, i, obj);
            }
        }
    }

    public final void K(Object obj, int i, Object obj2) {
        long M = (long) (M(i) & 1048575);
        if (t(i, obj2)) {
            Object P = hU3.P(M, obj);
            Object P2 = hU3.P(M, obj2);
            if (P != null && P2 != null) {
                hU3.Y(M, obj, ibk.v(P, P2));
                p(i, obj);
            } else if (P2 != null) {
                hU3.Y(M, obj, P2);
                p(i, obj);
            }
        }
    }

    @Override // defpackage.bvr
    public final Object L() {
        mxz mxz = this.f5936R;
        qN qNVar = this.f5938R;
        mxz.getClass();
        return ((csA) qNVar).L(hZW.NEW_MUTABLE_INSTANCE);
    }

    public final int M(int i) {
        return this.f5940R[i + 1];
    }

    public final Object N(int i) {
        return this.f5941R[(i / 3) * 2];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (defpackage.dA8.z(defpackage.hU3.P(r6, r10), defpackage.hU3.P(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        if (defpackage.dA8.z(defpackage.hU3.P(r6, r10), defpackage.hU3.P(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0085, code lost:
        if (defpackage.hU3.N(r6, r10) == defpackage.hU3.N(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        if (defpackage.hU3.C(r6, r10) == defpackage.hU3.C(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ab, code lost:
        if (defpackage.hU3.N(r6, r10) == defpackage.hU3.N(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
        if (defpackage.hU3.C(r6, r10) == defpackage.hU3.C(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cf, code lost:
        if (defpackage.hU3.C(r6, r10) == defpackage.hU3.C(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e1, code lost:
        if (defpackage.hU3.C(r6, r10) == defpackage.hU3.C(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f7, code lost:
        if (defpackage.dA8.z(defpackage.hU3.P(r6, r10), defpackage.hU3.P(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010d, code lost:
        if (defpackage.dA8.z(defpackage.hU3.P(r6, r10), defpackage.hU3.P(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0123, code lost:
        if (defpackage.dA8.z(defpackage.hU3.P(r6, r10), defpackage.hU3.P(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0135, code lost:
        if (defpackage.hU3.L(r6, r10) == defpackage.hU3.L(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0147, code lost:
        if (defpackage.hU3.C(r6, r10) == defpackage.hU3.C(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015b, code lost:
        if (defpackage.hU3.N(r6, r10) == defpackage.hU3.N(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016d, code lost:
        if (defpackage.hU3.C(r6, r10) == defpackage.hU3.C(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0180, code lost:
        if (defpackage.hU3.N(r6, r10) == defpackage.hU3.N(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0193, code lost:
        if (defpackage.hU3.N(r6, r10) == defpackage.hU3.N(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ac, code lost:
        if (java.lang.Float.floatToIntBits(defpackage.hU3.U(r6, r10)) == java.lang.Float.floatToIntBits(defpackage.hU3.U(r6, r11))) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c7, code lost:
        if (java.lang.Double.doubleToLongBits(defpackage.hU3.H(r6, r10)) == java.lang.Double.doubleToLongBits(defpackage.hU3.H(r6, r11))) goto L_0x01cb;
     */
    @Override // defpackage.bvr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean O(java.lang.Object r10, java.lang.Object r11) {
        /*
        // Method dump skipped, instructions count: 634
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6r.O(java.lang.Object, java.lang.Object):boolean");
    }

    public final bvr P(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f5941R;
        bvr bvr = (bvr) objArr[i2];
        if (bvr != null) {
            return bvr;
        }
        bvr R2 = kV5.R.R((Class) objArr[i2 + 1]);
        this.f5941R[i2] = R2;
        return R2;
    }

    public final int Q(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, cDk cdk) {
        Unsafe unsafe = R;
        long j2 = (long) (this.f5940R[i8 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(iWF.L(i, bArr)));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(iWF.C(i, bArr)));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int r = iWF.r(bArr, i, cdk);
                    unsafe.putObject(obj, j, Long.valueOf(cdk.R));
                    unsafe.putInt(obj, j2, i4);
                    return r;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int s = iWF.s(bArr, i, cdk);
                    unsafe.putObject(obj, j, Integer.valueOf(cdk.e));
                    unsafe.putInt(obj, j2, i4);
                    return s;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(iWF.H(i, bArr)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(iWF.m(i, bArr)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int r2 = iWF.r(bArr, i, cdk);
                    unsafe.putObject(obj, j, Boolean.valueOf(cdk.R != 0));
                    unsafe.putInt(obj, j2, i4);
                    return r2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int s2 = iWF.s(bArr, i, cdk);
                    int i13 = cdk.e;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) == 0 || d_A.X(bArr, s2, s2 + i13)) {
                        unsafe.putObject(obj, j, new String(bArr, s2, i13, ibk.v));
                        s2 += i13;
                    } else {
                        throw b7b.R();
                    }
                    unsafe.putInt(obj, j2, i4);
                    return s2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int g = iWF.g(P(i8), bArr, i, i2, cdk);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, cdk.f2017R);
                    } else {
                        unsafe.putObject(obj, j, ibk.v(object, cdk.f2017R));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return g;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int X = iWF.X(bArr, i, cdk);
                    unsafe.putObject(obj, j, cdk.f2017R);
                    unsafe.putInt(obj, j2, i4);
                    return X;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int s3 = iWF.s(bArr, i, cdk);
                    int i14 = cdk.e;
                    puu C = C(i8);
                    if (C == null || C.R()) {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        j(obj).c(i3, Long.valueOf((long) i14));
                    }
                    return s3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int s4 = iWF.s(bArr, i, cdk);
                    unsafe.putObject(obj, j, Integer.valueOf(b5.R(cdk.e)));
                    unsafe.putInt(obj, j2, i4);
                    return s4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int r3 = iWF.r(bArr, i, cdk);
                    unsafe.putObject(obj, j, Long.valueOf(b5.v(cdk.R)));
                    unsafe.putInt(obj, j2, i4);
                    return r3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int P = iWF.P(P(i8), bArr, i, i2, (i3 & -8) | 4, cdk);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, cdk.f2017R);
                    } else {
                        unsafe.putObject(obj, j, ibk.v(object2, cdk.f2017R));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return P;
                }
                break;
        }
        return i;
    }

    @Override // defpackage.bvr
    public final void R(Object obj, gL6 gl6) {
        gl6.getClass();
        if (this.f5943v) {
            int length = this.f5940R.length;
            for (int i = 0; i < length; i += 3) {
                int M = M(i);
                int i2 = this.f5940R[i];
                switch ((267386880 & M) >>> 20) {
                    case 0:
                        if (t(i, obj)) {
                            gl6.V(hU3.H((long) (M & 1048575), obj), i2);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (t(i, obj)) {
                            gl6.Y(i2, hU3.U((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (t(i, obj)) {
                            gl6.u(hU3.N((long) (M & 1048575), obj), i2);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (t(i, obj)) {
                            gl6.W(hU3.N((long) (M & 1048575), obj), i2);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (t(i, obj)) {
                            gl6.I(i2, hU3.C((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                    case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                        if (t(i, obj)) {
                            gl6.J(hU3.N((long) (M & 1048575), obj), i2);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (t(i, obj)) {
                            gl6.K(i2, hU3.C((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (t(i, obj)) {
                            gl6.t(i2, hU3.L((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                    case VmNativeCallback.$stable:
                        if (t(i, obj)) {
                            f(i2, hU3.P((long) (M & 1048575), obj), gl6);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (t(i, obj)) {
                            gl6.z(i2, P(i), hU3.P((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (t(i, obj)) {
                            gl6.i(i2, (b0) hU3.P((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                    case lVo.HKDF_SALT_FIELD_NUMBER:
                        if (t(i, obj)) {
                            gl6.d(i2, hU3.C((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (t(i, obj)) {
                            gl6.o(i2, hU3.C((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (t(i, obj)) {
                            gl6.n(i2, hU3.C((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (t(i, obj)) {
                            gl6.Q(hU3.N((long) (M & 1048575), obj), i2);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (t(i, obj)) {
                            gl6.A(i2, hU3.C((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (t(i, obj)) {
                            gl6.S(hU3.N((long) (M & 1048575), obj), i2);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (t(i, obj)) {
                            gl6.h(i2, P(i), hU3.P((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        dA8.S(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, false);
                        break;
                    case 19:
                        dA8.T(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, false);
                        break;
                    case 20:
                        dA8.p(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, false);
                        break;
                    case 21:
                        dA8.F(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, false);
                        break;
                    case 22:
                        dA8.k(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, false);
                        break;
                    case 23:
                        dA8.s(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, false);
                        break;
                    case 24:
                        dA8.W(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, false);
                        break;
                    case 25:
                        dA8.Q(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, false);
                        break;
                    case 26:
                        dA8.f(i2, (List) hU3.P((long) (M & 1048575), obj), gl6);
                        break;
                    case 27:
                        dA8.G(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, P(i));
                        break;
                    case 28:
                        dA8.A(i2, (List) hU3.P((long) (M & 1048575), obj), gl6);
                        break;
                    case 29:
                        dA8.a(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, false);
                        break;
                    case 30:
                        dA8.d(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, false);
                        break;
                    case 31:
                        dA8.B(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, false);
                        break;
                    case 32:
                        dA8.l(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, false);
                        break;
                    case 33:
                        dA8.M(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, false);
                        break;
                    case 34:
                        dA8.E(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, false);
                        break;
                    case 35:
                        dA8.S(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, true);
                        break;
                    case 36:
                        dA8.T(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, true);
                        break;
                    case 37:
                        dA8.p(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, true);
                        break;
                    case 38:
                        dA8.F(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, true);
                        break;
                    case 39:
                        dA8.k(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, true);
                        break;
                    case 40:
                        dA8.s(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, true);
                        break;
                    case 41:
                        dA8.W(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, true);
                        break;
                    case 42:
                        dA8.Q(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, true);
                        break;
                    case 43:
                        dA8.a(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, true);
                        break;
                    case 44:
                        dA8.d(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, true);
                        break;
                    case 45:
                        dA8.B(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, true);
                        break;
                    case 46:
                        dA8.l(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, true);
                        break;
                    case 47:
                        dA8.M(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, true);
                        break;
                    case 48:
                        dA8.E(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, true);
                        break;
                    case 49:
                        dA8.r(i2, (List) hU3.P((long) (M & 1048575), obj), gl6, P(i));
                        break;
                    case 50:
                        if (hU3.P((long) (M & 1048575), obj) == null) {
                            break;
                        } else {
                            nRz nrz = this.f5937R;
                            Object N = N(i);
                            nrz.getClass();
                            jQ.Y(N);
                            throw null;
                        }
                    case 51:
                        if (i(i2, i, obj)) {
                            gl6.V(((Double) hU3.P((long) (M & 1048575), obj)).doubleValue(), i2);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (i(i2, i, obj)) {
                            gl6.Y(i2, ((Float) hU3.P((long) (M & 1048575), obj)).floatValue());
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (i(i2, i, obj)) {
                            gl6.u(z((long) (M & 1048575), obj), i2);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (i(i2, i, obj)) {
                            gl6.W(z((long) (M & 1048575), obj), i2);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (i(i2, i, obj)) {
                            gl6.I(i2, u((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (i(i2, i, obj)) {
                            gl6.J(z((long) (M & 1048575), obj), i2);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (i(i2, i, obj)) {
                            gl6.K(i2, u((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (i(i2, i, obj)) {
                            gl6.t(i2, ((Boolean) hU3.P((long) (M & 1048575), obj)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (i(i2, i, obj)) {
                            f(i2, hU3.P((long) (M & 1048575), obj), gl6);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (i(i2, i, obj)) {
                            gl6.z(i2, P(i), hU3.P((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (i(i2, i, obj)) {
                            gl6.i(i2, (b0) hU3.P((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (i(i2, i, obj)) {
                            gl6.d(i2, u((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (i(i2, i, obj)) {
                            gl6.o(i2, u((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (i(i2, i, obj)) {
                            gl6.n(i2, u((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (i(i2, i, obj)) {
                            gl6.Q(z((long) (M & 1048575), obj), i2);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (i(i2, i, obj)) {
                            gl6.A(i2, u((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (i(i2, i, obj)) {
                            gl6.S(z((long) (M & 1048575), obj), i2);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (i(i2, i, obj)) {
                            gl6.h(i2, P(i), hU3.P((long) (M & 1048575), obj));
                            break;
                        } else {
                            break;
                        }
                }
            }
            this.f5935R.getClass();
            ((csA) obj).unknownFields.e(gl6);
            return;
        }
        E(obj, gl6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0338, code lost:
        if (r0 != r15) goto L_0x033a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0052 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S(java.lang.Object r32, byte[] r33, int r34, int r35, defpackage.cDk r36) {
        /*
        // Method dump skipped, instructions count: 944
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6r.S(java.lang.Object, byte[], int, int, cDk):void");
    }

    public final void T(Object obj, int i, clz clz) {
        if ((536870912 & i) != 0) {
            hU3.Y((long) (i & 1048575), obj, clz.A());
        } else if (this.f5939R) {
            hU3.Y((long) (i & 1048575), obj, clz.L());
        } else {
            hU3.Y((long) (i & 1048575), obj, clz.C());
        }
    }

    public final void U(Object obj, int i, Object obj2) {
        int i2 = this.f5940R[i];
        Object P = hU3.P((long) (M(i) & 1048575), obj);
        if (P != null && C(i) != null) {
            this.f5937R.getClass();
            bCh bch = (bCh) P;
            nRz nrz = this.f5937R;
            Object N = N(i);
            nrz.getClass();
            jQ.Y(N);
            throw null;
        }
    }

    public final void W(Object obj, long j, clz clz, bvr bvr, nCG ncg) {
        clz.W(this.f5934R.c(j, obj), bvr, ncg);
    }

    @Override // defpackage.bvr
    public final void X(Object obj, byte[] bArr, int i, int i2, cDk cdk) {
        if (this.f5943v) {
            S(obj, bArr, i, i2, cdk);
        } else {
            A(obj, bArr, i, i2, 0, cdk);
        }
    }

    @Override // defpackage.bvr
    public final boolean Z(Object obj) {
        int i = 0;
        int i2 = 0;
        int i3 = 1048575;
        while (true) {
            boolean z = true;
            if (i >= this.f5942c) {
                return true;
            }
            int i4 = this.f5944v[i];
            int i5 = this.f5940R[i4];
            int M = M(i4);
            int i6 = this.f5940R[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i3) {
                if (i7 != 1048575) {
                    i2 = R.getInt(obj, (long) i7);
                }
                i3 = i7;
            }
            if ((268435456 & M) != 0) {
                if (!(i3 == 1048575 ? t(i4, obj) : (i2 & i8) != 0)) {
                    return false;
                }
            }
            int i9 = (267386880 & M) >>> 20;
            if (i9 == 9 || i9 == 17) {
                if (i3 == 1048575) {
                    z = t(i4, obj);
                } else if ((i2 & i8) == 0) {
                    z = false;
                }
                if (z && !P(i4).Z(hU3.P((long) (M & 1048575), obj))) {
                    return false;
                }
            } else {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (i(i5, i4, obj) && !P(i4).Z(hU3.P((long) (M & 1048575), obj))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            nRz nrz = this.f5937R;
                            Object P = hU3.P((long) (M & 1048575), obj);
                            nrz.getClass();
                            if (!((bCh) P).isEmpty()) {
                                Object N = N(i4);
                                this.f5937R.getClass();
                                jQ.Y(N);
                                throw null;
                            }
                        }
                    }
                }
                List list = (List) hU3.P((long) (M & 1048575), obj);
                if (!list.isEmpty()) {
                    bvr P2 = P(i4);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!P2.Z(list.get(i10))) {
                            z = false;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            }
            i++;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:33:0x0070 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x0031 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:253:0x0007 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:254:0x0007 */
    @Override // defpackage.bvr
    public final void c(Object obj, clz clz, nCG ncg) {
        ncg.getClass();
        k3o k3o = this.f5935R;
        Object obj2 = null;
        while (true) {
            try {
                int N = clz.N();
                int B = (N < this.f5933R || N > this.v) ? -1 : B(N, 0);
                if (B >= 0) {
                    int M = M(B);
                    try {
                        switch (l(M)) {
                            case 0:
                                hU3.V(obj, I(M), clz.readDouble());
                                p(B, obj);
                                break;
                            case 1:
                                hU3.o(obj, I(M), clz.readFloat());
                                p(B, obj);
                                break;
                            case 2:
                                hU3.J(obj, I(M), clz.z());
                                p(B, obj);
                                break;
                            case 3:
                                hU3.J(obj, I(M), clz.n());
                                p(B, obj);
                                break;
                            case 4:
                                hU3.K(clz.g(), I(M), obj);
                                p(B, obj);
                                break;
                            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                                hU3.J(obj, I(M), clz.c());
                                p(B, obj);
                                break;
                            case 6:
                                hU3.K(clz.K(), I(M), obj);
                                p(B, obj);
                                break;
                            case 7:
                                hU3.g(obj, I(M), clz.Q());
                                p(B, obj);
                                break;
                            case VmNativeCallback.$stable:
                                T(obj, M, clz);
                                p(B, obj);
                                break;
                            case 9:
                                if (t(B, obj)) {
                                    hU3.Y(I(M), obj, ibk.v(hU3.P(I(M), obj), clz.I(P(B), ncg)));
                                    break;
                                } else {
                                    hU3.Y(I(M), obj, clz.I(P(B), ncg));
                                    p(B, obj);
                                    break;
                                }
                            case 10:
                                hU3.Y(I(M), obj, clz.C());
                                p(B, obj);
                                break;
                            case lVo.HKDF_SALT_FIELD_NUMBER:
                                hU3.K(clz.J(), I(M), obj);
                                p(B, obj);
                                break;
                            case 12:
                                int U = clz.U();
                                puu C = C(B);
                                if (C != null && !C.R()) {
                                    obj2 = dA8.n(N, U, obj2, k3o);
                                    break;
                                }
                                hU3.K(U, I(M), obj);
                                p(B, obj);
                                break;
                            case 13:
                                hU3.K(clz.r(), I(M), obj);
                                p(B, obj);
                                break;
                            case 14:
                                hU3.J(obj, I(M), clz.R());
                                p(B, obj);
                                break;
                            case 15:
                                hU3.K(clz.h(), I(M), obj);
                                p(B, obj);
                                break;
                            case 16:
                                hU3.J(obj, I(M), clz.t());
                                p(B, obj);
                                break;
                            case 17:
                                if (t(B, obj)) {
                                    hU3.Y(I(M), obj, ibk.v(hU3.P(I(M), obj), clz.Y(P(B), ncg)));
                                    break;
                                } else {
                                    hU3.Y(I(M), obj, clz.Y(P(B), ncg));
                                    p(B, obj);
                                    break;
                                }
                            case 18:
                                clz.v(this.f5934R.c(I(M), obj));
                                break;
                            case 19:
                                clz.H(this.f5934R.c(I(M), obj));
                                break;
                            case 20:
                                clz.S(this.f5934R.c(I(M), obj));
                                break;
                            case 21:
                                clz.j(this.f5934R.c(I(M), obj));
                                break;
                            case 22:
                                clz.m(this.f5934R.c(I(M), obj));
                                break;
                            case 23:
                                clz.x(this.f5934R.c(I(M), obj));
                                break;
                            case 24:
                                clz.o(this.f5934R.c(I(M), obj));
                                break;
                            case 25:
                                clz.i(this.f5934R.c(I(M), obj));
                                break;
                            case 26:
                                r(obj, M, clz);
                                break;
                            case 27:
                                s(obj, M, clz, P(B), ncg);
                                break;
                            case 28:
                                clz.T(this.f5934R.c(I(M), obj));
                                break;
                            case 29:
                                clz.e(this.f5934R.c(I(M), obj));
                                break;
                            case 30:
                                List c2 = this.f5934R.c(I(M), obj);
                                clz.V(c2);
                                obj2 = dA8.h(N, c2, C(B), obj2, k3o);
                                break;
                            case 31:
                                clz.y(this.f5934R.c(I(M), obj));
                                break;
                            case 32:
                                clz.O(this.f5934R.c(I(M), obj));
                                break;
                            case 33:
                                clz.d(this.f5934R.c(I(M), obj));
                                break;
                            case 34:
                                clz.s(this.f5934R.c(I(M), obj));
                                break;
                            case 35:
                                clz.v(this.f5934R.c(I(M), obj));
                                break;
                            case 36:
                                clz.H(this.f5934R.c(I(M), obj));
                                break;
                            case 37:
                                clz.S(this.f5934R.c(I(M), obj));
                                break;
                            case 38:
                                clz.j(this.f5934R.c(I(M), obj));
                                break;
                            case 39:
                                clz.m(this.f5934R.c(I(M), obj));
                                break;
                            case 40:
                                clz.x(this.f5934R.c(I(M), obj));
                                break;
                            case 41:
                                clz.o(this.f5934R.c(I(M), obj));
                                break;
                            case 42:
                                clz.i(this.f5934R.c(I(M), obj));
                                break;
                            case 43:
                                clz.e(this.f5934R.c(I(M), obj));
                                break;
                            case 44:
                                List c3 = this.f5934R.c(I(M), obj);
                                clz.V(c3);
                                obj2 = dA8.h(N, c3, C(B), obj2, k3o);
                                break;
                            case 45:
                                clz.y(this.f5934R.c(I(M), obj));
                                break;
                            case 46:
                                clz.O(this.f5934R.c(I(M), obj));
                                break;
                            case 47:
                                clz.d(this.f5934R.c(I(M), obj));
                                break;
                            case 48:
                                clz.s(this.f5934R.c(I(M), obj));
                                break;
                            case 49:
                                W(obj, I(M), clz, P(B), ncg);
                                break;
                            case 50:
                                o(obj, B, N(B));
                                throw null;
                                break;
                            case 51:
                                hU3.Y(I(M), obj, Double.valueOf(clz.readDouble()));
                                G(N, B, obj);
                                break;
                            case 52:
                                hU3.Y(I(M), obj, Float.valueOf(clz.readFloat()));
                                G(N, B, obj);
                                break;
                            case 53:
                                hU3.Y(I(M), obj, Long.valueOf(clz.z()));
                                G(N, B, obj);
                                break;
                            case 54:
                                hU3.Y(I(M), obj, Long.valueOf(clz.n()));
                                G(N, B, obj);
                                break;
                            case 55:
                                hU3.Y(I(M), obj, Integer.valueOf(clz.g()));
                                G(N, B, obj);
                                break;
                            case 56:
                                hU3.Y(I(M), obj, Long.valueOf(clz.c()));
                                G(N, B, obj);
                                break;
                            case 57:
                                hU3.Y(I(M), obj, Integer.valueOf(clz.K()));
                                G(N, B, obj);
                                break;
                            case 58:
                                hU3.Y(I(M), obj, Boolean.valueOf(clz.Q()));
                                G(N, B, obj);
                                break;
                            case 59:
                                T(obj, M, clz);
                                G(N, B, obj);
                                break;
                            case 60:
                                if (i(N, B, obj)) {
                                    hU3.Y(I(M), obj, ibk.v(hU3.P(I(M), obj), clz.I(P(B), ncg)));
                                } else {
                                    hU3.Y(I(M), obj, clz.I(P(B), ncg));
                                    p(B, obj);
                                }
                                G(N, B, obj);
                                break;
                            case 61:
                                hU3.Y(I(M), obj, clz.C());
                                G(N, B, obj);
                                break;
                            case 62:
                                hU3.Y(I(M), obj, Integer.valueOf(clz.J()));
                                G(N, B, obj);
                                break;
                            case 63:
                                int U2 = clz.U();
                                puu C2 = C(B);
                                if (C2 != null && !C2.R()) {
                                    obj2 = dA8.n(N, U2, obj2, k3o);
                                    break;
                                }
                                hU3.Y(I(M), obj, Integer.valueOf(U2));
                                G(N, B, obj);
                                break;
                            case 64:
                                hU3.Y(I(M), obj, Integer.valueOf(clz.r()));
                                G(N, B, obj);
                                break;
                            case 65:
                                hU3.Y(I(M), obj, Long.valueOf(clz.R()));
                                G(N, B, obj);
                                break;
                            case 66:
                                hU3.Y(I(M), obj, Integer.valueOf(clz.h()));
                                G(N, B, obj);
                                break;
                            case 67:
                                hU3.Y(I(M), obj, Long.valueOf(clz.t()));
                                G(N, B, obj);
                                break;
                            case 68:
                                hU3.Y(I(M), obj, clz.Y(P(B), ncg));
                                G(N, B, obj);
                                break;
                            default:
                                if (obj2 == null) {
                                    k3o.getClass();
                                    obj2 = k3o.v();
                                }
                                k3o.getClass();
                                if (!k3o.R(obj2, clz)) {
                                    for (int i = this.f5942c; i < this.e; i++) {
                                        U(obj, this.f5944v[i], obj2);
                                    }
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } catch (p3X unused) {
                        k3o.getClass();
                        obj2 = obj2;
                        if (obj2 == null) {
                            csA csa = (csA) obj;
                            f2c f2c = csa.unknownFields;
                            f2c f2c2 = f2c;
                            if (f2c == f2c.R) {
                                f2c v = f2c.v();
                                csa.unknownFields = v;
                                f2c2 = v;
                            }
                            obj2 = f2c2;
                        }
                        if (!k3o.R(obj2, clz)) {
                            for (int i2 = this.f5942c; i2 < this.e; i2++) {
                                U(obj, this.f5944v[i2], obj2);
                            }
                            if (obj2 == null) {
                                return;
                            }
                        }
                    }
                } else if (N == Integer.MAX_VALUE) {
                    for (int i3 = this.f5942c; i3 < this.e; i3++) {
                        U(obj, this.f5944v[i3], obj2);
                    }
                    if (obj2 == null) {
                        return;
                    }
                } else {
                    k3o.getClass();
                    obj2 = obj2;
                    if (obj2 == null) {
                        csA csa2 = (csA) obj;
                        f2c f2c3 = csa2.unknownFields;
                        f2c f2c4 = f2c3;
                        if (f2c3 == f2c.R) {
                            f2c v2 = f2c.v();
                            csa2.unknownFields = v2;
                            f2c4 = v2;
                        }
                        obj2 = f2c4;
                    }
                    if (!k3o.R(obj2, clz)) {
                        for (int i4 = this.f5942c; i4 < this.e; i4++) {
                            U(obj, this.f5944v[i4], obj2);
                        }
                        if (obj2 == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.f5942c; i5 < this.e; i5++) {
                    U(obj, this.f5944v[i5], obj2);
                }
                if (obj2 != null) {
                    k3o.getClass();
                    k3o.c(obj, obj2);
                }
                throw th;
            }
        }
        k3o.getClass();
        k3o.c(obj, obj2);
    }

    public final int d(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, cDk cdk) {
        int i8;
        Unsafe unsafe = R;
        vB vBVar = (vB) ((aFq) unsafe.getObject(obj, j2));
        boolean v = vBVar.v();
        aFq afq = vBVar;
        if (!v) {
            int size = vBVar.size();
            aFq e = vBVar.e(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, e);
            afq = e;
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return iWF.i(bArr, i, afq, cdk);
                }
                if (i5 == 1) {
                    return iWF.Z(i3, bArr, i, i2, afq, cdk);
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    return iWF.K(bArr, i, afq, cdk);
                }
                if (i5 == 5) {
                    return iWF.N(i3, bArr, i, i2, afq, cdk);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return iWF.I(bArr, i, afq, cdk);
                }
                if (i5 == 0) {
                    return iWF.k(i3, bArr, i, i2, afq, cdk);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return iWF.h(bArr, i, afq, cdk);
                }
                if (i5 == 0) {
                    return iWF.T(i3, bArr, i, i2, afq, cdk);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return iWF.o(bArr, i, afq, cdk);
                }
                if (i5 == 1) {
                    return iWF.U(i3, bArr, i, i2, afq, cdk);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return iWF.V(bArr, i, afq, cdk);
                }
                if (i5 == 5) {
                    return iWF.x(i3, bArr, i, i2, afq, cdk);
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    return iWF.t(bArr, i, afq, cdk);
                }
                if (i5 == 0) {
                    return iWF.e(i3, bArr, i, i2, afq, cdk);
                }
                break;
            case 26:
                if (i5 == 2) {
                    return (j & 536870912) == 0 ? iWF.Q(i3, bArr, i, i2, afq, cdk) : iWF.A(i3, bArr, i, i2, afq, cdk);
                }
                break;
            case 27:
                if (i5 == 2) {
                    return iWF.y(P(i6), i3, bArr, i, i2, afq, cdk);
                }
                break;
            case 28:
                if (i5 == 2) {
                    return iWF.O(i3, bArr, i, i2, afq, cdk);
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    i8 = iWF.h(bArr, i, afq, cdk);
                } else if (i5 == 0) {
                    i8 = iWF.T(i3, bArr, i, i2, afq, cdk);
                }
                csA csa = (csA) obj;
                f2c f2c = csa.unknownFields;
                if (f2c == f2c.R) {
                    f2c = null;
                }
                f2c f2c2 = (f2c) dA8.h(i4, afq, C(i6), f2c, this.f5935R);
                if (f2c2 != null) {
                    csa.unknownFields = f2c2;
                }
                return i8;
            case 33:
            case 47:
                if (i5 == 2) {
                    return iWF.J(bArr, i, afq, cdk);
                }
                if (i5 == 0) {
                    return iWF.u(i3, bArr, i, i2, afq, cdk);
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    return iWF.Y(bArr, i, afq, cdk);
                }
                if (i5 == 0) {
                    return iWF.z(i3, bArr, i, i2, afq, cdk);
                }
                break;
            case 49:
                if (i5 == 3) {
                    return iWF.j(P(i6), i3, bArr, i, i2, afq, cdk);
                }
                break;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00de, code lost:
        if (r3 != false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f3, code lost:
        if (r3 != false) goto L_0x01f7;
     */
    @Override // defpackage.bvr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(java.lang.Object r11) {
        /*
        // Method dump skipped, instructions count: 742
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6r.e(java.lang.Object):int");
    }

    public final int g(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Unsafe unsafe = R;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        for (int i10 = 0; i10 < this.f5940R.length; i10 += 3) {
            int M = M(i10);
            int[] iArr = this.f5940R;
            int i11 = iArr[i10];
            int i12 = (267386880 & M) >>> 20;
            if (i12 <= 17) {
                int i13 = iArr[i10 + 2];
                int i14 = i13 & 1048575;
                i = 1 << (i13 >>> 20);
                if (i14 != i9) {
                    i8 = unsafe.getInt(obj, (long) i14);
                    i9 = i14;
                }
            } else {
                i = 0;
            }
            long j = (long) (M & 1048575);
            switch (i12) {
                case 0:
                    if ((i8 & i) != 0) {
                        i2 = d3.e(i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i8 & i) != 0) {
                        i2 = d3.Z(i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i8 & i) != 0) {
                        i2 = d3.U(unsafe.getLong(obj, j), i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i8 & i) != 0) {
                        i2 = d3.o(unsafe.getLong(obj, j), i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i8 & i) != 0) {
                        i2 = d3.x(i11, unsafe.getInt(obj, j));
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                    if ((i8 & i) != 0) {
                        i2 = d3.L(i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i8 & i) != 0) {
                        i2 = d3.O(i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i8 & i) != 0) {
                        i2 = d3.v(i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case VmNativeCallback.$stable:
                    if ((i8 & i) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        i3 = object instanceof b0 ? d3.c(i11, (b0) object) : d3.g(i11, (String) object);
                        i7 += i3;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i8 & i) != 0) {
                        i2 = dA8.P(i11, P(i10), unsafe.getObject(obj, j));
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i8 & i) != 0) {
                        i2 = d3.c(i11, (b0) unsafe.getObject(obj, j));
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case lVo.HKDF_SALT_FIELD_NUMBER:
                    if ((i8 & i) != 0) {
                        i2 = d3.i(i11, unsafe.getInt(obj, j));
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i8 & i) != 0) {
                        i2 = d3.X(i11, unsafe.getInt(obj, j));
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i8 & i) != 0) {
                        i2 = d3.C(i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i8 & i) != 0) {
                        i2 = d3.N(i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i8 & i) != 0) {
                        i2 = d3.P(i11, unsafe.getInt(obj, j));
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i8 & i) != 0) {
                        i2 = d3.j(unsafe.getLong(obj, j), i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i8 & i) != 0) {
                        i2 = d3.m(i11, (qN) unsafe.getObject(obj, j), P(i10));
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i2 = dA8.Z(i11, (List) unsafe.getObject(obj, j));
                    i7 += i2;
                    break;
                case 19:
                    i2 = dA8.O(i11, (List) unsafe.getObject(obj, j));
                    i7 += i2;
                    break;
                case 20:
                    i2 = dA8.C(i11, (List) unsafe.getObject(obj, j));
                    i7 += i2;
                    break;
                case 21:
                    i2 = dA8.J(i11, (List) unsafe.getObject(obj, j));
                    i7 += i2;
                    break;
                case 22:
                    i2 = dA8.H(i11, (List) unsafe.getObject(obj, j));
                    i7 += i2;
                    break;
                case 23:
                    i2 = dA8.Z(i11, (List) unsafe.getObject(obj, j));
                    i7 += i2;
                    break;
                case 24:
                    i2 = dA8.O(i11, (List) unsafe.getObject(obj, j));
                    i7 += i2;
                    break;
                case 25:
                    i2 = dA8.R(i11, (List) unsafe.getObject(obj, j));
                    i7 += i2;
                    break;
                case 26:
                    i2 = dA8.V(i11, (List) unsafe.getObject(obj, j));
                    i7 += i2;
                    break;
                case 27:
                    i2 = dA8.j(i11, (List) unsafe.getObject(obj, j), P(i10));
                    i7 += i2;
                    break;
                case 28:
                    i2 = dA8.c(i11, (List) unsafe.getObject(obj, j));
                    i7 += i2;
                    break;
                case 29:
                    i2 = dA8.o(i11, (List) unsafe.getObject(obj, j));
                    i7 += i2;
                    break;
                case 30:
                    i2 = dA8.e(i11, (List) unsafe.getObject(obj, j));
                    i7 += i2;
                    break;
                case 31:
                    i2 = dA8.O(i11, (List) unsafe.getObject(obj, j));
                    i7 += i2;
                    break;
                case 32:
                    i2 = dA8.Z(i11, (List) unsafe.getObject(obj, j));
                    i7 += i2;
                    break;
                case 33:
                    i2 = dA8.g(i11, (List) unsafe.getObject(obj, j));
                    i7 += i2;
                    break;
                case 34:
                    i2 = dA8.t(i11, (List) unsafe.getObject(obj, j));
                    i7 += i2;
                    break;
                case 35:
                    i6 = dA8.m((List) unsafe.getObject(obj, j));
                    if (i6 > 0) {
                        i5 = d3.t(i11);
                        i4 = d3.V(i6);
                        i7 += i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    i6 = dA8.L((List) unsafe.getObject(obj, j));
                    if (i6 > 0) {
                        i5 = d3.t(i11);
                        i4 = d3.V(i6);
                        i7 += i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    i6 = dA8.N((List) unsafe.getObject(obj, j));
                    if (i6 > 0) {
                        i5 = d3.t(i11);
                        i4 = d3.V(i6);
                        i7 += i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    i6 = dA8.Y((List) unsafe.getObject(obj, j));
                    if (i6 > 0) {
                        i5 = d3.t(i11);
                        i4 = d3.V(i6);
                        i7 += i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    i6 = dA8.U((List) unsafe.getObject(obj, j));
                    if (i6 > 0) {
                        i5 = d3.t(i11);
                        i4 = d3.V(i6);
                        i7 += i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    i6 = dA8.m((List) unsafe.getObject(obj, j));
                    if (i6 > 0) {
                        i5 = d3.t(i11);
                        i4 = d3.V(i6);
                        i7 += i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    i6 = dA8.L((List) unsafe.getObject(obj, j));
                    if (i6 > 0) {
                        i5 = d3.t(i11);
                        i4 = d3.V(i6);
                        i7 += i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    i6 = dA8.v((List) unsafe.getObject(obj, j));
                    if (i6 > 0) {
                        i5 = d3.t(i11);
                        i4 = d3.V(i6);
                        i7 += i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    i6 = dA8.K((List) unsafe.getObject(obj, j));
                    if (i6 > 0) {
                        i5 = d3.t(i11);
                        i4 = d3.V(i6);
                        i7 += i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    i6 = dA8.X((List) unsafe.getObject(obj, j));
                    if (i6 > 0) {
                        i5 = d3.t(i11);
                        i4 = d3.V(i6);
                        i7 += i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    i6 = dA8.L((List) unsafe.getObject(obj, j));
                    if (i6 > 0) {
                        i5 = d3.t(i11);
                        i4 = d3.V(i6);
                        i7 += i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    i6 = dA8.m((List) unsafe.getObject(obj, j));
                    if (i6 > 0) {
                        i5 = d3.t(i11);
                        i4 = d3.V(i6);
                        i7 += i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    i6 = dA8.y((List) unsafe.getObject(obj, j));
                    if (i6 > 0) {
                        i5 = d3.t(i11);
                        i4 = d3.V(i6);
                        i7 += i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    i6 = dA8.i((List) unsafe.getObject(obj, j));
                    if (i6 > 0) {
                        i5 = d3.t(i11);
                        i4 = d3.V(i6);
                        i7 += i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    i2 = dA8.x(i11, (List) unsafe.getObject(obj, j), P(i10));
                    i7 += i2;
                    break;
                case 50:
                    nRz nrz = this.f5937R;
                    Object object2 = unsafe.getObject(obj, j);
                    Object N = N(i10);
                    nrz.getClass();
                    nRz.v(object2, N);
                    i7 += 0;
                    break;
                case 51:
                    if (i(i11, i10, obj)) {
                        i2 = d3.e(i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (i(i11, i10, obj)) {
                        i2 = d3.Z(i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (i(i11, i10, obj)) {
                        i2 = d3.U(z(j, obj), i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (i(i11, i10, obj)) {
                        i2 = d3.o(z(j, obj), i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (i(i11, i10, obj)) {
                        i2 = d3.x(i11, u(j, obj));
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (i(i11, i10, obj)) {
                        i2 = d3.L(i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (i(i11, i10, obj)) {
                        i2 = d3.O(i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (i(i11, i10, obj)) {
                        i2 = d3.v(i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (i(i11, i10, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        i3 = object3 instanceof b0 ? d3.c(i11, (b0) object3) : d3.g(i11, (String) object3);
                        i7 += i3;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (i(i11, i10, obj)) {
                        i2 = dA8.P(i11, P(i10), unsafe.getObject(obj, j));
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (i(i11, i10, obj)) {
                        i2 = d3.c(i11, (b0) unsafe.getObject(obj, j));
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (i(i11, i10, obj)) {
                        i2 = d3.i(i11, u(j, obj));
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (i(i11, i10, obj)) {
                        i2 = d3.X(i11, u(j, obj));
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (i(i11, i10, obj)) {
                        i2 = d3.C(i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (i(i11, i10, obj)) {
                        i2 = d3.N(i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (i(i11, i10, obj)) {
                        i2 = d3.P(i11, u(j, obj));
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (i(i11, i10, obj)) {
                        i2 = d3.j(z(j, obj), i11);
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (i(i11, i10, obj)) {
                        i2 = d3.m(i11, (qN) unsafe.getObject(obj, j), P(i10));
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f5935R.getClass();
        return ((csA) obj).unknownFields.R() + i7;
    }

    public final boolean i(int i, int i2, Object obj) {
        return hU3.C((long) (this.f5940R[i2 + 2] & 1048575), obj) == i;
    }

    @Override // defpackage.bvr
    public final void m(Object obj) {
        int i;
        int i2 = this.f5942c;
        while (true) {
            i = this.e;
            if (i2 >= i) {
                break;
            }
            long M = (long) (M(this.f5944v[i2]) & 1048575);
            Object P = hU3.P(M, obj);
            if (P != null) {
                this.f5937R.getClass();
                ((bCh) P).f1566R = false;
                hU3.Y(M, obj, P);
            }
            i2++;
        }
        int length = this.f5944v.length;
        while (i < length) {
            this.f5934R.R((long) this.f5944v[i], obj);
            i++;
        }
        this.f5935R.getClass();
        ((csA) obj).unknownFields.f3282R = false;
    }

    public final void n(Object obj, int i, long j) {
        Unsafe unsafe = R;
        Object N = N(i);
        Object object = unsafe.getObject(obj, j);
        this.f5937R.getClass();
        if (nRz.c(object)) {
            this.f5937R.getClass();
            bCh X = nRz.X();
            this.f5937R.getClass();
            nRz.e(X, object);
            unsafe.putObject(obj, j, X);
        }
        this.f5937R.getClass();
        nRz.R(N);
        throw null;
    }

    public final void o(Object obj, int i, Object obj2) {
        long M = (long) (M(i) & 1048575);
        Object P = hU3.P(M, obj);
        if (P != null) {
            this.f5937R.getClass();
            if (nRz.c(P)) {
                this.f5937R.getClass();
                Object X = nRz.X();
                this.f5937R.getClass();
                nRz.e(X, P);
                hU3.Y(M, obj, X);
                P = X;
            }
        } else {
            this.f5937R.getClass();
            P = nRz.X();
            hU3.Y(M, obj, P);
        }
        this.f5937R.getClass();
        bCh bch = (bCh) P;
        this.f5937R.getClass();
        jQ.Y(obj2);
        throw null;
    }

    public final void p(int i, Object obj) {
        int i2 = this.f5940R[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            hU3.K((1 << (i2 >>> 20)) | hU3.C(j, obj), j, obj);
        }
    }

    public final void r(Object obj, int i, clz clz) {
        if ((536870912 & i) != 0) {
            clz.P(this.f5934R.c((long) (i & 1048575), obj));
        } else {
            clz.Z(this.f5934R.c((long) (i & 1048575), obj));
        }
    }

    public final void s(Object obj, int i, clz clz, bvr bvr, nCG ncg) {
        clz.u(this.f5934R.c((long) (i & 1048575), obj), bvr, ncg);
    }

    public final boolean t(int i, Object obj) {
        boolean equals;
        int i2 = this.f5940R[i + 2];
        long j = (long) (i2 & 1048575);
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & hU3.C(j, obj)) != 0;
        }
        int M = M(i);
        long j2 = (long) (M & 1048575);
        switch ((M & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(hU3.H(j2, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(hU3.U(j2, obj)) != 0;
            case 2:
                return hU3.N(j2, obj) != 0;
            case 3:
                return hU3.N(j2, obj) != 0;
            case 4:
                return hU3.C(j2, obj) != 0;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return hU3.N(j2, obj) != 0;
            case 6:
                return hU3.C(j2, obj) != 0;
            case 7:
                return hU3.L(j2, obj);
            case VmNativeCallback.$stable:
                Object P = hU3.P(j2, obj);
                if (P instanceof String) {
                    equals = ((String) P).isEmpty();
                    break;
                } else if (P instanceof b0) {
                    equals = b0.f1499R.equals(P);
                    break;
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return hU3.P(j2, obj) != null;
            case 10:
                equals = b0.f1499R.equals(hU3.P(j2, obj));
                break;
            case lVo.HKDF_SALT_FIELD_NUMBER:
                return hU3.C(j2, obj) != 0;
            case 12:
                return hU3.C(j2, obj) != 0;
            case 13:
                return hU3.C(j2, obj) != 0;
            case 14:
                return hU3.N(j2, obj) != 0;
            case 15:
                return hU3.C(j2, obj) != 0;
            case 16:
                return hU3.N(j2, obj) != 0;
            case 17:
                return hU3.P(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !equals;
    }

    @Override // defpackage.bvr
    public final void v(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.f5940R.length; i += 3) {
            int M = M(i);
            long j = (long) (1048575 & M);
            int i2 = this.f5940R[i];
            switch ((M & 267386880) >>> 20) {
                case 0:
                    if (t(i, obj2)) {
                        hU3.V(obj, j, hU3.H(j, obj2));
                        p(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (t(i, obj2)) {
                        hU3.o(obj, j, hU3.U(j, obj2));
                        p(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (t(i, obj2)) {
                        hU3.J(obj, j, hU3.N(j, obj2));
                        p(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (t(i, obj2)) {
                        hU3.J(obj, j, hU3.N(j, obj2));
                        p(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (t(i, obj2)) {
                        hU3.K(hU3.C(j, obj2), j, obj);
                        p(i, obj);
                        break;
                    } else {
                        break;
                    }
                case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                    if (t(i, obj2)) {
                        hU3.J(obj, j, hU3.N(j, obj2));
                        p(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (t(i, obj2)) {
                        hU3.K(hU3.C(j, obj2), j, obj);
                        p(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (t(i, obj2)) {
                        hU3.g(obj, j, hU3.L(j, obj2));
                        p(i, obj);
                        break;
                    } else {
                        break;
                    }
                case VmNativeCallback.$stable:
                    if (t(i, obj2)) {
                        hU3.Y(j, obj, hU3.P(j, obj2));
                        p(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    K(obj, i, obj2);
                    break;
                case 10:
                    if (t(i, obj2)) {
                        hU3.Y(j, obj, hU3.P(j, obj2));
                        p(i, obj);
                        break;
                    } else {
                        break;
                    }
                case lVo.HKDF_SALT_FIELD_NUMBER:
                    if (t(i, obj2)) {
                        hU3.K(hU3.C(j, obj2), j, obj);
                        p(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (t(i, obj2)) {
                        hU3.K(hU3.C(j, obj2), j, obj);
                        p(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (t(i, obj2)) {
                        hU3.K(hU3.C(j, obj2), j, obj);
                        p(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (t(i, obj2)) {
                        hU3.J(obj, j, hU3.N(j, obj2));
                        p(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (t(i, obj2)) {
                        hU3.K(hU3.C(j, obj2), j, obj);
                        p(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (t(i, obj2)) {
                        hU3.J(obj, j, hU3.N(j, obj2));
                        p(i, obj);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    K(obj, i, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f5934R.v(j, obj, obj2);
                    break;
                case 50:
                    nRz nrz = this.f5937R;
                    Class cls = dA8.R;
                    Object P = hU3.P(j, obj);
                    Object P2 = hU3.P(j, obj2);
                    nrz.getClass();
                    hU3.Y(j, obj, nRz.e(P, P2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (i(i2, i, obj2)) {
                        hU3.Y(j, obj, hU3.P(j, obj2));
                        G(i2, i, obj);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    J(obj, i, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (i(i2, i, obj2)) {
                        hU3.Y(j, obj, hU3.P(j, obj2));
                        G(i2, i, obj);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    J(obj, i, obj2);
                    break;
            }
        }
        dA8.u(this.f5935R, obj, obj2);
    }

    @Override // defpackage.bvr
    public final int x(Object obj) {
        return this.f5943v ? y(obj) : g(obj);
    }

    public final int y(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Unsafe unsafe = R;
        int i6 = 0;
        for (int i7 = 0; i7 < this.f5940R.length; i7 += 3) {
            int M = M(i7);
            int i8 = (267386880 & M) >>> 20;
            int i9 = this.f5940R[i7];
            long j = (long) (M & 1048575);
            if (i8 >= f1Y.DOUBLE_LIST_PACKED.R() && i8 <= f1Y.SINT64_LIST_PACKED.R()) {
                int i10 = this.f5940R[i7 + 2];
            }
            switch (i8) {
                case 0:
                    if (t(i7, obj)) {
                        i = d3.e(i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (t(i7, obj)) {
                        i = d3.Z(i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (t(i7, obj)) {
                        i = d3.U(hU3.N(j, obj), i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (t(i7, obj)) {
                        i = d3.o(hU3.N(j, obj), i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (t(i7, obj)) {
                        i = d3.x(i9, hU3.C(j, obj));
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                    if (t(i7, obj)) {
                        i = d3.L(i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (t(i7, obj)) {
                        i = d3.O(i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (t(i7, obj)) {
                        i = d3.v(i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case VmNativeCallback.$stable:
                    if (t(i7, obj)) {
                        Object P = hU3.P(j, obj);
                        i2 = P instanceof b0 ? d3.c(i9, (b0) P) : d3.g(i9, (String) P);
                        i6 = i2 + i6;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (t(i7, obj)) {
                        i = dA8.P(i9, P(i7), hU3.P(j, obj));
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (t(i7, obj)) {
                        i = d3.c(i9, (b0) hU3.P(j, obj));
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case lVo.HKDF_SALT_FIELD_NUMBER:
                    if (t(i7, obj)) {
                        i = d3.i(i9, hU3.C(j, obj));
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (t(i7, obj)) {
                        i = d3.X(i9, hU3.C(j, obj));
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (t(i7, obj)) {
                        i = d3.C(i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (t(i7, obj)) {
                        i = d3.N(i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (t(i7, obj)) {
                        i = d3.P(i9, hU3.C(j, obj));
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (t(i7, obj)) {
                        i = d3.j(hU3.N(j, obj), i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (t(i7, obj)) {
                        i = d3.m(i9, (qN) hU3.P(j, obj), P(i7));
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i = dA8.Z(i9, V(j, obj));
                    i6 += i;
                    break;
                case 19:
                    i = dA8.O(i9, V(j, obj));
                    i6 += i;
                    break;
                case 20:
                    i = dA8.C(i9, V(j, obj));
                    i6 += i;
                    break;
                case 21:
                    i = dA8.J(i9, V(j, obj));
                    i6 += i;
                    break;
                case 22:
                    i = dA8.H(i9, V(j, obj));
                    i6 += i;
                    break;
                case 23:
                    i = dA8.Z(i9, V(j, obj));
                    i6 += i;
                    break;
                case 24:
                    i = dA8.O(i9, V(j, obj));
                    i6 += i;
                    break;
                case 25:
                    i = dA8.R(i9, V(j, obj));
                    i6 += i;
                    break;
                case 26:
                    i = dA8.V(i9, V(j, obj));
                    i6 += i;
                    break;
                case 27:
                    i = dA8.j(i9, V(j, obj), P(i7));
                    i6 += i;
                    break;
                case 28:
                    i = dA8.c(i9, V(j, obj));
                    i6 += i;
                    break;
                case 29:
                    i = dA8.o(i9, V(j, obj));
                    i6 += i;
                    break;
                case 30:
                    i = dA8.e(i9, V(j, obj));
                    i6 += i;
                    break;
                case 31:
                    i = dA8.O(i9, V(j, obj));
                    i6 += i;
                    break;
                case 32:
                    i = dA8.Z(i9, V(j, obj));
                    i6 += i;
                    break;
                case 33:
                    i = dA8.g(i9, V(j, obj));
                    i6 += i;
                    break;
                case 34:
                    i = dA8.t(i9, V(j, obj));
                    i6 += i;
                    break;
                case 35:
                    i5 = dA8.m((List) unsafe.getObject(obj, j));
                    if (i5 > 0) {
                        i4 = d3.t(i9);
                        i3 = d3.V(i5);
                        i6 = i3 + i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    i5 = dA8.L((List) unsafe.getObject(obj, j));
                    if (i5 > 0) {
                        i4 = d3.t(i9);
                        i3 = d3.V(i5);
                        i6 = i3 + i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    i5 = dA8.N((List) unsafe.getObject(obj, j));
                    if (i5 > 0) {
                        i4 = d3.t(i9);
                        i3 = d3.V(i5);
                        i6 = i3 + i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    i5 = dA8.Y((List) unsafe.getObject(obj, j));
                    if (i5 > 0) {
                        i4 = d3.t(i9);
                        i3 = d3.V(i5);
                        i6 = i3 + i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    i5 = dA8.U((List) unsafe.getObject(obj, j));
                    if (i5 > 0) {
                        i4 = d3.t(i9);
                        i3 = d3.V(i5);
                        i6 = i3 + i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    i5 = dA8.m((List) unsafe.getObject(obj, j));
                    if (i5 > 0) {
                        i4 = d3.t(i9);
                        i3 = d3.V(i5);
                        i6 = i3 + i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    i5 = dA8.L((List) unsafe.getObject(obj, j));
                    if (i5 > 0) {
                        i4 = d3.t(i9);
                        i3 = d3.V(i5);
                        i6 = i3 + i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    i5 = dA8.v((List) unsafe.getObject(obj, j));
                    if (i5 > 0) {
                        i4 = d3.t(i9);
                        i3 = d3.V(i5);
                        i6 = i3 + i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    i5 = dA8.K((List) unsafe.getObject(obj, j));
                    if (i5 > 0) {
                        i4 = d3.t(i9);
                        i3 = d3.V(i5);
                        i6 = i3 + i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    i5 = dA8.X((List) unsafe.getObject(obj, j));
                    if (i5 > 0) {
                        i4 = d3.t(i9);
                        i3 = d3.V(i5);
                        i6 = i3 + i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    i5 = dA8.L((List) unsafe.getObject(obj, j));
                    if (i5 > 0) {
                        i4 = d3.t(i9);
                        i3 = d3.V(i5);
                        i6 = i3 + i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    i5 = dA8.m((List) unsafe.getObject(obj, j));
                    if (i5 > 0) {
                        i4 = d3.t(i9);
                        i3 = d3.V(i5);
                        i6 = i3 + i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    i5 = dA8.y((List) unsafe.getObject(obj, j));
                    if (i5 > 0) {
                        i4 = d3.t(i9);
                        i3 = d3.V(i5);
                        i6 = i3 + i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    i5 = dA8.i((List) unsafe.getObject(obj, j));
                    if (i5 > 0) {
                        i4 = d3.t(i9);
                        i3 = d3.V(i5);
                        i6 = i3 + i4 + i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    i = dA8.x(i9, V(j, obj), P(i7));
                    i6 += i;
                    break;
                case 50:
                    nRz nrz = this.f5937R;
                    Object P2 = hU3.P(j, obj);
                    Object N = N(i7);
                    nrz.getClass();
                    nRz.v(P2, N);
                    i6 += 0;
                    break;
                case 51:
                    if (i(i9, i7, obj)) {
                        i = d3.e(i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (i(i9, i7, obj)) {
                        i = d3.Z(i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (i(i9, i7, obj)) {
                        i = d3.U(z(j, obj), i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (i(i9, i7, obj)) {
                        i = d3.o(z(j, obj), i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (i(i9, i7, obj)) {
                        i = d3.x(i9, u(j, obj));
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (i(i9, i7, obj)) {
                        i = d3.L(i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (i(i9, i7, obj)) {
                        i = d3.O(i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (i(i9, i7, obj)) {
                        i = d3.v(i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (i(i9, i7, obj)) {
                        Object P3 = hU3.P(j, obj);
                        i2 = P3 instanceof b0 ? d3.c(i9, (b0) P3) : d3.g(i9, (String) P3);
                        i6 = i2 + i6;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (i(i9, i7, obj)) {
                        i = dA8.P(i9, P(i7), hU3.P(j, obj));
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (i(i9, i7, obj)) {
                        i = d3.c(i9, (b0) hU3.P(j, obj));
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (i(i9, i7, obj)) {
                        i = d3.i(i9, u(j, obj));
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (i(i9, i7, obj)) {
                        i = d3.X(i9, u(j, obj));
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (i(i9, i7, obj)) {
                        i = d3.C(i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (i(i9, i7, obj)) {
                        i = d3.N(i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (i(i9, i7, obj)) {
                        i = d3.P(i9, u(j, obj));
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (i(i9, i7, obj)) {
                        i = d3.j(z(j, obj), i9);
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (i(i9, i7, obj)) {
                        i = d3.m(i9, (qN) hU3.P(j, obj), P(i7));
                        i6 += i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f5935R.getClass();
        return ((csA) obj).unknownFields.R() + i6;
    }
}
