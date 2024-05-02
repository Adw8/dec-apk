package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* renamed from: d5E  reason: default package */
/* loaded from: classes.dex */
public final class d5E implements Collection, dsi {
    public final List R;
    public final int e;

    public d5E(ArrayList arrayList) {
        this.R = arrayList;
        this.e = arrayList.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof kA9)) {
            return false;
        }
        return this.R.contains((kA9) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.R.containsAll(collection);
    }

    @Override // java.util.Collection, java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d5E) && n3x.v(this.R, ((d5E) obj).R);
    }

    @Override // java.util.Collection, java.lang.Object
    public final int hashCode() {
        return this.R.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.R.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.R.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.e;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return aJV.v(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return aJV.c(this, objArr);
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder U = opT.U("LocaleList(localeList=");
        U.append(this.R);
        U.append(')');
        return U.toString();
    }
}
