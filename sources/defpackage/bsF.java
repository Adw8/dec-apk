package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: bsF  reason: default package */
/* loaded from: classes.dex */
public final class bsF implements fGn {
    public byte R;

    /* renamed from: R  reason: collision with other field name */
    public final CRC32 f1832R = new CRC32();

    /* renamed from: R  reason: collision with other field name */
    public final Inflater f1833R;

    /* renamed from: R  reason: collision with other field name */
    public final o7c f1834R;

    /* renamed from: R  reason: collision with other field name */
    public final oDA f1835R;

    public bsF(fGn fgn) {
        oDA oda = new oDA(fgn);
        this.f1835R = oda;
        Inflater inflater = new Inflater(true);
        this.f1833R = inflater;
        this.f1834R = new o7c(oda, inflater);
    }

    public static void R(int i, int i2, String str) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // defpackage.fGn
    public final long Y(ME me, long j) {
        long j2;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        boolean z = false;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(opT.x("byteCount < 0: ", j).toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.R == 0) {
                this.f1835R.P(10);
                byte j3 = this.f1835R.R.j(3);
                boolean z2 = ((j3 >> 1) & 1) == 1;
                if (z2) {
                    c(this.f1835R.R, 0, 10);
                }
                R(8075, this.f1835R.readShort(), "ID1ID2");
                this.f1835R.J(8);
                if (((j3 >> 2) & 1) == 1) {
                    this.f1835R.P(2);
                    if (z2) {
                        c(this.f1835R.R, 0, 2);
                    }
                    long W = (long) this.f1835R.R.W();
                    this.f1835R.P(W);
                    if (z2) {
                        j2 = W;
                        c(this.f1835R.R, 0, W);
                    } else {
                        j2 = W;
                    }
                    this.f1835R.J(j2);
                }
                if (((j3 >> 3) & 1) == 1) {
                    long R = this.f1835R.R((byte) 0, 0, Long.MAX_VALUE);
                    if (R != -1) {
                        if (z2) {
                            c(this.f1835R.R, 0, R + 1);
                        }
                        this.f1835R.J(R + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((j3 >> 4) & 1) == 1) {
                    z = true;
                }
                if (z) {
                    long R2 = this.f1835R.R((byte) 0, 0, Long.MAX_VALUE);
                    if (R2 != -1) {
                        if (z2) {
                            c(this.f1835R.R, 0, R2 + 1);
                        }
                        this.f1835R.J(R2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z2) {
                    R(this.f1835R.c(), (short) ((int) this.f1832R.getValue()), "FHCRC");
                    this.f1832R.reset();
                }
                this.R = 1;
            }
            if (this.R == 1) {
                long j4 = me.R;
                long Y = this.f1834R.Y(me, j);
                if (Y != -1) {
                    c(me, j4, Y);
                    return Y;
                }
                this.R = 2;
            }
            if (this.R == 2) {
                R(this.f1835R.g(), (int) this.f1832R.getValue(), "CRC");
                R(this.f1835R.g(), (int) this.f1833R.getBytesWritten(), "ISIZE");
                this.R = 3;
                if (!this.f1835R.r()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public final void c(ME me, long j, long j2) {
        h11 h11 = me.f290R;
        while (true) {
            int i = h11.v;
            int i2 = h11.R;
            if (j >= ((long) (i - i2))) {
                j -= (long) (i - i2);
                h11 = h11.f4016R;
            }
        }
        while (j2 > 0) {
            int i3 = (int) (((long) h11.R) + j);
            int min = (int) Math.min((long) (h11.v - i3), j2);
            this.f1832R.update(h11.f4018R, i3, min);
            j2 -= (long) min;
            h11 = h11.f4016R;
            j = 0;
        }
    }

    @Override // defpackage.fGn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1834R.close();
    }

    @Override // defpackage.fGn
    public final hqj e() {
        return this.f1835R.e();
    }
}
