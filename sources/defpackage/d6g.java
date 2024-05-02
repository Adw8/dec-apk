package defpackage;

/* renamed from: d6g  reason: default package */
/* loaded from: classes.dex */
public abstract class d6g extends lzZ {
    public static final Integer Y(String str) {
        boolean z;
        int i;
        jjU.X(10);
        int length = str.length();
        if (length != 0) {
            int i2 = 0;
            char charAt = str.charAt(0);
            int i3 = -2147483647;
            int i4 = 1;
            if (n3x.O(charAt, 48) >= 0) {
                z = false;
                i4 = 0;
            } else if (length != 1) {
                if (charAt == '-') {
                    i3 = Integer.MIN_VALUE;
                    z = true;
                } else if (charAt == '+') {
                    z = false;
                }
            }
            int i5 = -59652323;
            while (i4 < length) {
                int digit = Character.digit((int) str.charAt(i4), 10);
                if (digit >= 0 && ((i2 >= i5 || (i5 == -59652323 && i2 >= (i5 = i3 / 10))) && (i = i2 * 10) >= i3 + digit)) {
                    i2 = i - digit;
                    i4++;
                }
            }
            return z ? Integer.valueOf(i2) : Integer.valueOf(-i2);
        }
        return null;
    }
}
