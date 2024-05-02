package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.CharConversionException;
import java.io.FileNotFoundException;

/* renamed from: lxg  reason: default package */
/* loaded from: classes.dex */
public final class lxg {
    public final SharedPreferences R;

    /* renamed from: R  reason: collision with other field name */
    public final String f5864R;

    public lxg(Context context, String str, String str2) {
        this.f5864R = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.R = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        } else {
            this.R = applicationContext.getSharedPreferences(str2, 0);
        }
    }

    public final dxG R() {
        return dxG.K(c(), nCG.R());
    }

    public final byte[] c() {
        try {
            String string = this.R.getString(this.f5864R, null);
            if (string != null) {
                return lTs.O(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", this.f5864R));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", this.f5864R));
        }
    }

    public final lH1 v() {
        return lH1.i(c(), nCG.R());
    }
}
