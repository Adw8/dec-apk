package defpackage;

import java.util.Arrays;

/* renamed from: jVf  reason: default package */
/* loaded from: classes.dex */
public final class jVf extends oC1 {
    public final /* synthetic */ int v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jVf(byte[] bArr, int i, int i2) {
        super(i, bArr);
        this.v = i2;
    }

    @Override // defpackage.oC1
    public final int c() {
        switch (this.v) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }

    @Override // defpackage.oC1
    public final int[] v(int[] iArr, int i) {
        switch (this.v) {
            case 0:
                if (iArr.length == c() / 4) {
                    int[] iArr2 = new int[16];
                    int[] iArr3 = Mg.R;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                    System.arraycopy((int[]) ((oC1) this).f6699R, 0, iArr2, iArr3.length, 8);
                    iArr2[12] = i;
                    System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                    return iArr2;
                }
                throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
            default:
                if (iArr.length == c() / 4) {
                    int[] iArr4 = new int[16];
                    int[] iArr5 = new int[16];
                    int[] iArr6 = Mg.R;
                    System.arraycopy(iArr6, 0, iArr5, 0, iArr6.length);
                    System.arraycopy((int[]) ((oC1) this).f6699R, 0, iArr5, iArr6.length, 8);
                    iArr5[12] = iArr[0];
                    iArr5[13] = iArr[1];
                    iArr5[14] = iArr[2];
                    iArr5[15] = iArr[3];
                    Mg.v(iArr5);
                    iArr5[4] = iArr5[12];
                    iArr5[5] = iArr5[13];
                    iArr5[6] = iArr5[14];
                    iArr5[7] = iArr5[15];
                    int[] copyOf = Arrays.copyOf(iArr5, 8);
                    System.arraycopy(iArr6, 0, iArr4, 0, iArr6.length);
                    System.arraycopy(copyOf, 0, iArr4, iArr6.length, 8);
                    iArr4[12] = i;
                    iArr4[13] = 0;
                    iArr4[14] = iArr[4];
                    iArr4[15] = iArr[5];
                    return iArr4;
                }
                throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
    }
}
