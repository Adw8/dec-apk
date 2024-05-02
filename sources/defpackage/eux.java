package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: eux  reason: default package */
/* loaded from: classes.dex */
public final class eux extends nzn implements mou {
    public final Executor R;

    public eux(ExecutorService executorService) {
        Method method;
        this.R = executorService;
        Method method2 = hPY.R;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executorService instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executorService : null;
            if (!(scheduledThreadPoolExecutor == null || (method = hPY.R) == null)) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.mou
    public final void C(long j, xx xxVar) {
        Executor executor = this.R;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            bx bxVar = new bx(this, xxVar, 20);
            nbD nbd = xxVar.f7480R;
            try {
                scheduledFuture = scheduledExecutorService.schedule(bxVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                dTl.j(nbd, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            xxVar.y(new pG(0, scheduledFuture));
        } else {
            ohJ.R.C(j, xxVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.R;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return (obj instanceof eux) && ((eux) obj).R == this.R;
    }

    @Override // defpackage.mou
    public final jZi f(long j, Runnable runnable, nbD nbd) {
        Executor executor = this.R;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                dTl.j(nbd, cancellationException);
            }
        }
        return scheduledFuture != null ? new iZS(scheduledFuture) : ohJ.R.f(j, runnable, nbd);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return System.identityHashCode(this.R);
    }

    @Override // defpackage.kE9
    public final void mL(nbD nbd, Runnable runnable) {
        try {
            this.R.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            dTl.j(nbd, cancellationException);
            iFn.f4518R.mL(nbd, runnable);
        }
    }

    @Override // defpackage.kE9, java.lang.Object
    public final String toString() {
        return this.R.toString();
    }
}
