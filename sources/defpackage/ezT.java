package defpackage;

import dev.kdrag0n.virt.vm.ForwardedPort;
import dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel;
import dev.kdrag0n.virtcontainer.ui.settings.forward.PortForwardViewModel;
import dev.kdrag0n.virtcontainer.ui.settings.forward.create.PortForwardCreateViewModel;
import java.util.List;

/* renamed from: ezT  reason: default package */
/* loaded from: classes.dex */
public final class ezT extends k8G implements lR3 {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ezT(Object obj, Object obj2, Object obj3, int i) {
        super(3);
        this.X = i;
        this.R = obj;
        this.v = obj2;
        this.c = obj3;
    }

    public final void R(m88 m88, int i) {
        ky1 ky1;
        int i2;
        owM owm;
        switch (this.X) {
            case 2:
                if ((i & 81) == 16) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                aH9.m(gP1.N, new h31((OverviewViewModel) this.R, (b1n) this.v, (h0T) this.c, 10), null, gP1.P, null, false, null, null, null, m88, 3078, 500);
                return;
            case 3:
                if ((i & 81) == 16) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                aff aff = aff.R;
                float f = (float) 16;
                ncu mL = aH9.mL(adU.f942R, f);
                ky kyVar = dq.f2891v;
                dM_ dm_ = (dM_) this.R;
                ForwardedPort forwardedPort = (ForwardedPort) this.v;
                PortForwardViewModel portForwardViewModel = (PortForwardViewModel) this.c;
                jr_ jr_3 = (jr_) m88;
                jr_3.w(693286680);
                bF9 R = ktl.R(nA.R, kyVar, jr_3);
                jr_3.w(-1323940314);
                owM owm2 = lnF.X;
                jJj jjj = (jJj) jr_3.x(owm2);
                owM owm3 = lnF.H;
                mdz mdz = (mdz) jr_3.x(owm3);
                owM owm4 = lnF.P;
                bUo buo = (bUo) jr_3.x(owm4);
                h1U.R.getClass();
                fme fme = igT.R;
                dNH b = aH9.b(mL);
                if (jr_3.f5052R instanceof Su) {
                    jr_3.mL();
                    if (jr_3.f5050L) {
                        jr_3.H(fme);
                    } else {
                        jr_3.BF();
                    }
                    jr_3.f5078e = false;
                    ky1 ky12 = igT.c;
                    l6.p(jr_3, R, ky12);
                    ky1 ky13 = igT.v;
                    l6.p(jr_3, jjj, ky13);
                    ky1 ky14 = igT.e;
                    l6.p(jr_3, mdz, ky14);
                    ky1 ky15 = igT.X;
                    jQ.o(0, b, jQ.m(jr_3, buo, ky15, jr_3), jr_3, 2058660585, -678309503);
                    nAL nal = nAL.R;
                    if (dm_ == null || dm_.R == 0) {
                        owm = owm3;
                        ky1 = ky12;
                        jr_3.w(1215954534);
                        dTl.x(adU.Z(aff, (float) 32), jr_3, 6);
                        jr_3.g(false);
                        i2 = 6;
                    } else {
                        jr_3.w(1215954611);
                        owm = owm3;
                        ky1 = ky12;
                        gQc.X(iTI.g(dm_.R, jr_3), null, adU.Z(aff, (float) 32), null, null, 0.0f, null, jr_3, 440, 120);
                        jr_3.g(false);
                        i2 = 6;
                    }
                    dTl.x(adU.H(aff, f), jr_3, i2);
                    jr_3.w(-483455358);
                    bF9 R2 = VA.R(nA.f6330R, dq.f2881R, jr_3);
                    jr_3.w(-1323940314);
                    jJj jjj2 = (jJj) jr_3.x(owm2);
                    mdz mdz2 = (mdz) jr_3.x(owm);
                    bUo buo2 = (bUo) jr_3.x(owm4);
                    dNH b2 = aH9.b(aff);
                    if (jr_3.f5052R instanceof Su) {
                        jr_3.mL();
                        if (jr_3.f5050L) {
                            jr_3.H(fme);
                        } else {
                            jr_3.BF();
                        }
                        jr_3.f5078e = false;
                        jQ.o(0, b2, jQ.Z(jr_3, R2, ky1, jr_3, jjj2, ky13, jr_3, mdz2, ky14, jr_3, buo2, ky15, jr_3), jr_3, 2058660585, -1163856341);
                        String U = jQ.U("Port ", forwardedPort.R, " → ", forwardedPort.v);
                        owM owm5 = dB8.R;
                        g1c.c(U, null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, ((c_P) jr_3.x(owm5)).Z, jr_3, 0, 0, 32766);
                        jr_3.w(1215955106);
                        if (forwardedPort.f2733R) {
                            g1c.c("Open to other devices", null, ((E2) jr_3.x(_1.R)).P(), 0, null, null, null, 0, null, null, 0, 0, false, 0, null, ((c_P) jr_3.x(owm5)).H, jr_3, 6, 0, 32762);
                        }
                        jQ.K(jr_3, false, false, false, true);
                        jr_3.g(false);
                        jr_3.g(false);
                        dTl.x(kM4.R(nal), jr_3, 0);
                        g4x.e(new _c(portForwardViewModel, 23, forwardedPort), null, false, null, null, moa.v, jr_3, 196608, 30);
                        jQ.K(jr_3, false, false, true, false);
                        jr_3.g(false);
                        return;
                    }
                    l6.u();
                    throw null;
                }
                l6.u();
                throw null;
            default:
                if ((i & 81) == 16) {
                    jr_ jr_4 = (jr_) m88;
                    if (jr_4.J()) {
                        jr_4.E();
                        return;
                    }
                }
                lG0 lg0 = e1X.R;
                List<b1n> list = (List) ((dH9) this.R).getValue();
                if (list != null) {
                    PortForwardCreateViewModel portForwardCreateViewModel = (PortForwardCreateViewModel) this.v;
                    h0T h0t = (h0T) this.c;
                    for (b1n b1n : list) {
                        aH9.m(aH9.I(m88, 1055100860, new bkx(18, b1n)), new h31(portForwardCreateViewModel, b1n, h0t, 12), null, null, null, false, null, oyV.R, null, m88, 6, 380);
                    }
                    return;
                }
                return;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                Su su = (Su) obj;
                mdh mdh = (mdh) obj2;
                h1W h1w = (h1W) obj3;
                List list = (List) this.c;
                mdh H = ((mq9) this.R).H();
                try {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((lR3) list.get(i)).y(su, H, h1w);
                    }
                    H.O();
                    mdh.X();
                    mq9 mq9 = (mq9) this.R;
                    WB wb = (WB) this.v;
                    wb.getClass();
                    mdh.V(mq9, mq9.v(wb));
                    mdh.x();
                    break;
                } catch (Throwable th) {
                    H.O();
                    throw th;
                }
            case 1:
                ncu ncu = (ncu) obj;
                ((Number) obj3).intValue();
                jr_ jr_ = (jr_) ((m88) obj2);
                jr_.w(1175567217);
                jJj jjj = (jJj) jr_.x(lnF.X);
                bUo buo = (bUo) jr_.x(lnF.P);
                jr_.w(1157296644);
                boolean O = jr_.O(jjj);
                Object I = jr_.I();
                if (O || I == ppN.R) {
                    I = new iTB(buo, jjj);
                    jr_.ZW(I);
                }
                jr_.g(false);
                iTB itb = (iTB) I;
                caw.c(itb, this.R, this.v, new evl(itb, (iv7) this.c, null), jr_);
                jr_.g(false);
                return itb;
            case 2:
                FI fi = (FI) obj;
                R((m88) obj2, ((Number) obj3).intValue());
                break;
            case 3:
                FI fi2 = (FI) obj;
                R((m88) obj2, ((Number) obj3).intValue());
                break;
            case 4:
                QX qx = (QX) obj;
                m88 m88 = (m88) obj2;
                if ((((Number) obj3).intValue() & 81) == 16) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return o8s.R;
                    }
                }
                float f = (float) 16;
                ncu mL = aH9.mL(dTl.B(adU.c, dTl.s(m88)), f);
                xt L = nA.L(f);
                mpr mpr = (mpr) this.R;
                PortForwardViewModel portForwardViewModel = (PortForwardViewModel) this.v;
                dH9 dh9 = (dH9) this.c;
                jr_ jr_3 = (jr_) m88;
                jr_3.w(-483455358);
                bF9 R = VA.R(L, dq.f2881R, jr_3);
                jr_3.w(-1323940314);
                jJj jjj2 = (jJj) jr_3.x(lnF.X);
                mdz mdz = (mdz) jr_3.x(lnF.H);
                bUo buo2 = (bUo) jr_3.x(lnF.P);
                h1U.R.getClass();
                fme fme = igT.R;
                dNH b = aH9.b(mL);
                if (jr_3.f5052R instanceof Su) {
                    jr_3.mL();
                    if (jr_3.f5050L) {
                        jr_3.H(fme);
                    } else {
                        jr_3.BF();
                    }
                    jr_3.f5078e = false;
                    l6.p(jr_3, R, igT.c);
                    l6.p(jr_3, jjj2, igT.v);
                    l6.p(jr_3, mdz, igT.e);
                    jQ.o(0, b, jQ.m(jr_3, buo2, igT.X, jr_3), jr_3, 2058660585, -1163856341);
                    jr_3.w(1461316923);
                    if (((List) dh9.getValue()).isEmpty()) {
                        vd.O(mpr, jr_3, 8);
                    }
                    jr_3.g(false);
                    for (ForwardedPort forwardedPort : (List) dh9.getValue()) {
                        vd.X(forwardedPort, portForwardViewModel, jr_3, 64);
                    }
                    jQ.K(jr_3, false, false, true, false);
                    jr_3.g(false);
                    return o8s.R;
                }
                l6.u();
                throw null;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                kM4 km4 = (kM4) obj;
                m88 m882 = (m88) obj2;
                if ((((Number) obj3).intValue() & 81) == 16) {
                    jr_ jr_4 = (jr_) m882;
                    if (jr_4.J()) {
                        jr_4.E();
                        return o8s.R;
                    }
                }
                lG0 lg0 = e1X.R;
                if (((Boolean) ((dH9) this.R).getValue()).booleanValue()) {
                    jr_ jr_5 = (jr_) m882;
                    jr_5.w(-896617167);
                    cpc.C(null, jr_5, 0, 1);
                    jr_5.g(false);
                } else {
                    jr_ jr_6 = (jr_) m882;
                    jr_6.w(-896617098);
                    g4x.e(new bBd(5, (PortForwardCreateViewModel) this.c), null, ((Boolean) ((dH9) this.v).getValue()).booleanValue(), null, null, p3f.R, jr_6, 196608, 26);
                    jr_6.g(false);
                }
                return o8s.R;
            default:
                FI fi3 = (FI) obj;
                R((m88) obj2, ((Number) obj3).intValue());
                break;
        }
        return o8s.R;
    }
}
