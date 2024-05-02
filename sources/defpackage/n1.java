package defpackage;

import android.content.SharedPreferences;
import java.util.Set;

/* renamed from: n1  reason: default package */
/* loaded from: classes.dex */
public final class n1 implements hGS {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final String f6267R;

    public n1(String str, int i) {
        this.R = i;
        if (i == 1) {
            this.f6267R = str;
        } else if (i == 2) {
            this.f6267R = str;
        } else if (i == 3) {
            this.f6267R = str;
        } else if (i == 4) {
            this.f6267R = str;
        } else if (i != 5) {
            this.f6267R = str;
        } else {
            this.f6267R = str;
        }
    }

    @Override // defpackage.oNK
    public final void R(Object obj, icv icv, Object obj2) {
        switch (this.R) {
            case 0:
                p1w p1w = (p1w) obj;
                Boolean bool = (Boolean) obj2;
                if (bool == null) {
                    SharedPreferences.Editor edit = p1w.R().edit();
                    edit.remove(v());
                    edit.apply();
                    return;
                }
                SharedPreferences.Editor edit2 = p1w.R().edit();
                edit2.putBoolean(v(), bool.booleanValue());
                edit2.apply();
                return;
            case 1:
                p1w p1w2 = (p1w) obj;
                Float f = (Float) obj2;
                if (f == null) {
                    SharedPreferences.Editor edit3 = p1w2.R().edit();
                    edit3.remove(v());
                    edit3.apply();
                    return;
                }
                SharedPreferences.Editor edit4 = p1w2.R().edit();
                edit4.putFloat(v(), f.floatValue());
                edit4.apply();
                return;
            case 2:
                p1w p1w3 = (p1w) obj;
                Integer num = (Integer) obj2;
                if (num == null) {
                    SharedPreferences.Editor edit5 = p1w3.R().edit();
                    edit5.remove(v());
                    edit5.apply();
                    return;
                }
                SharedPreferences.Editor edit6 = p1w3.R().edit();
                edit6.putInt(v(), num.intValue());
                edit6.apply();
                return;
            case 3:
                p1w p1w4 = (p1w) obj;
                Long l = (Long) obj2;
                if (l == null) {
                    SharedPreferences.Editor edit7 = p1w4.R().edit();
                    edit7.remove(v());
                    edit7.apply();
                    return;
                }
                SharedPreferences.Editor edit8 = p1w4.R().edit();
                edit8.putLong(v(), l.longValue());
                edit8.apply();
                return;
            case 4:
                p1w p1w5 = (p1w) obj;
                String str = (String) obj2;
                if (str == null) {
                    SharedPreferences.Editor edit9 = p1w5.R().edit();
                    edit9.remove(v());
                    edit9.apply();
                    return;
                }
                SharedPreferences.Editor edit10 = p1w5.R().edit();
                edit10.putString(v(), str);
                edit10.apply();
                return;
            default:
                p1w p1w6 = (p1w) obj;
                Set<String> set = (Set) obj2;
                if (set == null) {
                    SharedPreferences.Editor edit11 = p1w6.R().edit();
                    edit11.remove(v());
                    edit11.apply();
                    return;
                }
                SharedPreferences.Editor edit12 = p1w6.R().edit();
                edit12.putStringSet(v(), set);
                edit12.apply();
                return;
        }
    }

    public final Object c(Object obj, icv icv) {
        switch (this.R) {
            case 0:
                p1w p1w = (p1w) obj;
                if (!p1w.R().contains(v())) {
                    return null;
                }
                return Boolean.valueOf(p1w.R().getBoolean(v(), false));
            case 1:
                p1w p1w2 = (p1w) obj;
                if (!p1w2.R().contains(v())) {
                    return null;
                }
                return Float.valueOf(p1w2.R().getFloat(v(), 0.0f));
            case 2:
                p1w p1w3 = (p1w) obj;
                if (!p1w3.R().contains(v())) {
                    return null;
                }
                return Integer.valueOf(p1w3.R().getInt(v(), 0));
            case 3:
                p1w p1w4 = (p1w) obj;
                if (!p1w4.R().contains(v())) {
                    return null;
                }
                return Long.valueOf(p1w4.R().getLong(v(), 0));
            case 4:
                p1w p1w5 = (p1w) obj;
                if (!p1w5.R().contains(v())) {
                    return null;
                }
                return p1w5.R().getString(v(), null);
            default:
                p1w p1w6 = (p1w) obj;
                if (!p1w6.R().contains(v())) {
                    return null;
                }
                return p1w6.R().getStringSet(v(), lsA.R);
        }
    }

    public final String v() {
        switch (this.R) {
            case 0:
                return this.f6267R;
            case 1:
                return this.f6267R;
            case 2:
                return this.f6267R;
            case 3:
                return this.f6267R;
            case 4:
                return this.f6267R;
            default:
                return this.f6267R;
        }
    }
}
