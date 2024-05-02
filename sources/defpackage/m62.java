package defpackage;

/* renamed from: m62  reason: default package */
/* loaded from: classes.dex */
public final class m62 extends F6 {
    public final transient int[] R;

    /* renamed from: R  reason: collision with other field name */
    public final transient byte[][] f5925R;

    public m62(byte[][] bArr, int[] iArr) {
        super(F6.R.f115R);
        this.f5925R = bArr;
        this.R = iArr;
    }

    public final byte[] H() {
        byte[] bArr = new byte[v()];
        int length = this.f5925R.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.R;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            System.arraycopy(this.f5925R[i], i4, bArr, i3, (i4 + i6) - i4);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.F6
    public final boolean L(F6 f6, int i) {
        if (v() - i < 0) {
            return false;
        }
        int i2 = i + 0;
        int r = dTl.r(this, 0);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = r == 0 ? 0 : this.R[r - 1];
            int[] iArr = this.R;
            int i6 = iArr[this.f5925R.length + r];
            int min = Math.min(i2, (iArr[r] - i5) + i5) - i3;
            if (!f6.O(i4, (i3 - i5) + i6, min, this.f5925R[r])) {
                return false;
            }
            i4 += min;
            i3 += min;
            r++;
        }
        return true;
    }

    @Override // defpackage.F6
    public final boolean O(int i, int i2, int i3, byte[] bArr) {
        boolean z;
        if (i < 0 || i > v() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int r = dTl.r(this, i);
        while (i < i4) {
            int i5 = r == 0 ? 0 : this.R[r - 1];
            int[] iArr = this.R;
            int i6 = iArr[this.f5925R.length + r];
            int min = Math.min(i4, (iArr[r] - i5) + i5) - i;
            int i7 = (i - i5) + i6;
            byte[] bArr2 = this.f5925R[r];
            int i8 = 0;
            while (true) {
                if (i8 >= min) {
                    z = true;
                    break;
                } else if (bArr2[i8 + i7] != bArr[i8 + i2]) {
                    z = false;
                    break;
                } else {
                    i8++;
                }
            }
            if (!z) {
                return false;
            }
            i2 += min;
            i += min;
            r++;
        }
        return true;
    }

    @Override // defpackage.F6
    public final String R() {
        return new F6(H()).R();
    }

    @Override // defpackage.F6
    public final byte X(int i) {
        iTI.e((long) this.R[this.f5925R.length - 1], (long) i, 1);
        int r = dTl.r(this, i);
        int i2 = r == 0 ? 0 : this.R[r - 1];
        int[] iArr = this.R;
        byte[][] bArr = this.f5925R;
        return bArr[r][(i - i2) + iArr[bArr.length + r]];
    }

    @Override // defpackage.F6
    public final F6 Z() {
        return new F6(H()).Z();
    }

    @Override // defpackage.F6
    public final String c() {
        return new F6(H()).c();
    }

    @Override // defpackage.F6
    public final byte[] e() {
        return H();
    }

    @Override // defpackage.F6, java.lang.Object
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof F6) {
                F6 f6 = (F6) obj;
                if (f6.v() != v() || !L(f6, v())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.F6, java.lang.Object
    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int length = this.f5925R.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.R;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr = this.f5925R[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.e = i3;
        return i3;
    }

    @Override // defpackage.F6, java.lang.Object
    public final String toString() {
        return new F6(H()).toString();
    }

    @Override // defpackage.F6
    public final int v() {
        return this.R[this.f5925R.length - 1];
    }

    @Override // defpackage.F6
    public final void x(ME me, int i) {
        int i2 = 0 + i;
        int r = dTl.r(this, 0);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = r == 0 ? 0 : this.R[r - 1];
            int[] iArr = this.R;
            int i5 = iArr[this.f5925R.length + r];
            int min = Math.min(i2, (iArr[r] - i4) + i4) - i3;
            int i6 = (i3 - i4) + i5;
            h11 h11 = new h11(this.f5925R[r], i6, i6 + min, true);
            h11 h112 = me.f290R;
            if (h112 == null) {
                h11.f4019v = h11;
                h11.f4016R = h11;
                me.f290R = h11;
            } else {
                h112.f4019v.v(h11);
            }
            i3 += min;
            r++;
        }
        me.R += (long) i;
    }
}
