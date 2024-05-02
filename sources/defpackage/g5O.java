package defpackage;

/* renamed from: g5O  reason: default package */
/* loaded from: classes.dex */
public abstract class g5O {
    public static final byte[] R = kgV.e("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").f115R;
    public static final byte[] v = kgV.e("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").f115R;

    static {
        F6 f6 = F6.R;
    }

    public static final String R(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            i = i4 + 1;
            byte b3 = bArr[i4];
            int i5 = i2 + 1;
            bArr3[i2] = bArr2[(b & 255) >> 2];
            int i6 = i5 + 1;
            bArr3[i5] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i7 + 1;
            bArr3[i7] = bArr2[b3 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i8 = i2 + 1;
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            int i9 = i8 + 1;
            bArr3[i8] = bArr2[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr3[i9] = b5;
            bArr3[i9 + 1] = b5;
        } else if (length2 == 2) {
            int i10 = i + 1;
            byte b6 = bArr[i];
            byte b7 = bArr[i10];
            int i11 = i2 + 1;
            bArr3[i2] = bArr2[(b6 & 255) >> 2];
            int i12 = i11 + 1;
            bArr3[i11] = bArr2[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i12] = bArr2[(b7 & 15) << 2];
            bArr3[i12 + 1] = (byte) 61;
        }
        return new String(bArr3, O1.R);
    }
}
