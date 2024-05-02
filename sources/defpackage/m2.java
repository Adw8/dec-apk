package defpackage;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: m2  reason: default package */
/* loaded from: classes.dex */
public final class m2 extends nJ {
    public final h9 R;

    /* renamed from: R  reason: collision with other field name */
    public final ReentrantLock f5887R;

    /* renamed from: R  reason: collision with other field name */
    public Object[] f5888R;
    public int X;
    public final int e;
    private volatile /* synthetic */ int size;

    public m2(int i, h9 h9Var, kg9 kg9) {
        super(kg9);
        this.e = i;
        this.R = h9Var;
        if (i < 1 ? false : true) {
            this.f5887R = new ReentrantLock();
            int min = Math.min(i, 8);
            Object[] objArr = new Object[min];
            Arrays.fill(objArr, 0, min, l6.R);
            this.f5888R = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(opT.m("ArrayChannel capacity must be at least 1, but ", i, " was specified").toString());
    }

    @Override // defpackage.DW
    public final boolean C() {
        return this.size == this.e && this.R == h9.SUSPEND;
    }

    @Override // defpackage.DW
    public final boolean H() {
        return false;
    }

    /* JADX INFO: finally extract failed */
    @Override // defpackage.nJ
    public final void J(boolean z) {
        kg9 kg9 = ((DW) this).f76R;
        ReentrantLock reentrantLock = this.f5887R;
        reentrantLock.lock();
        try {
            int i = this.size;
            cPP cpp = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.f5888R[this.X];
                if (!(kg9 == null || obj == l6.R)) {
                    cpp = l6.P(kg9, obj, cpp);
                }
                Object[] objArr = this.f5888R;
                int i3 = this.X;
                objArr[i3] = l6.R;
                this.X = (i3 + 1) % objArr.length;
            }
            this.size = 0;
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
    public final boolean K() {
        ReentrantLock reentrantLock = this.f5887R;
        reentrantLock.lock();
        try {
            return super.K();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.nJ
    public final boolean V() {
        return false;
    }

    @Override // defpackage.DW
    public final String X() {
        StringBuilder U = opT.U("(buffer:capacity=");
        U.append(this.e);
        U.append(",size=");
        return jQ.P(U, this.size, ')');
    }

    @Override // defpackage.nJ
    public final Object h() {
        ReentrantLock reentrantLock = this.f5887R;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object O = O();
                if (O == null) {
                    O = l6.e;
                }
                return O;
            }
            Object[] objArr = this.f5888R;
            int i2 = this.X;
            Object obj = objArr[i2];
            ivC ivc = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = l6.e;
            boolean z = false;
            if (i == this.e) {
                while (true) {
                    ivC t = t();
                    if (t == null) {
                        break;
                    } else if (t.u() != null) {
                        obj2 = t.h();
                        ivc = t;
                        z = true;
                        break;
                    } else {
                        t.z();
                        ivc = t;
                    }
                }
            }
            if (obj2 != l6.e && !(obj2 instanceof i5)) {
                this.size = i;
                Object[] objArr2 = this.f5888R;
                objArr2[(this.X + i) % objArr2.length] = obj2;
            }
            this.X = (this.X + 1) % this.f5888R.length;
            if (z) {
                ivc.Y();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.nJ
    public final boolean i(cLA cla) {
        ReentrantLock reentrantLock = this.f5887R;
        reentrantLock.lock();
        try {
            return super.i(cla);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.DW
    public final Object j(Object obj) {
        obE y;
        ReentrantLock reentrantLock = this.f5887R;
        reentrantLock.lock();
        try {
            int i = this.size;
            i5 O = O();
            if (O != null) {
                return O;
            }
            lmI lmi = null;
            if (i < this.e) {
                this.size = i + 1;
            } else {
                int ordinal = this.R.ordinal();
                if (ordinal == 0) {
                    lmi = l6.c;
                } else if (ordinal != 1) {
                    if (ordinal == 2) {
                        lmi = l6.v;
                    } else {
                        throw new j8f((Object) null);
                    }
                }
            }
            if (lmi != null) {
                return lmi;
            }
            if (i == 0) {
                do {
                    y = y();
                    if (y != null) {
                        if (y instanceof i5) {
                            this.size = i;
                            return y;
                        }
                    }
                } while (y.e(obj) == null);
                this.size = i;
                reentrantLock.unlock();
                y.c(obj);
                return y.O();
            }
            u(i, obj);
            return l6.v;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.nJ
    public final boolean o() {
        return this.size == 0;
    }

    public final void u(int i, Object obj) {
        int i2 = this.e;
        if (i < i2) {
            Object[] objArr = this.f5888R;
            if (i >= objArr.length) {
                int min = Math.min(objArr.length * 2, i2);
                Object[] objArr2 = new Object[min];
                for (int i3 = 0; i3 < i; i3++) {
                    Object[] objArr3 = this.f5888R;
                    objArr2[i3] = objArr3[(this.X + i3) % objArr3.length];
                }
                Arrays.fill(objArr2, i, min, l6.R);
                this.f5888R = objArr2;
                this.X = 0;
            }
            Object[] objArr4 = this.f5888R;
            objArr4[(this.X + i) % objArr4.length] = obj;
            return;
        }
        Object[] objArr5 = this.f5888R;
        int i4 = this.X;
        objArr5[i4 % objArr5.length] = null;
        objArr5[(i + i4) % objArr5.length] = obj;
        this.X = (i4 + 1) % objArr5.length;
    }

    @Override // defpackage.DW
    public final Object v(ko1 ko1) {
        ReentrantLock reentrantLock = this.f5887R;
        reentrantLock.lock();
        try {
            return super.v(ko1);
        } finally {
            reentrantLock.unlock();
        }
    }
}
