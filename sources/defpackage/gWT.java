package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: gWT  reason: default package */
/* loaded from: classes.dex */
public final class gWT extends cKc {
    public static final byte[] R = new byte[0];
    public int O;
    public final int X;

    public gWT(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i <= 0) {
            if (i >= 0) {
                R();
            } else {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
        }
        this.X = i;
        this.O = i;
    }

    public final byte[] c() {
        int i = this.O;
        if (i == 0) {
            return R;
        }
        int i2 = this.e;
        if (i < i2) {
            byte[] bArr = new byte[i];
            int d = i - l6.d(this.R, bArr, i);
            this.O = d;
            if (d == 0) {
                R();
                return bArr;
            }
            StringBuilder U = opT.U("DEF length ");
            U.append(this.X);
            U.append(" object truncated by ");
            U.append(this.O);
            throw new EOFException(U.toString());
        }
        StringBuilder U2 = opT.U("corrupted stream - out of bounds length found: ");
        U2.append(this.O);
        U2.append(" >= ");
        U2.append(i2);
        throw new IOException(U2.toString());
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.O == 0) {
            return -1;
        }
        int read = this.R.read();
        if (read >= 0) {
            int i = this.O - 1;
            this.O = i;
            if (i == 0) {
                R();
            }
            return read;
        }
        StringBuilder U = opT.U("DEF length ");
        U.append(this.X);
        U.append(" object truncated by ");
        U.append(this.O);
        throw new EOFException(U.toString());
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.O;
        if (i3 == 0) {
            return -1;
        }
        int read = this.R.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.O - read;
            this.O = i4;
            if (i4 == 0) {
                R();
            }
            return read;
        }
        StringBuilder U = opT.U("DEF length ");
        U.append(this.X);
        U.append(" object truncated by ");
        U.append(this.O);
        throw new EOFException(U.toString());
    }
}
