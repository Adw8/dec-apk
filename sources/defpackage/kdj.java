package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: kdj  reason: default package */
/* loaded from: classes.dex */
public final class kdj implements List, oOL {
    public final List R;
    public int X;
    public final int e;

    public kdj(int i, int i2, List list) {
        this.R = list;
        this.e = i;
        this.X = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        List list = this.R;
        int i = this.X;
        this.X = i + 1;
        list.add(i, obj);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        this.R.addAll(i + this.e, collection);
        this.X = collection.size() + this.X;
        return collection.size() > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.X - 1;
        int i2 = this.e;
        if (i2 <= i) {
            while (true) {
                this.R.remove(i);
                if (i == i2) {
                    break;
                }
                i--;
            }
        }
        this.X = this.e;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.X;
        for (int i2 = this.e; i2 < i; i2++) {
            if (n3x.v(this.R.get(i2), obj)) {
                return true;
            }
        }
        return false;
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
        dTl.C(i, this);
        return this.R.get(i + this.e);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.X;
        for (int i2 = this.e; i2 < i; i2++) {
            if (n3x.v(this.R.get(i2), obj)) {
                return i2 - this.e;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.X == this.e;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ctW(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.X - 1;
        int i2 = this.e;
        if (i2 > i) {
            return -1;
        }
        while (!n3x.v(this.R.get(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - this.e;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ctW(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.X;
        for (int i2 = this.e; i2 < i; i2++) {
            if (n3x.v(this.R.get(i2), obj)) {
                this.R.remove(i2);
                this.X--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.X;
        for (Object obj : collection) {
            remove(obj);
        }
        return i != this.X;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.X;
        int i2 = i - 1;
        int i3 = this.e;
        if (i3 <= i2) {
            while (true) {
                if (!collection.contains(this.R.get(i2))) {
                    this.R.remove(i2);
                    this.X--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return i != this.X;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        dTl.C(i, this);
        return this.R.set(i + this.e, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.X - this.e;
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
        this.R.add(i + this.e, obj);
        this.X++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new ctW(i, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.R.addAll(this.X, collection);
        this.X = collection.size() + this.X;
        return collection.size() > 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        dTl.C(i, this);
        this.X--;
        return this.R.remove(i + this.e);
    }
}
