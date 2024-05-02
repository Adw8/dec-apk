package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: hSI  reason: default package */
/* loaded from: classes.dex */
public class hSI {
    public static final /* synthetic */ AtomicReferenceFieldUpdater R = AtomicReferenceFieldUpdater.newUpdater(hSI.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur = new cby(8, false);

    public final boolean R(Object obj) {
        while (true) {
            cby cby = (cby) this._cur;
            int R2 = cby.R(obj);
            if (R2 == 0) {
                return true;
            }
            if (R2 == 1) {
                R.compareAndSet(this, cby, cby.X());
            } else if (R2 == 2) {
                return false;
            }
        }
    }

    public final int c() {
        return ((cby) this._cur).c();
    }

    public final Object e() {
        while (true) {
            cby cby = (cby) this._cur;
            Object O = cby.O();
            if (O != cby.f2157R) {
                return O;
            }
            R.compareAndSet(this, cby, cby.X());
        }
    }

    public final void v() {
        while (true) {
            cby cby = (cby) this._cur;
            if (!cby.v()) {
                R.compareAndSet(this, cby, cby.X());
            } else {
                return;
            }
        }
    }
}
