package defpackage;

import java.util.List;
import java.util.ListIterator;

/* renamed from: ctW  reason: default package */
/* loaded from: classes.dex */
public final class ctW implements ListIterator, dsi {
    public final List R;
    public int e;

    public ctW(int i, List list) {
        this.R = list;
        this.e = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.R.add(this.e, obj);
        this.e++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.R.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        List list = this.R;
        int i = this.e;
        this.e = i + 1;
        return list.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.e - 1;
        this.e = i;
        return this.R.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.e - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.e - 1;
        this.e = i;
        this.R.remove(i);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.R.set(this.e, obj);
    }
}
