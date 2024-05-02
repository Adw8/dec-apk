package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: m8I  reason: default package */
/* loaded from: classes.dex */
public abstract class m8I {
    public static final HashMap R = new HashMap();

    static {
        if (!"en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            Locale[] availableLocales = Locale.getAvailableLocales();
            for (int i = 0; i != availableLocales.length; i++) {
                if ("en".equalsIgnoreCase(availableLocales[i].getLanguage())) {
                    Locale locale = availableLocales[i];
                    return;
                }
            }
        }
        Locale.getDefault();
    }

    public static Date R(Date date) {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return date;
        }
        HashMap hashMap = R;
        synchronized (hashMap) {
            Long l = (Long) hashMap.get(locale);
            if (l == null) {
                l = Long.valueOf(new SimpleDateFormat("yyyyMMddHHmmssz").parse("19700101000000GMT+00:00").getTime());
                hashMap.put(locale, l);
            }
            if (l.longValue() == 0) {
                return date;
            }
            return new Date(date.getTime() - l.longValue());
        }
    }
}
