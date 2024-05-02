package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import dev.kdrag0n.virtcontainer.R;
import java.lang.ref.WeakReference;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

/* renamed from: g5M  reason: default package */
/* loaded from: classes.dex */
public final class g5M extends k8G implements kg9 {

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ int f3671X;
    public static final g5M R = new g5M(0);
    public static final g5M v = new g5M(1);
    public static final g5M c = new g5M(2);
    public static final g5M e = new g5M(3);
    public static final g5M X = new g5M(4);
    public static final g5M O = new g5M(5);
    public static final g5M L = new g5M(7);
    public static final g5M Z = new g5M(8);
    public static final g5M m = new g5M(9);
    public static final g5M x = new g5M(10);
    public static final g5M H = new g5M(11);
    public static final g5M U = new g5M(12);
    public static final g5M C = new g5M(13);
    public static final g5M N = new g5M(14);
    public static final g5M P = new g5M(15);
    public static final g5M j = new g5M(16);
    public static final g5M g = new g5M(17);
    public static final g5M y = new g5M(18);
    public static final g5M t = new g5M(19);
    public static final g5M i = new g5M(20);
    public static final g5M V = new g5M(21);
    public static final g5M o = new g5M(22);
    public static final g5M K = new g5M(23);
    public static final g5M J = new g5M(24);
    public static final g5M Y = new g5M(25);
    public static final g5M h = new g5M(26);
    public static final g5M I = new g5M(27);
    public static final g5M u = new g5M(28);

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g5M(int i2) {
        super(1);
        this.f3671X = i2;
    }

    public final View R(View view) {
        switch (this.f3671X) {
            case 1:
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                ViewParent parent2 = view.getParent();
                if (parent2 instanceof View) {
                    return (View) parent2;
                }
                return null;
        }
    }

    public final Integer c(int i2) {
        int i3 = this.f3671X;
        int i4 = R.string.next;
        switch (i3) {
            case 20:
                switch (i2) {
                    case R.id.onboarding_adb_dev_options /* 2131296621 */:
                        i4 = R.string.onboarding_adb_dev_options_next_button;
                        break;
                    case R.id.onboarding_adb_pair /* 2131296622 */:
                        i4 = R.string.onboarding_adb_pair_next_button;
                        break;
                }
                return Integer.valueOf(i4);
            default:
                switch (i2) {
                    case R.id.onboarding_adb_dev_options /* 2131296621 */:
                        i4 = R.string.onboarding_adb_dev_options_next_button;
                        break;
                    case R.id.onboarding_adb_pair /* 2131296622 */:
                        i4 = R.string.onboarding_adb_pair_next_button;
                        break;
                    case R.id.onboarding_welcome /* 2131296625 */:
                        i4 = R.string.start;
                        break;
                }
                return Integer.valueOf(i4);
        }
    }

    public final String e(String str) {
        switch (this.f3671X) {
            case 15:
                lG0 lg0 = b31.f1513R;
                return lg0.R.matcher(str).replaceAll(afN.R(-42335519495052L));
            default:
                return str;
        }
    }

    public final Float v(liQ liq) {
        switch (this.f3671X) {
            case 6:
                return Float.valueOf(((float) liq.X()) - ((float) 0));
            default:
                return Float.valueOf(Float.MAX_VALUE);
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        boolean z = false;
        switch (this.f3671X) {
            case 0:
                e9E e9e = (e9E) obj;
                if (!(e9e instanceof f25)) {
                    return null;
                }
                f25 f25 = (f25) e9e;
                return f25.V(f25.O, true);
            case 1:
                return R((View) obj);
            case 2:
                Object tag = ((View) obj).getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (mpr) ((WeakReference) tag).get();
                }
                if (tag instanceof mpr) {
                    return (mpr) tag;
                }
                return null;
            case 3:
                ((pwv) obj).f7325R = true;
                return o8s.R;
            case 4:
                return R((View) obj);
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                Object tag2 = ((View) obj).getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag2 instanceof adL) {
                    return (adL) tag2;
                }
                return null;
            case 6:
                return v((liQ) obj);
            case 7:
                return new aD8(((Integer) ((List) obj).get(0)).intValue());
            case VmNativeCallback.$stable:
                return new s6((Context) obj);
            case 9:
                return v((liQ) obj);
            case 10:
                return Integer.valueOf(((Jl) obj).g());
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                Jl jl = (Jl) obj;
                return o8s.R;
            case 12:
                mxl mxl = (mxl) obj;
                return o8s.R;
            case 13:
                return String.format(afN.R(-60524705993612L), Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 14:
                return Boolean.valueOf(iH_._((String) obj, afN.R(-33865843987340L), false));
            case 15:
                return e((String) obj);
            case 16:
                return null;
            case 17:
                return Long.valueOf(((Instant) obj).toEpochMilli());
            case 18:
                return Instant.ofEpochMilli(((Number) obj).longValue());
            case 19:
                if (((dCq) obj) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 20:
                return c(((Number) obj).intValue());
            case 21:
                return c(((Number) obj).intValue());
            case 22:
                return null;
            case 23:
                return obj;
            case 24:
                if (obj == null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 25:
                return e((String) obj);
            case 26:
                hdJ hdj = (hdJ) obj;
                if (hdj instanceof kE9) {
                    return (kE9) hdj;
                }
                return null;
            case 27:
                hdJ hdj2 = (hdJ) obj;
                if (hdj2 instanceof nzn) {
                    return (nzn) hdj2;
                }
                return null;
            case 28:
                return obj;
            default:
                Throwable th = (Throwable) obj;
                return null;
        }
    }
}
