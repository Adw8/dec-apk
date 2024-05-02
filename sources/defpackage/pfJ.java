package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: pfJ  reason: default package */
/* loaded from: classes.dex */
public final class pfJ implements List, dsi {
    public int X;

    /* renamed from: R  reason: collision with other field name */
    public Object[] f7157R = new Object[16];
    public long[] R = new long[16];
    public int e = -1;

    public final long R() {
        long L = msU.L(Float.POSITIVE_INFINITY, false);
        int i = this.e + 1;
        int i2 = pdD.i(this);
        if (i <= i2) {
            while (true) {
                long j = this.R[i];
                if (msU.z(j, L) < 0) {
                    L = j;
                }
                if (Float.intBitsToFloat((int) (L >> 32)) >= 0.0f || !msU._(L)) {
                    if (i == i2) {
                        break;
                    }
                    i++;
                } else {
                    return L;
                }
            }
        }
        return L;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.e = -1;
        int i = -1 + 1;
        int i2 = pdD.i(this);
        if (i <= i2) {
            while (true) {
                this.f7157R[i] = null;
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        this.X = this.e + 1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f7157R[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = pdD.i(this);
        if (i < 0) {
            return -1;
        }
        int i2 = 0;
        while (!n3x.v(this.f7157R[i2], obj)) {
            if (i2 == i) {
                return -1;
            }
            i2++;
        }
        return i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.X == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new bmz(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = pdD.i(this); -1 < i; i--) {
            if (n3x.v(this.f7157R[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new bmz(this, 0, 7);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.X;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new cF8(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return aJV.v(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return aJV.c(this, objArr);
    }

    public final void v(Object obj, float f, boolean z, f_c f_c) {
        int i = this.e;
        int i2 = i + 1;
        this.e = i2;
        Object[] objArr = this.f7157R;
        if (i2 >= objArr.length) {
            int length = objArr.length + 16;
            this.f7157R = Arrays.copyOf(objArr, length);
            this.R = Arrays.copyOf(this.R, length);
        }
        Object[] objArr2 = this.f7157R;
        int i3 = this.e;
        objArr2[i3] = obj;
        this.R[i3] = msU.L(f, z);
        int i4 = this.e + 1;
        int i5 = pdD.i(this);
        if (i4 <= i5) {
            while (true) {
                this.f7157R[i4] = null;
                if (i4 == i5) {
                    break;
                }
                i4++;
            }
        }
        this.X = this.e + 1;
        f_c.g();
        this.e = i;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new bmz(this, i, 6);
    }
}
