package defpackage;

import android.content.SharedPreferences;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: nTM  reason: default package */
/* loaded from: classes.dex */
public final class nTM implements SharedPreferences {
    public final SharedPreferences R;

    /* renamed from: R  reason: collision with other field name */
    public final String f6391R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f6392R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public final mZ_ f6393R;

    /* renamed from: R  reason: collision with other field name */
    public final rg f6394R;

    public nTM(String str, SharedPreferences sharedPreferences, rg rgVar, mZ_ mz_) {
        this.f6391R = str;
        this.R = sharedPreferences;
        this.f6394R = rgVar;
        this.f6393R = mz_;
    }

    public static boolean c(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String R(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(_8.v(this.f6393R.v(str.getBytes(StandardCharsets.UTF_8), this.f6391R.getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (GeneralSecurityException e2) {
            StringBuilder U = opT.U("Could not encrypt key. ");
            U.append(e2.getMessage());
            throw new SecurityException(U.toString(), e2);
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (!c(str)) {
            return this.R.contains(R(str));
        }
        throw new SecurityException(opT.H(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new huQ(this, this.R.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.R.getAll().entrySet()) {
            if (!c(entry.getKey())) {
                try {
                    String str = new String(this.f6393R.R(_8.R(0, entry.getKey()), this.f6391R.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    hashMap.put(str, v(str));
                } catch (GeneralSecurityException e) {
                    StringBuilder U = opT.U("Could not decrypt key. ");
                    U.append(e.getMessage());
                    throw new SecurityException(U.toString(), e);
                }
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object v = v(str);
        return (v == null || !(v instanceof Boolean)) ? z : ((Boolean) v).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object v = v(str);
        return (v == null || !(v instanceof Float)) ? f : ((Float) v).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object v = v(str);
        return (v == null || !(v instanceof Integer)) ? i : ((Integer) v).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object v = v(str);
        return (v == null || !(v instanceof Long)) ? j : ((Long) v).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object v = v(str);
        return (v == null || !(v instanceof String)) ? str2 : (String) v;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object v = v(str);
        Set l5 = v instanceof Set ? (Set) v : new L5();
        return l5.size() > 0 ? l5 : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f6392R.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f6392R.remove(onSharedPreferenceChangeListener);
    }

    public final Object v(String str) {
        if (!c(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String R = R(str);
                String string = this.R.getString(R, null);
                if (string == null) {
                    return null;
                }
                boolean z = false;
                ByteBuffer wrap = ByteBuffer.wrap(this.f6394R.v(_8.R(0, string), R.getBytes(StandardCharsets.UTF_8)));
                wrap.position(0);
                int i = wrap.getInt();
                int I = jQ.I(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 6 : 5 : 4 : 3 : 2 : 1);
                if (I == 0) {
                    int i2 = wrap.getInt();
                    ByteBuffer slice = wrap.slice();
                    wrap.limit(i2);
                    String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                    if (charBuffer.equals("__NULL__")) {
                        return null;
                    }
                    return charBuffer;
                } else if (I == 1) {
                    L5 l5 = new L5();
                    while (wrap.hasRemaining()) {
                        int i3 = wrap.getInt();
                        ByteBuffer slice2 = wrap.slice();
                        slice2.limit(i3);
                        wrap.position(wrap.position() + i3);
                        l5.add(StandardCharsets.UTF_8.decode(slice2).toString());
                    }
                    if (l5.f273e != 1 || !"__NULL__".equals(l5.f272R[0])) {
                        return l5;
                    }
                    return null;
                } else if (I == 2) {
                    return Integer.valueOf(wrap.getInt());
                } else {
                    if (I == 3) {
                        return Long.valueOf(wrap.getLong());
                    }
                    if (I == 4) {
                        return Float.valueOf(wrap.getFloat());
                    }
                    if (I != 5) {
                        return null;
                    }
                    if (wrap.get() != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            } catch (GeneralSecurityException e) {
                StringBuilder U = opT.U("Could not decrypt value. ");
                U.append(e.getMessage());
                throw new SecurityException(U.toString(), e);
            }
        } else {
            throw new SecurityException(opT.H(str, " is a reserved key for the encryption keyset."));
        }
    }
}
