package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: gtV  reason: default package */
/* loaded from: classes.dex */
public final class gtV implements Closeable {
    public static final Logger R = Logger.getLogger(dDc.class.getName());

    /* renamed from: R  reason: collision with other field name */
    public final ME f3965R;

    /* renamed from: R  reason: collision with other field name */
    public final NV f3966R;

    /* renamed from: R  reason: collision with other field name */
    public final ouH f3967R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f3968R;
    public int e = 16384;
    public boolean v;

    public gtV(NV nv, boolean z) {
        this.f3966R = nv;
        this.f3968R = z;
        ME me = new ME();
        this.f3965R = me;
        this.f3967R = new ouH(me);
    }

    public final synchronized void C(long j, int i) {
        if (!this.v) {
            if (j != 0 && j <= 2147483647L) {
                Logger logger = R;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(dDc.c(false, i, 4, j));
                }
                X(i, 4, 8, 0);
                this.f3966R.z((int) j);
                this.f3966R.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void H(int i, gtp gtp) {
        if (!this.v) {
            if (gtp.f3974e != -1) {
                X(i, 4, 3, 0);
                this.f3966R.z(gtp.f3974e);
                this.f3966R.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void O(int i, gtp gtp, byte[] bArr) {
        if (!this.v) {
            boolean z = false;
            if (gtp.f3974e != -1) {
                X(0, bArr.length + 8, 7, 0);
                this.f3966R.z(i);
                this.f3966R.z(gtp.f3974e);
                if (bArr.length == 0) {
                    z = true;
                }
                if (!z) {
                    this.f3966R.i(bArr);
                }
                this.f3966R.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void R(oWQ owq) {
        if (!this.v) {
            int i = this.e;
            int i2 = owq.R;
            if ((i2 & 32) != 0) {
                i = owq.f6840R[5];
            }
            this.e = i;
            if (((i2 & 2) != 0 ? owq.f6840R[1] : -1) != -1) {
                ouH ouh = this.f3967R;
                int i3 = (i2 & 2) != 0 ? owq.f6840R[1] : -1;
                ouh.getClass();
                int min = Math.min(i3, 16384);
                int i4 = ouh.v;
                if (i4 != min) {
                    if (min < i4) {
                        ouh.R = Math.min(ouh.R, min);
                    }
                    ouh.f7016v = true;
                    ouh.v = min;
                    int i5 = ouh.X;
                    if (min < i5) {
                        if (min == 0) {
                            P7.G(ouh.f7015R, null);
                            ouh.c = ouh.f7015R.length - 1;
                            ouh.e = 0;
                            ouh.X = 0;
                        } else {
                            ouh.R(i5 - min);
                        }
                    }
                }
            }
            X(0, 0, 4, 1);
            this.f3966R.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void X(int i, int i2, int i3, int i4) {
        boolean z = false;
        if (i3 != 8) {
            Logger logger = R;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(dDc.v(false, i, i2, i3, i4));
            }
        }
        if (i2 <= this.e) {
            if ((Integer.MIN_VALUE & i) == 0) {
                z = true;
            }
            if (z) {
                NV nv = this.f3966R;
                byte[] bArr = asb.f1481R;
                nv.I((i2 >>> 16) & 255);
                nv.I((i2 >>> 8) & 255);
                nv.I(i2 & 255);
                this.f3966R.I(i3 & 255);
                this.f3966R.I(i4 & 255);
                this.f3966R.z(i & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(opT.Z("reserved bit set: ", i).toString());
        }
        StringBuilder U = opT.U("FRAME_SIZE_ERROR length > ");
        U.append(this.e);
        U.append(": ");
        U.append(i2);
        throw new IllegalArgumentException(U.toString().toString());
    }

    public final synchronized void Z(int i, int i2, boolean z) {
        if (!this.v) {
            X(0, 8, 6, z ? 1 : 0);
            this.f3966R.z(i);
            this.f3966R.z(i2);
            this.f3966R.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void c(boolean z, int i, ME me, int i2) {
        if (!this.v) {
            X(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                this.f3966R.K(me, (long) i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.v = true;
        this.f3966R.close();
    }

    public final void j(long j, int i) {
        while (j > 0) {
            long min = Math.min((long) this.e, j);
            j -= min;
            X(i, (int) min, 9, j == 0 ? 4 : 0);
            this.f3966R.K(this.f3965R, min);
        }
    }
}
