package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: oC1  reason: default package */
/* loaded from: classes.dex */
public abstract class oC1 {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public Serializable f6699R;

    public /* synthetic */ oC1(int i, String str) {
        this.R = i;
        this.f6699R = str;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [int[], java.io.Serializable] */
    public /* synthetic */ oC1(int i, byte[] bArr) {
        if (bArr.length == 32) {
            this.f6699R = Mg.c(bArr);
            this.R = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public final ByteBuffer R(int i, byte[] bArr) {
        int[] v = v(Mg.c(bArr), i);
        int[] iArr = (int[]) v.clone();
        Mg.v(iArr);
        for (int i2 = 0; i2 < v.length; i2++) {
            v[i2] = v[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(v, 0, 16);
        return order;
    }

    public abstract int c();

    public final void e(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length == c()) {
            int remaining = byteBuffer2.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer R = R(this.R + i2, bArr);
                if (i2 == i - 1) {
                    cpc.k(byteBuffer, byteBuffer2, R, remaining % 64);
                } else {
                    cpc.k(byteBuffer, byteBuffer2, R, 64);
                }
            }
            return;
        }
        StringBuilder U = opT.U("The nonce length (in bytes) must be ");
        U.append(c());
        throw new GeneralSecurityException(U.toString());
    }

    public abstract int[] v(int[] iArr, int i);
}
