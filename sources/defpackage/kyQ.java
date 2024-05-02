package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: kyQ  reason: default package */
/* loaded from: classes.dex */
public final class kyQ implements Set, dsi {
    public Object[] R = new Object[16];
    public int e;

    public final int R(Object obj) {
        int i = this.e - 1;
        int identityHashCode = System.identityHashCode(obj);
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.R[i3];
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i2 = i3 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i = i3 - 1;
            } else if (obj2 == obj) {
                return i3;
            } else {
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    Object obj3 = this.R[i4];
                    if (obj3 == obj) {
                        return i4;
                    }
                    if (System.identityHashCode(obj3) != identityHashCode) {
                        break;
                    }
                }
                int i5 = i3 + 1;
                int i6 = this.e;
                while (i5 < i6) {
                    Object obj4 = this.R[i5];
                    if (obj4 == obj) {
                        return i5;
                    }
                    i5++;
                    if (System.identityHashCode(obj4) != identityHashCode) {
                        return -i5;
                    }
                }
                return -(this.e + 1);
            }
        }
        return -(i2 + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        if (this.e > 0) {
            i = R(obj);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int i3 = this.e;
        Object[] objArr = this.R;
        if (i3 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, i2, objArr2, i2 + 1, i3 - i2);
            P7.r(this.R, objArr2, 0, 0, i2, 6);
            this.R = objArr2;
        } else {
            System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
        }
        this.R[i2] = obj;
        this.e++;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        P7.G(this.R, null);
        this.e = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return obj != null && R(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
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

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.e == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new o7s(1, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int R;
        if (obj == null || (R = R(obj)) < 0) {
            return false;
        }
        int i = this.e;
        if (R < i - 1) {
            Object[] objArr = this.R;
            int i2 = R + 1;
            System.arraycopy(objArr, i2, objArr, R, i - i2);
        }
        int i3 = this.e - 1;
        this.e = i3;
        this.R[i3] = null;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.e;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return aJV.v(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return aJV.c(this, objArr);
    }
}
