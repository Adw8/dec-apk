package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: aOn  reason: default package */
/* loaded from: classes.dex */
public abstract class aOn extends dNA implements List, RandomAccess {
    public static final m3m R = new m3m(mzR.R, 0);

    @Override // defpackage.dNA
    public final aOn H() {
        return this;
    }

    @Override // defpackage.dNA
    public int R(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.lang.Object, java.util.List
    public final boolean equals(Object obj) {
        boolean z;
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            int size = size();
            if (size != list.size()) {
                return false;
            }
            if (list instanceof RandomAccess) {
                for (int i = 0; i < size; i++) {
                    Object obj2 = get(i);
                    Object obj3 = list.get(i);
                    if (!(obj2 == obj3 || (obj2 != null && obj2.equals(obj3)))) {
                        return false;
                    }
                }
            } else {
                m3m i2 = listIterator(0);
                Iterator it = list.iterator();
                while (i2.hasNext()) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    Object e = i2.next();
                    Object next = it.next();
                    if (e == next || (e != null && e.equals(next))) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        return false;
                    }
                }
                if (it.hasNext()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Object, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public final m3m listIterator(int i) {
        hDC.D(i, size());
        return isEmpty() ? R : new m3m(this, i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: t */
    public aOn subList(int i, int i2) {
        hDC.b(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? mzR.R : new fzb(this, i, i3);
    }
}
