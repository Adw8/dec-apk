package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a59  reason: default package */
/* loaded from: classes.dex */
public final class a59 {

    /* renamed from: R  reason: collision with other field name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f729R = AtomicReferenceFieldUpdater.newUpdater(a59.class, Object.class, "lastScheduledTask");
    public static final /* synthetic */ AtomicIntegerFieldUpdater R = AtomicIntegerFieldUpdater.newUpdater(a59.class, "producerIndex");
    public static final /* synthetic */ AtomicIntegerFieldUpdater v = AtomicIntegerFieldUpdater.newUpdater(a59.class, "consumerIndex");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(a59.class, "blockingTasksInBuffer");

    /* renamed from: R  reason: collision with other field name */
    public final AtomicReferenceArray f730R = new AtomicReferenceArray(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final long O(a59 a59, boolean z) {
        gmj gmj;
        do {
            gmj = (gmj) a59.lastScheduledTask;
            if (gmj == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (gmj.f3929R.e != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            dMN.f2567R.getClass();
            long nanoTime = System.nanoTime() - gmj.R;
            long j = dMN.f2566R;
            if (nanoTime < j) {
                return j - nanoTime;
            }
        } while (!f729R.compareAndSet(a59, gmj, null));
        R(gmj, false);
        return -1;
    }

    public final gmj R(gmj gmj, boolean z) {
        if (z) {
            return v(gmj);
        }
        gmj gmj2 = (gmj) f729R.getAndSet(this, gmj);
        if (gmj2 == null) {
            return null;
        }
        return v(gmj2);
    }

    public final long X(a59 a59) {
        int i = a59.consumerIndex;
        int i2 = a59.producerIndex;
        AtomicReferenceArray atomicReferenceArray = a59.f730R;
        while (true) {
            boolean z = true;
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (a59.blockingTasksInBuffer == 0) {
                break;
            }
            gmj gmj = (gmj) atomicReferenceArray.get(i3);
            if (gmj != null) {
                if (gmj.f3929R.e != 1) {
                    z = false;
                }
                if (z && atomicReferenceArray.compareAndSet(i3, gmj, null)) {
                    c.decrementAndGet(a59);
                    R(gmj, false);
                    return -1;
                }
            }
            i++;
        }
        return O(a59, true);
    }

    public final int c() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    public final gmj e() {
        gmj gmj;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (v.compareAndSet(this, i, i + 1) && (gmj = (gmj) this.f730R.getAndSet(i2, null)) != null) {
                boolean z = true;
                if (gmj.f3929R.e != 1) {
                    z = false;
                }
                if (z) {
                    c.decrementAndGet(this);
                }
                return gmj;
            }
        }
    }

    public final gmj v(gmj gmj) {
        boolean z = true;
        if (gmj.f3929R.e != 1) {
            z = false;
        }
        if (z) {
            c.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return gmj;
        }
        int i = this.producerIndex & 127;
        while (this.f730R.get(i) != null) {
            Thread.yield();
        }
        this.f730R.lazySet(i, gmj);
        R.incrementAndGet(this);
        return null;
    }
}
