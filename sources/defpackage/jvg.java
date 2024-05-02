package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: jvg  reason: default package */
/* loaded from: classes.dex */
public final class jvg implements Collection {
    public final /* synthetic */ Dd R;

    public jvg(Dd dd) {
        this.R = dd;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.R.X();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.R.x(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.R.Z() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new grI(this.R, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        int x = this.R.x(obj);
        if (x < 0) {
            return false;
        }
        this.R.U(x);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        int Z = this.R.Z();
        int i = 0;
        boolean z = false;
        while (i < Z) {
            if (collection.contains(this.R.O(i, 1))) {
                this.R.U(i);
                i--;
                Z--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        int Z = this.R.Z();
        int i = 0;
        boolean z = false;
        while (i < Z) {
            if (!collection.contains(this.R.O(i, 1))) {
                this.R.U(i);
                i--;
                Z--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.R.Z();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Dd dd = this.R;
        int Z = dd.Z();
        Object[] objArr = new Object[Z];
        for (int i = 0; i < Z; i++) {
            objArr[i] = dd.O(i, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.R.o(1, objArr);
    }
}
