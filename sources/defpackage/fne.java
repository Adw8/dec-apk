package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: fne  reason: default package */
/* loaded from: classes.dex */
public final class fne implements List, oOL {
    public int O;
    public final gnW R;
    public int X;
    public final int e;

    public fne(gnW gnw, int i, int i2) {
        this.R = gnw;
        this.e = i;
        this.X = gnw.R();
        this.O = i2 - i;
    }

    public final void R() {
        if (this.R.R() != this.X) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        R();
        this.R.add(this.e + this.O, obj);
        this.O++;
        this.X = this.R.R();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.O, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i;
        oOh ooh;
        dR6 L;
        boolean z;
        if (this.O > 0) {
            R();
            gnW gnw = this.R;
            int i2 = this.e;
            int i3 = this.O + i2;
            gnw.getClass();
            do {
                Object obj = nIH.R;
                synchronized (obj) {
                    nUb nub = (nUb) jwU.O(gnw.R);
                    i = nub.v;
                    ooh = nub.R;
                }
                h3d j = ooh.j();
                j.subList(i2, i3).clear();
                oOh c = j.c();
                if (n3x.v(c, ooh)) {
                    break;
                }
                synchronized (obj) {
                    nUb nub2 = gnw.R;
                    synchronized (jwU.f5150R) {
                        L = jwU.L();
                        nUb nub3 = (nUb) jwU.j(nub2, gnw, L);
                        int i4 = nub3.v;
                        if (i4 == i) {
                            nub3.R = c;
                            nub3.v = i4 + 1;
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    jwU.x(L, gnw);
                }
            } while (!z);
            this.O = 0;
            this.X = this.R.R();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        R();
        nIH.R(i, this.O);
        return this.R.get(this.e + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        R();
        int i = this.e;
        Iterator it = caw.V(i, this.O + i).iterator();
        while (it.hasNext()) {
            int nextInt = ((jrc) it).nextInt();
            if (n3x.v(obj, this.R.get(nextInt))) {
                return nextInt - this.e;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.O == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        R();
        int i = this.e + this.O;
        while (true) {
            i--;
            if (i < this.e) {
                return -1;
            }
            if (n3x.v(obj, this.R.get(i))) {
                return i - this.e;
            }
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean z = false;
        while (true) {
            for (Object obj : collection) {
                if (remove(obj) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        oOh ooh;
        dR6 L;
        boolean z;
        R();
        gnW gnw = this.R;
        int i2 = this.e;
        int i3 = this.O + i2;
        int size = gnw.size();
        do {
            Object obj = nIH.R;
            synchronized (obj) {
                nUb nub = (nUb) jwU.O(gnw.R);
                i = nub.v;
                ooh = nub.R;
            }
            h3d j = ooh.j();
            j.subList(i2, i3).retainAll(collection);
            oOh c = j.c();
            if (n3x.v(c, ooh)) {
                break;
            }
            synchronized (obj) {
                nUb nub2 = gnw.R;
                synchronized (jwU.f5150R) {
                    L = jwU.L();
                    nUb nub3 = (nUb) jwU.j(nub2, gnw, L);
                    int i4 = nub3.v;
                    if (i4 == i) {
                        nub3.R = c;
                        nub3.v = i4 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                jwU.x(L, gnw);
            }
        } while (!z);
        int size2 = size - gnw.size();
        if (size2 > 0) {
            this.X = this.R.R();
            this.O -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        nIH.R(i, this.O);
        R();
        Object obj2 = this.R.set(i + this.e, obj);
        this.X = this.R.R();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.O;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        boolean z = true;
        if (!(i >= 0 && i <= i2) || i2 > this.O) {
            z = false;
        }
        if (z) {
            R();
            gnW gnw = this.R;
            int i3 = this.e;
            return new fne(gnw, i + i3, i2 + i3);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
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
        R();
        blo blo = new blo();
        blo.e = i - 1;
        return new jY7(blo, this);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        R();
        boolean addAll = this.R.addAll(i + this.e, collection);
        if (addAll) {
            this.O = collection.size() + this.O;
            this.X = this.R.R();
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        R();
        Object remove = this.R.remove(this.e + i);
        this.O--;
        this.X = this.R.R();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        R();
        this.R.add(this.e + i, obj);
        this.O++;
        this.X = this.R.R();
    }
}
