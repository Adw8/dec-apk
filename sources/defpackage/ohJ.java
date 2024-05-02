package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: ohJ  reason: default package */
/* loaded from: classes.dex */
public final class ohJ extends gwK implements Runnable {
    public static final ohJ R;
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final long v;

    static {
        Long l;
        ohJ ohj = new ohJ();
        R = ohj;
        ohj.cE(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        v = timeUnit.toNanos(l.longValue());
    }

    @Override // defpackage.gwK
    public final void Kl(Runnable runnable) {
        if (!(debugStatus == 4)) {
            super.Kl(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void WD() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            yG();
            notifyAll();
        }
    }

    @Override // defpackage.mpq
    public final Thread cr() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // defpackage.gwK, defpackage.mou
    public final jZi f(long j, Runnable runnable, nbD nbd) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return orE.R;
        }
        long nanoTime = System.nanoTime();
        dz0 dz0 = new dz0(runnable, j2 + nanoTime);
        wm(nanoTime, dz0);
        return dz0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        dbV.R.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    z = false;
                } else {
                    debugStatus = 1;
                    notifyAll();
                    z = true;
                }
            }
            if (!z) {
                _thread = null;
                WD();
                if (!pG()) {
                    cr();
                    return;
                }
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long xN = xN();
                if (xN == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = v + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        WD();
                        if (!pG()) {
                            cr();
                            return;
                        }
                        return;
                    } else if (xN > j2) {
                        xN = j2;
                    }
                } else {
                    j = Long.MAX_VALUE;
                }
                if (xN > 0) {
                    int i2 = debugStatus;
                    if (i2 == 2 || i2 == 3) {
                        _thread = null;
                        WD();
                        if (!pG()) {
                            cr();
                            return;
                        }
                        return;
                    }
                    LockSupport.parkNanos(this, xN);
                }
            }
        } catch (Throwable th) {
            _thread = null;
            WD();
            if (!pG()) {
                cr();
            }
            throw th;
        }
    }

    @Override // defpackage.gwK, defpackage.mpq
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.mpq
    public final void vz(long j, fpB fpb) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
}
