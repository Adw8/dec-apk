package defpackage;

import android.hardware.usb.UsbDevice;
import androidx.compose.ui.platform.AndroidComposeView;
import dev.kdrag0n.app.ui.drm.LicenseInvalidViewModel;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import dev.kdrag0n.virtcontainer.ui.main.MainSharedViewModel;
import dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel;
import dev.kdrag0n.virtcontainer.ui.settings.usb.UsbViewModel;
import java.util.Map;

/* renamed from: dR  reason: default package */
/* loaded from: classes.dex */
public final class dR extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public dR(h0T h0t, ngd ngd, iv7 iv7, int i) {
        super(2);
        this.X = 4;
        this.v = h0t;
        this.R = ngd;
        this.c = iv7;
        this.O = i;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 1:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 2:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 3:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 4:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 6:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 7:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case VmNativeCallback.$stable /* 8 */:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 9:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 10:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            default:
                R((m88) obj, ((Number) obj2).intValue());
                break;
        }
        return o8s.R;
    }

    public final void R(m88 m88, int i) {
        switch (this.X) {
            case 0:
                dTl.Z((p2E) this.R, (h0T) this.v, (Map) this.c, m88, this.O | 1);
                return;
            case 1:
                g4x.X((gL6) this.R, (f53) this.v, (n67) this.c, m88, this.O | 1);
                return;
            case 2:
                ((gx6) this.R).e(this.v, (iv7) this.c, m88, this.O | 1);
                return;
            case 3:
                dTl.O((ncu) this.R, (fBS) this.v, (iv7) this.c, m88, this.O | 1);
                return;
            case 4:
                if ((i & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                okZ okz = new okZ("Container");
                float f = brj.R;
                ncu I = okz.I(new nL3(new dU2(((nqW) ((h0T) this.v).getValue()).f6610R, (ngd) this.R)));
                iv7 iv7 = (iv7) this.c;
                int i2 = this.O;
                jr_ jr_2 = (jr_) m88;
                jr_2.w(733328855);
                bF9 e = PO.e(dq.R, true, m88);
                jr_2.w(-1323940314);
                jJj jjj = (jJj) jr_2.x(lnF.X);
                mdz mdz = (mdz) jr_2.x(lnF.H);
                bUo buo = (bUo) jr_2.x(lnF.P);
                h1U.R.getClass();
                fme fme = igT.R;
                dNH b = aH9.b(I);
                if (jr_2.f5052R instanceof Su) {
                    jr_2.mL();
                    if (jr_2.f5050L) {
                        jr_2.H(fme);
                    } else {
                        jr_2.BF();
                    }
                    jr_2.f5078e = false;
                    l6.p(m88, e, igT.c);
                    l6.p(m88, jjj, igT.v);
                    l6.p(m88, mdz, igT.e);
                    l6.p(m88, buo, igT.X);
                    jr_2.j();
                    b.y(new k7Q(m88), m88, 0);
                    jr_2.w(2058660585);
                    jr_2.w(-2137368960);
                    jr_2.w(1492929242);
                    iv7.J(m88, Integer.valueOf((i2 >> 15) & 14));
                    jr_2.g(false);
                    jr_2.g(false);
                    jQ.K(jr_2, false, true, false, false);
                    return;
                }
                l6.u();
                throw null;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                ((dNH) this.R).v(this.v, this.c, m88, this.O | 1);
                return;
            case 6:
                ((oVq) this.R).e(this.v, (iv7) this.c, m88, this.O | 1);
                return;
            case 7:
                if ((i & 11) == 2) {
                    jr_ jr_3 = (jr_) m88;
                    if (jr_3.J()) {
                        jr_3.E();
                        return;
                    }
                }
                lnF.R((AndroidComposeView) this.R, (WH) this.v, (iv7) this.c, m88, ((this.O << 3) & 896) | 72);
                return;
            case VmNativeCallback.$stable /* 8 */:
                lnF.R((gzG) this.R, (l8m) this.v, (iv7) this.c, m88, this.O | 1);
                return;
            case 9:
                cUF.R((m5f) this.R, (F4) this.v, (LicenseInvalidViewModel) this.c, m88, this.O | 1);
                return;
            case 10:
                cpc.j((OverviewViewModel) this.R, (MainSharedViewModel) this.v, (mpr) this.c, m88, this.O | 1);
                return;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                mxC.v((UsbDevice) this.R, (UsbViewModel) this.v, (kg9) this.c, m88, this.O | 1);
                return;
            default:
                mxC.L((UsbViewModel) this.R, (mpr) this.v, (kg9) this.c, m88, this.O | 1);
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dR(Object obj, Object obj2, Object obj3, int i, int i2) {
        super(2);
        this.X = i2;
        this.R = obj;
        this.v = obj2;
        this.c = obj3;
        this.O = i;
    }
}
