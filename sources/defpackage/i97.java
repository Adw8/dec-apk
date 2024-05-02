package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* renamed from: i97  reason: default package */
/* loaded from: classes.dex */
public final class i97 {

    /* renamed from: R  reason: collision with other field name */
    public long f4471R;

    /* renamed from: R  reason: collision with other field name */
    public final hgc f4473R;

    /* renamed from: R  reason: collision with other field name */
    public final Logger f4475R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4476R;
    public static final Logger v = Logger.getLogger(i97.class.getName());
    public static final i97 R = new i97(new hgc(new mlq(jQ.g(new StringBuilder(), khE.f5394R, " TaskRunner"), true)));

    /* renamed from: R  reason: collision with other field name */
    public int f4470R = 10000;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f4474R = new ArrayList();

    /* renamed from: v  reason: collision with other field name */
    public final ArrayList f4477v = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public final fu5 f4472R = new fu5(this);

    public i97(hgc hgc) {
        Logger logger = v;
        this.f4473R = hgc;
        this.f4475R = logger;
    }

    public static final void R(i97 i97, mGS mgs) {
        i97.getClass();
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(mgs.f5991R);
        try {
            long R2 = mgs.R();
            synchronized (i97) {
                try {
                    i97.v(mgs, R2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            currentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (i97) {
                try {
                    i97.v(mgs, -1);
                    currentThread.setName(name);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: [('Q' char), (r0v1 int)] */
    public final hiT O() {
        int i;
        synchronized (this) {
            i = this.f4470R;
            this.f4470R = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i);
        return new hiT(this, sb.toString());
    }

    public final void X(hiT hit) {
        bd4 bd4 = khE.R;
        if (hit.f4351R == null) {
            if (!hit.f4350R.isEmpty()) {
                ArrayList arrayList = this.f4477v;
                byte[] bArr = asb.f1481R;
                if (!arrayList.contains(hit)) {
                    arrayList.add(hit);
                }
            } else {
                this.f4477v.remove(hit);
            }
        }
        if (this.f4476R) {
            this.f4473R.getClass();
            notify();
            return;
        }
        hgc hgc = this.f4473R;
        hgc.R.execute(this.f4472R);
    }

    public final mGS c() {
        boolean z;
        bd4 bd4 = khE.R;
        while (!this.f4477v.isEmpty()) {
            this.f4473R.getClass();
            long nanoTime = System.nanoTime();
            long j = Long.MAX_VALUE;
            Iterator it = this.f4477v.iterator();
            mGS mgs = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                mGS mgs2 = (mGS) ((hiT) it.next()).f4350R.get(0);
                long max = Math.max(0L, mgs2.R - nanoTime);
                if (max > 0) {
                    j = Math.min(max, j);
                } else if (mgs != null) {
                    z = true;
                    break;
                } else {
                    mgs = mgs2;
                }
            }
            if (mgs != null) {
                bd4 bd42 = khE.R;
                mgs.R = -1;
                hiT hit = mgs.f5990R;
                hit.f4350R.remove(mgs);
                this.f4477v.remove(hit);
                hit.f4351R = mgs;
                this.f4474R.add(hit);
                if (z || (!this.f4476R && (!this.f4477v.isEmpty()))) {
                    this.f4473R.R.execute(this.f4472R);
                }
                return mgs;
            } else if (this.f4476R) {
                if (j < this.f4471R - nanoTime) {
                    this.f4473R.getClass();
                    notify();
                }
                return null;
            } else {
                this.f4476R = true;
                this.f4471R = nanoTime + j;
                try {
                    try {
                        this.f4473R.getClass();
                        long j2 = j / 1000000;
                        long j3 = j - (1000000 * j2);
                        if (j2 > 0 || j > 0) {
                            wait(j2, (int) j3);
                        }
                    } catch (InterruptedException unused) {
                        e();
                    }
                } finally {
                    this.f4476R = false;
                }
            }
        }
        return null;
    }

    public final void e() {
        bd4 bd4 = khE.R;
        for (int size = this.f4474R.size() - 1; -1 < size; size--) {
            ((hiT) this.f4474R.get(size)).v();
        }
        for (int size2 = this.f4477v.size() - 1; -1 < size2; size2--) {
            hiT hit = (hiT) this.f4477v.get(size2);
            hit.v();
            if (hit.f4350R.isEmpty()) {
                this.f4477v.remove(size2);
            }
        }
    }

    public final void v(mGS mgs, long j) {
        bd4 bd4 = khE.R;
        hiT hit = mgs.f5990R;
        if (hit.f4351R == mgs) {
            boolean z = hit.v;
            hit.v = false;
            hit.f4351R = null;
            this.f4474R.remove(hit);
            if (j != -1 && !z && !hit.f4352R) {
                hit.X(mgs, j, true);
            }
            if (!hit.f4350R.isEmpty()) {
                this.f4477v.add(hit);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
