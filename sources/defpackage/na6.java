package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: na6  reason: default package */
/* loaded from: classes.dex */
public final class na6 extends eZV implements k5j, aOO {
    public static final /* synthetic */ AtomicReferenceFieldUpdater R = AtomicReferenceFieldUpdater.newUpdater(na6.class, Object.class, "_reusableCancellableContinuation");

    /* renamed from: R  reason: collision with other field name */
    public final aOO f6468R;

    /* renamed from: R  reason: collision with other field name */
    public final kE9 f6470R;

    /* renamed from: R  reason: collision with other field name */
    public Object f6469R = ooA.f6956R;
    public final Object v = cU5.g(v());
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    public na6(kE9 ke9, plU plu) {
        super(-1);
        this.f6470R = ke9;
        this.f6468R = plu;
    }

    public final void H() {
        Object obj = this._reusableCancellableContinuation;
        xx xxVar = obj instanceof xx ? (xx) obj : null;
        if (xxVar != null) {
            xxVar.U();
        }
    }

    @Override // defpackage.eZV
    public final Object L() {
        Object obj = this.f6469R;
        this.f6469R = ooA.f6956R;
        return obj;
    }

    @Override // defpackage.eZV
    public final void R(Object obj, CancellationException cancellationException) {
        if (obj instanceof kIe) {
            ((kIe) obj).f5250R.x(cancellationException);
        }
    }

    public final Throwable U(k0 k0Var) {
        lmI lmi;
        do {
            Object obj = this._reusableCancellableContinuation;
            lmi = ooA.v;
            if (obj != lmi) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (R.compareAndSet(this, obj, null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!R.compareAndSet(this, lmi, k0Var));
        return null;
    }

    @Override // defpackage.aOO
    public final void Y(Object obj) {
        nbD v = this.f6468R.v();
        Throwable R2 = mwl.R(obj);
        Object pag = R2 == null ? obj : new pag(R2, false);
        if (this.f6470R.zw(v)) {
            this.f6469R = pag;
            this.e = 0;
            this.f6470R.mL(v, this);
            return;
        }
        mpq R3 = dbV.R();
        if (R3.iE()) {
            this.f6469R = pag;
            this.e = 0;
            R3.vr(this);
            return;
        }
        R3.cE(true);
        try {
            nbD v2 = v();
            Object i = cU5.i(v2, this.v);
            this.f6468R.Y(obj);
            cU5.C(v2, i);
            do {
            } while (R3.ZW());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final xx Z() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = ooA.v;
                return null;
            } else if (obj instanceof xx) {
                if (R.compareAndSet(this, obj, ooA.v)) {
                    return (xx) obj;
                }
            } else if (obj != ooA.v && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    @Override // defpackage.eZV
    public final aOO c() {
        return this;
    }

    @Override // defpackage.k5j
    public final k5j i() {
        aOO aoo = this.f6468R;
        if (aoo instanceof k5j) {
            return (k5j) aoo;
        }
        return null;
    }

    public final boolean m() {
        return this._reusableCancellableContinuation != null;
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder U = opT.U("DispatchedContinuation[");
        U.append(this.f6470R);
        U.append(", ");
        U.append(aH9.BF(this.f6468R));
        U.append(']');
        return U.toString();
    }

    @Override // defpackage.aOO
    public final nbD v() {
        return this.f6468R.v();
    }

    public final boolean x(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            lmI lmi = ooA.v;
            if (n3x.v(obj, lmi)) {
                if (R.compareAndSet(this, lmi, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (R.compareAndSet(this, obj, null)) {
                    return false;
                }
            }
        }
    }
}
