package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.List;
import java.util.Map;

/* renamed from: iWF  reason: default package */
/* loaded from: classes.dex */
public abstract class iWF {
    public static final /* synthetic */ int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f4627R = new int[0];

    /* renamed from: R  reason: collision with other field name */
    public static final Object[] f4628R = new Object[0];

    /* renamed from: R  reason: collision with other field name */
    public static final bSx f4625R = new bSx(0.31006f, 0.31616f);
    public static final bSx v = new bSx(0.34567f, 0.3585f);
    public static final bSx c = new bSx(0.32168f, 0.33767f);
    public static final bSx e = new bSx(0.31271f, 0.32902f);

    /* renamed from: R  reason: collision with other field name */
    public static final float[] f4626R = {0.964212f, 1.0f, 0.825188f};

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A(int r5, byte[] r6, int r7, int r8, defpackage.aFq r9, defpackage.cDk r10) {
        /*
            int r7 = s(r6, r7, r10)
            int r0 = r10.e
            if (r0 < 0) goto L_0x005f
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r9.add(r1)
            goto L_0x0023
        L_0x0010:
            int r2 = r7 + r0
            boolean r3 = defpackage.d_A.X(r6, r7, r2)
            if (r3 == 0) goto L_0x005a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = defpackage.ibk.v
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L_0x0022:
            r7 = r2
        L_0x0023:
            if (r7 >= r8) goto L_0x0059
            int r0 = s(r6, r7, r10)
            int r2 = r10.e
            if (r5 == r2) goto L_0x002e
            goto L_0x0059
        L_0x002e:
            int r7 = s(r6, r0, r10)
            int r0 = r10.e
            if (r0 < 0) goto L_0x0054
            if (r0 != 0) goto L_0x003c
            r9.add(r1)
            goto L_0x0023
        L_0x003c:
            int r2 = r7 + r0
            boolean r3 = defpackage.d_A.X(r6, r7, r2)
            if (r3 == 0) goto L_0x004f
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = defpackage.ibk.v
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
            goto L_0x0022
        L_0x004f:
            b7b r5 = defpackage.b7b.R()
            throw r5
        L_0x0054:
            b7b r5 = defpackage.b7b.e()
            throw r5
        L_0x0059:
            return r7
        L_0x005a:
            b7b r5 = defpackage.b7b.R()
            throw r5
        L_0x005f:
            b7b r5 = defpackage.b7b.e()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iWF.A(int, byte[], int, int, aFq, cDk):int");
    }

    public static final void B(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                B(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                B(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                MH mh = b0.f1499R;
                sb.append(p(new MH(((String) obj).getBytes(ibk.v))));
                sb.append('\"');
            } else if (obj instanceof b0) {
                sb.append(": \"");
                sb.append(p((b0) obj));
                sb.append('\"');
            } else if (obj instanceof csA) {
                sb.append(" {");
                l((csA) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                B(sb, i4, "key", entry2.getKey());
                B(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    public static float C(int i, byte[] bArr) {
        return Float.intBitsToFloat(m(i, bArr));
    }

    public static boolean G(byte b) {
        return b > -65;
    }

    public static long H(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int I(byte[] bArr, int i, aFq afq, cDk cdk) {
        j72 j72 = (j72) afq;
        int s = s(bArr, i, cdk);
        int i2 = cdk.e + s;
        while (s < i2) {
            s = r(bArr, s, cdk);
            j72.c(cdk.R);
        }
        if (s == i2) {
            return s;
        }
        throw b7b.O();
    }

    public static int J(byte[] bArr, int i, aFq afq, cDk cdk) {
        cUq cuq = (cUq) afq;
        int s = s(bArr, i, cdk);
        int i2 = cdk.e + s;
        while (s < i2) {
            s = s(bArr, s, cdk);
            cuq.c(b5.R(cdk.e));
        }
        if (s == i2) {
            return s;
        }
        throw b7b.O();
    }

    public static int K(byte[] bArr, int i, aFq afq, cDk cdk) {
        omi omi = (omi) afq;
        int s = s(bArr, i, cdk);
        int i2 = cdk.e + s;
        while (s < i2) {
            omi.c(Float.intBitsToFloat(m(s, bArr)));
            s += 4;
        }
        if (s == i2) {
            return s;
        }
        throw b7b.O();
    }

    public static double L(int i, byte[] bArr) {
        return Double.longBitsToDouble(H(i, bArr));
    }

    public static int N(int i, byte[] bArr, int i2, int i3, aFq afq, cDk cdk) {
        omi omi = (omi) afq;
        omi.c(Float.intBitsToFloat(m(i2, bArr)));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int s = s(bArr, i4, cdk);
            if (i != cdk.e) {
                break;
            }
            omi.c(Float.intBitsToFloat(m(s, bArr)));
            i4 = s + 4;
        }
        return i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int O(int r2, byte[] r3, int r4, int r5, defpackage.aFq r6, defpackage.cDk r7) {
        /*
            int r4 = s(r3, r4, r7)
            int r0 = r7.e
            if (r0 < 0) goto L_0x0053
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x004e
            if (r0 != 0) goto L_0x0014
            MH r0 = defpackage.b0.f1499R
            r6.add(r0)
            goto L_0x001c
        L_0x0014:
            MH r1 = defpackage.b0.H(r3, r4, r0)
            r6.add(r1)
        L_0x001b:
            int r4 = r4 + r0
        L_0x001c:
            if (r4 >= r5) goto L_0x004d
            int r0 = s(r3, r4, r7)
            int r1 = r7.e
            if (r2 == r1) goto L_0x0027
            goto L_0x004d
        L_0x0027:
            int r4 = s(r3, r0, r7)
            int r0 = r7.e
            if (r0 < 0) goto L_0x0048
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0043
            if (r0 != 0) goto L_0x003b
            MH r0 = defpackage.b0.f1499R
            r6.add(r0)
            goto L_0x001c
        L_0x003b:
            MH r1 = defpackage.b0.H(r3, r4, r0)
            r6.add(r1)
            goto L_0x001b
        L_0x0043:
            b7b r2 = defpackage.b7b.O()
            throw r2
        L_0x0048:
            b7b r2 = defpackage.b7b.e()
            throw r2
        L_0x004d:
            return r4
        L_0x004e:
            b7b r2 = defpackage.b7b.O()
            throw r2
        L_0x0053:
            b7b r2 = defpackage.b7b.e()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iWF.O(int, byte[], int, int, aFq, cDk):int");
    }

    public static int P(bvr bvr, byte[] bArr, int i, int i2, int i3, cDk cdk) {
        m6r m6r = (m6r) bvr;
        Object L = m6r.L();
        int A = m6r.A(L, bArr, i, i2, i3, cdk);
        m6r.m(L);
        cdk.f2017R = L;
        return A;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int Q(int r4, byte[] r5, int r6, int r7, defpackage.aFq r8, defpackage.cDk r9) {
        /*
            int r6 = s(r5, r6, r9)
            int r0 = r9.e
            if (r0 < 0) goto L_0x0045
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r8.add(r1)
            goto L_0x001b
        L_0x0010:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = defpackage.ibk.v
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L_0x001a:
            int r6 = r6 + r0
        L_0x001b:
            if (r6 >= r7) goto L_0x0044
            int r0 = s(r5, r6, r9)
            int r2 = r9.e
            if (r4 == r2) goto L_0x0026
            goto L_0x0044
        L_0x0026:
            int r6 = s(r5, r0, r9)
            int r0 = r9.e
            if (r0 < 0) goto L_0x003f
            if (r0 != 0) goto L_0x0034
            r8.add(r1)
            goto L_0x001b
        L_0x0034:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = defpackage.ibk.v
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
            goto L_0x001a
        L_0x003f:
            b7b r4 = defpackage.b7b.e()
            throw r4
        L_0x0044:
            return r6
        L_0x0045:
            b7b r4 = defpackage.b7b.e()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iWF.Q(int, byte[], int, int, aFq, cDk):int");
    }

    public static void R(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!G(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !G(b3) && !G(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw b7b.R();
    }

    public static int S(byte[] bArr, int i, cDk cdk) {
        int s = s(bArr, i, cdk);
        int i2 = cdk.e;
        if (i2 < 0) {
            throw b7b.e();
        } else if (i2 == 0) {
            cdk.f2017R = "";
            return s;
        } else {
            cdk.f2017R = d_A.R.v(bArr, s, i2);
            return s + i2;
        }
    }

    public static int T(int i, byte[] bArr, int i2, int i3, aFq afq, cDk cdk) {
        cUq cuq = (cUq) afq;
        int s = s(bArr, i2, cdk);
        cuq.c(cdk.e);
        while (s < i3) {
            int s2 = s(bArr, s, cdk);
            if (i != cdk.e) {
                break;
            }
            s = s(bArr, s2, cdk);
            cuq.c(cdk.e);
        }
        return s;
    }

    public static int U(int i, byte[] bArr, int i2, int i3, aFq afq, cDk cdk) {
        j72 j72 = (j72) afq;
        j72.c(H(i2, bArr));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int s = s(bArr, i4, cdk);
            if (i != cdk.e) {
                break;
            }
            j72.c(H(s, bArr));
            i4 = s + 8;
        }
        return i4;
    }

    public static int V(byte[] bArr, int i, aFq afq, cDk cdk) {
        cUq cuq = (cUq) afq;
        int s = s(bArr, i, cdk);
        int i2 = cdk.e + s;
        while (s < i2) {
            cuq.c(m(s, bArr));
            s += 4;
        }
        if (s == i2) {
            return s;
        }
        throw b7b.O();
    }

    public static int W(int i, byte[] bArr, int i2, cDk cdk) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            cdk.e = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            cdk.e = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            cdk.e = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            cdk.e = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                cdk.e = i11;
                return i12;
            }
        }
    }

    public static int X(byte[] bArr, int i, cDk cdk) {
        int s = s(bArr, i, cdk);
        int i2 = cdk.e;
        if (i2 < 0) {
            throw b7b.e();
        } else if (i2 > bArr.length - s) {
            throw b7b.O();
        } else if (i2 == 0) {
            cdk.f2017R = b0.f1499R;
            return s;
        } else {
            cdk.f2017R = b0.H(bArr, s, i2);
            return s + i2;
        }
    }

    public static int Y(byte[] bArr, int i, aFq afq, cDk cdk) {
        j72 j72 = (j72) afq;
        int s = s(bArr, i, cdk);
        int i2 = cdk.e + s;
        while (s < i2) {
            s = r(bArr, s, cdk);
            j72.c(b5.v(cdk.R));
        }
        if (s == i2) {
            return s;
        }
        throw b7b.O();
    }

    public static int Z(int i, byte[] bArr, int i2, int i3, aFq afq, cDk cdk) {
        c6m c6m = (c6m) afq;
        c6m.c(Double.longBitsToDouble(H(i2, bArr)));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int s = s(bArr, i4, cdk);
            if (i != cdk.e) {
                break;
            }
            c6m.c(Double.longBitsToDouble(H(s, bArr)));
            i4 = s + 8;
        }
        return i4;
    }

    public static final String c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static int d(int i, byte[] bArr, int i2, int i3, f2c f2c, cDk cdk) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int r = r(bArr, i2, cdk);
                f2c.c(i, Long.valueOf(cdk.R));
                return r;
            } else if (i4 == 1) {
                f2c.c(i, Long.valueOf(H(i2, bArr)));
                return i2 + 8;
            } else if (i4 == 2) {
                int s = s(bArr, i2, cdk);
                int i5 = cdk.e;
                if (i5 < 0) {
                    throw b7b.e();
                } else if (i5 <= bArr.length - s) {
                    if (i5 == 0) {
                        f2c.c(i, b0.f1499R);
                    } else {
                        f2c.c(i, b0.H(bArr, s, i5));
                    }
                    return s + i5;
                } else {
                    throw b7b.O();
                }
            } else if (i4 == 3) {
                f2c v2 = f2c.v();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int s2 = s(bArr, i2, cdk);
                    int i8 = cdk.e;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = s2;
                        break;
                    }
                    i2 = d(i8, bArr, s2, i3, v2, cdk);
                    i7 = i8;
                }
                if (i2 > i3 || i7 != i6) {
                    throw b7b.X();
                }
                f2c.c(i, v2);
                return i2;
            } else if (i4 == 5) {
                f2c.c(i, Integer.valueOf(m(i2, bArr)));
                return i2 + 4;
            } else {
                throw new b7b("Protocol message contained an invalid tag (zero).");
            }
        } else {
            throw new b7b("Protocol message contained an invalid tag (zero).");
        }
    }

    public static int e(int i, byte[] bArr, int i2, int i3, aFq afq, cDk cdk) {
        W2 w2 = (W2) afq;
        int r = r(bArr, i2, cdk);
        w2.c(cdk.R != 0);
        while (r < i3) {
            int s = s(bArr, r, cdk);
            if (i != cdk.e) {
                break;
            }
            r = r(bArr, s, cdk);
            w2.c(cdk.R != 0);
        }
        return r;
    }

    public static int g(bvr bvr, byte[] bArr, int i, int i2, cDk cdk) {
        int i3 = i + 1;
        byte b = bArr[i];
        byte b2 = b;
        if (b < 0) {
            i3 = W(b, bArr, i3, cdk);
            b2 = cdk.e;
        }
        if (b2 < 0 || b2 > i2 - i3) {
            throw b7b.O();
        }
        Object L = bvr.L();
        int i4 = (b2 == 1 ? 1 : 0) + i3;
        bvr.X(L, bArr, i3, i4, cdk);
        bvr.m(L);
        cdk.f2017R = L;
        return i4;
    }

    public static int h(byte[] bArr, int i, aFq afq, cDk cdk) {
        cUq cuq = (cUq) afq;
        int s = s(bArr, i, cdk);
        int i2 = cdk.e + s;
        while (s < i2) {
            s = s(bArr, s, cdk);
            cuq.c(cdk.e);
        }
        if (s == i2) {
            return s;
        }
        throw b7b.O();
    }

    public static int i(byte[] bArr, int i, aFq afq, cDk cdk) {
        c6m c6m = (c6m) afq;
        int s = s(bArr, i, cdk);
        int i2 = cdk.e + s;
        while (s < i2) {
            c6m.c(Double.longBitsToDouble(H(s, bArr)));
            s += 8;
        }
        if (s == i2) {
            return s;
        }
        throw b7b.O();
    }

    public static int j(bvr bvr, int i, byte[] bArr, int i2, int i3, aFq afq, cDk cdk) {
        int i4 = (i & -8) | 4;
        int P = P(bvr, bArr, i2, i3, i4, cdk);
        afq.add(cdk.f2017R);
        while (P < i3) {
            int s = s(bArr, P, cdk);
            if (i != cdk.e) {
                break;
            }
            P = P(bvr, bArr, s, i3, i4, cdk);
            afq.add(cdk.f2017R);
        }
        return P;
    }

    public static int k(int i, byte[] bArr, int i2, int i3, aFq afq, cDk cdk) {
        j72 j72 = (j72) afq;
        int r = r(bArr, i2, cdk);
        j72.c(cdk.R);
        while (r < i3) {
            int s = s(bArr, r, cdk);
            if (i != cdk.e) {
                break;
            }
            r = r(bArr, s, cdk);
            j72.c(cdk.R);
        }
        return r;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01cd, code lost:
        if (((java.lang.Integer) r4).intValue() == 0) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01df, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r4).floatValue()) == 0) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01f5, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r4).doubleValue()) == 0) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x022f, code lost:
        r6 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void l(defpackage.qN r13, java.lang.StringBuilder r14, int r15) {
        /*
        // Method dump skipped, instructions count: 620
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iWF.l(qN, java.lang.StringBuilder, int):void");
    }

    public static int m(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int n(byte[] bArr, int i, cDk cdk) {
        int s = s(bArr, i, cdk);
        int i2 = cdk.e;
        if (i2 < 0) {
            throw b7b.e();
        } else if (i2 == 0) {
            cdk.f2017R = "";
            return s;
        } else {
            cdk.f2017R = new String(bArr, s, i2, ibk.v);
            return s + i2;
        }
    }

    public static int o(byte[] bArr, int i, aFq afq, cDk cdk) {
        j72 j72 = (j72) afq;
        int s = s(bArr, i, cdk);
        int i2 = cdk.e + s;
        while (s < i2) {
            j72.c(H(s, bArr));
            s += 8;
        }
        if (s == i2) {
            return s;
        }
        throw b7b.O();
    }

    public static String p(b0 b0Var) {
        h89 h89 = new h89(28, b0Var);
        StringBuilder sb = new StringBuilder(((b0) h89.R).size());
        for (int i = 0; i < ((b0) h89.R).size(); i++) {
            byte R2 = ((b0) h89.R).R(i);
            if (R2 == 34) {
                sb.append("\\\"");
            } else if (R2 == 39) {
                sb.append("\\'");
            } else if (R2 != 92) {
                switch (R2) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case VmNativeCallback.$stable:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (R2 < 32 || R2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((R2 >>> 6) & 3) + 48));
                            sb.append((char) (((R2 >>> 3) & 7) + 48));
                            sb.append((char) ((R2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) R2);
                            continue;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static int r(byte[] bArr, int i, cDk cdk) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            cdk.R = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            i3++;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            b = b2;
        }
        cdk.R = j2;
        return i3;
    }

    public static int s(byte[] bArr, int i, cDk cdk) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return W(b, bArr, i2, cdk);
        }
        cdk.e = b;
        return i2;
    }

    public static int t(byte[] bArr, int i, aFq afq, cDk cdk) {
        W2 w2 = (W2) afq;
        int s = s(bArr, i, cdk);
        int i2 = cdk.e + s;
        while (s < i2) {
            s = r(bArr, s, cdk);
            w2.c(cdk.R != 0);
        }
        if (s == i2) {
            return s;
        }
        throw b7b.O();
    }

    public static int u(int i, byte[] bArr, int i2, int i3, aFq afq, cDk cdk) {
        cUq cuq = (cUq) afq;
        int s = s(bArr, i2, cdk);
        cuq.c(b5.R(cdk.e));
        while (s < i3) {
            int s2 = s(bArr, s, cdk);
            if (i != cdk.e) {
                break;
            }
            s = s(bArr, s2, cdk);
            cuq.c(b5.R(cdk.e));
        }
        return s;
    }

    public static void v(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (G(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || G(b3)))) {
            throw b7b.R();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    public static int x(int i, byte[] bArr, int i2, int i3, aFq afq, cDk cdk) {
        cUq cuq = (cUq) afq;
        cuq.c(m(i2, bArr));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int s = s(bArr, i4, cdk);
            if (i != cdk.e) {
                break;
            }
            cuq.c(m(s, bArr));
            i4 = s + 4;
        }
        return i4;
    }

    public static int y(bvr bvr, int i, byte[] bArr, int i2, int i3, aFq afq, cDk cdk) {
        int g = g(bvr, bArr, i2, i3, cdk);
        afq.add(cdk.f2017R);
        while (g < i3) {
            int s = s(bArr, g, cdk);
            if (i != cdk.e) {
                break;
            }
            g = g(bvr, bArr, s, i3, cdk);
            afq.add(cdk.f2017R);
        }
        return g;
    }

    public static int z(int i, byte[] bArr, int i2, int i3, aFq afq, cDk cdk) {
        j72 j72 = (j72) afq;
        int r = r(bArr, i2, cdk);
        j72.c(b5.v(cdk.R));
        while (r < i3) {
            int s = s(bArr, r, cdk);
            if (i != cdk.e) {
                break;
            }
            r = r(bArr, s, cdk);
            j72.c(b5.v(cdk.R));
        }
        return r;
    }
}
