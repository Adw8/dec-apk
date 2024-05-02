package defpackage;

import java.util.Iterator;

/* renamed from: j18  reason: default package */
/* loaded from: classes.dex */
public abstract class j18 implements Iterator, dsi {
    public Object[] R = pgk.R.f7161R;
    public int X;
    public int e;

    public j18() {
        pgk pgk = pgk.R;
    }

    public final void R(int i, int i2, Object[] objArr) {
        this.R = objArr;
        this.e = i;
        this.X = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.X < this.e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
