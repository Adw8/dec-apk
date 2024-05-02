package defpackage;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: ai  reason: default package */
/* loaded from: classes.dex */
public final class ai implements rg {
    public final SecretKey R;

    public ai(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.R = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(opT.H("Keystore cannot load the key with ID: ", str));
        }
    }

    @Override // defpackage.rg
    public final byte[] R(byte[] bArr, byte[] bArr2) {
        try {
            return e(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w("ai", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((long) ((int) (Math.random() * 100.0d)));
            } catch (InterruptedException unused) {
            }
            return this.e(bArr, bArr2);
        }
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, this.R, gCMParameterSpec);
            instance.updateAAD(bArr2);
            return instance.doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] e(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 12 + 16];
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.R);
            instance.updateAAD(bArr2);
            instance.doFinal(bArr, 0, bArr.length, bArr3, 12);
            System.arraycopy(instance.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // defpackage.rg
    public final byte[] v(byte[] bArr, byte[] bArr2) {
        try {
            return c(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w("ai", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((long) ((int) (Math.random() * 100.0d)));
            } catch (InterruptedException unused) {
            }
            return this.c(bArr, bArr2);
        }
    }
}
