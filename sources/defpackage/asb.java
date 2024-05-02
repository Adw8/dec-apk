package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;

/* renamed from: asb  reason: default package */
/* loaded from: classes.dex */
public abstract class asb {
    public static final bd4 R = ppN.N(new String[0]);

    /* renamed from: R  reason: collision with other field name */
    public static final eSv f1480R;

    /* renamed from: R  reason: collision with other field name */
    public static final byte[] f1481R;

    static {
        byte[] bArr = new byte[0];
        f1481R = bArr;
        F6 f6 = F6.R;
        atb.U(kgV.c("efbbbf"), kgV.c("feff"), kgV.c("fffe"), kgV.c("0000ffff"), kgV.c("ffff0000"));
        long j = (long) 0;
        R(j, j, j);
        new mQp(null, bArr, 0, 0);
        ME me = new ME();
        me.write(bArr, 0, 0);
        f1480R = new eSv((oFB) null, j, me);
    }

    public static final int C(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final dqt H(lG0 lg0, CharSequence charSequence, int i) {
        Matcher matcher = lg0.R.matcher(charSequence);
        dqt dqt = !matcher.find(i) ? null : new dqt(matcher);
        if (dqt != null && dqt.R().e == i) {
            return dqt;
        }
        return null;
    }

    public static final int L(int i, int i2, String str) {
        while (i < i2) {
            char charAt = str.charAt(i);
            boolean z = false;
            if ((((charAt == '\t' || charAt == '\n') || charAt == '\f') || charAt == '\r') || charAt == ' ') {
                z = true;
            }
            if (!z) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final String N(int i, int i2, String str) {
        int L = L(i, i2, str);
        return str.substring(L, Z(L, i2, str));
    }

    public static final int O(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (n3x.O(charAt, 31) <= 0 || n3x.O(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final void R(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("length=" + j + ", offset=" + j2 + ", count=" + j2);
        }
    }

    public static final int U(char c) {
        boolean z = true;
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        char c2 = 'a';
        if (!('a' <= c && c < 'g')) {
            c2 = 'A';
            if ('A' > c || c >= 'G') {
                z = false;
            }
            if (!z) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    public static final boolean X(String[] strArr, String[] strArr2, Comparator comparator) {
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    o7s o7s = new o7s(strArr2);
                    while (o7s.hasNext()) {
                        if (comparator.compare(str, (String) o7s.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final int Z(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                boolean z = false;
                if ((((charAt == '\t' || charAt == '\n') || charAt == '\f') || charAt == '\r') || charAt == ' ') {
                    z = true;
                }
                if (z) {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    public static final int c(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (iH_.h(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int e(String str, char c, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final String[] m(String[] strArr, String[] strArr2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final void v(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final boolean x(String str) {
        return iH_.Q(str, "Authorization") || iH_.Q(str, "Cookie") || iH_.Q(str, "Proxy-Authorization") || iH_.Q(str, "Set-Cookie");
    }
}
