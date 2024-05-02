package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: iH_ */
/* loaded from: classes.dex */
public abstract class iH_ extends d6g {
    public static final int A(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static gzK B(CharSequence charSequence, String[] strArr, boolean z, int i) {
        F(i);
        return new gzK(charSequence, 0, i, new jgi(Arrays.asList(strArr), z, 1));
    }

    public static final List D(int i, CharSequence charSequence, String str, boolean z) {
        F(i);
        int i2 = 0;
        int S = S(0, charSequence, str, z);
        if (S == -1 || i == 1) {
            return Collections.singletonList(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2 && i <= 10) {
            i3 = i;
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, S).toString());
            i2 = str.length() + S;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            S = S(i2, charSequence, str, z);
        } while (S != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static final String E(String str, String str2) {
        return _(str2, str, false) ? str2.substring(str.length()) : str2;
    }

    public static final void F(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(opT.Z("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static final String G(String str) {
        CharSequence charSequence;
        if (4 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(4);
            jrc R = new heu(1, 4 - str.length()).iterator();
            while (R.R) {
                R.nextInt();
                sb.append('0');
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static boolean I(CharSequence charSequence, String str) {
        if (str instanceof String) {
            if (s(charSequence, str, 0, false, 2) >= 0) {
                return true;
            }
        } else if (d(charSequence, str, 0, charSequence.length(), false, false) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean M(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!jjU.x(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean Q(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final int S(int i, CharSequence charSequence, String str, boolean z) {
        return (z || !(charSequence instanceof String)) ? d(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int T(int i, CharSequence charSequence, boolean z, char[] cArr) {
        boolean z2;
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i < 0) {
                i = 0;
            }
            jrc R = new heu(i, A(charSequence)).iterator();
            while (R.R) {
                int nextInt = R.nextInt();
                char charAt = charSequence.charAt(nextInt);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        continue;
                        break;
                    } else if (jjU.x(cArr[i2], charAt, z)) {
                        z2 = true;
                        continue;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return nextInt;
                }
            }
            return -1;
        }
        int length2 = cArr.length;
        if (length2 == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length2 == 1) {
            return ((String) charSequence).indexOf(cArr[0], i);
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static int W(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return (z || !(charSequence instanceof String)) ? T(i, charSequence, z, new char[]{c}) : ((String) charSequence).indexOf(c, i);
    }

    public static String X4(String str, char c) {
        int W = W(str, c, 0, false, 6);
        return W == -1 ? str : str.substring(W + 1, str.length());
    }

    public static final boolean _(String str, String str2, boolean z) {
        return !z ? str.startsWith(str2) : l(0, 0, str2.length(), str, str2, z);
    }

    public static String a(String str, String str2, String str3) {
        int S = S(0, str, str2, false);
        if (S < 0) {
            return str;
        }
        int length = str2.length();
        int i = 1;
        if (length >= 1) {
            i = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            int i2 = 0;
            do {
                sb.append((CharSequence) str, i2, S);
                sb.append(str3);
                i2 = S + length;
                if (S >= str.length()) {
                    break;
                }
                S = S(S + i, str, str2, false);
            } while (S > 0);
            sb.append((CharSequence) str, i2, str.length());
            return sb.toString();
        }
        throw new OutOfMemoryError();
    }

    public static List b(CharSequence charSequence, char[] cArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if (cArr.length == 1) {
            return D(i, charSequence, String.valueOf(cArr[0]), false);
        }
        F(i);
        Ln ln = new Ln(1, new gzK(charSequence, 0, i, new jgi(cArr, false, 0)));
        ArrayList arrayList = new ArrayList(a6.B(ln, 10));
        Iterator it = ln.iterator();
        while (it.hasNext()) {
            arrayList.add(mL(charSequence, (heu) it.next()));
        }
        return arrayList;
    }

    public static final int d(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        ka_ ka_;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            ka_ = new heu(i, i2);
        } else {
            int A = A(charSequence);
            if (i > A) {
                i = A;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            ka_ = new ka_(i, i2, -1);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i3 = ka_.e;
            int i4 = ka_.X;
            int i5 = ka_.O;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!M(charSequence2, 0, charSequence, i3, charSequence2.length(), z)) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                return i3;
            }
        } else {
            int i6 = ka_.e;
            int i7 = ka_.X;
            int i8 = ka_.O;
            if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                while (true) {
                    if (!l(0, i6, charSequence2.length(), (String) charSequence2, (String) charSequence, z)) {
                        if (i6 == i7) {
                            break;
                        }
                        i6 += i8;
                    } else {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    public static final String f(int i, String str) {
        if (i >= 0) {
            if (i != 0) {
                if (i == 1) {
                    return str.toString();
                }
                int length = str.length();
                if (length != 0) {
                    if (length != 1) {
                        StringBuilder sb = new StringBuilder(str.length() * i);
                        jrc R = new heu(1, i).iterator();
                        while (R.R) {
                            R.nextInt();
                            sb.append((CharSequence) str);
                        }
                        return sb.toString();
                    }
                    char charAt = str.charAt(0);
                    char[] cArr = new char[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        cArr[i2] = charAt;
                    }
                    return new String(cArr);
                }
            }
            return "";
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
    }

    public static boolean h(CharSequence charSequence, char c) {
        return W(charSequence, c, 0, false, 2) >= 0;
    }

    public static int k(CharSequence charSequence, char c, int i, int i2) {
        boolean z;
        if ((i2 & 2) != 0) {
            i = A(charSequence);
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        int A = A(charSequence);
        if (i > A) {
            i = A;
        }
        while (-1 < i) {
            char charAt = charSequence.charAt(i);
            int i3 = 0;
            while (true) {
                if (i3 >= 1) {
                    z = false;
                    break;
                } else if (jjU.x(cArr[i3], charAt, false)) {
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (z) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static final boolean l(int i, int i2, int i3, String str, String str2, boolean z) {
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static final String mL(CharSequence charSequence, heu heu) {
        return charSequence.subSequence(Integer.valueOf(heu.e).intValue(), Integer.valueOf(heu.X).intValue() + 1).toString();
    }

    public static boolean n(CharSequence charSequence, String str) {
        return charSequence instanceof String ? ((String) charSequence).endsWith(str) : M(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static final List p(CharSequence charSequence) {
        return pdD.Q(iOY.D(iOY.a(B(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new mox(23, charSequence))));
    }

    public static final boolean q(String str, String str2, int i, boolean z) {
        return !z ? str.startsWith(str2, i) : l(i, 0, str2.length(), str, str2, z);
    }

    public static final boolean r(CharSequence charSequence) {
        boolean z;
        if (charSequence.length() != 0) {
            heu heu = new heu(0, charSequence.length() - 1);
            if (!(heu instanceof Collection) || !((Collection) heu).isEmpty()) {
                jrc R = heu.iterator();
                while (R.R) {
                    if (!jjU.g(charSequence.charAt(R.nextInt()))) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int s(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return S(i, charSequence, str, z);
    }

    public static final String u(byte[] bArr) {
        return new String(bArr, O1.R);
    }

    public static String vl(String str) {
        int k = k(str, '.', 0, 6);
        return k == -1 ? str : str.substring(k + 1, str.length());
    }

    public static final CharSequence vr(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean g = jjU.g(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!g) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!g) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static List w(CharSequence charSequence, String[] strArr) {
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return D(0, charSequence, str, false);
            }
        }
        Ln ln = new Ln(1, B(charSequence, strArr, false, 0));
        ArrayList arrayList = new ArrayList(a6.B(ln, 10));
        Iterator it = ln.iterator();
        while (it.hasNext()) {
            arrayList.add(mL(charSequence, (heu) it.next()));
        }
        return arrayList;
    }

    public static final byte[] z(String str) {
        return str.getBytes(O1.R);
    }

    public static String zw(String str, String str2) {
        int s = s(str, str2, 0, false, 6);
        return s == -1 ? str : str.substring(str2.length() + s, str.length());
    }
}
