package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: bEu  reason: default package */
/* loaded from: classes.dex */
public final class bEu extends FilterInputStream {
    public bEu(InputStream inputStream) {
        super(inputStream);
    }

    public final void R() {
        ((FilterInputStream) this).in.close();
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
    }
}
