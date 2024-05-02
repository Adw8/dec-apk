package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.text.BreakIterator;
import java.util.List;

/* renamed from: ih  reason: default package */
/* loaded from: classes.dex */
public final class ih extends k8G implements kg9 {

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ int f4697X;
    public static final ih R = new ih(0);
    public static final ih v = new ih(1);
    public static final ih c = new ih(3);
    public static final ih e = new ih(4);
    public static final ih X = new ih(5);
    public static final ih O = new ih(7);
    public static final ih L = new ih(8);
    public static final ih Z = new ih(9);
    public static final ih m = new ih(10);
    public static final ih x = new ih(14);
    public static final ih H = new ih(15);
    public static final ih U = new ih(16);
    public static final ih C = new ih(17);
    public static final ih N = new ih(18);
    public static final ih P = new ih(20);
    public static final ih j = new ih(21);
    public static final ih g = new ih(22);
    public static final ih y = new ih(23);
    public static final ih t = new ih(24);
    public static final ih i = new ih(25);
    public static final ih V = new ih(26);
    public static final ih o = new ih(27);
    public static final ih K = new ih(28);
    public static final ih J = new ih(29);

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ih(int i2) {
        super(1);
        this.f4697X = i2;
    }

    public final h7H R(n4U n4u) {
        switch (this.f4697X) {
            case 22:
                int c2 = odN.c(n4u.v);
                String str = n4u.f6287v.R;
                int c3 = odN.c(n4u.v);
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str);
                return new h7H(c2 - characterInstance.preceding(c3), 0);
            case 23:
                String str2 = n4u.f6287v.R;
                int c4 = odN.c(n4u.v);
                BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                characterInstance2.setText(str2);
                int following = characterInstance2.following(c4);
                if (following != -1) {
                    return new h7H(0, following - odN.c(n4u.v));
                }
                return null;
            case 24:
                iRR irr = n4u.f6284R;
                Integer valueOf = irr != null ? Integer.valueOf(n4u.X(irr, n4u.f6282R.Z(odN.c(n4u.v)))) : null;
                if (valueOf == null) {
                    return null;
                }
                return new h7H(odN.c(n4u.v) - valueOf.intValue(), 0);
            case 25:
                iRR irr2 = n4u.f6284R;
                Integer valueOf2 = irr2 != null ? Integer.valueOf(n4u.e(irr2, n4u.f6282R.Z(odN.c(n4u.v)))) : null;
                if (valueOf2 != null) {
                    return new h7H(0, valueOf2.intValue() - odN.c(n4u.v));
                }
                return null;
            case 26:
                Integer c5 = n4u.c();
                if (c5 == null) {
                    return null;
                }
                return new h7H(odN.c(n4u.v) - c5.intValue(), 0);
            default:
                Integer v2 = n4u.v();
                if (v2 != null) {
                    return new h7H(0, v2.intValue() - odN.c(n4u.v));
                }
                return null;
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        int i2 = this.f4697X;
        switch (i2) {
            case 0:
                ((jDh) ((ohT) obj)).v();
                return o8s.R;
            case 1:
                ((cX2) obj).f2125R = false;
                return o8s.R;
            case 2:
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
            case 12:
            case 13:
            default:
                d5M d5m = (d5M) obj;
                return o8s.R;
            case 3:
                jJj jjj = (jJj) obj;
                return new aWo(aWo.e);
            case 4:
                j07 j07 = j07.R;
                b_t b_t = onS.v;
                icv icv = onS.f6950R[1];
                b_t.R((bNL) obj, j07);
                return o8s.R;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return new hNI(((Number) obj).intValue());
            case 6:
                long j2 = ((aWo) obj).f906R;
                return o8s.R;
            case 7:
                phU phu = (phU) obj;
                return Boolean.TRUE;
            case VmNativeCallback.$stable:
                h57 h57 = (h57) obj;
                return o8s.R;
            case 9:
                h57 h572 = (h57) obj;
                return o8s.R;
            case 10:
                h57 h573 = (h57) obj;
                return o8s.R;
            case 14:
                h57 h574 = (h57) obj;
                return o8s.R;
            case 15:
                ((Number) obj).intValue();
                return null;
            case 16:
                List list = (List) obj;
                return new oey(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 17:
                return Long.valueOf(((Number) obj).longValue());
            case 18:
                hvS hvs = (hvS) obj;
                hvs.R = 1000;
                hvs.R(0, Float.valueOf(1.0f));
                hvs.R(499, Float.valueOf(1.0f));
                hvs.R(500, Float.valueOf(0.0f));
                hvs.R(999, Float.valueOf(0.0f));
                return o8s.R;
            case 19:
                d5M d5m2 = (d5M) obj;
                return o8s.R;
            case 20:
                n4U n4u = (n4U) obj;
                switch (i2) {
                    case 20:
                        n4u.m();
                        break;
                    default:
                        n4u.g();
                        break;
                }
                return o8s.R;
            case 21:
                n4U n4u2 = (n4U) obj;
                switch (i2) {
                    case 20:
                        n4u2.m();
                        break;
                    default:
                        n4u2.g();
                        break;
                }
                return o8s.R;
            case 22:
                return R((n4U) obj);
            case 23:
                return R((n4U) obj);
            case 24:
                return R((n4U) obj);
            case 25:
                return R((n4U) obj);
            case 26:
                return R((n4U) obj);
            case 27:
                return R((n4U) obj);
            case 28:
                List list2 = (List) obj;
                return new ceM(((Boolean) list2.get(1)).booleanValue() ? nLK.Vertical : nLK.Horizontal, ((Float) list2.get(0)).floatValue());
        }
    }
}
