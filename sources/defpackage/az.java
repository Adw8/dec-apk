package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: az  reason: default package */
/* loaded from: classes.dex */
public abstract class az implements nA8 {

    /* renamed from: R  reason: collision with other field name */
    public static final pdD f1494R;
    public static final Object v;

    /* renamed from: R  reason: collision with other field name */
    public volatile WQ f1496R;

    /* renamed from: R  reason: collision with other field name */
    public volatile Object f1497R;

    /* renamed from: R  reason: collision with other field name */
    public volatile w8 f1498R;

    /* renamed from: R  reason: collision with other field name */
    public static final boolean f1495R = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger R = Logger.getLogger(az.class.getName());

    static {
        pdD pdd;
        Throwable th;
        try {
            pdd = new Iu(AtomicReferenceFieldUpdater.newUpdater(w8.class, Thread.class, "R"), AtomicReferenceFieldUpdater.newUpdater(w8.class, w8.class, "R"), AtomicReferenceFieldUpdater.newUpdater(az.class, w8.class, "R"), AtomicReferenceFieldUpdater.newUpdater(az.class, WQ.class, "R"), AtomicReferenceFieldUpdater.newUpdater(az.class, Object.class, "R"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            pdd = new s9();
        }
        f1494R = pdd;
        if (th != null) {
            R.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        v = new Object();
    }

    public static Object O(nA8 na8) {
        Object obj;
        if (na8 instanceof az) {
            Object obj2 = ((az) na8).f1497R;
            if (!(obj2 instanceof Rf)) {
                return obj2;
            }
            Rf rf = (Rf) obj2;
            return rf.f497R ? rf.f496R != null ? new Rf(rf.f496R, false) : Rf.v : obj2;
        }
        boolean isCancelled = na8.isCancelled();
        boolean z = true;
        if ((!f1495R) && isCancelled) {
            return Rf.v;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = na8.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e) {
                if (isCancelled) {
                    return new Rf(e, false);
                }
                return new CJ(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + na8, e));
            } catch (ExecutionException e2) {
                return new CJ(e2.getCause());
            } catch (Throwable th2) {
                return new CJ(th2);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? v : obj;
    }

    public static Object X(Object obj) {
        if (obj instanceof Rf) {
            Throwable th = ((Rf) obj).f496R;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof CJ) {
            throw new ExecutionException(((CJ) obj).f58R);
        } else if (obj == v) {
            return null;
        } else {
            return obj;
        }
    }

    public static void c(az azVar) {
        WQ wq;
        WQ wq2 = null;
        while (true) {
            w8 w8Var = azVar.f1498R;
            if (f1494R.j(azVar, w8Var, w8.v)) {
                while (w8Var != null) {
                    Thread thread = w8Var.R;
                    if (thread != null) {
                        w8Var.R = null;
                        LockSupport.unpark(thread);
                    }
                    w8Var = w8Var.f7451R;
                }
                do {
                    wq = azVar.f1496R;
                } while (!f1494R.N(azVar, wq, WQ.v));
                while (wq != null) {
                    wq = wq.R;
                    wq.R = wq2;
                    wq2 = wq;
                }
                while (wq2 != null) {
                    WQ wq3 = wq2.R;
                    Runnable runnable = wq2.f607R;
                    if (runnable instanceof jx) {
                        jx jxVar = (jx) runnable;
                        az azVar2 = jxVar.R;
                        if (azVar2.f1497R == jxVar) {
                            if (f1494R.P(azVar2, jxVar, O(jxVar.f5157R))) {
                                wq2 = wq3;
                                azVar = azVar2;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        e(runnable, wq2.f608R);
                    }
                    wq2 = wq3;
                }
                return;
            }
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = R;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public final String L() {
        Object obj = this.f1497R;
        if (obj instanceof jx) {
            StringBuilder U = opT.U("setFuture=[");
            nA8 na8 = ((jx) obj).f5157R;
            return jQ.g(U, na8 == this ? "this future" : String.valueOf(na8), "]");
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder U2 = opT.U("remaining delay=[");
            U2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            U2.append(" ms]");
            return U2.toString();
        }
    }

    @Override // defpackage.nA8
    public final void R(Runnable runnable, Executor executor) {
        executor.getClass();
        WQ wq = this.f1496R;
        if (wq != WQ.v) {
            WQ wq2 = new WQ(runnable, executor);
            do {
                wq2.R = wq;
                if (!f1494R.N(this, wq, wq2)) {
                    wq = this.f1496R;
                } else {
                    return;
                }
            } while (wq != WQ.v);
            e(runnable, executor);
        }
        e(runnable, executor);
    }

    public final void Z(w8 w8Var) {
        w8Var.R = null;
        while (true) {
            w8 w8Var2 = this.f1498R;
            if (w8Var2 != w8.v) {
                w8 w8Var3 = null;
                while (w8Var2 != null) {
                    w8 w8Var4 = w8Var2.f7451R;
                    if (w8Var2.R != null) {
                        w8Var3 = w8Var2;
                    } else if (w8Var3 != null) {
                        w8Var3.f7451R = w8Var4;
                        if (w8Var3.R == null) {
                            break;
                        }
                    } else if (!f1494R.j(this, w8Var2, w8Var4)) {
                        break;
                    }
                    w8Var2 = w8Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f1497R;
        if (!(obj == null) && !(obj instanceof jx)) {
            return false;
        }
        Rf rf = f1495R ? new Rf(new CancellationException("Future.cancel() was called."), z) : z ? Rf.R : Rf.v;
        boolean z2 = false;
        while (true) {
            if (f1494R.P(this, obj, rf)) {
                c(this);
                if (!(obj instanceof jx)) {
                    return true;
                }
                nA8 na8 = ((jx) obj).f5157R;
                if (na8 instanceof az) {
                    this = (az) na8;
                    obj = this.f1497R;
                    if (!(obj == null) && !(obj instanceof jx)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    na8.cancel(z);
                    return true;
                }
            } else {
                obj = this.f1497R;
                if (!(obj instanceof jx)) {
                    return z2;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r18, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (java.lang.Thread.interrupted() != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        r4 = r18.f1497R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        if (r4 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        if ((r5 & (!(r4 instanceof defpackage.jx))) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0066, code lost:
        return X(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0067, code lost:
        r4 = r10 - java.lang.System.nanoTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r4 >= 1000) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0071, code lost:
        Z(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0075, code lost:
        Z(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
        // Method dump skipped, instructions count: 361
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1497R instanceof Rf;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f1497R;
        return (!(obj instanceof jx)) & (obj != null);
    }

    @Override // java.lang.Object
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f1497R instanceof Rf) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            v(sb);
        } else {
            try {
                str = L();
            } catch (RuntimeException e) {
                StringBuilder U = opT.U("Exception thrown from implementation: ");
                U.append(e.getClass());
                str = U.toString();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                v(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void v(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        java.util.concurrent.locks.LockSupport.park(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (java.lang.Thread.interrupted() != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r0 = r6.f1497R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r0 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        if ((r4 & (!(r0 instanceof defpackage.jx))) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
        return X(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        Z(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r6 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x0061
            java.lang.Object r0 = r6.f1497R
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000e
            r3 = r2
            goto L_0x000f
        L_0x000e:
            r3 = r1
        L_0x000f:
            boolean r4 = r0 instanceof defpackage.jx
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L_0x001a
            java.lang.Object r6 = X(r0)
            return r6
        L_0x001a:
            w8 r0 = r6.f1498R
            w8 r3 = defpackage.w8.v
            if (r0 == r3) goto L_0x005a
            w8 r3 = new w8
            r3.<init>()
        L_0x0025:
            pdD r4 = defpackage.az.f1494R
            r4.A(r3, r0)
            boolean r0 = r4.j(r6, r0, r3)
            if (r0 == 0) goto L_0x0054
        L_0x0030:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x004b
            java.lang.Object r0 = r6.f1497R
            if (r0 == 0) goto L_0x003f
            r4 = r2
            goto L_0x0040
        L_0x003f:
            r4 = r1
        L_0x0040:
            boolean r5 = r0 instanceof defpackage.jx
            r5 = r5 ^ r2
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0030
            java.lang.Object r6 = X(r0)
            return r6
        L_0x004b:
            r6.Z(r3)
            java.lang.InterruptedException r6 = new java.lang.InterruptedException
            r6.<init>()
            throw r6
        L_0x0054:
            w8 r0 = r6.f1498R
            w8 r4 = defpackage.w8.v
            if (r0 != r4) goto L_0x0025
        L_0x005a:
            java.lang.Object r6 = r6.f1497R
            java.lang.Object r6 = X(r6)
            return r6
        L_0x0061:
            java.lang.InterruptedException r6 = new java.lang.InterruptedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az.get():java.lang.Object");
    }
}
