package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* renamed from: fuV  reason: default package */
/* loaded from: classes.dex */
public final class fuV implements rg {
    public static final byte[] R = new byte[0];

    /* renamed from: R  reason: collision with other field name */
    public final k1p f3582R;

    /* renamed from: R  reason: collision with other field name */
    public final rg f3583R;

    public fuV(k1p k1p, ai aiVar) {
        this.f3582R = k1p;
        this.f3583R = aiVar;
    }

    @Override // defpackage.rg
    public final byte[] R(byte[] bArr, byte[] bArr2) {
        byte[] e = kWP.e(this.f3582R).e();
        byte[] R2 = this.f3583R.R(e, R);
        byte[] R3 = ((rg) kWP.v(this.f3582R.V(), b0.H(e, 0, e.length), rg.class)).R(bArr, bArr2);
        return ByteBuffer.allocate(R2.length + 4 + R3.length).putInt(R2.length).put(R2).put(R3).array();
    }

    @Override // defpackage.rg
    public final byte[] v(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] v = this.f3583R.v(bArr3, R);
            String V = this.f3582R.V();
            Logger logger = kWP.f5319R;
            MH mh = b0.f1499R;
            return ((rg) kWP.v(V, b0.H(v, 0, v.length), rg.class)).v(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
