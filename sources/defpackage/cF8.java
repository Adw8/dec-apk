package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: cF8  reason: default package */
/* loaded from: classes.dex */
public final class cF8 implements List, dsi {
    public final /* synthetic */ pfJ R;
    public final int X;
    public final int e;

    public cF8(pfJ pfj, int i, int i2) {
        this.R = pfj;
        this.e = i;
        this.X = i2;
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
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
        return this.R.f7157R[i + this.e];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.e;
        int i2 = this.X;
        if (i > i2) {
            return -1;
        }
        while (!n3x.v(this.R.f7157R[i], obj)) {
            if (i == i2) {
                return -1;
            }
            i++;
        }
        return i - this.e;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.X - this.e == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        pfJ pfj = this.R;
        int i = this.e;
        return new bmz(pfj, i, i, this.X);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.X;
        int i2 = this.e;
        if (i2 > i) {
            return -1;
        }
        while (!n3x.v(this.R.f7157R[i], obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - this.e;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        pfJ pfj = this.R;
        int i = this.e;
        return new bmz(pfj, i, i, this.X);
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
        return this.X - this.e;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        pfJ pfj = this.R;
        int i3 = this.e;
        return new cF8(pfj, i + i3, i3 + i2);
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
    public final ListIterator listIterator(int i) {
        pfJ pfj = this.R;
        int i2 = this.e;
        return new bmz(pfj, i + i2, i2, this.X);
    }
}
