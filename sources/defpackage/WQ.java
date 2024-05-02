package defpackage;

import java.util.concurrent.Executor;

/* renamed from: WQ  reason: default package */
/* loaded from: classes.dex */
public final class WQ {
    public static final WQ v = new WQ(null, null);
    public WQ R;

    /* renamed from: R  reason: collision with other field name */
    public final Runnable f607R;

    /* renamed from: R  reason: collision with other field name */
    public final Executor f608R;

    public WQ(Runnable runnable, Executor executor) {
        this.f607R = runnable;
        this.f608R = executor;
    }
}
