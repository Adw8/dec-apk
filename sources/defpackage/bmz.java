package defpackage;

import java.util.ListIterator;

/* renamed from: bmz  reason: default package */
/* loaded from: classes.dex */
public final class bmz implements ListIterator, dsi {
    public final int O;
    public final /* synthetic */ pfJ R;
    public final int X;
    public int e;

    public bmz(pfJ pfj, int i, int i2) {
        this(pfj, (i2 & 1) != 0 ? 0 : i, 0, (i2 & 4) != 0 ? pfj.X : 0);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.O;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e > this.X;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        Object[] objArr = this.R.f7157R;
        int i = this.e;
        this.e = i + 1;
        return objArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.e - this.X;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        Object[] objArr = this.R.f7157R;
        int i = this.e - 1;
        this.e = i;
        return objArr[i];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.e - this.X) - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public bmz(pfJ pfj, int i, int i2, int i3) {
        this.R = pfj;
        this.e = i;
        this.X = i2;
        this.O = i3;
    }
}
