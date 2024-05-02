package defpackage;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

/* renamed from: dZs  reason: default package */
/* loaded from: classes.dex */
public final class dZs implements Iterator, dsi {
    public final Object R;
    public final /* synthetic */ int e = 1;

    public dZs(Enumeration enumeration) {
        this.R = enumeration;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                return ((dU8) ((iuh) this.R)).R;
            case 1:
                return ((Iterator) this.R).hasNext();
            default:
                return ((Enumeration) this.R).hasMoreElements();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                return (Map.Entry) ((iuh) this.R).next();
            case 1:
                return (k_M) ((Iterator) this.R).next();
            default:
                return ((Enumeration) this.R).nextElement();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                ((iuh) this.R).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public dZs(mWd mwd) {
        j18[] j18Arr = new j18[8];
        for (int i = 0; i < 8; i++) {
            j18Arr[i] = new bw9(this);
        }
        this.R = new iuh(mwd, j18Arr);
    }

    public dZs(i5Q i5q) {
        this.R = i5q.f4457v.iterator();
    }
}
