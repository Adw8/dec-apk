package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: Hx  reason: default package */
/* loaded from: classes.dex */
public final class Hx extends o7s implements ListIterator {
    public final /* synthetic */ Uk R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Hx(Uk uk, int i) {
        super(2, uk);
        this.R = uk;
        hw1.C(i, uk.R());
        this.X = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.X > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.X;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            Uk uk = this.R;
            int i = this.X - 1;
            this.X = i;
            return uk.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.X - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
