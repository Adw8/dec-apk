package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: owi  reason: default package */
/* loaded from: classes.dex */
public final class owi implements iQG {
    public final b1t R;

    public owi(b1t b1t) {
        this.R = b1t;
    }

    @Override // defpackage.iQG
    public final byte[] R(byte[] bArr, byte[] bArr2) {
        npR npr = (npR) this.R.v;
        if (npr != null) {
            return cpc.K(npr.R(), ((iQG) ((npR) this.R.v).f6607R).R(bArr, bArr2));
        }
        throw new GeneralSecurityException("keyset without primary key");
    }
}
