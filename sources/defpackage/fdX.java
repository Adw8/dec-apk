package defpackage;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: fdX  reason: default package */
/* loaded from: classes.dex */
public final class fdX {
    public static final fdX R = new fdX();

    public final Object R(d5E d5e) {
        ArrayList arrayList = new ArrayList(a6.B(d5e, 10));
        Iterator<E> it = d5e.iterator();
        while (it.hasNext()) {
            arrayList.add(((kA9) it.next()).R.R);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void v(Vw vw, d5E d5e) {
        ArrayList arrayList = new ArrayList(a6.B(d5e, 10));
        Iterator<E> it = d5e.iterator();
        while (it.hasNext()) {
            arrayList.add(((kA9) it.next()).R.R);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        vw.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
