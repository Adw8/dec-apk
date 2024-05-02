package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: kU  reason: default package */
/* loaded from: classes.dex */
public class kU extends hqj {
    public static final long X;
    public static final long e;
    public static kU v;
    public kU R;
    public long c;

    /* renamed from: v  reason: collision with other field name */
    public boolean f5304v;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        e = millis;
        X = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public void H() {
    }

    public final void Z() {
        kU kUVar;
        long j = super.v;
        boolean z = ((hqj) this).f4395R;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i != 0 || z) {
            synchronized (kU.class) {
                if (!this.f5304v) {
                    this.f5304v = true;
                    if (v == null) {
                        v = new kU();
                        new zB().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (i != 0 && z) {
                        this.c = Math.min(j, c() - nanoTime) + nanoTime;
                    } else if (i != 0) {
                        this.c = j + nanoTime;
                    } else if (z) {
                        this.c = c();
                    } else {
                        throw new AssertionError();
                    }
                    long j2 = this.c - nanoTime;
                    kU kUVar2 = v;
                    while (true) {
                        kUVar = kUVar2.R;
                        if (kUVar == null || j2 < kUVar.c - nanoTime) {
                            break;
                        }
                        kUVar2 = kUVar;
                    }
                    this.R = kUVar;
                    kUVar2.R = this;
                    if (kUVar2 == v) {
                        kU.class.notify();
                    }
                } else {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
        r1.R = r4.R;
        r4.R = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m() {
        /*
            r4 = this;
            java.lang.Class<kU> r0 = defpackage.kU.class
            monitor-enter(r0)
            boolean r1 = r4.f5304v     // Catch: all -> 0x0022
            r2 = 0
            if (r1 != 0) goto L_0x000a
            monitor-exit(r0)
            goto L_0x0021
        L_0x000a:
            r4.f5304v = r2     // Catch: all -> 0x0022
            kU r1 = defpackage.kU.v     // Catch: all -> 0x0022
        L_0x000e:
            if (r1 == 0) goto L_0x001f
            kU r3 = r1.R     // Catch: all -> 0x0022
            if (r3 != r4) goto L_0x001d
            kU r3 = r4.R     // Catch: all -> 0x0022
            r1.R = r3     // Catch: all -> 0x0022
            r1 = 0
            r4.R = r1     // Catch: all -> 0x0022
            monitor-exit(r0)
            goto L_0x0021
        L_0x001d:
            r1 = r3
            goto L_0x000e
        L_0x001f:
            r2 = 1
            monitor-exit(r0)
        L_0x0021:
            return r2
        L_0x0022:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kU.m():boolean");
    }

    public InterruptedIOException x(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
