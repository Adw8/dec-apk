package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import dev.kdrag0n.virtcontainer.R;
import java.util.Collections;

/* renamed from: oCi  reason: default package */
/* loaded from: classes.dex */
public final class oCi extends k8G implements iv7 {

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ int f6703X;
    public static final oCi R = new oCi(0);
    public static final oCi v = new oCi(1);
    public static final oCi c = new oCi(4);
    public static final oCi e = new oCi(5);
    public static final oCi X = new oCi(6);
    public static final oCi O = new oCi(7);
    public static final oCi L = new oCi(8);
    public static final oCi Z = new oCi(9);
    public static final oCi m = new oCi(10);
    public static final oCi x = new oCi(11);
    public static final oCi H = new oCi(12);
    public static final oCi U = new oCi(13);
    public static final oCi C = new oCi(14);
    public static final oCi N = new oCi(15);
    public static final oCi P = new oCi(16);
    public static final oCi j = new oCi(17);
    public static final oCi g = new oCi(18);
    public static final oCi y = new oCi(19);
    public static final oCi t = new oCi(20);
    public static final oCi i = new oCi(21);
    public static final oCi V = new oCi(22);
    public static final oCi o = new oCi(23);
    public static final oCi K = new oCi(24);
    public static final oCi J = new oCi(25);
    public static final oCi Y = new oCi(26);
    public static final oCi h = new oCi(27);
    public static final oCi I = new oCi(28);
    public static final oCi u = new oCi(29);

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oCi(int i2) {
        super(2);
        this.f6703X = i2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        switch (this.f6703X) {
            case 0:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 1:
                dWm dwm = (dWm) obj;
                return Collections.singletonList(Integer.valueOf(((aD8) obj2).Z()));
            case 2:
                return R((liQ) obj, (jMO) obj2);
            case 3:
                return R((liQ) obj, (jMO) obj2);
            case 4:
                return R((liQ) obj, (jMO) obj2);
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 6:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 7:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case VmNativeCallback.$stable:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 9:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 10:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case lVo.HKDF_SALT_FIELD_NUMBER:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 12:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 13:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 14:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 15:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 16:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 17:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 18:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 19:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 20:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 21:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 22:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 23:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 24:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 25:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 26:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 27:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 28:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            default:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
        }
    }

    public final Integer R(liQ liq, jMO jmo) {
        switch (this.f6703X) {
            case 2:
                return Integer.valueOf((((liq.X() + 0) - jmo.R.c) / 2) + 0);
            case 3:
                return Integer.valueOf(liq.X() - jmo.R.c);
            default:
                return 0;
        }
    }

    public final void v(m88 m88, int i2) {
        switch (this.f6703X) {
            case 0:
                if ((i2 & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                if ((i2 & 11) == 2) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                f7Z.v(iTI.g(R.drawable.msic_bedtime_off_24, m88), null, null, 0, m88, 56, 12);
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                if ((i2 & 11) == 2) {
                    jr_ jr_3 = (jr_) m88;
                    if (jr_3.J()) {
                        jr_3.E();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                if ((i2 & 11) == 2) {
                    jr_ jr_4 = (jr_) m88;
                    if (jr_4.J()) {
                        jr_4.E();
                        return;
                    }
                }
                ncu zw = aH9.zw(adU.f942R, 0.0f, (float) 16, 0.0f, 0.0f, 13);
                Y6 y6 = dq.X;
                jr_ jr_5 = (jr_) m88;
                jr_5.w(733328855);
                bF9 e2 = PO.e(y6, false, jr_5);
                jr_5.w(-1323940314);
                jJj jjj = (jJj) jr_5.x(lnF.X);
                mdz mdz = (mdz) jr_5.x(lnF.H);
                bUo buo = (bUo) jr_5.x(lnF.P);
                h1U.R.getClass();
                fme fme = igT.R;
                dNH b = aH9.b(zw);
                if (jr_5.f5052R instanceof Su) {
                    jr_5.mL();
                    if (jr_5.f5050L) {
                        jr_5.H(fme);
                    } else {
                        jr_5.BF();
                    }
                    jr_5.f5078e = false;
                    l6.p(jr_5, e2, igT.c);
                    l6.p(jr_5, jjj, igT.v);
                    l6.p(jr_5, mdz, igT.e);
                    jQ.o(0, b, jQ.m(jr_5, buo, igT.X, jr_5), jr_5, 2058660585, -2137368960);
                    oI9.R(null, 0, 0.0f, jr_5, 0, 7);
                    jQ.K(jr_5, false, false, true, false);
                    jr_5.g(false);
                    return;
                }
                l6.u();
                throw null;
            case 7:
                if ((i2 & 11) == 2) {
                    jr_ jr_6 = (jr_) m88;
                    if (jr_6.J()) {
                        jr_6.E();
                        return;
                    }
                }
                hDC.c(m88, 0);
                return;
            case VmNativeCallback.$stable:
                if ((i2 & 11) == 2) {
                    jr_ jr_7 = (jr_) m88;
                    if (jr_7.J()) {
                        jr_7.E();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                if ((i2 & 11) == 2) {
                    jr_ jr_8 = (jr_) m88;
                    if (jr_8.J()) {
                        jr_8.E();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                if ((i2 & 11) == 2) {
                    jr_ jr_9 = (jr_) m88;
                    if (jr_9.J()) {
                        jr_9.E();
                        return;
                    }
                    return;
                }
                return;
            case lVo.HKDF_SALT_FIELD_NUMBER:
                if ((i2 & 11) == 2) {
                    jr_ jr_10 = (jr_) m88;
                    if (jr_10.J()) {
                        jr_10.E();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if ((i2 & 11) == 2) {
                    jr_ jr_11 = (jr_) m88;
                    if (jr_11.J()) {
                        jr_11.E();
                        return;
                    }
                }
                nUO nuo = dgk.f2820R;
                if (nuo == null) {
                    f0G f0g = new f0G("Filled.ArrowBack");
                    int i3 = jnb.R;
                    oSW osw = new oSW(n3.v);
                    jGl jgl = new jGl();
                    jgl.Z(20.0f, 11.0f);
                    jgl.e(7.83f);
                    jgl.L(5.59f, -5.59f);
                    jgl.O(12.0f, 4.0f);
                    jgl.L(-8.0f, 8.0f);
                    jgl.L(8.0f, 8.0f);
                    jgl.L(1.41f, -1.41f);
                    jgl.O(7.83f, 13.0f);
                    jgl.e(20.0f);
                    jgl.H(-2.0f);
                    jgl.R();
                    f0G.c(f0g, jgl.R, osw);
                    nuo = f0g.e();
                    dgk.f2820R = nuo;
                }
                f7Z.R(nuo, "Back", null, 0, m88, 48, 12);
                return;
            case 13:
                if ((i2 & 11) == 2) {
                    jr_ jr_12 = (jr_) m88;
                    if (jr_12.J()) {
                        jr_12.E();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                if ((i2 & 11) == 2) {
                    jr_ jr_13 = (jr_) m88;
                    if (jr_13.J()) {
                        jr_13.E();
                        return;
                    }
                }
                f7Z.v(iTI.g(R.drawable.ic_fluent_arrow_download_24_regular, m88), null, null, 0, m88, 56, 12);
                return;
            case 15:
                if ((i2 & 11) == 2) {
                    jr_ jr_14 = (jr_) m88;
                    if (jr_14.J()) {
                        jr_14.E();
                        return;
                    }
                }
                g1c.c(dtx.h(R.string.main_dialog_beta_optout, m88), null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, m88, 0, 0, 65534);
                return;
            case 16:
                if ((i2 & 11) == 2) {
                    jr_ jr_15 = (jr_) m88;
                    if (jr_15.J()) {
                        jr_15.E();
                        return;
                    }
                }
                f7Z.v(iTI.g(R.drawable.ic_fluent_shield_24_regular, m88), null, null, 0, m88, 56, 12);
                return;
            case 17:
                if ((i2 & 11) == 2) {
                    jr_ jr_16 = (jr_) m88;
                    if (jr_16.J()) {
                        jr_16.E();
                        return;
                    }
                }
                g1c.c(dtx.h(R.string.onboarding_adb_pair_dialog_permission_failed, m88), null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, m88, 0, 0, 65534);
                return;
            case 18:
                if ((i2 & 11) == 2) {
                    jr_ jr_17 = (jr_) m88;
                    if (jr_17.J()) {
                        jr_17.E();
                        return;
                    }
                }
                nUO nuo2 = gQc.R;
                if (nuo2 == null) {
                    f0G f0g2 = new f0G("Filled.Settings");
                    int i4 = jnb.R;
                    oSW osw2 = new oSW(n3.v);
                    jGl jgl2 = new jGl();
                    jgl2.Z(19.14f, 12.94f);
                    jgl2.c(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
                    jgl2.c(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
                    jgl2.L(2.03f, -1.58f);
                    jgl2.c(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
                    jgl2.L(-1.92f, -3.32f);
                    jgl2.c(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
                    jgl2.L(-2.39f, 0.96f);
                    jgl2.c(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
                    jgl2.O(14.4f, 2.81f);
                    jgl2.c(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
                    jgl2.X(-3.84f);
                    jgl2.c(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
                    jgl2.O(9.25f, 5.35f);
                    jgl2.v(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
                    jgl2.O(5.24f, 5.33f);
                    jgl2.c(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
                    jgl2.O(2.74f, 8.87f);
                    jgl2.v(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
                    jgl2.L(2.03f, 1.58f);
                    jgl2.v(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
                    jgl2.m(0.02f, 0.64f, 0.07f, 0.94f);
                    jgl2.L(-2.03f, 1.58f);
                    jgl2.c(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
                    jgl2.L(1.92f, 3.32f);
                    jgl2.c(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
                    jgl2.L(2.39f, -0.96f);
                    jgl2.c(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
                    jgl2.L(0.36f, 2.54f);
                    jgl2.c(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
                    jgl2.X(3.84f);
                    jgl2.c(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
                    jgl2.L(0.36f, -2.54f);
                    jgl2.c(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
                    jgl2.L(2.39f, 0.96f);
                    jgl2.c(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
                    jgl2.L(1.92f, -3.32f);
                    jgl2.c(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
                    jgl2.O(19.14f, 12.94f);
                    jgl2.R();
                    jgl2.Z(12.0f, 15.6f);
                    jgl2.c(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
                    jgl2.m(1.62f, -3.6f, 3.6f, -3.6f);
                    jgl2.m(3.6f, 1.62f, 3.6f, 3.6f);
                    jgl2.R.add(new kuG(13.98f, 15.6f, 12.0f, 15.6f));
                    jgl2.R();
                    f0G.c(f0g2, jgl2.R, osw2);
                    nuo2 = f0g2.e();
                    gQc.R = nuo2;
                }
                f7Z.R(nuo2, "Settings", null, 0, m88, 48, 12);
                return;
            case 19:
                if ((i2 & 11) == 2) {
                    jr_ jr_18 = (jr_) m88;
                    if (jr_18.J()) {
                        jr_18.E();
                        return;
                    }
                }
                f7Z.R(dxh.c(), "Delete", null, 0, m88, 48, 12);
                return;
            case 20:
                if ((i2 & 11) == 2) {
                    jr_ jr_19 = (jr_) m88;
                    if (jr_19.J()) {
                        jr_19.E();
                        return;
                    }
                }
                g1c.c("All data will be lost. This can’t be undone.", null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, m88, 6, 0, 65534);
                return;
            case 21:
                if ((i2 & 11) == 2) {
                    jr_ jr_20 = (jr_) m88;
                    if (jr_20.J()) {
                        jr_20.E();
                        return;
                    }
                }
                f7Z.R(biy.H(), "New tab", null, 0, m88, 48, 12);
                return;
            case 22:
                if ((i2 & 11) == 2) {
                    jr_ jr_21 = (jr_) m88;
                    if (jr_21.J()) {
                        jr_21.E();
                        return;
                    }
                }
                f7Z.R(cpc.S(), "Actions", null, 0, m88, 48, 12);
                return;
            case 23:
                if ((i2 & 11) == 2) {
                    jr_ jr_22 = (jr_) m88;
                    if (jr_22.J()) {
                        jr_22.E();
                        return;
                    }
                }
                g1c.c("Delete", null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, m88, 6, 0, 65534);
                return;
            case 24:
                if ((i2 & 11) == 2) {
                    jr_ jr_23 = (jr_) m88;
                    if (jr_23.J()) {
                        jr_23.E();
                        return;
                    }
                }
                f7Z.R(dxh.c(), null, null, 0, m88, 48, 12);
                return;
            case 25:
                if ((i2 & 11) == 2) {
                    jr_ jr_24 = (jr_) m88;
                    if (jr_24.J()) {
                        jr_24.E();
                        return;
                    }
                }
                f7Z.R(cpc.S(), "More", null, 0, m88, 48, 12);
                return;
            case 26:
                if ((i2 & 11) == 2) {
                    jr_ jr_25 = (jr_) m88;
                    if (jr_25.J()) {
                        jr_25.E();
                        return;
                    }
                }
                g1c.c("Allow sleep", null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, m88, 6, 0, 65534);
                return;
            case 27:
                if ((i2 & 11) == 2) {
                    jr_ jr_26 = (jr_) m88;
                    if (jr_26.J()) {
                        jr_26.E();
                        return;
                    }
                }
                f7Z.v(iTI.g(R.drawable.msic_bedtime_24, m88), null, null, 0, m88, 56, 12);
                return;
            case 28:
                if ((i2 & 11) == 2) {
                    jr_ jr_27 = (jr_) m88;
                    if (jr_27.J()) {
                        jr_27.E();
                        return;
                    }
                }
                g1c.c("Keep awake", null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, m88, 6, 0, 65534);
                return;
        }
    }
}
