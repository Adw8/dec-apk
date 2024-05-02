package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: h6  reason: default package */
/* loaded from: classes.dex */
public abstract class h6 implements Iterator, dsi {
    public Object R;
    public int e = 2;

    public abstract void R();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        if (i != 4) {
            int I = jQ.I(i);
            if (I == 0) {
                return true;
            }
            if (I != 2) {
                this.e = 4;
                R();
                if (this.e == 1) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.e = 2;
            return this.R;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
