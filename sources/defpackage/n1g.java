package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: n1g  reason: default package */
/* loaded from: classes.dex */
public final class n1g implements Runnable {
    public final R4 R;

    /* renamed from: R  reason: collision with other field name */
    public volatile AtomicInteger f6272R = new AtomicInteger(0);

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lMx f6273R;

    public n1g(lMx lmx, R4 r4) {
        this.f6273R = lmx;
        this.R = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IOException e;
        Throwable th;
        StringBuilder U = opT.U("OkHttp ");
        U.append(((a7_) this.f6273R.f5666R.f4786R).L());
        String sb = U.toString();
        lMx lmx = this.f6273R;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(sb);
        boolean z = false;
        try {
            lmx.f5674R.Z();
            try {
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.R.R(lmx.Z());
            } catch (IOException e3) {
                e = e3;
                z = true;
                if (z) {
                    oMv omv = oMv.f6773R;
                    oMv.f6773R.getClass();
                    oMv.m(4, "Callback failure for " + lMx.v(lmx), e);
                } else {
                    this.R.v(e);
                }
                lmx.f5671R.f6447R.R(this);
            } catch (Throwable th3) {
                th = th3;
                z = true;
                lmx.cancel();
                if (!z) {
                    IOException iOException = new IOException("canceled due to " + th);
                    l6.U(iOException, th);
                    this.R.v(iOException);
                }
                throw th;
            }
            lmx.f5671R.f6447R.R(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
