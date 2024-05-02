package defpackage;

import java.util.Arrays;

/* renamed from: kRc  reason: default package */
/* loaded from: classes.dex */
public final class kRc extends O implements SF {
    public static final char[] R = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f5291R;

    public kRc(byte[] bArr) {
        this.f5291R = bArr;
    }

    public static void n(StringBuffer stringBuffer, int i) {
        char[] cArr = R;
        stringBuffer.append(cArr[(i >>> 4) & 15]);
        stringBuffer.append(cArr[i & 15]);
    }

    @Override // defpackage.O
    public final /* bridge */ /* synthetic */ boolean J() {
        return false;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.g(z, 28, this.f5291R);
    }

    /* renamed from: Q */
    public final int hashCode() {
        return mLz.L(this.f5291R);
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        return Zz.x(this.f5291R.length, z);
    }

    @Override // defpackage.SF
    public final String c() {
        int length = this.f5291R.length;
        StringBuffer stringBuffer = new StringBuffer(((Zz.m(length) + length) * 2) + 3);
        stringBuffer.append("#1C");
        if (length < 128) {
            n(stringBuffer, length);
        } else {
            byte[] bArr = new byte[5];
            int i = length;
            int i2 = 5;
            do {
                i2--;
                bArr[i2] = (byte) i;
                i >>>= 8;
            } while (i != 0);
            int i3 = 5 - i2;
            int i4 = i2 - 1;
            bArr[i4] = (byte) (128 | i3);
            while (true) {
                int i5 = i4 + 1;
                n(stringBuffer, bArr[i4]);
                if (i5 >= 5) {
                    break;
                }
                i4 = i5;
            }
        }
        for (int i6 = 0; i6 < length; i6++) {
            n(stringBuffer, this.f5291R[i6]);
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.O
    public final boolean o(O o) {
        if (!(o instanceof kRc)) {
            return false;
        }
        return Arrays.equals(this.f5291R, ((kRc) o).f5291R);
    }

    public final String toString() {
        return c();
    }
}
