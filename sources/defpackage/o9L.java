package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: o9L  reason: default package */
/* loaded from: classes.dex */
public final class o9L implements Executor {

    /* renamed from: R  reason: collision with other field name */
    public volatile Runnable f6693R;

    /* renamed from: R  reason: collision with other field name */
    public final Executor f6695R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayDeque f6694R = new ArrayDeque();
    public final Object R = new Object();

    public o9L(ExecutorService executorService) {
        this.f6695R = executorService;
    }

    public final void R() {
        synchronized (this.R) {
            Runnable runnable = (Runnable) this.f6694R.poll();
            this.f6693R = runnable;
            if (runnable != null) {
                this.f6695R.execute(this.f6693R);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.R) {
            this.f6694R.add(new bx(this, runnable, 8));
            if (this.f6693R == null) {
                R();
            }
        }
    }
}
