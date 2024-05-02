package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: cby  reason: default package */
/* loaded from: classes.dex */
public final class cby {

    /* renamed from: R  reason: collision with other field name */
    public final int f2158R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ AtomicReferenceArray f2159R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f2160R;
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;
    public final int v;

    /* renamed from: R  reason: collision with other field name */
    public static final lmI f2157R = new lmI("REMOVE_FROZEN");

    /* renamed from: R  reason: collision with other field name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2156R = AtomicReferenceFieldUpdater.newUpdater(cby.class, Object.class, "_next");
    public static final /* synthetic */ AtomicLongFieldUpdater R = AtomicLongFieldUpdater.newUpdater(cby.class, "_state");

    public cby(int i, boolean z) {
        this.f2158R = i;
        this.f2160R = z;
        int i2 = i - 1;
        this.v = i2;
        this.f2159R = new AtomicReferenceArray(i);
        boolean z2 = false;
        if (i2 <= 1073741823) {
            if (!((i & i2) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final Object O() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return f2157R;
            }
            int i = (int) ((j & 1073741823) >> 0);
            int i2 = this.v;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.f2159R.get(i4);
            if (obj == null) {
                if (this.f2160R) {
                    return null;
                }
            } else if (obj instanceof eER) {
                return null;
            } else {
                long j2 = ((long) ((i + 1) & 1073741823)) << 0;
                if (R.compareAndSet(this, j, (j & -1073741824) | j2)) {
                    this.f2159R.set(this.v & i, null);
                    return obj;
                } else if (this.f2160R) {
                    cby cby = this;
                    while (true) {
                        long j3 = cby._state;
                        int i5 = (int) ((j3 & 1073741823) >> 0);
                        if ((j3 & 1152921504606846976L) != 0) {
                            cby = cby.X();
                        } else if (R.compareAndSet(cby, j3, (j3 & -1073741824) | j2)) {
                            cby.f2159R.set(cby.v & i5, null);
                            cby = null;
                        } else {
                            continue;
                        }
                        if (cby == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int R(java.lang.Object r15) {
        /*
            r14 = this;
        L_0x0000:
            long r2 = r14._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x0015
            r14 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r14 = r14 & r2
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r14 == 0) goto L_0x0014
            r1 = 2
        L_0x0014:
            return r1
        L_0x0015:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r10 = (int) r4
            int r11 = r14.v
            int r4 = r10 + 2
            r4 = r4 & r11
            r5 = r0 & r11
            if (r4 != r5) goto L_0x0030
            return r1
        L_0x0030:
            boolean r4 = r14.f2160R
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L_0x004f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r14.f2159R
            r12 = r10 & r11
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L_0x004f
            int r2 = r14.f2158R
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L_0x004e
            int r10 = r10 - r0
            r0 = r10 & r5
            int r2 = r2 >> 1
            if (r0 <= r2) goto L_0x0000
        L_0x004e:
            return r1
        L_0x004f:
            int r0 = r10 + 1
            r0 = r0 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.cby.R
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r12 = (long) r0
            long r12 = r12 << r9
            long r4 = r4 | r12
            r0 = r1
            r1 = r14
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r14.f2159R
            r1 = r10 & r11
            r0.set(r1, r15)
        L_0x006c:
            long r0 = r14._state
            r2 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r0 = r0 & r2
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0098
            cby r14 = r14.X()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r14.f2159R
            int r1 = r14.v
            r1 = r1 & r10
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof defpackage.eER
            if (r1 == 0) goto L_0x0095
            eER r0 = (defpackage.eER) r0
            int r0 = r0.R
            if (r0 != r10) goto L_0x0095
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r14.f2159R
            int r1 = r14.v
            r1 = r1 & r10
            r0.set(r1, r15)
            goto L_0x0096
        L_0x0095:
            r14 = 0
        L_0x0096:
            if (r14 != 0) goto L_0x006c
        L_0x0098:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cby.R(java.lang.Object):int");
    }

    public final cby X() {
        long j;
        while (true) {
            j = this._state;
            if ((j & 1152921504606846976L) == 0) {
                long j2 = j | 1152921504606846976L;
                if (R.compareAndSet(this, j, j2)) {
                    j = j2;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            cby cby = (cby) this._next;
            if (cby != null) {
                return cby;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2156R;
            cby cby2 = new cby(this.f2158R * 2, this.f2160R);
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.v;
                int i4 = i & i3;
                if (i4 != (i3 & i2)) {
                    Object obj = this.f2159R.get(i4);
                    if (obj == null) {
                        obj = new eER(i);
                    }
                    cby2.f2159R.set(cby2.v & i, obj);
                    i++;
                }
            }
            cby2._state = -1152921504606846977L & j;
            atomicReferenceFieldUpdater.compareAndSet(this, null, cby2);
        }
    }

    public final int c() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    public final boolean e() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    public final boolean v() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!R.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }
}
