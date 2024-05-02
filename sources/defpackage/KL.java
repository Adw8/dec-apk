package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: KL  reason: default package */
/* loaded from: classes.dex */
public final class KL implements oYA {
    public static final Fl R = new Fl(3);

    /* renamed from: R  reason: collision with other field name */
    public final int f244R;

    /* renamed from: R  reason: collision with other field name */
    public final SecretKeySpec f245R;
    public final int v;

    public KL(int i, byte[] bArr) {
        if (eqw.R.R()) {
            d_i.R(bArr.length);
            this.f245R = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) R.get()).getBlockSize();
            this.v = blockSize;
            if (i < 12 || i > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.f244R = i;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final void R(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) {
        Cipher cipher = (Cipher) R.get();
        byte[] bArr4 = new byte[this.v];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f244R);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.f245R, ivParameterSpec);
        } else {
            cipher.init(2, this.f245R, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
