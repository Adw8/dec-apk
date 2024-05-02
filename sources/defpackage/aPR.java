package defpackage;

import java.io.ByteArrayOutputStream;
import java.security.AccessController;

/* renamed from: aPR  reason: default package */
/* loaded from: classes.dex */
public abstract class aPR {
    public static final /* synthetic */ int R = 0;

    static {
        try {
            try {
                String str = (String) AccessController.doPrivileged(new i_6());
            } catch (Exception unused) {
                String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
        }
    }

    public static String R(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    public static String X(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) ((c - 'a') + 65);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static String c(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) ((c - 'A') + 97);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0062 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: char[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: char */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    public static void e(char[] cArr, ByteArrayOutputStream byteArrayOutputStream) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        while (i5 < cArr.length) {
            char c = cArr[i5];
            if (c >= 128) {
                if (c < 2048) {
                    i = (c >> 6) | 192;
                    i2 = c;
                } else {
                    if (c < 55296 || c > 57343) {
                        i3 = (c >> 12) | 224;
                        i4 = c;
                    } else {
                        i5++;
                        if (i5 < cArr.length) {
                            char c2 = cArr[i5];
                            if (c <= 56319) {
                                int i6 = (((c & 1023) << 10) | (c2 & 1023)) + 65536;
                                byteArrayOutputStream.write((i6 >> 18) | 240);
                                i3 = ((i6 >> 12) & 63) | 128;
                                i4 = i6;
                            } else {
                                throw new IllegalStateException("invalid UTF-16 codepoint");
                            }
                        } else {
                            throw new IllegalStateException("invalid UTF-16 codepoint");
                        }
                    }
                    byteArrayOutputStream.write(i3);
                    i = ((i4 >> 6) & 63) | 128;
                    i2 = i4;
                }
                byteArrayOutputStream.write(i);
                c = ((i2 == 1 ? 1 : 0) & 63) | 128;
            }
            byteArrayOutputStream.write(c == true ? 1 : 0);
            i5++;
        }
    }

    public static byte[] v(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }
}
