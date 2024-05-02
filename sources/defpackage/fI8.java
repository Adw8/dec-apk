package defpackage;

/* renamed from: fI8  reason: default package */
/* loaded from: classes.dex */
public final class fI8 extends s {
    public fI8(String str) {
        super(str);
    }

    public fI8(byte[] bArr) {
        super(bArr);
    }

    @Override // defpackage.s, defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.g(z, 24, k());
    }

    @Override // defpackage.s, defpackage.O
    public final int Y(boolean z) {
        return Zz.x(k().length, z);
    }

    public final byte[] k() {
        byte[] bArr = this.R;
        if (bArr[bArr.length - 1] != 90) {
            return bArr;
        }
        if (!W()) {
            byte[] bArr2 = this.R;
            byte[] bArr3 = new byte[bArr2.length + 4];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
            System.arraycopy(aPR.v("0000Z"), 0, bArr3, this.R.length - 1, 5);
            return bArr3;
        } else if (!s()) {
            byte[] bArr4 = this.R;
            byte[] bArr5 = new byte[bArr4.length + 2];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
            System.arraycopy(aPR.v("00Z"), 0, bArr5, this.R.length - 1, 3);
            return bArr5;
        } else if (!d()) {
            return this.R;
        } else {
            int length = this.R.length - 2;
            while (length > 0 && this.R[length] == 48) {
                length--;
            }
            byte[] bArr6 = this.R;
            if (bArr6[length] == 46) {
                byte[] bArr7 = new byte[length + 1];
                System.arraycopy(bArr6, 0, bArr7, 0, length);
                bArr7[length] = 90;
                return bArr7;
            }
            byte[] bArr8 = new byte[length + 2];
            int i = length + 1;
            System.arraycopy(bArr6, 0, bArr8, 0, i);
            bArr8[i] = 90;
            return bArr8;
        }
    }

    @Override // defpackage.s, defpackage.O
    public final O u() {
        return this;
    }

    @Override // defpackage.O
    public final O z() {
        return this;
    }
}
