package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: ox_  reason: default package */
/* loaded from: classes.dex */
public final class ox_ implements Set {
    public final /* synthetic */ Dd R;
    public final /* synthetic */ int e;

    public /* synthetic */ ox_(Dd dd, int i) {
        this.e = i;
        this.R = dd;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.e) {
            case 0:
                int Z = this.R.Z();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    this.R.H(entry.getKey(), entry.getValue());
                }
                return Z != this.R.Z();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.e) {
            case 0:
                this.R.X();
                return;
            default:
                this.R.X();
                return;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int m = this.R.m(entry.getKey());
                if (m < 0) {
                    return false;
                }
                Object O = this.R.O(m, 1);
                Object value = entry.getValue();
                return O == value || (O != null && O.equals(value));
            default:
                return this.R.m(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.e) {
            case 0:
                for (Object obj : collection) {
                    if (!contains(obj)) {
                        return false;
                    }
                }
                return true;
            default:
                FK L = this.R.L();
                for (Object obj2 : collection) {
                    if (!L.containsKey(obj2)) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Object
    public final boolean equals(Object obj) {
        switch (this.e) {
            case 0:
                return Dd.N(this, obj);
            default:
                return Dd.N(this, obj);
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Object
    public final int hashCode() {
        switch (this.e) {
            case 0:
                int i = 0;
                for (int Z = this.R.Z() - 1; Z >= 0; Z--) {
                    Object O = this.R.O(Z, 0);
                    Object O2 = this.R.O(Z, 1);
                    i += (O == null ? 0 : O.hashCode()) ^ (O2 == null ? 0 : O2.hashCode());
                }
                return i;
            default:
                int i2 = 0;
                for (int Z2 = this.R.Z() - 1; Z2 >= 0; Z2--) {
                    Object O3 = this.R.O(Z2, 0);
                    i2 += O3 == null ? 0 : O3.hashCode();
                }
                return i2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.e) {
            case 0:
                return this.R.Z() == 0;
            default:
                return this.R.Z() == 0;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                return new kk7(this.R);
            default:
                return new grI(this.R, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                int m = this.R.m(obj);
                if (m < 0) {
                    return false;
                }
                this.R.U(m);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                FK L = this.R.L();
                int i = L.e;
                for (Object obj : collection) {
                    L.remove(obj);
                }
                return i != L.e;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return Dd.V(this.R.L(), collection);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.e) {
            case 0:
                return this.R.Z();
            default:
                return this.R.Z();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Dd dd = this.R;
                int Z = dd.Z();
                Object[] objArr = new Object[Z];
                for (int i = 0; i < Z; i++) {
                    objArr[i] = dd.O(i, 0);
                }
                return objArr;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.R.o(0, objArr);
        }
    }
}
