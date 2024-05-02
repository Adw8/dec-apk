package defpackage;

import java.io.Closeable;

/* renamed from: fIY  reason: default package */
/* loaded from: classes.dex */
public interface fIY extends Closeable {
    gEL L();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
