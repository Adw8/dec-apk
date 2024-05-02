package defpackage;

import android.text.TextUtils;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: atb  reason: default package */
/* loaded from: classes.dex */
public final class atb {
    public int R;

    public /* synthetic */ atb() {
        this.R = 0;
    }

    public static lFn C(String str) {
        String str2;
        nX1 nx1 = nX1.HTTP_1_1;
        nX1 nx12 = nX1.HTTP_1_0;
        int i = 9;
        if (iH_._(str, "HTTP/1.", false)) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(opT.H("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                nx1 = nx12;
            } else if (charAt != 1) {
                throw new ProtocolException(opT.H("Unexpected status line: ", str));
            }
        } else if (iH_._(str, "ICY ", false)) {
            nx1 = nx12;
            i = 4;
        } else if (iH_._(str, "SOURCETABLE ", false)) {
            i = 12;
        } else {
            throw new ProtocolException(opT.H("Unexpected status line: ", str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            Integer Y = d6g.Y(str.substring(i, i2));
            if (Y != null) {
                int intValue = Y.intValue();
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException(opT.H("Unexpected status line: ", str));
                }
                return new lFn(nx1, intValue, str2);
            }
            throw new ProtocolException(opT.H("Unexpected status line: ", str));
        }
        throw new ProtocolException(opT.H("Unexpected status line: ", str));
    }

    public static int H(int i, int i2, int i3) {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(jQ.U("PROTOCOL_ERROR padding ", i3, " > remaining length ", i));
    }

    public static bcS L(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return bcS.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return bcS.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return bcS.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return bcS.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return bcS.SSL_3_0;
        }
        throw new IllegalArgumentException(opT.H("Unexpected TLS version: ", str));
    }

    public static byte[] O(List list) {
        ME me = new ME();
        Iterator it = R(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            me.a(str.length());
            me.vr(str);
        }
        return me.b();
    }

    public static ArrayList R(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((nX1) obj) != nX1.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(a6.B(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((nX1) it.next()).f6424R);
        }
        return arrayList2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f1, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.paU U(defpackage.F6... r11) {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atb.U(F6[]):paU");
    }

    public static void X(long j, ME me, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7 = i;
        if (i2 < i3) {
            for (int i8 = i2; i8 < i3; i8++) {
                if (!(((F6) arrayList.get(i8)).v() >= i7)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            F6 f6 = (F6) arrayList.get(i2);
            F6 f62 = (F6) arrayList.get(i3 - 1);
            int i9 = -1;
            if (i7 == f6.v()) {
                i5 = ((Number) arrayList2.get(i2)).intValue();
                int i10 = i2 + 1;
                f6 = (F6) arrayList.get(i10);
                i4 = i10;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (f6.X(i7) != f62.X(i7)) {
                int i11 = 1;
                for (int i12 = i4 + 1; i12 < i3; i12++) {
                    if (((F6) arrayList.get(i12 - 1)).X(i7) != ((F6) arrayList.get(i12)).X(i7)) {
                        i11++;
                    }
                }
                long j2 = (long) 4;
                long j3 = ((long) (i11 * 2)) + (me.R / j2) + j + ((long) 2);
                me.mL(i11);
                me.mL(i5);
                for (int i13 = i4; i13 < i3; i13++) {
                    int X = ((F6) arrayList.get(i13)).X(i7);
                    if (i13 == i4 || X != ((F6) arrayList.get(i13 - 1)).X(i7)) {
                        me.mL(X & 255);
                    }
                }
                ME me2 = new ME();
                while (i4 < i3) {
                    byte X2 = ((F6) arrayList.get(i4)).X(i7);
                    int i14 = i4 + 1;
                    int i15 = i14;
                    while (true) {
                        if (i15 >= i3) {
                            i6 = i3;
                            break;
                        } else if (X2 != ((F6) arrayList.get(i15)).X(i7)) {
                            i6 = i15;
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (i14 == i6 && i7 + 1 == ((F6) arrayList.get(i4)).v()) {
                        me.mL(((Number) arrayList2.get(i4)).intValue());
                        i4 = i6;
                        me2 = me2;
                        j2 = j2;
                    } else {
                        me.mL(((int) ((me2.R / j2) + j3)) * i9);
                        i4 = i6;
                        me2 = me2;
                        j2 = j2;
                        X(j3, me2, i7 + 1, arrayList, i4, i4, arrayList2);
                    }
                    i9 = -1;
                }
                me.f(me2);
                return;
            }
            int min = Math.min(f6.v(), f62.v());
            int i16 = i7;
            int i17 = 0;
            while (i16 < min && f6.X(i16) == f62.X(i16)) {
                i17++;
                i16++;
            }
            long j4 = (long) 4;
            long j5 = (me.R / j4) + j + ((long) 2) + ((long) i17) + 1;
            me.mL(-i17);
            me.mL(i5);
            int i18 = i7 + i17;
            while (i7 < i18) {
                me.mL(f6.X(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i18 == ((F6) arrayList.get(i4)).v()) {
                    me.mL(((Number) arrayList2.get(i4)).intValue());
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            ME me3 = new ME();
            me.mL(((int) ((me3.R / j4) + j5)) * -1);
            X(j5, me3, i18, arrayList, i4, i3, arrayList2);
            me.f(me3);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static boolean Z() {
        return n3x.v("Dalvik", System.getProperty("java.vm.name"));
    }

    public static boolean m(String str) {
        return !iH_.Q("Connection", str) && !iH_.Q("Keep-Alive", str) && !iH_.Q("Proxy-Authenticate", str) && !iH_.Q("Proxy-Authorization", str) && !iH_.Q("TE", str) && !iH_.Q("Trailers", str) && !iH_.Q("Transfer-Encoding", str) && !iH_.Q("Upgrade", str);
    }

    public static kU v() {
        kU kUVar = kU.v.R;
        if (kUVar == null) {
            long nanoTime = System.nanoTime();
            kU.class.wait(kU.e);
            if (kU.v.R != null || System.nanoTime() - nanoTime < kU.X) {
                return null;
            }
            return kU.v;
        }
        long nanoTime2 = kUVar.c - System.nanoTime();
        if (nanoTime2 > 0) {
            long j = nanoTime2 / 1000000;
            kU.class.wait(j, (int) (nanoTime2 - (1000000 * j)));
            return null;
        }
        kU.v.R = kUVar.R;
        kUVar.R = null;
        return kUVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        if ((r0.e >= 1) == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.k4H c() {
        /*
            r5 = this;
            int r0 = r5.R
            r1 = r0 & 1
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000a
            r1 = r3
            goto L_0x000b
        L_0x000a:
            r1 = r2
        L_0x000b:
            r4 = 0
            if (r1 != 0) goto L_0x002c
            r1 = 2
            r0 = r0 & r1
            if (r0 != r1) goto L_0x0014
            r0 = r3
            goto L_0x0015
        L_0x0014:
            r0 = r2
        L_0x0015:
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = "su"
            java.lang.String r1 = "--mount-master"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}     // Catch: orw -> 0x002c
            k4H r0 = r5.e(r0)     // Catch: orw -> 0x002c
            int r1 = r0.e     // Catch: orw -> 0x002d
            if (r1 < r3) goto L_0x0029
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r2
        L_0x002a:
            if (r1 != 0) goto L_0x002d
        L_0x002c:
            r0 = r4
        L_0x002d:
            if (r0 != 0) goto L_0x004f
            int r1 = r5.R
            r1 = r1 & r3
            if (r1 != r3) goto L_0x0036
            r1 = r3
            goto L_0x0037
        L_0x0036:
            r1 = r2
        L_0x0037:
            if (r1 != 0) goto L_0x004f
            java.lang.String r1 = "su"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: orw -> 0x004f
            k4H r0 = r5.e(r1)     // Catch: orw -> 0x004f
            int r1 = r0.e     // Catch: orw -> 0x004f
            if (r1 < r3) goto L_0x0049
            r1 = r3
            goto L_0x004a
        L_0x0049:
            r1 = r2
        L_0x004a:
            if (r1 != 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r4 = r0
        L_0x004e:
            r0 = r4
        L_0x004f:
            if (r0 != 0) goto L_0x0067
            int r0 = r5.R
            r0 = r0 & r3
            if (r0 != r3) goto L_0x0057
            r2 = r3
        L_0x0057:
            if (r2 != 0) goto L_0x005d
            java.lang.Class<pdD> r0 = defpackage.pdD.class
            monitor-enter(r0)
            monitor-exit(r0)
        L_0x005d:
            java.lang.String r0 = "sh"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            k4H r0 = r5.e(r0)
        L_0x0067:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atb.c():k4H");
    }

    public k4H e(String... strArr) {
        try {
            TextUtils.join(" ", strArr);
            try {
                k4H k4h = new k4H(this, Runtime.getRuntime().exec(strArr));
                synchronized (biy.class) {
                    if (biy.f1775R) {
                        k4H[] k4hArr = biy.f1777R;
                        synchronized (k4hArr) {
                            k4hArr[0] = k4h;
                        }
                    }
                }
                return k4h;
            } catch (IOException e) {
                throw new orw(e);
            }
        } catch (IOException e2) {
            throw new orw(e2);
        }
    }

    public boolean x() {
        switch (this.R) {
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                return KT.f260R;
            default:
                return a2.f718R;
        }
    }

    public /* synthetic */ atb(int i) {
        this.R = i;
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ atb(int i, int i2) {
        this(21);
        this.R = i;
        switch (i) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case VmNativeCallback.$stable /* 8 */:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                return;
            default:
                this(0);
                return;
        }
    }
}
