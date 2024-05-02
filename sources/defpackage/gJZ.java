package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: gJZ  reason: default package */
/* loaded from: classes.dex */
public final class gJZ implements fGn {
    public int L;
    public int O;
    public final Jl R;
    public int X;
    public int Z;
    public int e;

    public gJZ(Jl jl) {
        this.R = jl;
    }

    @Override // defpackage.fGn
    public final long Y(ME me, long j) {
        int i;
        int readInt;
        do {
            int i2 = this.L;
            if (i2 == 0) {
                this.R.J((long) this.Z);
                this.Z = 0;
                if ((this.X & 4) != 0) {
                    return -1;
                }
                i = this.O;
                Jl jl = this.R;
                byte[] bArr = asb.f1481R;
                int readByte = (jl.readByte() & 255) | ((jl.readByte() & 255) << 16) | ((jl.readByte() & 255) << 8);
                this.L = readByte;
                this.e = readByte;
                int readByte2 = this.R.readByte() & 255;
                this.X = this.R.readByte() & 255;
                Logger logger = goc.R;
                if (logger.isLoggable(Level.FINE)) {
                    F6 f6 = dDc.R;
                    logger.fine(dDc.v(true, this.O, this.e, readByte2, this.X));
                }
                readInt = this.R.readInt() & Integer.MAX_VALUE;
                this.O = readInt;
                if (readByte2 != 9) {
                    throw new IOException(readByte2 + " != TYPE_CONTINUATION");
                }
            } else {
                long Y = this.R.Y(me, Math.min(j, (long) i2));
                if (Y == -1) {
                    return -1;
                }
                this.L -= (int) Y;
                return Y;
            }
        } while (readInt == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // defpackage.fGn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.fGn
    public final hqj e() {
        return this.R.e();
    }
}
