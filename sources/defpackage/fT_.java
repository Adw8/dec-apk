package defpackage;

import java.io.Closeable;
import java.lang.Thread;

/* renamed from: fT_  reason: default package */
/* loaded from: classes.dex */
public final class fT_ implements fwF, Thread.UncaughtExceptionHandler, Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this == Thread.getDefaultUncaughtExceptionHandler()) {
            Thread.setDefaultUncaughtExceptionHandler(null);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
    }
}
