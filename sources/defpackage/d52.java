package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: d52  reason: default package */
/* loaded from: classes.dex */
public final class d52 {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final g79 f2481R;

    /* renamed from: R  reason: collision with other field name */
    public final CountDownLatch f2482R = new CountDownLatch(1);

    public d52(long j, g79 g79) {
        this.R = j;
        this.f2481R = g79;
    }

    public final boolean R() {
        try {
            return this.f2482R.await(this.R, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.f2481R.L(lXr.ERROR, "Exception while awaiting for flush in UncaughtExceptionHint", e);
            return false;
        }
    }
}
