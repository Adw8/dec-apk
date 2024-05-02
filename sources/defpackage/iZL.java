package defpackage;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* renamed from: iZL  reason: default package */
/* loaded from: classes.dex */
public abstract class iZL {
    public static final byte[] R = R(1, 0);
    public static final byte[] v = R(2, 32);
    public static final byte[] c = R(2, 16);
    public static final byte[] e = R(2, 17);
    public static final byte[] X = R(2, 18);
    public static final byte[] O = R(2, 1);
    public static final byte[] L = R(2, 2);
    public static final byte[] Z = R(2, 3);
    public static final byte[] m = R(2, 1);
    public static final byte[] x = R(2, 2);
    public static final byte[] H = R(2, 3);
    public static final byte[] U = new byte[0];
    public static final byte[] C = "KEM".getBytes(StandardCharsets.UTF_8);
    public static final byte[] N = "HPKE".getBytes(StandardCharsets.UTF_8);
    public static final byte[] P = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    public static byte[] R(int i, int i2) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((i2 >> (((i - i3) - 1) * 8)) & 255);
        }
        return bArr;
    }

    public static void c(iVb ivb) {
        if (ivb.o() == inw.KEM_UNKNOWN || ivb.o() == inw.UNRECOGNIZED) {
            StringBuilder U2 = opT.U("Invalid KEM param: ");
            U2.append(ivb.o().name());
            throw new GeneralSecurityException(U2.toString());
        } else if (ivb.V() == oiA.KDF_UNKNOWN || ivb.V() == oiA.UNRECOGNIZED) {
            StringBuilder U3 = opT.U("Invalid KDF param: ");
            U3.append(ivb.V().name());
            throw new GeneralSecurityException(U3.toString());
        } else if (ivb.t() == ow2.AEAD_UNKNOWN || ivb.t() == ow2.UNRECOGNIZED) {
            StringBuilder U4 = opT.U("Invalid AEAD param: ");
            U4.append(ivb.t().name());
            throw new GeneralSecurityException(U4.toString());
        }
    }

    public static byte[] v(String str, byte[] bArr, byte[] bArr2, int i) {
        return cpc.K(R(2, i), P, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }
}
