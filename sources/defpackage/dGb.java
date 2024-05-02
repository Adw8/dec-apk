package defpackage;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: dGb  reason: default package */
/* loaded from: classes.dex */
public abstract class dGb {
    public static AtomicReference R = new AtomicReference();

    public static long R(long j) {
        Calendar e = e(null);
        e.setTimeInMillis(j);
        return v(e).getTimeInMillis();
    }

    public static Calendar c() {
        lFB lfb = (lFB) R.get();
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instance;
    }

    public static Calendar e(Calendar calendar) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    public static Calendar v(Calendar calendar) {
        Calendar e = e(calendar);
        Calendar e2 = e(null);
        e2.set(e.get(1), e.get(2), e.get(5));
        return e2;
    }
}
