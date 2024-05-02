package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;

/* renamed from: go2  reason: default package */
/* loaded from: classes.dex */
public final class go2 extends k8G implements iv7 {

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ int f3933X;
    public static final go2 R = new go2(0);
    public static final go2 v = new go2(1);
    public static final go2 c = new go2(2);
    public static final go2 e = new go2(3);
    public static final go2 X = new go2(4);
    public static final go2 O = new go2(5);
    public static final go2 L = new go2(6);
    public static final go2 Z = new go2(7);
    public static final go2 m = new go2(8);
    public static final go2 x = new go2(9);
    public static final go2 H = new go2(10);
    public static final go2 U = new go2(11);
    public static final go2 C = new go2(12);
    public static final go2 N = new go2(13);
    public static final go2 P = new go2(14);
    public static final go2 j = new go2(15);
    public static final go2 g = new go2(16);
    public static final go2 y = new go2(17);
    public static final go2 t = new go2(18);
    public static final go2 i = new go2(19);
    public static final go2 V = new go2(20);
    public static final go2 o = new go2(21);

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ go2(int i2) {
        super(2);
        this.f3933X = i2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        boolean z = true;
        switch (this.f3933X) {
            case 0:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 1:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 2:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 3:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 4:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
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
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 12:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 13:
                String str = (String) obj;
                hdJ hdj = (hdJ) obj2;
                if (str.length() != 0) {
                    z = false;
                }
                if (z) {
                    return hdj.toString();
                }
                return str + ", " + hdj;
            case 14:
                return R((hdJ) obj2, (nbD) obj);
            case 15:
                return R((hdJ) obj2, (nbD) obj);
            case 16:
                hdJ hdj2 = (hdJ) obj2;
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 17:
                return Boolean.valueOf(n3x.v(obj, obj2));
            case 18:
                hdJ hdj3 = (hdJ) obj2;
                return Integer.valueOf(((Number) obj).intValue() + 1);
            case 19:
                hdJ hdj4 = (hdJ) obj2;
                return obj;
            case 20:
                oHm ohm = (oHm) obj;
                hdJ hdj5 = (hdJ) obj2;
                if (ohm != null) {
                    return ohm;
                }
                return null;
            default:
                hdJ hdj6 = (hdJ) obj2;
                return (gFT) obj;
        }
    }

    public final nbD R(hdJ hdj, nbD nbd) {
        _5 _5;
        switch (this.f3933X) {
            case 14:
                nbD H2 = nbd.H(hdj.R());
                aIH aih = aIH.R;
                if (H2 == aih) {
                    return hdj;
                }
                hw1 hw1 = hw1.c;
                mx9 mx9 = (mx9) H2.O(hw1);
                if (mx9 == null) {
                    _5 = new _5(hdj, H2);
                } else {
                    nbD H3 = H2.H(hw1);
                    if (H3 == aih) {
                        return new _5(mx9, hdj);
                    }
                    _5 = new _5(mx9, new _5(hdj, H3));
                }
                return _5;
            default:
                return nbd.M(hdj);
        }
    }

    public final void v(m88 m88, int i2) {
        switch (this.f3933X) {
            case 0:
                if ((i2 & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                g1c.c("Stop", null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, m88, 6, 0, 65534);
                return;
            case 1:
                if ((i2 & 11) == 2) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                f7Z.v(iTI.g(R.drawable.msic_power_settings_new_24, m88), null, null, 0, m88, 56, 12);
                return;
            case 2:
                if ((i2 & 11) == 2) {
                    jr_ jr_3 = (jr_) m88;
                    if (jr_3.J()) {
                        jr_3.E();
                        return;
                    }
                }
                f7Z.R(biy.H(), "Add container", null, 0, m88, 48, 12);
                return;
            case 3:
                if ((i2 & 11) == 2) {
                    jr_ jr_4 = (jr_) m88;
                    if (jr_4.J()) {
                        jr_4.E();
                        return;
                    }
                }
                nUO nuo = dTl.f2623R;
                if (nuo == null) {
                    f0G f0g = new f0G("Outlined.Add");
                    int i3 = jnb.R;
                    oSW osw = new oSW(n3.v);
                    jGl jgl = new jGl();
                    jgl.Z(19.0f, 13.0f);
                    jgl.X(-6.0f);
                    jgl.H(6.0f);
                    jgl.X(-2.0f);
                    jgl.H(-6.0f);
                    jgl.e(5.0f);
                    jgl.H(-2.0f);
                    jgl.X(6.0f);
                    jgl.x(5.0f);
                    jgl.X(2.0f);
                    jgl.H(6.0f);
                    jgl.X(6.0f);
                    jgl.H(2.0f);
                    jgl.R();
                    f0G.c(f0g, jgl.R, osw);
                    nuo = f0g.e();
                    dTl.f2623R = nuo;
                }
                f7Z.R(nuo, "Add port forward", null, 0, m88, 48, 12);
                return;
            case 4:
                if ((i2 & 11) == 2) {
                    jr_ jr_5 = (jr_) m88;
                    if (jr_5.J()) {
                        jr_5.E();
                        return;
                    }
                }
                f7Z.R(dxh.c(), "Delete", null, 0, m88, 48, 12);
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                if ((i2 & 11) == 2) {
                    jr_ jr_6 = (jr_) m88;
                    if (jr_6.J()) {
                        jr_6.E();
                        return;
                    }
                }
                nUO nuo2 = n1P.f6269R;
                if (nuo2 == null) {
                    f0G f0g2 = new f0G("Outlined.Done");
                    int i4 = jnb.R;
                    oSW osw2 = new oSW(n3.v);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new jls(9.0f, 16.2f));
                    arrayList.add(new lug(4.8f, 12.0f));
                    arrayList.add(new o5j(-1.4f, 1.4f));
                    arrayList.add(new lug(9.0f, 19.0f));
                    arrayList.add(new lug(21.0f, 7.0f));
                    arrayList.add(new o5j(-1.4f, -1.4f));
                    arrayList.add(new lug(9.0f, 16.2f));
                    arrayList.add(gqW.R);
                    f0G.c(f0g2, arrayList, osw2);
                    nuo2 = f0g2.e();
                    n1P.f6269R = nuo2;
                }
                f7Z.R(nuo2, "Add port forward", null, 0, m88, 48, 12);
                return;
            case 6:
                if ((i2 & 11) == 2) {
                    jr_ jr_7 = (jr_) m88;
                    if (jr_7.J()) {
                        jr_7.E();
                        return;
                    }
                }
                g1c.c("Container", null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, m88, 6, 0, 65534);
                return;
            case 7:
                if ((i2 & 11) == 2) {
                    jr_ jr_8 = (jr_) m88;
                    if (jr_8.J()) {
                        jr_8.E();
                        return;
                    }
                }
                g1c.c("Container port", null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, m88, 6, 0, 65534);
                return;
            case VmNativeCallback.$stable:
                if ((i2 & 11) == 2) {
                    jr_ jr_9 = (jr_) m88;
                    if (jr_9.J()) {
                        jr_9.E();
                        return;
                    }
                }
                g1c.c("Android port", null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, m88, 6, 0, 65534);
                return;
            case 9:
                if ((i2 & 11) == 2) {
                    jr_ jr_10 = (jr_) m88;
                    if (jr_10.J()) {
                        jr_10.E();
                        return;
                    }
                }
                f7Z.v(iTI.g(R.drawable.msic_keyboard_control_key_24, m88), "Control", null, 0, m88, 56, 12);
                return;
            case 10:
                if ((i2 & 11) == 2) {
                    jr_ jr_11 = (jr_) m88;
                    if (jr_11.J()) {
                        jr_11.E();
                        return;
                    }
                }
                g1c.c("esc", null, 0, gQc.S(13), null, lIe.X, null, 0, null, null, gQc.r((float) 1, 8589934592L), 0, false, 0, null, null, m88, 199686, 6, 64470);
                return;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                if ((i2 & 11) == 2) {
                    jr_ jr_12 = (jr_) m88;
                    if (jr_12.J()) {
                        jr_12.E();
                        return;
                    }
                }
                f7Z.v(iTI.g(R.drawable.msic_keyboard_tab_24, m88), "Tab", null, 0, m88, 56, 12);
                return;
            default:
                if ((i2 & 11) == 2) {
                    jr_ jr_13 = (jr_) m88;
                    if (jr_13.J()) {
                        jr_13.E();
                        return;
                    }
                }
                f7Z.v(iTI.g(R.drawable.msic_keyboard_24, m88), "Show keyboard", null, ((E2) ((jr_) m88).x(_1.R)).i(), m88, 56, 4);
                return;
        }
    }
}
