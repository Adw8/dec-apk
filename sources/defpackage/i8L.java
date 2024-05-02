package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: i8L  reason: default package */
/* loaded from: classes.dex */
public final class i8L implements hWE {
    public final SecretKeySpec R;

    /* renamed from: R  reason: collision with other field name */
    public byte[] f4467R;
    public byte[] v;

    public i8L(byte[] bArr) {
        d_i.R(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.R = secretKeySpec;
        if (eqw.f3215R.R()) {
            Cipher cipher = (Cipher) aXa.R.R("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] U = mxC.U(cipher.doFinal(new byte[16]));
            this.f4467R = U;
            this.v = mxC.U(U);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // defpackage.hWE
    public final byte[] R(int i, byte[] bArr) {
        byte[] bArr2;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        } else if (eqw.f3215R.R()) {
            Cipher cipher = (Cipher) aXa.R.R("AES/ECB/NoPadding");
            boolean z = true;
            cipher.init(1, this.R);
            int max = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
            if (max * 16 != bArr.length) {
                z = false;
            }
            if (z) {
                bArr2 = cpc.p((max - 1) * 16, 0, 16, bArr, this.f4467R);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length);
                if (copyOfRange.length < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[copyOfRange.length] = Byte.MIN_VALUE;
                    bArr2 = cpc.G(copyOf, this.v);
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr3 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr3 = cipher.doFinal(cpc.p(0, i2 * 16, 16, bArr3, bArr));
            }
            return Arrays.copyOf(cipher.doFinal(cpc.G(bArr2, bArr3)), i);
        } else {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }
}
