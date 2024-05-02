package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: b5G  reason: default package */
/* loaded from: classes.dex */
public final class b5G extends k7 implements RandomAccess, Serializable {
    public final b5G R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1526R;

    /* renamed from: R  reason: collision with other field name */
    public Object[] f1527R;
    public int X;
    public int e;
    public final b5G v;

    public b5G(Object[] objArr, int i, int i2, boolean z, b5G b5g, b5G b5g2) {
        this.f1527R = objArr;
        this.e = i;
        this.X = i2;
        this.f1526R = z;
        this.R = b5g;
        this.v = b5g2;
    }

    public final void C() {
        b5G b5g;
        if (this.f1526R || ((b5g = this.v) != null && b5g.f1526R)) {
            throw new UnsupportedOperationException();
        }
    }

    public final void H(int i, Object obj) {
        b5G b5g = this.R;
        if (b5g != null) {
            b5g.H(i, obj);
            this.f1527R = this.R.f1527R;
            this.X++;
            return;
        }
        P(i, 1);
        this.f1527R[i] = obj;
    }

    public final void P(int i, int i2) {
        int i3 = this.X + i2;
        if (this.R != null) {
            throw new IllegalStateException();
        } else if (i3 >= 0) {
            Object[] objArr = this.f1527R;
            if (i3 > objArr.length) {
                int length = objArr.length;
                int i4 = length + (length >> 1);
                if (i4 - i3 < 0) {
                    i4 = i3;
                }
                if (i4 - 2147483639 > 0) {
                    i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                }
                this.f1527R = Arrays.copyOf(objArr, i4);
            }
            Object[] objArr2 = this.f1527R;
            System.arraycopy(objArr2, i, objArr2, i + i2, (this.e + this.X) - i);
            this.X += i2;
        } else {
            throw new OutOfMemoryError();
        }
    }

    @Override // defpackage.k7
    public final int R() {
        return this.X;
    }

    public final int V(int i, int i2, Collection collection, boolean z) {
        b5G b5g = this.R;
        if (b5g != null) {
            int V = b5g.V(i, i2, collection, z);
            this.X -= V;
            return V;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f1527R[i5]) == z) {
                Object[] objArr = this.f1527R;
                i4++;
                i3++;
                objArr[i4 + i] = objArr[i5];
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.f1527R;
        int i7 = i2 + i;
        System.arraycopy(objArr2, i7, objArr2, i + i4, this.X - i7);
        Object[] objArr3 = this.f1527R;
        int i8 = this.X;
        for (int i9 = i8 - i6; i9 < i8; i9++) {
            objArr3[i9] = null;
        }
        this.X -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        C();
        H(this.e + this.X, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        C();
        int size = collection.size();
        c(this.e + this.X, size, collection);
        return size > 0;
    }

    public final void c(int i, int i2, Collection collection) {
        b5G b5g = this.R;
        if (b5g != null) {
            b5g.c(i, i2, collection);
            this.f1527R = this.R.f1527R;
            this.X += i2;
            return;
        }
        P(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1527R[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final void clear() {
        C();
        i(this.e, this.X);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractList, java.util.List, java.util.Collection, java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            if (r8 == r7) goto L_0x0030
            boolean r2 = r8 instanceof java.util.List
            if (r2 == 0) goto L_0x0031
            java.util.List r8 = (java.util.List) r8
            java.lang.Object[] r2 = r7.f1527R
            int r3 = r7.e
            int r7 = r7.X
            int r4 = r8.size()
            if (r7 == r4) goto L_0x0017
            goto L_0x0028
        L_0x0017:
            r4 = r0
        L_0x0018:
            if (r4 >= r7) goto L_0x002d
            int r5 = r3 + r4
            r5 = r2[r5]
            java.lang.Object r6 = r8.get(r4)
            boolean r5 = defpackage.n3x.v(r5, r6)
            if (r5 != 0) goto L_0x002a
        L_0x0028:
            r7 = r0
            goto L_0x002e
        L_0x002a:
            int r4 = r4 + 1
            goto L_0x0018
        L_0x002d:
            r7 = r1
        L_0x002e:
            if (r7 == 0) goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b5G.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        hw1.U(i, this.X);
        return this.f1527R[this.e + i];
    }

    @Override // java.util.AbstractList, java.util.List, java.util.Collection, java.lang.Object
    public final int hashCode() {
        Object[] objArr = this.f1527R;
        int i = this.e;
        int i2 = this.X;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i + i4];
            i3 = (i3 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i3;
    }

    public final void i(int i, int i2) {
        b5G b5g = this.R;
        if (b5g != null) {
            b5g.i(i, i2);
        } else {
            Object[] objArr = this.f1527R;
            int i3 = i + i2;
            System.arraycopy(objArr, i3, objArr, i, this.X - i3);
            Object[] objArr2 = this.f1527R;
            int i4 = this.X;
            for (int i5 = i4 - i2; i5 < i4; i5++) {
                objArr2[i5] = null;
            }
        }
        this.X -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.X; i++) {
            if (n3x.v(this.f1527R[this.e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.X == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new aJE(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.X - 1; i >= 0; i--) {
            if (n3x.v(this.f1527R[this.e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new aJE(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        C();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            v(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C();
        return V(this.e, this.X, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C();
        return V(this.e, this.X, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        C();
        hw1.U(i, this.X);
        Object[] objArr = this.f1527R;
        int i2 = this.e + i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        hw1.N(i, i2, this.X);
        Object[] objArr = this.f1527R;
        int i3 = this.e + i;
        int i4 = i2 - i;
        boolean z = this.f1526R;
        b5G b5g = this.v;
        return new b5G(objArr, i3, i4, z, this, b5g == null ? this : b5g);
    }

    public final Object t(int i) {
        b5G b5g = this.R;
        if (b5g != null) {
            this.X--;
            return b5g.t(i);
        }
        Object[] objArr = this.f1527R;
        Object obj = objArr[i];
        int i2 = i + 1;
        System.arraycopy(objArr, i2, objArr, i, (this.e + this.X) - i2);
        Object[] objArr2 = this.f1527R;
        int i3 = this.e;
        int i4 = this.X;
        objArr2[(i3 + i4) - 1] = null;
        this.X = i4 - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.X;
        if (length < i) {
            Object[] objArr2 = this.f1527R;
            int i2 = this.e;
            return Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
        }
        Object[] objArr3 = this.f1527R;
        int i3 = this.e;
        System.arraycopy(objArr3, i3, objArr, 0, (i + i3) - i3);
        int length2 = objArr.length;
        int i4 = this.X;
        if (length2 > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.lang.Object
    public final String toString() {
        Object[] objArr = this.f1527R;
        int i = this.e;
        int i2 = this.X;
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(objArr[i + i3]);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.k7
    public final Object v(int i) {
        C();
        hw1.U(i, this.X);
        return t(this.e + i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        hw1.C(i, this.X);
        return new aJE(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        C();
        hw1.C(i, this.X);
        H(this.e + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        C();
        hw1.C(i, this.X);
        int size = collection.size();
        c(this.e + i, size, collection);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f1527R;
        int i = this.e;
        int i2 = this.X + i;
        gvP.j(i2, objArr.length);
        return Arrays.copyOfRange(objArr, i, i2);
    }
}
