package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: n3x  reason: default package */
/* loaded from: classes.dex */
public abstract class n3x {
    public static boolean C(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static String H(int i, int i2) {
        StringBuilder sb;
        String str;
        if (i == 64) {
            sb = new StringBuilder();
            str = "[APPLICATION ";
        } else if (i == 128) {
            sb = new StringBuilder();
            str = "[CONTEXT ";
        } else if (i != 192) {
            sb = new StringBuilder();
            str = "[UNIVERSAL ";
        } else {
            sb = new StringBuilder();
            str = "[PRIVATE ";
        }
        sb.append(str);
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    public static final double J(long j) {
        return (((double) (j >>> 11)) * ((double) 2048)) + ((double) (j & 2047));
    }

    public static String K(String str) {
        if (!iH_.r("|")) {
            List p = iH_.p(str);
            int size = (p.size() * 0) + str.length();
            g5M g5m = g5M.Y;
            int i = pdD.i(p);
            ArrayList arrayList = new ArrayList();
            Iterator it = p.iterator();
            int i2 = 0;
            while (true) {
                String str2 = null;
                if (it.hasNext()) {
                    Object next = it.next();
                    i2++;
                    if (i2 >= 0) {
                        String str3 = (String) next;
                        if (!(i2 == 0 || i2 == i) || !iH_.r(str3)) {
                            int length = str3.length();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    i3 = -1;
                                    break;
                                } else if (!jjU.g(str3.charAt(i3))) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            if (i3 != -1 && iH_.q(str3, "|", i3, false)) {
                                str2 = str3.substring("|".length() + i3);
                            }
                            if (str2 == null || (str2 = (String) g5m.x(str2)) == null) {
                                str2 = str3;
                            }
                        }
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                    } else {
                        pdD.k();
                        throw null;
                    }
                } else {
                    StringBuilder sb = new StringBuilder(size);
                    dF.mL(arrayList, sb, null, 124);
                    return sb.toString();
                }
            }
        } else {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
    }

    public static final aOO L(Object obj, aOO aoo, iv7 iv7) {
        if (iv7 instanceof C2) {
            return ((C2) iv7).X(obj, aoo);
        }
        nbD v = aoo.v();
        return v == aIH.R ? new dlK(obj, aoo, iv7) : new j8m(aoo, v, iv7, obj);
    }

    public static int N(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i3 = rect.left;
            i2 = rect2.right;
        } else if (i == 33) {
            i3 = rect.top;
            i2 = rect2.bottom;
        } else if (i == 66) {
            i3 = rect2.left;
            i2 = rect.right;
        } else if (i == 130) {
            i3 = rect2.top;
            i2 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i3 - i2);
    }

    public static int O(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int P(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final void R(StringBuilder sb, Object obj, kg9 kg9) {
        if (kg9 != null) {
            sb.append((CharSequence) kg9.x(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static final aOO U(aOO aoo) {
        plU plu = aoo instanceof plU ? (plU) aoo : null;
        if (plu != null && (aoo = plu.v) == null) {
            mx9 mx9 = (mx9) plu.v().O(hw1.c);
            aoo = mx9 != null ? new na6((kE9) mx9, plu) : plu;
            plu.v = aoo;
        }
        return aoo;
    }

    public static final String V(String str) {
        boolean z;
        boolean z2 = true;
        int i = 0;
        int i2 = -1;
        if (iH_.I(str, ":")) {
            byte[] R = (!iH_._(str, "[", false) || !str.endsWith("]")) ? e6C.R(0, str.length(), str) : e6C.R(1, str.length() - 1, str);
            if (R == null) {
                return null;
            }
            InetAddress byAddress = InetAddress.getByAddress(R);
            byte[] address = byAddress.getAddress();
            if (address.length == 16) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < address.length) {
                    int i5 = i3;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i2 = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                ME me = new ME();
                while (i < address.length) {
                    if (i == i2) {
                        me.a(58);
                        i += i4;
                        if (i == 16) {
                            me.a(58);
                        }
                    } else {
                        if (i > 0) {
                            me.a(58);
                        }
                        byte b = address[i];
                        byte[] bArr = asb.f1481R;
                        me.q((long) (((b & 255) << 8) | (address[i + 1] & 255)));
                        i += 2;
                    }
                }
                return me.G();
            } else if (address.length == 4) {
                return byAddress.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                Locale locale = Locale.US;
                bd4 bd4 = khE.R;
                String lowerCase = ascii.toLowerCase(locale);
                if (lowerCase.length() == 0) {
                    return null;
                }
                lG0 lg0 = e6C.R;
                int length = lowerCase.length();
                for (int i7 = 0; i7 < length; i7++) {
                    char charAt = lowerCase.charAt(i7);
                    if (O(charAt, 31) > 0 && O(charAt, 127) < 0 && iH_.W(" #%/:?@[\\]", charAt, 0, false, 6) == -1) {
                    }
                    z = true;
                    break;
                }
                z = false;
                if (z) {
                    return null;
                }
                int length2 = lowerCase.length();
                if (1 <= length2 && length2 < 254) {
                    int i8 = 0;
                    while (true) {
                        int W = iH_.W(lowerCase, '.', i8, false, 4);
                        int length3 = W == -1 ? lowerCase.length() - i8 : W - i8;
                        if (!(1 <= length3 && length3 < 64)) {
                            break;
                        } else if (W == -1 || W == lowerCase.length() - 1) {
                            break;
                        } else {
                            i8 = W + 1;
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public static kJ X(long j, m88 m88, int i, int i2) {
        long j2;
        jr_ jr_ = (jr_) m88;
        jr_.w(-1589582123);
        long j3 = 0;
        if ((i2 & 1) != 0) {
            float f = iZx.R;
            j2 = _1.X(27, jr_);
        } else {
            j2 = 0;
        }
        long R = (i2 & 2) != 0 ? _1.R(j2, jr_) : j;
        long z = (i2 & 4) != 0 ? aH9.z(n3.v(_1.X(iZx.f4646v, jr_), 0.38f), _1.e((E2) jr_.x(_1.R), iZx.v)) : 0;
        if ((i2 & 8) != 0) {
            j3 = n3.v(_1.R(j2, jr_), 0.38f);
        }
        kJ kJVar = new kJ(j2, R, z, j3);
        jr_.g(false);
        return kJVar;
    }

    public static final Object Z(long j, aOO aoo) {
        if (j <= 0) {
            return o8s.R;
        }
        xx xxVar = new xx(1, U(aoo));
        xxVar.j();
        if (j < Long.MAX_VALUE) {
            hdJ O = xxVar.f7480R.O(hw1.c);
            mou mou = O instanceof mou ? (mou) O : null;
            if (mou == null) {
                mou = bEz.R;
            }
            mou.C(j, xxVar);
        }
        Object P = xxVar.P();
        return P == bGR.COROUTINE_SUSPENDED ? P : o8s.R;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r10.right <= r12.left) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r10.left >= r12.right) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        r7 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = e(r9, r10, r11)
            boolean r1 = e(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L_0x007d
            if (r0 != 0) goto L_0x000f
            goto L_0x007d
        L_0x000f:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L_0x003d
            if (r9 == r3) goto L_0x0036
            if (r9 == r4) goto L_0x002f
            if (r9 != r1) goto L_0x0029
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L_0x0045
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x002f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L_0x0045
            goto L_0x0043
        L_0x0036:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L_0x0045
            goto L_0x0043
        L_0x003d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L_0x0045
        L_0x0043:
            r7 = r6
            goto L_0x0046
        L_0x0045:
            r7 = r2
        L_0x0046:
            if (r7 != 0) goto L_0x0049
            return r6
        L_0x0049:
            if (r9 == r5) goto L_0x007c
            if (r9 != r4) goto L_0x004e
            goto L_0x007c
        L_0x004e:
            int r11 = N(r9, r10, r11)
            if (r9 == r5) goto L_0x006f
            if (r9 == r3) goto L_0x006a
            if (r9 == r4) goto L_0x0065
            if (r9 != r1) goto L_0x005f
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L_0x0073
        L_0x005f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x0065:
            int r9 = r12.right
            int r10 = r10.right
            goto L_0x0073
        L_0x006a:
            int r9 = r10.top
            int r10 = r12.top
            goto L_0x0073
        L_0x006f:
            int r9 = r10.left
            int r10 = r12.left
        L_0x0073:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L_0x007b
            r2 = r6
        L_0x007b:
            return r2
        L_0x007c:
            return r6
        L_0x007d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n3x.c(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean e(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final Object g(Object obj, oLj olj) {
        if (obj == null) {
            return olj;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(olj);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(olj);
        return arrayList;
    }

    public static String i(Object obj, String str) {
        return str + obj;
    }

    public static acA j(m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(1809802212);
        Bl bl = Fr.R;
        jr_.w(-81138291);
        Context context = (Context) jr_.x(ur.f7428R);
        oC2 oc2 = (oC2) jr_.x(iHv.R);
        jr_.w(511388516);
        boolean O = jr_.O(context) | jr_.O(oc2);
        Object I = jr_.I();
        if (O || I == ppN.R) {
            I = oc2 != null ? new pU(context, oc2) : Fr.R;
            jr_.ZW(I);
        }
        jr_.g(false);
        acA aca = (acA) I;
        jr_.g(false);
        jr_.g(false);
        return aca;
    }

    public static final mpr m(View view) {
        bQO bqo = new bQO(new g_R(new k0v(a6.l(view, g5M.v), g5M.c, 2), false, g5M.J));
        mpr mpr = (mpr) (!bqo.hasNext() ? null : bqo.next());
        if (mpr != null) {
            return mpr;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static final String o(String str) {
        Comparable comparable;
        List p = iH_.p(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : p) {
            if (true ^ iH_.r((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(a6.B(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (!jjU.g(str2.charAt(i))) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int size = (p.size() * 0) + str.length();
        g5M g5m = g5M.Y;
        int i2 = pdD.i(p);
        ArrayList arrayList3 = new ArrayList();
        int i3 = 0;
        for (Object obj2 : p) {
            i3++;
            if (i3 >= 0) {
                String str3 = (String) obj2;
                if ((i3 == 0 || i3 == i2) && iH_.r(str3)) {
                    str3 = null;
                } else if (intValue >= 0) {
                    int length2 = str3.length();
                    if (intValue <= length2) {
                        length2 = intValue;
                    }
                    String str4 = (String) g5m.x(str3.substring(length2));
                    if (str4 != null) {
                        str3 = str4;
                    }
                } else {
                    throw new IllegalArgumentException(opT.m("Requested character count ", intValue, " is less than zero.").toString());
                }
                if (str3 != null) {
                    arrayList3.add(str3);
                }
            } else {
                pdD.k();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(size);
        dF.mL(arrayList3, sb, null, 124);
        return sb.toString();
    }

    public static final Object t(lZe lze, lZe lze2, iv7 iv7) {
        Object obj;
        Object _;
        try {
            gvP.L(2, iv7);
            obj = iv7.J(lze2, lze);
        } catch (Throwable th) {
            obj = new pag(th, false);
        }
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        if (obj == bgr || (_ = lze._(obj)) == dTl.f2624v) {
            return bgr;
        }
        if (!(_ instanceof pag)) {
            return dTl.G(_);
        }
        throw ((pag) _).f7100R;
    }

    public static boolean v(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final xx x(aOO aoo) {
        if (!(aoo instanceof na6)) {
            return new xx(1, aoo);
        }
        xx Z = ((na6) aoo).Z();
        if (Z != null) {
            if (!Z.J()) {
                Z = null;
            }
            if (Z != null) {
                return Z;
            }
        }
        return new xx(2, aoo);
    }

    public static void y(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }
}
