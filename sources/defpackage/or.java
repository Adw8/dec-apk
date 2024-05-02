package defpackage;

import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;

/* renamed from: or  reason: default package */
/* loaded from: classes.dex */
public final class or implements AutoCloseable {

    /* renamed from: R  reason: collision with other field name */
    public final Condition f6972R;

    /* renamed from: R  reason: collision with other field name */
    public final yn f6974R;
    public final ReentrantLock v;

    /* renamed from: R  reason: collision with other field name */
    public final ReentrantLock f6973R = new ReentrantLock();

    /* renamed from: R  reason: collision with other field name */
    public final ConcurrentHashMap f6971R = new ConcurrentHashMap();
    public final ConcurrentHashMap.KeySetView R = new ConcurrentHashMap().keySet(Boolean.TRUE);

    public or(yn ynVar) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.v = reentrantLock;
        this.f6972R = reentrantLock.newCondition();
        this.f6974R = ynVar;
    }

    public final Object R(int i, int i2) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f6971R.get(Integer.valueOf(i));
        if (concurrentHashMap != null) {
            Queue queue = (Queue) concurrentHashMap.get(Integer.valueOf(i2));
            Object poll = queue != null ? queue.poll() : null;
            if (poll != null || this.R.contains(Integer.valueOf(i))) {
                return poll;
            }
            throw new iH7(i);
        }
        throw new IllegalStateException(opT.Z("Not listening for localId: ", i));
    }

    public final Object X(int i, int i2) {
        Object R;
        while (true) {
            ReentrantLock reentrantLock = this.v;
            reentrantLock.lock();
            try {
                R = R(i, i2);
                if (R != null) {
                    break;
                }
                ReentrantLock reentrantLock2 = this.f6973R;
                if (reentrantLock2.tryLock()) {
                    this.v.unlock();
                    c();
                    this.v.lock();
                    this.f6972R.signalAll();
                    if (reentrantLock2.isHeldByCurrentThread()) {
                        reentrantLock2.unlock();
                    }
                } else {
                    this.f6972R.await();
                }
                if (reentrantLock.isHeldByCurrentThread()) {
                    reentrantLock.unlock();
                }
            } finally {
                if (reentrantLock.isHeldByCurrentThread()) {
                    reentrantLock.unlock();
                }
            }
        }
        return R;
    }

    public final void c() {
        s0 R = this.f6974R.R();
        int i = R.c;
        if (R.R == 1163086915) {
            this.R.remove(Integer.valueOf(i));
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f6971R.get(Integer.valueOf(i));
        if (concurrentHashMap != null) {
            ((Queue) concurrentHashMap.computeIfAbsent(Integer.valueOf(R.R), new Function() { // from class: fh1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Integer num = (Integer) obj;
                    return new ConcurrentLinkedQueue();
                }
            })).add(R);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f6974R.close();
    }
}
