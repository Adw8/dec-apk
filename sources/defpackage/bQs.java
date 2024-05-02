package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: bQs  reason: default package */
/* loaded from: classes.dex */
public final class bQs implements Executor, Closeable {

    /* renamed from: R  reason: collision with other field name */
    public final long f1645R;

    /* renamed from: R  reason: collision with other field name */
    public final gx8 f1646R;

    /* renamed from: R  reason: collision with other field name */
    public final iWC f1647R;

    /* renamed from: R  reason: collision with other field name */
    public final String f1648R;
    public final int X;
    private volatile /* synthetic */ int _isTerminated;
    public volatile /* synthetic */ long controlState;
    public final int e;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: v  reason: collision with other field name */
    public final iWC f1649v;

    /* renamed from: R  reason: collision with other field name */
    public static final lmI f1644R = new lmI("NOT_IN_STACK");

    /* renamed from: R  reason: collision with other field name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1643R = AtomicLongFieldUpdater.newUpdater(bQs.class, "parkedWorkersStack");
    public static final /* synthetic */ AtomicLongFieldUpdater v = AtomicLongFieldUpdater.newUpdater(bQs.class, "controlState");
    public static final /* synthetic */ AtomicIntegerFieldUpdater R = AtomicIntegerFieldUpdater.newUpdater(bQs.class, "_isTerminated");

    public bQs(int i, int i2, long j, String str) {
        this.e = i;
        this.X = i2;
        this.f1645R = j;
        this.f1648R = str;
        boolean z = true;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j <= 0 ? false : z) {
                        this.f1647R = new iWC();
                        this.f1649v = new iWC();
                        this.parkedWorkersStack = 0;
                        this.f1646R = new gx8(i + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(opT.m("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(jQ.U("Max pool size ", i2, " should be greater than or equals to core pool size ", i).toString());
        }
        throw new IllegalArgumentException(opT.m("Core pool size ", i, " should be at least 1").toString());
    }

    public final boolean H() {
        lmI lmi;
        int i;
        while (true) {
            long j = this.parkedWorkersStack;
            i6s i6s = (i6s) this.f1646R.v((int) (2097151 & j));
            if (i6s == null) {
                i6s = null;
            } else {
                long j2 = (2097152 + j) & -2097152;
                Object c = i6s.c();
                while (true) {
                    lmi = f1644R;
                    if (c == lmi) {
                        i = -1;
                        break;
                    } else if (c == null) {
                        i = 0;
                        break;
                    } else {
                        i6s i6s2 = (i6s) c;
                        i = i6s2.v();
                        if (i != 0) {
                            break;
                        }
                        c = i6s2.c();
                    }
                }
                if (i >= 0 && f1643R.compareAndSet(this, j, ((long) i) | j2)) {
                    i6s.L(lmi);
                }
            }
            if (i6s == null) {
                return false;
            }
            if (i6s.R.compareAndSet(i6s, -1, 0)) {
                LockSupport.unpark(i6s);
                return true;
            }
        }
    }

    public final void O(i6s i6s, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = i6s.c();
                    while (true) {
                        if (c == f1644R) {
                            i3 = -1;
                            break;
                        } else if (c == null) {
                            i3 = 0;
                            break;
                        } else {
                            i6s i6s2 = (i6s) c;
                            int v2 = i6s2.v();
                            if (v2 != 0) {
                                i3 = v2;
                                break;
                            }
                            c = i6s2.c();
                        }
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0 && f1643R.compareAndSet(this, j, j2 | ((long) i3))) {
                return;
            }
        }
    }

    public final int R() {
        synchronized (this.f1646R) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            boolean z = false;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.e) {
                return 0;
            }
            if (i >= this.X) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (i3 > 0 && this.f1646R.v(i3) == null) {
                i6s i6s = new i6s(this, i3);
                this.f1646R.c(i3, i6s);
                if (i3 == ((int) (2097151 & v.incrementAndGet(this)))) {
                    z = true;
                }
                if (z) {
                    i6s.start();
                    return i2 + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final void X(i6s i6s) {
        long j;
        int v2;
        if (i6s.c() == f1644R) {
            do {
                j = this.parkedWorkersStack;
                v2 = i6s.v();
                i6s.L(this.f1646R.v((int) (2097151 & j)));
            } while (!f1643R.compareAndSet(this, j, ((long) v2) | ((2097152 + j) & -2097152)));
        }
    }

    public final boolean Z(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        if (i < this.e) {
            int R2 = R();
            if (R2 == 1 && this.e > 1) {
                R();
            }
            if (R2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final void c(Runnable runnable, ift ift, boolean z) {
        gmj gmj;
        gmj gmj2;
        int i;
        dMN.f2567R.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof gmj) {
            gmj = (gmj) runnable;
            gmj.R = nanoTime;
            gmj.f3929R = ift;
        } else {
            gmj = new k6S(runnable, nanoTime, ift);
        }
        Thread currentThread = Thread.currentThread();
        i6s i6s = null;
        i6s i6s2 = currentThread instanceof i6s ? (i6s) currentThread : null;
        if (i6s2 != null && n3x.v(i6s2.f4464R, this)) {
            i6s = i6s2;
        }
        boolean z2 = true;
        if (i6s == null || (i = i6s.e) == 5 || (gmj.f3929R.e == 0 && i == 2)) {
            gmj2 = gmj;
        } else {
            i6s.f4465R = true;
            gmj2 = i6s.f4463R.R(gmj, z);
        }
        if (gmj2 != null) {
            if (!(gmj2.f3929R.e == 1 ? this.f1649v.R(gmj2) : this.f1647R.R(gmj2))) {
                throw new RejectedExecutionException(jQ.g(new StringBuilder(), this.f1648R, " was terminated"));
            }
        }
        if (!z || i6s == null) {
            z2 = false;
        }
        if (gmj.f3929R.e != 0) {
            long addAndGet = v.addAndGet(this, 2097152);
            if (!z2 && !H() && !Z(addAndGet)) {
                H();
            }
        } else if (!z2 && !H() && !Z(this.controlState)) {
            H();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        if (r1 == null) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070 A[LOOP:0: B:19:0x0033->B:33:0x0070, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0073 A[EDGE_INSN: B:59:0x0073->B:34:0x0073 ?: BREAK  , SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.bQs.R
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto L_0x000c
            goto L_0x00a5
        L_0x000c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r3 = r0 instanceof defpackage.i6s
            r4 = 0
            if (r3 == 0) goto L_0x0018
            i6s r0 = (defpackage.i6s) r0
            goto L_0x0019
        L_0x0018:
            r0 = r4
        L_0x0019:
            if (r0 == 0) goto L_0x0024
            bQs r3 = r0.f4464R
            boolean r3 = defpackage.n3x.v(r3, r9)
            if (r3 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = r4
        L_0x0025:
            gx8 r3 = r9.f1646R
            monitor-enter(r3)
            long r5 = r9.controlState     // Catch: all -> 0x00b9
            r7 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r7
            int r5 = (int) r5
            monitor-exit(r3)
            if (r2 > r5) goto L_0x0073
            r3 = r2
        L_0x0033:
            gx8 r6 = r9.f1646R
            java.lang.Object r6 = r6.v(r3)
            i6s r6 = (defpackage.i6s) r6
            if (r6 == r0) goto L_0x006e
        L_0x003d:
            boolean r7 = r6.isAlive()
            if (r7 == 0) goto L_0x004c
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r7 = 10000(0x2710, double:4.9407E-320)
            r6.join(r7)
            goto L_0x003d
        L_0x004c:
            a59 r6 = r6.f4463R
            iWC r7 = r9.f1649v
            r6.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = defpackage.a59.f729R
            java.lang.Object r8 = r8.getAndSet(r6, r4)
            gmj r8 = (defpackage.gmj) r8
            if (r8 == 0) goto L_0x0060
            r7.R(r8)
        L_0x0060:
            gmj r8 = r6.e()
            if (r8 != 0) goto L_0x0068
            r8 = r1
            goto L_0x006c
        L_0x0068:
            r7.R(r8)
            r8 = r2
        L_0x006c:
            if (r8 != 0) goto L_0x0060
        L_0x006e:
            if (r3 == r5) goto L_0x0073
            int r3 = r3 + 1
            goto L_0x0033
        L_0x0073:
            iWC r1 = r9.f1649v
            r1.v()
            iWC r1 = r9.f1647R
            r1.v()
        L_0x007d:
            if (r0 == 0) goto L_0x0085
            gmj r1 = r0.R(r2)
            if (r1 != 0) goto L_0x00a6
        L_0x0085:
            iWC r1 = r9.f1647R
            java.lang.Object r1 = r1.e()
            gmj r1 = (defpackage.gmj) r1
            if (r1 != 0) goto L_0x00a6
            iWC r1 = r9.f1649v
            java.lang.Object r1 = r1.e()
            gmj r1 = (defpackage.gmj) r1
            if (r1 != 0) goto L_0x00a6
            if (r0 == 0) goto L_0x009f
            r1 = 5
            r0.Z(r1)
        L_0x009f:
            r0 = 0
            r9.parkedWorkersStack = r0
            r9.controlState = r0
        L_0x00a5:
            return
        L_0x00a6:
            r1.run()     // Catch: all -> 0x00aa
            goto L_0x007d
        L_0x00aa:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: all -> 0x00b7
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()     // Catch: all -> 0x00b7
            r4.uncaughtException(r3, r1)     // Catch: all -> 0x00b7
            goto L_0x007d
        L_0x00b7:
            r9 = move-exception
            throw r9
        L_0x00b9:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bQs.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(runnable, dMN.f2568R, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: [(r10v1 int), ('d' char)] */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: [(r10v1 int), ('b' char)] */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: [(r10v1 int), ('c' char)] */
    @Override // java.lang.Object
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int R2 = this.f1646R.R();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < R2; i6++) {
            i6s i6s = (i6s) this.f1646R.v(i6);
            if (i6s != null) {
                int c = i6s.f4463R.c();
                int I = jQ.I(i6s.e);
                if (I == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (I == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (I == 2) {
                    i3++;
                } else if (I == 3) {
                    i4++;
                    if (c > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(c);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (I == 4) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        return this.f1648R + '@' + aH9.G(this) + "[Pool Size {core = " + this.e + ", max = " + this.X + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f1647R.c() + ", global blocking queue size = " + this.f1649v.c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.e - ((int) ((j & 9223367638808264704L) >> 42))) + "}]";
    }
}
