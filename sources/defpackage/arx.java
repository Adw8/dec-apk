package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: arx  reason: default package */
/* loaded from: classes.dex */
public abstract class arx implements Closeable {
    public abstract Jl O();

    public final byte[] R() {
        byte[] bArr;
        long c = c();
        if (c <= 2147483647L) {
            Jl O = O();
            Throwable th = null;
            try {
                bArr = O.b();
            } catch (Throwable th2) {
                th = th2;
                bArr = null;
            }
            if (O != null) {
                try {
                    O.close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    } else {
                        l6.U(th, th3);
                    }
                }
            }
            if (th == null) {
                int length = bArr.length;
                if (c == -1 || c == ((long) length)) {
                    return bArr;
                }
                throw new IOException("Content-Length (" + c + ") and stream length (" + length + ") disagree");
            }
            throw th;
        }
        throw new IOException(opT.x("Cannot buffer entire body for content length: ", c));
    }

    public abstract oFB X();

    public abstract long c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        asb.v(O());
    }
}
