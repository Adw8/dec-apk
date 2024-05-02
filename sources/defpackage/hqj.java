package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: hqj  reason: default package */
/* loaded from: classes.dex */
public class hqj {
    public static final hh3 R = new hh3();

    /* renamed from: R  reason: collision with other field name */
    public long f4394R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4395R;
    public long v;

    public hqj L(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            this.v = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(opT.x("timeout < 0: ", j).toString());
    }

    public void O() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        } else if (this.f4395R && this.f4394R - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public hqj R() {
        this.f4395R = false;
        return this;
    }

    public boolean X() {
        return this.f4395R;
    }

    public long c() {
        if (this.f4395R) {
            return this.f4394R;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public hqj e(long j) {
        this.f4395R = true;
        this.f4394R = j;
        return this;
    }

    public hqj v() {
        this.v = 0;
        return this;
    }
}
