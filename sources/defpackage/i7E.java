package defpackage;

import java.lang.Thread;
import java.util.List;

/* renamed from: i7E  reason: default package */
/* loaded from: classes.dex */
public abstract class i7E {
    public static final List R = pdD.Q(iOY.D(a6.G(jQ.V())));

    public static final void R(nbD nbd, Throwable th) {
        Throwable th2;
        for (pqS pqs : R) {
            try {
                pqs.a(nbd, th);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    l6.U(th2, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, th2);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            l6.U(th, new iMS(nbd));
        } catch (Throwable unused) {
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
