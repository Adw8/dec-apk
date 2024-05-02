package defpackage;

/* renamed from: d_A  reason: default package */
/* loaded from: classes.dex */
public abstract class d_A {
    public static final hdv R;

    static {
        R = (!(hU3.v && hU3.f4280R) || Om.R()) ? new hdv(0) : new hdv(1);
    }

    public static int R(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                b = -1;
            }
            return b;
        } else if (i3 == 1) {
            return c(b, bArr[i]);
        } else {
            if (i3 == 2) {
                return e(b, bArr[i], bArr[i + 1]);
            }
            throw new AssertionError();
        }
    }

    public static boolean X(byte[] bArr, int i, int i2) {
        return R.e(i, i2, bArr) == 0;
    }

    public static int c(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int e(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static int v(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new cXo(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder U = opT.U("UTF-8 length does not fit in int: ");
        U.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(U.toString());
    }
}
