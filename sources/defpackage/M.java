package defpackage;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;

/* renamed from: M  reason: default package */
/* loaded from: classes.dex */
public final class M extends O {
    public final String R;

    /* renamed from: R  reason: collision with other field name */
    public byte[] f288R;

    public M(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        BigInteger bigInteger = null;
        long j = 0;
        for (int i = 0; i != bArr.length; i++) {
            int i2 = bArr[i] & 255;
            if (j <= 72057594037927808L) {
                long j2 = j + ((long) (i2 & 127));
                if ((i2 & 128) == 0) {
                    if (z) {
                        z = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf((long) (i2 & 127)));
                if ((i2 & 128) == 0) {
                    if (z) {
                        z = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(or);
                    bigInteger = null;
                    j = 0;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.R = stringBuffer.toString();
        this.f288R = bArr;
    }

    public static void A(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) (((int) j) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r8.charAt(r0 + 1) != '0') goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r2 == 0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r2 <= 1) goto L_0x0005;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean Q(int r7, java.lang.String r8) {
        /*
            int r0 = r8.length()
            r1 = 0
        L_0x0005:
            r2 = r1
        L_0x0006:
            int r0 = r0 + -1
            r3 = 48
            r4 = 1
            if (r0 < r7) goto L_0x002c
            char r5 = r8.charAt(r0)
            r6 = 46
            if (r5 != r6) goto L_0x0022
            if (r2 == 0) goto L_0x0021
            if (r2 <= r4) goto L_0x0005
            int r2 = r0 + 1
            char r2 = r8.charAt(r2)
            if (r2 != r3) goto L_0x0005
        L_0x0021:
            return r1
        L_0x0022:
            if (r3 > r5) goto L_0x002b
            r3 = 57
            if (r5 > r3) goto L_0x002b
            int r2 = r2 + 1
            goto L_0x0006
        L_0x002b:
            return r1
        L_0x002c:
            if (r2 == 0) goto L_0x0039
            if (r2 <= r4) goto L_0x0038
            int r0 = r0 + r4
            char r7 = r8.charAt(r0)
            if (r7 != r3) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            return r4
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.M.Q(int, java.lang.String):boolean");
    }

    public static void S(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    @Override // defpackage.O
    public final boolean J() {
        return false;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.g(z, 13, n());
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        return Zz.x(n().length, z);
    }

    @Override // defpackage.O, defpackage.t
    public final int hashCode() {
        return this.R.hashCode();
    }

    public final synchronized byte[] n() {
        String str;
        if (this.f288R == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String str2 = this.R;
            int i = 0;
            while (true) {
                if (!(i != -1)) {
                    break;
                }
                if (i == -1) {
                    str = null;
                } else {
                    int indexOf = str2.indexOf(46, i);
                    if (indexOf == -1) {
                        str = str2.substring(i);
                        i = -1;
                    } else {
                        str = str2.substring(i, indexOf);
                        i = indexOf + 1;
                    }
                }
                if (str.length() <= 18) {
                    A(byteArrayOutputStream, Long.parseLong(str));
                } else {
                    S(byteArrayOutputStream, new BigInteger(str));
                }
            }
            this.f288R = byteArrayOutputStream.toByteArray();
        }
        return this.f288R;
    }

    @Override // defpackage.O
    public final boolean o(O o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof M)) {
            return false;
        }
        return this.R.equals(((M) o).R);
    }

    public final String toString() {
        return this.R;
    }
}
