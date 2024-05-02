package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: nY8  reason: default package */
/* loaded from: classes.dex */
public final class nY8 implements Iterator, dsi {
    public Object R;
    public int X;
    public final /* synthetic */ int e;
    public final Object v;

    public nY8(k0v k0v) {
        this.e = 1;
        this.v = k0v;
        this.X = -2;
    }

    public final void R() {
        Object g = this.X == -2 ? ((f_c) ((k0v) this.v).f5179R).g() : ((k0v) this.v).f5180R.x(this.R);
        this.R = g;
        this.X = g == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                return this.X < ((Map) this.v).size();
            default:
                if (this.X < 0) {
                    R();
                }
                return this.X == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                if (hasNext()) {
                    Object obj = this.R;
                    this.X++;
                    Object obj2 = ((Map) this.v).get(obj);
                    if (obj2 != null) {
                        this.R = ((ftv) obj2).v;
                        return obj;
                    }
                    throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                }
                throw new NoSuchElementException();
            default:
                if (this.X < 0) {
                    R();
                }
                if (this.X != 0) {
                    Object obj3 = this.R;
                    this.X = -1;
                    return obj3;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public nY8(Object obj, e76 e76) {
        this.e = 0;
        this.R = obj;
        this.v = e76;
    }
}
