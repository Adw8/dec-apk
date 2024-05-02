package defpackage;

/* renamed from: CB  reason: default package */
/* loaded from: classes.dex */
public final class CB extends F {
    public final F[] R;
    public final int e;

    public CB(byte[] bArr) {
        super(bArr);
        this.R = null;
        this.e = 1000;
    }

    public CB(byte[] bArr, F[] fArr) {
        super(bArr);
        this.R = fArr;
        this.e = 1000;
    }

    public static byte[] Q(F[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return F.v;
        }
        if (length == 1) {
            return fArr[0].f112R;
        }
        int i = 0;
        for (F f : fArr) {
            i += f.f112R.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (F f2 : fArr) {
            byte[] bArr2 = f2.f112R;
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    @Override // defpackage.O
    public final boolean J() {
        return this.R != null || super.f112R.length > this.e;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        if (!J()) {
            byte[] bArr = super.f112R;
            int length = bArr.length;
            zz.i(4, z);
            zz.P(length);
            zz.N(bArr, 0, length);
            return;
        }
        zz.i(36, z);
        zz.C(128);
        F[] fArr = this.R;
        if (fArr == null) {
            int i = 0;
            while (true) {
                byte[] bArr2 = super.f112R;
                if (i >= bArr2.length) {
                    break;
                }
                int min = Math.min(bArr2.length - i, this.e);
                byte[] bArr3 = super.f112R;
                zz.i(4, true);
                zz.P(min);
                zz.N(bArr3, i, min);
                i += min;
            }
        } else {
            zz.o(fArr);
        }
        zz.C(0);
        zz.C(0);
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        if (!J()) {
            return Zz.x(super.f112R.length, z);
        }
        int i = z ? 4 : 3;
        if (this.R != null) {
            int i2 = 0;
            while (true) {
                F[] fArr = this.R;
                if (i2 >= fArr.length) {
                    return i;
                }
                i += fArr[i2].Y(true);
                i2++;
            }
        } else {
            int length = super.f112R.length;
            int i3 = this.e;
            int i4 = length / i3;
            int x = i + (Zz.x(i3, true) * i4);
            int length2 = super.f112R.length - (i4 * this.e);
            return length2 > 0 ? x + Zz.x(length2, true) : x;
        }
    }

    public CB(F[] fArr) {
        this(Q(fArr), fArr);
    }
}
