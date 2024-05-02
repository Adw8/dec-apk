package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: k9z  reason: default package */
/* loaded from: classes.dex */
public final class k9z implements Iterator, dsi {
    public final int O;
    public final mq9 R;
    public int X;
    public final int e;

    public k9z(int i, int i2, mq9 mq9) {
        this.R = mq9;
        this.e = i2;
        this.X = i;
        this.O = mq9.L;
        if (mq9.f6198R) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.X < this.e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        mq9 mq9 = this.R;
        if (mq9.L == this.O) {
            int i = this.X;
            this.X = l6.e(mq9.f6199R, i) + i;
            return new jJo(i, this.O, this.R);
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
