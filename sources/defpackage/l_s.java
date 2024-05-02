package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: l_s  reason: default package */
/* loaded from: classes.dex */
public final class l_s {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final d3x f5784R;

    /* renamed from: R  reason: collision with other field name */
    public final gL6 f5785R;

    /* renamed from: R  reason: collision with other field name */
    public final n2G f5787R;
    public final int c;
    public final int v;

    /* renamed from: R  reason: collision with other field name */
    public final ExecutorService f5786R = R(false);

    /* renamed from: v  reason: collision with other field name */
    public final ExecutorService f5788v = R(true);

    public l_s(dOV dov) {
        d3x d3x = dov.R;
        if (d3x == null) {
            String str = d3x.R;
            this.f5784R = new dJO();
        } else {
            this.f5784R = d3x;
        }
        this.f5787R = new n2G(12);
        this.f5785R = new gL6(19);
        this.R = 4;
        this.v = Integer.MAX_VALUE;
        this.c = 20;
    }

    public static ExecutorService R(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new eTP(z));
    }
}
