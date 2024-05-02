package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: dMN  reason: default package */
/* loaded from: classes.dex */
public abstract class dMN {
    public static final int R;

    /* renamed from: R  reason: collision with other field name */
    public static final long f2566R = pdD.T("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: R  reason: collision with other field name */
    public static d9I f2567R;

    /* renamed from: R  reason: collision with other field name */
    public static final ift f2568R;
    public static final int v;

    /* renamed from: v  reason: collision with other field name */
    public static final long f2569v;

    /* renamed from: v  reason: collision with other field name */
    public static final ift f2570v;

    static {
        int i = mrV.R;
        if (i < 2) {
            i = 2;
        }
        R = pdD.r("kotlinx.coroutines.scheduler.core.pool.size", i, 1, 0, 8);
        v = pdD.r("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f2569v = TimeUnit.SECONDS.toNanos(pdD.T("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));
        f2567R = d9I.R;
        f2568R = new ift(0);
        f2570v = new ift(1);
    }
}
