package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.Map;

/* renamed from: iJF  reason: default package */
/* loaded from: classes.dex */
public final class iJF extends k8G implements iv7 {

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ int f4536X;
    public static final iJF R = new iJF(0);
    public static final iJF v = new iJF(1);
    public static final iJF c = new iJF(2);
    public static final iJF e = new iJF(3);
    public static final iJF X = new iJF(4);
    public static final iJF O = new iJF(5);
    public static final iJF L = new iJF(6);
    public static final iJF Z = new iJF(7);
    public static final iJF m = new iJF(8);
    public static final iJF x = new iJF(9);
    public static final iJF H = new iJF(10);
    public static final iJF U = new iJF(11);
    public static final iJF C = new iJF(12);
    public static final iJF N = new iJF(13);
    public static final iJF P = new iJF(14);
    public static final iJF j = new iJF(15);
    public static final iJF g = new iJF(16);
    public static final iJF y = new iJF(17);
    public static final iJF t = new iJF(18);
    public static final iJF i = new iJF(19);
    public static final iJF V = new iJF(20);
    public static final iJF o = new iJF(21);
    public static final iJF K = new iJF(22);
    public static final iJF J = new iJF(23);
    public static final iJF Y = new iJF(24);
    public static final iJF h = new iJF(25);
    public static final iJF I = new iJF(26);
    public static final iJF u = new iJF(27);
    public static final iJF z = new iJF(28);
    public static final iJF n = new iJF(29);

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iJF(int i2) {
        super(2);
        this.f4536X = i2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        boolean z2 = false;
        switch (this.f4536X) {
            case 0:
                dWm dwm = (dWm) obj;
                return Integer.valueOf(((hNI) obj2).X());
            case 1:
                return Integer.valueOf(dq.f2881R.R(0, ((Number) obj).intValue(), (mdz) obj2));
            case 2:
                return R((cxM) obj, ((Number) obj2).intValue());
            case 3:
                return R((cxM) obj, ((Number) obj2).intValue());
            case 4:
                return R((cxM) obj, ((Number) obj2).intValue());
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return R((cxM) obj, ((Number) obj2).intValue());
            case 6:
                return R((cxM) obj, ((Number) obj2).intValue());
            case 7:
                return R((cxM) obj, ((Number) obj2).intValue());
            case VmNativeCallback.$stable:
                return R((cxM) obj, ((Number) obj2).intValue());
            case 9:
                return R((cxM) obj, ((Number) obj2).intValue());
            case 10:
                return R((cxM) obj, ((Number) obj2).intValue());
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                return R((cxM) obj, ((Number) obj2).intValue());
            case 12:
                return R((cxM) obj, ((Number) obj2).intValue());
            case 13:
                return R((cxM) obj, ((Number) obj2).intValue());
            case 14:
                return R((cxM) obj, ((Number) obj2).intValue());
            case 15:
                return R((cxM) obj, ((Number) obj2).intValue());
            case 16:
                return R((cxM) obj, ((Number) obj2).intValue());
            case 17:
                return R((cxM) obj, ((Number) obj2).intValue());
            case 18:
                dWm dwm2 = (dWm) obj;
                oey oey = (oey) obj2;
                return pdD.Y(Integer.valueOf(oey.O()), Integer.valueOf(((Number) oey.f6878R.v.getValue()).intValue()));
            case 19:
                dWm dwm3 = (dWm) obj;
                Map c2 = ((gx6) obj2).c();
                if (c2.isEmpty()) {
                    return null;
                }
                return c2;
            case 20:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 21:
                dWm dwm4 = (dWm) obj;
                ceM cem = (ceM) obj2;
                Object[] objArr = new Object[2];
                objArr[0] = Float.valueOf(cem.R());
                if (((nLK) cem.c.getValue()) == nLK.Vertical) {
                    z2 = true;
                }
                objArr[1] = Boolean.valueOf(z2);
                return pdD.Y(objArr);
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

    public final Integer R(cxM cxm, int i2) {
        switch (this.f4536X) {
            case 2:
                return Integer.valueOf(cxm.Z(i2));
            case 3:
                return Integer.valueOf(cxm.k(i2));
            case 4:
                return Integer.valueOf(cxm.k(i2));
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return Integer.valueOf(cxm.Z(i2));
            case 6:
                return Integer.valueOf(cxm.zw(i2));
            case 7:
                return Integer.valueOf(cxm.k(i2));
            case VmNativeCallback.$stable:
                return Integer.valueOf(cxm.ZW(i2));
            case 9:
                return Integer.valueOf(cxm.Z(i2));
            case 10:
                return Integer.valueOf(cxm.Z(i2));
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                return Integer.valueOf(cxm.k(i2));
            case 12:
                return Integer.valueOf(cxm.k(i2));
            case 13:
                return Integer.valueOf(cxm.Z(i2));
            case 14:
                return Integer.valueOf(cxm.zw(i2));
            case 15:
                return Integer.valueOf(cxm.k(i2));
            case 16:
                return Integer.valueOf(cxm.ZW(i2));
            default:
                return Integer.valueOf(cxm.Z(i2));
        }
    }

    public final void v(m88 m88, int i2) {
        switch (this.f4536X) {
            case 20:
                if ((i2 & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                    return;
                }
                return;
            case 21:
            default:
                if ((i2 & 11) == 2) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                if ((i2 & 11) == 2) {
                    jr_ jr_3 = (jr_) m88;
                    if (jr_3.J()) {
                        jr_3.E();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                if ((i2 & 11) == 2) {
                    jr_ jr_4 = (jr_) m88;
                    if (jr_4.J()) {
                        jr_4.E();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                if ((i2 & 11) == 2) {
                    jr_ jr_5 = (jr_) m88;
                    if (jr_5.J()) {
                        jr_5.E();
                        return;
                    }
                    return;
                }
                return;
            case 25:
                if ((i2 & 11) == 2) {
                    jr_ jr_6 = (jr_) m88;
                    if (jr_6.J()) {
                        jr_6.E();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                if ((i2 & 11) == 2) {
                    jr_ jr_7 = (jr_) m88;
                    if (jr_7.J()) {
                        jr_7.E();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                if ((i2 & 11) == 2) {
                    jr_ jr_8 = (jr_) m88;
                    if (jr_8.J()) {
                        jr_8.E();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                if ((i2 & 11) == 2) {
                    jr_ jr_9 = (jr_) m88;
                    if (jr_9.J()) {
                        jr_9.E();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
