package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: b0d  reason: default package */
/* loaded from: classes.dex */
public final class b0d {
    public static final byte[] v = new byte[0];
    public final a25 R;

    /* renamed from: R  reason: collision with other field name */
    public final BigInteger f1501R;

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f1502R;

    /* renamed from: v  reason: collision with other field name */
    public BigInteger f1503v = BigInteger.ZERO;

    public b0d(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, a25 a25) {
        this.f1502R = bArr3;
        this.f1501R = bigInteger;
        this.R = a25;
    }

    public final byte[] R() {
        byte[] bArr = this.f1502R;
        BigInteger bigInteger = this.f1503v;
        this.R.v();
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length != 12) {
            if (byteArray.length > 13) {
                throw new GeneralSecurityException("integer too large");
            } else if (byteArray.length != 13) {
                byte[] bArr2 = new byte[12];
                System.arraycopy(byteArray, 0, bArr2, 12 - byteArray.length, byteArray.length);
                byteArray = bArr2;
            } else if (byteArray[0] == 0) {
                byteArray = Arrays.copyOfRange(byteArray, 1, byteArray.length);
            } else {
                throw new GeneralSecurityException("integer too large");
            }
        }
        return cpc.G(bArr, byteArray);
    }
}
