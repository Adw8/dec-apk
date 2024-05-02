package defpackage;

import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;

/* renamed from: fG0  reason: default package */
/* loaded from: classes.dex */
public final class fG0 {
    public Ea R;

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f3366R = new byte[32];

    public final void R() {
        byte[] bArr = this.f3366R;
        Arrays.fill(bArr, 0, bArr.length, (byte) 0);
    }

    public final byte[] v(String str) {
        ((SecureRandom) fPS.R.getValue()).nextBytes(this.f3366R);
        this.R = new Ea(this.f3366R);
        String H = opT.H(str, iH_.f(32 - (str.length() % 32), afN.R(-49306251416460L)));
        Cipher instance = Cipher.getInstance(afN.R(-67589927195532L));
        instance.init(1, dn7.R);
        byte[] doFinal = instance.doFinal(this.f3366R);
        Ea ea = this.R;
        if (ea == null) {
            ea = null;
        }
        byte[] v = ea.v(iH_.z(H));
        int length = v.length;
        int length2 = doFinal.length;
        byte[] copyOf = Arrays.copyOf(v, length + length2);
        System.arraycopy(doFinal, 0, copyOf, length, length2);
        return copyOf;
    }
}
