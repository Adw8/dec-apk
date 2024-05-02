package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* renamed from: nJP  reason: default package */
/* loaded from: classes.dex */
public abstract class nJP extends nzn {
    public bQs R;

    public nJP(int i, int i2, long j) {
        this.R = new bQs(i, i2, j, "DefaultDispatcher");
    }

    @Override // defpackage.kE9
    public final void X4(nbD nbd, Runnable runnable) {
        bQs bqs = this.R;
        AtomicLongFieldUpdater atomicLongFieldUpdater = bQs.f1643R;
        bqs.c(runnable, dMN.f2568R, true);
    }

    @Override // defpackage.kE9
    public final void mL(nbD nbd, Runnable runnable) {
        bQs bqs = this.R;
        AtomicLongFieldUpdater atomicLongFieldUpdater = bQs.f1643R;
        bqs.c(runnable, dMN.f2568R, false);
    }
}
