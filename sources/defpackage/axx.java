package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* renamed from: axx  reason: default package */
/* loaded from: classes.dex */
public interface axx extends Closeable, Flushable {
    void K(ME me, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    hqj e();

    @Override // java.io.Flushable
    void flush();
}
