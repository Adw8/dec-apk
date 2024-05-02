package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: aOm  reason: default package */
/* loaded from: classes.dex */
public final class aOm implements rg {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final gwO f863R;

    /* renamed from: R  reason: collision with other field name */
    public final oYA f864R;

    public aOm(oYA oya, gwO gwo, int i) {
        this.f864R = oya;
        this.f863R = gwo;
        this.R = i;
    }

    @Override // defpackage.rg
    public final byte[] R(byte[] bArr, byte[] bArr2) {
        KL kl = (KL) this.f864R;
        kl.getClass();
        int length = bArr.length;
        int i = kl.f244R;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr3 = new byte[bArr.length + i];
            byte[] R = opU.R(i);
            System.arraycopy(R, 0, bArr3, 0, kl.f244R);
            kl.R(bArr, 0, bArr.length, bArr3, kl.f244R, R, true);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            return cpc.K(bArr3, this.f863R.v(cpc.K(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
        }
        StringBuilder U = opT.U("plaintext length can not exceed ");
        U.append(Integer.MAX_VALUE - kl.f244R);
        throw new GeneralSecurityException(U.toString());
    }

    @Override // defpackage.rg
    public final byte[] v(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.R;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.R, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.f863R.R(copyOfRange2, cpc.K(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
            KL kl = (KL) this.f864R;
            kl.getClass();
            int length2 = copyOfRange.length;
            int i2 = kl.f244R;
            if (length2 >= i2) {
                byte[] bArr3 = new byte[i2];
                System.arraycopy(copyOfRange, 0, bArr3, 0, i2);
                int length3 = copyOfRange.length;
                int i3 = kl.f244R;
                byte[] bArr4 = new byte[length3 - i3];
                kl.R(copyOfRange, i3, copyOfRange.length - i3, bArr4, 0, bArr3, false);
                return bArr4;
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
