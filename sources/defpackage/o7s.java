package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o7s  reason: default package */
/* loaded from: classes.dex */
public class o7s implements Iterator, dsi {
    public final Object R;
    public int X;
    public final /* synthetic */ int e;

    public /* synthetic */ o7s(int i, Object obj) {
        this.e = i;
        this.R = obj;
    }

    public final void R() {
        while (this.X > 0 && ((Iterator) this.R).hasNext()) {
            ((Iterator) this.R).next();
            this.X--;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                return this.X < ((eSi) this.R).m();
            case 1:
                return this.X < ((kyQ) this.R).e;
            case 2:
                return this.X < ((Uk) this.R).R();
            case 3:
                return this.X < ((Object[]) this.R).length;
            default:
                R();
                return ((Iterator) this.R).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                int i = this.X;
                this.X = i + 1;
                return ((eSi) this.R).x(i);
            case 1:
                Object[] objArr = ((kyQ) this.R).R;
                int i2 = this.X;
                this.X = i2 + 1;
                return objArr[i2];
            case 2:
                if (hasNext()) {
                    int i3 = this.X;
                    this.X = i3 + 1;
                    return ((Uk) this.R).get(i3);
                }
                throw new NoSuchElementException();
            case 3:
                try {
                    int i4 = this.X;
                    this.X = i4 + 1;
                    return ((Object[]) this.R)[i4];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.X--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                R();
                return ((Iterator) this.R).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public o7s(Object[] objArr) {
        this.e = 3;
        this.R = objArr;
    }

    public o7s(lXf lxf) {
        this.e = 4;
        this.R = lxf.f5766R.iterator();
        this.X = lxf.R;
    }
}
