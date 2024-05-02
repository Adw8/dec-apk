package defpackage;

import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: ldm  reason: default package */
/* loaded from: classes.dex */
public final class ldm extends InputStream {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public final InputStream f5796R;

    public ldm(FileInputStream fileInputStream, long j) {
        this.f5796R = fileInputStream;
        this.R = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.f5796R.close();
        this.R = 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.R;
        if (j <= 0) {
            return -1;
        }
        this.R = j - 1;
        return this.f5796R.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.R;
        if (j <= 0) {
            return -1;
        }
        int read = this.f5796R.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.R -= (long) read;
        }
        return read;
    }
}
