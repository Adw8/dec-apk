package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: bTV  reason: default package */
/* loaded from: classes.dex */
public final class bTV implements List, oOL {
    public final biT R;

    public bTV(biT bit) {
        this.R = bit;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.R.v(obj);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.R.X(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.R.L();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.R.Z(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        biT bit = this.R;
        bit.getClass();
        for (Object obj : collection) {
            if (!bit.Z(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        dTl.C(i, this);
        return this.R.f1772R[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        biT bit = this.R;
        int i = bit.e;
        if (i <= 0) {
            return -1;
        }
        int i2 = 0;
        Object[] objArr = bit.f1772R;
        while (!n3x.v(obj, objArr[i2])) {
            i2++;
            if (i2 >= i) {
                return -1;
            }
        }
        return i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.R.x();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ctW(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        biT bit = this.R;
        int i = bit.e;
        if (i <= 0) {
            return -1;
        }
        int i2 = i - 1;
        Object[] objArr = bit.f1772R;
        while (!n3x.v(obj, objArr[i2])) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
        }
        return i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ctW(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.R.U(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        biT bit = this.R;
        bit.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i = bit.e;
        for (Object obj : collection) {
            bit.U(obj);
        }
        return i != bit.e;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        biT bit = this.R;
        int i = bit.e;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(bit.f1772R[i2])) {
                bit.N(i2);
            }
        }
        return i != bit.e;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        dTl.C(i, this);
        Object[] objArr = this.R.f1772R;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.R.e;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        dTl.N(i, i2, this);
        return new kdj(i, i2, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return aJV.v(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return aJV.c(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.R.R(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        biT bit = this.R;
        return bit.X(bit.e, collection);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new ctW(i, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        dTl.C(i, this);
        return this.R.N(i);
    }
}
