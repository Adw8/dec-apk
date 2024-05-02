package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: gjp  reason: default package */
/* loaded from: classes.dex */
public abstract class gjp {
    public static int R(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
