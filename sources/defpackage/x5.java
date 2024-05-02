package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: x5  reason: default package */
/* loaded from: classes.dex */
public final class x5 implements rg {
    public final aYa R;

    /* renamed from: R  reason: collision with other field name */
    public final b1t f7467R;
    public final aYa v;

    public x5(b1t b1t) {
        this.f7467R = b1t;
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

    @Override // defpackage.rg
    public final byte[] R(byte[] bArr, byte[] bArr2) {
        try {
            byte[] K = cpc.K(((npR) this.f7467R.v).R(), ((rg) ((npR) this.f7467R.v).f6607R).R(bArr, bArr2));
            aYa aya = this.R;
            int i = ((npR) this.f7467R.v).R;
            int length = bArr.length;
            aya.getClass();
            return K;
        } catch (GeneralSecurityException e) {
            this.R.getClass();
            throw e;
        }
    }

    @Override // defpackage.rg
    public final byte[] v(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (npR npr : this.f7467R.v(copyOf)) {
                try {
                    byte[] v = ((rg) npr.f6607R).v(copyOfRange, bArr2);
                    aYa aya = this.v;
                    int length = copyOfRange.length;
                    aya.getClass();
                    return v;
                } catch (GeneralSecurityException e) {
                    Logger logger = Q5.R;
                    logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                }
            }
        }
        for (npR npr2 : this.f7467R.v(cU5.f2103R)) {
            try {
                byte[] v2 = ((rg) npr2.f6607R).v(bArr, bArr2);
                this.v.getClass();
                return v2;
            } catch (GeneralSecurityException unused) {
            }
        }
        this.v.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
