package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: gnW  reason: default package */
/* loaded from: classes.dex */
public final class gnW implements List, nmZ, oOL {
    public nUb R = new nUb(j98.R);

    @Override // defpackage.nmZ
    public final jJG C() {
        return this.R;
    }

    @Override // defpackage.nmZ
    public final void H(jJG jjg) {
        jjg.f4901R = this.R;
        this.R = (nUb) jjg;
    }

    public final boolean P(kg9 kg9) {
        int i;
        oOh ooh;
        Object x;
        dR6 L;
        boolean z;
        do {
            Object obj = nIH.R;
            synchronized (obj) {
                nUb nub = (nUb) jwU.O(this.R);
                i = nub.v;
                ooh = nub.R;
            }
            h3d j = ooh.j();
            x = kg9.x(j);
            oOh c = j.c();
            if (n3x.v(c, ooh)) {
                break;
            }
            synchronized (obj) {
                nUb nub2 = this.R;
                synchronized (jwU.f5150R) {
                    L = jwU.L();
                    nUb nub3 = (nUb) jwU.j(nub2, this, L);
                    int i2 = nub3.v;
                    if (i2 == i) {
                        nub3.R = c;
                        nub3.v = i2 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                jwU.x(L, this);
            }
        } while (!z);
        return ((Boolean) x).booleanValue();
    }

    public final int R() {
        return ((nUb) jwU.O(this.R)).v;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        oOh ooh;
        boolean z;
        dR6 L;
        do {
            Object obj2 = nIH.R;
            synchronized (obj2) {
                nUb nub = (nUb) jwU.O(this.R);
                i = nub.v;
                ooh = nub.R;
            }
            oOh m = ooh.m(obj);
            z = false;
            if (n3x.v(m, ooh)) {
                return false;
            }
            synchronized (obj2) {
                nUb nub2 = this.R;
                synchronized (jwU.f5150R) {
                    L = jwU.L();
                    nUb nub3 = (nUb) jwU.j(nub2, this, L);
                    int i2 = nub3.v;
                    if (i2 == i) {
                        nub3.R = m;
                        nub3.v = i2 + 1;
                        z = true;
                    }
                }
                jwU.x(L, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return P(new oDT(i, collection));
    }

    public final nUb c() {
        return (nUb) jwU.C(this.R, this);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        dR6 L;
        synchronized (nIH.R) {
            nUb nub = this.R;
            synchronized (jwU.f5150R) {
                L = jwU.L();
                nUb nub2 = (nUb) jwU.j(nub, this, L);
                nub2.R = j98.R;
                nub2.v++;
            }
            jwU.x(L, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return ((ye) c().R).contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((ye) c().R).containsAll(collection);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return c().R.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return c().R.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return ((U1) c().R).isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return c().R.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new aJE(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        oOh ooh;
        dR6 L;
        boolean z;
        Object obj = get(i);
        do {
            Object obj2 = nIH.R;
            synchronized (obj2) {
                nUb nub = (nUb) jwU.O(this.R);
                i2 = nub.v;
                ooh = nub.R;
            }
            oOh g = ooh.g(i);
            if (n3x.v(g, ooh)) {
                break;
            }
            synchronized (obj2) {
                nUb nub2 = this.R;
                synchronized (jwU.f5150R) {
                    L = jwU.L();
                    nUb nub3 = (nUb) jwU.j(nub2, this, L);
                    int i3 = nub3.v;
                    if (i3 == i2) {
                        nub3.R = g;
                        nub3.v = i3 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                jwU.x(L, this);
            }
        } while (!z);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        oOh ooh;
        boolean z;
        dR6 L;
        do {
            Object obj = nIH.R;
            synchronized (obj) {
                nUb nub = (nUb) jwU.O(this.R);
                i = nub.v;
                ooh = nub.R;
            }
            z = false;
            oOh Z = ((ye) ooh).Z(new ld(0, collection));
            if (n3x.v(Z, ooh)) {
                return false;
            }
            synchronized (obj) {
                nUb nub2 = this.R;
                synchronized (jwU.f5150R) {
                    L = jwU.L();
                    nUb nub3 = (nUb) jwU.j(nub2, this, L);
                    int i2 = nub3.v;
                    if (i2 == i) {
                        nub3.R = Z;
                        nub3.v = i2 + 1;
                        z = true;
                    }
                }
                jwU.x(L, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return P(new ld(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        oOh ooh;
        dR6 L;
        boolean z;
        Object obj2 = get(i);
        do {
            Object obj3 = nIH.R;
            synchronized (obj3) {
                nUb nub = (nUb) jwU.O(this.R);
                i2 = nub.v;
                ooh = nub.R;
            }
            oOh x = ooh.x(i, obj);
            if (n3x.v(x, ooh)) {
                break;
            }
            synchronized (obj3) {
                nUb nub2 = this.R;
                synchronized (jwU.f5150R) {
                    L = jwU.L();
                    nUb nub3 = (nUb) jwU.j(nub2, this, L);
                    int i3 = nub3.v;
                    if (i3 == i2) {
                        nub3.R = x;
                        nub3.v = i3 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                jwU.x(L, this);
            }
        } while (!z);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return ((U1) c().R).R();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        boolean z = true;
        if (!(i >= 0 && i <= i2) || i2 > size()) {
            z = false;
        }
        if (z) {
            return new fne(this, i, i2);
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

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        oOh ooh;
        boolean z;
        dR6 L;
        do {
            Object obj = nIH.R;
            synchronized (obj) {
                nUb nub = (nUb) jwU.O(this.R);
                i = nub.v;
                ooh = nub.R;
            }
            oOh X = ooh.X(collection);
            z = false;
            if (n3x.v(X, ooh)) {
                return false;
            }
            synchronized (obj) {
                nUb nub2 = this.R;
                synchronized (jwU.f5150R) {
                    L = jwU.L();
                    nUb nub3 = (nUb) jwU.j(nub2, this, L);
                    int i2 = nub3.v;
                    if (i2 == i) {
                        nub3.R = X;
                        nub3.v = i2 + 1;
                        z = true;
                    }
                }
                jwU.x(L, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new aJE(this, i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        oOh ooh;
        dR6 L;
        boolean z;
        do {
            Object obj2 = nIH.R;
            synchronized (obj2) {
                nUb nub = (nUb) jwU.O(this.R);
                i2 = nub.v;
                ooh = nub.R;
            }
            oOh L2 = ooh.L(i, obj);
            if (!n3x.v(L2, ooh)) {
                synchronized (obj2) {
                    nUb nub2 = this.R;
                    synchronized (jwU.f5150R) {
                        L = jwU.L();
                        nUb nub3 = (nUb) jwU.j(nub2, this, L);
                        int i3 = nub3.v;
                        if (i3 == i2) {
                            nub3.R = L2;
                            nub3.v = i3 + 1;
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    jwU.x(L, this);
                }
            } else {
                return;
            }
        } while (!z);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        oOh ooh;
        boolean z;
        dR6 L;
        do {
            Object obj2 = nIH.R;
            synchronized (obj2) {
                nUb nub = (nUb) jwU.O(this.R);
                i = nub.v;
                ooh = nub.R;
            }
            ye yeVar = (ye) ooh;
            int indexOf = yeVar.indexOf(obj);
            oOh ooh2 = yeVar;
            if (indexOf != -1) {
                ooh2 = yeVar.g(indexOf);
            }
            z = false;
            if (n3x.v(ooh2, ooh)) {
                return false;
            }
            synchronized (obj2) {
                nUb nub2 = this.R;
                synchronized (jwU.f5150R) {
                    L = jwU.L();
                    nUb nub3 = (nUb) jwU.j(nub2, this, L);
                    int i2 = nub3.v;
                    if (i2 == i) {
                        nub3.R = ooh2;
                        nub3.v = i2 + 1;
                        z = true;
                    }
                }
                jwU.x(L, this);
            }
        } while (!z);
        return true;
    }
}
