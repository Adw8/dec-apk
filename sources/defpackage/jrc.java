package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: jrc  reason: default package */
/* loaded from: classes.dex */
public final class jrc implements Iterator, dsi {
    public int O;
    public boolean R;
    public final int X;
    public final int e;

    public jrc(int i, int i2, int i3) {
        this.e = i3;
        this.X = i2;
        boolean z = true;
        z = false;
        if (i3 <= 0 ? i < i2 : i > i2) {
        }
        this.R = z;
        this.O = !z ? i2 : i;
    }

    /* renamed from: R */
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.R;
    }

    public final int nextInt() {
        int i = this.O;
        if (i != this.X) {
            this.O = this.e + i;
        } else if (this.R) {
            this.R = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        v();
        throw null;
    }

    public final void v() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
