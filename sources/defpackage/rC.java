package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: rC  reason: default package */
/* loaded from: classes.dex */
public final class rC extends CancellationException {
    public rC() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
