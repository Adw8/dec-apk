package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: EP  reason: default package */
/* loaded from: classes.dex */
public final class EP extends imt {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Dd f90R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EP(Dd dd, Class cls, int i) {
        super(cls);
        this.R = i;
        this.f90R = dd;
    }

    @Override // defpackage.imt
    public final void O(qN qNVar) {
        switch (this.R) {
            case 0:
                _x _xVar = (_x) qNVar;
                new Q0(1).y().O(_xVar.y());
                new Q0(13).y().O(_xVar.t());
                d_i.R(_xVar.y().t());
                return;
            case 1:
                zL zLVar = (zL) qNVar;
                d_i.R(zLVar.t());
                N2 i = zLVar.i();
                ((Q0) this.f90R).getClass();
                if (i.y() < 12 || i.y() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                return;
            case 2:
                _u _uVar = (_u) qNVar;
                d_i.R(_uVar.y());
                if (_uVar.t().y() != 12 && _uVar.t().y() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 3:
                d_i.R(((L3) qNVar).g());
                return;
            case 4:
                d_i.R(((ui) qNVar).g());
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                G7 g7 = (G7) qNVar;
                return;
            case 6:
                nHi nhi = (nHi) qNVar;
                return;
            case 7:
                fpu fpu = (fpu) qNVar;
                if (fpu.y().isEmpty() || !fpu.t()) {
                    throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
                }
                return;
            case VmNativeCallback.$stable /* 8 */:
                dis dis = (dis) qNVar;
                return;
            case 9:
                Ak ak = (Ak) qNVar;
                if (ak.g() != 64) {
                    StringBuilder U = opT.U("invalid key size: ");
                    U.append(ak.g());
                    U.append(". Valid keys must have ");
                    U.append(64);
                    U.append(" bytes.");
                    throw new InvalidAlgorithmParameterException(U.toString());
                }
                return;
            case 10:
                hDC.E(((ge4) qNVar).g());
                return;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                iZL.c(((jey) qNVar).g());
                return;
            case 12:
                E9 e9 = (E9) qNVar;
                Q0.Q(e9.t());
                if (e9.y() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                return;
            default:
                mKX mkx = (mKX) qNVar;
                if (mkx.t() >= 16) {
                    Q0.A(mkx.i());
                    return;
                }
                throw new GeneralSecurityException("key too short");
        }
    }

    @Override // defpackage.imt
    public final csA R(qN qNVar) {
        switch (this.R) {
            case 0:
                _x _xVar = (_x) qNVar;
                rV o = WX.o();
                o.X();
                WX.g((WX) o.v, (Sb) new Q0(1).y().R(_xVar.y()));
                o.X();
                WX.y((WX) o.v, (p4q) new Q0(13).y().R(_xVar.t()));
                ((Q0) this.f90R).getClass();
                o.X();
                WX.j((WX) o.v, 0);
                return (WX) o.v();
            case 1:
                zL zLVar = (zL) qNVar;
                aw K = Sb.K();
                N2 i = zLVar.i();
                K.X();
                Sb.g((Sb) K.v, i);
                byte[] R = opU.R(zLVar.t());
                MH H = b0.H(R, 0, R.length);
                K.X();
                Sb.y((Sb) K.v, H);
                ((Q0) this.f90R).getClass();
                K.X();
                Sb.j((Sb) K.v);
                return (Sb) K.v();
            case 2:
                _u _uVar = (_u) qNVar;
                YO o2 = E1.o();
                byte[] R2 = opU.R(_uVar.y());
                MH H2 = b0.H(R2, 0, R2.length);
                o2.X();
                E1.y((E1) o2.v, H2);
                oC t = _uVar.t();
                o2.X();
                E1.g((E1) o2.v, t);
                ((Q0) this.f90R).getClass();
                o2.X();
                E1.j((E1) o2.v);
                return (E1) o2.v();
            case 3:
                UT i2 = rm.i();
                byte[] R3 = opU.R(((L3) qNVar).g());
                MH H3 = b0.H(R3, 0, R3.length);
                i2.X();
                rm.g((rm) i2.v, H3);
                ((Q0) this.f90R).getClass();
                i2.X();
                rm.j((rm) i2.v);
                return (rm) i2.v();
            case 4:
                D0 i3 = Da.i();
                byte[] R4 = opU.R(((ui) qNVar).g());
                MH H4 = b0.H(R4, 0, R4.length);
                i3.X();
                Da.g((Da) i3.v, H4);
                ((Q0) this.f90R).getClass();
                i3.X();
                Da.j((Da) i3.v);
                return (Da) i3.v();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                G7 g7 = (G7) qNVar;
                Ns i4 = D1.i();
                ((Q0) this.f90R).getClass();
                i4.X();
                D1.j((D1) i4.v);
                byte[] R5 = opU.R(32);
                MH H5 = b0.H(R5, 0, R5.length);
                i4.X();
                D1.g((D1) i4.v, H5);
                return (D1) i4.v();
            case 6:
                bTL i5 = kda.i();
                i5.X();
                kda.g((kda) i5.v, (nHi) qNVar);
                ((Q0) this.f90R).getClass();
                i5.X();
                kda.j((kda) i5.v);
                return (kda) i5.v();
            case 7:
                gB0 i6 = olG.i();
                i6.X();
                olG.g((olG) i6.v, (fpu) qNVar);
                ((Q0) this.f90R).getClass();
                i6.X();
                olG.j((olG) i6.v);
                return (olG) i6.v();
            case VmNativeCallback.$stable /* 8 */:
                dis dis = (dis) qNVar;
                cxd i7 = iMQ.i();
                ((Q0) this.f90R).getClass();
                i7.X();
                iMQ.j((iMQ) i7.v);
                byte[] R6 = opU.R(32);
                MH H6 = b0.H(R6, 0, R6.length);
                i7.X();
                iMQ.g((iMQ) i7.v, H6);
                return (iMQ) i7.v();
            case 9:
                C8 i8 = nc.i();
                byte[] R7 = opU.R(((Ak) qNVar).g());
                MH H7 = b0.H(R7, 0, R7.length);
                i8.X();
                nc.g((nc) i8.v, H7);
                ((Q0) this.f90R).getClass();
                i8.X();
                nc.j((nc) i8.v);
                return (nc) i8.v();
            case 10:
                ge4 ge4 = (ge4) qNVar;
                KeyPair U = hDC.U(hDC.P(hDC.p(ge4.g().o().t())));
                ECPoint w = ((ECPublicKey) U.getPublic()).getW();
                gEZ Y = hDg.Y();
                ((eQL) this.f90R).getClass();
                Y.X();
                hDg.j((hDg) Y.v);
                jhs g = ge4.g();
                Y.X();
                hDg.g((hDg) Y.v, g);
                MH c = b0.c(w.getAffineX().toByteArray());
                Y.X();
                hDg.y((hDg) Y.v, c);
                MH c2 = b0.c(w.getAffineY().toByteArray());
                Y.X();
                hDg.t((hDg) Y.v, c2);
                koq o3 = apQ.o();
                ((eQL) this.f90R).getClass();
                o3.X();
                apQ.j((apQ) o3.v);
                o3.X();
                apQ.g((apQ) o3.v, (hDg) Y.v());
                MH c3 = b0.c(((ECPrivateKey) U.getPrivate()).getS().toByteArray());
                o3.X();
                apQ.y((apQ) o3.v, c3);
                return (apQ) o3.v();
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                byte[] j = vd.j();
                byte[] z = vd.z(j);
                g1r J = fWO.J();
                ((dXD) this.f90R).getClass();
                J.X();
                fWO.j((fWO) J.v);
                iVb g2 = ((jey) qNVar).g();
                J.X();
                fWO.g((fWO) J.v, g2);
                MH H8 = b0.H(z, 0, 32);
                J.X();
                fWO.y((fWO) J.v, H8);
                cz5 K2 = lDz.K();
                ((dXD) this.f90R).getClass();
                K2.X();
                lDz.j((lDz) K2.v);
                K2.X();
                lDz.g((lDz) K2.v, (fWO) J.v());
                MH H9 = b0.H(j, 0, j.length);
                K2.X();
                lDz.y((lDz) K2.v, H9);
                return (lDz) K2.v();
            case 12:
                E9 e9 = (E9) qNVar;
                kx o4 = pA.o();
                o4.X();
                pA.j((pA) o4.v);
                byte[] R8 = opU.R(e9.y());
                MH H10 = b0.H(R8, 0, R8.length);
                o4.X();
                pA.g((pA) o4.v, H10);
                X0 t2 = e9.t();
                o4.X();
                pA.y((pA) o4.v, t2);
                return (pA) o4.v();
            default:
                mKX mkx = (mKX) qNVar;
                iPH K3 = p4q.K();
                ((Q0) this.f90R).getClass();
                K3.X();
                p4q.j((p4q) K3.v);
                pzg i9 = mkx.i();
                K3.X();
                p4q.g((p4q) K3.v, i9);
                byte[] R9 = opU.R(mkx.t());
                MH H11 = b0.H(R9, 0, R9.length);
                K3.X();
                p4q.y((p4q) K3.v, H11);
                return (p4q) K3.v();
        }
    }

    @Override // defpackage.imt
    public final csA X(b0 b0Var) {
        switch (this.R) {
            case 0:
                return _x.V(b0Var, nCG.R());
            case 1:
                return zL.o(b0Var, nCG.R());
            case 2:
                return _u.V(b0Var, nCG.R());
            case 3:
                return L3.t(b0Var, nCG.R());
            case 4:
                return ui.t(b0Var, nCG.R());
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return G7.g(b0Var, nCG.R());
            case 6:
                return nHi.y(b0Var, nCG.R());
            case 7:
                return fpu.i(b0Var, nCG.R());
            case VmNativeCallback.$stable /* 8 */:
                return dis.g(b0Var, nCG.R());
            case 9:
                return Ak.t(b0Var, nCG.R());
            case 10:
                return ge4.t(b0Var, nCG.R());
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                return jey.t(b0Var, nCG.R());
            case 12:
                return E9.V(b0Var, nCG.R());
            default:
                return mKX.o(b0Var, nCG.R());
        }
    }

    @Override // defpackage.imt
    public final Map e() {
        clj clj = clj.SHA256;
        switch (this.R) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("AES128_CTR_HMAC_SHA256", Q0.Y(16, 16, 1));
                hashMap.put("AES128_CTR_HMAC_SHA256_RAW", Q0.Y(16, 16, 3));
                hashMap.put("AES256_CTR_HMAC_SHA256", Q0.Y(32, 32, 1));
                hashMap.put("AES256_CTR_HMAC_SHA256_RAW", Q0.Y(32, 32, 3));
                return Collections.unmodifiableMap(hashMap);
            case 1:
            case 6:
            case 7:
            default:
                return Collections.emptyMap();
            case 2:
                HashMap hashMap2 = new HashMap();
                hashMap2.put("AES128_EAX", Q0.J(16, 1));
                hashMap2.put("AES128_EAX_RAW", Q0.J(16, 3));
                hashMap2.put("AES256_EAX", Q0.J(32, 1));
                hashMap2.put("AES256_EAX_RAW", Q0.J(32, 3));
                return Collections.unmodifiableMap(hashMap2);
            case 3:
                HashMap hashMap3 = new HashMap();
                hashMap3.put("AES128_GCM", Q0.h(16, 1));
                hashMap3.put("AES128_GCM_RAW", Q0.h(16, 3));
                hashMap3.put("AES256_GCM", Q0.h(32, 1));
                hashMap3.put("AES256_GCM_RAW", Q0.h(32, 3));
                return Collections.unmodifiableMap(hashMap3);
            case 4:
                HashMap hashMap4 = new HashMap();
                hashMap4.put("AES128_GCM_SIV", Q0.I(16, 1));
                hashMap4.put("AES128_GCM_SIV_RAW", Q0.I(16, 3));
                hashMap4.put("AES256_GCM_SIV", Q0.I(32, 1));
                hashMap4.put("AES256_GCM_SIV_RAW", Q0.I(32, 3));
                return Collections.unmodifiableMap(hashMap4);
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                HashMap hashMap5 = new HashMap();
                hashMap5.put("CHACHA20_POLY1305", new jeE(G7.j(), 1));
                hashMap5.put("CHACHA20_POLY1305_RAW", new jeE(G7.j(), 3));
                return Collections.unmodifiableMap(hashMap5);
            case VmNativeCallback.$stable /* 8 */:
                HashMap hashMap6 = new HashMap();
                hashMap6.put("XCHACHA20_POLY1305", new jeE(dis.j(), 1));
                hashMap6.put("XCHACHA20_POLY1305_RAW", new jeE(dis.j(), 3));
                return Collections.unmodifiableMap(hashMap6);
            case 9:
                HashMap hashMap7 = new HashMap();
                Ko y = Ak.y();
                y.X();
                Ak.j((Ak) y.v);
                hashMap7.put("AES256_SIV", new jeE((Ak) y.v(), 1));
                Ko y2 = Ak.y();
                y2.X();
                Ak.j((Ak) y2.v);
                hashMap7.put("AES256_SIV_RAW", new jeE((Ak) y2.v(), 3));
                return Collections.unmodifiableMap(hashMap7);
            case 10:
                HashMap hashMap8 = new HashMap();
                ljd ljd = ljd.UNCOMPRESSED;
                lV8 z = cpc.z("AES128_GCM");
                byte[] bArr = eQL.R;
                hashMap8.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", eQL.J(ljd, z, bArr, 1));
                hashMap8.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", eQL.J(ljd, cpc.z("AES128_GCM"), bArr, 3));
                ljd ljd2 = ljd.COMPRESSED;
                hashMap8.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", eQL.J(ljd2, cpc.z("AES128_GCM"), bArr, 1));
                hashMap8.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", eQL.J(ljd2, cpc.z("AES128_GCM"), bArr, 3));
                hashMap8.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", eQL.J(ljd2, cpc.z("AES128_GCM"), bArr, 3));
                hashMap8.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", eQL.J(ljd, cpc.z("AES128_CTR_HMAC_SHA256"), bArr, 1));
                hashMap8.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", eQL.J(ljd, cpc.z("AES128_CTR_HMAC_SHA256"), bArr, 3));
                hashMap8.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", eQL.J(ljd2, cpc.z("AES128_CTR_HMAC_SHA256"), bArr, 1));
                hashMap8.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", eQL.J(ljd2, cpc.z("AES128_CTR_HMAC_SHA256"), bArr, 3));
                return Collections.unmodifiableMap(hashMap8);
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                HashMap hashMap9 = new HashMap();
                inw inw = inw.DHKEM_X25519_HKDF_SHA256;
                oiA oia = oiA.HKDF_SHA256;
                ow2 ow2 = ow2.AES_128_GCM;
                hashMap9.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", dXD.J(inw, oia, ow2, 1));
                hashMap9.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", dXD.J(inw, oia, ow2, 3));
                ow2 ow22 = ow2.AES_256_GCM;
                hashMap9.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", dXD.J(inw, oia, ow22, 1));
                hashMap9.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", dXD.J(inw, oia, ow22, 3));
                ow2 ow23 = ow2.CHACHA20_POLY1305;
                hashMap9.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", dXD.J(inw, oia, ow23, 1));
                hashMap9.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", dXD.J(inw, oia, ow23, 3));
                inw inw2 = inw.DHKEM_P256_HKDF_SHA256;
                hashMap9.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", dXD.J(inw2, oia, ow2, 1));
                hashMap9.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", dXD.J(inw2, oia, ow2, 3));
                hashMap9.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", dXD.J(inw2, oia, ow22, 1));
                hashMap9.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", dXD.J(inw2, oia, ow22, 3));
                inw inw3 = inw.DHKEM_P384_HKDF_SHA384;
                oiA oia2 = oiA.HKDF_SHA384;
                hashMap9.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", dXD.J(inw3, oia2, ow2, 1));
                hashMap9.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", dXD.J(inw3, oia2, ow2, 3));
                hashMap9.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", dXD.J(inw3, oia2, ow22, 1));
                hashMap9.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", dXD.J(inw3, oia2, ow22, 3));
                inw inw4 = inw.DHKEM_P521_HKDF_SHA512;
                oiA oia3 = oiA.HKDF_SHA512;
                hashMap9.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", dXD.J(inw4, oia3, ow2, 1));
                hashMap9.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", dXD.J(inw4, oia3, ow2, 3));
                hashMap9.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", dXD.J(inw4, oia3, ow22, 1));
                hashMap9.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", dXD.J(inw4, oia3, ow22, 3));
                return Collections.unmodifiableMap(hashMap9);
            case 12:
                HashMap hashMap10 = new HashMap();
                eE i = E9.i();
                i.X();
                E9.j((E9) i.v);
                Yc t = X0.t();
                t.X();
                X0.j((X0) t.v);
                i.X();
                E9.g((E9) i.v, (X0) t.v());
                hashMap10.put("AES_CMAC", new jeE((E9) i.v(), 1));
                eE i2 = E9.i();
                i2.X();
                E9.j((E9) i2.v);
                Yc t2 = X0.t();
                t2.X();
                X0.j((X0) t2.v);
                i2.X();
                E9.g((E9) i2.v, (X0) t2.v());
                hashMap10.put("AES256_CMAC", new jeE((E9) i2.v(), 1));
                eE i3 = E9.i();
                i3.X();
                E9.j((E9) i3.v);
                Yc t3 = X0.t();
                t3.X();
                X0.j((X0) t3.v);
                i3.X();
                E9.g((E9) i3.v, (X0) t3.v());
                hashMap10.put("AES256_CMAC_RAW", new jeE((E9) i3.v(), 3));
                return Collections.unmodifiableMap(hashMap10);
            case 13:
                HashMap hashMap11 = new HashMap();
                hashMap11.put("HMAC_SHA256_128BITTAG", Q0.u(32, 16, clj, 1));
                hashMap11.put("HMAC_SHA256_128BITTAG_RAW", Q0.u(32, 16, clj, 3));
                hashMap11.put("HMAC_SHA256_256BITTAG", Q0.u(32, 32, clj, 1));
                hashMap11.put("HMAC_SHA256_256BITTAG_RAW", Q0.u(32, 32, clj, 3));
                clj clj2 = clj.SHA512;
                hashMap11.put("HMAC_SHA512_128BITTAG", Q0.u(64, 16, clj2, 1));
                hashMap11.put("HMAC_SHA512_128BITTAG_RAW", Q0.u(64, 16, clj2, 3));
                hashMap11.put("HMAC_SHA512_256BITTAG", Q0.u(64, 32, clj2, 1));
                hashMap11.put("HMAC_SHA512_256BITTAG_RAW", Q0.u(64, 32, clj2, 3));
                hashMap11.put("HMAC_SHA512_512BITTAG", Q0.u(64, 64, clj2, 1));
                hashMap11.put("HMAC_SHA512_512BITTAG_RAW", Q0.u(64, 64, clj2, 3));
                return Collections.unmodifiableMap(hashMap11);
        }
    }
}
