package defpackage;

import java.io.IOException;

/* renamed from: aOx  reason: default package */
/* loaded from: classes.dex */
public final class aOx implements axx {
    public final ME R = new ME();

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dj8 f865R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f866R;
    public boolean v;

    public aOx(dj8 dj8, boolean z) {
        this.f865R = dj8;
        this.f866R = z;
    }

    @Override // defpackage.axx
    public final void K(ME me, long j) {
        bd4 bd4 = khE.R;
        this.R.K(me, j);
        while (this.R.R >= 16384) {
            R(false);
        }
    }

    public final void R(boolean z) {
        long min;
        boolean z2;
        dj8 dj8 = this.f865R;
        synchronized (dj8) {
            dj8.f2843v.Z();
            while (dj8.c >= dj8.e && !this.f866R && !this.v) {
                synchronized (dj8) {
                    gtp gtp = dj8.f2837R;
                    if (gtp != null) {
                        break;
                    }
                    dj8.x();
                }
            }
            dj8.f2843v.U();
            dj8.v();
            min = Math.min(dj8.e - dj8.c, this.R.R);
            dj8.c += min;
            if (z) {
                if (min == this.R.R) {
                    z2 = true;
                }
            }
            z2 = false;
        }
        this.f865R.f2843v.Z();
        try {
            dj8 dj82 = this.f865R;
            dj82.f2840R.C(dj82.R, z2, this.R, min);
        } finally {
            this.f865R.f2843v.U();
        }
    }

    @Override // defpackage.axx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        boolean z2;
        dj8 dj8 = this.f865R;
        bd4 bd4 = khE.R;
        synchronized (dj8) {
            if (!this.v) {
                synchronized (dj8) {
                    z = false;
                    z2 = dj8.f2837R == null;
                }
                dj8 dj82 = this.f865R;
                if (!dj82.f2835R.f866R) {
                    if (this.R.R > 0) {
                        z = true;
                    }
                    if (z) {
                        while (this.R.R > 0) {
                            R(true);
                        }
                    } else if (z2) {
                        dj82.f2840R.C(dj82.R, true, null, 0);
                    }
                }
                dj8 dj83 = this.f865R;
                synchronized (dj83) {
                    this.v = true;
                    dj83.notifyAll();
                }
                gtV gtv = this.f865R.f2840R.f5032R;
                synchronized (gtv) {
                    if (!gtv.v) {
                        gtv.f3966R.flush();
                    } else {
                        throw new IOException("closed");
                    }
                }
                this.f865R.R();
            }
        }
    }

    @Override // defpackage.axx
    public final hqj e() {
        return this.f865R.f2843v;
    }

    @Override // defpackage.axx, java.io.Flushable
    public final void flush() {
        dj8 dj8 = this.f865R;
        bd4 bd4 = khE.R;
        synchronized (dj8) {
            dj8.v();
        }
        while (this.R.R > 0) {
            R(false);
            gtV gtv = this.f865R.f2840R.f5032R;
            synchronized (gtv) {
                if (!gtv.v) {
                    gtv.f3966R.flush();
                } else {
                    throw new IOException("closed");
                }
            }
        }
    }
}
