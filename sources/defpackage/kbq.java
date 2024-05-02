package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: kbq  reason: default package */
/* loaded from: classes.dex */
public enum kbq {
    /* Fake field, exist only in values array */
    NANOSECONDS,
    /* Fake field, exist only in values array */
    MICROSECONDS,
    /* Fake field, exist only in values array */
    MILLISECONDS,
    SECONDS,
    /* Fake field, exist only in values array */
    MINUTES,
    /* Fake field, exist only in values array */
    HOURS,
    /* Fake field, exist only in values array */
    DAYS;

    static {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
        TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
        TimeUnit timeUnit4 = TimeUnit.SECONDS;
        TimeUnit timeUnit5 = TimeUnit.MINUTES;
        TimeUnit timeUnit6 = TimeUnit.HOURS;
        TimeUnit timeUnit7 = TimeUnit.DAYS;
    }
}
