package defpackage;

import java.util.ListIterator;

/* renamed from: jY7  reason: default package */
/* loaded from: classes.dex */
public final class jY7 implements ListIterator, dsi {
    public final /* synthetic */ blo R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fne f4960R;

    public jY7(blo blo, fne fne) {
        this.R = blo;
        this.f4960R = fne;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        Object obj2 = nIH.R;
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.R.e < this.f4960R.O - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.R.e >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.R.e + 1;
        nIH.R(i, this.f4960R.O);
        this.R.e = i;
        return this.f4960R.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.R.e + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.R.e;
        nIH.R(i, this.f4960R.O);
        this.R.e = i - 1;
        return this.f4960R.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.R.e;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        Object obj = nIH.R;
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        Object obj2 = nIH.R;
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }
}
