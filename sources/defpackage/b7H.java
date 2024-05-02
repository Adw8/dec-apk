package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: b7H  reason: default package */
/* loaded from: classes.dex */
public final class b7H extends ffu {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fPH f1536R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1537R = true;
    public boolean c;
    public long v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1538v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public b7H(fPH fph, fGn fgn, long j) {
        super(fgn);
        this.f1536R = fph;
        this.R = j;
        if (j == 0) {
            R(null);
        }
    }

    public final IOException R(IOException iOException) {
        if (this.f1538v) {
            return iOException;
        }
        this.f1538v = true;
        if (iOException == null && this.f1537R) {
            this.f1537R = false;
            this.f1536R.f3412R.getClass();
        }
        return this.f1536R.R(true, false, iOException);
    }

    @Override // defpackage.fGn
    public final long Y(ME me, long j) {
        if (!this.c) {
            try {
                long Y = ((ffu) this).R.Y(me, j);
                if (this.f1537R) {
                    this.f1537R = false;
                    fPH fph = this.f1536R;
                    ppN ppn = fph.f3412R;
                    lMx lmx = fph.f3410R;
                    ppn.getClass();
                }
                if (Y == -1) {
                    R(null);
                    return -1;
                }
                long j2 = this.v + Y;
                long j3 = this.R;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + this.R + " bytes but received " + j2);
                }
                this.v = j2;
                if (j2 == j3) {
                    R(null);
                }
                return Y;
            } catch (IOException e) {
                throw R(e);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // defpackage.ffu, defpackage.fGn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.c) {
            this.c = true;
            try {
                super.close();
                R(null);
            } catch (IOException e) {
                throw R(e);
            }
        }
    }
}
