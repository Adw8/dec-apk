package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* renamed from: dj8  reason: default package */
/* loaded from: classes.dex */
public final class dj8 {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public long f2834R;

    /* renamed from: R  reason: collision with other field name */
    public final aOx f2835R;

    /* renamed from: R  reason: collision with other field name */
    public final bP9 f2836R;

    /* renamed from: R  reason: collision with other field name */
    public gtp f2837R;

    /* renamed from: R  reason: collision with other field name */
    public IOException f2838R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayDeque f2839R;

    /* renamed from: R  reason: collision with other field name */
    public final jr5 f2840R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2842R;
    public long c;
    public long e;
    public long v;

    /* renamed from: R  reason: collision with other field name */
    public final pqF f2841R = new pqF(1, this);

    /* renamed from: v  reason: collision with other field name */
    public final pqF f2843v = new pqF(1, this);

    public dj8(int i, jr5 jr5, boolean z, boolean z2, bd4 bd4) {
        this.R = i;
        this.f2840R = jr5;
        this.e = (long) jr5.f5048v.R();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f2839R = arrayDeque;
        this.f2836R = new bP9(this, (long) jr5.f5040R.R(), z2);
        this.f2835R = new aOx(this, z);
        if (bd4 != null) {
            if (!L()) {
                arrayDeque.add(bd4);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!L()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final boolean L() {
        return this.f2840R.f5041R == ((this.R & 1) == 1);
    }

    public final aOx O() {
        synchronized (this) {
            if (!(this.f2842R || L())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f2835R;
    }

    public final void R() {
        boolean z;
        boolean Z;
        bd4 bd4 = khE.R;
        synchronized (this) {
            bP9 bp9 = this.f2836R;
            if (!bp9.f1635R && bp9.f1636v) {
                aOx aox = this.f2835R;
                if (aox.f866R || aox.v) {
                    z = true;
                    Z = Z();
                }
            }
            z = false;
            Z = Z();
        }
        if (z) {
            c(gtp.CANCEL, null);
        } else if (!Z) {
            this.f2840R.O(this.R);
        }
    }

    public final void X(gtp gtp) {
        if (e(gtp, null)) {
            this.f2840R.j(this.R, gtp);
        }
    }

    public final synchronized boolean Z() {
        if (this.f2837R != null) {
            return false;
        }
        bP9 bp9 = this.f2836R;
        if (bp9.f1635R || bp9.f1636v) {
            aOx aox = this.f2835R;
            if (aox.f866R || aox.v) {
                if (this.f2842R) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void c(gtp gtp, IOException iOException) {
        if (e(gtp, iOException)) {
            jr5 jr5 = this.f2840R;
            jr5.f5032R.H(this.R, gtp);
        }
    }

    public final boolean e(gtp gtp, IOException iOException) {
        bd4 bd4 = khE.R;
        synchronized (this) {
            if (this.f2837R != null) {
                return false;
            }
            if (this.f2836R.f1635R && this.f2835R.f866R) {
                return false;
            }
            this.f2837R = gtp;
            this.f2838R = iOException;
            notifyAll();
            this.f2840R.O(this.R);
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027 A[Catch: all -> 0x003d, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x0010, B:11:0x0019, B:12:0x001e, B:14:0x0027, B:15:0x002b), top: B:22:0x0003 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(defpackage.bd4 r3, boolean r4) {
        /*
            r2 = this;
            bd4 r0 = defpackage.khE.R
            monitor-enter(r2)
            boolean r0 = r2.f2842R     // Catch: all -> 0x003d
            r1 = 1
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = ":status"
            java.lang.String r0 = r3.R(r0)     // Catch: all -> 0x003d
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = ":method"
            java.lang.String r0 = r3.R(r0)     // Catch: all -> 0x003d
            if (r0 == 0) goto L_0x0019
            goto L_0x001e
        L_0x0019:
            bP9 r0 = r2.f2836R     // Catch: all -> 0x003d
            r0.f1633R = r3     // Catch: all -> 0x003d
            goto L_0x0025
        L_0x001e:
            r2.f2842R = r1     // Catch: all -> 0x003d
            java.util.ArrayDeque r0 = r2.f2839R     // Catch: all -> 0x003d
            r0.add(r3)     // Catch: all -> 0x003d
        L_0x0025:
            if (r4 == 0) goto L_0x002b
            bP9 r3 = r2.f2836R     // Catch: all -> 0x003d
            r3.f1635R = r1     // Catch: all -> 0x003d
        L_0x002b:
            boolean r3 = r2.Z()     // Catch: all -> 0x003d
            r2.notifyAll()     // Catch: all -> 0x003d
            monitor-exit(r2)
            if (r3 != 0) goto L_0x003c
            jr5 r3 = r2.f2840R
            int r2 = r2.R
            r3.O(r2)
        L_0x003c:
            return
        L_0x003d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj8.m(bd4, boolean):void");
    }

    public final void v() {
        aOx aox = this.f2835R;
        if (aox.v) {
            throw new IOException("stream closed");
        } else if (aox.f866R) {
            throw new IOException("stream finished");
        } else if (this.f2837R != null) {
            IOException iOException = this.f2838R;
            if (iOException == null) {
                throw new aXf(this.f2837R);
            }
        }
    }

    public final void x() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
