package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: iIX  reason: default package */
/* loaded from: classes.dex */
public final class iIX implements SharedPreferences {
    public final HashMap R = new HashMap();

    /* renamed from: R  reason: collision with other field name */
    public final WeakHashMap f4533R = new WeakHashMap();

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        boolean containsKey;
        synchronized (this.R) {
            containsKey = this.R.containsKey(str);
        }
        return containsKey;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new jYq(this);
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap hashMap;
        synchronized (this.R) {
            hashMap = new HashMap(this.R);
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        synchronized (this.R) {
            Boolean bool = (Boolean) this.R.get(str);
            if (bool != null) {
                z = bool.booleanValue();
            }
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        synchronized (this.R) {
            Float f2 = (Float) this.R.get(str);
            if (f2 != null) {
                f = f2.floatValue();
            }
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        synchronized (this.R) {
            Integer num = (Integer) this.R.get(str);
            if (num != null) {
                i = num.intValue();
            }
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        synchronized (this.R) {
            Long l = (Long) this.R.get(str);
            if (l != null) {
                j = l.longValue();
            }
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        synchronized (this.R) {
            String str3 = (String) this.R.get(str);
            if (str3 != null) {
                str2 = str3;
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        synchronized (this.R) {
            Set set2 = (Set) this.R.get(str);
            if (set2 != null) {
                set = set2;
            }
        }
        return set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f4533R) {
            this.f4533R.put(onSharedPreferenceChangeListener, o8s.R);
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f4533R) {
            this.f4533R.remove(onSharedPreferenceChangeListener);
        }
    }
}
