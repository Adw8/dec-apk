package defpackage;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* renamed from: iuh  reason: default package */
/* loaded from: classes.dex */
public class iuh extends dU8 {
    public Object R;

    /* renamed from: R  reason: collision with other field name */
    public final mWd f4758R;
    public int X;
    public boolean v;

    public iuh(mWd mwd, j18[] j18Arr) {
        super(mwd.f6053R, j18Arr);
        this.f4758R = mwd;
        this.X = mwd.e;
    }

    public final void c(int i, pgk pgk, Object obj, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            j18 j18 = ((dU8) this).f2629R[i2];
            Object[] objArr = pgk.f7161R;
            j18.R(objArr.length, 0, objArr);
            while (true) {
                j18 j182 = ((dU8) this).f2629R[i2];
                if (!n3x.v(j182.R[j182.X], obj)) {
                    ((dU8) this).f2629R[i2].X += 2;
                } else {
                    this.e = i2;
                    return;
                }
            }
        } else {
            int i4 = 1 << ((i >> i3) & 31);
            if (pgk.Z(i4)) {
                ((dU8) this).f2629R[i2].R(Integer.bitCount(pgk.f7159R) * 2, pgk.O(i4), pgk.f7161R);
                this.e = i2;
                return;
            }
            int i5 = pgk.i(i4);
            pgk t = pgk.t(i5);
            ((dU8) this).f2629R[i2].R(Integer.bitCount(pgk.f7159R) * 2, i5, pgk.f7161R);
            c(i, t, obj, i2 + 1);
        }
    }

    @Override // defpackage.dU8, java.util.Iterator
    public final Object next() {
        if (this.f4758R.e != this.X) {
            throw new ConcurrentModificationException();
        } else if (((dU8) this).R) {
            j18 j18 = ((dU8) this).f2629R[this.e];
            this.R = j18.R[j18.X];
            this.v = true;
            return super.next();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // defpackage.dU8, java.util.Iterator
    public final void remove() {
        if (this.v) {
            boolean z = ((dU8) this).R;
            if (!z) {
                mWd mwd = this.f4758R;
                Object obj = this.R;
                gvP.O(mwd);
                mwd.remove(obj);
            } else if (z) {
                j18 j18 = ((dU8) this).f2629R[this.e];
                Object obj2 = j18.R[j18.X];
                mWd mwd2 = this.f4758R;
                Object obj3 = this.R;
                gvP.O(mwd2);
                mwd2.remove(obj3);
                c(obj2 != null ? obj2.hashCode() : 0, this.f4758R.f6053R, obj2, 0);
            } else {
                throw new NoSuchElementException();
            }
            this.R = null;
            this.v = false;
            this.X = this.f4758R.e;
            return;
        }
        throw new IllegalStateException();
    }
}
