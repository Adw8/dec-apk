package defpackage;

/* renamed from: a9  reason: default package */
/* loaded from: classes.dex */
public final class a9 extends e {
    public final e[] R;
    public final int e;

    public a9(int i, byte[] bArr) {
        super(i, bArr);
        this.R = null;
        this.e = 1000;
    }

    public static byte[] A(e[] eVarArr) {
        int length = eVarArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return eVarArr[0].f2932R;
        }
        int i = length - 1;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            byte[] bArr = eVarArr[i3].f2932R;
            if (bArr[0] == 0) {
                i2 += bArr.length - 1;
            } else {
                throw new IllegalArgumentException("only the last nested bitstring can have padding");
            }
        }
        byte[] bArr2 = eVarArr[i].f2932R;
        byte b = bArr2[0];
        byte[] bArr3 = new byte[i2 + bArr2.length];
        bArr3[0] = b;
        int i4 = 1;
        for (e eVar : eVarArr) {
            byte[] bArr4 = eVar.f2932R;
            int length2 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i4, length2);
            i4 += length2;
        }
        return bArr3;
    }

    @Override // defpackage.O
    public final boolean J() {
        return this.R != null || super.f2932R.length > this.e;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        if (!J()) {
            byte[] bArr = super.f2932R;
            int length = bArr.length;
            zz.i(3, z);
            zz.P(length);
            zz.N(bArr, 0, length);
            return;
        }
        zz.i(35, z);
        zz.C(128);
        e[] eVarArr = this.R;
        if (eVarArr != null) {
            zz.o(eVarArr);
        } else {
            byte[] bArr2 = super.f2932R;
            if (bArr2.length >= 2) {
                byte b = bArr2[0];
                int length2 = bArr2.length;
                int i = length2 - 1;
                int i2 = this.e - 1;
                while (i > i2) {
                    zz.i(3, true);
                    zz.P(i2 + 1);
                    zz.C(0);
                    zz.N(super.f2932R, length2 - i, i2);
                    i -= i2;
                }
                zz.i(3, true);
                zz.P(i + 1);
                zz.C(b);
                zz.N(super.f2932R, length2 - i, i);
            }
        }
        zz.C(0);
        zz.C(0);
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        if (!J()) {
            return Zz.x(super.f2932R.length, z);
        }
        int i = z ? 4 : 3;
        if (this.R != null) {
            int i2 = 0;
            while (true) {
                e[] eVarArr = this.R;
                if (i2 >= eVarArr.length) {
                    return i;
                }
                i += eVarArr[i2].Y(true);
                i2++;
            }
        } else {
            byte[] bArr = super.f2932R;
            if (bArr.length < 2) {
                return i;
            }
            int i3 = this.e;
            int length = (bArr.length - 2) / (i3 - 1);
            return Zz.x(super.f2932R.length - ((this.e - 1) * length), true) + (Zz.x(i3, true) * length) + i;
        }
    }

    public a9(e[] eVarArr) {
        super(false, A(eVarArr));
        this.R = eVarArr;
        this.e = 1000;
    }
}
