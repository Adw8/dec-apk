package defpackage;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* renamed from: ik4  reason: default package */
/* loaded from: classes.dex */
public final class ik4 extends nQ {
    public int L = -1;
    public int O;
    public cVf R;

    /* renamed from: R  reason: collision with other field name */
    public final h3d f4709R;

    public ik4(h3d h3d, int i) {
        super(i, h3d.R());
        this.f4709R = h3d;
        this.O = h3d.C();
        v();
    }

    public final void R() {
        if (this.O != this.f4709R.C()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.nQ, java.util.ListIterator
    public final void add(Object obj) {
        R();
        this.f4709R.add(this.e, obj);
        this.e++;
        this.X = this.f4709R.R();
        this.O = this.f4709R.C();
        this.L = -1;
        v();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        R();
        if (hasNext()) {
            int i = this.e;
            this.L = i;
            cVf cvf = this.R;
            if (cvf == null) {
                Object[] objArr = this.f4709R.f4033e;
                this.e = i + 1;
                return objArr[i];
            } else if (cvf.hasNext()) {
                this.e++;
                return cvf.next();
            } else {
                Object[] objArr2 = this.f4709R.f4033e;
                int i2 = this.e;
                this.e = i2 + 1;
                return objArr2[i2 - cvf.X];
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        R();
        if (hasPrevious()) {
            int i = this.e;
            int i2 = i - 1;
            this.L = i2;
            cVf cvf = this.R;
            if (cvf == null) {
                Object[] objArr = this.f4709R.f4033e;
                this.e = i2;
                return objArr[i2];
            }
            int i3 = cvf.X;
            if (i > i3) {
                Object[] objArr2 = this.f4709R.f4033e;
                this.e = i2;
                return objArr2[i2 - i3];
            }
            this.e = i2;
            return cvf.previous();
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.nQ, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        R();
        int i = this.L;
        if (i != -1) {
            this.f4709R.v(i);
            int i2 = this.L;
            if (i2 < this.e) {
                this.e = i2;
            }
            this.X = this.f4709R.R();
            this.O = this.f4709R.C();
            this.L = -1;
            v();
            return;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.nQ, java.util.ListIterator
    public final void set(Object obj) {
        R();
        int i = this.L;
        if (i != -1) {
            this.f4709R.set(i, obj);
            this.O = this.f4709R.C();
            v();
            return;
        }
        throw new IllegalStateException();
    }

    public final void v() {
        h3d h3d = this.f4709R;
        Object[] objArr = h3d.c;
        if (objArr == null) {
            this.R = null;
            return;
        }
        int R = (h3d.R() - 1) & -32;
        int i = this.e;
        if (i > R) {
            i = R;
        }
        int i2 = (this.f4709R.e / 5) + 1;
        cVf cvf = this.R;
        if (cvf == null) {
            this.R = new cVf(objArr, i, R, i2);
            return;
        }
        cvf.e = i;
        cvf.X = R;
        cvf.O = i2;
        if (cvf.f2112R.length < i2) {
            cvf.f2112R = new Object[i2];
        }
        boolean z = false;
        cvf.f2112R[0] = objArr;
        if (i == R) {
            z = true;
        }
        cvf.R = z;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        cvf.v(i - i3, 1);
    }
}
