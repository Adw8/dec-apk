package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: W7  reason: default package */
/* loaded from: classes.dex */
public final class W7 implements rg {
    public static final Fl R = new Fl(4);
    public static final Fl v = new Fl(5);

    /* renamed from: R  reason: collision with other field name */
    public final int f597R;

    /* renamed from: R  reason: collision with other field name */
    public final SecretKeySpec f598R;

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f599R;

    /* renamed from: v  reason: collision with other field name */
    public final byte[] f600v;

    public W7(int i, byte[] bArr) {
        if (!eqw.f3215R.R()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else if (i == 12 || i == 16) {
            this.f597R = i;
            d_i.R(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f598R = secretKeySpec;
            Cipher cipher = (Cipher) R.get();
            cipher.init(1, secretKeySpec);
            byte[] c = c(cipher.doFinal(new byte[16]));
            this.f599R = c;
            this.f600v = c(c);
        } else {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
    }

    public static byte[] X(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            int i2 = i + 1;
            bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    @Override // defpackage.rg
    public final byte[] R(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f597R;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr3 = new byte[bArr.length + i + 16];
            byte[] R2 = opU.R(i);
            System.arraycopy(R2, 0, bArr3, 0, this.f597R);
            Cipher cipher = (Cipher) R.get();
            cipher.init(1, this.f598R);
            byte[] e = e(cipher, 0, R2, 0, R2.length);
            byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
            byte[] e2 = e(cipher, 1, bArr4, 0, bArr4.length);
            Cipher cipher2 = (Cipher) v.get();
            cipher2.init(1, this.f598R, new IvParameterSpec(e));
            cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f597R);
            byte[] e3 = e(cipher, 2, bArr3, this.f597R, bArr.length);
            int length2 = bArr.length + this.f597R;
            for (int i2 = 0; i2 < 16; i2++) {
                bArr3[length2 + i2] = (byte) ((e2[i2] ^ e[i2]) ^ e3[i2]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] e(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(X(bArr3, this.f599R));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                doFinal[i5] = (byte) (doFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            doFinal = cipher.doFinal(doFinal);
            i4 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = X(copyOfRange, this.f599R);
        } else {
            bArr2 = Arrays.copyOf(this.f600v, 16);
            for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                bArr2[i6] = (byte) (bArr2[i6] ^ copyOfRange[i6]);
            }
            bArr2[copyOfRange.length] = (byte) (bArr2[copyOfRange.length] ^ 128);
        }
        return cipher.doFinal(X(doFinal, bArr2));
    }

    @Override // defpackage.rg
    public final byte[] v(byte[] bArr, byte[] bArr2) {
        int length = (bArr.length - this.f597R) - 16;
        if (length >= 0) {
            Cipher cipher = (Cipher) R.get();
            cipher.init(1, this.f598R);
            byte[] e = e(cipher, 0, bArr, 0, this.f597R);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] e2 = e(cipher, 1, bArr2, 0, bArr2.length);
            byte[] e3 = e(cipher, 2, bArr, this.f597R, length);
            int length2 = bArr.length - 16;
            byte b = 0;
            for (int i = 0; i < 16; i++) {
                b = (byte) (b | (((bArr[length2 + i] ^ e2[i]) ^ e[i]) ^ e3[i]));
            }
            if (b == 0) {
                Cipher cipher2 = (Cipher) v.get();
                cipher2.init(1, this.f598R, new IvParameterSpec(e));
                return cipher2.doFinal(bArr, this.f597R, length);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
