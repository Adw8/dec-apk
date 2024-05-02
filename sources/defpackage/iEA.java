package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: iEA  reason: default package */
/* loaded from: classes.dex */
public final class iEA implements iQG {
    public static final byte[] v = new byte[0];
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final h89 f4490R;

    /* renamed from: R  reason: collision with other field name */
    public final String f4491R;

    /* renamed from: R  reason: collision with other field name */
    public final nul f4492R;

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f4493R;

    public iEA(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, nul nul) {
        hDC.O(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f4490R = new h89(29, eCPublicKey);
        this.f4493R = bArr;
        this.f4491R = str;
        this.R = i;
        this.f4492R = nul;
    }

    @Override // defpackage.iQG
    public final byte[] R(byte[] bArr, byte[] bArr2) {
        h5 h5Var;
        h89 h89 = this.f4490R;
        String str = this.f4491R;
        byte[] bArr3 = this.f4493R;
        int i = this.f4492R.R;
        int i2 = this.R;
        KeyPair U = hDC.U(((ECPublicKey) h89.R).getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) U.getPublic();
        byte[] Z = hDC.Z((ECPrivateKey) U.getPrivate(), (ECPublicKey) h89.R);
        byte[] A = hDC.A(eCPublicKey.getParams().getCurve(), i2, eCPublicKey.getW());
        int i3 = 1;
        byte[] K = cpc.K(A, Z);
        Mac mac = (Mac) aXa.v.R(str);
        if (i <= mac.getMacLength() * 255) {
            if (bArr3 == null || bArr3.length == 0) {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            } else {
                mac.init(new SecretKeySpec(bArr3, str));
            }
            byte[] bArr4 = new byte[i];
            mac.init(new SecretKeySpec(mac.doFinal(K), str));
            byte[] bArr5 = new byte[0];
            int i4 = 0;
            while (true) {
                mac.update(bArr5);
                mac.update(bArr2);
                mac.update((byte) i3);
                bArr5 = mac.doFinal();
                if (bArr5.length + i4 >= i) {
                    break;
                }
                System.arraycopy(bArr5, 0, bArr4, i4, bArr5.length);
                i4 += bArr5.length;
                i3++;
            }
            System.arraycopy(bArr5, 0, bArr4, i4, i - i4);
            nE R = nE.R(A);
            nE R2 = nE.R(bArr4);
            nul nul = this.f4492R;
            byte[] bArr6 = R2.R;
            int length = bArr6.length;
            byte[] bArr7 = new byte[length];
            System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
            nul.getClass();
            if (length == nul.R) {
                if (((String) nul.f6626R).equals(ym.v)) {
                    UT i5 = rm.i();
                    i5.O((rm) nul.f6627v);
                    MH H = b0.H(bArr7, 0, nul.R);
                    i5.X();
                    rm.g((rm) i5.v, H);
                    h5Var = new h5((rg) kWP.c((String) nul.f6626R, (rm) i5.v(), rg.class));
                } else if (((String) nul.f6626R).equals(ym.R)) {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr7, 0, nul.v);
                    byte[] copyOfRange2 = Arrays.copyOfRange(bArr7, nul.v, nul.R);
                    aw K2 = Sb.K();
                    K2.O(((WX) nul.c).t());
                    MH c = b0.c(copyOfRange);
                    K2.X();
                    Sb.y((Sb) K2.v, c);
                    iPH K3 = p4q.K();
                    K3.O(((WX) nul.c).i());
                    MH c2 = b0.c(copyOfRange2);
                    K3.X();
                    p4q.y((p4q) K3.v, c2);
                    rV o = WX.o();
                    int V = ((WX) nul.c).V();
                    o.X();
                    WX.j((WX) o.v, V);
                    o.X();
                    WX.g((WX) o.v, (Sb) K2.v());
                    o.X();
                    WX.y((WX) o.v, (p4q) K3.v());
                    h5Var = new h5((rg) kWP.c((String) nul.f6626R, (WX) o.v(), rg.class));
                } else if (((String) nul.f6626R).equals(nKz.R)) {
                    C8 i6 = nc.i();
                    i6.O((nc) nul.e);
                    MH H2 = b0.H(bArr7, 0, nul.R);
                    i6.X();
                    nc.g((nc) i6.v, H2);
                    h5Var = new h5((mZ_) kWP.c((String) nul.f6626R, (nc) i6.v(), mZ_.class));
                } else {
                    throw new GeneralSecurityException("unknown DEM key type");
                }
                byte[] bArr8 = v;
                rg rgVar = (rg) h5Var.R;
                byte[] R3 = rgVar != null ? rgVar.R(bArr, bArr8) : ((mZ_) h5Var.v).v(bArr, bArr8);
                byte[] bArr9 = R.R;
                int length2 = bArr9.length;
                byte[] bArr10 = new byte[length2];
                System.arraycopy(bArr9, 0, bArr10, 0, bArr9.length);
                return ByteBuffer.allocate(length2 + R3.length).put(bArr10).put(R3).array();
            }
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        throw new GeneralSecurityException("size too large");
    }
}
