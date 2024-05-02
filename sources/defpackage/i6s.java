package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: i6s  reason: default package */
/* loaded from: classes.dex */
public final class i6s extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater R = AtomicIntegerFieldUpdater.newUpdater(i6s.class, "workerCtl");

    /* renamed from: R  reason: collision with other field name */
    public long f4462R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ bQs f4464R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4465R;
    private volatile int indexInArray;
    public long v;

    /* renamed from: R  reason: collision with other field name */
    public final a59 f4463R = new a59();
    public int e = 4;
    public volatile /* synthetic */ int workerCtl = 0;
    private volatile Object nextParkedWorker = bQs.f1644R;
    public int X = h22.R.v();

    public i6s(bQs bqs, int i) {
        this.f4464R = bqs;
        setDaemon(true);
        O(i);
    }

    public final void L(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final void O(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4464R.f1648R);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.gmj R(boolean r10) {
        /*
            r9 = this;
            int r0 = r9.e
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L_0x0007
            goto L_0x002e
        L_0x0007:
            bQs r0 = r9.f4464R
        L_0x0009:
            long r5 = r0.controlState
            r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r3 = r3 & r5
            r7 = 42
            long r3 = r3 >> r7
            int r3 = (int) r3
            if (r3 != 0) goto L_0x0019
            r0 = r2
            goto L_0x002a
        L_0x0019:
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r7 = r5 - r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.bQs.v
            r4 = r0
            boolean r3 = r3.compareAndSet(r4, r5, r7)
            if (r3 == 0) goto L_0x0009
            r0 = r1
        L_0x002a:
            if (r0 == 0) goto L_0x0030
            r9.e = r1
        L_0x002e:
            r0 = r1
            goto L_0x0031
        L_0x0030:
            r0 = r2
        L_0x0031:
            r3 = 0
            if (r0 == 0) goto L_0x007a
            if (r10 == 0) goto L_0x006e
            bQs r10 = r9.f4464R
            int r10 = r10.e
            int r10 = r10 * 2
            int r10 = r9.e(r10)
            if (r10 != 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r1 = r2
        L_0x0044:
            if (r1 == 0) goto L_0x004d
            gmj r10 = r9.X()
            if (r10 == 0) goto L_0x004d
            goto L_0x0079
        L_0x004d:
            a59 r10 = r9.f4463R
            r10.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.a59.f729R
            java.lang.Object r0 = r0.getAndSet(r10, r3)
            gmj r0 = (defpackage.gmj) r0
            if (r0 != 0) goto L_0x0061
            gmj r10 = r10.e()
            goto L_0x0062
        L_0x0061:
            r10 = r0
        L_0x0062:
            if (r10 == 0) goto L_0x0065
            goto L_0x0079
        L_0x0065:
            if (r1 != 0) goto L_0x0075
            gmj r10 = r9.X()
            if (r10 == 0) goto L_0x0075
            goto L_0x0079
        L_0x006e:
            gmj r10 = r9.X()
            if (r10 == 0) goto L_0x0075
            goto L_0x0079
        L_0x0075:
            gmj r10 = r9.m(r2)
        L_0x0079:
            return r10
        L_0x007a:
            if (r10 == 0) goto L_0x009d
            a59 r10 = r9.f4463R
            r10.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.a59.f729R
            java.lang.Object r0 = r0.getAndSet(r10, r3)
            gmj r0 = (defpackage.gmj) r0
            if (r0 != 0) goto L_0x008f
            gmj r0 = r10.e()
        L_0x008f:
            if (r0 != 0) goto L_0x00a8
            bQs r10 = r9.f4464R
            iWC r10 = r10.f1649v
            java.lang.Object r10 = r10.e()
            r0 = r10
            gmj r0 = (defpackage.gmj) r0
            goto L_0x00a8
        L_0x009d:
            bQs r10 = r9.f4464R
            iWC r10 = r10.f1649v
            java.lang.Object r10 = r10.e()
            r0 = r10
            gmj r0 = (defpackage.gmj) r0
        L_0x00a8:
            if (r0 != 0) goto L_0x00ae
            gmj r0 = r9.m(r1)
        L_0x00ae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i6s.R(boolean):gmj");
    }

    public final gmj X() {
        if (e(2) == 0) {
            gmj gmj = (gmj) this.f4464R.f1647R.e();
            return gmj != null ? gmj : (gmj) this.f4464R.f1649v.e();
        }
        gmj gmj2 = (gmj) this.f4464R.f1649v.e();
        return gmj2 != null ? gmj2 : (gmj) this.f4464R.f1647R.e();
    }

    public final boolean Z(int i) {
        int i2 = this.e;
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        if (z) {
            bQs.v.addAndGet(this.f4464R, 4398046511104L);
        }
        if (i2 != i) {
            this.e = i;
        }
        return z;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int e(int i) {
        int i2 = this.X;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.X = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final gmj m(boolean z) {
        long j;
        int i = (int) (this.f4464R.controlState & 2097151);
        if (i < 2) {
            return null;
        }
        int e = e(i);
        bQs bqs = this.f4464R;
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < i; i2++) {
            e++;
            if (e > i) {
                e = 1;
            }
            i6s i6s = (i6s) bqs.f1646R.v(e);
            if (!(i6s == null || i6s == this)) {
                if (z) {
                    j = this.f4463R.X(i6s.f4463R);
                } else {
                    a59 a59 = this.f4463R;
                    a59 a592 = i6s.f4463R;
                    a59.getClass();
                    gmj e2 = a592.e();
                    if (e2 != null) {
                        a59.R(e2, false);
                        j = -1;
                    } else {
                        j = a59.O(a592, false);
                    }
                }
                if (j == -1) {
                    a59 a593 = this.f4463R;
                    a593.getClass();
                    gmj gmj = (gmj) a59.f729R.getAndSet(a593, null);
                    return gmj == null ? a593.e() : gmj;
                } else if (j > 0) {
                    j2 = Math.min(j2, j);
                }
            }
        }
        if (j2 == Long.MAX_VALUE) {
            j2 = 0;
        }
        this.v = j2;
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:89:0x0063 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0002 A[SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 331
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i6s.run():void");
    }

    public final int v() {
        return this.indexInArray;
    }
}
