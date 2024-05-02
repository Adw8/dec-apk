package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: jYq  reason: default package */
/* loaded from: classes.dex */
public final class jYq implements SharedPreferences.Editor {
    public final /* synthetic */ iIX R;

    /* renamed from: R  reason: collision with other field name */
    public final HashMap f4966R = new HashMap();

    /* renamed from: R  reason: collision with other field name */
    public volatile boolean f4967R;

    public jYq(iIX iix) {
        this.R = iix;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized void apply() {
        iIX iix = this.R;
        synchronized (iix.R) {
            if (this.f4967R) {
                iix.R.clear();
            } else {
                for (Map.Entry entry : this.f4966R.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (!(value == ppN.x || value == null)) {
                        iix.R.put(str, value);
                    }
                    iix.R.remove(str);
                }
            }
        }
        iIX iix2 = this.R;
        synchronized (iix2.f4533R) {
            if (this.f4967R) {
                for (Map.Entry entry2 : iix2.f4533R.entrySet()) {
                    ((SharedPreferences.OnSharedPreferenceChangeListener) entry2.getKey()).onSharedPreferenceChanged(iix2, null);
                }
            } else {
                for (Map.Entry entry3 : this.f4966R.entrySet()) {
                    String str2 = (String) entry3.getKey();
                    for (Map.Entry entry4 : iix2.f4533R.entrySet()) {
                        ((SharedPreferences.OnSharedPreferenceChangeListener) entry4.getKey()).onSharedPreferenceChanged(iix2, str2);
                    }
                }
            }
        }
        this.f4967R = false;
        this.f4966R.clear();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f4967R = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        apply();
        return true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        synchronized (this) {
            this.f4966R.put(str, Boolean.valueOf(z));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        synchronized (this) {
            this.f4966R.put(str, Float.valueOf(f));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        synchronized (this) {
            this.f4966R.put(str, Integer.valueOf(i));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        synchronized (this) {
            this.f4966R.put(str, Long.valueOf(j));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        synchronized (this) {
            this.f4966R.put(str, str2);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        synchronized (this) {
            this.f4966R.put(str, set);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        synchronized (this) {
            this.f4966R.put(str, ppN.x);
        }
        return this;
    }
}
