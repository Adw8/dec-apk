package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: f4h  reason: default package */
/* loaded from: classes.dex */
public final class f4h implements Iterator, aOO, dsi {
    public aOO R;

    /* renamed from: R  reason: collision with other field name */
    public Object f3286R;
    public int e;

    public final RuntimeException R() {
        int i = this.e;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        StringBuilder U = opT.U("Unexpected state of the iterator: ");
        U.append(this.e);
        return new IllegalStateException(U.toString());
    }

    @Override // defpackage.aOO
    public final void Y(Object obj) {
        jjU.o(obj);
        this.e = 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.e;
            if (i != 0) {
                break;
            }
            this.e = 5;
            aOO aoo = this.R;
            this.R = null;
            aoo.Y(o8s.R);
        }
        if (i == 1) {
            throw null;
        } else if (i == 2 || i == 3) {
            return true;
        } else {
            if (i == 4) {
                return false;
            }
            throw R();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        } else if (i == 2) {
            this.e = 1;
            throw null;
        } else if (i == 3) {
            this.e = 0;
            Object obj = this.f3286R;
            this.f3286R = null;
            return obj;
        } else {
            throw R();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.aOO
    public final nbD v() {
        return aIH.R;
    }
}
