package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: _0  reason: default package */
/* loaded from: classes.dex */
public final class _0 extends k8G implements kg9 {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ _0(int i, Object obj) {
        super(1);
        this.X = i;
        this.R = obj;
    }

    public final nRn R() {
        switch (this.X) {
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                return new acE(0, (nm1) this.R);
            case 16:
                return new acE(2, (fBS) this.R);
            default:
                return new acE(5, (fJK) this.R);
        }
    }

    public final Float c(float f) {
        oFh ofh;
        oFh ofh2;
        boolean z = true;
        boolean z2 = false;
        float f2 = 0.0f;
        switch (this.X) {
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                hNI hni = (hNI) this.R;
                float X = ((float) ((hNI) this.R).X()) + f + hni.f4219R;
                float m = caw.m(X, 0.0f, (float) ((Number) hni.v.getValue()).intValue());
                if (X != m) {
                    z = false;
                }
                boolean z3 = !z;
                float X2 = m - ((float) ((hNI) this.R).X());
                int t = mLz.t(X2);
                hNI hni2 = (hNI) this.R;
                hni2.f4221R.R(Integer.valueOf(hni2.X() + t));
                ((hNI) this.R).f4219R = X2 - ((float) t);
                if (z3) {
                    f = X2;
                }
                return Float.valueOf(f);
            case 10:
                oey oey = (oey) this.R;
                f2 = -f;
                if ((f2 >= 0.0f || oey.f6885e) && (f2 <= 0.0f || oey.f6884c)) {
                    if (Math.abs(oey.f6872R) <= 0.5f) {
                        float f3 = oey.f6872R + f2;
                        oey.f6872R = f3;
                        if (Math.abs(f3) > 0.5f) {
                            float f4 = oey.f6872R;
                            owG owg = (owG) oey.c.getValue();
                            if (owg != null) {
                                owg.R();
                            }
                            boolean z4 = oey.f6883R;
                            if (z4) {
                                float f5 = f4 - oey.f6872R;
                                if (z4) {
                                    b9a L = oey.L();
                                    if (!L.L().isEmpty()) {
                                        boolean z5 = f5 < 0.0f;
                                        int i = z5 ? ((iFC) dF.zw(L.L())).v + 1 : ((iFC) dF.b(L.L())).v - 1;
                                        if (i != oey.f6873R) {
                                            if (i >= 0 && i < L.O()) {
                                                z2 = true;
                                            }
                                            if (z2) {
                                                if (!(oey.f6886v == z5 || (ofh2 = oey.f6880R) == null)) {
                                                    ofh2.cancel();
                                                }
                                                oey.f6886v = z5;
                                                oey.f6873R = i;
                                                gL6 gl6 = oey.f6877R;
                                                long j = ((oys) oey.X.getValue()).f7046R;
                                                owT owt = (owT) ((h0T) gl6.R).getValue();
                                                if (owt != null) {
                                                    g7C g7c = (g7C) owt;
                                                    ofh = new b69(i, j);
                                                    g7c.f3679R.v(ofh);
                                                    if (!g7c.f3683R) {
                                                        g7c.f3683R = true;
                                                        g7c.f3678R.post(g7c);
                                                    }
                                                } else {
                                                    ofh = hw1.e;
                                                }
                                                oey.f6880R = ofh;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (Math.abs(oey.f6872R) > 0.5f) {
                            f2 -= oey.f6872R;
                            oey.f6872R = 0.0f;
                        }
                    } else {
                        StringBuilder U = opT.U("entered drag with non-zero pending scroll: ");
                        U.append(oey.f6872R);
                        throw new IllegalStateException(U.toString().toString());
                    }
                }
                return Float.valueOf(-f2);
            default:
                float R = ((ceM) this.R).R() + f;
                if (R > ((Number) ((ceM) this.R).v.getValue()).floatValue()) {
                    f = ((Number) ((ceM) this.R).v.getValue()).floatValue() - ((ceM) this.R).R();
                } else if (R < 0.0f) {
                    f = -((ceM) this.R).R();
                }
                ceM cem = (ceM) this.R;
                cem.f2170R.R(Float.valueOf(cem.R() + f));
                return Float.valueOf(f);
        }
    }

    public final void e(fiv fiv) {
        switch (this.X) {
            case 4:
                ((nhg) this.R).c(o8s.R);
                return;
            default:
                ((m2X) this.R).f5893R.R(fiv);
                return;
        }
    }

    public final nKE v(cyg cyg) {
        aMr amr = aMr.PostExit;
        aMr amr2 = aMr.Visible;
        aMr amr3 = aMr.PreEnter;
        switch (this.X) {
            case 1:
                nKE nke = null;
                if (cyg.R(amr3, amr2)) {
                    jo joVar = (jo) ((mC9) this.R).f5978R.getValue();
                    if (joVar != null) {
                        nke = joVar.f5028R;
                    }
                } else if (cyg.R(amr2, amr)) {
                    jo joVar2 = (jo) ((mC9) this.R).f5980v.getValue();
                    if (joVar2 != null) {
                        nke = joVar2.f5028R;
                    }
                } else {
                    nke = nf2.c;
                }
                return nke == null ? nf2.c : nke;
            default:
                if (cyg.R(amr3, amr2)) {
                    jQ.Y(((geT) this.R).f3833R.getValue());
                    return nf2.v;
                } else if (!cyg.R(amr2, amr)) {
                    return nf2.v;
                } else {
                    jQ.Y(((geT) this.R).v.getValue());
                    return nf2.v;
                }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v13, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kg9
    public final Object x(Object obj) {
        int i = 0;
        switch (this.X) {
            case 0:
                oO oOVar = (oO) obj;
                double d = (double) 3.0f;
                float pow = (float) Math.pow((double) oOVar.v, d);
                float pow2 = (float) Math.pow((double) oOVar.c, d);
                float pow3 = (float) Math.pow((double) oOVar.e, d);
                float[] fArr = pdD.f7138v;
                return new n3(n3.R(aH9.e(caw.m(pdD.L(0, pow, pow2, pow3, fArr), -2.0f, 2.0f), caw.m(pdD.L(1, pow, pow2, pow3, fArr), -2.0f, 2.0f), caw.m(pdD.L(2, pow, pow2, pow3, fArr), -2.0f, 2.0f), caw.m(oOVar.R, 0.0f, 1.0f), K6.f228R), (u_) this.R));
            case 1:
                return v((cyg) obj);
            case 2:
                return v((cyg) obj);
            case 3:
                cX2 cx2 = (cX2) obj;
                if (((a_n) ((i2A) ((px0) this.R)).R.getValue()).R == 1) {
                    i = 1;
                }
                cx2.f2125R = i ^ 1;
                return o8s.R;
            case 4:
                e((fiv) obj);
                return o8s.R;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return c(((Number) obj).floatValue());
            case 6:
                ((h6T) this.R).f4050R = (hjM) obj;
                return o8s.R;
            case 7:
            case VmNativeCallback.$stable /* 8 */:
            case 9:
            case 13:
            case 14:
            case 19:
            case 20:
            case 24:
            case 25:
            default:
                Throwable th = (Throwable) obj;
                lAs las = (lAs) this.R;
                k0 k0Var = las.f5607R;
                if (k0Var != null) {
                    ((xx) k0Var).H(th);
                }
                las.f5607R = null;
                return o8s.R;
            case 10:
                return c(((Number) obj).floatValue());
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                dlc dlc = (dlc) obj;
                return R();
            case 12:
                int L = ((cRR) this.R).L();
                while (true) {
                    if (i >= L) {
                        i = -1;
                    } else if (!n3x.v(((cRR) this.R).v(i), obj)) {
                        i++;
                    }
                }
                return Integer.valueOf(i);
            case 15:
                b_t b_t = onS.U;
                icv icv = onS.f6950R[15];
                b_t.R((bNL) obj, (aJk) this.R);
                return o8s.R;
            case 16:
                dlc dlc2 = (dlc) obj;
                return R();
            case 17:
                return c(((Number) obj).floatValue());
            case 18:
                jJj jjj = (jJj) obj;
                return new aWo(((aWo) ((f_c) this.R).g()).f906R);
            case 21:
                ((lqA) this.R).c(((Number) ((Hd) obj).v()).floatValue());
                return o8s.R;
            case 22:
                jE4 je4 = (jE4) this.R;
                if (!je4.f4864R) {
                    synchronized (je4.f4859R) {
                        je4.f4863R.c(obj);
                    }
                }
                return o8s.R;
            case 23:
                pi1 pi1 = (pi1) obj;
                if (n3x.v(pi1, (pi1) this.R)) {
                    return Boolean.FALSE;
                }
                if (pi1.f7194R != null) {
                    msU.cE(pi1);
                    return Boolean.TRUE;
                }
                throw new IllegalStateException("Focus search landed at the root.".toString());
            case 26:
                e((fiv) obj);
                return o8s.R;
            case 27:
                dlc dlc3 = (dlc) obj;
                return R();
        }
    }
}
