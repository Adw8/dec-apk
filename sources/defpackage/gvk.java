package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import dev.kdrag0n.virt.vm.ForwardedPort;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.Date;
import java.util.WeakHashMap;

/* renamed from: gvk  reason: default package */
/* loaded from: classes.dex */
public final class gvk implements Comparator {
    public final /* synthetic */ int R;

    public /* synthetic */ gvk(int i) {
        this.R = i;
    }

    public final int R(View view, View view2) {
        switch (this.R) {
            case 3:
                WeakHashMap weakHashMap = of5.f6887R;
                float C = m18.C(view);
                float C2 = m18.C(view2);
                if (C > C2) {
                    return -1;
                }
                return C < C2 ? 1 : 0;
            default:
                return view.getTop() - view2.getTop();
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.R;
        switch (i) {
            case 0:
                return gvP.N(Integer.valueOf(((pnH) obj).R), Integer.valueOf(((pnH) obj2).R));
            case 1:
                fue fue = (fue) obj;
                fue fue2 = (fue) obj2;
                int O = n3x.O(fue.O, fue2.O);
                return O != 0 ? O : n3x.O(fue.hashCode(), fue2.hashCode());
            case 2:
                return gvP.N(Integer.valueOf(((m3) obj).R), Integer.valueOf(((m3) obj2).R));
            case 3:
                return R((View) obj, (View) obj2);
            case 4:
                ekT ekt = (ekT) obj;
                ekT ekt2 = (ekT) obj2;
                RecyclerView recyclerView = ekt.f3190R;
                if ((recyclerView == null) == (ekt2.f3190R == null)) {
                    boolean z = ekt.f3191R;
                    if (z == ekt2.f3191R) {
                        int i2 = ekt2.R - ekt.R;
                        if (i2 == 0 && (i2 = ekt.v - ekt2.v) == 0) {
                            return 0;
                        }
                        return i2;
                    } else if (!z) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return R((View) obj, (View) obj2);
            case 6:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                switch (i) {
                    case 6:
                        return comparable.compareTo(comparable2);
                    default:
                        return comparable.compareTo(comparable2);
                }
            case 7:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                switch (i) {
                    case 6:
                        return comparable3.compareTo(comparable4);
                    default:
                        return comparable3.compareTo(comparable4);
                }
            case VmNativeCallback.$stable:
                return gvP.N(((lzd) obj).R, ((lzd) obj2).R);
            case 9:
                return gvP.N(((ForwardedPort) obj).toString(), ((ForwardedPort) obj2).toString());
            case 10:
                return ((Date) ((H4) obj).R.clone()).compareTo((Date) ((H4) obj2).R.clone());
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                jNC jnc = (jNC) obj;
                jNC jnc2 = (jNC) obj2;
                jnc.getClass();
                Double e = jnc.e(null);
                jnc2.getClass();
                Double e2 = jnc2.e(null);
                if (e == null) {
                    return -1;
                }
                if (e2 == null) {
                    return 1;
                }
                return e.compareTo(e2);
            case 12:
                return gvP.N(Integer.valueOf(((Constructor) obj2).getParameterTypes().length), Integer.valueOf(((Constructor) obj).getParameterTypes().length));
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                int min = Math.min(str.length(), str2.length());
                int i3 = 4;
                while (true) {
                    if (i3 >= min) {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length >= length2) {
                            return 1;
                        }
                    } else {
                        char charAt = str.charAt(i3);
                        char charAt2 = str2.charAt(i3);
                        if (charAt == charAt2) {
                            i3++;
                        } else if (n3x.O(charAt, charAt2) >= 0) {
                            return 1;
                        }
                    }
                }
                return -1;
        }
    }
}
