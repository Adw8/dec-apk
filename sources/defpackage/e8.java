package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;

/* renamed from: e8  reason: default package */
/* loaded from: classes.dex */
public final class e8 implements rg {
    public final l6B R;

    public e8(byte[] bArr) {
        if (eqw.R.R()) {
            this.R = new l6B(true, bArr);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // defpackage.rg
    public final byte[] R(byte[] bArr, byte[] bArr2) {
        return this.R.R(opU.R(12), bArr, bArr2);
    }

    @Override // defpackage.rg
    public final byte[] v(byte[] bArr, byte[] bArr2) {
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        l6B l6b = this.R;
        l6b.getClass();
        if (copyOf.length == 12) {
            boolean z = l6b.f5585R;
            if (bArr.length >= (z ? 28 : 16)) {
                int i = 0;
                if (!z || ByteBuffer.wrap(copyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
                    AlgorithmParameterSpec v = l6B.v(copyOf);
                    Fl fl = l6B.R;
                    ((Cipher) fl.get()).init(2, l6b.f5584R, v);
                    if (!(bArr2 == null || bArr2.length == 0)) {
                        ((Cipher) fl.get()).updateAAD(bArr2);
                    }
                    boolean z2 = l6b.f5585R;
                    if (z2) {
                        i = 12;
                    }
                    return ((Cipher) fl.get()).doFinal(bArr, i, z2 ? bArr.length - 12 : bArr.length);
                }
                throw new GeneralSecurityException("iv does not match prepended iv");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}
