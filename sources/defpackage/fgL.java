package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: fgL  reason: default package */
/* loaded from: classes.dex */
public abstract class fgL {
    public static final long R;
    public static final long c;
    public static final long e;
    public static final long v;

    static {
        pdD.Y("0.pool.ntp.org", "1.pool.ntp.org", "2.pool.ntp.org", "3.pool.ntp.org");
        TimeUnit timeUnit = TimeUnit.MINUTES;
        R = timeUnit.toMillis(1);
        v = timeUnit.toMillis(1);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        c = timeUnit2.toMillis(6);
        e = timeUnit2.toMillis(5);
    }
}
