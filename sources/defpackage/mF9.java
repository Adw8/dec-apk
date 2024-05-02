package defpackage;

import java.io.IOException;

/* renamed from: mF9  reason: default package */
/* loaded from: classes.dex */
public final class mF9 {
    public final byte[] R;
    public final byte[] v;

    public mF9() {
        this.R = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        this.v = new byte[128];
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.v;
            if (i2 < bArr.length) {
                bArr[i2] = -1;
                i2++;
            }
        }
        while (true) {
            byte[] bArr2 = this.R;
            if (i < bArr2.length) {
                this.v[bArr2[i]] = (byte) i;
                i++;
            } else {
                byte[] bArr3 = this.v;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
        }
    }

    public final byte[] R(int i, String str) {
        if (i >= 0) {
            int i2 = 1;
            if (1 <= str.length() - i) {
                if ((i & 1) == 0) {
                    int i3 = i >>> 1;
                    byte[] bArr = new byte[i3];
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = i2 + 1;
                        byte b = this.v[str.charAt(i2)];
                        i2 = i5 + 1;
                        int i6 = (b << 4) | this.v[str.charAt(i5)];
                        if (i6 >= 0) {
                            bArr[i4] = (byte) i6;
                        } else {
                            throw new IOException("invalid characters encountered in Hex string");
                        }
                    }
                    return bArr;
                }
                throw new IOException("a hexadecimal encoding must have an even number of characters");
            }
        }
        throw new IndexOutOfBoundsException("invalid offset and/or length specified");
    }

    public /* synthetic */ mF9(byte[] bArr, byte[] bArr2) {
        this.R = bArr;
        this.v = bArr2;
    }
}
