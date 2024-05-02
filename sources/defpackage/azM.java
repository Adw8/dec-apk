package defpackage;

import android.content.Context;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import dev.kdrag0n.virtcontainer.R;
import dev.kdrag0n.virtcontainer.ui.main.MainViewModel;
import dev.kdrag0n.virtcontainer.ui.onboarding.adb.pair.AdbPairViewModel;
import dev.kdrag0n.virtcontainer.ui.settings.root.RootSettingsViewModel;
import java.util.Map;

/* renamed from: azM  reason: default package */
/* loaded from: classes.dex */
public final class azM extends k8G implements iv7 {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ azM(Object obj, int i, Object obj2) {
        super(2);
        this.X = i;
        this.R = obj;
        this.v = obj2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                phU phu = (phU) obj;
                long j = ((aWo) obj2).f906R;
                n1P.O((cXX) this.R, phu);
                phu.R();
                ((dRB) this.v).R = j;
                return o8s.R;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                eLb elb = (eLb) this.R;
                float f = elb.R;
                elb.R = ((gAN) this.v).R(floatValue - f) + f;
                return o8s.R;
            case 2:
                R((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 3:
                return (mET) ((iv7) this.v).J(new cXA((f53) this.R, (c2J) obj), new oys(((oys) obj2).f7046R));
            case 4:
                R((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                R((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 6:
                ((Number) obj2).intValue();
                jr_ jr_ = (jr_) ((m88) obj);
                jr_.w(935231726);
                bkv[] bkvArr = (bkv[]) this.R;
                g2d g2d = (g2d) this.v;
                jr_.w(721128344);
                mWd mwd = new mWd(e76.R);
                for (bkv bkv : bkvArr) {
                    jr_.w(680852989);
                    if (!bkv.f1804R) {
                        if (((e76) g2d).containsKey(bkv.f1803R)) {
                            jr_.g(false);
                        }
                    }
                    kxN kxn = bkv.f1803R;
                    mwd.put(kxn, kxn.R(bkv.R, jr_));
                    jr_.g(false);
                }
                e76 R = mwd.R();
                jr_.g(false);
                jr_.g(false);
                return R;
            case 7:
                R((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case VmNativeCallback.$stable /* 8 */:
                R((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 9:
                R((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 10:
                R((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                R((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 12:
                R((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 13:
                R((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 14:
                R((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 15:
                R((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            default:
                phU phu2 = (phU) obj;
                l6.z((jy_) this.R, null, 0, new dFr((nhg) this.v, ((Number) obj2).floatValue(), null), 3);
                return o8s.R;
        }
    }

    public final void R(m88 m88, int i) {
        int i2;
        float f = 1.0f;
        switch (this.X) {
            case 2:
                if ((i & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                cRR crr = (cRR) ((f53) this.R).R.g();
                Integer num = (Integer) crr.O().get(((nm1) this.v).f6577R);
                if (num != null) {
                    ((nm1) this.v).f6578R.R(Integer.valueOf(num.intValue()));
                    i2 = num.intValue();
                } else {
                    i2 = ((Number) ((nm1) this.v).f6578R.getValue()).intValue();
                }
                jr_ jr_2 = (jr_) m88;
                jr_2.w(-715770513);
                if (i2 < crr.L()) {
                    Object v = crr.v(i2);
                    if (n3x.v(v, ((nm1) this.v).f6577R)) {
                        ((f53) this.R).f3302R.e(v, aH9.I(m88, -1238863364, new m2w(i2, 1, crr)), m88, 568);
                    }
                }
                jr_2.g(false);
                nm1 nm1 = (nm1) this.v;
                caw.v(nm1.f6577R, new _0(11, nm1), m88);
                return;
            case 3:
            case 6:
            default:
                if ((i & 11) == 2) {
                    jr_ jr_3 = (jr_) m88;
                    if (jr_3.J()) {
                        jr_3.E();
                        return;
                    }
                }
                nP4.R(((Boolean) ((dH9) this.R).getValue()).booleanValue(), new mox(18, (RootSettingsViewModel) this.v), null, null, false, null, null, m88, 0, 124);
                return;
            case 4:
                if ((i & 11) == 2) {
                    jr_ jr_4 = (jr_) m88;
                    if (jr_4.J()) {
                        jr_4.E();
                        return;
                    }
                }
                ncu I = cU5.N(aff.R, false, lfm.R).I(new enH(new h8Y((gv2) this.R, 1)));
                if (!((Boolean) ((gv2) this.R).f3981R.getValue()).booleanValue()) {
                    f = 0.0f;
                }
                ncu L = ooA.L(I, f);
                dNH I2 = aH9.I(m88, 588819933, new efc((dH9) this.v, 0));
                jr_ jr_5 = (jr_) m88;
                jr_5.w(-483170785);
                jut jut = jut.R;
                jr_5.w(-1323940314);
                jJj jjj = (jJj) jr_5.x(lnF.X);
                mdz mdz = (mdz) jr_5.x(lnF.H);
                bUo buo = (bUo) jr_5.x(lnF.P);
                h1U.R.getClass();
                fme fme = igT.R;
                dNH b = aH9.b(L);
                if (jr_5.f5052R instanceof Su) {
                    jr_5.mL();
                    if (jr_5.f5050L) {
                        jr_5.H(fme);
                    } else {
                        jr_5.BF();
                    }
                    jr_5.f5078e = false;
                    l6.p(m88, jut, igT.c);
                    l6.p(m88, jjj, igT.v);
                    l6.p(m88, mdz, igT.e);
                    l6.p(m88, buo, igT.X);
                    jr_5.j();
                    b.y(new k7Q(m88), m88, 0);
                    jr_5.w(2058660585);
                    I2.J(m88, 6);
                    jQ.K(jr_5, false, true, false, false);
                    return;
                }
                l6.u();
                throw null;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                if ((i & 11) == 2) {
                    jr_ jr_6 = (jr_) m88;
                    if (jr_6.J()) {
                        jr_6.E();
                        return;
                    }
                }
                jQ.Y(this.R);
                throw null;
            case 7:
                if ((i & 11) == 2) {
                    jr_ jr_7 = (jr_) m88;
                    if (jr_7.J()) {
                        jr_7.E();
                        return;
                    }
                }
                ((bBk) this.R).m(Float.valueOf(((idZ) this.v).f4677R.R), Float.valueOf(((idZ) this.v).f4677R.v), m88, 0);
                return;
            case VmNativeCallback.$stable /* 8 */:
                if ((i & 11) == 2) {
                    jr_ jr_8 = (jr_) m88;
                    if (jr_8.J()) {
                        jr_8.E();
                        return;
                    }
                }
                gQc.L((i5Q) ((k_M) this.R), (Map) this.v, m88, 64, 0);
                return;
            case 9:
                if ((i & 11) == 2) {
                    jr_ jr_9 = (jr_) m88;
                    if (jr_9.J()) {
                        jr_9.E();
                        return;
                    }
                }
                boolean booleanValue = ((Boolean) ((oxg) this.R).f7040R.getValue()).booleanValue();
                iv7 iv7 = (iv7) this.v;
                jr_ jr_10 = (jr_) m88;
                jr_10._(Boolean.valueOf(booleanValue));
                boolean L2 = jr_10.L(booleanValue);
                if (booleanValue) {
                    iv7.J(m88, 0);
                } else if (!(jr_10.v == 0)) {
                    vC.e("No nodes can be emitted before calling dactivateToEndGroup".toString());
                    throw null;
                } else if (!jr_10.f5050L) {
                    if (!L2) {
                        jr_10.M();
                    } else {
                        ilY ily = jr_10.f5058R;
                        int i3 = ily.c;
                        int i4 = ily.e;
                        int i5 = i3;
                        while (i5 < i4) {
                            ilY ily2 = jr_10.f5058R;
                            int m = l6.m(ily2.f4714R, i5);
                            int i6 = i5 + 1;
                            mq9 mq9 = ily2.f4712R;
                            int i7 = i6 < mq9.e ? mq9.f6199R[(i6 * 5) + 4] : mq9.X;
                            for (int i8 = m; i8 < i7; i8++) {
                                Integer valueOf = Integer.valueOf(i8 - m);
                                Object obj = ily2.f4715R[i8];
                                int intValue = valueOf.intValue();
                                if (obj instanceof ddq) {
                                    jr_10.f5058R.C(i5);
                                    jr_10.r(false, new hO0(obj, i5, intValue, 0));
                                } else if (obj instanceof dYh) {
                                    dYh dyh = (dYh) obj;
                                    hAe hae = dyh.f2665R;
                                    if (hae != null) {
                                        hae.f4151R = true;
                                        dyh.f2665R = null;
                                        dyh.f2664R = null;
                                        dyh.f2667R = null;
                                    }
                                    jr_10.f5058R.C(i5);
                                    jr_10.r(false, new hO0(obj, i5, intValue, 1));
                                }
                            }
                            i5 = i6;
                        }
                        vC.R(i3, i4, jr_10.f5059R);
                        jr_10.f5058R.C(i3);
                        jr_10.f5058R.P();
                    }
                }
                if (jr_10.f5078e && jr_10.f5058R.X == jr_10.c) {
                    jr_10.c = -1;
                    jr_10.f5078e = false;
                }
                jr_10.g(false);
                return;
            case 10:
                if ((i & 11) == 2) {
                    jr_ jr_11 = (jr_) m88;
                    if (jr_11.J()) {
                        jr_11.E();
                        return;
                    }
                }
                ncu I3 = cU5.N(aff.R, false, Nu.R).I(new enH(new Bo((bkb) this.R, 1)));
                if (!((bkb) this.R).getCanCalculatePosition()) {
                    f = 0.0f;
                }
                ncu L3 = ooA.L(I3, f);
                dNH I4 = aH9.I(m88, 606497925, new efc((dH9) this.v, 3));
                jr_ jr_12 = (jr_) m88;
                jr_12.w(1406149896);
                If r7 = If.R;
                jr_12.w(-1323940314);
                jJj jjj2 = (jJj) jr_12.x(lnF.X);
                mdz mdz2 = (mdz) jr_12.x(lnF.H);
                bUo buo2 = (bUo) jr_12.x(lnF.P);
                h1U.R.getClass();
                fme fme2 = igT.R;
                dNH b2 = aH9.b(L3);
                if (jr_12.f5052R instanceof Su) {
                    jr_12.mL();
                    if (jr_12.f5050L) {
                        jr_12.H(fme2);
                    } else {
                        jr_12.BF();
                    }
                    jr_12.f5078e = false;
                    l6.p(m88, r7, igT.c);
                    l6.p(m88, jjj2, igT.v);
                    l6.p(m88, mdz2, igT.e);
                    l6.p(m88, buo2, igT.X);
                    jr_12.j();
                    b2.y(new k7Q(m88), m88, 0);
                    jr_12.w(2058660585);
                    I4.J(m88, 6);
                    jQ.K(jr_12, false, true, false, false);
                    return;
                }
                l6.u();
                throw null;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                if ((i & 11) == 2) {
                    jr_ jr_13 = (jr_) m88;
                    if (jr_13.J()) {
                        jr_13.E();
                        return;
                    }
                }
                g1c.c((String) ((kg9) this.R).x(Integer.valueOf(((Number) ((h0T) this.v).getValue()).intValue())), null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, m88, 0, 0, 65534);
                return;
            case 12:
                if ((i & 11) == 2) {
                    jr_ jr_14 = (jr_) m88;
                    if (jr_14.J()) {
                        jr_14.E();
                        return;
                    }
                }
                vd.v(null, dtx.h(R.string.main_dialog_beta_optout_button_confirm, m88), new _c((Context) this.R, 21, (MainViewModel) this.v), m88, 0, 1);
                return;
            case 13:
                if ((i & 11) == 2) {
                    jr_ jr_15 = (jr_) m88;
                    if (jr_15.J()) {
                        jr_15.E();
                        return;
                    }
                }
                vd.v(null, dtx.h(R.string.try_again, m88), new _c((AdbPairViewModel) this.R, 22, (f_c) this.v), m88, 0, 1);
                return;
            case 14:
                if ((i & 11) == 2) {
                    jr_ jr_16 = (jr_) m88;
                    if (jr_16.J()) {
                        jr_16.E();
                        return;
                    }
                }
                nP4.R(((Boolean) ((dH9) this.R).getValue()).booleanValue(), new gXp((Context) this.v), null, null, false, null, null, m88, 0, 124);
                return;
        }
    }
}
