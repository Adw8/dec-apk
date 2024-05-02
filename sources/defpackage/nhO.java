package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: nhO  reason: default package */
/* loaded from: classes.dex */
public final class nhO extends O implements SF {
    public final byte[] R;

    public nhO(String str) {
        int i = aPR.R;
        char[] charArray = str.toCharArray();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            aPR.e(charArray, byteArrayOutputStream);
            this.R = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }

    @Override // defpackage.O
    public final /* bridge */ /* synthetic */ boolean J() {
        return false;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.g(z, 12, this.R);
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        return Zz.x(this.R.length, z);
    }

    @Override // defpackage.SF
    public final String c() {
        byte[] bArr = this.R;
        int i = aPR.R;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = fc4.f3470R;
        int length2 = bArr.length + 0;
        int i2 = 0;
        int i3 = 0;
        loop0: while (i2 < length2) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b < 0) {
                short s = fc4.f3470R[b & Byte.MAX_VALUE];
                int i5 = s >>> 8;
                byte b2 = (byte) s;
                while (true) {
                    if (b2 >= 0) {
                        if (i4 >= bArr.length) {
                            break loop0;
                        }
                        i4++;
                        byte b3 = bArr[i4];
                        i5 = (i5 << 6) | (b3 & 63);
                        b2 = fc4.R[b2 + ((b3 & 255) >>> 4)];
                    } else if (b2 != -2) {
                        if (i5 <= 65535) {
                            if (i3 < length) {
                                i3++;
                                cArr[i3] = (char) i5;
                                i2 = i4;
                            }
                        } else if (i3 < length - 1) {
                            int i6 = i3 + 1;
                            cArr[i3] = (char) ((i5 >>> 10) + 55232);
                            i3 = i6 + 1;
                            cArr[i6] = (char) ((i5 & 1023) | 56320);
                            i2 = i4;
                        }
                    }
                }
                i3 = -1;
                break;
            } else if (i3 >= length) {
                i3 = -1;
                break;
            } else {
                i3++;
                cArr[i3] = (char) b;
                i2 = i4;
            }
        }
        if (i3 >= 0) {
            return new String(cArr, 0, i3);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    /* renamed from: n */
    public final int hashCode() {
        return mLz.L(this.R);
    }

    @Override // defpackage.O
    public final boolean o(O o) {
        if (!(o instanceof nhO)) {
            return false;
        }
        return Arrays.equals(this.R, ((nhO) o).R);
    }

    public final String toString() {
        return c();
    }

    public nhO(byte[] bArr) {
        this.R = bArr;
    }
}
