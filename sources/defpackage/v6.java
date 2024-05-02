package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: v6  reason: default package */
/* loaded from: classes.dex */
public final class v6 extends CancellationException {
    public final transient h2V R;

    public v6(h2V h2v) {
        super("Flow was aborted, no more elements needed");
        this.R = h2v;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
