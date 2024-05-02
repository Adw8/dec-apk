package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: eCX  reason: default package */
/* loaded from: classes.dex */
public final class eCX implements mZ_ {
    public final aYa R;

    /* renamed from: R  reason: collision with other field name */
    public final b1t f3027R;
    public final aYa v;

    public eCX(b1t b1t) {
        this.f3027R = b1t;
        if (!((imB) b1t.e).f4720R.isEmpty()) {
            iVp ivp = (iVp) ikN.f4710R.f4711R.get();
            ivp = ivp == null ? ikN.R : ivp;
            cUF.x(b1t);
            ivp.getClass();
            aYa aya = cUF.R;
            this.R = aya;
            this.v = aya;
            return;
        }
        aYa aya2 = cUF.R;
        this.R = aya2;
        this.v = aya2;
    }

    @Override // defpackage.mZ_
    public final byte[] R(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (npR npr : this.f3027R.v(copyOf)) {
                try {
                    byte[] R = ((mZ_) npr.f6607R).R(copyOfRange, bArr2);
                    aYa aya = this.v;
                    int length = copyOfRange.length;
                    aya.getClass();
                    return R;
                } catch (GeneralSecurityException e) {
                    Logger logger = o69.R;
                    logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                }
            }
        }
        for (npR npr2 : this.f3027R.v(cU5.f2103R)) {
            try {
                byte[] R2 = ((mZ_) npr2.f6607R).R(bArr, bArr2);
                this.v.getClass();
                return R2;
            } catch (GeneralSecurityException unused) {
            }
        }
        this.v.getClass();
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // defpackage.mZ_
    public final byte[] v(byte[] bArr, byte[] bArr2) {
        try {
            byte[] K = cpc.K(((npR) this.f3027R.v).R(), ((mZ_) ((npR) this.f3027R.v).f6607R).v(bArr, bArr2));
            aYa aya = this.R;
            int i = ((npR) this.f3027R.v).R;
            int length = bArr.length;
            aya.getClass();
            return K;
        } catch (GeneralSecurityException e) {
            this.R.getClass();
            throw e;
        }
    }
}
