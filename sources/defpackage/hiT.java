package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: hiT  reason: default package */
/* loaded from: classes.dex */
public final class hiT {
    public final i97 R;

    /* renamed from: R  reason: collision with other field name */
    public final String f4349R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f4350R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public mGS f4351R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4352R;
    public boolean v;

    public hiT(i97 i97, String str) {
        this.R = i97;
        this.f4349R = str;
    }

    public static void c(hiT hit, String str, f_c f_c) {
        hit.getClass();
        hit.e(new aHy(str, true, f_c), 0);
    }

    public final void O() {
        bd4 bd4 = khE.R;
        synchronized (this.R) {
            this.f4352R = true;
            if (v()) {
                this.R.X(this);
            }
        }
    }

    public final void R() {
        bd4 bd4 = khE.R;
        synchronized (this.R) {
            if (v()) {
                this.R.X(this);
            }
        }
    }

    public final boolean X(mGS mgs, long j, boolean z) {
        String str;
        hiT hit = mgs.f5990R;
        if (hit != this) {
            if (hit == null) {
                mgs.f5990R = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        this.R.f4473R.getClass();
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        int indexOf = this.f4350R.indexOf(mgs);
        if (indexOf != -1) {
            if (mgs.R <= j2) {
                Logger logger = this.R.f4475R;
                if (logger.isLoggable(Level.FINE)) {
                    jjU.c(logger, mgs, this, "already scheduled");
                }
                return false;
            }
            this.f4350R.remove(indexOf);
        }
        mgs.R = j2;
        Logger logger2 = this.R.f4475R;
        if (logger2.isLoggable(Level.FINE)) {
            if (z) {
                StringBuilder U = opT.U("run again after ");
                U.append(jjU.H(j2 - nanoTime));
                str = U.toString();
            } else {
                StringBuilder U2 = opT.U("scheduled after ");
                U2.append(jjU.H(j2 - nanoTime));
                str = U2.toString();
            }
            jjU.c(logger2, mgs, this, str);
        }
        Iterator it = this.f4350R.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((mGS) it.next()).R - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.f4350R.size();
        }
        this.f4350R.add(i, mgs);
        return i == 0;
    }

    public final void e(mGS mgs, long j) {
        synchronized (this.R) {
            if (!this.f4352R) {
                if (X(mgs, j, false)) {
                    this.R.X(this);
                }
            } else if (mgs.f5992R) {
                Logger logger = this.R.f4475R;
                if (logger.isLoggable(Level.FINE)) {
                    jjU.c(logger, mgs, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.R.f4475R;
                if (logger2.isLoggable(Level.FINE)) {
                    jjU.c(logger2, mgs, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final String toString() {
        return this.f4349R;
    }

    public final boolean v() {
        mGS mgs = this.f4351R;
        if (mgs != null && mgs.f5992R) {
            this.v = true;
        }
        boolean z = false;
        for (int size = this.f4350R.size() - 1; -1 < size; size--) {
            if (((mGS) this.f4350R.get(size)).f5992R) {
                Logger logger = this.R.f4475R;
                mGS mgs2 = (mGS) this.f4350R.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    jjU.c(logger, mgs2, this, "canceled");
                }
                this.f4350R.remove(size);
                z = true;
            }
        }
        return z;
    }
}
