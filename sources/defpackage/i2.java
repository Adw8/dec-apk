package defpackage;

import java.util.concurrent.locks.LockSupport;

/* renamed from: i2  reason: default package */
/* loaded from: classes.dex */
public final class i2 extends mO {
    public final Thread R;

    /* renamed from: R  reason: collision with other field name */
    public final mpq f4440R;

    public i2(nbD nbd, Thread thread, mpq mpq) {
        super(nbd, true);
        this.R = thread;
        this.f4440R = mpq;
    }

    @Override // defpackage.nfJ
    public final void y(Object obj) {
        if (!n3x.v(Thread.currentThread(), this.R)) {
            LockSupport.unpark(this.R);
        }
    }
}
