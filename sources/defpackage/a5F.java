package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* renamed from: a5F  reason: default package */
/* loaded from: classes.dex */
public abstract class a5F {
    public final jVf R;
    public final jVf v;

    public a5F(byte[] bArr) {
        jVf jvf;
        jVf jvf2;
        if (eqw.f3215R.R()) {
            kKl kkl = (kKl) this;
            switch (kkl.R) {
                case 0:
                    jvf = new jVf(bArr, 1, 0);
                    break;
                default:
                    jvf = new jVf(bArr, 1, 1);
                    break;
            }
            this.R = jvf;
            switch (kkl.R) {
                case 0:
                    jvf2 = new jVf(bArr, 0, 0);
                    break;
                default:
                    jvf2 = new jVf(bArr, 0, 1);
                    break;
            }
            this.v = jvf2;
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public static byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i = remaining % 16;
        int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length;
        ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i2);
        order.putLong((long) bArr.length);
        order.putLong((long) remaining);
        return order.array();
    }

    public final byte[] R(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                this.v.R(0, bArr).get(bArr4);
                if (cpc.Y(mxC.x(bArr4, c(bArr2, byteBuffer)), bArr3)) {
                    byteBuffer.position(position);
                    jVf jvf = this.R;
                    jvf.getClass();
                    ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                    jvf.e(bArr, allocate, byteBuffer);
                    return allocate.array();
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    public final void v(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int position = byteBuffer.position();
            jVf jvf = this.R;
            jvf.getClass();
            if (byteBuffer.remaining() >= bArr2.length) {
                jvf.e(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
                byteBuffer.position(position);
                byteBuffer.limit(byteBuffer.limit() - 16);
                if (bArr3 == null) {
                    bArr3 = new byte[0];
                }
                ByteBuffer R = this.v.R(0, bArr);
                byte[] bArr4 = new byte[32];
                R.get(bArr4);
                byte[] x = mxC.x(bArr4, c(bArr3, byteBuffer));
                byteBuffer.limit(byteBuffer.limit() + 16);
                byteBuffer.put(x);
                return;
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }
}
