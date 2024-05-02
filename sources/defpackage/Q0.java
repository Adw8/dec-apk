package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: Q0  reason: default package */
/* loaded from: classes.dex */
public final class Q0 extends Dd {
    public final /* synthetic */ int R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(int i) {
        super(p4q.class, new lNJ[]{new eF(gwO.class, 15)});
        this.R = i;
        switch (i) {
            case 1:
                super(Sb.class, new lNJ[]{new eF(oYA.class, 1)});
                return;
            case 2:
                super(E1.class, new lNJ[]{new eF(rg.class, 2)});
                return;
            case 3:
                super(rm.class, new lNJ[]{new eF(rg.class, 3)});
                return;
            case 4:
                super(Da.class, new lNJ[]{new eF(rg.class, 4)});
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                super(D1.class, new lNJ[]{new eF(rg.class, 5)});
                return;
            case 6:
                super(kda.class, new lNJ[]{new eF(rg.class, 6)});
                return;
            case 7:
                super(olG.class, new lNJ[]{new eF(rg.class, 7)});
                return;
            case VmNativeCallback.$stable /* 8 */:
                super(iMQ.class, new lNJ[]{new eF(rg.class, 8)});
                return;
            case 9:
                super(nc.class, new lNJ[]{new eF(mZ_.class, 9)});
                return;
            case 10:
                super(hDg.class, new lNJ[]{new eF(iQG.class, 11)});
                return;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                super(fWO.class, new lNJ[]{new eF(iQG.class, 13)});
                return;
            case 12:
                super(pA.class, new lNJ[]{new eF(gwO.class, 14)});
                return;
            case 13:
                return;
            default:
                super(WX.class, new lNJ[]{new eF(rg.class, 0)});
                return;
        }
    }

    public static void A(pzg pzg) {
        if (pzg.i() >= 10) {
            int ordinal = pzg.t().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (pzg.i() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (pzg.i() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (pzg.i() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (pzg.i() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (pzg.i() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public static jeE I(int i, int i2) {
        Mq y = ui.y();
        y.X();
        ui.j((ui) y.v, i);
        return new jeE((ui) y.v(), i2);
    }

    public static jeE J(int i, int i2) {
        nM i3 = _u.i();
        i3.X();
        _u.g((_u) i3.v, i);
        _O t = oC.t();
        t.X();
        oC.j((oC) t.v);
        i3.X();
        _u.j((_u) i3.v, (oC) t.v());
        return new jeE((_u) i3.v(), i2);
    }

    public static void Q(X0 x0) {
        if (x0.y() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (x0.y() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public static jeE Y(int i, int i2, int i3) {
        clj clj = clj.SHA256;
        Nn V = zL.V();
        iI t = N2.t();
        t.X();
        N2.j((N2) t.v);
        V.X();
        zL.j((zL) V.v, (N2) t.v());
        V.X();
        zL.g((zL) V.v, i);
        dfC V2 = mKX.V();
        bHr V3 = pzg.V();
        V3.X();
        pzg.j((pzg) V3.v, clj);
        V3.X();
        pzg.g((pzg) V3.v, i2);
        V2.X();
        mKX.j((mKX) V2.v, (pzg) V3.v());
        V2.X();
        mKX.g((mKX) V2.v, 32);
        vl i4 = _x.i();
        i4.X();
        _x.j((_x) i4.v, (zL) V.v());
        i4.X();
        _x.g((_x) i4.v, (mKX) V2.v());
        return new jeE((_x) i4.v(), i3);
    }

    public static jeE h(int i, int i2) {
        G1 y = L3.y();
        y.X();
        L3.j((L3) y.v, i);
        return new jeE((L3) y.v(), i2);
    }

    public static void n(p4q p4q) {
        d_i.c(p4q.o());
        if (p4q.i().size() >= 16) {
            A(p4q.V());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public static jeE u(int i, int i2, clj clj, int i3) {
        dfC V = mKX.V();
        bHr V2 = pzg.V();
        V2.X();
        pzg.j((pzg) V2.v, clj);
        V2.X();
        pzg.g((pzg) V2.v, i2);
        V.X();
        mKX.j((mKX) V.v, (pzg) V2.v());
        V.X();
        mKX.g((mKX) V.v, i);
        return new jeE((mKX) V.v(), i3);
    }

    @Override // defpackage.Dd
    public final void K(qN qNVar) {
        switch (this.R) {
            case 0:
                WX wx = (WX) qNVar;
                d_i.c(wx.V());
                new Q0(1);
                Sb t = wx.t();
                d_i.c(t.o());
                d_i.R(t.i().size());
                N2 V = t.V();
                if (V.y() < 12 || V.y() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                new Q0(13);
                n(wx.i());
                return;
            case 1:
                Sb sb = (Sb) qNVar;
                d_i.c(sb.o());
                d_i.R(sb.i().size());
                N2 V2 = sb.V();
                if (V2.y() < 12 || V2.y() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                return;
            case 2:
                E1 e1 = (E1) qNVar;
                d_i.c(e1.V());
                d_i.R(e1.t().size());
                if (e1.i().y() != 12 && e1.i().y() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 3:
                rm rmVar = (rm) qNVar;
                d_i.c(rmVar.t());
                d_i.R(rmVar.y().size());
                return;
            case 4:
                Da da = (Da) qNVar;
                d_i.c(da.t());
                d_i.R(da.y().size());
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                D1 d1 = (D1) qNVar;
                d_i.c(d1.t());
                if (d1.y().size() != 32) {
                    throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
                }
                return;
            case 6:
                d_i.c(((kda) qNVar).t());
                return;
            case 7:
                d_i.c(((olG) qNVar).t());
                return;
            case VmNativeCallback.$stable /* 8 */:
                iMQ imq = (iMQ) qNVar;
                d_i.c(imq.t());
                if (imq.y().size() != 32) {
                    throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
                }
                return;
            case 9:
                nc ncVar = (nc) qNVar;
                d_i.c(ncVar.t());
                if (ncVar.y().size() != 64) {
                    StringBuilder U = opT.U("invalid key size: ");
                    U.append(ncVar.y().size());
                    U.append(". Valid keys must have ");
                    U.append(64);
                    U.append(" bytes.");
                    throw new InvalidKeyException(U.toString());
                }
                return;
            case 10:
                hDg hdg = (hDg) qNVar;
                d_i.c(hdg.o());
                hDC.E(hdg.V());
                return;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                fWO fwo = (fWO) qNVar;
                d_i.c(fwo.o());
                if (fwo.K()) {
                    iZL.c(fwo.i());
                    return;
                }
                throw new GeneralSecurityException("Missing HPKE key params.");
            case 12:
                pA pAVar = (pA) qNVar;
                d_i.c(pAVar.V());
                if (pAVar.t().size() == 32) {
                    Q(pAVar.i());
                    return;
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            default:
                n((p4q) qNVar);
                return;
        }
    }

    @Override // defpackage.Dd
    public final String P() {
        switch (this.R) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesCtrKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 6:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 7:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            case VmNativeCallback.$stable /* 8 */:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
            case 9:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
            case 10:
                return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
            case 12:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            default:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
        }
    }

    @Override // defpackage.Dd
    public final qN i(b0 b0Var) {
        switch (this.R) {
            case 0:
                return WX.K(b0Var, nCG.R());
            case 1:
                return Sb.J(b0Var, nCG.R());
            case 2:
                return E1.K(b0Var, nCG.R());
            case 3:
                return rm.V(b0Var, nCG.R());
            case 4:
                return Da.V(b0Var, nCG.R());
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return D1.V(b0Var, nCG.R());
            case 6:
                return kda.V(b0Var, nCG.R());
            case 7:
                return olG.V(b0Var, nCG.R());
            case VmNativeCallback.$stable /* 8 */:
                return iMQ.V(b0Var, nCG.R());
            case 9:
                return nc.V(b0Var, nCG.R());
            case 10:
                return hDg.h(b0Var, nCG.R());
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                return fWO.Y(b0Var, nCG.R());
            case 12:
                return pA.K(b0Var, nCG.R());
            default:
                return p4q.J(b0Var, nCG.R());
        }
    }

    @Override // defpackage.Dd
    public final f6h t() {
        f6h f6h = f6h.ASYMMETRIC_PUBLIC;
        f6h f6h2 = f6h.REMOTE;
        f6h f6h3 = f6h.SYMMETRIC;
        switch (this.R) {
            case 6:
            case 7:
                return f6h2;
            case VmNativeCallback.$stable /* 8 */:
            case 9:
            default:
                return f6h3;
            case 10:
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                return f6h;
        }
    }

    @Override // defpackage.Dd
    public final imt y() {
        switch (this.R) {
            case 0:
                return new EP(this, _x.class, 0);
            case 1:
                return new EP(this, zL.class, 1);
            case 2:
                return new EP(this, _u.class, 2);
            case 3:
                return new EP(this, L3.class, 3);
            case 4:
                return new EP(this, ui.class, 4);
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return new EP(this, G7.class, 5);
            case 6:
                return new EP(this, nHi.class, 6);
            case 7:
                return new EP(this, fpu.class, 7);
            case VmNativeCallback.$stable /* 8 */:
                return new EP(this, dis.class, 8);
            case 9:
                return new EP(this, Ak.class, 9);
            case 10:
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
            default:
                super.y();
                throw null;
            case 12:
                return new EP(this, E9.class, 12);
            case 13:
                return new EP(this, mKX.class, 13);
        }
    }

    public final eqw z() {
        eDl edl = eqw.R;
        switch (this.R) {
            case 0:
            case 3:
            case 13:
                return edl;
            default:
                return eqw.f3215R;
        }
    }
}
