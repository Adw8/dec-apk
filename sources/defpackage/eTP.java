package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: eTP  reason: default package */
/* loaded from: classes.dex */
public final class eTP implements ThreadFactory {
    public final AtomicInteger R = new AtomicInteger(0);

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f3108R;

    public eTP(boolean z) {
        this.f3108R = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder U = opT.U(this.f3108R ? "WM.task-" : "androidx.work-");
        U.append(this.R.incrementAndGet());
        return new Thread(runnable, U.toString());
    }
}
