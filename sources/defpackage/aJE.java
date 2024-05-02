package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: aJE  reason: default package */
/* loaded from: classes.dex */
public final class aJE implements ListIterator, dsi {
    public int O;
    public final Object R;
    public int X;
    public final /* synthetic */ int e;

    public aJE(gnW gnw, int i) {
        this.e = 0;
        this.R = gnw;
        this.X = i - 1;
        this.O = gnw.R();
    }

    public final void R() {
        if (((gnW) this.R).R() != this.O) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.e) {
            case 0:
                R();
                ((gnW) this.R).add(this.X + 1, obj);
                this.X++;
                this.O = ((gnW) this.R).R();
                return;
            default:
                int i = this.X;
                this.X = i + 1;
                ((b5G) this.R).add(i, obj);
                this.O = -1;
                return;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                return this.X < ((gnW) this.R).size() - 1;
            default:
                return this.X < ((b5G) this.R).X;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.e) {
            case 0:
                return this.X >= 0;
            default:
                return this.X > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                R();
                int i = this.X + 1;
                nIH.R(i, ((gnW) this.R).size());
                Object obj = ((gnW) this.R).get(i);
                this.X = i;
                return obj;
            default:
                int i2 = this.X;
                b5G b5g = (b5G) this.R;
                if (i2 < b5g.X) {
                    this.X = i2 + 1;
                    this.O = i2;
                    return b5g.f1527R[b5g.e + i2];
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.e) {
            case 0:
                return this.X + 1;
            default:
                return this.X;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.e) {
            case 0:
                R();
                nIH.R(this.X, ((gnW) this.R).size());
                this.X--;
                return ((gnW) this.R).get(this.X);
            default:
                int i = this.X;
                if (i > 0) {
                    int i2 = i - 1;
                    this.X = i2;
                    this.O = i2;
                    b5G b5g = (b5G) this.R;
                    return b5g.f1527R[b5g.e + i2];
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.e) {
            case 0:
                return this.X;
            default:
                return this.X - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                R();
                ((gnW) this.R).remove(this.X);
                this.X--;
                this.O = ((gnW) this.R).R();
                return;
            default:
                int i = this.O;
                if (i != -1) {
                    ((b5G) this.R).v(i);
                    this.X = this.O;
                    this.O = -1;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.e) {
            case 0:
                R();
                ((gnW) this.R).set(this.X, obj);
                this.O = ((gnW) this.R).R();
                return;
            default:
                int i = this.O;
                if (i != -1) {
                    ((b5G) this.R).set(i, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    public aJE(b5G b5g, int i) {
        this.e = 1;
        this.R = b5g;
        this.X = i;
        this.O = -1;
    }
}
