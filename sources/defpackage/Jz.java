package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: Jz  reason: default package */
/* loaded from: classes.dex */
public final class Jz implements mZ_ {

    /* renamed from: R  reason: collision with other field name */
    public final i8L f214R;

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f215R;
    public static final List R = Arrays.asList(64);
    public static final byte[] v = new byte[16];
    public static final byte[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    public Jz(byte[] bArr) {
        if (!eqw.f3215R.R()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        } else if (R.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f215R = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f214R = new i8L(copyOfRange);
        } else {
            throw new InvalidKeyException(jQ.j(opT.U("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
    }

    @Override // defpackage.mZ_
    public final byte[] R(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 16) {
            Cipher cipher = (Cipher) aXa.R.R("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(2, new SecretKeySpec(this.f215R, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = cipher.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && mxC.j()) {
                doFinal = new byte[0];
            }
            if (cpc.Y(copyOfRange, c(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }

    public final byte[] c(byte[]... bArr) {
        byte[] bArr2;
        if (bArr.length == 0) {
            return this.f214R.R(16, c);
        }
        byte[] R2 = this.f214R.R(16, v);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr3 = bArr[i];
            if (bArr3 == null) {
                bArr3 = new byte[0];
            }
            R2 = cpc.G(mxC.U(R2), this.f214R.R(16, bArr3));
        }
        byte[] bArr4 = bArr[bArr.length - 1];
        if (bArr4.length >= 16) {
            if (bArr4.length >= R2.length) {
                int length = bArr4.length - R2.length;
                bArr2 = Arrays.copyOf(bArr4, bArr4.length);
                for (int i2 = 0; i2 < R2.length; i2++) {
                    int i3 = length + i2;
                    bArr2[i3] = (byte) (bArr2[i3] ^ R2[i2]);
                }
            } else {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
        } else if (bArr4.length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr4, 16);
            copyOf[bArr4.length] = Byte.MIN_VALUE;
            bArr2 = cpc.G(copyOf, mxC.U(R2));
        } else {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        return this.f214R.R(16, bArr2);
    }

    @Override // defpackage.mZ_
    public final byte[] v(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483631) {
            Cipher cipher = (Cipher) aXa.R.R("AES/CTR/NoPadding");
            byte[] c2 = c(bArr2, bArr);
            byte[] bArr3 = (byte[]) c2.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(1, new SecretKeySpec(this.f215R, "AES"), new IvParameterSpec(bArr3));
            return cpc.K(c2, cipher.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
