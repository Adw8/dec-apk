package defpackage;

import java.util.Arrays;

/* renamed from: nE  reason: default package */
/* loaded from: classes.dex */
public final class nE {
    public final byte[] R;

    public nE(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.R = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static nE R(byte[] bArr) {
        if (bArr != null) {
            return new nE(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nE)) {
            return false;
        }
        return Arrays.equals(((nE) obj).R, this.R);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.R);
    }

    public final String toString() {
        StringBuilder U = opT.U("Bytes(");
        U.append(lTs.L(this.R));
        U.append(")");
        return U.toString();
    }
}
