package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: dU8  reason: default package */
/* loaded from: classes.dex */
public abstract class dU8 implements Iterator, dsi {

    /* renamed from: R  reason: collision with other field name */
    public final j18[] f2629R;
    public boolean R = true;
    public int e = 0;

    public dU8(pgk pgk, j18[] j18Arr) {
        this.f2629R = j18Arr;
        j18Arr[0].R(Integer.bitCount(pgk.f7159R) * 2, 0, pgk.f7161R);
        R();
    }

    public final void R() {
        j18[] j18Arr = this.f2629R;
        int i = this.e;
        j18 j18 = j18Arr[i];
        if (!(j18.X < j18.e)) {
            while (-1 < i) {
                int v = v(i);
                if (v == -1) {
                    j18 j182 = this.f2629R[i];
                    int i2 = j182.X;
                    Object[] objArr = j182.R;
                    if (i2 < objArr.length) {
                        int length = objArr.length;
                        j182.X = i2 + 1;
                        v = v(i);
                    }
                }
                if (v != -1) {
                    this.e = v;
                    return;
                }
                if (i > 0) {
                    j18 j183 = this.f2629R[i - 1];
                    int i3 = j183.X;
                    int length2 = j183.R.length;
                    j183.X = i3 + 1;
                }
                this.f2629R[i].R(0, 0, pgk.R.f7161R);
                i--;
            }
            this.R = false;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.R;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.R) {
            Object next = this.f2629R[this.e].next();
            R();
            return next;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int v(int i) {
        j18[] j18Arr = this.f2629R;
        j18 j18 = j18Arr[i];
        int i2 = j18.X;
        if (i2 < j18.e) {
            return i;
        }
        Object[] objArr = j18.R;
        if (!(i2 < objArr.length)) {
            return -1;
        }
        int length = objArr.length;
        pgk pgk = (pgk) objArr[i2];
        if (i == 6) {
            j18 j182 = j18Arr[i + 1];
            Object[] objArr2 = pgk.f7161R;
            j182.R(objArr2.length, 0, objArr2);
        } else {
            j18Arr[i + 1].R(Integer.bitCount(pgk.f7159R) * 2, 0, pgk.f7161R);
        }
        return v(i + 1);
    }
}
