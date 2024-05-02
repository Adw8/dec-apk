package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: jSL  reason: default package */
/* loaded from: classes.dex */
public final class jSL extends AbstractExecutorService implements Callable {

    /* renamed from: R  reason: collision with other field name */
    public boolean f4935R = false;
    public ArrayDeque R = new ArrayDeque();

    /* renamed from: R  reason: collision with other field name */
    public FutureTask f4934R = null;

    @Override // java.util.concurrent.ExecutorService
    public final synchronized boolean awaitTermination(long j, TimeUnit timeUnit) {
        FutureTask futureTask = this.f4934R;
        if (futureTask == null) {
            return true;
        }
        try {
            futureTask.get(j, timeUnit);
        } catch (ExecutionException unused) {
        } catch (TimeoutException unused2) {
            return false;
        }
        return true;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Runnable runnable;
        while (true) {
            synchronized (this) {
                runnable = (Runnable) this.R.poll();
                if (runnable == null) {
                    this.f4934R = null;
                    return null;
                }
            }
            runnable.run();
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (!this.f4935R) {
            this.R.offer(runnable);
            if (this.f4934R == null) {
                FutureTask futureTask = new FutureTask(this);
                this.f4934R = futureTask;
                gQ7.R.execute(futureTask);
            }
        } else {
            throw new RejectedExecutionException("Task " + runnable.toString() + " rejected from " + toString());
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final synchronized boolean isShutdown() {
        return this.f4935R;
    }

    @Override // java.util.concurrent.ExecutorService
    public final synchronized boolean isTerminated() {
        boolean z;
        if (this.f4935R) {
            if (this.f4934R == null) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final synchronized void shutdown() {
        this.f4935R = true;
        this.R.clear();
    }

    @Override // java.util.concurrent.ExecutorService
    public final synchronized List shutdownNow() {
        ArrayList arrayList;
        this.f4935R = true;
        FutureTask futureTask = this.f4934R;
        if (futureTask != null) {
            futureTask.cancel(true);
        }
        arrayList = new ArrayList(this.R);
        this.R.clear();
        return arrayList;
    }
}
