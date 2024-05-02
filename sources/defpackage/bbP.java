package defpackage;

import java.util.Arrays;

/* renamed from: bbP  reason: default package */
/* loaded from: classes.dex */
public final class bbP extends O implements SF {
    public final char[] R;

    public bbP(char[] cArr) {
        this.R = cArr;
    }

    @Override // defpackage.O
    public final /* bridge */ /* synthetic */ boolean J() {
        return false;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        int length = this.R.length;
        zz.i(30, z);
        zz.P(length * 2);
        byte[] bArr = new byte[8];
        int i = length & -4;
        int i2 = 0;
        while (i2 < i) {
            char[] cArr = this.R;
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            zz.N(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = this.R[i2];
                i2++;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (c5 >> '\b');
                i3 = i4 + 1;
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            zz.N(bArr, 0, i3);
        }
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        return Zz.x(this.R.length * 2, z);
    }

    @Override // defpackage.SF
    public final String c() {
        return new String(this.R);
    }

    /* renamed from: n */
    public final int hashCode() {
        char[] cArr = this.R;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    @Override // defpackage.O
    public final boolean o(O o) {
        if (!(o instanceof bbP)) {
            return false;
        }
        return Arrays.equals(this.R, ((bbP) o).R);
    }

    public final String toString() {
        return c();
    }
}
