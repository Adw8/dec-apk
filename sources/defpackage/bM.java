package defpackage;

import android.os.LocaleList;
import android.widget.TextView;

/* renamed from: bM  reason: default package */
/* loaded from: classes.dex */
public abstract class bM {
    public static LocaleList R(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void v(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
