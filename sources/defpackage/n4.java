package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: n4  reason: default package */
/* loaded from: classes.dex */
public final class n4 implements a25 {
    public final int e;

    public n4(int i) {
        if (i == 16 || i == 32) {
            this.e = i;
            return;
        }
        throw new InvalidAlgorithmParameterException(opT.Z("Unsupported key length: ", i));
    }

    @Override // defpackage.a25
    public final byte[] O(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == this.e) {
            return new l6B(false, bArr).R(bArr2, bArr3, bArr4);
        }
        StringBuilder U = opT.U("Unexpected key length: ");
        U.append(bArr.length);
        throw new InvalidAlgorithmParameterException(U.toString());
    }

    @Override // defpackage.a25
    public final int Z() {
        return this.e;
    }

    @Override // defpackage.a25
    public final byte[] c() {
        int i = this.e;
        if (i == 16) {
            return iZL.m;
        }
        if (i == 32) {
            return iZL.x;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // defpackage.a25
    public final void v() {
    }
}
