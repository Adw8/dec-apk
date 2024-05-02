package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: dxP  reason: default package */
/* loaded from: classes.dex */
public final class dxP implements NV {
    public final ME R = new ME();

    /* renamed from: R  reason: collision with other field name */
    public final axx f2924R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2925R;

    public dxP(axx axx) {
        this.f2924R = axx;
    }

    @Override // defpackage.NV
    public final NV A(long j) {
        if (!this.f2925R) {
            this.R.q(j);
            R();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.NV
    public final NV F(String str, Charset charset) {
        if (!this.f2925R) {
            ME me = this.R;
            me.getClass();
            me.zw(str, 0, str.length(), charset);
            R();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.NV
    public final NV I(int i) {
        if (!this.f2925R) {
            this.R.a(i);
            R();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.axx
    public final void K(ME me, long j) {
        if (!this.f2925R) {
            this.R.K(me, j);
            R();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final NV R() {
        if (!this.f2925R) {
            long O = this.R.O();
            if (O > 0) {
                this.f2924R.K(this.R, O);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.NV
    public final NV V(int i) {
        if (!this.f2925R) {
            this.R.X4(i);
            R();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final NV c(int i) {
        if (!this.f2925R) {
            int i2 = ((short) i) & 65535;
            this.R.X4((short) (((i2 & 255) << 8) | ((65280 & i2) >>> 8)));
            R();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.axx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f2925R) {
            Throwable th = null;
            try {
                ME me = this.R;
                long j = me.R;
                if (j > 0) {
                    this.f2924R.K(me, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f2924R.close();
            } catch (Throwable th3) {
                th = th3;
                if (th == null) {
                }
            }
            this.f2925R = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // defpackage.axx
    public final hqj e() {
        return this.f2924R.e();
    }

    @Override // defpackage.NV, defpackage.axx, java.io.Flushable
    public final void flush() {
        if (!this.f2925R) {
            ME me = this.R;
            long j = me.R;
            if (j > 0) {
                this.f2924R.K(me, j);
            }
            this.f2924R.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.NV
    public final NV i(byte[] bArr) {
        if (!this.f2925R) {
            ME me = this.R;
            me.getClass();
            me.write(bArr, 0, bArr.length);
            R();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2925R;
    }

    @Override // defpackage.NV
    public final NV m(int i) {
        if (!this.f2925R) {
            this.R.mL(((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8));
            R();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.NV
    public final NV s(int i, int i2, String str) {
        if (!this.f2925R) {
            this.R.vl(i, i2, str);
            R();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder U = opT.U("buffer(");
        U.append(this.f2924R);
        U.append(')');
        return U.toString();
    }

    @Override // defpackage.NV
    public final ME v() {
        return this.R;
    }

    @Override // defpackage.NV
    public final NV w(String str) {
        if (!this.f2925R) {
            this.R.vr(str);
            R();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (!this.f2925R) {
            int write = this.R.write(byteBuffer);
            R();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.NV
    public final NV x(byte[] bArr, int i, int i2) {
        if (!this.f2925R) {
            this.R.write(bArr, i, i2);
            R();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.NV
    public final NV y(F6 f6) {
        if (!this.f2925R) {
            ME me = this.R;
            me.getClass();
            f6.x(me, f6.v());
            R();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.NV
    public final NV z(int i) {
        if (!this.f2925R) {
            this.R.mL(i);
            R();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
