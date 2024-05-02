package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: gjr  reason: default package */
/* loaded from: classes.dex */
public final class gjr implements gwO {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final hWE f3915R;

    public gjr(hWE hwe, int i) {
        this.f3915R = hwe;
        this.R = i;
        if (i >= 10) {
            hwe.R(i, new byte[0]);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // defpackage.gwO
    public final void R(byte[] bArr, byte[] bArr2) {
        if (!cpc.Y(v(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // defpackage.gwO
    public final byte[] v(byte[] bArr) {
        return this.f3915R.R(this.R, bArr);
    }
}
