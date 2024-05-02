package defpackage;

import java.util.ListIterator;

/* renamed from: hAY  reason: default package */
/* loaded from: classes.dex */
public final class hAY implements ListIterator {
    public ListIterator R;

    public hAY(efZ efz, int i) {
        this.R = efz.R.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.R.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.R.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.R.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.R.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.R.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.R.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
