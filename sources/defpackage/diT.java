package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: diT  reason: default package */
/* loaded from: classes.dex */
public final class diT extends nJ {

    /* renamed from: R  reason: collision with other field name */
    public final ReentrantLock f2830R = new ReentrantLock();
    public Object R = l6.R;

    public diT(kg9 kg9) {
        super(kg9);
    }

    @Override // defpackage.DW
    public final boolean C() {
        return false;
    }

    @Override // defpackage.DW
    public final boolean H() {
        return false;
    }

    /* JADX INFO: finally extract failed */
    @Override // defpackage.nJ
    public final void J(boolean z) {
        kg9 kg9;
        ReentrantLock reentrantLock = this.f2830R;
        reentrantLock.lock();
        try {
            lmI lmi = l6.R;
            Object obj = this.R;
            cPP cpp = null;
            if (!(obj == lmi || (kg9 = ((DW) this).f76R) == null)) {
                cpp = l6.P(kg9, obj, null);
            }
            this.R = lmi;
            reentrantLock.unlock();
            super.J(z);
            if (cpp != null) {
                throw cpp;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.nJ
    public final boolean V() {
        return false;
    }

    @Override // defpackage.DW
    public final String X() {
        ReentrantLock reentrantLock = this.f2830R;
        reentrantLock.lock();
        try {
            return "(value=" + this.R + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.nJ
    public final Object h() {
        ReentrantLock reentrantLock = this.f2830R;
        reentrantLock.lock();
        try {
            Object obj = this.R;
            lmI lmi = l6.R;
            if (obj == lmi) {
                Object O = O();
                if (O == null) {
                    O = l6.e;
                }
                return O;
            }
            this.R = lmi;
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.nJ
    public final boolean i(cLA cla) {
        ReentrantLock reentrantLock = this.f2830R;
        reentrantLock.lock();
        try {
            return super.i(cla);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.DW
    public final Object j(Object obj) {
        kg9 kg9;
        obE y;
        ReentrantLock reentrantLock = this.f2830R;
        reentrantLock.lock();
        try {
            i5 O = O();
            if (O != null) {
                return O;
            }
            if (this.R == l6.R) {
                do {
                    y = y();
                    if (y != null) {
                        if (y instanceof i5) {
                            return y;
                        }
                    }
                } while (y.e(obj) == null);
                reentrantLock.unlock();
                y.c(obj);
                return y.O();
            }
            Object obj2 = this.R;
            cPP cpp = null;
            if (!(obj2 == l6.R || (kg9 = ((DW) this).f76R) == null)) {
                cpp = l6.P(kg9, obj2, null);
            }
            this.R = obj;
            if (cpp == null) {
                return l6.v;
            }
            throw cpp;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.nJ
    public final boolean o() {
        ReentrantLock reentrantLock = this.f2830R;
        reentrantLock.lock();
        try {
            return this.R == l6.R;
        } finally {
            reentrantLock.unlock();
        }
    }
}
