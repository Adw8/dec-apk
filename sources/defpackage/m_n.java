package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: m_n  reason: default package */
/* loaded from: classes.dex */
public final class m_n implements gwO {
    public final aYa R;

    /* renamed from: R  reason: collision with other field name */
    public final b1t f6071R;
    public final aYa v;

    public m_n(b1t b1t) {
        this.f6071R = b1t;
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

    @Override // defpackage.gwO
    public final void R(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (npR npr : this.f6071R.v(copyOf)) {
                byte[] K = npr.f6606R.equals(hPF.LEGACY) ? cpc.K(bArr2, lLq.f5656R) : bArr2;
                try {
                    ((gwO) npr.f6607R).R(copyOfRange, K);
                    aYa aya = this.v;
                    int length = K.length;
                    aya.getClass();
                    return;
                } catch (GeneralSecurityException e) {
                    Logger logger = lLq.R;
                    logger.info("tag prefix matches a key, but cannot verify: " + e);
                }
            }
            for (npR npr2 : this.f6071R.v(cU5.f2103R)) {
                try {
                    ((gwO) npr2.f6607R).R(bArr, bArr2);
                    aYa aya2 = this.v;
                    int length2 = bArr2.length;
                    aya2.getClass();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.v.getClass();
            throw new GeneralSecurityException("invalid MAC");
        }
        this.v.getClass();
        throw new GeneralSecurityException("tag too short");
    }

    @Override // defpackage.gwO
    public final byte[] v(byte[] bArr) {
        if (((npR) this.f6071R.v).f6606R.equals(hPF.LEGACY)) {
            bArr = cpc.K(bArr, lLq.f5656R);
        }
        try {
            byte[] K = cpc.K(((npR) this.f6071R.v).R(), ((gwO) ((npR) this.f6071R.v).f6607R).v(bArr));
            aYa aya = this.R;
            int i = ((npR) this.f6071R.v).R;
            int length = bArr.length;
            aya.getClass();
            return K;
        } catch (GeneralSecurityException e) {
            this.R.getClass();
            throw e;
        }
    }
}
