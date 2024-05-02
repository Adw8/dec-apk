package defpackage;

import java.io.Closeable;

/* renamed from: nsr  reason: default package */
/* loaded from: classes.dex */
public final class nsr implements lxb, Closeable {
    public nsr(n7K n7k) {
        gvP.u(n7k, "The SentryOptions is required.");
        ppN ppn = new ppN(n7k.getInAppExcludes(), n7k.getInAppIncludes());
        new aXE(ppn);
        new jsT(ppn, n7k);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
