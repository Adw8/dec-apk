package defpackage;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: hRP  reason: default package */
/* loaded from: classes.dex */
public final class hRP {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final dQF f4238R;

    /* renamed from: R  reason: collision with other field name */
    public final iB4 f4239R;

    /* renamed from: R  reason: collision with other field name */
    public final List f4240R;

    /* renamed from: R  reason: collision with other field name */
    public final wg f4244R;
    public final long c;
    public final long e;
    public final long v;

    /* renamed from: R  reason: collision with other field name */
    public final AtomicReference f4243R = new AtomicReference(ecq.IDLE);

    /* renamed from: R  reason: collision with other field name */
    public final AtomicLong f4242R = new AtomicLong(0);

    /* renamed from: R  reason: collision with other field name */
    public final ExecutorService f4241R = Executors.newSingleThreadExecutor(eGv.R);

    public hRP(dQF dqf, dq dqVar, iB4 ib4, o5G o5g, List list, long j, long j2, long j3, long j4) {
        this.f4238R = dqf;
        this.f4244R = dqVar;
        this.f4239R = ib4;
        this.f4240R = list;
        this.R = j;
        this.v = j2;
        this.c = j3;
        this.e = j4;
    }

    public final void R() {
        if (((ecq) this.f4243R.get()) == ecq.STOPPED) {
            throw new IllegalStateException("Service already shutdown");
        }
    }

    public final void v() {
        R();
        if (((ecq) this.f4243R.get()) != ecq.SYNCING) {
            this.f4241R.submit(new k0f(18, this));
        }
    }
}
