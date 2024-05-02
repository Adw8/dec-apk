package defpackage;

import java.io.ByteArrayOutputStream;

/* renamed from: kPv  reason: default package */
/* loaded from: classes.dex */
public abstract class kPv {
    public static final mF9 R = new mF9();

    public static byte[] R(byte[] bArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            mF9 mf9 = R;
            mf9.getClass();
            if (i >= 0) {
                byte[] bArr2 = new byte[72];
                int i2 = 0;
                while (i > 0) {
                    int min = Math.min(36, i);
                    int i3 = min + i2;
                    int i4 = 0;
                    while (i2 < i3) {
                        i2++;
                        int i5 = bArr[i2] & 255;
                        int i6 = i4 + 1;
                        byte[] bArr3 = mf9.R;
                        bArr2[i4] = bArr3[i5 >>> 4];
                        i4 = i6 + 1;
                        bArr2[i6] = bArr3[i5 & 15];
                    }
                    byteArrayOutputStream.write(bArr2, 0, i4 + 0);
                    i -= min;
                    i2 = i3;
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder U = opT.U("exception encoding Hex string: ");
            U.append(e.getMessage());
            throw new _(2, U.toString(), e);
        }
    }
}
