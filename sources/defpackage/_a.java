package defpackage;

import android.app.Activity;
import androidx.compose.ui.platform.AndroidComposeView;
import dev.kdrag0n.virt.vm.ForwardedPort;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import dev.kdrag0n.virtcontainer.ui.create.CreateViewModel;
import dev.kdrag0n.virtcontainer.ui.onboarding.adb.pair.AdbPairViewModel;
import dev.kdrag0n.virtcontainer.ui.settings.forward.PortForwardViewModel;
import dev.kdrag0n.virtcontainer.ui.settings.forward.create.PortForwardCreateViewModel;
import dev.kdrag0n.virtcontainer.ui.settings.root.RootSettingsViewModel;
import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: _a  reason: default package */
/* loaded from: classes.dex */
public final class _a extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public _a(iv7 iv7, int i, mpr mpr) {
        super(2);
        this.X = 13;
        this.R = iv7;
        this.O = i;
        this.v = mpr;
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
            case 12:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 13:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 14:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 15:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 16:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 17:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 18:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 19:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 20:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 21:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 22:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 23:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 24:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            default:
                R((m88) obj, ((Number) obj2).intValue());
                break;
        }
        return o8s.R;
    }

    public final void R(m88 m88, int i) {
        k_s k_s;
        Object obj = null;
        switch (this.X) {
            case 0:
                aH9.c((ncu) this.R, (kg9) this.v, m88, this.O | 1);
                return;
            case 1:
                n1P.c((m9D) this.R, (oey) this.v, m88, this.O | 1);
                return;
            case 2:
                if ((i & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                gx6 gx6 = (gx6) this.R;
                jr_ jr_2 = (jr_) m88;
                jr_2.w(15454635);
                Object[] objArr = new Object[0];
                switch (oVq.R.R) {
                    case 4:
                        k_s = hNI.f4218R;
                        break;
                    default:
                        k_s = oVq.f6834R;
                        break;
                }
                oVq ovq = (oVq) cpc.T(objArr, k_s, n9s.R, jr_2, 4);
                ovq.f6835R = (e9w) jr_2.x(hcN.R);
                jr_2.g(false);
                gx6.f3998R.R(ovq);
                ((lR3) this.v).y((gx6) this.R, m88, Integer.valueOf(((this.O << 3) & 112) | 8));
                return;
            case 3:
                if ((i & 11) == 2) {
                    jr_ jr_3 = (jr_) m88;
                    if (jr_3.J()) {
                        jr_3.E();
                        return;
                    }
                }
                if (((iv7) this.v) == null) {
                    jr_ jr_4 = (jr_) m88;
                    jr_4.w(1275643833);
                    iq.v((ncu) this.R, m88, (this.O >> 3) & 14);
                    jr_4.g(false);
                    return;
                }
                jr_ jr_5 = (jr_) m88;
                jr_5.w(1275643903);
                ((iv7) this.v).J(m88, Integer.valueOf((this.O >> 6) & 14));
                jr_5.g(false);
                return;
            case 4:
                msU.v((fBS) this.R, (iv7) this.v, m88, this.O | 1);
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                if ((i & 11) == 2) {
                    jr_ jr_6 = (jr_) m88;
                    if (jr_6.J()) {
                        jr_6.E();
                        return;
                    }
                }
                g1c.R(((c_P) this.R).x, (iv7) this.v, m88, (this.O >> 6) & 112);
                return;
            case 6:
                if ((i & 11) == 2) {
                    jr_ jr_7 = (jr_) m88;
                    if (jr_7.J()) {
                        jr_7.E();
                        return;
                    }
                }
                ncu B = dTl.B(aH9.X4((ncu) this.R, 0.0f, a4b.c, 1).I(fYL.R), dTl.s(m88));
                lR3 lr3 = (lR3) this.v;
                int i2 = this.O & 7168;
                jr_ jr_8 = (jr_) m88;
                jr_8.w(-483455358);
                bF9 R = VA.R(nA.f6330R, dq.f2881R, m88);
                jr_8.w(-1323940314);
                jJj jjj = (jJj) jr_8.x(lnF.X);
                mdz mdz = (mdz) jr_8.x(lnF.H);
                bUo buo = (bUo) jr_8.x(lnF.P);
                h1U.R.getClass();
                fme fme = igT.R;
                dNH b = aH9.b(B);
                int i3 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
                if (jr_8.f5052R instanceof Su) {
                    jr_8.mL();
                    if (jr_8.f5050L) {
                        jr_8.H(fme);
                    } else {
                        jr_8.BF();
                    }
                    jr_8.f5078e = false;
                    l6.p(m88, R, igT.c);
                    l6.p(m88, jjj, igT.v);
                    l6.p(m88, mdz, igT.e);
                    l6.p(m88, buo, igT.X);
                    jr_8.j();
                    b.y(new k7Q(m88), m88, Integer.valueOf((i3 >> 3) & 112));
                    jr_8.w(2058660585);
                    jr_8.w(-1163856341);
                    if (((i3 >> 9) & 14 & 11) != 2 || !jr_8.J()) {
                        lr3.y(_n.R, m88, Integer.valueOf(((i2 >> 6) & 112) | 6));
                    } else {
                        jr_8.E();
                    }
                    jQ.K(jr_8, false, false, true, false);
                    jr_8.g(false);
                    return;
                }
                l6.u();
                throw null;
            case 7:
                if ((i & 11) == 2) {
                    jr_ jr_9 = (jr_) m88;
                    if (jr_9.J()) {
                        jr_9.E();
                        return;
                    }
                }
                l6.R(new bkv[]{fky.f3541R.v((c_x) this.R)}, (iv7) this.v, m88, ((this.O >> 15) & 112) | 8);
                return;
            case VmNativeCallback.$stable /* 8 */:
                g1c.R((kMk) this.R, (iv7) this.v, m88, this.O | 1);
                return;
            case 9:
                bkv[] bkvArr = (bkv[]) this.R;
                l6.R((bkv[]) Arrays.copyOf(bkvArr, bkvArr.length), (iv7) this.v, m88, this.O | 1);
                return;
            case 10:
                ((dNH) this.R).R(this.v, m88, this.O | 1);
                return;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                ur.R((AndroidComposeView) this.R, (iv7) this.v, m88, this.O | 1);
                return;
            case 12:
                hDC.R((jww) this.R, (String) this.v, m88, this.O | 1);
                return;
            case 13:
                if ((i & 11) == 2) {
                    jr_ jr_10 = (jr_) m88;
                    if (jr_10.J()) {
                        jr_10.E();
                        return;
                    }
                }
                if (((iv7) this.R) != null) {
                    jr_ jr_11 = (jr_) m88;
                    jr_11.w(-997030752);
                    ((iv7) this.R).J(jr_11, Integer.valueOf((this.O >> 6) & 14));
                    jr_11.g(false);
                    return;
                }
                mpr mpr = (mpr) this.v;
                if (mpr != null) {
                    Iterator it = dF.xN(mpr.f6186R).iterator();
                    if (it.hasNext()) {
                        it.next();
                    }
                    Iterator it2 = a6.G(it).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (!(((j5B) next).f4822R instanceof f25)) {
                                obj = next;
                            }
                        }
                    }
                    obj = (j5B) obj;
                }
                if (obj != null) {
                    jr_ jr_12 = (jr_) m88;
                    jr_12.w(-997030631);
                    g4x.e(new gVU((mpr) this.v, 1), null, false, null, null, heo.c, jr_12, 196608, 30);
                    jr_12.g(false);
                    return;
                }
                jr_ jr_13 = (jr_) m88;
                jr_13.w(-997030415);
                jr_13.g(false);
                return;
            case 14:
                lTs.v((CreateViewModel) this.R, (mpr) this.v, m88, this.O | 1);
                return;
            case 15:
                lTs.R((CreateViewModel) this.R, (dM_) this.v, m88, this.O | 1);
                return;
            case 16:
                lTs.c((CreateViewModel) this.R, (List) this.v, m88, this.O | 1);
                return;
            case 17:
                mxC.e((AdbPairViewModel) this.R, (f_c) this.v, m88, this.O | 1);
                return;
            case 18:
                vd.X((ForwardedPort) this.R, (PortForwardViewModel) this.v, m88, this.O | 1);
                return;
            case 19:
                vd.Z((PortForwardViewModel) this.R, (mpr) this.v, m88, this.O | 1);
                return;
            case 20:
                e1X.R((PortForwardCreateViewModel) this.R, (mpr) this.v, m88, this.O | 1);
                return;
            case 21:
                mLz.v((RootSettingsViewModel) this.R, (mpr) this.v, m88, this.O | 1);
                return;
            case 22:
                iqx.R((kM4) this.R, (ru) this.v, m88, this.O | 1);
                return;
            case 23:
                iqx.v((nhg) this.R, (mBH) this.v, m88, this.O | 1);
                return;
            case 24:
                iqx.e((TerminalViewModel) this.R, (Activity) this.v, m88, this.O | 1);
                return;
            default:
                iqx.X((iv7) this.R, (h0T) this.v, m88, this.O | 1);
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public _a(iv7 iv7, ncu ncu, int i) {
        super(2);
        this.X = 3;
        this.v = iv7;
        this.R = ncu;
        this.O = i;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ _a(Object obj, Object obj2, int i, int i2) {
        super(2);
        this.X = i2;
        this.R = obj;
        this.v = obj2;
        this.O = i;
    }
}
