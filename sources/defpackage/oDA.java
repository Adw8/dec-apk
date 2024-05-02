package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* renamed from: oDA  reason: default package */
/* loaded from: classes.dex */
public final class oDA implements Jl {
    public final ME R = new ME();

    /* renamed from: R  reason: collision with other field name */
    public final fGn f6706R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6707R;

    public oDA(fGn fgn) {
        this.f6706R = fgn;
    }

    @Override // defpackage.Jl
    public final long D() {
        byte j;
        P(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!n((long) i2)) {
                break;
            }
            j = this.R.j((long) i);
            if ((j < ((byte) 48) || j > ((byte) 57)) && ((j < ((byte) 97) || j > ((byte) 102)) && (j < ((byte) 65) || j > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            jjU.X(16);
            jjU.X(16);
            sb.append(Integer.toString(j, 16));
            throw new NumberFormatException(sb.toString());
        }
        return this.R.D();
    }

    @Override // defpackage.Jl
    public final String E() {
        return _(Long.MAX_VALUE);
    }

    @Override // defpackage.Jl
    public final void J(long j) {
        if (!this.f6707R) {
            while (j > 0) {
                ME me = this.R;
                if (me.R == 0 && this.f6706R.Y(me, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.R.R);
                this.R.J(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.Jl
    public final byte[] N(long j) {
        P(j);
        return this.R.N(j);
    }

    @Override // defpackage.Jl
    public final void P(long j) {
        if (!n(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.Jl
    public final long Q(ME me) {
        long j = 0;
        while (this.f6706R.Y(this.R, 8192) != -1) {
            long O = this.R.O();
            if (O > 0) {
                j += O;
                me.K(this.R, O);
            }
        }
        ME me2 = this.R;
        long j2 = me2.R;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        me.K(me2, j2);
        return j3;
    }

    public final long R(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f6707R) {
            z = false;
            long j3 = 0;
            if (0 > j2) {
            }
            if (z) {
                while (j3 < j2) {
                    long t = this.R.t(b, j3, j2);
                    if (t != -1) {
                        return t;
                    }
                    ME me = this.R;
                    long j4 = me.R;
                    if (j4 >= j2 || this.f6706R.Y(me, 8192) == -1) {
                        return -1;
                    }
                    j3 = Math.max(j3, j4);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.Jl
    public final F6 S(long j) {
        P(j);
        return this.R.S(j);
    }

    @Override // defpackage.Jl
    public final long T(F6 f6) {
        if (!this.f6707R) {
            long j = 0;
            while (true) {
                long o = this.R.o(j, f6);
                if (o != -1) {
                    return o;
                }
                ME me = this.R;
                long j2 = me.R;
                if (this.f6706R.Y(me, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (j2 - ((long) f6.f115R.length)) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // defpackage.Jl
    public final boolean U(F6 f6) {
        byte[] bArr = f6.f115R;
        int length = bArr.length;
        if (!this.f6707R) {
            if (length >= 0 && bArr.length - 0 >= length) {
                for (int i = 0; i < length; i++) {
                    long j = ((long) i) + 0;
                    if (n(1 + j)) {
                        if (this.R.j(j) == f6.f115R[0 + i]) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.fGn
    public final long Y(ME me, long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(opT.x("byteCount < 0: ", j).toString());
        } else if (!this.f6707R) {
            ME me2 = this.R;
            if (me2.R == 0 && this.f6706R.Y(me2, 8192) == -1) {
                return -1;
            }
            return this.R.Y(me, Math.min(j, this.R.R));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // defpackage.Jl
    public final String _(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long R = R(b, 0, j2);
            if (R != -1) {
                return kn1.v(this.R, R);
            }
            if (j2 < Long.MAX_VALUE && n(j2) && this.R.j(j2 - 1) == ((byte) 13) && n(1 + j2) && this.R.j(j2) == b) {
                return kn1.v(this.R, j2);
            }
            ME me = new ME();
            ME me2 = this.R;
            me2.Z(me, 0, Math.min((long) 32, me2.R));
            StringBuilder U = opT.U("\\n not found: limit=");
            U.append(Math.min(this.R.R, j));
            U.append(" content=");
            U.append(me.h().c());
            U.append((char) 8230);
            throw new EOFException(U.toString());
        }
        throw new IllegalArgumentException(opT.x("limit < 0: ", j).toString());
    }

    @Override // defpackage.Jl
    public final byte[] b() {
        this.R.f(this.f6706R);
        return this.R.b();
    }

    public final short c() {
        P(2);
        return this.R.W();
    }

    @Override // defpackage.fGn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f6707R) {
            this.f6707R = true;
            this.f6706R.close();
            this.R.X();
        }
    }

    @Override // defpackage.fGn
    public final hqj e() {
        return this.f6706R.e();
    }

    @Override // defpackage.Jl
    public final int g() {
        P(4);
        return this.R.g();
    }

    @Override // defpackage.Jl
    public final F6 h() {
        this.R.f(this.f6706R);
        return this.R.h();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f6707R;
    }

    @Override // defpackage.Jl
    public final boolean n(long j) {
        ME me;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(opT.x("byteCount < 0: ", j).toString());
        } else if (!this.f6707R) {
            do {
                me = this.R;
                if (me.R >= j) {
                    return true;
                }
            } while (this.f6706R.Y(me, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // defpackage.Jl
    public final int p(paU pau) {
        if (!this.f6707R) {
            while (true) {
                int c = kn1.c(this.R, pau, true);
                if (c == -2) {
                    if (this.f6706R.Y(this.R, 8192) == -1) {
                        break;
                    }
                } else if (c != -1) {
                    this.R.J((long) pau.f7099R[c].v());
                    return c;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.Jl
    public final boolean r() {
        if (!this.f6707R) {
            return this.R.r() && this.f6706R.Y(this.R, 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        ME me = this.R;
        if (me.R == 0 && this.f6706R.Y(me, 8192) == -1) {
            return -1;
        }
        return this.R.read(byteBuffer);
    }

    @Override // defpackage.Jl
    public final byte readByte() {
        P(1);
        return this.R.readByte();
    }

    @Override // defpackage.Jl
    public final int readInt() {
        P(4);
        return this.R.readInt();
    }

    @Override // defpackage.Jl
    public final short readShort() {
        P(2);
        return this.R.readShort();
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder U = opT.U("buffer(");
        U.append(this.f6706R);
        U.append(')');
        return U.toString();
    }

    @Override // defpackage.Jl
    public final long u(F6 f6) {
        if (!this.f6707R) {
            long j = 0;
            while (true) {
                long d = this.R.d(j, f6);
                if (d != -1) {
                    return d;
                }
                ME me = this.R;
                long j2 = me.R;
                if (this.f6706R.Y(me, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // defpackage.Jl, defpackage.NV
    public final ME v() {
        return this.R;
    }
}
