package defpackage;

/* renamed from: dDc  reason: default package */
/* loaded from: classes.dex */
public abstract class dDc {
    public static final String[] c;
    public static final F6 R = kgV.e("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: R  reason: collision with other field name */
    public static final String[] f2533R = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] v = new String[64];

    static {
        F6 f6 = F6.R;
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            strArr[i] = khE.c("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        c = strArr;
        String[] strArr2 = v;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 < 1; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = v;
            strArr3[i3 | 8] = jQ.g(new StringBuilder(), strArr3[i3], "|PADDED");
        }
        String[] strArr4 = v;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 < 1; i6++) {
                int i7 = iArr[i6];
                String[] strArr5 = v;
                int i8 = i7 | i5;
                strArr5[i8] = strArr5[i7] + '|' + strArr5[i5];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i7]);
                sb.append('|');
                strArr5[i8 | 8] = jQ.g(sb, strArr5[i5], "|PADDED");
            }
        }
        int length = v.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr6 = v;
            if (strArr6[i9] == null) {
                strArr6[i9] = c[i9];
            }
        }
    }

    public static String R(int i) {
        String[] strArr = f2533R;
        return i < strArr.length ? strArr[i] : khE.c("0x%02x", Integer.valueOf(i));
    }

    public static String c(boolean z, int i, int i2, long j) {
        return khE.c("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), R(8), Long.valueOf(j));
    }

    public static String v(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String R2 = R(i3);
        if (i4 == 0) {
            str = "";
        } else {
            if (!(i3 == 2 || i3 == 3)) {
                if (i3 == 4 || i3 == 6) {
                    str = i4 == 1 ? "ACK" : c[i4];
                } else if (!(i3 == 7 || i3 == 8)) {
                    String[] strArr = v;
                    String str2 = i4 < strArr.length ? strArr[i4] : c[i4];
                    str = (i3 != 5 || (i4 & 4) == 0) ? (i3 != 0 || (i4 & 32) == 0) ? str2 : iH_.a(str2, "PRIORITY", "COMPRESSED") : iH_.a(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = c[i4];
        }
        return khE.c("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), R2, str);
    }
}
