package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: gwK  reason: default package */
/* loaded from: classes.dex */
public abstract class gwK extends mpq implements mou {
    public static final /* synthetic */ AtomicReferenceFieldUpdater R = AtomicReferenceFieldUpdater.newUpdater(gwK.class, Object.class, "_queue");
    public static final /* synthetic */ AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(gwK.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public static final boolean BF(gwK gwk) {
        return gwk._isCompleted;
    }

    @Override // defpackage.mou
    public final void C(long j, xx xxVar) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            hC8 hc8 = new hC8(this, j2 + nanoTime, xxVar);
            wm(nanoTime, hc8);
            xxVar.y(new pG(1, hc8));
        }
    }

    public void Kl(Runnable runnable) {
        if (mZ(runnable)) {
            Thread cr = cr();
            if (Thread.currentThread() != cr) {
                LockSupport.unpark(cr);
                return;
            }
            return;
        }
        ohJ.R.Kl(runnable);
    }

    @Override // defpackage.mou
    public jZi f(long j, Runnable runnable, nbD nbd) {
        return bEz.R.f(j, runnable, nbd);
    }

    @Override // defpackage.kE9
    public final void mL(nbD nbd, Runnable runnable) {
        Kl(runnable);
    }

    public final boolean mZ(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                if (R.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof cby) {
                cby cby = (cby) obj;
                int R2 = cby.R(runnable);
                if (R2 == 0) {
                    return true;
                }
                if (R2 == 1) {
                    R.compareAndSet(this, obj, cby.X());
                } else if (R2 == 2) {
                    return false;
                }
            } else if (obj == brQ.v) {
                return false;
            } else {
                cby cby2 = new cby(8, true);
                cby2.R((Runnable) obj);
                cby2.R(runnable);
                if (R.compareAndSet(this, obj, cby2)) {
                    return true;
                }
            }
        }
    }

    public final boolean pG() {
        nhs nhs = ((mpq) this).f6173R;
        if (!(nhs == null || nhs.R == nhs.v)) {
            return false;
        }
        mr0 mr0 = (mr0) this._delayed;
        if (mr0 != null && !mr0.v()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof cby) {
                return ((cby) obj).e();
            }
            if (obj != brQ.v) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.mpq
    public void shutdown() {
        fpB e;
        ThreadLocal threadLocal = dbV.R;
        dbV.R.set(null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (R.compareAndSet(this, null, brQ.v)) {
                    break;
                }
            } else if (obj instanceof cby) {
                ((cby) obj).v();
                break;
            } else if (obj == brQ.v) {
                break;
            } else {
                cby cby = new cby(8, true);
                cby.R((Runnable) obj);
                if (R.compareAndSet(this, obj, cby)) {
                    break;
                }
            }
        }
        do {
        } while (xN() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            mr0 mr0 = (mr0) this._delayed;
            if (mr0 != null && (e = mr0.e()) != null) {
                vz(nanoTime, e);
            } else {
                return;
            }
        }
    }

    public final void wm(long j, fpB fpb) {
        int i;
        Thread cr;
        fpB fpb2 = null;
        boolean z = true;
        if (this._isCompleted != 0) {
            i = 1;
        } else {
            mr0 mr0 = (mr0) this._delayed;
            if (mr0 == null) {
                v.compareAndSet(this, null, new mr0(j));
                mr0 = (mr0) this._delayed;
            }
            i = fpb.e(j, mr0, this);
        }
        if (i == 0) {
            mr0 mr02 = (mr0) this._delayed;
            if (mr02 != null) {
                synchronized (mr02) {
                    fpB[] fpbArr = ((iXx) mr02).R;
                    if (fpbArr != null) {
                        fpb2 = fpbArr[0];
                    }
                }
            }
            if (fpb2 != fpb) {
                z = false;
            }
            if (z && Thread.currentThread() != (cr = cr())) {
                LockSupport.unpark(cr);
            }
        } else if (i == 1) {
            vz(j, fpb);
        } else if (i != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0071, code lost:
        r7 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0071 A[EDGE_INSN: B:91:0x0071->B:42:0x0071 ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.mpq
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long xN() {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwK.xN():long");
    }

    public final void yG() {
        this._queue = null;
        this._delayed = null;
    }
}
