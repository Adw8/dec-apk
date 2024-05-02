package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: G9  reason: default package */
/* loaded from: classes.dex */
public final class G9 extends k8G implements lR3 {

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ int f158X;
    public static final G9 R = new G9(0);
    public static final G9 v = new G9(1);
    public static final G9 c = new G9(2);
    public static final G9 e = new G9(3);
    public static final G9 X = new G9(4);
    public static final G9 O = new G9(5);
    public static final G9 L = new G9(6);
    public static final G9 Z = new G9(7);
    public static final G9 m = new G9(8);
    public static final G9 x = new G9(9);
    public static final G9 H = new G9(13);
    public static final G9 U = new G9(14);
    public static final G9 C = new G9(15);
    public static final G9 N = new G9(16);
    public static final G9 P = new G9(17);
    public static final G9 j = new G9(18);
    public static final G9 g = new G9(19);
    public static final G9 y = new G9(20);
    public static final G9 t = new G9(21);
    public static final G9 i = new G9(22);
    public static final G9 V = new G9(23);
    public static final G9 o = new G9(24);
    public static final G9 K = new G9(25);
    public static final G9 J = new G9(26);
    public static final G9 Y = new G9(27);
    public static final G9 h = new G9(28);

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G9(int i2) {
        super(3);
        this.f158X = i2;
    }

    public final mET O(mZf mzf, pc0 pc0, long j2) {
        switch (this.f158X) {
            case 0:
                l0f L2 = pc0.L(j2);
                int B = mzf.B(r5.R * ((float) 2));
                return mzf.f(L2.mh() - B, L2.JD() - B, iia.R, new sh(L2, B, 0));
            default:
                l0f L3 = pc0.L(j2);
                int B2 = mzf.B(r5.R * ((float) 2));
                return mzf.f(L3.e + B2, L3.X + B2, iia.R, new sh(L3, B2, 1));
        }
    }

    public final ncu R(ncu ncu, m88 m88) {
        switch (this.f158X) {
            case 10:
                jr_ jr_ = (jr_) m88;
                jr_.w(359872873);
                WeakHashMap weakHashMap = kHc.R;
                kHc e2 = f1A.e(jr_);
                jr_.w(1157296644);
                boolean O2 = jr_.O(e2);
                Object I = jr_.I();
                if (O2 || I == ppN.R) {
                    I = new ngP(e2.f5241c);
                    jr_.ZW(I);
                }
                jr_.g(false);
                ngP ngp = (ngP) I;
                jr_.g(false);
                return ngp;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                jr_ jr_2 = (jr_) m88;
                jr_2.w(359872873);
                WeakHashMap weakHashMap2 = kHc.R;
                kHc e3 = f1A.e(jr_2);
                jr_2.w(1157296644);
                boolean O3 = jr_2.O(e3);
                Object I2 = jr_2.I();
                if (O3 || I2 == ppN.R) {
                    I2 = new ngP(e3.f5234O);
                    jr_2.ZW(I2);
                }
                jr_2.g(false);
                ngP ngp2 = (ngP) I2;
                jr_2.g(false);
                return ngp2;
            case 12:
                jr_ jr_3 = (jr_) m88;
                jr_3.w(359872873);
                WeakHashMap weakHashMap3 = kHc.R;
                kHc e4 = f1A.e(jr_3);
                jr_3.w(1157296644);
                boolean O4 = jr_3.O(e4);
                Object I3 = jr_3.I();
                if (O4 || I3 == ppN.R) {
                    I3 = new ngP(e4.L);
                    jr_3.ZW(I3);
                }
                jr_3.g(false);
                ngP ngp3 = (ngP) I3;
                jr_3.g(false);
                return ngp3;
            case 13:
                jr_ jr_4 = (jr_) m88;
                jr_4.w(-2126899193);
                long j2 = ((k1m) jr_4.x(ei2.f3183R)).R;
                n3 n3Var = new n3(j2);
                jr_4.w(1157296644);
                boolean O5 = jr_4.O(n3Var);
                Object I4 = jr_4.I();
                if (O5 || I4 == ppN.R) {
                    I4 = new Qi(j2, 0);
                    jr_4.ZW(I4);
                }
                jr_4.g(false);
                ncu I5 = ncu.I(g4x.g(aff.R, lBz.Y, new nzF(1, (kg9) I4)));
                jr_4.g(false);
                return I5;
            default:
                jr_ jr_5 = (jr_) m88;
                jr_5.w(-1937671640);
                ncu mpl = ((Boolean) jr_5.x(oRd.R)).booleanValue() ? new mPl(((bUo) jr_5.x(lnF.P)).X()) : aff.R;
                jr_5.g(false);
                return mpl;
        }
    }

    public final void X(m88 m88, int i2) {
        switch (this.f158X) {
            case 17:
                if ((i2 & 81) == 16) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                if ((i2 & 81) == 16) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                if ((i2 & 81) == 16) {
                    jr_ jr_3 = (jr_) m88;
                    if (jr_3.J()) {
                        jr_3.E();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                if ((i2 & 81) == 16) {
                    jr_ jr_4 = (jr_) m88;
                    if (jr_4.J()) {
                        jr_4.E();
                        return;
                    }
                    return;
                }
                return;
            default:
                if ((i2 & 81) == 16) {
                    jr_ jr_5 = (jr_) m88;
                    if (jr_5.J()) {
                        jr_5.E();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void c(Su su, mdh mdh, h1W h1w) {
        switch (this.f158X) {
            case 23:
                jr_.h(mdh, su, 0);
                mdh.m();
                return;
            case 24:
                mdh.m();
                return;
            case 25:
                vC.Z(mdh, h1w);
                return;
            case 26:
                if (mdh.m == 0) {
                    mdh.u();
                    mdh.H = 0;
                    mdh.c = (mdh.f6092R.length / 5) - mdh.v;
                    mdh.e = 0;
                    mdh.X = 0;
                    mdh.x = 0;
                    return;
                }
                vC.e("Cannot reset when inserting".toString());
                throw null;
            case 27:
                mdh.d();
                return;
            default:
                mdh.H(0);
                return;
        }
    }

    public final void e(iv7 iv7, m88 m88, int i2) {
        int i3 = 4;
        switch (this.f158X) {
            case 14:
                if ((i2 & 14) == 0) {
                    if (!((jr_) m88).O(iv7)) {
                        i3 = 2;
                    }
                    i2 |= i3;
                }
                if ((i2 & 91) == 18) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                iv7.J(m88, Integer.valueOf(i2 & 14));
                return;
            case 15:
                if ((i2 & 14) == 0) {
                    if (!((jr_) m88).O(iv7)) {
                        i3 = 2;
                    }
                    i2 |= i3;
                }
                if ((i2 & 91) == 18) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                iv7.J(m88, Integer.valueOf(i2 & 14));
                return;
            default:
                if ((i2 & 14) == 0) {
                    if (!((jr_) m88).O(iv7)) {
                        i3 = 2;
                    }
                    i2 |= i3;
                }
                if ((i2 & 91) == 18) {
                    jr_ jr_3 = (jr_) m88;
                    if (jr_3.J()) {
                        jr_3.E();
                        return;
                    }
                }
                iv7.J(m88, Integer.valueOf(i2 & 14));
                return;
        }
    }

    public final Integer v(int i2, int i3, List list) {
        cEt cet = cEt.Vertical;
        cEt cet2 = cEt.Horizontal;
        switch (this.f158X) {
            case 2:
                return Integer.valueOf(msU.U(list, iJF.c, iJF.e, i2, i3, cet2, cet));
            case 3:
                return Integer.valueOf(msU.U(list, iJF.X, iJF.O, i2, i3, cet2, cet2));
            case 4:
                return Integer.valueOf(msU.U(list, iJF.L, iJF.Z, i2, i3, cet2, cet));
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return Integer.valueOf(msU.U(list, iJF.m, iJF.x, i2, i3, cet2, cet2));
            case 6:
                return Integer.valueOf(msU.U(list, iJF.H, iJF.U, i2, i3, cet, cet));
            case 7:
                return Integer.valueOf(msU.U(list, iJF.C, iJF.N, i2, i3, cet, cet2));
            case VmNativeCallback.$stable /* 8 */:
                return Integer.valueOf(msU.U(list, iJF.P, iJF.j, i2, i3, cet, cet));
            default:
                return Integer.valueOf(msU.U(list, iJF.g, iJF.y, i2, i3, cet, cet2));
        }
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        switch (this.f158X) {
            case 0:
                return O((mZf) obj, (pc0) obj2, ((oys) obj3).f7046R);
            case 1:
                return O((mZf) obj, (pc0) obj2, ((oys) obj3).f7046R);
            case 2:
                return v(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 3:
                return v(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 4:
                return v(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return v(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 6:
                return v(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 7:
                return v(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case VmNativeCallback.$stable /* 8 */:
                return v(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 9:
                return v(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 10:
                ((Number) obj3).intValue();
                return R((ncu) obj, (m88) obj2);
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                ((Number) obj3).intValue();
                return R((ncu) obj, (m88) obj2);
            case 12:
                ((Number) obj3).intValue();
                return R((ncu) obj, (m88) obj2);
            case 13:
                ((Number) obj3).intValue();
                return R((ncu) obj, (m88) obj2);
            case 14:
                e((iv7) obj, (m88) obj2, ((Number) obj3).intValue());
                return o8s.R;
            case 15:
                e((iv7) obj, (m88) obj2, ((Number) obj3).intValue());
                return o8s.R;
            case 16:
                e((iv7) obj, (m88) obj2, ((Number) obj3).intValue());
                return o8s.R;
            case 17:
                kM4 km4 = (kM4) obj;
                X((m88) obj2, ((Number) obj3).intValue());
                return o8s.R;
            case 18:
                kM4 km42 = (kM4) obj;
                X((m88) obj2, ((Number) obj3).intValue());
                return o8s.R;
            case 19:
                kM4 km43 = (kM4) obj;
                X((m88) obj2, ((Number) obj3).intValue());
                return o8s.R;
            case 20:
                kM4 km44 = (kM4) obj;
                X((m88) obj2, ((Number) obj3).intValue());
                return o8s.R;
            case 21:
                kM4 km45 = (kM4) obj;
                X((m88) obj2, ((Number) obj3).intValue());
                return o8s.R;
            case 22:
                ((Number) obj3).intValue();
                return R((ncu) obj, (m88) obj2);
            case 23:
                c((Su) obj, (mdh) obj2, (h1W) obj3);
                return o8s.R;
            case 24:
                c((Su) obj, (mdh) obj2, (h1W) obj3);
                return o8s.R;
            case 25:
                c((Su) obj, (mdh) obj2, (h1W) obj3);
                return o8s.R;
            case 26:
                c((Su) obj, (mdh) obj2, (h1W) obj3);
                return o8s.R;
            case 27:
                c((Su) obj, (mdh) obj2, (h1W) obj3);
                return o8s.R;
            case 28:
                c((Su) obj, (mdh) obj2, (h1W) obj3);
                return o8s.R;
            default:
                kzs kzs = (kzs) obj;
                ((Number) obj3).intValue();
                jr_ jr_ = (jr_) ((m88) obj2);
                jr_.w(-1790596922);
                jr_.w(1157296644);
                boolean O2 = jr_.O(kzs);
                Object I = jr_.I();
                if (O2 || I == ppN.R) {
                    I = new dhh(new mCa(4, kzs));
                    jr_.ZW(I);
                }
                jr_.g(false);
                dhh dhh = (dhh) I;
                jr_.w(1157296644);
                boolean O3 = jr_.O(dhh);
                Object I2 = jr_.I();
                if (O3 || I2 == ppN.R) {
                    I2 = new oGC(dhh, 0);
                    jr_.ZW(I2);
                }
                jr_.g(false);
                caw.L((f_c) I2, jr_);
                jr_.g(false);
                return dhh;
        }
    }
}
