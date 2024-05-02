package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: hf6  reason: default package */
/* loaded from: classes.dex */
public final class hf6 implements aOO, k5j {
    public static final AtomicReferenceFieldUpdater R = AtomicReferenceFieldUpdater.newUpdater(hf6.class, Object.class, "result");

    /* renamed from: R  reason: collision with other field name */
    public final aOO f4339R;
    private volatile Object result;

    public hf6(bGR bgr, aOO aoo) {
        this.f4339R = aoo;
        this.result = bgr;
    }

    public final Object R() {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        Object obj = this.result;
        bGR bgr2 = bGR.UNDECIDED;
        if (obj == bgr2) {
            if (R.compareAndSet(this, bgr2, bgr)) {
                return bgr;
            }
            obj = this.result;
        }
        if (obj == bGR.RESUMED) {
            return bgr;
        }
        if (!(obj instanceof bvw)) {
            return obj;
        }
        throw ((bvw) obj).R;
    }

    @Override // defpackage.aOO
    public final void Y(Object obj) {
        while (true) {
            Object obj2 = this.result;
            bGR bgr = bGR.UNDECIDED;
            if (obj2 != bgr) {
                bGR bgr2 = bGR.COROUTINE_SUSPENDED;
                if (obj2 != bgr2) {
                    throw new IllegalStateException("Already resumed");
                } else if (R.compareAndSet(this, bgr2, bGR.RESUMED)) {
                    this.f4339R.Y(obj);
                    return;
                }
            } else if (R.compareAndSet(this, bgr, obj)) {
                return;
            }
        }
    }

    @Override // defpackage.k5j
    public final k5j i() {
        aOO aoo = this.f4339R;
        if (aoo instanceof k5j) {
            return (k5j) aoo;
        }
        return null;
    }

    public final String toString() {
        StringBuilder U = opT.U("SafeContinuation for ");
        U.append(this.f4339R);
        return U.toString();
    }

    @Override // defpackage.aOO
    public final nbD v() {
        return this.f4339R.v();
    }
}
