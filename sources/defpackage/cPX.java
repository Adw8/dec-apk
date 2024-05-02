package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: cPX  reason: default package */
/* loaded from: classes.dex */
public final class cPX implements axx {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final axx f2084R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fPH f2085R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2086R;
    public long v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f2087v;

    public cPX(fPH fph, axx axx, long j) {
        this.f2085R = fph;
        this.f2084R = axx;
        this.R = j;
    }

    @Override // defpackage.axx
    public final void K(ME me, long j) {
        if (!this.f2087v) {
            long j2 = this.R;
            if (j2 == -1 || this.v + j <= j2) {
                try {
                    this.f2084R.K(me, j);
                    this.v += j;
                } catch (IOException e) {
                    throw c(e);
                }
            } else {
                StringBuilder U = opT.U("expected ");
                U.append(this.R);
                U.append(" bytes but received ");
                U.append(this.v + j);
                throw new ProtocolException(U.toString());
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: O */
    public final String toString() {
        return cPX.class.getSimpleName() + '(' + this.f2084R + ')';
    }

    public final void R() {
        this.f2084R.close();
    }

    public final void X() {
        this.f2084R.flush();
    }

    public final IOException c(IOException iOException) {
        if (this.f2086R) {
            return iOException;
        }
        this.f2086R = true;
        return this.f2085R.R(false, true, iOException);
    }

    @Override // defpackage.axx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f2087v) {
            this.f2087v = true;
            long j = this.R;
            if (j == -1 || this.v == j) {
                try {
                    R();
                    c(null);
                } catch (IOException e) {
                    throw c(e);
                }
            } else {
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    @Override // defpackage.axx
    public final hqj e() {
        return this.f2084R.e();
    }

    @Override // defpackage.axx, java.io.Flushable
    public final void flush() {
        try {
            X();
        } catch (IOException e) {
            throw c(e);
        }
    }
}
