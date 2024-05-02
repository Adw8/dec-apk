package defpackage;

import android.hardware.usb.UsbDevice;
import dev.kdrag0n.virtcontainer.ui.settings.usb.UsbViewModel;
import java.util.List;

/* renamed from: baP  reason: default package */
/* loaded from: classes.dex */
public final class baP extends k8G implements lR3 {
    public final /* synthetic */ int O;
    public final /* synthetic */ aAC R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dH9 f1753R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f1754R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ baP(Object obj, Object obj2, aAC aac, int i, h0T h0t, int i2) {
        super(3);
        this.X = i2;
        this.f1754R = obj;
        this.v = obj2;
        this.R = aac;
        this.O = i;
        this.f1753R = h0t;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                hZi hzi = (hZi) obj;
                m88 m88 = (m88) obj2;
                ((Number) obj3).intValue();
                dH9 dh9 = this.f1753R;
                jr_ jr_ = (jr_) m88;
                jr_.w(-492369756);
                Object I = jr_.I();
                f1A f1a = ppN.R;
                if (I == f1a) {
                    I = new f53(hzi, new fBj(dh9, 3));
                    jr_.ZW(I);
                }
                jr_.g(false);
                f53 f53 = (f53) I;
                jr_.w(-492369756);
                Object I2 = jr_.I();
                if (I2 == f1a) {
                    I2 = new n67(new jFg(f53));
                    jr_.ZW(I2);
                }
                jr_.g(false);
                n67 n67 = (n67) I2;
                gL6 gl6 = (gL6) this.f1754R;
                if (gl6 != null) {
                    g4x.X(gl6, f53, n67, m88, ((this.O >> 6) & 14) | 64 | 512);
                }
                ncu ncu = (ncu) this.v;
                iv7 iv7 = (iv7) this.R;
                jr_.w(511388516);
                boolean O = jr_.O(f53) | jr_.O(iv7);
                Object I3 = jr_.I();
                if (O || I3 == f1a) {
                    I3 = new azM(f53, 3, iv7);
                    jr_.ZW(I3);
                }
                jr_.g(false);
                aH9.g(n67, ncu, (iv7) I3, m88, (this.O & 112) | 8, 0);
                return o8s.R;
            default:
                QX qx = (QX) obj;
                m88 m882 = (m88) obj2;
                if ((((Number) obj3).intValue() & 81) == 16) {
                    jr_ jr_2 = (jr_) m882;
                    if (jr_2.J()) {
                        jr_2.E();
                        return o8s.R;
                    }
                }
                float f = (float) 16;
                ncu mL = aH9.mL(dTl.B(adU.c, dTl.s(m882)), f);
                xt L = nA.L(f);
                mpr mpr = (mpr) this.f1754R;
                UsbViewModel usbViewModel = (UsbViewModel) this.v;
                kg9 kg9 = (kg9) this.R;
                int i = this.O;
                dH9 dh92 = this.f1753R;
                jr_ jr_3 = (jr_) m882;
                jr_3.w(-483455358);
                bF9 R = VA.R(L, dq.f2881R, jr_3);
                jr_3.w(-1323940314);
                jJj jjj = (jJj) jr_3.x(lnF.X);
                mdz mdz = (mdz) jr_3.x(lnF.H);
                bUo buo = (bUo) jr_3.x(lnF.P);
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
                    l6.p(jr_3, jjj, igT.v);
                    l6.p(jr_3, mdz, igT.e);
                    jQ.o(0, b, jQ.m(jr_3, buo, igT.X, jr_3), jr_3, 2058660585, -1163856341);
                    jr_3.w(772126066);
                    if (((List) dh92.getValue()).isEmpty()) {
                        mxC.O(mpr, jr_3, 8);
                    }
                    jr_3.g(false);
                    for (UsbDevice usbDevice : (List) dh92.getValue()) {
                        mxC.v(usbDevice, usbViewModel, kg9, jr_3, (i & 896) | 72);
                    }
                    jQ.K(jr_3, false, false, true, false);
                    jr_3.g(false);
                    return o8s.R;
                }
                l6.u();
                throw null;
        }
    }
}
