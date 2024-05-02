package defpackage;

import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLSocket;

/* renamed from: ppN  reason: default package */
/* loaded from: classes.dex */
public final class ppN implements agj, d2, cwg, l9F, nvJ, orq, lxb, j7x, kz5, fix, b9x, ce7, i7f, gLy, jOW, aFp {
    public static final ppN X = new ppN();
    public static final f1A R = new f1A(14);
    public static final ppN O = new ppN();
    public static final ppN L = new ppN();
    public static final ppN Z = new ppN();
    public static final ppN m = new ppN();
    public static final ppN x = new ppN();
    public static final ppN H = new ppN();
    public static final ppN U = new ppN();
    public static final /* synthetic */ ppN C = new ppN();
    public static final /* synthetic */ ppN N = new ppN();
    public static final /* synthetic */ ppN P = new ppN();

    public /* synthetic */ ppN() {
    }

    public static boolean C(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && asb.U(str.charAt(i + 1)) != -1 && asb.U(str.charAt(i3)) != -1;
    }

    public static final C7 L(ppN ppn, String str) {
        C7 c7 = new C7(str);
        C7.f50R.put(str, c7);
        return c7;
    }

    public static bd4 N(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int i = 0;
        if (strArr2.length % 2 == 0) {
            String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            int length = strArr3.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (strArr3[i2] != null) {
                    strArr3[i2] = iH_.vr(strArr2[i2]).toString();
                } else {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
            }
            int V = pdD.V(0, strArr3.length - 1, 2);
            if (V >= 0) {
                while (true) {
                    String str = strArr3[i];
                    String str2 = strArr3[i + 1];
                    dTl.n(str);
                    dTl.Q(str2, str);
                    if (i == V) {
                        break;
                    }
                    i += 2;
                }
            }
            return new bd4(strArr3);
        }
        throw new IllegalArgumentException("Expected alternating header names and values".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.bv P(defpackage.bd4 r24) {
        /*
        // Method dump skipped, instructions count: 424
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppN.P(bd4):bv");
    }

    public static String Z(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3) {
        boolean z5 = false;
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z6 = (i3 & 8) != 0 ? false : z;
        boolean z7 = (i3 & 16) != 0 ? false : z2;
        boolean z8 = (i3 & 32) != 0 ? false : z3;
        if ((i3 & 64) == 0) {
            z5 = z4;
        }
        int i5 = 128;
        Charset charset2 = (i3 & 128) != 0 ? null : charset;
        int i6 = i4;
        while (i6 < length) {
            int codePointAt = str.codePointAt(i6);
            int i7 = 43;
            int i8 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= i5 && !z5) || iH_.h(str2, (char) codePointAt) || ((codePointAt == 37 && (!z6 || (z7 && !C(i6, length, str)))) || (codePointAt == 43 && z8)))) {
                ME me = new ME();
                me.vl(i4, i6, str);
                ME me2 = null;
                while (i6 < length) {
                    int codePointAt2 = str.codePointAt(i6);
                    if (!z6 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        String str3 = "+";
                        if (codePointAt2 == i8 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            me.vr(str3);
                        } else if (codePointAt2 != i7 || !z8) {
                            if (codePointAt2 < i8 || codePointAt2 == 127 || ((codePointAt2 >= 128 && !z5) || iH_.h(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z6 || (z7 && !C(i6, length, str)))))) {
                                if (me2 == null) {
                                    me2 = new ME();
                                }
                                if (charset2 == null || n3x.v(charset2, O1.R)) {
                                    me2.cr(codePointAt2);
                                } else {
                                    me2.zw(str, i6, Character.charCount(codePointAt2) + i6, charset2);
                                }
                                while (!me2.r()) {
                                    int readByte = me2.readByte() & 255;
                                    me.a(37);
                                    char[] cArr = a7_.R;
                                    me.a(cArr[(readByte >> 4) & 15]);
                                    me.a(cArr[readByte & 15]);
                                }
                            } else {
                                me.cr(codePointAt2);
                            }
                            i6 += Character.charCount(codePointAt2);
                            i8 = 32;
                            i7 = 43;
                        } else {
                            if (!z6) {
                                str3 = "%2B";
                            }
                            me.vr(str3);
                        }
                    }
                    i6 += Character.charCount(codePointAt2);
                    i8 = 32;
                    i7 = 43;
                }
                return me.G();
            }
            i6 += Character.charCount(codePointAt);
            i5 = 128;
        }
        return str.substring(i4, length);
    }

    public static String g(String str, int i, int i2, boolean z, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        int i5 = i;
        while (i5 < i2) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z)) {
                ME me = new ME();
                me.vl(i, i5, str);
                while (i5 < i2) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt != 37 || (i4 = i5 + 2) >= i2) {
                        if (codePointAt == 43 && z) {
                            me.a(32);
                            i5++;
                        }
                        me.cr(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    } else {
                        int U2 = asb.U(str.charAt(i5 + 1));
                        int U3 = asb.U(str.charAt(i4));
                        if (!(U2 == -1 || U3 == -1)) {
                            me.a((U2 << 4) + U3);
                            i5 = Character.charCount(codePointAt) + i4;
                        }
                        me.cr(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    }
                }
                return me.G();
            }
            i5++;
        }
        return str.substring(i, i2);
    }

    public static long j(int i, String str) {
        int x2 = x(str, 0, i, false);
        Matcher matcher = bOq.e.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (x2 < i) {
            int x3 = x(str, x2 + 1, i, true);
            matcher.region(x2, x3);
            if (i3 == -1 && matcher.usePattern(bOq.e).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
                i6 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
            } else if (i4 != -1 || !matcher.usePattern(bOq.c).matches()) {
                if (i5 == -1) {
                    Pattern pattern = bOq.v;
                    if (matcher.usePattern(pattern).matches()) {
                        String group = matcher.group(1);
                        Locale locale = Locale.US;
                        bd4 bd4 = khE.R;
                        i5 = iH_.s(pattern.pattern(), group.toLowerCase(locale), 0, false, 6) / 4;
                    }
                }
                if (i2 == -1 && matcher.usePattern(bOq.R).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i4 = Integer.parseInt(matcher.group(1));
            }
            x2 = x(str, x3 + 1, i, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 >= 1601) {
            if (i5 != -1) {
                if (1 <= i4 && i4 < 32) {
                    if (i3 >= 0 && i3 < 24) {
                        if (i6 >= 0 && i6 < 60) {
                            if (i7 >= 0 && i7 < 60) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(khE.f5395R);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i2);
                                gregorianCalendar.set(2, i5 - 1);
                                gregorianCalendar.set(5, i4);
                                gregorianCalendar.set(11, i3);
                                gregorianCalendar.set(12, i6);
                                gregorianCalendar.set(13, i7);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static Typeface m(String str, lIe lie, int i) {
        boolean z = true;
        if ((i == 0) && n3x.v(lie, lIe.e)) {
            if (str == null || str.length() == 0) {
                return Typeface.DEFAULT;
            }
        }
        Typeface create = str == null ? Typeface.DEFAULT : Typeface.create(str, 0);
        int i2 = lie.f5651e;
        if (i != 1) {
            z = false;
        }
        return Typeface.create(create, i2, z);
    }

    public static ArrayList t(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int W = iH_.W(str, '&', i, false, 4);
            if (W == -1) {
                W = str.length();
            }
            int W2 = iH_.W(str, '=', i, false, 4);
            if (W2 == -1 || W2 > W) {
                arrayList.add(str.substring(i, W));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, W2));
                arrayList.add(str.substring(W2 + 1, W));
            }
            i = W + 1;
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003d, code lost:
        if (r0 != ':') goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int x(java.lang.String r5, int r6, int r7, boolean r8) {
        /*
        L_0x0000:
            if (r6 >= r7) goto L_0x0048
            char r0 = r5.charAt(r6)
            r1 = 32
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto L_0x0010
            r1 = 9
            if (r0 != r1) goto L_0x003f
        L_0x0010:
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 >= r1) goto L_0x003f
            r1 = 48
            r4 = 57
            if (r0 > r4) goto L_0x001e
            if (r1 > r0) goto L_0x001e
            r1 = r3
            goto L_0x001f
        L_0x001e:
            r1 = r2
        L_0x001f:
            if (r1 != 0) goto L_0x003f
            r1 = 97
            r4 = 122(0x7a, float:1.71E-43)
            if (r0 > r4) goto L_0x002b
            if (r1 > r0) goto L_0x002b
            r1 = r3
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            if (r1 != 0) goto L_0x003f
            r1 = 65
            r4 = 90
            if (r0 > r4) goto L_0x0038
            if (r1 > r0) goto L_0x0038
            r1 = r3
            goto L_0x0039
        L_0x0038:
            r1 = r2
        L_0x0039:
            if (r1 != 0) goto L_0x003f
            r1 = 58
            if (r0 != r1) goto L_0x0040
        L_0x003f:
            r2 = r3
        L_0x0040:
            r0 = r8 ^ 1
            if (r2 != r0) goto L_0x0045
            return r6
        L_0x0045:
            int r6 = r6 + 1
            goto L_0x0000
        L_0x0048:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppN.x(java.lang.String, int, int, boolean):int");
    }

    public static String y(String str) {
        if (iH_._(str, "TLS_", false)) {
            StringBuilder U2 = opT.U("SSL_");
            U2.append(str.substring(4));
            return U2.toString();
        } else if (!iH_._(str, "SSL_", false)) {
            return str;
        } else {
            StringBuilder U3 = opT.U("TLS_");
            U3.append(str.substring(4));
            return U3.toString();
        }
    }

    @Override // defpackage.aFp
    public Object H(IBinder iBinder) {
        int i = lWE.R;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof gs_ ? (gs_) queryLocalInterface : new g_L(iBinder);
    }

    @Override // defpackage.cwg
    public gOQ O(SSLSocket sSLSocket) {
        return new fQ();
    }

    @Override // defpackage.cwg
    public boolean R(SSLSocket sSLSocket) {
        return a2.R.x() && (sSLSocket instanceof BCSSLSocket);
    }

    public synchronized C7 U(String str) {
        C7 c7;
        LinkedHashMap linkedHashMap = C7.f50R;
        c7 = (C7) linkedHashMap.get(str);
        if (c7 == null) {
            c7 = (C7) linkedHashMap.get(y(str));
            if (c7 == null) {
                c7 = new C7(str);
            }
            linkedHashMap.put(str, c7);
        }
        return c7;
    }

    @Override // defpackage.l9F
    public Object X(Object obj) {
        return (h7U) obj;
    }

    @Override // defpackage.orq
    public List c(String str) {
        try {
            return P7.E(InetAddress.getAllByName(str));
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException(opT.H("Broken system behaviour for dns lookup of ", str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    @Override // defpackage.jOW
    public int e(int i) {
        return i;
    }

    @Override // defpackage.kz5
    public void v() {
    }

    public /* synthetic */ ppN(Object obj, Object obj2) {
    }

    public /* synthetic */ ppN(n7K n7k) {
        Collections.synchronizedMap(new WeakHashMap());
        gvP.u(n7k, "options are required");
    }
}
