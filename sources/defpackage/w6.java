package defpackage;

import android.hardware.usb.UsbDevice;
import dev.kdrag0n.virtcontainer.ui.settings.usb.UsbViewModel;

/* renamed from: w6  reason: default package */
/* loaded from: classes.dex */
public final class w6 extends k8G implements lR3 {
    public final /* synthetic */ aAC R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f7449R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f7450R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6(boolean z, Object obj, Object obj2, aAC aac, int i) {
        super(3);
        this.X = i;
        this.f7450R = z;
        this.f7449R = obj;
        this.v = obj2;
        this.R = aac;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                ncu ncu = (ncu) obj;
                ((Number) obj3).intValue();
                jr_ jr_ = (jr_) ((m88) obj2);
                jr_.w(-756081143);
                aff aff = aff.R;
                f8n f8n = (f8n) jr_.x(pbX.R);
                jr_.w(-492369756);
                Object I = jr_.I();
                if (I == ppN.R) {
                    I = new p2E();
                    jr_.ZW(I);
                }
                jr_.g(false);
                boolean z = this.f7450R;
                ncu g = g4x.g(aff, lBz.Y, new pk(f8n, (p2E) I, (fzf) this.v, (String) this.f7449R, (f_c) this.R, z));
                jr_.g(false);
                return g;
            default:
                FI fi = (FI) obj;
                m88 m88 = (m88) obj2;
                if ((((Number) obj3).intValue() & 81) == 16) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return o8s.R;
                    }
                }
                aff aff2 = aff.R;
                ncu mL = aH9.mL(dTl.i(adU.f942R, false, new igu(this.f7450R, (UsbViewModel) this.f7449R, (UsbDevice) this.v, (kg9) this.R), 7), (float) 16);
                ky kyVar = dq.f2891v;
                boolean z2 = this.f7450R;
                UsbDevice usbDevice = (UsbDevice) this.v;
                UsbViewModel usbViewModel = (UsbViewModel) this.f7449R;
                kg9 kg9 = (kg9) this.R;
                jr_ jr_3 = (jr_) m88;
                jr_3.w(693286680);
                bF9 R = ktl.R(nA.R, kyVar, jr_3);
                jr_3.w(-1323940314);
                owM owm = lnF.X;
                jJj jjj = (jJj) jr_3.x(owm);
                owM owm2 = lnF.H;
                mdz mdz = (mdz) jr_3.x(owm2);
                owM owm3 = lnF.P;
                bUo buo = (bUo) jr_3.x(owm3);
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
                    ky1 ky1 = igT.c;
                    l6.p(jr_3, R, ky1);
                    ky1 ky12 = igT.v;
                    l6.p(jr_3, jjj, ky12);
                    ky1 ky13 = igT.e;
                    l6.p(jr_3, mdz, ky13);
                    ky1 ky14 = igT.X;
                    l6.p(jr_3, buo, ky14);
                    jr_3.j();
                    b.y(new k7Q(jr_3), jr_3, 0);
                    jr_3.w(2058660585);
                    jr_3.w(-678309503);
                    nAL nal = nAL.R;
                    jr_3.w(-483455358);
                    bF9 R2 = VA.R(nA.f6330R, dq.f2881R, jr_3);
                    jr_3.w(-1323940314);
                    jJj jjj2 = (jJj) jr_3.x(owm);
                    mdz mdz2 = (mdz) jr_3.x(owm2);
                    bUo buo2 = (bUo) jr_3.x(owm3);
                    dNH b2 = aH9.b(aff2);
                    if (jr_3.f5052R instanceof Su) {
                        jr_3.mL();
                        if (jr_3.f5050L) {
                            jr_3.H(fme);
                        } else {
                            jr_3.BF();
                        }
                        jr_3.f5078e = false;
                        l6.p(jr_3, R2, ky1);
                        l6.p(jr_3, jjj2, ky12);
                        l6.p(jr_3, mdz2, ky13);
                        l6.p(jr_3, buo2, ky14);
                        jr_3.j();
                        b2.y(new k7Q(jr_3), jr_3, 0);
                        jr_3.w(2058660585);
                        jr_3.w(-1163856341);
                        String C = jQ.C(usbDevice.getManufacturerName(), " ", usbDevice.getProductName());
                        owM owm4 = dB8.R;
                        g1c.c(C, null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, ((c_P) jr_3.x(owm4)).Z, jr_3, 0, 0, 32766);
                        int vendorId = usbDevice.getVendorId();
                        jjU.X(16);
                        String G = iH_.G(Integer.toString(vendorId, 16));
                        int productId = usbDevice.getProductId();
                        jjU.X(16);
                        g1c.c(jQ.C(G, ":", iH_.G(Integer.toString(productId, 16))), null, ((E2) jr_3.x(_1.R)).P(), 0, null, null, null, 0, null, null, 0, 0, false, 0, null, ((c_P) jr_3.x(owm4)).H, jr_3, 0, 0, 32762);
                        jQ.K(jr_3, false, false, true, false);
                        jr_3.g(false);
                        dTl.x(kM4.R(nal), jr_3, 0);
                        nP4.R(z2, new V3(z2, usbViewModel, usbDevice, kg9, 2), null, null, false, null, null, jr_3, 0, 124);
                        jQ.K(jr_3, false, false, true, false);
                        jr_3.g(false);
                        return o8s.R;
                    }
                    l6.u();
                    throw null;
                }
                l6.u();
                throw null;
        }
    }
}
