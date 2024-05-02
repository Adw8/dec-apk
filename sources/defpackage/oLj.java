package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: oLj  reason: default package */
/* loaded from: classes.dex */
public class oLj {
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater R = AtomicReferenceFieldUpdater.newUpdater(oLj.class, Object.class, "_next");
    public static final /* synthetic */ AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(oLj.class, Object.class, "_prev");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(oLj.class, Object.class, "_removedRef");

    public final void C(oLj olj) {
        oLj olj2;
        do {
            olj2 = (oLj) olj._prev;
            if (N() != olj) {
                return;
            }
        } while (!v.compareAndSet(olj, olj2, this));
        if (i()) {
            olj.U();
        }
    }

    public final boolean H(oLj olj, abW abw) {
        v.lazySet(olj, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R;
        atomicReferenceFieldUpdater.lazySet(olj, abw);
        if (!atomicReferenceFieldUpdater.compareAndSet(this, abw, olj)) {
            return false;
        }
        olj.C(abw);
        return true;
    }

    public final int K(oLj olj, oLj olj2, hlx hlx) {
        v.lazySet(olj, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R;
        atomicReferenceFieldUpdater.lazySet(olj, olj2);
        hlx.v = olj2;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, olj2, hlx)) {
            return 0;
        }
        return hlx.R(this) == null ? 1 : 2;
    }

    public final Object N() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof a7C)) {
                return obj;
            }
            ((a7C) obj).R(this);
        }
    }

    public final oLj P() {
        oLj olj;
        Object N = N();
        joD jod = N instanceof joD ? (joD) N : null;
        return (jod == null || (olj = jod.R) == null) ? (oLj) N : olj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        if (defpackage.oLj.R.compareAndSet(r3, r2, ((defpackage.joD) r4).R) != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.oLj U() {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r0 = r7._prev
            oLj r0 = (defpackage.oLj) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.oLj.v
            boolean r0 = r1.compareAndSet(r7, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r7.i()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != 0) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof defpackage.a7C
            if (r5 == 0) goto L_0x002c
            a7C r4 = (defpackage.a7C) r4
            r4.R(r2)
            goto L_0x0000
        L_0x002c:
            boolean r5 = r4 instanceof defpackage.joD
            if (r5 == 0) goto L_0x0046
            if (r3 == 0) goto L_0x0041
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.oLj.R
            joD r4 = (defpackage.joD) r4
            oLj r4 = r4.R
            boolean r2 = r5.compareAndSet(r3, r2, r4)
            if (r2 != 0) goto L_0x003f
            goto L_0x0000
        L_0x003f:
            r2 = r3
            goto L_0x0006
        L_0x0041:
            java.lang.Object r2 = r2._prev
            oLj r2 = (defpackage.oLj) r2
            goto L_0x0007
        L_0x0046:
            r3 = r4
            oLj r3 = (defpackage.oLj) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oLj.U():oLj");
    }

    public boolean V() {
        return o() == null;
    }

    public boolean i() {
        return N() instanceof joD;
    }

    public final oLj j() {
        oLj U = U();
        if (U == null) {
            U = (oLj) this._prev;
            while (U.i()) {
                U = (oLj) U._prev;
            }
        }
        return U;
    }

    public final oLj o() {
        Object N;
        oLj olj;
        joD jod;
        do {
            N = N();
            if (N instanceof joD) {
                return ((joD) N).R;
            }
            if (N == this) {
                return (oLj) N;
            }
            olj = (oLj) N;
            jod = (joD) olj._removedRef;
            if (jod == null) {
                jod = new joD(olj);
                c.lazySet(olj, jod);
            }
        } while (!R.compareAndSet(this, N, jod));
        olj.U();
        return null;
    }

    public final void t() {
        while (true) {
            Object N = this.N();
            if (N instanceof joD) {
                this = ((joD) N).R;
            } else {
                this.U();
                return;
            }
        }
    }

    public String toString() {
        return new eyR(this) + '@' + aH9.G(this);
    }
}
