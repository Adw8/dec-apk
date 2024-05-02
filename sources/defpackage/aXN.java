package defpackage;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* renamed from: aXN  reason: default package */
/* loaded from: classes.dex */
public final class aXN implements iQG {
    public static final byte[] R = new byte[0];

    /* renamed from: R  reason: collision with other field name */
    public final a25 f909R;

    /* renamed from: R  reason: collision with other field name */
    public final bFN f910R;

    /* renamed from: R  reason: collision with other field name */
    public final fWO f911R;

    /* renamed from: R  reason: collision with other field name */
    public final zI f912R;

    public aXN(fWO fwo, bFN bfn, zI zIVar, a25 a25) {
        this.f911R = fwo;
        this.f910R = bfn;
        this.f912R = zIVar;
        this.f909R = a25;
    }

    @Override // defpackage.iQG
    public final byte[] R(byte[] bArr, byte[] bArr2) {
        byte[] R2;
        fWO fwo = this.f911R;
        bFN bfn = this.f910R;
        zI zIVar = this.f912R;
        a25 a25 = this.f909R;
        mF9 e = bfn.e(fwo.V().t());
        byte[] bArr3 = e.v;
        byte[] bArr4 = e.R;
        byte[] K = cpc.K(iZL.N, bfn.O(), zIVar.e(), a25.c());
        byte[] bArr5 = iZL.U;
        byte[] bArr6 = b0d.v;
        byte[] bArr7 = iZL.P;
        byte[] K2 = cpc.K(iZL.R, zIVar.c(cpc.K(bArr7, K, "psk_id_hash".getBytes(StandardCharsets.UTF_8), bArr6), bArr5), zIVar.c(cpc.K(bArr7, K, "info_hash".getBytes(StandardCharsets.UTF_8), bArr2), bArr5));
        byte[] c = zIVar.c(cpc.K(bArr7, K, "secret".getBytes(StandardCharsets.UTF_8), bArr6), bArr4);
        int Z = a25.Z();
        byte[] v = zIVar.v(c, iZL.v("key", K2, K, Z), Z);
        a25.v();
        byte[] v2 = zIVar.v(c, iZL.v("base_nonce", K2, K, 12), 12);
        a25.v();
        BigInteger bigInteger = BigInteger.ONE;
        b0d b0d = new b0d(bArr3, v, v2, bigInteger.shiftLeft(96).subtract(bigInteger), a25);
        byte[] bArr8 = R;
        synchronized (b0d) {
            R2 = b0d.R();
            if (b0d.f1503v.compareTo(b0d.f1501R) < 0) {
                b0d.f1503v = b0d.f1503v.add(bigInteger);
            } else {
                throw new GeneralSecurityException("message limit reached");
            }
        }
        return cpc.K(bArr3, b0d.R.O(v, R2, bArr, bArr8));
    }
}
