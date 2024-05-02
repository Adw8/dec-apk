package defpackage;

import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: Ea  reason: default package */
/* loaded from: classes.dex */
public final class Ea {
    public final SecretKeySpec R;

    public Ea(byte[] bArr) {
        this.R = new SecretKeySpec(bArr, afN.R(-71601426649996L));
    }

    public final byte[] R(byte[] bArr) {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, P7.M(bArr, caw.V(0, 12)));
        Cipher instance = Cipher.getInstance(afN.R(-71829059916684L));
        instance.init(2, this.R, gCMParameterSpec);
        return instance.doFinal(P7.M(bArr, caw.V(12, bArr.length)));
    }

    public final byte[] v(byte[] bArr) {
        byte[] bArr2 = new byte[12];
        ((SecureRandom) fPS.R.getValue()).nextBytes(bArr2);
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr2);
        Cipher instance = Cipher.getInstance(afN.R(-71640081355660L));
        instance.init(1, this.R, gCMParameterSpec);
        byte[] doFinal = instance.doFinal(bArr);
        int length = doFinal.length;
        byte[] copyOf = Arrays.copyOf(bArr2, 12 + length);
        System.arraycopy(doFinal, 0, copyOf, 12, length);
        return copyOf;
    }
}
