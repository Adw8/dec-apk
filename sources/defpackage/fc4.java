package defpackage;

/* renamed from: fc4  reason: default package */
/* loaded from: classes.dex */
public abstract class fc4 {
    public static final byte[] R;

    /* renamed from: R  reason: collision with other field name */
    public static final short[] f3470R = new short[128];

    static {
        byte[] bArr = new byte[112];
        R = bArr;
        byte[] bArr2 = new byte[128];
        R((byte) 1, 0, 15, bArr2);
        R((byte) 2, 16, 31, bArr2);
        R((byte) 3, 32, 63, bArr2);
        R((byte) 0, 64, 65, bArr2);
        R((byte) 4, 66, 95, bArr2);
        R((byte) 5, 96, 96, bArr2);
        R((byte) 6, 97, 108, bArr2);
        R((byte) 7, 109, 109, bArr2);
        R((byte) 6, 110, 111, bArr2);
        R((byte) 8, 112, 112, bArr2);
        R((byte) 9, 113, 115, bArr2);
        R((byte) 10, 116, 116, bArr2);
        R((byte) 0, 117, 127, bArr2);
        R((byte) -2, 0, bArr.length - 1, bArr);
        R((byte) -1, 8, 11, bArr);
        R((byte) 0, 24, 27, bArr);
        R((byte) 16, 40, 43, bArr);
        R((byte) 0, 58, 59, bArr);
        R((byte) 0, 72, 73, bArr);
        R((byte) 16, 89, 91, bArr);
        R((byte) 16, 104, 104, bArr);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96};
        for (int i = 0; i < 128; i++) {
            byte b = bArr2[i];
            f3470R[i] = (short) (bArr4[b] | ((bArr3[b] & i) << 8));
        }
    }

    public static void R(byte b, int i, int i2, byte[] bArr) {
        while (i <= i2) {
            bArr[i] = b;
            i++;
        }
    }
}
