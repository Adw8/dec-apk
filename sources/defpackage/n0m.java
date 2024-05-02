package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;

/* renamed from: n0m  reason: default package */
/* loaded from: classes.dex */
public final class n0m extends InputStream {
    public FileInputStream R;

    /* renamed from: R  reason: collision with other field name */
    public final Enumeration f6266R;

    public n0m(Enumeration enumeration) {
        this.f6266R = enumeration;
        R();
    }

    public final void R() {
        FileInputStream fileInputStream = this.R;
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        this.R = this.f6266R.hasMoreElements() ? new FileInputStream((File) this.f6266R.nextElement()) : null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        FileInputStream fileInputStream = this.R;
        if (fileInputStream != null) {
            fileInputStream.close();
            this.R = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        while (true) {
            FileInputStream fileInputStream = this.R;
            if (fileInputStream == null) {
                return -1;
            }
            int read = fileInputStream.read();
            if (read != -1) {
                return read;
            }
            R();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.R == null) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            do {
                int read = this.R.read(bArr, i, i2);
                if (read > 0) {
                    return read;
                }
                R();
            } while (this.R != null);
            return -1;
        }
    }
}
