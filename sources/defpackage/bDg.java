package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bDg  reason: default package */
/* loaded from: classes.dex */
public final class bDg implements hWE {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final String f1577R;

    /* renamed from: R  reason: collision with other field name */
    public final Key f1578R;

    /* renamed from: R  reason: collision with other field name */
    public final nbL f1579R;

    public bDg(String str, SecretKeySpec secretKeySpec) {
        nbL nbl = new nbL(this);
        this.f1579R = nbl;
        if (eqw.R.R()) {
            this.f1577R = str;
            this.f1578R = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.R = 20;
                        break;
                    case 1:
                        this.R = 28;
                        break;
                    case 2:
                        this.R = 32;
                        break;
                    case 3:
                        this.R = 48;
                        break;
                    case 4:
                        this.R = 64;
                        break;
                    default:
                        throw new NoSuchAlgorithmException(opT.H("unknown Hmac algorithm: ", str));
                }
                nbl.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // defpackage.hWE
    public final byte[] R(int i, byte[] bArr) {
        if (i <= this.R) {
            ((Mac) this.f1579R.get()).update(bArr);
            return Arrays.copyOf(((Mac) this.f1579R.get()).doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
