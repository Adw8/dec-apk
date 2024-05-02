package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bQO  reason: default package */
/* loaded from: classes.dex */
public final class bQO implements Iterator, dsi {
    public Object R;

    /* renamed from: R  reason: collision with other field name */
    public final Iterator f1641R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pvc f1642R;
    public final /* synthetic */ int e = 0;
    public int X = -1;

    public bQO(k0v k0v) {
        this.f1642R = k0v;
        this.f1641R = ((pvc) k0v.f5179R).iterator();
    }

    public final void R() {
        switch (this.e) {
            case 0:
                break;
            default:
                if (this.f1641R.hasNext()) {
                    Object next = this.f1641R.next();
                    if (((Boolean) ((k0v) this.f1642R).f5180R.x(next)).booleanValue()) {
                        this.X = 1;
                        this.R = next;
                        return;
                    }
                }
                this.X = 0;
                return;
        }
        while (this.f1641R.hasNext()) {
            Object next2 = this.f1641R.next();
            if (((Boolean) ((g_R) this.f1642R).R.x(next2)).booleanValue() == ((g_R) this.f1642R).f3794R) {
                this.R = next2;
                this.X = 1;
                return;
            }
        }
        this.X = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                if (this.X == -1) {
                    R();
                }
                return this.X == 1;
            default:
                if (this.X == -1) {
                    R();
                }
                return this.X == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                if (this.X == -1) {
                    R();
                }
                if (this.X != 0) {
                    Object obj = this.R;
                    this.R = null;
                    this.X = -1;
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                if (this.X == -1) {
                    R();
                }
                if (this.X != 0) {
                    Object obj2 = this.R;
                    this.R = null;
                    this.X = -1;
                    return obj2;
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

    public bQO(g_R g_r) {
        this.f1642R = g_r;
        this.f1641R = g_r.f3793R.iterator();
    }
}
