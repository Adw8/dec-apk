package defpackage;

import java.io.EOFException;
import java.io.InputStream;

/* renamed from: bNV  reason: default package */
/* loaded from: classes.dex */
public final class bNV extends cKc {
    public int O;
    public int X;
    public boolean R = false;
    public boolean v = true;

    public bNV(InputStream inputStream, int i) {
        super(inputStream, i);
        this.X = inputStream.read();
        int read = inputStream.read();
        this.O = read;
        if (read >= 0) {
            c();
            return;
        }
        throw new EOFException();
    }

    public final boolean c() {
        if (!this.R && this.v && this.X == 0 && this.O == 0) {
            this.R = true;
            R();
        }
        return this.R;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (c()) {
            return -1;
        }
        int read = super.R.read();
        if (read >= 0) {
            int i = this.X;
            this.X = this.O;
            this.O = read;
            return i;
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.v || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.R) {
            return -1;
        }
        int read = super.R.read(bArr, i + 2, i2 - 2);
        if (read >= 0) {
            bArr[i] = (byte) this.X;
            bArr[i + 1] = (byte) this.O;
            this.X = super.R.read();
            int read2 = super.R.read();
            this.O = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }
}
