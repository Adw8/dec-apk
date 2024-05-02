package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: nfJ  reason: default package */
/* loaded from: classes.dex */
public class nfJ implements pd2, zo, a6s {
    public static final /* synthetic */ AtomicReferenceFieldUpdater R = AtomicReferenceFieldUpdater.newUpdater(nfJ.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    public nfJ(boolean z) {
        this._state = z ? dTl.v : dTl.f2619R;
        this._parentHandle = null;
    }

    public static T8 X4(oLj olj) {
        while (olj.i()) {
            olj = olj.j();
        }
        while (true) {
            olj = olj.P();
            if (!olj.i()) {
                if (olj instanceof T8) {
                    return (T8) olj;
                }
                if (olj instanceof npH) {
                    return null;
                }
            }
        }
    }

    public static String iE(Object obj) {
        if (obj instanceof eac) {
            eac eac = (eac) obj;
            if (eac.c()) {
                return "Cancelling";
            }
            if (eac.e()) {
                return "Completing";
            }
        } else if (!(obj instanceof cav)) {
            return obj instanceof pag ? "Cancelled" : "Completed";
        } else {
            if (!((cav) obj).X()) {
                return "New";
            }
        }
        return "Active";
    }

    public final Object A() {
        Object E = E();
        if (!(!(E instanceof cav))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        } else if (!(E instanceof pag)) {
            return dTl.G(E);
        } else {
            throw ((pag) E).f7100R;
        }
    }

    @Override // defpackage.pd2
    public final boolean B() {
        int cE;
        do {
            cE = cE(E());
            if (cE == 0) {
                return false;
            }
        } while (cE != 1);
        return true;
    }

    public final void D(pd2 pd2) {
        if (pd2 == null) {
            this._parentHandle = orE.R;
            return;
        }
        pd2.B();
        Hj t = pd2.t(this);
        this._parentHandle = t;
        if (!(E() instanceof cav)) {
            t.R();
            this._parentHandle = orE.R;
        }
    }

    public final Object E() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof a7C)) {
                return obj;
            }
            ((a7C) obj).R(this);
        }
    }

    public void F(j8f j8f) {
        throw j8f;
    }

    @Override // defpackage.nbD
    public final nbD H(e86 e86) {
        return dTl.d(this, e86);
    }

    public String I() {
        return "Job was cancelled";
    }

    public void J(CancellationException cancellationException) {
        K(cancellationException);
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x00b8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x003f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean K(java.lang.Object r9) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfJ.K(java.lang.Object):boolean");
    }

    @Override // defpackage.nbD
    public final nbD M(nbD nbd) {
        return jjU.t(this, nbd);
    }

    @Override // defpackage.hdJ, defpackage.nbD
    public final hdJ O(e86 e86) {
        return dTl.J(this, e86);
    }

    public final Object Q(eac eac, Object obj) {
        Throwable S;
        Throwable th = null;
        pag pag = obj instanceof pag ? (pag) obj : null;
        if (pag != null) {
            th = pag.f7100R;
        }
        synchronized (eac) {
            eac.c();
            ArrayList<Throwable> L = eac.L(th);
            S = S(eac, L);
            if (S != null && L.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(L.size()));
                for (Throwable th2 : L) {
                    if (th2 != S && th2 != S && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        l6.U(S, th2);
                    }
                }
            }
        }
        if (!(S == null || S == th)) {
            obj = new pag(S, false);
        }
        if (S != null) {
            if (h(S) || f(S)) {
                if (obj != null) {
                    pag.R.compareAndSet((pag) obj, 0, 1);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        vl(obj);
        R.compareAndSet(this, eac, obj instanceof cav ? new do8((cav) obj) : obj);
        z(eac, obj);
        return obj;
    }

    @Override // defpackage.hdJ
    public final e86 R() {
        return hw1.O;
    }

    public final Throwable S(eac eac, ArrayList arrayList) {
        Object obj;
        boolean z;
        Object obj2 = null;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th = (Throwable) obj;
            if (th != null) {
                return th;
            }
            Throwable th2 = (Throwable) arrayList.get(0);
            if (th2 instanceof maT) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    Throwable th3 = (Throwable) next;
                    if (th3 == th2 || !(th3 instanceof maT)) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        obj2 = next;
                        break;
                    }
                }
                Throwable th4 = (Throwable) obj2;
                if (th4 != null) {
                    return th4;
                }
            }
            return th2;
        } else if (eac.c()) {
            return new h53(I(), null, this);
        } else {
            return null;
        }
    }

    public boolean T() {
        return this instanceof c3E;
    }

    public final Object V(aOO aoo) {
        Object E;
        do {
            E = E();
            if (!(E instanceof cav)) {
                if (!(E instanceof pag)) {
                    return dTl.G(E);
                }
                throw ((pag) E).f7100R;
            }
        } while (cE(E) < 0);
        lDP ldp = new lDP(n3x.U(aoo), this);
        ldp.j();
        ldp.y(new pG(1, l(new oRu(2, ldp))));
        return ldp.P();
    }

    @Override // defpackage.pd2
    public boolean X() {
        Object E = E();
        return (E instanceof cav) && ((cav) E).X();
    }

    @Override // defpackage.pd2
    public final CancellationException Z() {
        Object E = E();
        CancellationException cancellationException = null;
        if (E instanceof eac) {
            Throwable v = ((eac) E).v();
            if (v != null) {
                String str = getClass().getSimpleName() + " is cancelling";
                if (v instanceof CancellationException) {
                    cancellationException = (CancellationException) v;
                }
                if (cancellationException != null) {
                    return cancellationException;
                }
                if (str == null) {
                    str = I();
                }
                return new h53(str, v, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (E instanceof cav) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (E instanceof pag) {
            Throwable th = ((pag) E).f7100R;
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            return cancellationException == null ? new h53(I(), th, this) : cancellationException;
        } else {
            return new h53(getClass().getSimpleName() + " has completed normally", null, this);
        }
    }

    public final boolean ZW(eac eac, T8 t8, Object obj) {
        while (jjU.N(t8.R, false, new fTk(this, eac, t8, obj), 1) == orE.R) {
            t8 = X4(t8);
            if (t8 == null) {
                return false;
            }
        }
        return true;
    }

    public final Object _(Object obj) {
        Object xN;
        do {
            xN = xN(E(), obj);
            if (xN == dTl.f2621R) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                pag pag = obj instanceof pag ? (pag) obj : null;
                if (pag != null) {
                    th = pag.f7100R;
                }
                throw new IllegalStateException(str, th);
            }
        } while (xN == dTl.c);
        return xN;
    }

    public boolean b() {
        return this instanceof i2;
    }

    @Override // defpackage.pd2, defpackage.aZq
    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new h53(I(), null, this);
        }
        J(cancellationException);
    }

    public final int cE(Object obj) {
        if (obj instanceof f1O) {
            if (((f1O) obj).R) {
                return 0;
            }
            if (!R.compareAndSet(this, obj, dTl.v)) {
                return -1;
            }
            vr();
            return 1;
        } else if (!(obj instanceof e3H)) {
            return 0;
        } else {
            if (!R.compareAndSet(this, obj, ((e3H) obj).R)) {
                return -1;
            }
            vr();
            return 1;
        }
    }

    public final void cr(pbU pbu) {
        npH nph = new npH();
        pbu.getClass();
        oLj.v.lazySet(nph, pbu);
        oLj.R.lazySet(nph, pbu);
        while (true) {
            if (pbu.N() == pbu) {
                if (oLj.R.compareAndSet(pbu, pbu, nph)) {
                    nph.C(pbu);
                    break;
                }
            } else {
                break;
            }
        }
        R.compareAndSet(this, pbu, pbu.P());
    }

    @Override // defpackage.pd2
    public final Object d(aOO aoo) {
        boolean z;
        while (true) {
            Object E = E();
            if (E instanceof cav) {
                if (cE(E) >= 0) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            dTl.K(aoo.v());
            return o8s.R;
        }
        xx xxVar = new xx(1, n3x.U(aoo));
        xxVar.j();
        xxVar.y(new pG(1, l(new oRu(3, xxVar))));
        Object P = xxVar.P();
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        if (P != bgr) {
            P = o8s.R;
        }
        return P == bgr ? P : o8s.R;
    }

    public boolean f(Throwable th) {
        return false;
    }

    public final boolean h(Throwable th) {
        if (b()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        Hj hj = (Hj) this._parentHandle;
        return (hj == null || hj == orE.R) ? z : hj.L(th) || z;
    }

    @Override // defpackage.pd2
    public final boolean isCancelled() {
        Object E = E();
        return (E instanceof pag) || ((E instanceof eac) && ((eac) E).c());
    }

    @Override // defpackage.pd2
    public final jZi l(kg9 kg9) {
        return q(false, true, kg9);
    }

    public String mL() {
        return getClass().getSimpleName();
    }

    public final Throwable n(Object obj) {
        Throwable th;
        CancellationException cancellationException = null;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new h53(I(), null, this) : th2;
        } else if (obj != null) {
            nfJ nfj = (nfJ) ((a6s) obj);
            Object E = nfj.E();
            if (E instanceof eac) {
                th = ((eac) E).v();
            } else if (E instanceof pag) {
                th = ((pag) E).f7100R;
            } else if (!(E instanceof cav)) {
                th = null;
            } else {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + E).toString());
            }
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                StringBuilder U = opT.U("Parent job is ");
                U.append(iE(E));
                cancellationException = new h53(U.toString(), th, nfj);
            }
            return cancellationException;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    @Override // defpackage.nbD
    public final Object o(Object obj, iv7 iv7) {
        return iv7.J(obj, this);
    }

    public final Hj p() {
        return (Hj) this._parentHandle;
    }

    @Override // defpackage.pd2
    public final jZi q(boolean z, boolean z2, kg9 kg9) {
        pbU pbu;
        Throwable th;
        boolean z3;
        Throwable th2 = null;
        if (z) {
            pbu = kg9 instanceof g9t ? (g9t) kg9 : null;
            if (pbu == null) {
                pbu = new bow(kg9);
            }
        } else {
            pbu = kg9 instanceof pbU ? (pbU) kg9 : null;
            if (pbu == null) {
                pbu = new oRu(1, kg9);
            }
        }
        pbu.R = this;
        while (true) {
            Object E = E();
            if (E instanceof f1O) {
                f1O f1o = (f1O) E;
                if (!f1o.R) {
                    npH nph = new npH();
                    cav cav = nph;
                    if (!f1o.R) {
                        cav = new e3H(nph);
                    }
                    R.compareAndSet(this, f1o, cav == 1 ? 1 : 0);
                } else if (R.compareAndSet(this, E, pbu)) {
                    return pbu;
                }
            } else if (E instanceof cav) {
                npH Z = ((cav) E).Z();
                if (Z != null) {
                    jZi jzi = orE.R;
                    boolean z4 = false;
                    if (!z || !(E instanceof eac)) {
                        th = null;
                    } else {
                        synchronized (E) {
                            th = ((eac) E).v();
                            if (th == null || ((kg9 instanceof T8) && !((eac) E).e())) {
                                bxw bxw = new bxw(pbu, this, E);
                                while (true) {
                                    int K = Z.j().K(pbu, Z, bxw);
                                    if (K != 1) {
                                        if (K == 2) {
                                            z3 = false;
                                            break;
                                        }
                                    } else {
                                        z3 = true;
                                        break;
                                    }
                                }
                                if (z3) {
                                    if (th == null) {
                                        return pbu;
                                    }
                                    jzi = pbu;
                                }
                            }
                        }
                    }
                    if (th != null) {
                        if (z2) {
                            kg9.x(th);
                        }
                        return jzi;
                    }
                    bxw bxw2 = new bxw(pbu, this, E);
                    while (true) {
                        int K2 = Z.j().K(pbu, Z, bxw2);
                        if (K2 != 1) {
                            if (K2 == 2) {
                                break;
                            }
                        } else {
                            z4 = true;
                            break;
                        }
                    }
                    if (z4) {
                        return pbu;
                    }
                } else if (E != null) {
                    cr((pbU) E);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                }
            } else {
                if (z2) {
                    pag pag = E instanceof pag ? (pag) E : null;
                    if (pag != null) {
                        th2 = pag.f7100R;
                    }
                    kg9.x(th2);
                }
                return orE.R;
            }
        }
    }

    public final npH r(cav cav) {
        npH Z = cav.Z();
        if (Z != null) {
            return Z;
        }
        if (cav instanceof f1O) {
            return new npH();
        }
        if (cav instanceof pbU) {
            cr((pbU) cav);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + cav).toString());
    }

    public boolean s() {
        return true;
    }

    @Override // defpackage.pd2
    public final Hj t(nfJ nfj) {
        return (Hj) jjU.N(this, true, new T8(nfj), 2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mL() + '{' + iE(E()) + '}');
        sb.append('@');
        sb.append(aH9.G(this));
        return sb.toString();
    }

    public boolean u(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return K(th) && s();
    }

    public void vl(Object obj) {
    }

    public void vr() {
    }

    public final boolean w(Object obj) {
        Object xN;
        do {
            xN = xN(E(), obj);
            if (xN == dTl.f2621R) {
                return false;
            }
            if (xN == dTl.f2624v) {
                return true;
            }
        } while (xN == dTl.c);
        y(xN);
        return true;
    }

    public final Object xN(Object obj, Object obj2) {
        if (!(obj instanceof cav)) {
            return dTl.f2621R;
        }
        boolean z = true;
        z = false;
        if (((obj instanceof f1O) || (obj instanceof pbU)) && !(obj instanceof T8) && !(obj2 instanceof pag)) {
            cav cav = (cav) obj;
            if (R.compareAndSet(this, cav, obj2 instanceof cav ? new do8((cav) obj2) : obj2)) {
                vl(obj2);
                z(cav, obj2);
            }
            return z ? obj2 : dTl.c;
        }
        cav cav2 = (cav) obj;
        npH r = r(cav2);
        if (r == null) {
            return dTl.c;
        }
        T8 t8 = null;
        eac eac = cav2 instanceof eac ? (eac) cav2 : null;
        if (eac == null) {
            eac = new eac(r, null);
        }
        synchronized (eac) {
            if (eac.e()) {
                return dTl.f2621R;
            }
            eac.m();
            if (eac == cav2 || R.compareAndSet(this, cav2, eac)) {
                boolean c = eac.c();
                pag pag = obj2 instanceof pag ? (pag) obj2 : null;
                if (pag != null) {
                    eac.R(pag.f7100R);
                }
                Throwable v = eac.v();
                if (!Boolean.valueOf(true ^ c).booleanValue()) {
                    v = null;
                }
                if (v != null) {
                    zw(r, v);
                }
                T8 t82 = cav2 instanceof T8 ? (T8) cav2 : null;
                if (t82 == null) {
                    npH Z = cav2.Z();
                    if (Z != null) {
                        t8 = X4(Z);
                    }
                } else {
                    t8 = t82;
                }
                return (t8 == null || !ZW(eac, t8, obj2)) ? Q(eac, obj2) : dTl.f2624v;
            }
            return dTl.c;
        }
    }

    public void y(Object obj) {
    }

    public final void z(cav cav, Object obj) {
        Hj hj = (Hj) this._parentHandle;
        if (hj != null) {
            hj.R();
            this._parentHandle = orE.R;
        }
        j8f j8f = null;
        pag pag = obj instanceof pag ? (pag) obj : null;
        Throwable th = pag != null ? pag.f7100R : null;
        if (cav instanceof pbU) {
            try {
                ((pbU) cav).h(th);
            } catch (Throwable th2) {
                F(new j8f("Exception in completion handler " + cav + " for " + this, th2));
            }
        } else {
            npH Z = cav.Z();
            if (Z != null) {
                for (oLj olj = (oLj) Z.N(); !n3x.v(olj, Z); olj = olj.P()) {
                    if (olj instanceof pbU) {
                        pbU pbu = (pbU) olj;
                        try {
                            pbu.h(th);
                        } catch (Throwable th3) {
                            if (j8f != null) {
                                l6.U(j8f, th3);
                            } else {
                                j8f = new j8f("Exception in completion handler " + pbu + " for " + this, th3);
                            }
                        }
                    }
                }
                if (j8f != null) {
                    F(j8f);
                }
            }
        }
    }

    public final void zw(npH nph, Throwable th) {
        j8f j8f = null;
        for (oLj olj = (oLj) nph.N(); !n3x.v(olj, nph); olj = olj.P()) {
            if (olj instanceof g9t) {
                pbU pbu = (pbU) olj;
                try {
                    pbu.h(th);
                } catch (Throwable th2) {
                    if (j8f != null) {
                        l6.U(j8f, th2);
                    } else {
                        j8f = new j8f("Exception in completion handler " + pbu + " for " + this, th2);
                    }
                }
            }
        }
        if (j8f != null) {
            F(j8f);
        }
        h(th);
    }
}
