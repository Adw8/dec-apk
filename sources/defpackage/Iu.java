package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Iu  reason: default package */
/* loaded from: classes.dex */
public final class Iu extends pdD {
    public final AtomicReferenceFieldUpdater R;
    public final AtomicReferenceFieldUpdater X;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater v;

    public Iu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(0);
        this.R = atomicReferenceFieldUpdater;
        this.v = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.e = atomicReferenceFieldUpdater4;
        this.X = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.pdD
    public final void A(w8 w8Var, w8 w8Var2) {
        this.v.lazySet(w8Var, w8Var2);
    }

    @Override // defpackage.pdD
    public final boolean N(az azVar, WQ wq, WQ wq2) {
        return this.e.compareAndSet(azVar, wq, wq2);
    }

    @Override // defpackage.pdD
    public final boolean P(az azVar, Object obj, Object obj2) {
        return this.X.compareAndSet(azVar, obj, obj2);
    }

    @Override // defpackage.pdD
    public final void S(w8 w8Var, Thread thread) {
        this.R.lazySet(w8Var, thread);
    }

    @Override // defpackage.pdD
    public final boolean j(az azVar, w8 w8Var, w8 w8Var2) {
        return this.c.compareAndSet(azVar, w8Var, w8Var2);
    }
}
