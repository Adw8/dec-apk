package defpackage;

import java.util.Arrays;

/* renamed from: owK  reason: default package */
/* loaded from: classes.dex */
public final class owK implements Comparable {
    public final byte[] R;

    public owK(byte[] bArr) {
        this.R = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        owK owk = (owK) obj;
        byte[] bArr = this.R;
        int length = bArr.length;
        byte[] bArr2 = owk.R;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        int i = 0;
        while (true) {
            byte[] bArr3 = this.R;
            if (i >= bArr3.length) {
                return 0;
            }
            byte b = bArr3[i];
            byte b2 = owk.R[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (!(obj instanceof owK)) {
            return false;
        }
        return Arrays.equals(this.R, ((owK) obj).R);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(this.R);
    }

    @Override // java.lang.Object
    public final String toString() {
        return lTs.L(this.R);
    }
}
