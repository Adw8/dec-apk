package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: dMX  reason: default package */
/* loaded from: classes.dex */
public final class dMX implements Collection, dsi {
    public final Set R = new LinkedHashSet();

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.R.add(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.R.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.R.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.R.containsAll(collection);
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
        return this.R.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.R.remove(collection);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.R.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.R.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return aJV.v(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return aJV.c(this, objArr);
    }
}
