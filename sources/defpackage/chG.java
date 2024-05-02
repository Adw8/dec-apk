package defpackage;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: chG  reason: default package */
/* loaded from: classes.dex */
public final class chG extends FilterOutputStream {
    public chG(OutputStream outputStream) {
        super(!(outputStream instanceof BufferedOutputStream) ? new BufferedOutputStream(outputStream) : outputStream);
    }

    public final void R() {
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }
}
