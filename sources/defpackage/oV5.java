package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: oV5  reason: default package */
/* loaded from: classes.dex */
public final class oV5 implements Iterator, dsi {
    public final /* synthetic */ f25 R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6833R;
    public int e = -1;

    public oV5(f25 f25) {
        this.R = f25;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e + 1 < this.R.v.m();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f6833R = true;
            eSi esi = this.R.v;
            int i = this.e + 1;
            this.e = i;
            return (e9E) esi.x(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f6833R) {
            eSi esi = this.R.v;
            ((e9E) esi.x(this.e)).f2984R = null;
            int i = this.e;
            Object[] objArr = esi.f3104R;
            Object obj = objArr[i];
            Object obj2 = eSi.R;
            if (obj != obj2) {
                objArr[i] = obj2;
                esi.f3102R = true;
            }
            this.e = i - 1;
            this.f6833R = false;
            return;
        }
        throw new IllegalStateException("You must call next() before you can remove an element".toString());
    }
}
