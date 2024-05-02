package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: lLp  reason: default package */
/* loaded from: classes.dex */
public final class lLp {

    /* renamed from: R  reason: collision with other field name */
    public ThreadPoolExecutor f5655R;
    public final ArrayDeque R = new ArrayDeque();
    public final ArrayDeque v = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();

    public final void R(n1g n1g) {
        n1g.f6272R.decrementAndGet();
        ArrayDeque arrayDeque = this.v;
        synchronized (this) {
            if (!arrayDeque.remove(n1g)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        v();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v() {
        /*
            r14 = this;
            bd4 r0 = defpackage.khE.R
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r14)
            java.util.ArrayDeque r1 = r14.R     // Catch: all -> 0x00ce
            java.util.Iterator r1 = r1.iterator()     // Catch: all -> 0x00ce
        L_0x000e:
            boolean r2 = r1.hasNext()     // Catch: all -> 0x00ce
            if (r2 == 0) goto L_0x003e
            java.lang.Object r2 = r1.next()     // Catch: all -> 0x00ce
            n1g r2 = (defpackage.n1g) r2     // Catch: all -> 0x00ce
            java.util.ArrayDeque r3 = r14.v     // Catch: all -> 0x00ce
            int r3 = r3.size()     // Catch: all -> 0x00ce
            r4 = 64
            if (r3 >= r4) goto L_0x003e
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f6272R     // Catch: all -> 0x00ce
            int r3 = r3.get()     // Catch: all -> 0x00ce
            r4 = 5
            if (r3 >= r4) goto L_0x000e
            r1.remove()     // Catch: all -> 0x00ce
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f6272R     // Catch: all -> 0x00ce
            r3.incrementAndGet()     // Catch: all -> 0x00ce
            r0.add(r2)     // Catch: all -> 0x00ce
            java.util.ArrayDeque r3 = r14.v     // Catch: all -> 0x00ce
            r3.add(r2)     // Catch: all -> 0x00ce
            goto L_0x000e
        L_0x003e:
            monitor-enter(r14)     // Catch: all -> 0x00ce
            java.util.ArrayDeque r1 = r14.v     // Catch: all -> 0x00cb
            r1.size()     // Catch: all -> 0x00cb
            java.util.ArrayDeque r1 = r14.c     // Catch: all -> 0x00cb
            r1.size()     // Catch: all -> 0x00cb
            monitor-exit(r14)     // Catch: all -> 0x00ce
            r1 = 0
            monitor-exit(r14)
            int r2 = r0.size()
            r3 = r1
        L_0x0051:
            if (r3 >= r2) goto L_0x00ca
            java.lang.Object r4 = r0.get(r3)
            n1g r4 = (defpackage.n1g) r4
            monitor-enter(r14)
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f5655R     // Catch: all -> 0x00c7
            if (r5 != 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch: all -> 0x00c7
            r7 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 60
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch: all -> 0x00c7
            java.util.concurrent.SynchronousQueue r12 = new java.util.concurrent.SynchronousQueue     // Catch: all -> 0x00c7
            r12.<init>()     // Catch: all -> 0x00c7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x00c7
            r6.<init>()     // Catch: all -> 0x00c7
            java.lang.String r13 = defpackage.khE.f5394R     // Catch: all -> 0x00c7
            r6.append(r13)     // Catch: all -> 0x00c7
            java.lang.String r13 = " Dispatcher"
            r6.append(r13)     // Catch: all -> 0x00c7
            java.lang.String r6 = r6.toString()     // Catch: all -> 0x00c7
            mlq r13 = new mlq     // Catch: all -> 0x00c7
            r13.<init>(r6, r1)     // Catch: all -> 0x00c7
            r6 = r5
            r6.<init>(r7, r8, r9, r11, r12, r13)     // Catch: all -> 0x00c7
            r14.f5655R = r5     // Catch: all -> 0x00c7
        L_0x008b:
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f5655R     // Catch: all -> 0x00c7
            monitor-exit(r14)
            lMx r6 = r4.f6273R
            nZz r6 = r6.f5671R
            lLp r6 = r6.f6447R
            bd4 r6 = defpackage.khE.R
            r5.execute(r4)     // Catch: RejectedExecutionException -> 0x009c, all -> 0x009a
            goto L_0x00ba
        L_0x009a:
            r14 = move-exception
            goto L_0x00bd
        L_0x009c:
            r5 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch: all -> 0x009a
            java.lang.String r7 = "executor rejected"
            r6.<init>(r7)     // Catch: all -> 0x009a
            r6.initCause(r5)     // Catch: all -> 0x009a
            lMx r5 = r4.f6273R     // Catch: all -> 0x009a
            r5.x(r6)     // Catch: all -> 0x009a
            R4 r5 = r4.R     // Catch: all -> 0x009a
            r5.v(r6)     // Catch: all -> 0x009a
            lMx r5 = r4.f6273R
            nZz r5 = r5.f5671R
            lLp r5 = r5.f6447R
            r5.R(r4)
        L_0x00ba:
            int r3 = r3 + 1
            goto L_0x0051
        L_0x00bd:
            lMx r0 = r4.f6273R
            nZz r0 = r0.f5671R
            lLp r0 = r0.f6447R
            r0.R(r4)
            throw r14
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x00ca:
            return
        L_0x00cb:
            r0 = move-exception
            monitor-exit(r14)     // Catch: all -> 0x00ce
            throw r0     // Catch: all -> 0x00ce
        L_0x00ce:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lLp.v():void");
    }
}
