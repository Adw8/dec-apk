package defpackage;

import android.os.Build;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: l6B  reason: default package */
/* loaded from: classes.dex */
public final class l6B {
    public static final Fl R = new Fl(1);

    /* renamed from: R  reason: collision with other field name */
    public final SecretKeySpec f5584R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f5585R;

    public l6B(boolean z, byte[] bArr) {
        if (eqw.R.R()) {
            d_i.R(bArr.length);
            this.f5584R = new SecretKeySpec(bArr, "AES");
            this.f5585R = z;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static AlgorithmParameterSpec v(byte[] bArr) {
        int length = bArr.length;
        if (mxC.j()) {
            Integer valueOf = Integer.valueOf(Build.VERSION.SDK_INT);
            if ((valueOf != null ? valueOf.intValue() : -1) <= 19) {
                return new IvParameterSpec(bArr, 0, length);
            }
        }
        return new GCMParameterSpec(128, bArr, 0, length);
    }

    public final byte[] R(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        } else if (bArr2.length <= 2147483619) {
            boolean z = this.f5585R;
            byte[] bArr4 = new byte[(z ? bArr2.length + 12 : bArr2.length) + 16];
            if (z) {
                System.arraycopy(bArr, 0, bArr4, 0, 12);
            }
            AlgorithmParameterSpec v = v(bArr);
            Fl fl = R;
            ((Cipher) fl.get()).init(1, this.f5584R, v);
            if (!(bArr3 == null || bArr3.length == 0)) {
                ((Cipher) fl.get()).updateAAD(bArr3);
            }
            int doFinal = ((Cipher) fl.get()).doFinal(bArr2, 0, bArr2.length, bArr4, this.f5585R ? 12 : 0);
            if (doFinal == bArr2.length + 16) {
                return bArr4;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr2.length)));
        } else {
            throw new GeneralSecurityException("plaintext too long");
        }
    }
}
