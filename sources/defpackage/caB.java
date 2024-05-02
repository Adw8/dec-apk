package defpackage;

import dev.kdrag0n.virtcontainer.R;
import dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel;

/* renamed from: caB  reason: default package */
/* loaded from: classes.dex */
public final class caB extends k8G implements lR3 {
    public final /* synthetic */ dH9 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ OverviewViewModel f2146R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mpr f2147R;
    public final /* synthetic */ dH9 c;
    public final /* synthetic */ dH9 e;
    public final /* synthetic */ dH9 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public caB(OverviewViewModel overviewViewModel, mpr mpr, h0T h0t, h0T h0t2, h0T h0t3, h0T h0t4) {
        super(3);
        this.f2146R = overviewViewModel;
        this.f2147R = mpr;
        this.R = h0t;
        this.v = h0t2;
        this.c = h0t3;
        this.e = h0t4;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        QX qx = (QX) obj;
        m88 m88 = (m88) obj2;
        if ((((Number) obj3).intValue() & 81) == 16) {
            jr_ jr_ = (jr_) m88;
            if (jr_.J()) {
                jr_.E();
                return o8s.R;
            }
        }
        aff aff = aff.R;
        ncu mL = aH9.mL(dTl.B(adU.c, dTl.s(m88)), (float) 16);
        vV vVVar = dq.f2893v;
        OverviewViewModel overviewViewModel = this.f2146R;
        mpr mpr = this.f2147R;
        dH9 dh9 = this.R;
        dH9 dh92 = this.v;
        dH9 dh93 = this.c;
        dH9 dh94 = this.e;
        jr_ jr_2 = (jr_) m88;
        jr_2.w(-483455358);
        bF9 R = VA.R(nA.f6330R, vVVar, jr_2);
        jr_2.w(-1323940314);
        owM owm = lnF.X;
        jJj jjj = (jJj) jr_2.x(owm);
        owM owm2 = lnF.H;
        mdz mdz = (mdz) jr_2.x(owm2);
        owM owm3 = lnF.P;
        bUo buo = (bUo) jr_2.x(owm3);
        h1U.R.getClass();
        fme fme = igT.R;
        dNH b = aH9.b(mL);
        if (jr_2.f5052R instanceof Su) {
            jr_2.mL();
            if (jr_2.f5050L) {
                jr_2.H(fme);
            } else {
                jr_2.BF();
            }
            jr_2.f5078e = false;
            ky1 ky1 = igT.c;
            l6.p(jr_2, R, ky1);
            ky1 ky12 = igT.v;
            l6.p(jr_2, jjj, ky12);
            ky1 ky13 = igT.e;
            l6.p(jr_2, mdz, ky13);
            ky1 ky14 = igT.X;
            jQ.o(0, b, jQ.m(jr_2, buo, ky14, jr_2), jr_2, 2058660585, -1163856341);
            if (((String) dh9.getValue()) != null) {
                jr_2.w(-768219826);
                String H = opT.H("Virtual machine error: ", (String) dh9.getValue());
                if (n3x.v((String) dh9.getValue(), "CRASH")) {
                    H = n3x.o("\n                        " + H + "\n\n                        Please close background apps and try again.\n                    ");
                }
                z = true;
                vd.e("Failed to start", H, aH9.I(jr_2, 121323715, new gbA(overviewViewModel, 2)), jr_2, 390, 0);
                jr_2.g(false);
            } else {
                z = true;
                if (((Boolean) dh92.getValue()).booleanValue()) {
                    jr_2.w(-768218860);
                    if (((Boolean) dh93.getValue()).booleanValue()) {
                        jr_2.w(-768218827);
                        oI9.R(null, 0, 0.0f, jr_2, 0, 7);
                        z3 = false;
                        jr_2.g(false);
                    } else {
                        jr_2.w(-768218722);
                        ncu zw = aH9.zw(adU.f942R, 0.0f, (float) 64, 0.0f, 0.0f, 13);
                        xt L = nA.L((float) 24);
                        jr_2.w(-483455358);
                        bF9 R2 = VA.R(L, vVVar, jr_2);
                        jr_2.w(-1323940314);
                        jJj jjj2 = (jJj) jr_2.x(owm);
                        mdz mdz2 = (mdz) jr_2.x(owm2);
                        bUo buo2 = (bUo) jr_2.x(owm3);
                        dNH b2 = aH9.b(zw);
                        if (jr_2.f5052R instanceof Su) {
                            jr_2.mL();
                            if (jr_2.f5050L) {
                                jr_2.H(fme);
                            } else {
                                jr_2.BF();
                            }
                            jr_2.f5078e = false;
                            jQ.o(0, b2, jQ.Z(jr_2, R2, ky1, jr_2, jjj2, ky12, jr_2, mdz2, ky13, jr_2, buo2, ky14, jr_2), jr_2, 2058660585, -1163856341);
                            gQc.X(iTI.g(R.drawable.illust_not_found, jr_2), null, adU.H(aff, (float) 256), null, null, 0.0f, null, jr_2, 440, 120);
                            g1c.c("Not running", null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, ((c_P) jr_2.x(dB8.R)).L, jr_2, 6, 0, 32766);
                            vd.R(null, "Start", false, new dTe(overviewViewModel, 4), jr_2, 48, 5);
                            z3 = false;
                            jQ.K(jr_2, false, false, true, false);
                            jr_2.g(false);
                            jr_2.g(false);
                        } else {
                            l6.u();
                            throw null;
                        }
                    }
                    jr_2.g(z3);
                } else {
                    jr_2.w(-768217715);
                    int ordinal = ((he6) dh94.getValue()).ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1 || ordinal == 2) {
                            jr_2.w(-768217554);
                            vd.e("Failed to start", "Service error", null, jr_2, 54, 4);
                            jr_2.g(false);
                        } else if (ordinal != 3) {
                            jr_2.w(-768217352);
                            z2 = false;
                            jr_2.g(false);
                        } else {
                            jr_2.w(-768217405);
                            cpc.t(overviewViewModel, mpr, jr_2, 72);
                            jr_2.g(false);
                        }
                        z2 = false;
                    } else {
                        jr_2.w(-768217641);
                        oI9.R(null, 0, 0.0f, jr_2, 0, 7);
                        z2 = false;
                        jr_2.g(false);
                    }
                    jr_2.g(z2);
                    jQ.K(jr_2, z2, z2, z, z2);
                    jr_2.g(z2);
                    return o8s.R;
                }
            }
            z2 = false;
            jQ.K(jr_2, z2, z2, z, z2);
            jr_2.g(z2);
            return o8s.R;
        }
        l6.u();
        throw null;
    }
}
