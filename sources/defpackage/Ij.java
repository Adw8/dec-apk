package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: Ij  reason: default package */
/* loaded from: classes.dex */
public final class Ij implements rg {
    public static final Fl R = new Fl(2);

    /* renamed from: R  reason: collision with other field name */
    public final SecretKeySpec f192R;

    public Ij(byte[] bArr) {
        d_i.R(bArr.length);
        this.f192R = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(byte[] bArr, int i) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i);
        } catch (ClassNotFoundException unused) {
            if (mxC.j()) {
                return new IvParameterSpec(bArr, 0, i);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // defpackage.rg
    public final byte[] R(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 12 + 16];
            byte[] R2 = opU.R(12);
            System.arraycopy(R2, 0, bArr3, 0, 12);
            AlgorithmParameterSpec c = c(R2, R2.length);
            Fl fl = R;
            ((Cipher) fl.get()).init(1, this.f192R, c);
            if (!(bArr2 == null || bArr2.length == 0)) {
                ((Cipher) fl.get()).updateAAD(bArr2);
            }
            int doFinal = ((Cipher) fl.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr.length)));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // defpackage.rg
    public final byte[] v(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec c = c(bArr, 12);
            Fl fl = R;
            ((Cipher) fl.get()).init(2, this.f192R, c);
            if (!(bArr2 == null || bArr2.length == 0)) {
                ((Cipher) fl.get()).updateAAD(bArr2);
            }
            return ((Cipher) fl.get()).doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
