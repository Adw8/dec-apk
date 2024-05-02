package defpackage;

import android.graphics.Matrix;
import android.view.View;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: ky1  reason: default package */
/* loaded from: classes.dex */
public final class ky1 extends k8G implements iv7 {

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ int f5532X;
    public static final ky1 R = new ky1(0);
    public static final ky1 v = new ky1(1);
    public static final ky1 c = new ky1(2);
    public static final ky1 e = new ky1(3);
    public static final ky1 X = new ky1(4);
    public static final ky1 O = new ky1(5);
    public static final ky1 L = new ky1(6);
    public static final ky1 Z = new ky1(7);
    public static final ky1 m = new ky1(8);
    public static final ky1 x = new ky1(9);
    public static final ky1 H = new ky1(10);
    public static final ky1 U = new ky1(11);
    public static final ky1 C = new ky1(12);
    public static final ky1 N = new ky1(13);
    public static final ky1 P = new ky1(14);
    public static final ky1 j = new ky1(15);
    public static final ky1 g = new ky1(16);
    public static final ky1 y = new ky1(17);
    public static final ky1 t = new ky1(18);
    public static final ky1 i = new ky1(19);
    public static final ky1 V = new ky1(20);
    public static final ky1 o = new ky1(21);
    public static final ky1 K = new ky1(22);
    public static final ky1 J = new ky1(23);
    public static final ky1 Y = new ky1(24);
    public static final ky1 h = new ky1(25);
    public static final ky1 I = new ky1(26);
    public static final ky1 u = new ky1(27);
    public static final ky1 z = new ky1(28);
    public static final ky1 n = new ky1(29);

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ky1(int i2) {
        super(2);
        this.f5532X = i2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        boolean z2 = true;
        switch (this.f5532X) {
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
                return R((cxM) obj, ((Number) obj2).intValue());
            case 4:
                return R((cxM) obj, ((Number) obj2).intValue());
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
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
                dWm dwm = (dWm) obj;
                lqA lqa = (lqA) obj2;
                return pdD.Y(Float.valueOf(lqa.v()), Float.valueOf(lqa.R()), Float.valueOf(((Number) lqa.v.getValue()).floatValue()));
            case 12:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 13:
                aWo awo = (aWo) obj;
                oOe ooe = (oOe) obj2;
                if (awo == null || (aWo.e(awo.f906R) >= ((float) ooe.R) && aWo.e(awo.f906R) <= ((float) ooe.c) && aWo.X(awo.f906R) >= ((float) ooe.v) && aWo.X(awo.f906R) <= ((float) ooe.e))) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 14:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 15:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 16:
                dWm dwm2 = (dWm) obj;
                oVq ovq = (oVq) obj2;
                LinkedHashMap linkedHashMap = new LinkedHashMap(ovq.f6837R);
                for (nKg nkg : ovq.f6836R.values()) {
                    nkg.R(linkedHashMap);
                }
                if (linkedHashMap.isEmpty()) {
                    return null;
                }
                return linkedHashMap;
            case 17:
                dWm dwm3 = (dWm) obj;
                return obj2;
            case 18:
                String str = (String) obj;
                eo1 eo1 = (eo1) obj2;
                if (str.length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    return eo1.toString();
                }
                return str + ", " + eo1;
            case 19:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 20:
                ((fue) ((h1U) obj)).G((jJj) obj2);
                return o8s.R;
            case 21:
                mdz mdz = (mdz) obj2;
                fue fue = (fue) ((h1U) obj);
                if (fue.f3603R != mdz) {
                    fue.f3603R = mdz;
                    fue.V();
                    fue N2 = fue.N();
                    if (N2 != null) {
                        N2.t();
                    }
                    fue.i();
                }
                return o8s.R;
            case 22:
                ((fue) ((h1U) obj)).B((bF9) obj2);
                return o8s.R;
            case 23:
                ((fue) ((h1U) obj)).l((ncu) obj2);
                return o8s.R;
            case 24:
                ((fue) ((h1U) obj)).f3592R = (bUo) obj2;
                return o8s.R;
            case 25:
                v((m88) obj, ((Number) obj2).intValue());
                return o8s.R;
            case 26:
                ((nGN) ((b7F) obj)).v((Matrix) obj2);
                return o8s.R;
            case 27:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                return o8s.R;
            case 28:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(list2);
                return arrayList;
            default:
                o8s o8s = (o8s) obj2;
                return (o8s) obj;
        }
    }

    public final Integer R(cxM cxm, int i2) {
        switch (this.f5532X) {
            case 3:
                return Integer.valueOf(cxm.Z(i2));
            case 4:
                return Integer.valueOf(cxm.k(i2));
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return Integer.valueOf(cxm.zw(i2));
            case 6:
                return Integer.valueOf(cxm.ZW(i2));
            case 7:
                return Integer.valueOf(cxm.Z(i2));
            case VmNativeCallback.$stable:
                return Integer.valueOf(cxm.k(i2));
            case 9:
                return Integer.valueOf(cxm.zw(i2));
            default:
                return Integer.valueOf(cxm.ZW(i2));
        }
    }

    public final void v(m88 m88, int i2) {
        switch (this.f5532X) {
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
                if ((i2 & 11) == 2) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if ((i2 & 11) == 2) {
                    jr_ jr_3 = (jr_) m88;
                    if (jr_3.J()) {
                        jr_3.E();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                if ((i2 & 11) == 2) {
                    jr_ jr_4 = (jr_) m88;
                    if (jr_4.J()) {
                        jr_4.E();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                if ((i2 & 11) == 2) {
                    jr_ jr_5 = (jr_) m88;
                    if (jr_5.J()) {
                        jr_5.E();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                if ((i2 & 11) == 2) {
                    jr_ jr_6 = (jr_) m88;
                    if (jr_6.J()) {
                        jr_6.E();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                if ((i2 & 11) == 2) {
                    jr_ jr_7 = (jr_) m88;
                    if (jr_7.J()) {
                        jr_7.E();
                        return;
                    }
                    return;
                }
                return;
            default:
                if ((i2 & 11) == 2) {
                    jr_ jr_8 = (jr_) m88;
                    if (jr_8.J()) {
                        jr_8.E();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
