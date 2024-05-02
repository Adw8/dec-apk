package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: xx  reason: default package */
/* loaded from: classes.dex */
public class xx extends eZV implements k0, k5j {
    public static final /* synthetic */ AtomicIntegerFieldUpdater R = AtomicIntegerFieldUpdater.newUpdater(xx.class, "_decision");

    /* renamed from: R  reason: collision with other field name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7477R = AtomicReferenceFieldUpdater.newUpdater(xx.class, Object.class, "_state");

    /* renamed from: R  reason: collision with other field name */
    public final aOO f7478R;

    /* renamed from: R  reason: collision with other field name */
    public jZi f7479R;

    /* renamed from: R  reason: collision with other field name */
    public final nbD f7480R;
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = Rz.R;

    public xx(int i, aOO aoo) {
        super(i);
        this.f7478R = aoo;
        this.f7480R = aoo.v();
    }

    public static void o(Object obj, kg9 kg9) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + kg9 + ", already has " + obj).toString());
    }

    public static Object u(dbJ dbj, Object obj, int i, kg9 kg9, Object obj2) {
        if (obj instanceof pag) {
            return obj;
        }
        boolean z = true;
        if (!(i == 1 || i == 2)) {
            z = false;
        }
        if (!z && obj2 == null) {
            return obj;
        }
        if (kg9 == null && ((!(dbj instanceof Tx) || (dbj instanceof bA)) && obj2 == null)) {
            return obj;
        }
        return new aFh(obj, dbj instanceof Tx ? (Tx) dbj : null, kg9, obj2, null, 16);
    }

    /* JADX INFO: finally extract failed */
    public final void C(int i) {
        boolean z;
        boolean z2;
        while (true) {
            int i2 = this._decision;
            z = false;
            if (i2 == 0) {
                if (R.compareAndSet(this, 0, 2)) {
                    z2 = true;
                    break;
                }
            } else if (i2 == 1) {
                z2 = false;
            } else {
                throw new IllegalStateException("Already resumed".toString());
            }
        }
        if (!z2) {
            aOO aoo = this.f7478R;
            boolean z3 = i == 4;
            if (!z3 && (aoo instanceof na6)) {
                boolean z4 = i == 1 || i == 2;
                int i3 = this.e;
                if (i3 == 1 || i3 == 2) {
                    z = true;
                }
                if (z4 == z) {
                    kE9 ke9 = ((na6) aoo).f6470R;
                    nbD v = aoo.v();
                    if (ke9.zw(v)) {
                        ke9.mL(v, this);
                        return;
                    }
                    mpq R2 = dbV.R();
                    if (R2.iE()) {
                        R2.vr(this);
                        return;
                    }
                    R2.cE(true);
                    try {
                        gvP.z(this, this.f7478R, true);
                        do {
                        } while (R2.ZW());
                    } catch (Throwable th) {
                        try {
                            O(th, null);
                        } finally {
                            R2.vl(true);
                        }
                    }
                    return;
                }
            }
            gvP.z(this, aoo, z3);
        }
    }

    public final boolean H(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof dbJ)) {
                return false;
            }
            z = obj instanceof Tx;
        } while (!f7477R.compareAndSet(this, obj, new yq(this, th, z)));
        Tx tx = z ? (Tx) obj : null;
        if (tx != null) {
            Z(tx, th);
        }
        if (!V()) {
            U();
        }
        C(this.e);
        return true;
    }

    public final void I(kE9 ke9) {
        o8s o8s = o8s.R;
        aOO aoo = this.f7478R;
        na6 na6 = aoo instanceof na6 ? (na6) aoo : null;
        h(o8s, (na6 != null ? na6.f6470R : null) == ke9 ? 4 : this.e, null);
    }

    public final boolean J() {
        Object obj = this._state;
        if (!(obj instanceof aFh) || ((aFh) obj).v == null) {
            this._decision = 0;
            this._state = Rz.R;
            return true;
        }
        U();
        return false;
    }

    public String K() {
        return "CancellableContinuation";
    }

    @Override // defpackage.eZV
    public final Object L() {
        return this._state;
    }

    public Throwable N(nfJ nfj) {
        return nfj.Z();
    }

    public final Object P() {
        boolean z;
        boolean z2;
        pd2 pd2;
        Throwable U;
        Throwable U2;
        boolean V = V();
        while (true) {
            int i = this._decision;
            z = true;
            if (i == 0) {
                if (R.compareAndSet(this, 0, 1)) {
                    z2 = true;
                    break;
                }
            } else if (i == 2) {
                z2 = false;
            } else {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        na6 na6 = null;
        if (z2) {
            if (this.f7479R == null) {
                g();
            }
            if (V) {
                aOO aoo = this.f7478R;
                if (aoo instanceof na6) {
                    na6 = (na6) aoo;
                }
                if (!(na6 == null || (U2 = na6.U(this)) == null)) {
                    U();
                    H(U2);
                }
            }
            return bGR.COROUTINE_SUSPENDED;
        }
        if (V) {
            aOO aoo2 = this.f7478R;
            if (aoo2 instanceof na6) {
                na6 = (na6) aoo2;
            }
            if (!(na6 == null || (U = na6.U(this)) == null)) {
                U();
                H(U);
            }
        }
        Object obj = this._state;
        if (!(obj instanceof pag)) {
            int i2 = this.e;
            if (!(i2 == 1 || i2 == 2)) {
                z = false;
            }
            if (!z || (pd2 = (pd2) this.f7480R.O(hw1.O)) == null || pd2.X()) {
                return X(obj);
            }
            CancellationException Z = pd2.Z();
            R(obj, Z);
            throw Z;
        }
        throw ((pag) obj).f7100R;
    }

    @Override // defpackage.eZV
    public final void R(Object obj, CancellationException cancellationException) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof dbJ) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof pag)) {
                if (obj2 instanceof aFh) {
                    aFh afh = (aFh) obj2;
                    if (!(afh.f811R != null)) {
                        if (f7477R.compareAndSet(this, obj2, aFh.R(afh, null, cancellationException, 15))) {
                            Tx tx = afh.R;
                            if (tx != null) {
                                Z(tx, cancellationException);
                            }
                            kg9 kg9 = afh.f812R;
                            if (kg9 != null) {
                                x(kg9, cancellationException);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (f7477R.compareAndSet(this, obj2, new aFh(obj2, null, null, null, cancellationException, 14))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void U() {
        jZi jzi = this.f7479R;
        if (jzi != null) {
            jzi.R();
            this.f7479R = orE.R;
        }
    }

    public final boolean V() {
        return (this.e == 2) && ((na6) this.f7478R).m();
    }

    @Override // defpackage.eZV
    public final Object X(Object obj) {
        return obj instanceof aFh ? ((aFh) obj).f810R : obj;
    }

    @Override // defpackage.aOO
    public final void Y(Object obj) {
        Throwable R2 = mwl.R(obj);
        if (R2 != null) {
            obj = new pag(R2, false);
        }
        h(obj, this.e, null);
    }

    public final void Z(Tx tx, Throwable th) {
        try {
            tx.R(th);
        } catch (Throwable th2) {
            nbD nbd = this.f7480R;
            pdD.o(nbd, new j8f("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.eZV
    public final aOO c() {
        return this.f7478R;
    }

    @Override // defpackage.eZV
    public final Throwable e(Object obj) {
        Throwable e = super.e(obj);
        if (e != null) {
            return e;
        }
        return null;
    }

    public final jZi g() {
        pd2 pd2 = (pd2) this.f7480R.O(hw1.O);
        if (pd2 == null) {
            return null;
        }
        jZi N = jjU.N(pd2, true, new C_(this), 2);
        this.f7479R = N;
        return N;
    }

    public final void h(Object obj, int i, kg9 kg9) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof dbJ) {
            } else {
                if (obj2 instanceof yq) {
                    yq yqVar = (yq) obj2;
                    yqVar.getClass();
                    if (yq.v.compareAndSet(yqVar, 0, 1)) {
                        if (kg9 != null) {
                            x(kg9, yqVar.f7100R);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        } while (!f7477R.compareAndSet(this, obj2, u((dbJ) obj2, obj, i, kg9, null)));
        if (!V()) {
            U();
        }
        C(i);
    }

    @Override // defpackage.k5j
    public final k5j i() {
        aOO aoo = this.f7478R;
        if (aoo instanceof k5j) {
            return (k5j) aoo;
        }
        return null;
    }

    public final void j() {
        jZi g = g();
        if (g != null && t()) {
            g.R();
            this.f7479R = orE.R;
        }
    }

    public final void m(kg9 kg9, Throwable th) {
        try {
            kg9.x(th);
        } catch (Throwable th2) {
            nbD nbd = this.f7480R;
            pdD.o(nbd, new j8f("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean t() {
        return !(this._state instanceof dbJ);
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(K());
        sb.append('(');
        sb.append(aH9.BF(this.f7478R));
        sb.append("){");
        Object obj = this._state;
        sb.append(obj instanceof dbJ ? "Active" : obj instanceof yq ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(aH9.G(this));
        return sb.toString();
    }

    @Override // defpackage.aOO
    public final nbD v() {
        return this.f7480R;
    }

    public final void x(kg9 kg9, Throwable th) {
        try {
            kg9.x(th);
        } catch (Throwable th2) {
            nbD nbd = this.f7480R;
            pdD.o(nbd, new j8f("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void y(kg9 kg9) {
        Tx pGVar = kg9 instanceof Tx ? (Tx) kg9 : new pG(2, kg9);
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof Rz)) {
                Throwable th = null;
                if (!(obj instanceof Tx)) {
                    boolean z = obj instanceof pag;
                    boolean z2 = true;
                    if (z) {
                        pag pag = (pag) obj;
                        pag.getClass();
                        if (!pag.R.compareAndSet(pag, 0, 1)) {
                            o(obj, kg9);
                            throw null;
                        } else if (obj instanceof yq) {
                            if (!z) {
                                pag = null;
                            }
                            if (pag != null) {
                                th = pag.f7100R;
                            }
                            m(kg9, th);
                            return;
                        } else {
                            return;
                        }
                    } else if (obj instanceof aFh) {
                        aFh afh = (aFh) obj;
                        if (afh.R != null) {
                            o(obj, kg9);
                            throw null;
                        } else if (!(pGVar instanceof bA)) {
                            Throwable th2 = afh.f811R;
                            if (th2 == null) {
                                z2 = false;
                            }
                            if (z2) {
                                m(kg9, th2);
                                return;
                            } else {
                                if (f7477R.compareAndSet(this, obj, aFh.R(afh, pGVar, null, 29))) {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } else if (!(pGVar instanceof bA)) {
                        if (f7477R.compareAndSet(this, obj, new aFh(obj, pGVar, null, null, null, 28))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    o(obj, kg9);
                    throw null;
                }
            } else if (f7477R.compareAndSet(this, obj, pGVar)) {
                return;
            }
        }
    }

    public final lmI z(Object obj, Object obj2, kg9 kg9) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof dbJ) {
            } else if (!(obj3 instanceof aFh) || obj2 == null || ((aFh) obj3).v != obj2) {
                return null;
            } else {
                return mxC.f6247R;
            }
        } while (!f7477R.compareAndSet(this, obj3, u((dbJ) obj3, obj, this.e, kg9, obj2)));
        if (!V()) {
            U();
        }
        return mxC.f6247R;
    }
}
