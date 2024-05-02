package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: grI  reason: default package */
/* loaded from: classes.dex */
public final class grI implements Iterator {
    public int O;
    public final /* synthetic */ Dd R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3960R = false;
    public int X;
    public final int e;

    public grI(Dd dd, int i) {
        this.R = dd;
        this.e = i;
        this.X = dd.Z();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.O < this.X;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object O = this.R.O(this.O, this.e);
            this.O++;
            this.f3960R = true;
            return O;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f3960R) {
            int i = this.O - 1;
            this.O = i;
            this.X--;
            this.f3960R = false;
            this.R.U(i);
            return;
        }
        throw new IllegalStateException();
    }
}
