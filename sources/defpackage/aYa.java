package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import dev.kdrag0n.virtcontainer.R;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: aYa  reason: default package */
/* loaded from: classes.dex */
public class aYa implements nYE, aoz, cof, azg, hKX, nD1 {
    public static aYa R;
    public final /* synthetic */ int e;

    public /* synthetic */ aYa(int i) {
        this.e = i;
    }

    public static boolean C(String str) {
        if (str != null) {
            if (str.length() > 0) {
                return true;
            }
        }
        return false;
    }

    public static String H(Context context, int i) {
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            return context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static iB8 O(TypedValue typedValue, iB8 ib8, fqU fqu, String str, String str2) {
        if (ib8 == null || ib8 == fqu) {
            return ib8 == null ? fqu : ib8;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    public static String U(Class cls) {
        LinkedHashMap linkedHashMap = hFh.v;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            mEz mez = (mEz) cls.getAnnotation(mEz.class);
            str = mez != null ? mez.value() : null;
            if (C(str)) {
                linkedHashMap.put(cls, str);
            } else {
                StringBuilder U = opT.U("No @Navigator.Name annotation found for ");
                U.append(cls.getSimpleName());
                throw new IllegalArgumentException(U.toString().toString());
            }
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.e_ Z(defpackage.yn r11, defpackage.wJ r12, defpackage.mV r13, defpackage.jY r14, java.net.Socket r15) {
        /*
        // Method dump skipped, instructions count: 479
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aYa.Z(yn, wJ, mV, jY, java.net.Socket):e_");
    }

    public static j5B m(Context context, e9E e9e, Bundle bundle, iMP imp, bJ3 bj3) {
        return new j5B(context, e9e, bundle, imp, bj3, UUID.randomUUID().toString(), null);
    }

    public static String x(String str) {
        return str != null ? opT.H("android-app://androidx.navigation/", str) : "";
    }

    @Override // defpackage.aoz
    public final void L(int i, Object obj) {
    }

    @Override // defpackage.hKX
    public final /* synthetic */ Object R() {
        switch (this.e) {
            case 15:
                return new gMW();
            default:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(mTl.R);
                vd.A(newSingleThreadExecutor);
                return newSingleThreadExecutor;
        }
    }

    @Override // defpackage.nD1
    public final Object X(String str, Provider provider) {
        switch (this.e) {
            case 23:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 24:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 25:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // defpackage.azg
    public final Object c() {
        return null;
    }

    @Override // defpackage.nYE
    public final CharSequence e(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        editTextPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return ((Preference) editTextPreference).R.getString(R.string.not_set);
        }
        return null;
    }

    @Override // defpackage.cof
    public final fIY v(bOp bop) {
        return new fvO(bop.f1618R, bop.f1619R, bop.R, bop.f1620R);
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aYa(int i, int i2) {
        this(0);
        this.e = i;
        if (i == 10) {
            this(10);
        } else if (i == 14) {
            this(14);
        } else if (i == 28) {
            this(28);
        } else if (i != 29) {
            switch (i) {
                case 1:
                    this(1);
                    return;
                case 2:
                    this(2);
                    return;
                case 3:
                    this(3);
                    return;
                case 4:
                    this(4);
                    return;
                case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    this(5);
                    return;
                case 6:
                    this(6);
                    return;
                default:
                    return;
            }
        } else {
            this(29);
        }
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aYa(Object obj) {
        this(18);
        this.e = 18;
    }
}
